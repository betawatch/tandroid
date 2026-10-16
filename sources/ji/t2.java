package ji;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements r5, f1 {
    public final /* synthetic */ x3 a;

    public /* synthetic */ t2(x3 x3Var) {
        this.a = x3Var;
    }

    public void a(h1 h1Var, m4 m4Var, boolean z10) {
        x3 x3Var = this.a;
        v3 v3Var = x3Var.f3;
        Editable text = h1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(m4Var);
        int spanEnd = text != null ? text.getSpanEnd(m4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            x3Var.p3(false);
            v3Var.l(new w3(x3Var, h1Var, spanStart, spanEnd, m4Var), h1Var);
            return;
        }
        TL_iv.textButton textbutton = m4Var.a;
        if (textbutton == null) {
            return;
        }
        h2 h2Var = x3Var.H3;
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
        if (text2 == null || text2.getSpanStart(m4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = m4Var.b;
        if (richButtonSpan != null && m4Var.c == h1Var) {
            richButtonSpan.detach(h1Var);
            m4Var.c = null;
        }
        text2.removeSpan(m4Var);
        m4 m4Var2 = new m4(textbutton);
        m4Var2.a(x3Var.d3, h1Var, x3Var.e3);
        text2.setSpan(m4Var2, spanStart, spanEnd, 33);
        h1Var.notifySpansChanged();
        h1Var.requestLayout();
        h1Var.invalidateEffects();
        v3Var.onContentChanged();
    }
}
