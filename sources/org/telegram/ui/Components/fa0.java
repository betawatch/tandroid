package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fa0 extends ReplacementSpan {
    public final int a;
    public View b;
    public final ea0 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public fa0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i10);
        ea0 ea0Var = this.c;
        ea0Var.o = valueOf;
        ea0Var.p = Integer.valueOf(i11);
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
        ea0 ea0Var = this.c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            ea0Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float z11 = c3.h0.z(1.0f, this.e, org.telegram.messenger.t.C(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ea0Var.setBounds(i17, (int) (z11 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.t.C(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            ea0Var.f(org.telegram.ui.ActionBar.y6.o1(0.1f, color), org.telegram.ui.ActionBar.y6.o1(0.25f, color));
        }
        ea0Var.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.h));
        ea0Var.draw(canvas);
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
        ea0 ea0Var = this.c;
        if (z10 || (ea0Var.o == null && ea0Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            ea0Var.f(org.telegram.ui.ActionBar.y6.o1(0.1f, color), org.telegram.ui.ActionBar.y6.o1(0.25f, color));
        }
        boolean z11 = this.n;
        int i12 = this.a;
        return (!z11 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i12 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i12;
    }

    public fa0(View view, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i10;
        this.d = i11;
        ea0 ea0Var = new ea0(u6Var);
        this.c = ea0Var;
        ea0Var.k(4.0f);
    }
}
