package oi;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s3 {
    public final f1 a;
    public final int b;
    public final int c;
    public final i4 d;
    public final TL_iv.RichText e;
    public final /* synthetic */ t3 f;

    public s3(t3 t3Var, f1 f1Var, int i7, int i10, i4 i4Var) {
        TL_iv.textButton textbutton;
        this.f = t3Var;
        this.a = f1Var;
        this.b = i7;
        this.c = i10;
        this.d = i4Var;
        if (i4Var == null || (textbutton = i4Var.a) == null) {
            this.e = c6.f(new SpannableStringBuilder(f1Var.getText().subSequence(i7, i10)));
        } else {
            this.e = textbutton.text;
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        f1 f1Var;
        Editable text;
        int i7;
        TL_iv.textButton textbutton;
        if (i4.c(inlineButtonType) && (text = (f1Var = this.a).getText()) != null && (i7 = this.b) >= 0) {
            int length = text.length();
            int i10 = this.c;
            if (i10 > length || i7 >= i10) {
                return;
            }
            t3 t3Var = this.f;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            h3 h3Var = t3Var.v3;
            if (h3Var != null) {
                h3Var.f(false);
            }
            f1Var.setLocked(false);
            for (i4 i4Var : (i4[]) text.getSpans(i7, i10, i4.class)) {
                text.removeSpan(i4Var);
            }
            c6.n(text, i7, i10);
            c6.m(text, i7, i10);
            i4 i4Var2 = this.d;
            if (i4Var2 == null || (textbutton = i4Var2.a) == null) {
                textbutton = new TL_iv.textButton();
            }
            textbutton.text = this.e;
            textbutton.type = inlineButtonType;
            if (textbutton.style == null) {
                textbutton.style = new TL_keyboard.RichButtonStyle();
            }
            i4 i4Var3 = new i4(textbutton);
            i4Var3.a(t3Var.n3, f1Var, t3Var.o3);
            text.setSpan(i4Var3, i7, i10, 33);
            i4Var3.d(text);
            f1Var.setSelection(Math.min(i10, f1Var.length()));
            t3Var.Q3 = true;
            try {
                mt mtVar = f1Var.T1;
                if (mtVar != null) {
                    mtVar.g();
                }
                f1Var.v2 = true;
                f1Var.invalidate();
                f1Var.requestLayout();
                f1Var.f();
                t3Var.Q3 = false;
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var.p3.onContentChanged();
            } catch (Throwable th2) {
                t3Var.Q3 = false;
                throw th2;
            }
        }
    }
}
