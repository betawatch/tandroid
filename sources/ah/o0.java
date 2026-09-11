package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
import org.telegram.ui.j71;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o0 extends j71 {
    public final /* synthetic */ fk0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ u0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u0 u0Var, n2 n2Var, Context context, int i10, boolean z10, f6 f6Var, fk0 fk0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, f6Var, 16);
        this.f2 = u0Var;
        this.d2 = fk0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.j71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        w wVar = this.f2.c;
        fk0 fk0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !fk0Var.A0 && fk0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                wVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new yc(wVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.c(this, 4)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            q5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        j1 j1Var = new j1();
        j1Var.g = longValue;
        j1Var.h = longValue;
        fk0Var.l(view, j1Var, false);
        AndroidUtilities.hideKeyboard(wVar);
    }

    @Override // org.telegram.ui.j71
    public final void q() {
        u0 u0Var = this.f2;
        if (u0Var.v) {
            return;
        }
        u0Var.v = true;
        if (!u0Var.d) {
            u0Var.b.updateViewLayout(u0Var.c, u0Var.b(true));
        }
        n2 n2Var = this.e2;
        if (n2Var instanceof co) {
            ((co) n2Var).P9();
        }
        fk0 fk0Var = this.d2;
        if (fk0Var.getDelegate() != null) {
            fk0Var.getDelegate().t();
        }
    }

    @Override // org.telegram.ui.j71
    public final void r(s61 s61Var, j1 j1Var) {
        this.d2.l(s61Var, j1Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.j71
    public final boolean u() {
        fk0 fk0Var = this.d2;
        if (fk0Var.getDelegate() != null) {
            return fk0Var.getDelegate().t();
        }
        return false;
    }
}
