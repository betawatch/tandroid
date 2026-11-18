package oi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.cu;
import org.telegram.messenger.ev;
import org.telegram.messenger.j10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h4 extends ReplacementSpan {
    public final TL_iv.textButton a;
    public cu b;
    public View c;
    public int d = j10.t0;
    public i6 e;

    public h4(TL_iv.textButton textbutton) {
        this.a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        return (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile);
    }

    public final void a(int i7, View view, i6 i6Var) {
        View view2;
        cu cuVar = this.b;
        if (cuVar != null && (view2 = this.c) != null) {
            cuVar.b(view2);
        }
        this.c = view;
        this.d = i7;
        this.e = i6Var;
        this.b = null;
        b();
    }

    public final cu b() {
        if (this.b == null) {
            int i7 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            cu cuVar = new cu(new ev(i7, L, this.e), L, this.a, Boolean.FALSE);
            this.b = cuVar;
            View view = this.c;
            if (view != null) {
                cuVar.a(view);
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
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        b().draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i7, i10, fontMetricsInt);
    }
}
