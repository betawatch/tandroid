package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.tu;
import org.telegram.messenger.vv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class u4 extends ReplacementSpan {
    public final TL_iv.textButton a;
    public tu b;
    public View c;
    public int d = d20.s0;
    public org.telegram.ui.ActionBar.p6 e;

    public u4(TL_iv.textButton textbutton) {
        this.a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        return (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile);
    }

    public final void a(int i10, View view, org.telegram.ui.ActionBar.p6 p6Var) {
        View view2;
        tu tuVar = this.b;
        if (tuVar != null && (view2 = this.c) != null) {
            tuVar.h = null;
            tuVar.a.a.f(view2);
        }
        this.c = view;
        this.d = i10;
        this.e = p6Var;
        this.b = null;
        b();
    }

    public final tu b() {
        if (this.b == null) {
            int i10 = this.d;
            int L = org.telegram.messenger.i0.L(240.0f);
            tu tuVar = new tu(new vv(i10, L, this.e), L, this.a, Boolean.FALSE);
            this.b = tuVar;
            View view = this.c;
            if (view != null) {
                tuVar.a(view);
            }
        }
        return this.b;
    }

    public final void d(Editable editable) {
        int spanStart = editable.getSpanStart(this);
        int spanEnd = editable.getSpanEnd(this);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        for (ReplacementSpan replacementSpan : (ReplacementSpan[]) editable.getSpans(spanStart, spanEnd, ReplacementSpan.class)) {
            if (replacementSpan != this) {
                int spanStart2 = editable.getSpanStart(replacementSpan);
                int spanEnd2 = editable.getSpanEnd(replacementSpan);
                if (spanStart2 < spanEnd && spanEnd2 > spanStart) {
                    editable.removeSpan(replacementSpan);
                }
            }
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        b().draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
