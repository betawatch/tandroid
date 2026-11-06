package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class b80 extends ReplacementSpan {
    public final int a;
    public View b;
    public final a80 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public b80(int i7, View view) {
        this(view, i7, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i7, int i10) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i7);
        a80 a80Var = this.c;
        a80Var.o = valueOf;
        a80Var.p = Integer.valueOf(i10);
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
        a80 a80Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i11 + i13) / 2.0f;
            int i15 = (int) f10;
            float f13 = f11 / 2.0f;
            a80Var.setBounds(i15, (int) (f12 - f13), i14 + i15, (int) (f13 + f12));
        } else {
            int i16 = (int) f10;
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            a80Var.setBounds(i16, (int) (z10 + f14), i14 + i16, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            a80Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        a80Var.setAlpha((int) ((paint == null ? org.telegram.messenger.qs.e4 : paint.getAlpha()) * this.h));
        a80Var.draw(canvas);
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
        a80 a80Var = this.c;
        if (z9 || (a80Var.o == null && a80Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            a80Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        boolean z10 = this.n;
        int i11 = this.a;
        return (!z10 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i11 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i11;
    }

    public b80(View view, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i7;
        this.d = i10;
        a80 a80Var = new a80(f6Var);
        this.c = a80Var;
        a80Var.k(4.0f);
    }
}
