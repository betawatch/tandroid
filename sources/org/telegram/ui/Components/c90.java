package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c90 extends TextView {
    public final Matrix a;
    public LinearGradient b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;
    public long h;
    public final mo n;
    public boolean r;
    public int s;

    public c90(Context context) {
        super(context);
        this.a = new Matrix();
        this.n = new mo(this, 26);
    }

    public final void a() {
        float min = Math.min(org.telegram.messenger.g0.L(10.0f) / this.c, 0.49f);
        int currentTextColor = getCurrentTextColor();
        int i7 = 1048575 & currentTextColor;
        this.b = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{i7, currentTextColor, currentTextColor, i7}, new float[]{0.0f, min, 1.0f - min, 1.0f}, Shader.TileMode.CLAMP);
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
        int L = org.telegram.messenger.g0.L(40.0f);
        float f10 = this.f;
        float f11 = measuredWidth;
        float a10 = f10 < f11 ? c8.l9.a(f10 / org.telegram.messenger.g0.L(10.0f), 0.0f, 1.0f) : 0.0f;
        Matrix matrix = this.a;
        matrix.reset();
        float L2 = org.telegram.messenger.g0.L(10.0f);
        float f12 = this.c;
        matrix.postScale(com.google.android.gms.internal.vision.e2.z(1.0f, a10, L2 / f12, 1.0f), 1.0f, f12, 0.0f);
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
                float f15 = L;
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
        long j3 = this.h;
        long min = (j3 == 0 || z11) ? 16L : Math.min(uptimeMillis - j3, 120L);
        this.h = uptimeMillis;
        boolean z12 = this.d;
        mo moVar = this.n;
        if ((z12 && this.e) || !z11) {
            float c10 = com.google.android.gms.internal.vision.e2.c(min, 1000.0f, org.telegram.messenger.g0.L(60.0f), this.f);
            this.f = c10;
            if (c10 > measuredWidth + L) {
                org.telegram.messenger.g0.r(moVar);
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
        org.telegram.messenger.g0.h3(moVar, 1500L);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i10);
        this.c = View.MeasureSpec.getSize(i7);
        this.d = getMeasuredWidth() > this.c - this.s;
        a();
    }

    public void setCustomPaddingRight(int i7) {
        this.s = i7;
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
        org.telegram.messenger.g0.r(this.n);
        this.r = false;
        this.e = false;
        this.f = 0.0f;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        a();
    }
}
