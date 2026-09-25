package ii;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements m5, g1 {
    public final /* synthetic */ x3 a;

    public /* synthetic */ u2(x3 x3Var) {
        this.a = x3Var;
    }

    public void a(i1 i1Var, l4 l4Var, boolean z10) {
        x3 x3Var = this.a;
        v3 v3Var = x3Var.h3;
        Editable text = i1Var.getText();
        int spanStart = text == null ? -1 : text.getSpanStart(l4Var);
        int spanEnd = text == null ? -1 : text.getSpanEnd(l4Var);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return;
        }
        if (z10) {
            x3Var.o3(false);
            v3Var.d(new w3(x3Var, i1Var, spanStart, spanEnd, l4Var), i1Var);
            return;
        }
        TL_iv.textButton textbutton = l4Var.a;
        if (textbutton == null) {
            return;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
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
        if (text2 == null || text2.getSpanStart(l4Var) < 0) {
            return;
        }
        RichMessageLayout.RichButtonSpan richButtonSpan = l4Var.b;
        if (richButtonSpan != null && l4Var.c == i1Var) {
            richButtonSpan.detach(i1Var);
            l4Var.c = null;
        }
        text2.removeSpan(l4Var);
        l4 l4Var2 = new l4(textbutton);
        l4Var2.a(x3Var.f3, i1Var, x3Var.g3);
        text2.setSpan(l4Var2, spanStart, spanEnd, 33);
        i1Var.notifySpansChanged();
        i1Var.requestLayout();
        i1Var.invalidateEffects();
        v3Var.onContentChanged();
    }
}
