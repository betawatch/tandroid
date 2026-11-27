// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oea extends Drawable {
    public long a = 0;
    public final float[] b = {0.0f, -0.5f};
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public oea(Context context, int i) {
        this.f = i;
        if (i == 4) {
            this.c = c00.e(context, R.drawable.filled_extend_location);
            this.d = c00.e(context, R.drawable.smallanimationpinleft);
            this.e = c00.e(context, R.drawable.smallanimationpinright);
        } else if (i == 5) {
            this.c = c00.e(context, R.drawable.filled_stop_location);
            this.d = c00.e(context, R.drawable.smallanimationpinleft);
            this.e = c00.e(context, R.drawable.smallanimationpinright);
        } else if (i == 1) {
            this.c = c00.e(context, R.drawable.smallanimationpin);
            this.d = c00.e(context, R.drawable.smallanimationpinleft);
            this.e = c00.e(context, R.drawable.smallanimationpinright);
        } else {
            this.c = c00.e(context, R.drawable.animationpin);
            this.d = c00.e(context, R.drawable.animationpinleft);
            this.e = c00.e(context, R.drawable.animationpinright);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016f  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float[] fArr;
        int L;
        int L2;
        int L3;
        int L4;
        int A;
        int i;
        int i2;
        int L5;
        Drawable drawable = this.c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        byte b = 3;
        byte b2 = 5;
        byte b3 = 1;
        byte b4 = 2;
        byte b5 = this.f;
        byte b6 = 4;
        int L6 = (b5 == 4 || b5 == 5) ? hl.L(24.0f) : b5 == 3 ? hl.L(44.0f) : b5 == 2 ? hl.L(32.0f) : b5 == 1 ? hl.L(30.0f) : hl.L(120.0f);
        int intrinsicHeight2 = ((getIntrinsicHeight() - L6) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - L6) / 2) + getBounds().left;
        int i3 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i3, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i4 = 0;
        while (true) {
            fArr = this.b;
            if (i4 >= b4) {
                break;
            }
            float f = fArr[i4];
            if (f >= 0.0f) {
                float f2 = (f * 0.5f) + 0.5f;
                if (b5 == b6 || b5 == b2) {
                    L = hl.L(2.5f * f2);
                    L2 = hl.L(f2 * 6.5f);
                    int L7 = hl.L(fArr[i4] * 6.0f);
                    L3 = (hl.L(3.0f) + intrinsicWidth2) - L7;
                    L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - hl.L(2.0f);
                    A = c00.A(3.0f, i3, L7);
                } else {
                    if (b5 == b) {
                        L5 = hl.L(5.0f * f2);
                        L2 = hl.L(f2 * 18.0f);
                        int L8 = hl.L(fArr[i4] * 15.0f);
                        L3 = (hl.L(2.0f) + intrinsicWidth2) - L8;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - hl.L(7.0f);
                        i2 = c00.A(2.0f, i3, L8);
                    } else if (b5 == b4) {
                        L5 = hl.L(5.0f * f2);
                        L2 = hl.L(f2 * 18.0f);
                        int L9 = hl.L(fArr[i4] * 15.0f);
                        L3 = (hl.L(2.0f) + intrinsicWidth2) - L9;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        i2 = c00.A(2.0f, i3, L9);
                    } else if (b5 == b3) {
                        L = hl.L(2.5f * f2);
                        L2 = hl.L(f2 * 6.5f);
                        int L10 = hl.L(fArr[i4] * 6.0f);
                        L3 = (hl.L(7.0f) + intrinsicWidth2) - L10;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        A = c00.A(7.0f, i3, L10);
                    } else {
                        L5 = hl.L(5.0f * f2);
                        L2 = hl.L(f2 * 18.0f);
                        int L11 = hl.L(fArr[i4] * 15.0f);
                        L3 = (hl.L(42.0f) + intrinsicWidth2) - L11;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - hl.L(7.0f);
                        i2 = c00.A(42.0f, i3, L11);
                    }
                    i = L5;
                    float f3 = fArr[i4];
                    int x = (int) ((f3 >= 0.5f ? f3 / 0.5f : qd4.x(f3, 0.5f, 0.5f, 1.0f)) * 255.0f);
                    Drawable drawable2 = this.d;
                    drawable2.setAlpha(x);
                    int i5 = L4 - L2;
                    int i6 = L4 + L2;
                    drawable2.setBounds(L3 - i, i5, L3 + i, i6);
                    drawable2.draw(canvas);
                    Drawable drawable3 = this.e;
                    drawable3.setAlpha(x);
                    drawable3.setBounds(i2 - i, i5, i2 + i, i6);
                    drawable3.draw(canvas);
                }
                int i7 = A;
                i = L;
                i2 = i7;
                float f32 = fArr[i4];
                int x2 = (int) ((f32 >= 0.5f ? f32 / 0.5f : qd4.x(f32, 0.5f, 0.5f, 1.0f)) * 255.0f);
                Drawable drawable22 = this.d;
                drawable22.setAlpha(x2);
                int i52 = L4 - L2;
                int i62 = L4 + L2;
                drawable22.setBounds(L3 - i, i52, L3 + i, i62);
                drawable22.draw(canvas);
                Drawable drawable32 = this.e;
                drawable32.setAlpha(x2);
                drawable32.setBounds(i2 - i, i52, i2 + i, i62);
                drawable32.draw(canvas);
            }
            i4++;
            b = 3;
            b2 = 5;
            b3 = 1;
            b4 = 2;
            b6 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        if (j > 16) {
            j = 16;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            if (fArr[i8] >= 1.0f) {
                fArr[i8] = 0.0f;
            }
            float f4 = (j / 1300.0f) + fArr[i8];
            fArr[i8] = f4;
            if (f4 > 1.0f) {
                fArr[i8] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        byte b = this.f;
        return (b == 4 || b == 5) ? hl.L(42.0f) : b == 3 ? hl.L(100.0f) : b == 2 ? hl.L(74.0f) : b == 1 ? hl.L(40.0f) : hl.L(180.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        byte b = this.f;
        return (b == 4 || b == 5) ? hl.L(42.0f) : b == 3 ? hl.L(100.0f) : b == 2 ? hl.L(74.0f) : b == 1 ? hl.L(40.0f) : hl.L(120.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
