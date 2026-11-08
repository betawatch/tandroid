package li;

import android.text.Editable;
import org.telegram.messenger.iu;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements j5, e1 {
    public final /* synthetic */ t3 a;

    public /* synthetic */ r2(t3 t3Var) {
        this.a = t3Var;
    }

    public void a(g1 g1Var, i4 i4Var, boolean z9) {
        t3 t3Var = this.a;
        r3 r3Var = t3Var.o3;
        Editable text = g1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(i4Var);
        int spanEnd = text != null ? text.getSpanEnd(i4Var) : -1;
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z9) {
            t3Var.r3(false);
            r3Var.d(new s3(t3Var, g1Var, spanStart, spanEnd, i4Var), g1Var);
            return;
        }
        TL_iv.textButton textbutton = i4Var.a;
        if (textbutton == null) {
            return;
        }
        f2 f2Var = t3Var.Q3;
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
        if (text2 == null || text2.getSpanStart(i4Var) < 0) {
            return;
        }
        iu iuVar = i4Var.b;
        if (iuVar != null && i4Var.c == g1Var) {
            iuVar.h = null;
            iuVar.a.a.f(g1Var);
            i4Var.c = null;
        }
        text2.removeSpan(i4Var);
        i4 i4Var2 = new i4(textbutton);
        i4Var2.a(t3Var.m3, g1Var, t3Var.n3);
        text2.setSpan(i4Var2, spanStart, spanEnd, 33);
        xs xsVar = g1Var.N1;
        if (xsVar != null) {
            xsVar.m();
        }
        g1Var.p2 = true;
        g1Var.invalidate();
        g1Var.requestLayout();
        g1Var.f();
        r3Var.onContentChanged();
    }
}
