// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mf8 extends Drawable {
    public final Paint a;
    public final int b;
    public boolean c;
    public float d;
    public long e;
    public View f;
    public int g = jn7.d4;
    public float h = 300.0f;

    public mf8(int i) {
        this.b = hl.L(i);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
    }

    public final void a(boolean z, boolean z2) {
        if (this.c != z) {
            this.c = z;
            if (!z2) {
                this.d = z ? 1.0f : 0.0f;
            }
            this.e = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        p18 p18Var;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = currentAnimationTimeMillis - this.e;
        this.e = currentAnimationTimeMillis;
        if (j > 18) {
            j = 16;
        }
        boolean z = this.c;
        if (z) {
            float f = this.d;
            if (f < 1.0f) {
                float f2 = (j / this.h) + f;
                this.d = f2;
                if (f2 >= 1.0f) {
                    this.d = 1.0f;
                } else {
                    View view = this.f;
                    if (view != null) {
                        view.invalidate();
                    }
                    invalidateSelf();
                }
                Rect bounds = getBounds();
                i = this.g;
                if (i != 255) {
                    canvas.save();
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i, 31);
                }
                canvas2.translate(qd4.A(1.0f, this.d, hl.L(1.0f), bounds.centerX()), bounds.centerY());
                float f3 = this.d * 500.0f;
                float interpolation = f3 >= 100.0f ? k43.j.getInterpolation(f3 / 100.0f) * (-5.0f) : f3 < 484.0f ? (k43.j.getInterpolation((f3 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                int i2 = this.b;
                canvas2.scale((i2 * 1.45f) / hl.L(28.0f), (i2 * 1.5f) / hl.L(28.0f));
                canvas2.rotate(interpolation);
                p18Var = aob.x3;
                if (p18Var != null) {
                    Paint paint = this.a;
                    p18Var.b(canvas2, paint, f3);
                    canvas2.scale(1.0f, -1.0f);
                    aob.x3.b(canvas2, paint, f3);
                }
                canvas2.restore();
            }
        }
        if (!z) {
            float f4 = this.d;
            if (f4 > 0.0f) {
                float f5 = f4 - (j / this.h);
                this.d = f5;
                if (f5 <= 0.0f) {
                    this.d = 0.0f;
                } else {
                    View view2 = this.f;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    invalidateSelf();
                }
            }
        }
        Rect bounds2 = getBounds();
        i = this.g;
        if (i != 255) {
        }
        canvas2.translate(qd4.A(1.0f, this.d, hl.L(1.0f), bounds2.centerX()), bounds2.centerY());
        float f32 = this.d * 500.0f;
        if (f32 >= 100.0f) {
        }
        int i22 = this.b;
        canvas2.scale((i22 * 1.45f) / hl.L(28.0f), (i22 * 1.5f) / hl.L(28.0f));
        canvas2.rotate(interpolation);
        p18Var = aob.x3;
        if (p18Var != null) {
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
