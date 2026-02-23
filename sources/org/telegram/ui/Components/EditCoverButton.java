package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

/* loaded from: classes5.dex */
public class EditCoverButton extends View {
    private final Drawable arrowDrawable;
    private BlurredBackgroundDrawable blurredBackgroundDrawable;
    private final android.graphics.Rect bounds;
    private final RectF imageBounds;
    private final ImageReceiver imageReceiver;
    private final Text text;

    public EditCoverButton(Context context, CharSequence charSequence, boolean z) {
        super(context);
        this.bounds = new android.graphics.Rect();
        this.imageBounds = new RectF();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(22.66f));
        this.text = new Text(charSequence, 14.0f, AndroidUtilities.bold());
        if (z) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.arrow_newchat).mutate();
            this.arrowDrawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.arrowDrawable = null;
    }

    public void setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f)).setRadius(AndroidUtilities.dp(11.0f));
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    /* renamed from: setImage, reason: merged with bridge method [inline-methods] */
    public void lambda$setImage$0(Bitmap bitmap) {
        this.imageReceiver.setImageBitmap(bitmap);
        invalidate();
    }

    public void setImage(TLRPC.Photo photo, Object obj) {
        if (photo == null) {
            lambda$setImage$0((Bitmap) null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(48.0f), false, null, true);
        this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "24_24", ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(24.0f), false, closestPhotoSizeWithSize, false), photo), "24_24", 0L, null, obj, 0);
    }

    public void setImage(final String str) {
        if (str == null) {
            lambda$setImage$0((Bitmap) null);
        } else {
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Components.EditCoverButton$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EditCoverButton.this.lambda$setImage$1(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setImage$1(String str) {
        final Bitmap decodeFile = BitmapFactory.decodeFile(str);
        Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
        Paint paint = new Paint(3);
        canvas.translate(r0.getWidth() / 2.0f, r0.getHeight() / 2.0f);
        float max = Math.max(r0.getWidth() / decodeFile.getWidth(), r0.getHeight() / decodeFile.getHeight());
        canvas.scale(max, max);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.EditCoverButton$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                EditCoverButton.this.lambda$setImage$0(decodeFile);
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean hasBitmapImage = this.imageReceiver.hasBitmapImage();
        int ceil = ((int) Math.ceil(this.text.getCurrentWidth())) + AndroidUtilities.dp(hasBitmapImage ? 30.33f : 11.33f) + AndroidUtilities.dp(19.0f);
        int dp = AndroidUtilities.dp(24.0f);
        int width = (getWidth() - ceil) / 2;
        int height = getHeight() / 2;
        int i = height - (dp / 2);
        int i2 = ceil + width;
        this.bounds.set(width, i, i2, dp + i);
        this.bounds.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(this.bounds);
            this.blurredBackgroundDrawable.draw(canvas);
        }
        if (hasBitmapImage) {
            float f = height;
            this.imageBounds.set(AndroidUtilities.dp(0.66f) + width, f - (AndroidUtilities.dp(22.66f) / 2.0f), AndroidUtilities.dp(23.32f) + width, f + (AndroidUtilities.dp(22.66f) / 2.0f));
            this.imageReceiver.setImageCoords(this.imageBounds);
            this.imageReceiver.draw(canvas);
        }
        this.text.draw(canvas, width + r1, height, -1, 1.0f);
        this.arrowDrawable.setBounds(i2 - AndroidUtilities.dp(17.0f), height - AndroidUtilities.dp(6.0f), i2 - AndroidUtilities.dp(5.0f), height + AndroidUtilities.dp(6.0f));
        this.arrowDrawable.draw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.bounds.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || motionEvent.getAction() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
