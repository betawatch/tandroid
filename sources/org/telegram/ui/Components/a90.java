package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a90 extends TextView {
    public final Matrix a;
    public LinearGradient b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public long h;
    public final np n;
    public boolean r;
    public int s;

    public a90(Context context) {
        super(context);
        this.a = new Matrix();
        this.n = new np(this, 25);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i9 = 1048575 & currentTextColor;
        this.b = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{i9, currentTextColor, currentTextColor, i9}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
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
        boolean z10;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f10 = this.f;
        float f11 = measuredWidth;
        float a2 = f10 < f11 ? g7.n.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f) : 0.0f;
        Matrix matrix = this.a;
        matrix.reset();
        float dp2 = AndroidUtilities.dp(10.0f);
        float f12 = this.c;
        matrix.postScale(e2.c.z(1.0f, a2, dp2 / f12, 1.0f), 1.0f, f12, 0.0f);
        matrix.postScale(1.0f - (this.s / this.c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f, 0.0f);
        this.b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f13 = this.f;
            if (f13 > 0.0f && f13 + getWidth() > f11 && this.d && this.e) {
                float f14 = -this.f;
                float f15 = dp;
                matrix.postTranslate(f14 - ((f14 + f11) + f15), 0.0f);
                this.b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f) + f11 + f15, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        boolean z11 = ((double) this.f) < 1.0E-4d;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.h;
        long min = (j10 == 0 || z11) ? 16L : Math.min(uptimeMillis - j10, 120L);
        this.h = uptimeMillis;
        boolean z12 = this.d;
        np npVar = this.n;
        if ((z12 && this.e) || !z11) {
            float b10 = org.telegram.ui.Cells.j2.b(min, 1000.0f, AndroidUtilities.dp(60.0f), this.f);
            this.f = b10;
            if (b10 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(npVar);
                this.r = false;
                this.e = false;
                this.f = 0.0f;
            }
            invalidate();
        }
        if (!this.d || this.e || (z10 = this.r) || z10) {
            return;
        }
        this.r = true;
        AndroidUtilities.runOnUIThread(npVar, 1500L);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.c = View.MeasureSpec.getSize(i9);
        this.d = getMeasuredWidth() > this.c - this.s;
        a();
    }

    public void setCustomPaddingRight(int i9) {
        this.s = i9;
        boolean z10 = getMeasuredWidth() > this.c - this.s;
        this.d = z10;
        if (z10) {
            getPaint().setShader(this.b);
        } else {
            getPaint().setShader(null);
        }
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        AndroidUtilities.cancelRunOnUIThread(this.n);
        this.r = false;
        this.e = false;
        this.f = 0.0f;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i9) {
        super.setTextColor(i9);
        a();
    }
}
