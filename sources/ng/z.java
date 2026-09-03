package ng;

import android.content.Context;
import android.view.View;
import lh.c3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.f61;
import org.telegram.ui.w61;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z extends w61 {
    public final /* synthetic */ qk0 a2;
    public final /* synthetic */ p2 b2;
    public final /* synthetic */ d0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, p2 p2Var, Context context, int i10, boolean z4, g6 g6Var, qk0 qk0Var, p2 p2Var2) {
        super(p2Var, context, false, null, i10, z4, g6Var, 16);
        this.c2 = d0Var;
        this.a2 = qk0Var;
        this.b2 = p2Var2;
    }

    @Override // org.telegram.ui.w61
    public final void m() {
        this.c2.a.invalidate();
    }

    @Override // org.telegram.ui.w61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ag.l lVar = this.c2.c;
        qk0 qk0Var = this.a2;
        p2 p2Var = this.b2;
        if (p2Var != null && !qk0Var.x0 && qk0Var.getWindowType() != 13 && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            try {
                lVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new qc(lVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new c3(this, 21)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            l5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l10 == null ? document.id : l10.longValue();
        q0 q0Var = new q0();
        q0Var.g = longValue;
        q0Var.h = longValue;
        qk0Var.l(view, q0Var, false);
        AndroidUtilities.hideKeyboard(lVar);
    }

    @Override // org.telegram.ui.w61
    public final void q() {
        d0 d0Var = this.c2;
        if (d0Var.v) {
            return;
        }
        d0Var.v = true;
        if (!d0Var.d) {
            d0Var.b.updateViewLayout(d0Var.c, d0Var.b(true));
        }
        p2 p2Var = this.b2;
        if (p2Var instanceof xn) {
            ((xn) p2Var).P9();
        }
        qk0 qk0Var = this.a2;
        if (qk0Var.getDelegate() != null) {
            qk0Var.getDelegate().h();
        }
    }

    @Override // org.telegram.ui.w61
    public final void r(f61 f61Var, q0 q0Var) {
        this.a2.l(f61Var, q0Var, false);
        AndroidUtilities.hideKeyboard(this.c2.c);
    }

    @Override // org.telegram.ui.w61
    public final boolean u() {
        qk0 qk0Var = this.a2;
        if (qk0Var.getDelegate() != null) {
            return qk0Var.getDelegate().h();
        }
        return false;
    }
}
