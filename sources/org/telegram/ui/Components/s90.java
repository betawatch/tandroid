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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s90 extends TextView {
    public final Matrix a;
    public LinearGradient b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public long h;
    public final wp n;
    public boolean r;
    public int s;

    public s90(Context context) {
        super(context);
        this.a = new Matrix();
        this.n = new wp(this, 25);
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
        boolean z10;
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(40.0f);
        float f7 = this.f;
        float f10 = measuredWidth;
        float a2 = f7 < f10 ? w7.p.a(f7 / AndroidUtilities.dp(10.0f), 0.0f, 1.0f) : 0.0f;
        Matrix matrix = this.a;
        matrix.reset();
        float dp2 = AndroidUtilities.dp(10.0f);
        float f11 = this.c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, a2, dp2 / f11, 1.0f), 1.0f, f11, 0.0f);
        matrix.postScale(1.0f - (this.s / this.c), 1.0f, 0.0f, 0.0f);
        matrix.postTranslate(this.f, 0.0f);
        this.b.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(-this.f, 0.0f);
        super.onDraw(canvas);
        canvas.restore();
        if (measuredWidth > 0) {
            float f12 = this.f;
            if (f12 > 0.0f && f12 + getWidth() > f10 && this.d && this.e) {
                float f13 = -this.f;
                float f14 = dp;
                matrix.postTranslate(f13 - ((f13 + f10) + f14), 0.0f);
                this.b.setLocalMatrix(matrix);
                canvas.save();
                canvas.translate((-this.f) + f10 + f14, 0.0f);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        boolean z11 = ((double) this.f) < 1.0E-4d;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.h;
        long min = (j3 == 0 || z11) ? 16L : Math.min(uptimeMillis - j3, 120L);
        this.h = uptimeMillis;
        boolean z12 = this.d;
        wp wpVar = this.n;
        if ((z12 && this.e) || !z11) {
            float e7 = a4.a.e(min, 1000.0f, AndroidUtilities.dp(60.0f), this.f);
            this.f = e7;
            if (e7 > measuredWidth + dp) {
                AndroidUtilities.cancelRunOnUIThread(wpVar);
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
        AndroidUtilities.runOnUIThread(wpVar, 1500L);
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
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        a();
    }
}
