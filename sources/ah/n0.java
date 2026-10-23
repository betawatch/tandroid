package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.g51;
import org.telegram.ui.qn;
import org.telegram.ui.x51;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class n0 extends x51 {
    public final /* synthetic */ dl0 d2;
    public final /* synthetic */ n2 e2;
    public final /* synthetic */ t0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, n2 n2Var, Context context, int i10, boolean z10, d6 d6Var, dl0 dl0Var, n2 n2Var2) {
        super(n2Var, context, false, null, i10, z10, d6Var, 16);
        this.f2 = t0Var;
        this.d2 = dl0Var;
        this.e2 = n2Var2;
    }

    @Override // org.telegram.ui.x51
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.x51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        v vVar = this.f2.c;
        dl0 dl0Var = this.d2;
        n2 n2Var = this.e2;
        if (n2Var != null && !dl0Var.A0 && dl0Var.getWindowType() != 13 && !UserConfig.getInstance(n2Var.getCurrentAccount()).isPremium()) {
            try {
                vVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new xc(vVar, null).r(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 5)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            r5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        i1 i1Var = new i1();
        i1Var.g = longValue;
        i1Var.h = longValue;
        dl0Var.l(view, i1Var, false);
        AndroidUtilities.hideKeyboard(vVar);
    }

    @Override // org.telegram.ui.x51
    public final void q() {
        t0 t0Var = this.f2;
        if (t0Var.v) {
            return;
        }
        t0Var.v = true;
        if (!t0Var.d) {
            t0Var.b.updateViewLayout(t0Var.c, t0Var.b(true));
        }
        n2 n2Var = this.e2;
        if (n2Var instanceof qn) {
            ((qn) n2Var).U9();
        }
        dl0 dl0Var = this.d2;
        if (dl0Var.getDelegate() != null) {
            dl0Var.getDelegate().m();
        }
    }

    @Override // org.telegram.ui.x51
    public final void r(g51 g51Var, i1 i1Var) {
        this.d2.l(g51Var, i1Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.x51
    public final boolean u() {
        dl0 dl0Var = this.d2;
        if (dl0Var.getDelegate() != null) {
            return dl0Var.getDelegate().m();
        }
        return false;
    }
}
