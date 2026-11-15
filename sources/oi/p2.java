package oi;

import android.text.Editable;
import org.telegram.messenger.fu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.dt;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements h5, c1 {
    public final /* synthetic */ q3 a;

    public /* synthetic */ p2(q3 q3Var) {
        this.a = q3Var;
    }

    public void a(e1 e1Var, f4 f4Var, boolean z10) {
        q3 q3Var = this.a;
        o3 o3Var = q3Var.p3;
        Editable text = e1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(f4Var);
        int spanEnd = text != null ? text.getSpanEnd(f4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            q3Var.r3(false);
            o3Var.k0(new p3(q3Var, e1Var, spanStart, spanEnd, f4Var), e1Var);
            return;
        }
        TL_iv.textButton textbutton = f4Var.a;
        if (textbutton == null) {
            return;
        }
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.d();
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
        Editable text2 = e1Var.getText();
        if (text2 == null || text2.getSpanStart(f4Var) < 0) {
            return;
        }
        fu fuVar = f4Var.b;
        if (fuVar != null && f4Var.c == e1Var) {
            fuVar.b(e1Var);
            f4Var.c = null;
        }
        text2.removeSpan(f4Var);
        f4 f4Var2 = new f4(textbutton);
        f4Var2.a(q3Var.n3, e1Var, q3Var.o3);
        text2.setSpan(f4Var2, spanStart, spanEnd, 33);
        dt dtVar = e1Var.T1;
        if (dtVar != null) {
            dtVar.E();
        }
        e1Var.v2 = true;
        e1Var.invalidate();
        e1Var.requestLayout();
        e1Var.f();
        o3Var.onContentChanged();
    }
}
