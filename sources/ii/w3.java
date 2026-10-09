package ii;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w3 {
    public final i1 a;
    public final int b;
    public final int c;
    public final m4 d;
    public final TL_iv.RichText e;
    public final /* synthetic */ x3 f;

    public w3(x3 x3Var, i1 i1Var, int i10, int i11, m4 m4Var) {
        TL_iv.textButton textbutton;
        this.f = x3Var;
        this.a = i1Var;
        this.b = i10;
        this.c = i11;
        this.d = m4Var;
        if (m4Var == null || (textbutton = m4Var.a) == null) {
            this.e = h6.f(new SpannableStringBuilder(i1Var.getText().subSequence(i10, i11)));
        } else {
            this.e = textbutton.text;
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        i1 i1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (m4.c(inlineButtonType) && (text = (i1Var = this.a).getText()) != null && (i10 = this.b) >= 0) {
            int length = text.length();
            int i11 = this.c;
            if (i11 > length || i10 >= i11) {
                return;
            }
            x3 x3Var = this.f;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            k3 k3Var = x3Var.l3;
            if (k3Var != null) {
                k3Var.f(false);
            }
            i1Var.setLocked(false);
            for (m4 m4Var : (m4[]) text.getSpans(i10, i11, m4.class)) {
                text.removeSpan(m4Var);
            }
            h6.n(text, i10, i11);
            h6.m(text, i10, i11);
            m4 m4Var2 = this.d;
            if (m4Var2 == null || (textbutton = m4Var2.a) == null) {
                textbutton = new TL_iv.textButton();
            }
            textbutton.text = this.e;
            textbutton.type = inlineButtonType;
            if (textbutton.style == null) {
                textbutton.style = new TL_keyboard.RichButtonStyle();
            }
            m4 m4Var3 = new m4(textbutton);
            m4Var3.a(x3Var.d3, i1Var, x3Var.e3);
            text.setSpan(m4Var3, i10, i11, 33);
            m4Var3.d(text);
            i1Var.setSelection(Math.min(i11, i1Var.length()));
            x3Var.G3 = true;
            try {
                i1Var.notifySpansChanged();
                i1Var.requestLayout();
                i1Var.invalidateEffects();
                x3Var.G3 = false;
                i2 i2Var2 = x3Var.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.f3.onContentChanged();
            } catch (Throwable th2) {
                x3Var.G3 = false;
                throw th2;
            }
        }
    }
}
