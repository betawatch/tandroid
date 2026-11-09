package li;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class s3 {
    public final g1 a;
    public final int b;
    public final int c;
    public final i4 d;
    public final TL_iv.RichText e;
    public final /* synthetic */ t3 f;

    public s3(t3 t3Var, g1 g1Var, int i7, int i10, i4 i4Var) {
        TL_iv.textButton textbutton;
        this.f = t3Var;
        this.a = g1Var;
        this.b = i7;
        this.c = i10;
        this.d = i4Var;
        if (i4Var == null || (textbutton = i4Var.a) == null) {
            this.e = c6.f(new SpannableStringBuilder(g1Var.getText().subSequence(i7, i10)));
        } else {
            this.e = textbutton.text;
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        g1 g1Var;
        Editable text;
        int i7;
        TL_iv.textButton textbutton;
        if (i4.c(inlineButtonType) && (text = (g1Var = this.a).getText()) != null && (i7 = this.b) >= 0) {
            int length = text.length();
            int i10 = this.c;
            if (i10 > length || i7 >= i10) {
                return;
            }
            t3 t3Var = this.f;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            g3 g3Var = t3Var.u3;
            if (g3Var != null) {
                g3Var.f(false);
            }
            g1Var.setLocked(false);
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
            i4Var3.a(t3Var.m3, g1Var, t3Var.n3);
            text.setSpan(i4Var3, i7, i10, 33);
            i4Var3.d(text);
            g1Var.setSelection(Math.min(i10, g1Var.length()));
            t3Var.P3 = true;
            try {
                xs xsVar = g1Var.N1;
                if (xsVar != null) {
                    xsVar.m();
                }
                g1Var.p2 = true;
                g1Var.invalidate();
                g1Var.requestLayout();
                g1Var.f();
                t3Var.P3 = false;
                f2 f2Var2 = t3Var.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                t3Var.o3.onContentChanged();
            } catch (Throwable th2) {
                t3Var.P3 = false;
                throw th2;
            }
        }
    }
}
