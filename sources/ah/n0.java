package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.b61;
import org.telegram.ui.k51;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n0 extends b61 {
    public final /* synthetic */ gl0 e2;
    public final /* synthetic */ o2 f2;
    public final /* synthetic */ t0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, o2 o2Var, Context context, int i10, boolean z10, g6 g6Var, gl0 gl0Var, o2 o2Var2) {
        super(o2Var, context, false, null, i10, z10, g6Var, 16);
        this.g2 = t0Var;
        this.e2 = gl0Var;
        this.f2 = o2Var2;
    }

    @Override // org.telegram.ui.b61
    public final void m() {
        this.g2.a.invalidate();
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        v vVar = this.g2.c;
        gl0 gl0Var = this.e2;
        o2 o2Var = this.f2;
        if (o2Var != null && !gl0Var.A0 && gl0Var.getWindowType() != 13 && !UserConfig.getInstance(o2Var.getCurrentAccount()).isPremium()) {
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
        gl0Var.l(view, i1Var, false);
        AndroidUtilities.hideKeyboard(vVar);
    }

    @Override // org.telegram.ui.b61
    public final void q() {
        t0 t0Var = this.g2;
        if (t0Var.v) {
            return;
        }
        t0Var.v = true;
        if (!t0Var.d) {
            t0Var.b.updateViewLayout(t0Var.c, t0Var.b(true));
        }
        o2 o2Var = this.f2;
        if (o2Var instanceof sn) {
            ((sn) o2Var).U9();
        }
        gl0 gl0Var = this.e2;
        if (gl0Var.getDelegate() != null) {
            gl0Var.getDelegate().l();
        }
    }

    @Override // org.telegram.ui.b61
    public final void r(k51 k51Var, i1 i1Var) {
        this.e2.l(k51Var, i1Var, false);
        AndroidUtilities.hideKeyboard(this.g2.c);
    }

    @Override // org.telegram.ui.b61
    public final boolean u() {
        gl0 gl0Var = this.e2;
        if (gl0Var.getDelegate() != null) {
            return gl0Var.getDelegate().l();
        }
        return false;
    }
}
