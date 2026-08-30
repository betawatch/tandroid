package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j90 extends ReplacementSpan {
    public final int a;
    public View b;
    public final i90 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;

    public j90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        i90 i90Var = this.c;
        i90Var.o = valueOf;
        i90Var.p = Integer.valueOf(i11);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        View view;
        boolean z4 = this.n;
        int i15 = this.a;
        if (z4 && (view = this.b) != null && view.getMeasuredWidth() > 0) {
            i15 = ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i15;
        }
        float f11 = this.f;
        i90 i90Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i12 + i14) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            i90Var.setBounds(i16, (int) (f12 - f13), i15 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float w10 = e2.c.w(1.0f, this.e, org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f, i12);
            float f14 = this.d;
            i90Var.setBounds(i17, (int) (w10 + f14), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f))) + f14));
        }
        i90Var.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.h));
        i90Var.draw(canvas);
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
        i90 i90Var = this.c;
        if (i90Var.o == null && i90Var.p == null) {
            i90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z4 = this.n;
        int i12 = this.a;
        return (!z4 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i12 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i12;
    }

    public j90(View view, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i10;
        this.d = i11;
        i90 i90Var = new i90(f6Var);
        this.c = i90Var;
        i90Var.j(4.0f);
    }
}
