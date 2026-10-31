package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t6 extends Drawable {
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
    public int h = zs.e4;
    public float i = 1.0f;

    public t6(int i10, int i11) {
        this.b = i10;
        this.c = i11;
        Drawable f7 = i0.a.f(org.telegram.messenger.w0.b, R.drawable.wallet_card_diamond);
        this.d = f7;
        if (l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        f7.setBounds(0, 0, 84, 84);
        f7.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        l = createBitmap.extractAlpha(paint, n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        m = createBitmap.extractAlpha(paint, o);
        createBitmap.recycle();
    }

    public static float[] a(float f7, float f10, float f11) {
        float max = Math.max(f7, Math.max(f10, f11));
        float min = max - Math.min(f7, Math.min(f10, f11));
        float f12 = 0.55f * max;
        if (min > f12) {
            float f13 = f12 / min;
            f7 = c3.i0.z(f7, max, f13, max);
            f10 = c3.i0.z(f10, max, f13, max);
            f11 = c3.i0.z(f11, max, f13, max);
        }
        return new float[]{f7, f10, f11};
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
            canvas.drawBitmap(bitmap, iArr[0], (org.telegram.messenger.i0.L(1.0f) / width) + iArr[1], paint);
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
    public final void setAlpha(int i10) {
        this.h = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
