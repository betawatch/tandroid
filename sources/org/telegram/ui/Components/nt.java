package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class nt extends View {
    public final l01 a;
    public final Drawable b;
    public final ImageReceiver c;
    public final Rect d;
    public final RectF e;
    public qg.b f;

    public nt(Context context, CharSequence charSequence) {
        super(context);
        this.d = new Rect();
        this.e = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(22.66f));
        this.a = new l01(charSequence, 14.0f, AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.arrow_newchat).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(48.0f), false, null, true);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(24.0f), false, closestPhotoSizeWithSize, false);
        this.c.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "24_24", ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), "24_24", 0L, null, obj, 0);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.c;
        boolean hasBitmapImage = imageReceiver.hasBitmapImage();
        int dp = AndroidUtilities.dp(19.0f) + ((int) Math.ceil(this.a.c)) + AndroidUtilities.dp(hasBitmapImage ? 30.33f : 11.33f);
        int dp2 = AndroidUtilities.dp(24.0f);
        int width = (getWidth() - dp) / 2;
        int height = getHeight() / 2;
        int i10 = height - (dp2 / 2);
        int i11 = dp + width;
        Rect rect = this.d;
        rect.set(width, i10, i11, dp2 + i10);
        rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        qg.b bVar = this.f;
        if (bVar != null) {
            bVar.setBounds(rect);
            this.f.draw(canvas);
        }
        if (hasBitmapImage) {
            float dp3 = AndroidUtilities.dp(0.66f) + width;
            float f10 = height;
            float dp4 = f10 - (AndroidUtilities.dp(22.66f) / 2.0f);
            float dp5 = AndroidUtilities.dp(23.32f) + width;
            float dp6 = (AndroidUtilities.dp(22.66f) / 2.0f) + f10;
            RectF rectF = this.e;
            rectF.set(dp3, dp4, dp5, dp6);
            imageReceiver.setImageCoords(rectF);
            imageReceiver.draw(canvas);
        }
        this.a.c(width + r2, height, 1.0f, -1, canvas);
        int dp7 = i11 - AndroidUtilities.dp(17.0f);
        int dp8 = height - AndroidUtilities.dp(6.0f);
        int dp9 = i11 - AndroidUtilities.dp(5.0f);
        int dp10 = AndroidUtilities.dp(6.0f) + height;
        Drawable drawable = this.b;
        drawable.setBounds(dp7, dp8, dp9, dp10);
        drawable.draw(canvas);
    }

    public void setBlurredBackgroundDrawable(qg.b bVar) {
        bVar.o(AndroidUtilities.dp(4.0f));
        bVar.p(AndroidUtilities.dp(11.0f));
        this.f = bVar;
    }

    public void setImage(Bitmap bitmap) {
        this.c.setImageBitmap(bitmap);
        invalidate();
    }

    public void setImage(String str) {
        if (str == null) {
            setImage((Bitmap) null);
        } else {
            Utilities.globalQueue.postRunnable(new gm(8, this, str));
        }
    }
}
