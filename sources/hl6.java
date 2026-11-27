// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class hl6 extends TextView {
    public final Matrix a;
    public LinearGradient b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public long h;
    public final z96 n;
    public boolean r;
    public int s;

    public hl6(Context context) {
        super(context);
        this.a = new Matrix();
        this.n = new z96(this, (byte) 13);
    }

    public final void a() {
        float min = Math.min(hl.L(10.0f) / this.c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i = 1048575 & currentTextColor;
        this.b = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{i, currentTextColor, currentTextColor, i}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
        if (this.d) {
            getPaint().setShader(this.b);
        } else {
            getPaint().setShader(null);
        }
        this.b.setLocalMatrix(this.a);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int measuredWidth = getMeasuredWidth();
        int L = hl.L(40.0f);
        float f = this.f;
        float f2 = measuredWidth;
        float a = f < f2 ? ete.a(f / hl.L(10.0f), 0.0f, 1.0f) : 0.0f;
        Matrix matrix = this.a;
        matrix.reset();
        float L2 = hl.L(10.0f);
        float f3 = this.c;
        matrix.postScale(qd4.A(1.0f, a, L2 / f3, 1.0f), 1.0f, f3, 0.0f);
        matrix.postScale(1.0f - (this.s / this.c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f, 0.0f);
        this.b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f4 = this.f;
            if (f4 > 0.0f && f4 + getWidth() > f2 && this.d && this.e) {
                float f5 = -this.f;
                float f6 = L;
                matrix.postTranslate(f5 - ((f5 + f2) + f6), 0.0f);
                this.b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f) + f2 + f6, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        boolean z2 = ((double) this.f) < 1.0E-4d;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.h;
        long min = (j == 0 || z2) ? 16L : Math.min(uptimeMillis - j, 120L);
        this.h = uptimeMillis;
        boolean z3 = this.d;
        z96 z96Var = this.n;
        if ((z3 && this.e) || !z2) {
            float B = c00.B(min, 1000.0f, hl.L(60.0f), this.f);
            this.f = B;
            if (B > measuredWidth + L) {
                hl.r(z96Var);
                this.r = false;
                this.e = false;
                this.f = 0.0f;
            }
            invalidate();
        }
        if (!this.d || this.e || (z = this.r) || z) {
            return;
        }
        this.r = true;
        hl.d3(z96Var, 1500L);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(0, i2);
        this.c = View.MeasureSpec.getSize(i);
        this.d = getMeasuredWidth() > this.c - this.s;
        a();
    }

    public void setCustomPaddingRight(int i) {
        this.s = i;
        boolean z = getMeasuredWidth() > this.c - this.s;
        this.d = z;
        if (z) {
            getPaint().setShader(this.b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        hl.r(this.n);
        this.r = false;
        this.e = false;
        this.f = 0.0f;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        a();
    }
}
