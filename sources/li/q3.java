package li;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class q3 {
    public final a a;
    public final int b;
    public final /* synthetic */ t3 c;

    public q3(t3 t3Var, a aVar, int i7) {
        this.c = t3Var;
        this.a = aVar;
        this.b = i7;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !i4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i7 = this.b;
        boolean z9 = i7 >= 0 && i7 < d.buttons.size();
        if (z9 || d.buttons.size() < 8) {
            t3 t3Var = this.c;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            TL_keyboard.PageButton pageButton = z9 ? d.buttons.get(i7) : new TL_keyboard.PageButton();
            pageButton.text = c6.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z9) {
                d.buttons.add(pageButton);
            }
            t3Var.f3.O(false);
            f2 f2Var2 = t3Var.Q3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            t3Var.o3.onContentChanged();
        }
    }

    public final void b() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i7 = this.b) < 0 || i7 >= d.buttons.size()) {
            return;
        }
        t3 t3Var = this.c;
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        d.buttons.remove(i7);
        t3Var.f3.O(false);
        f2 f2Var2 = t3Var.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3Var.o3.onContentChanged();
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
