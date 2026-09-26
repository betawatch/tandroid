package ii;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class u3 {
    public final a a;
    public final int b;
    public final /* synthetic */ x3 c;

    public u3(x3 x3Var, a aVar, int i10) {
        this.c = x3Var;
        this.a = aVar;
        this.b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !l4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i10 = this.b;
        boolean z10 = i10 >= 0 && i10 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            x3 x3Var = this.c;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i10) : new TL_keyboard.PageButton();
            pageButton.text = g6.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            x3Var.Y2.N(false);
            i2 i2Var2 = x3Var.J3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            x3Var.h3.onContentChanged();
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i10 = this.b) < 0 || i10 >= d.buttons.size()) {
            return;
        }
        x3 x3Var = this.c;
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        d.buttons.remove(i10);
        x3Var.Y2.N(false);
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.h3.onContentChanged();
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
