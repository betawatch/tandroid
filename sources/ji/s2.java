package ji;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements p5, f1 {
    public final /* synthetic */ v3 a;

    public /* synthetic */ s2(v3 v3Var) {
        this.a = v3Var;
    }

    public void a(h1 h1Var, k4 k4Var, boolean z10) {
        v3 v3Var = this.a;
        t3 t3Var = v3Var.h3;
        Editable text = h1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(k4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(k4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            v3Var.n3(false);
            t3Var.d(new u3(v3Var, h1Var, spanStart, spanEnd, k4Var), h1Var);
            return;
        }
        TL_iv.textButton textbutton = k4Var.a;
        if (textbutton == null) {
            return;
        }
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.d();
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
        k4Var2.a(v3Var.f3, h1Var, v3Var.g3);
        text2.setSpan(k4Var2, spanStart, spanEnd, 33);
        h1Var.notifySpansChanged();
        h1Var.requestLayout();
        h1Var.invalidateEffects();
        t3Var.onContentChanged();
    }
}
