// default package

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag9 implements hk9, le9 {
    public final /* synthetic */ ch9 a;

    public /* synthetic */ ag9(ch9 ch9Var) {
        this.a = ch9Var;
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
    public final void a(ne9 ne9Var, qh9 qh9Var, boolean z) {
        int spanEnd;
        int i;
        char c;
        Editable text;
        ch9 ch9Var = this.a;
        ah9 ah9Var = ch9Var.p3;
        Editable text2 = ne9Var.getText();
        if (text2 == null) {
            i = -1;
            spanEnd = -1;
        } else {
            int spanStart = text2.getSpanStart(qh9Var);
            spanEnd = text2.getSpanEnd(qh9Var);
            i = spanStart;
        }
        if (i < 0 || spanEnd <= i) {
            return;
        }
        if (z) {
            ch9Var.k3(false);
            ah9Var.w(new bh9(ch9Var, ne9Var, i, spanEnd, qh9Var), ne9Var);
            return;
        }
        TL_iv.textButton textbutton = qh9Var.a;
        if (textbutton != null) {
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.d();
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
                text = ne9Var.getText();
                if (text != null || text.getSpanStart(qh9Var) < 0) {
                }
                ti9 ti9Var = qh9Var.b;
                if (ti9Var != null && qh9Var.c == ne9Var) {
                    ti9Var.h = null;
                    ti9Var.a.a.f(ne9Var);
                    qh9Var.c = null;
                }
                text.removeSpan(qh9Var);
                qh9 qh9Var2 = new qh9(textbutton);
                qh9Var2.a(ch9Var.n3, ch9Var.o3, ne9Var);
                text.setSpan(qh9Var2, i, spanEnd, 33);
                ou3 ou3Var = ne9Var.T1;
                if (ou3Var != null) {
                    ou3Var.m();
                }
                ne9Var.v2 = true;
                ne9Var.invalidate();
                ne9Var.requestLayout();
                ne9Var.f();
                ah9Var.onContentChanged();
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
            text = ne9Var.getText();
            if (text != null) {
            }
        }
    }
}
