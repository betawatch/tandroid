package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k90 extends ReplacementSpan {
    public final int a;
    public View b;
    public final j90 c;
    public final int d;
    public float e;
    public float f;
    public float h;
    public boolean n;

    public k90(int i10, View view) {
        this(view, i10, AndroidUtilities.dp(2.0f), null);
    }

    public final void a(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i10);
        j90 j90Var = this.c;
        j90Var.o = valueOf;
        j90Var.p = Integer.valueOf(i11);
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
        j90 j90Var = this.c;
        if (f11 > 0.0f) {
            float f12 = (i12 + i14) / 2.0f;
            int i16 = (int) f10;
            float f13 = f11 / 2.0f;
            j90Var.setBounds(i16, (int) (f12 - f13), i15 + i16, (int) (f13 + f12));
        } else {
            int i17 = (int) f10;
            float w10 = e2.c.w(1.0f, this.e, org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f, i12);
            float f14 = this.d;
            j90Var.setBounds(i17, (int) (w10 + f14), i15 + i17, (int) (((i14 - AndroidUtilities.dp(2.0f)) - ((1.0f - this.e) * (org.telegram.messenger.y3.B(2.0f, i14, i12) / 2.0f))) + f14));
        }
        j90Var.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.h));
        j90Var.draw(canvas);
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
        j90 j90Var = this.c;
        if (j90Var.o == null && j90Var.p == null) {
            j90Var.e(org.telegram.ui.ActionBar.j6.l1(0.1f, paint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.25f, paint.getColor()));
        }
        boolean z4 = this.n;
        int i12 = this.a;
        return (!z4 || (view = this.b) == null || view.getMeasuredWidth() <= 0) ? i12 : ((this.b.getMeasuredWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight()) - i12;
    }

    public k90(View view, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = 1.0f;
        this.f = -1.0f;
        this.h = 1.0f;
        this.n = false;
        this.b = view;
        this.a = i10;
        this.d = i11;
        j90 j90Var = new j90(f6Var);
        this.c = j90Var;
        j90Var.j(4.0f);
    }
}
