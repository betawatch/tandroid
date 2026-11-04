package mi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.au;
import org.telegram.messenger.cv;
import org.telegram.messenger.h10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class j4 extends ReplacementSpan {
    public final TL_iv.textButton a;
    public au b;
    public View c;
    public int d = h10.t0;
    public org.telegram.ui.ActionBar.e6 e;

    public j4(TL_iv.textButton textbutton) {
        this.a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        return (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile);
    }

    public final void a(int i3, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        View view2;
        au auVar = this.b;
        if (auVar != null && (view2 = this.c) != null) {
            auVar.h = null;
            auVar.a.a.f(view2);
        }
        this.c = view;
        this.d = i3;
        this.e = e6Var;
        this.b = null;
        b();
    }

    public final au b() {
        if (this.b == null) {
            int i3 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            au auVar = new au(new cv(i3, L, this.e), L, this.a, Boolean.FALSE);
            this.b = auVar;
            View view = this.c;
            if (view != null) {
                auVar.a(view);
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
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        b().draw(canvas, charSequence, i3, i10, f10, i11, i12, i13, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b().getSize(paint, charSequence, i3, i10, fontMetricsInt);
    }
}
