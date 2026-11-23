package oi;

import android.text.Editable;
import org.telegram.messenger.du;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements j5, d1 {
    public final /* synthetic */ t3 a;

    public /* synthetic */ s2(t3 t3Var) {
        this.a = t3Var;
    }

    public void a(f1 f1Var, i4 i4Var, boolean z10) {
        t3 t3Var = this.a;
        r3 r3Var = t3Var.p3;
        Editable text = f1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(i4Var);
        int spanEnd = text != null ? text.getSpanEnd(i4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            t3Var.r3(false);
            r3Var.R0(new s3(t3Var, f1Var, spanStart, spanEnd, i4Var), f1Var);
            return;
        }
        TL_iv.textButton textbutton = i4Var.a;
        if (textbutton == null) {
            return;
        }
        g2 g2Var = t3Var.R3;
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
        Editable text2 = f1Var.getText();
        if (text2 == null || text2.getSpanStart(i4Var) < 0) {
            return;
        }
        du duVar = i4Var.b;
        if (duVar != null && i4Var.c == f1Var) {
            duVar.b(f1Var);
            i4Var.c = null;
        }
        text2.removeSpan(i4Var);
        i4 i4Var2 = new i4(textbutton);
        i4Var2.a(t3Var.n3, f1Var, t3Var.o3);
        text2.setSpan(i4Var2, spanStart, spanEnd, 33);
        mt mtVar = f1Var.T1;
        if (mtVar != null) {
            mtVar.g();
        }
        f1Var.v2 = true;
        f1Var.invalidate();
        f1Var.requestLayout();
        f1Var.f();
        r3Var.onContentChanged();
    }
}
