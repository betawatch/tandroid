package li;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements m5, e1 {
    public final /* synthetic */ v3 a;

    public /* synthetic */ r2(v3 v3Var) {
        this.a = v3Var;
    }

    public void a(g1 g1Var, k4 k4Var, boolean z10) {
        v3 v3Var = this.a;
        t3 t3Var = v3Var.p3;
        Editable text = g1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(k4Var);
        int spanEnd = text != null ? text.getSpanEnd(k4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            v3Var.u3(false);
            t3Var.i(new u3(v3Var, g1Var, spanStart, spanEnd, k4Var), g1Var);
            return;
        }
        TL_iv.textButton textbutton = k4Var.a;
        if (textbutton == null) {
            return;
        }
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.d();
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
        Editable text2 = g1Var.getText();
        if (text2 == null || text2.getSpanStart(k4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.b;
        if (richButtonSpan != null && k4Var.c == g1Var) {
            richButtonSpan.detach(g1Var);
            k4Var.c = null;
        }
        text2.removeSpan(k4Var);
        k4 k4Var2 = new k4(textbutton);
        k4Var2.a(v3Var.n3, g1Var, v3Var.o3);
        text2.setSpan(k4Var2, spanStart, spanEnd, 33);
        g1Var.notifySpansChanged();
        g1Var.requestLayout();
        g1Var.invalidateEffects();
        t3Var.onContentChanged();
    }
}
