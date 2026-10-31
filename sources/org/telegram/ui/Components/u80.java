package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u80 extends ReplacementSpan {
    public final int a;
    public View b;
    public final t80 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public u80(int i10, View view) {
        this(view, i10, org.telegram.messenger.i0.L(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i10);
        t80 t80Var = this.c;
        t80Var.o = valueOf;
        t80Var.p = Integer.valueOf(i11);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        View view;
        boolean z10 = this.n;
        int i15 = this.a;
        if (z10 && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i15;
        }
        float f10 = this.f;
        t80 t80Var = this.c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            t80Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = c3.i0.z(1.0f, this.e, org.telegram.messenger.m5.z(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            t80Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - org.telegram.messenger.i0.L(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.m5.z(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            t80Var.f(org.telegram.ui.ActionBar.t6.r1(0.1f, color), org.telegram.ui.ActionBar.t6.r1(0.25f, color));
        }
        t80Var.setAlpha((int) ((paint == null ? org.telegram.messenger.zs.e4 : paint.getAlpha()) * this.h));
        t80Var.draw(canvas);
        View view2 = this.b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        boolean z10 = this.r;
        t80 t80Var = this.c;
        if (z10 || (t80Var.o == null && t80Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            t80Var.f(org.telegram.ui.ActionBar.t6.r1(0.1f, color), org.telegram.ui.ActionBar.t6.r1(0.25f, color));
        }
        boolean z11 = this.n;
        int i12 = this.a;
        return (!z11 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i12 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i12;
    }

    public u80(View view, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i10;
        this.d = i11;
        t80 t80Var = new t80(p6Var);
        this.c = t80Var;
        t80Var.k(4.0f);
    }
}
