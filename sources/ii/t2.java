package ii;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements l5, g1 {
    public final /* synthetic */ w3 a;

    public /* synthetic */ t2(w3 w3Var) {
        this.a = w3Var;
    }

    public void a(i1 i1Var, k4 k4Var, boolean z10) {
        w3 w3Var = this.a;
        u3 u3Var = w3Var.h3;
        Editable text = i1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(k4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(k4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            w3Var.p3(false);
            u3Var.d(new v3(w3Var, i1Var, spanStart, spanEnd, k4Var), i1Var);
            return;
        }
        TL_iv.textButton textbutton = k4Var.a;
        if (textbutton == null) {
            return;
        }
        h2 h2Var = w3Var.J3;
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
        Editable text2 = i1Var.getText();
        if (text2 == null || text2.getSpanStart(k4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.b;
        if (richButtonSpan != null && k4Var.c == i1Var) {
            richButtonSpan.detach(i1Var);
            k4Var.c = null;
        }
        text2.removeSpan(k4Var);
        k4 k4Var2 = new k4(textbutton);
        k4Var2.a(w3Var.f3, i1Var, w3Var.g3);
        text2.setSpan(k4Var2, spanStart, spanEnd, 33);
        i1Var.notifySpansChanged();
        i1Var.requestLayout();
        i1Var.invalidateEffects();
        u3Var.onContentChanged();
    }
}
