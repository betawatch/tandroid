// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class mi9 {
    public final mk0 a;
    public final int b;
    public final /* synthetic */ pi9 c;

    public mi9(pi9 pi9Var, mk0 mk0Var, int i) {
        this.c = pi9Var;
        this.a = mk0Var;
        this.b = i;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !dj9.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i = this.b;
        boolean z = i >= 0 && i < d.buttons.size();
        if (z || d.buttons.size() < 8) {
            pi9 pi9Var = this.c;
            ch9 ch9Var = pi9Var.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            TL_keyboard.PageButton pageButton = z ? d.buttons.get(i) : new TL_keyboard.PageButton();
            pageButton.text = mm9.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z) {
                d.buttons.add(pageButton);
            }
            pi9Var.g3.O(false);
            ch9 ch9Var2 = pi9Var.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            pi9Var.p3.onContentChanged();
        }
    }

    public final void b() {
        int i;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i = this.b) < 0 || i >= d.buttons.size()) {
            return;
        }
        pi9 pi9Var = this.c;
        ch9 ch9Var = pi9Var.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        d.buttons.remove(i);
        pi9Var.g3.O(false);
        ch9 ch9Var2 = pi9Var.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        pi9Var.p3.onContentChanged();
    }

    public final boolean c() {
        int i;
        TL_iv.pageBlockButtonRow d = d();
        return d != null && (i = this.b) >= 0 && i < d.buttons.size();
    }

    public final TL_iv.pageBlockButtonRow d() {
        mk0 mk0Var = this.a;
        if (mk0Var == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            return (TL_iv.pageBlockButtonRow) pageBlock;
        }
        return null;
    }
}
