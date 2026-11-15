package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e80 extends ReplacementSpan {
    public final int a;
    public View b;
    public final d80 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public e80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i7);
        d80 d80Var = this.c;
        d80Var.o = valueOf;
        d80Var.p = Integer.valueOf(i10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        View view;
        boolean z10 = this.n;
        int i14 = this.a;
        if (z10 && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i14;
        }
        float f11 = this.f;
        d80 d80Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i11 + i13) / 2.0f;
            int i15 = (int) f10;
            float f13 = f11 / 2.0f;
            d80Var.setBounds(i15, (int) (f12 - f13), i14 + i15, (int) (f13 + f12));
        } else {
            int i16 = (int) f10;
            float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, this.e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            d80Var.setBounds(i16, (int) (z11 + f14), i14 + i16, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            d80Var.f(org.telegram.ui.ActionBar.j6.r1(0.1f, color), org.telegram.ui.ActionBar.j6.r1(0.25f, color));
        }
        d80Var.setAlpha((int) ((paint == null ? org.telegram.messenger.ns.e4 : paint.getAlpha()) * this.h));
        d80Var.draw(canvas);
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
        boolean z10 = this.r;
        d80 d80Var = this.c;
        if (z10 || (d80Var.o == null && d80Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            d80Var.f(org.telegram.ui.ActionBar.j6.r1(0.1f, color), org.telegram.ui.ActionBar.j6.r1(0.25f, color));
        }
        boolean z11 = this.n;
        int i11 = this.a;
        return (!z11 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i11 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i11;
    }

    public e80(View view, int i7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i7;
        this.d = i10;
        d80 d80Var = new d80(e6Var);
        this.c = d80Var;
        d80Var.k(4.0f);
    }
}
