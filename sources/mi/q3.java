package mi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class q3 {
    public final a a;
    public final int b;
    public final /* synthetic */ t3 c;

    public q3(t3 t3Var, a aVar, int i3) {
        this.c = t3Var;
        this.a = aVar;
        this.b = i3;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !j4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i3 = this.b;
        boolean z10 = i3 >= 0 && i3 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            t3 t3Var = this.c;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i3) : new TL_keyboard.PageButton();
            pageButton.text = d6.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            t3Var.g3.O(false);
            g2 g2Var2 = t3Var.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            t3Var.p3.onContentChanged();
        }
    }

    public final void b() {
        int i3;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i3 = this.b) < 0 || i3 >= d.buttons.size()) {
            return;
        }
        t3 t3Var = this.c;
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        d.buttons.remove(i3);
        t3Var.g3.O(false);
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.p3.onContentChanged();
    }

    public final boolean c() {
        int i3;
        TL_iv.pageBlockButtonRow d = d();
        return d != null && (i3 = this.b) >= 0 && i3 < d.buttons.size();
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
