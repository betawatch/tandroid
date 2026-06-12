package org.telegram.ui.Components.chat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata;

/* loaded from: classes5.dex */
public class WallpaperBitmapProvider {
    private static final Rect tmpRect = new Rect();
    private final BlurredBackgroundSourceColor sourceColor = new BlurredBackgroundSourceColor();
    private final BlurredBackgroundSourceBitmap sourceBitmap = new BlurredBackgroundSourceBitmap();
    private final BitmapMemoizedMetadata blurredFromBitmap = new BitmapMemoizedMetadata(new BitmapMemoizedMetadata.Provider() { // from class: org.telegram.ui.Components.chat.WallpaperBitmapProvider$$ExternalSyntheticLambda0
        @Override // org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata.Provider
        public final Object get(Bitmap bitmap) {
            Bitmap blurBitmap;
            blurBitmap = WallpaperBitmapProvider.blurBitmap(bitmap);
            return blurBitmap;
        }

        @Override // org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata.Provider
        public /* synthetic */ boolean isValid(Object obj) {
            return BitmapMemoizedMetadata.Provider.-CC.$default$isValid(this, obj);
        }
    });
    private final BitmapMemoizedMetadata navbarColorFromBitmap = new BitmapMemoizedMetadata(new BitmapMemoizedMetadata.Provider() { // from class: org.telegram.ui.Components.chat.WallpaperBitmapProvider$$ExternalSyntheticLambda1
        @Override // org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata.Provider
        public final Object get(Bitmap bitmap) {
            int averageBottomColor;
            averageBottomColor = WallpaperBitmapProvider.averageBottomColor(bitmap);
            return Integer.valueOf(averageBottomColor);
        }

        @Override // org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata.Provider
        public /* synthetic */ boolean isValid(Object obj) {
            return BitmapMemoizedMetadata.Provider.-CC.$default$isValid(this, obj);
        }
    });
    private final BitmapMemoizedMetadata statusBarColorFromBitmap = new BitmapMemoizedMetadata(new BitmapMemoizedMetadata.Provider() { // from class: org.telegram.ui.Components.chat.WallpaperBitmapProvider$$ExternalSyntheticLambda2
        @Override // org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata.Provider
        public final Object get(Bitmap bitmap) {
            int averageTopColor;
            averageTopColor = WallpaperBitmapProvider.averageTopColor(bitmap);
            return Integer.valueOf(averageTopColor);
        }

        @Override // org.telegram.ui.Components.blur3.utils.BitmapMemoizedMetadata.Provider
        public /* synthetic */ boolean isValid(Object obj) {
            return BitmapMemoizedMetadata.Provider.-CC.$default$isValid(this, obj);
        }
    });

    public BlurredBackgroundSource updateSourceFromBackgroundViewDrawable(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            this.sourceColor.setColor(((ColorDrawable) drawable).getColor());
            return this.sourceColor;
        }
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            if (motionBackgroundDrawable.getIntensity() < 0) {
                this.sourceColor.setColor(-16777216);
                return this.sourceColor;
            }
            this.sourceBitmap.setBitmap(motionBackgroundDrawable.getBitmap());
            return this.sourceBitmap;
        }
        if (drawable instanceof BitmapDrawable) {
            this.sourceBitmap.setBitmap((Bitmap) this.blurredFromBitmap.get(((BitmapDrawable) drawable).getBitmap()));
            return this.sourceBitmap;
        }
        if (drawable instanceof ChatBackgroundDrawable) {
            return updateSourceFromBackgroundViewDrawable(((ChatBackgroundDrawable) drawable).getDrawable(false));
        }
        if (drawable != null) {
            Canvas beginRecording = this.sourceBitmap.beginRecording(120, NotificationCenter.screenshotTook);
            Rect rect = tmpRect;
            rect.set(drawable.getBounds());
            drawable.setBounds(0, 0, 120, NotificationCenter.screenshotTook);
            drawable.draw(beginRecording);
            drawable.setBounds(rect);
            this.sourceBitmap.endRecording();
            BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = this.sourceBitmap;
            blurredBackgroundSourceBitmap.setBitmap((Bitmap) this.blurredFromBitmap.get(blurredBackgroundSourceBitmap.getBitmap()));
        }
        return this.sourceBitmap;
    }

    public int getNavigationBarColor(BlurredBackgroundSource blurredBackgroundSource) {
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            return ((BlurredBackgroundSourceColor) blurredBackgroundSource).getColor();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
            return ((Integer) this.navbarColorFromBitmap.get(((BlurredBackgroundSourceBitmap) blurredBackgroundSource).getBitmap())).intValue();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            return getNavigationBarColor(((BlurredBackgroundSourceWrapped) blurredBackgroundSource).getSource());
        }
        return 0;
    }

    public int getStatusBarColor(BlurredBackgroundSource blurredBackgroundSource) {
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            return ((BlurredBackgroundSourceColor) blurredBackgroundSource).getColor();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
            return ((Integer) this.statusBarColorFromBitmap.get(((BlurredBackgroundSourceBitmap) blurredBackgroundSource).getBitmap())).intValue();
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            return getStatusBarColor(((BlurredBackgroundSourceWrapped) blurredBackgroundSource).getSource());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap blurBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
        stackBlurBitmapWithScaleFactor.setHasAlpha(false);
        return stackBlurBitmapWithScaleFactor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int averageTopColor(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        return Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int averageBottomColor(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int height = bitmap.getHeight();
        return Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
    }
}
