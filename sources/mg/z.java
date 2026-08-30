package mg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.q61;
import org.telegram.ui.xn;
import org.telegram.ui.y51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z extends q61 {
    public final /* synthetic */ pk0 a2;
    public final /* synthetic */ p2 b2;
    public final /* synthetic */ d0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, p2 p2Var, Context context, int i10, boolean z4, f6 f6Var, pk0 pk0Var, p2 p2Var2) {
        super(p2Var, context, false, null, i10, z4, f6Var, 16);
        this.c2 = d0Var;
        this.a2 = pk0Var;
        this.b2 = p2Var2;
    }

    @Override // org.telegram.ui.q61
    public final void m() {
        this.c2.a.invalidate();
    }

    @Override // org.telegram.ui.q61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ah.d dVar = this.c2.c;
        pk0 pk0Var = this.a2;
        p2 p2Var = this.b2;
        if (p2Var != null && !pk0Var.x0 && pk0Var.getWindowType() != 13 && !UserConfig.getInstance(p2Var.getCurrentAccount()).isPremium()) {
            try {
                dVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new qc(dVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new lh.b(this, 20)).j();
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
        pk0Var.l(view, q0Var, false);
        AndroidUtilities.hideKeyboard(dVar);
    }

    @Override // org.telegram.ui.q61
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
        pk0 pk0Var = this.a2;
        if (pk0Var.getDelegate() != null) {
            pk0Var.getDelegate().j();
        }
    }

    @Override // org.telegram.ui.q61
    public final void r(y51 y51Var, q0 q0Var) {
        this.a2.l(y51Var, q0Var, false);
        AndroidUtilities.hideKeyboard(this.c2.c);
    }

    @Override // org.telegram.ui.q61
    public final boolean u() {
        pk0 pk0Var = this.a2;
        if (pk0Var.getDelegate() != null) {
            return pk0Var.getDelegate().j();
        }
        return false;
    }
}
