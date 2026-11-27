// default package

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh9 implements ul9, bg9 {
    public final /* synthetic */ pi9 a;

    public /* synthetic */ oh9(pi9 pi9Var) {
        this.a = pi9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dg9 dg9Var, dj9 dj9Var, boolean z) {
        int spanEnd;
        int i;
        char c;
        Editable text;
        pi9 pi9Var = this.a;
        ni9 ni9Var = pi9Var.p3;
        Editable text2 = dg9Var.getText();
        if (text2 == null) {
            i = -1;
            spanEnd = -1;
        } else {
            int spanStart = text2.getSpanStart(dj9Var);
            spanEnd = text2.getSpanEnd(dj9Var);
            i = spanStart;
        }
        if (i < 0 || spanEnd <= i) {
            return;
        }
        if (z) {
            pi9Var.l3(false);
            ni9Var.K(new oi9(pi9Var, dg9Var, i, spanEnd, dj9Var), dg9Var);
            return;
        }
        TL_iv.textButton textbutton = dj9Var.a;
        if (textbutton != null) {
            ch9 ch9Var = pi9Var.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
            if (richButtonStyle != null) {
                if (richButtonStyle.bg_primary) {
                    c = 2;
                } else if (richButtonStyle.bg_danger) {
                    c = 3;
                } else if (richButtonStyle.bg_success) {
                    c = 0;
                }
                if (richButtonStyle == null) {
                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                }
                richButtonStyle.flags = 0;
                richButtonStyle.bg_primary = c != 1;
                richButtonStyle.bg_danger = c != 2;
                richButtonStyle.bg_success = c != 3;
                richButtonStyle.link = false;
                textbutton.style = richButtonStyle;
                text = dg9Var.getText();
                if (text != null || text.getSpanStart(dj9Var) < 0) {
                }
                gk9 gk9Var = dj9Var.b;
                if (gk9Var != null && dj9Var.c == dg9Var) {
                    gk9Var.h = null;
                    gk9Var.a.a.f(dg9Var);
                    dj9Var.c = null;
                }
                text.removeSpan(dj9Var);
                dj9 dj9Var2 = new dj9(textbutton);
                dj9Var2.a(pi9Var.n3, pi9Var.o3, dg9Var);
                text.setSpan(dj9Var2, i, spanEnd, 33);
                vt3 vt3Var = dg9Var.U1;
                if (vt3Var != null) {
                    vt3Var.c();
                }
                dg9Var.w2 = true;
                dg9Var.invalidate();
                dg9Var.requestLayout();
                dg9Var.f();
                ni9Var.onContentChanged();
                return;
            }
            c = 1;
            if (richButtonStyle == null) {
            }
            richButtonStyle.flags = 0;
            richButtonStyle.bg_primary = c != 1;
            richButtonStyle.bg_danger = c != 2;
            richButtonStyle.bg_success = c != 3;
            richButtonStyle.link = false;
            textbutton.style = richButtonStyle;
            text = dg9Var.getText();
            if (text != null) {
            }
        }
    }
}
