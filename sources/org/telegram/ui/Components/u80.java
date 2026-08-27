package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public u80(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        t80 t80Var = this.c;
        t80Var.o = valueOf;
        t80Var.p = Integer.valueOf(i11);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        View view;
        boolean z10 = this.n;
        int i15 = this.a;
        if (z10 && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i15;
        }
        float f11 = this.f;
        t80 t80Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i12 + i14) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            t80Var.setBounds(i16, (int) (f12 - f13), i15 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float z11 = com.google.android.recaptcha.internal.a.z(1.0f, this.e, org.telegram.messenger.y1.B(2.0f, i14, i12) / 2.0f, i12);
            float f14 = this.d;
            t80Var.setBounds(i17, (int) (z11 + f14), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.y1.B(2.0f, i14, i12) / 2.0f))) + f14));
        }
        t80Var.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.h));
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
        t80 t80Var = this.c;
        if (t80Var.o == null && t80Var.p == null) {
            t80Var.e(org.telegram.ui.ActionBar.g6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.n;
        int i12 = this.a;
        return (!z10 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i12 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i12;
    }

    public u80(View view, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i10;
        this.d = i11;
        t80 t80Var = new t80(c6Var);
        this.c = t80Var;
        t80Var.j(4.0f);
    }
}
