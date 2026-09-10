package hi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class y3 {
    public final k1 a;
    public final int b;
    public final int c;
    public final n4 d;
    public final TL_iv.RichText e;
    public final /* synthetic */ z3 f;

    public y3(z3 z3Var, k1 k1Var, int i10, int i11, n4 n4Var) {
        TL_iv.textButton textbutton;
        this.f = z3Var;
        this.a = k1Var;
        this.b = i10;
        this.c = i11;
        this.d = n4Var;
        if (n4Var == null || (textbutton = n4Var.a) == null) {
            this.e = i6.f(new SpannableStringBuilder(k1Var.getText().subSequence(i10, i11)));
        } else {
            this.e = textbutton.text;
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        k1 k1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (n4.c(inlineButtonType) && (text = (k1Var = this.a).getText()) != null && (i10 = this.b) >= 0) {
            int length = text.length();
            int i11 = this.c;
            if (i11 > length || i10 >= i11) {
                return;
            }
            z3 z3Var = this.f;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.d();
            }
            m3 m3Var = z3Var.n3;
            if (m3Var != null) {
                m3Var.f(false);
            }
            k1Var.setLocked(false);
            for (n4 n4Var : (n4[]) text.getSpans(i10, i11, n4.class)) {
                text.removeSpan(n4Var);
            }
            i6.n(text, i10, i11);
            i6.m(text, i10, i11);
            n4 n4Var2 = this.d;
            if (n4Var2 == null || (textbutton = n4Var2.a) == null) {
                textbutton = new TL_iv.textButton();
            }
            textbutton.text = this.e;
            textbutton.type = inlineButtonType;
            if (textbutton.style == null) {
                textbutton.style = new TL_keyboard.RichButtonStyle();
            }
            n4 n4Var3 = new n4(textbutton);
            n4Var3.a(z3Var.f3, k1Var, z3Var.g3);
            text.setSpan(n4Var3, i10, i11, 33);
            n4Var3.d(text);
            k1Var.setSelection(Math.min(i11, k1Var.length()));
            z3Var.I3 = true;
            try {
                k1Var.notifySpansChanged();
                k1Var.requestLayout();
                k1Var.invalidateEffects();
                z3Var.I3 = false;
                k2 k2Var2 = z3Var.J3;
                if (k2Var2 != null) {
                    k2Var2.h();
                }
                z3Var.h3.onContentChanged();
            } catch (Throwable th2) {
                z3Var.I3 = false;
                throw th2;
            }
        }
    }
}
