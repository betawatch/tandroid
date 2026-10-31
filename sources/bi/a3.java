package bi;

import android.text.Editable;
import org.telegram.messenger.tu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.kt;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements w5, l1 {
    public final /* synthetic */ d4 a;

    public /* synthetic */ a3(d4 d4Var) {
        this.a = d4Var;
    }

    public void a(n1 n1Var, u4 u4Var, boolean z10) {
        d4 d4Var = this.a;
        b4 b4Var = d4Var.o3;
        Editable text = n1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(u4Var);
        int spanEnd = text != null ? text.getSpanEnd(u4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            d4Var.r3(false);
            b4Var.N(new c4(d4Var, n1Var, spanStart, spanEnd, u4Var), n1Var);
            return;
        }
        TL_iv.textButton textbutton = u4Var.a;
        if (textbutton == null) {
            return;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
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
        Editable text2 = n1Var.getText();
        if (text2 == null || text2.getSpanStart(u4Var) < 0) {
            return;
        }
        tu tuVar = u4Var.b;
        if (tuVar != null && u4Var.c == n1Var) {
            tuVar.h = null;
            tuVar.a.a.f(n1Var);
            u4Var.c = null;
        }
        text2.removeSpan(u4Var);
        u4 u4Var2 = new u4(textbutton);
        u4Var2.a(d4Var.m3, n1Var, d4Var.n3);
        text2.setSpan(u4Var2, spanStart, spanEnd, 33);
        kt ktVar = n1Var.N1;
        if (ktVar != null) {
            ktVar.m();
        }
        n1Var.p2 = true;
        n1Var.invalidate();
        n1Var.requestLayout();
        n1Var.f();
        b4Var.onContentChanged();
    }
}
