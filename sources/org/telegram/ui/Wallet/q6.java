package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class q6 extends Drawable {
    public static float[] k;
    public static Bitmap l;
    public static Bitmap m;
    public final int b;
    public final int c;
    public final Drawable d;
    public float f;
    public float g;
    public static final float[] j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] n = new int[2];
    public static final int[] o = new int[2];
    public final Paint a = new Paint(3);
    public float e = -1.0f;
    public int h = qs.e4;
    public float i = 1.0f;

    public q6(int i7, int i10) {
        this.b = i7;
        this.c = i10;
        Drawable h = jg.g.h(org.telegram.messenger.t0.b, R.drawable.wallet_card_diamond);
        this.d = h;
        if (l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        h.setBounds(0, 0, 84, 84);
        h.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        l = createBitmap.extractAlpha(paint, n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        m = createBitmap.extractAlpha(paint, o);
        createBitmap.recycle();
    }

    public static float[] a(float f10, float f11, float f12) {
        float max = Math.max(f10, Math.max(f11, f12));
        float min = max - Math.min(f10, Math.min(f11, f12));
        float f13 = 0.55f * max;
        if (min > f13) {
            float f14 = f13 / min;
            f10 = com.google.android.recaptcha.internal.a.z(f10, max, f14, max);
            f11 = com.google.android.recaptcha.internal.a.z(f11, max, f14, max);
            f12 = com.google.android.recaptcha.internal.a.z(f12, max, f14, max);
        }
        return new float[]{f10, f11, f12};
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.h <= 0 || this.e < 0.0f) {
            return;
        }
        Rect bounds = getBounds();
        if (this.i > 0.0f) {
            float width = bounds.width() / 84.0f;
            canvas.save();
            canvas.translate(bounds.left, bounds.top);
            canvas.scale(width, bounds.height() / 84.0f);
            Paint paint = this.a;
            paint.setColor(-16777216);
            paint.setAlpha((int) (this.h * 0.35f * this.i));
            Bitmap bitmap = l;
            int[] iArr = n;
            canvas.drawBitmap(bitmap, iArr[0], (org.telegram.messenger.g0.L(1.0f) / width) + iArr[1], paint);
            paint.setAlpha((int) (this.h * 0.55f * this.i));
            Bitmap bitmap2 = m;
            int[] iArr2 = o;
            canvas.drawBitmap(bitmap2, iArr2[0], iArr2[1], paint);
            canvas.restore();
        }
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.h);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.h = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
