package ki;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements l5, f1 {
    public final /* synthetic */ w3 a;

    public /* synthetic */ t2(w3 w3Var) {
        this.a = w3Var;
    }

    public void a(h1 h1Var, k4 k4Var, boolean z10) {
        w3 w3Var = this.a;
        u3 u3Var = w3Var.f3;
        Editable text = h1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(k4Var);
        int spanEnd = text != null ? text.getSpanEnd(k4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            w3Var.p3(false);
            u3Var.H(new v3(w3Var, h1Var, spanStart, spanEnd, k4Var), h1Var);
            return;
        }
        TL_iv.textButton textbutton = k4Var.a;
        if (textbutton == null) {
            return;
        }
        h2 h2Var = w3Var.H3;
        if (h2Var != null) {
            h2Var.d();
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
        Editable text2 = h1Var.getText();
        if (text2 == null || text2.getSpanStart(k4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.b;
        if (richButtonSpan != null && k4Var.c == h1Var) {
            richButtonSpan.detach(h1Var);
            k4Var.c = null;
        }
        text2.removeSpan(k4Var);
        k4 k4Var2 = new k4(textbutton);
        k4Var2.a(w3Var.d3, h1Var, w3Var.e3);
        text2.setSpan(k4Var2, spanStart, spanEnd, 33);
        h1Var.notifySpansChanged();
        h1Var.requestLayout();
        h1Var.invalidateEffects();
        u3Var.onContentChanged();
    }
}
