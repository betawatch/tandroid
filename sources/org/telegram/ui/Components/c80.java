package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c80 extends ReplacementSpan {
    public final int a;
    public View b;
    public final b80 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public c80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i7);
        b80 b80Var = this.c;
        b80Var.o = valueOf;
        b80Var.p = Integer.valueOf(i10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        View view;
        boolean z9 = this.n;
        int i14 = this.a;
        if (z9 && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i14;
        }
        float f11 = this.f;
        b80 b80Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i11 + i13) / 2.0f;
            int i15 = (int) f10;
            float f13 = f11 / 2.0f;
            b80Var.setBounds(i15, (int) (f12 - f13), i14 + i15, (int) (f13 + f12));
        } else {
            int i16 = (int) f10;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            b80Var.setBounds(i16, (int) (z10 + f14), i14 + i16, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            b80Var.f(org.telegram.ui.ActionBar.l6.r1(0.1f, color), org.telegram.ui.ActionBar.l6.r1(0.25f, color));
        }
        b80Var.setAlpha((int) ((paint == null ? org.telegram.messenger.qs.e4 : paint.getAlpha()) * this.h));
        b80Var.draw(canvas);
        View view2 = this.b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        boolean z9 = this.r;
        b80 b80Var = this.c;
        if (z9 || (b80Var.o == null && b80Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            b80Var.f(org.telegram.ui.ActionBar.l6.r1(0.1f, color), org.telegram.ui.ActionBar.l6.r1(0.25f, color));
        }
        boolean z10 = this.n;
        int i11 = this.a;
        return (!z10 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i11 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i11;
    }

    public c80(View view, int i7, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i7;
        this.d = i10;
        b80 b80Var = new b80(g6Var);
        this.c = b80Var;
        b80Var.k(4.0f);
    }
}
