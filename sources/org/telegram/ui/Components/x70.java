package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x70 extends ReplacementSpan {
    public final int a;
    public View b;
    public final w70 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public x70(int i3, View view) {
        this(view, i3, org.telegram.messenger.g0.L(2.0f), null);
    }

    public final void a(int i3, int i10) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i3);
        w70 w70Var = this.c;
        w70Var.o = valueOf;
        w70Var.p = Integer.valueOf(i10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        View view;
        boolean z10 = this.n;
        int i14 = this.a;
        if (z10 && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i14;
        }
        float f11 = this.f;
        w70 w70Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i11 + i13) / 2.0f;
            int i15 = (int) f10;
            float f13 = f11 / 2.0f;
            w70Var.setBounds(i15, (int) (f12 - f13), i14 + i15, (int) (f13 + f12));
        } else {
            int i16 = (int) f10;
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.e, org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            w70Var.setBounds(i16, (int) (y9 + f14), i14 + i16, (int) (((i13 - org.telegram.messenger.g0.L(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.k5.z(2.0f, i13, i11) / 2.0f))) + f14));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            w70Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        w70Var.setAlpha((int) ((paint == null ? org.telegram.messenger.hs.e4 : paint.getAlpha()) * this.h));
        w70Var.draw(canvas);
        View view2 = this.b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
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
        w70 w70Var = this.c;
        if (z10 || (w70Var.o == null && w70Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            w70Var.f(org.telegram.ui.ActionBar.k6.r1(0.1f, color), org.telegram.ui.ActionBar.k6.r1(0.25f, color));
        }
        boolean z11 = this.n;
        int i11 = this.a;
        return (!z11 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i11 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i11;
    }

    public x70(View view, int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i3;
        this.d = i10;
        w70 w70Var = new w70(e6Var);
        this.c = w70Var;
        w70Var.k(4.0f);
    }
}
