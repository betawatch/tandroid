package oi;

import android.text.Editable;
import org.telegram.messenger.cu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.kt;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements i5, c1 {
    public final /* synthetic */ s3 a;

    public /* synthetic */ q2(s3 s3Var) {
        this.a = s3Var;
    }

    public void a(e1 e1Var, h4 h4Var, boolean z10) {
        s3 s3Var = this.a;
        q3 q3Var = s3Var.p3;
        Editable text = e1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(h4Var);
        int spanEnd = text != null ? text.getSpanEnd(h4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            s3Var.r3(false);
            q3Var.R0(new r3(s3Var, e1Var, spanStart, spanEnd, h4Var), e1Var);
            return;
        }
        TL_iv.textButton textbutton = h4Var.a;
        if (textbutton == null) {
            return;
        }
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.d();
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
        if (text2 == null || text2.getSpanStart(h4Var) < 0) {
            return;
        }
        cu cuVar = h4Var.b;
        if (cuVar != null && h4Var.c == e1Var) {
            cuVar.b(e1Var);
            h4Var.c = null;
        }
        text2.removeSpan(h4Var);
        h4 h4Var2 = new h4(textbutton);
        h4Var2.a(s3Var.n3, e1Var, s3Var.o3);
        text2.setSpan(h4Var2, spanStart, spanEnd, 33);
        kt ktVar = e1Var.T1;
        if (ktVar != null) {
            ktVar.g();
        }
        e1Var.v2 = true;
        e1Var.invalidate();
        e1Var.requestLayout();
        e1Var.f();
        q3Var.onContentChanged();
    }
}
