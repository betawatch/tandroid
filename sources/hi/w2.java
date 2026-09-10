package hi;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements o5, i1 {
    public final /* synthetic */ z3 a;

    public /* synthetic */ w2(z3 z3Var) {
        this.a = z3Var;
    }

    public void a(k1 k1Var, n4 n4Var, boolean z10) {
        z3 z3Var = this.a;
        x3 x3Var = z3Var.h3;
        Editable text = k1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(n4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(n4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            z3Var.n3(false);
            x3Var.o(new y3(z3Var, k1Var, spanStart, spanEnd, n4Var), k1Var);
            return;
        }
        TL_iv.textButton textbutton = n4Var.a;
        if (textbutton == null) {
            return;
        }
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.d();
        }
        TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
        char c10 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
        if (richButtonStyle == null) {
            richButtonStyle = new TL_keyboard.RichButtonStyle();
        }
        richButtonStyle.flags = 0;
        richButtonStyle.bg_primary = c10 == 1;
        richButtonStyle.bg_danger = c10 == 2;
        richButtonStyle.bg_success = c10 == 3;
        richButtonStyle.link = false;
        textbutton.style = richButtonStyle;
        Editable text2 = k1Var.getText();
        if (text2 == null || text2.getSpanStart(n4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = n4Var.b;
        if (richButtonSpan != null && n4Var.c == k1Var) {
            richButtonSpan.detach(k1Var);
            n4Var.c = null;
        }
        text2.removeSpan(n4Var);
        n4 n4Var2 = new n4(textbutton);
        n4Var2.a(z3Var.f3, k1Var, z3Var.g3);
        text2.setSpan(n4Var2, spanStart, spanEnd, 33);
        k1Var.notifySpansChanged();
        k1Var.requestLayout();
        k1Var.invalidateEffects();
        x3Var.onContentChanged();
    }
}
