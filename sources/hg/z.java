package hg;

import android.content.Context;
import android.view.View;
import fh.o1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.b61;
import org.telegram.ui.k51;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z extends b61 {
    public final /* synthetic */ uj0 Z1;
    public final /* synthetic */ o2 a2;
    public final /* synthetic */ e0 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, o2 o2Var, Context context, int i9, boolean z10, b6 b6Var, uj0 uj0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i9, z10, b6Var, 16);
        this.b2 = e0Var;
        this.Z1 = uj0Var;
        this.a2 = o2Var2;
    }

    @Override // org.telegram.ui.b61
    public final void m() {
        this.b2.a.invalidate();
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        fh.v vVar = this.b2.c;
        uj0 uj0Var = this.Z1;
        o2 o2Var = this.a2;
        if (o2Var != null && !uj0Var.w0 && uj0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
            try {
                vVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new oc(vVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new o1(this, 28)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            k5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l10 == null ? document.id : l10.longValue();
        r0 r0Var = new r0();
        r0Var.g = longValue;
        r0Var.h = longValue;
        uj0Var.l(view, r0Var, false);
        AndroidUtilities.hideKeyboard(vVar);
    }

    @Override // org.telegram.ui.b61
    public final void q() {
        e0 e0Var = this.b2;
        if (e0Var.v) {
            return;
        }
        e0Var.v = true;
        if (!e0Var.d) {
            e0Var.b.updateViewLayout(e0Var.c, e0Var.b(true));
        }
        o2 o2Var = this.a2;
        if (o2Var instanceof qn) {
            ((qn) o2Var).P9();
        }
        uj0 uj0Var = this.Z1;
        if (uj0Var.getDelegate() != null) {
            uj0Var.getDelegate().p();
        }
    }

    @Override // org.telegram.ui.b61
    public final void r(k51 k51Var, r0 r0Var) {
        this.Z1.l(k51Var, r0Var, false);
        AndroidUtilities.hideKeyboard(this.b2.c);
    }

    @Override // org.telegram.ui.b61
    public final boolean u() {
        uj0 uj0Var = this.Z1;
        if (uj0Var.getDelegate() != null) {
            return uj0Var.getDelegate().p();
        }
        return false;
    }
}
