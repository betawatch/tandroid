package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q80 extends ReplacementSpan {
    public final int a;
    public View b;
    public final p80 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;

    public q80(int i9, View view) {
        this(view, i9, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i9, int i10) {
        Integer valueOf = Integer.valueOf(i9);
        p80 p80Var = this.c;
        p80Var.o = valueOf;
        p80Var.p = Integer.valueOf(i10);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        View view;
        boolean z10 = this.n;
        int i14 = this.a;
        if (z10 && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i14 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i14;
        }
        float f11 = this.f;
        p80 p80Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i11 + i13) / 2.0f;
            int i15 = (int) f10;
            float f13 = f11 / 2.0f;
            p80Var.setBounds(i15, (int) (f12 - f13), i14 + i15, (int) (f13 + f12));
        } else {
            int i16 = (int) f10;
            float z11 = e2.c.z(1.0f, this.e, org.telegram.messenger.l0.B(2.0f, i13, i11) / 2.0f, i11);
            float f14 = this.d;
            p80Var.setBounds(i16, (int) (z11 + f14), i14 + i16, (int) (((i13 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.l0.B(2.0f, i13, i11) / 2.0f))) + f14));
        }
        p80Var.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.h));
        p80Var.draw(canvas);
        View view2 = this.b;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        p80 p80Var = this.c;
        if (p80Var.o == null && p80Var.p == null) {
            p80Var.e(org.telegram.ui.ActionBar.f6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.f6.l1(0.25f, paint.getColor()));
        }
        boolean z10 = this.n;
        int i11 = this.a;
        return (!z10 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i11 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i11;
    }

    public q80(View view, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i9;
        this.d = i10;
        p80 p80Var = new p80(b6Var);
        this.c = p80Var;
        p80Var.j(4.0f);
    }
}
