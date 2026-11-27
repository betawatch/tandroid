// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m37 extends Drawable {
    public Paint a;
    public Paint b;
    public long c;
    public float d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public wb2 m;

    public final void a() {
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        int i = bounds.left;
        float f = (i - centerX) * (i - centerX);
        int i2 = bounds.top;
        this.g = (float) Math.ceil(Math.sqrt(qd4.A(i2, centerY, i2 - centerY, f)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0049, code lost:
    
        if (r7 < 0.0f) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0055, code lost:
    
        if (r7 < 0.0f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        wb2 wb2Var;
        Paint paint = this.a;
        float f2 = this.d;
        if (f2 == 1.0f) {
            Rect bounds = getBounds();
            Paint paint2 = this.b;
            if (paint2 != null) {
                paint = paint2;
            }
            canvas.drawRect(bounds, paint);
        } else if (f2 != 0.0f) {
            float interpolation = this.e ? k43.h.getInterpolation(f2) : 1.0f - k43.h.getInterpolation(1.0f - f2);
            Rect bounds2 = getBounds();
            float centerX = bounds2.centerX();
            float centerY = bounds2.centerY();
            float f3 = this.j;
            if (f3 >= 0.0f) {
                f = this.k;
            }
            f3 = this.h;
            if (f3 >= 0.0f) {
                f = this.i;
            }
            f = centerY;
            f3 = centerX;
            float f4 = 1.0f - interpolation;
            float A = qd4.A(f3, centerX, f4, centerX);
            float A2 = qd4.A(f, centerY, f4, centerY);
            float f5 = this.g * interpolation;
            Paint paint3 = this.b;
            if (paint3 != null) {
                paint = paint3;
            }
            canvas.drawCircle(A, A2, f5, paint);
        }
        if (!this.f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        if (j > 20) {
            j = 17;
        }
        this.c = elapsedRealtime;
        boolean z = this.e;
        float f6 = this.d;
        if (z) {
            float f7 = (j / 240.0f) + f6;
            this.d = f7;
            if (f7 >= 1.0f) {
                this.d = 1.0f;
                this.h = -1.0f;
                this.i = -1.0f;
                this.j = -1.0f;
                this.k = -1.0f;
                this.f = false;
            }
            wb2Var = this.m;
            if (wb2Var == null) {
                wb2Var.invalidate();
                if (wb2Var.getParent() != null) {
                    ((ViewGroup) wb2Var.getParent()).invalidate();
                    return;
                }
                return;
            }
            return;
        }
        float f8 = f6 - (j / 240.0f);
        this.d = f8;
        if (f8 <= 0.0f) {
            this.d = 0.0f;
            this.h = -1.0f;
            this.i = -1.0f;
            this.j = -1.0f;
            this.k = -1.0f;
            this.f = false;
        }
        wb2Var = this.m;
        if (wb2Var == null) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
