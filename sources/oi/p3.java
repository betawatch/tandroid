package oi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class p3 {
    public final a a;
    public final int b;
    public final /* synthetic */ s3 c;

    public p3(s3 s3Var, a aVar, int i7) {
        this.c = s3Var;
        this.a = aVar;
        this.b = i7;
    }

    public final void a(String str, TL_keyboard.InlineButtonType inlineButtonType) {
        TL_iv.pageBlockButtonRow d;
        if (TextUtils.isEmpty(str) || !h4.c(inlineButtonType) || (d = d()) == null) {
            return;
        }
        int i7 = this.b;
        boolean z10 = i7 >= 0 && i7 < d.buttons.size();
        if (z10 || d.buttons.size() < 8) {
            s3 s3Var = this.c;
            e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.d();
            }
            TL_keyboard.PageButton pageButton = z10 ? d.buttons.get(i7) : new TL_keyboard.PageButton();
            pageButton.text = b6.f(str);
            pageButton.type = inlineButtonType;
            if (pageButton.style == null) {
                pageButton.style = new TL_keyboard.RichButtonStyle();
            }
            if (!z10) {
                d.buttons.add(pageButton);
            }
            s3Var.g3.O(false);
            e2 e2Var2 = s3Var.R3;
            if (e2Var2 != null) {
                e2Var2.h();
            }
            s3Var.p3.onContentChanged();
        }
    }

    public final void b() {
        int i7;
        TL_iv.pageBlockButtonRow d = d();
        if (d == null || (i7 = this.b) < 0 || i7 >= d.buttons.size()) {
            return;
        }
        s3 s3Var = this.c;
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.d();
        }
        d.buttons.remove(i7);
        s3Var.g3.O(false);
        e2 e2Var2 = s3Var.R3;
        if (e2Var2 != null) {
            e2Var2.h();
        }
        s3Var.p3.onContentChanged();
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
