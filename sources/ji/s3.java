package ji;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class s3 {
    public final a a;
    public final int b;
    public final /* synthetic */ v3 c;

    public s3(v3 v3Var, a aVar, int i10) {
        this.c = v3Var;
        this.a = aVar;
        this.b = i10;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !k4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i10 = this.b;
        boolean z10 = i10 >= 0 && i10 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            v3 v3Var = this.c;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i10) : new TL_keyboard.PageButton();
            pageButton.text = i6.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            v3Var.Y2.N(false);
            g2 g2Var2 = v3Var.J3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            v3Var.h3.onContentChanged();
        }
    }

    public final void b() {
        int i10;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i10 = this.b) < 0 || i10 >= d.buttons.size()) {
            return;
        }
        v3 v3Var = this.c;
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        d.buttons.remove(i10);
        v3Var.Y2.N(false);
        g2 g2Var2 = v3Var.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        v3Var.h3.onContentChanged();
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
