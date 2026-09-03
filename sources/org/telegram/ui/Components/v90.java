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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v90 extends TextView {
    public final Matrix a;
    public LinearGradient b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public long h;
    public final xp n;
    public boolean r;
    public int s;

    public v90(Context context) {
        super(context);
        this.a = new Matrix();
        this.n = new xp(this, 25);
    }

    public final void a() {
        float min = Math.min(AndroidUtilities.dp(10.0f) / this.c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i10 = 1048575 & currentTextColor;
        this.b = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{i10, currentTextColor, currentTextColor, i10}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
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
        boolean z4;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f10 = this.f;
        float f11 = measuredWidth;
        float a2 = f10 < f11 ? k7.o.a(f10 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f) : 0.0f;
        Matrix matrix = this.a;
        matrix.reset();
        float dp2 = AndroidUtilities.dp(10.0f);
        float f12 = this.c;
        matrix.postScale(e2.c.w(1.0f, a2, dp2 / f12, 1.0f), 1.0f, f12, 0.0f);
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
        boolean z10 = ((double) this.f) < 1.0E-4d;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.h;
        long min = (j10 == 0 || z10) ? 16L : Math.min(uptimeMillis - j10, 120L);
        this.h = uptimeMillis;
        boolean z11 = this.d;
        xp xpVar = this.n;
        if ((z11 && this.e) || !z10) {
            float c3 = w.c.c(min, 1000.0f, AndroidUtilities.dp(60.0f), this.f);
            this.f = c3;
            if (c3 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(xpVar);
                this.r = false;
                this.e = false;
                this.f = 0.0f;
            }
            invalidate();
        }
        if (!this.d || this.e || (z4 = this.r) || z4) {
            return;
        }
        this.r = true;
        AndroidUtilities.runOnUIThread(xpVar, 1500L);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i11);
        this.c = View.MeasureSpec.getSize(i10);
        this.d = getMeasuredWidth() > this.c - this.s;
        a();
    }

    public void setCustomPaddingRight(int i10) {
        this.s = i10;
        boolean z4 = getMeasuredWidth() > this.c - this.s;
        this.d = z4;
        if (z4) {
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
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
