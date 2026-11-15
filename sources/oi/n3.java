package oi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class n3 {
    public final a a;
    public final int b;
    public final /* synthetic */ q3 c;

    public n3(q3 q3Var, a aVar, int i7) {
        this.c = q3Var;
        this.a = aVar;
        this.b = i7;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !f4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i7 = this.b;
        boolean z10 = i7 >= 0 && i7 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            q3 q3Var = this.c;
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i7) : new TL_keyboard.PageButton();
            pageButton.text = a6.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            q3Var.g3.O(false);
            d2 d2Var2 = q3Var.R3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            q3Var.p3.onContentChanged();
        }
    }

    public final void b() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i7 = this.b) < 0 || i7 >= d.buttons.size()) {
            return;
        }
        q3 q3Var = this.c;
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.d();
        }
        d.buttons.remove(i7);
        q3Var.g3.O(false);
        d2 d2Var2 = q3Var.R3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        q3Var.p3.onContentChanged();
    }

    public final boolean c() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        return d != null && (i7 = this.b) >= 0 && i7 < d.buttons.size();
    }

    public final TL_iv.pageBlockButtonRow d() {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            return (TL_iv.pageBlockButtonRow) pageBlock;
        }
        return null;
    }
}
