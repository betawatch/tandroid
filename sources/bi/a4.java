package bi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class a4 {
    public final a a;
    public final int b;
    public final /* synthetic */ d4 c;

    public a4(d4 d4Var, a aVar, int i10) {
        this.c = d4Var;
        this.a = aVar;
        this.b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !u4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i10 = this.b;
        boolean z10 = i10 >= 0 && i10 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            d4 d4Var = this.c;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i10) : new TL_keyboard.PageButton();
            pageButton.text = s6.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            d4Var.f3.O(false);
            o2 o2Var2 = d4Var.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            d4Var.o3.onContentChanged();
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i10 = this.b) < 0 || i10 >= d.buttons.size()) {
            return;
        }
        d4 d4Var = this.c;
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        d.buttons.remove(i10);
        d4Var.f3.O(false);
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        d4Var.o3.onContentChanged();
    }

    public final boolean c() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        return d != null && (i10 = this.b) >= 0 && i10 < d.buttons.size();
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
