package li;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.iu;
import org.telegram.messenger.kv;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class i4 extends ReplacementSpan {
    public final TL_iv.textButton a;
    public iu b;
    public View c;
    public int d = p10.s0;
    public f6 e;

    public i4(TL_iv.textButton textbutton) {
        this.a = textbutton;
    }

    public static boolean c(TL_keyboard.InlineButtonType inlineButtonType) {
        return (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) || (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile);
    }

    public final void a(int i7, View view, f6 f6Var) {
        View view2;
        iu iuVar = this.b;
        if (iuVar != null && (view2 = this.c) != null) {
            iuVar.h = null;
            iuVar.a.a.f(view2);
        }
        this.c = view;
        this.d = i7;
        this.e = f6Var;
        this.b = null;
        b();
    }

    public final iu b() {
        if (this.b == null) {
            int i7 = this.d;
            int L = org.telegram.messenger.g0.L(240.0f);
            iu iuVar = new iu(new kv(i7, L, this.e), L, this.a, Boolean.FALSE);
            this.b = iuVar;
            View view = this.c;
            if (view != null) {
                iuVar.a(view);
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
