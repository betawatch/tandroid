package mi;

import android.text.Editable;
import org.telegram.messenger.au;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements k5, f1 {
    public final /* synthetic */ t3 a;

    public /* synthetic */ s2(t3 t3Var) {
        this.a = t3Var;
    }

    public void a(h1 h1Var, j4 j4Var, boolean z10) {
        t3 t3Var = this.a;
        r3 r3Var = t3Var.p3;
        Editable text = h1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(j4Var);
        int spanEnd = text != null ? text.getSpanEnd(j4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            t3Var.r3(false);
            r3Var.W(new s3(t3Var, h1Var, spanStart, spanEnd, j4Var), h1Var);
            return;
        }
        TL_iv.textButton textbutton = j4Var.a;
        if (textbutton == null) {
            return;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
        char c2 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
        if (richButtonStyle == null) {
            richButtonStyle = new TL_keyboard.RichButtonStyle();
        }
        richButtonStyle.flags = 0;
        richButtonStyle.bg_primary = c2 == 1;
        richButtonStyle.bg_danger = c2 == 2;
        richButtonStyle.bg_success = c2 == 3;
        richButtonStyle.link = false;
        textbutton.style = richButtonStyle;
        Editable text2 = h1Var.getText();
        if (text2 == null || text2.getSpanStart(j4Var) < 0) {
            return;
        }
        au auVar = j4Var.b;
        if (auVar != null && j4Var.c == h1Var) {
            auVar.h = null;
            auVar.a.a.f(h1Var);
            j4Var.c = null;
        }
        text2.removeSpan(j4Var);
        j4 j4Var2 = new j4(textbutton);
        j4Var2.a(t3Var.n3, h1Var, t3Var.o3);
        text2.setSpan(j4Var2, spanStart, spanEnd, 33);
        vs vsVar = h1Var.O1;
        if (vsVar != null) {
            vsVar.m();
        }
        h1Var.q2 = true;
        h1Var.invalidate();
        h1Var.requestLayout();
        h1Var.f();
        r3Var.onContentChanged();
    }
}
