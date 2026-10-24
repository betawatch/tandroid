package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class da0 extends ReplacementSpan {
    public final int a;
    public View b;
    public final ca0 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;
    public boolean r;

    public da0(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        this.r = false;
        Integer valueOf = Integer.valueOf(i10);
        ca0 ca0Var = this.c;
        ca0Var.o = valueOf;
        ca0Var.p = Integer.valueOf(i11);
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
        ca0 ca0Var = this.c;
        if (f10 > 0.0f) {
            float f11 = (i12 + i14) / 2.0f;
            int i16 = (int) f7;
            float f12 = f10 / 2.0f;
            ca0Var.setBounds(i16, (int) (f11 - f12), i15 + i16, (int) (f12 + f11));
        } else {
            int i17 = (int) f7;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.e, org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f, i12);
            float f13 = this.d;
            ca0Var.setBounds(i17, (int) (y3 + f13), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.v0.B(2.0f, i14, i12) / 2.0f))) + f13));
        }
        if (this.r && paint != null) {
            int color = paint.getColor();
            ca0Var.f(org.telegram.ui.ActionBar.k6.o1(0.1f, color), org.telegram.ui.ActionBar.k6.o1(0.25f, color));
        }
        ca0Var.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.h));
        ca0Var.draw(canvas);
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
        ca0 ca0Var = this.c;
        if (z10 || (ca0Var.o == null && ca0Var.p == null)) {
            this.r = true;
            int color = paint.getColor();
            ca0Var.f(org.telegram.ui.ActionBar.k6.o1(0.1f, color), org.telegram.ui.ActionBar.k6.o1(0.25f, color));
        }
        boolean z11 = this.n;
        int i12 = this.a;
        return (!z11 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i12 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i12;
    }

    public da0(View view, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i10;
        this.d = i11;
        ca0 ca0Var = new ca0(g6Var);
        this.c = ca0Var;
        ca0Var.k(4.0f);
    }
}
