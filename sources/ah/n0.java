package ah;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.a71;
import org.telegram.ui.fo;
import org.telegram.ui.r71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n0 extends r71 {
    public final /* synthetic */ gl0 d2;
    public final /* synthetic */ m2 e2;
    public final /* synthetic */ t0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, m2 m2Var, Context context, int i10, boolean z10, c6 c6Var, gl0 gl0Var, m2 m2Var2) {
        super(m2Var, context, false, null, i10, z10, c6Var, 16);
        this.f2 = t0Var;
        this.d2 = gl0Var;
        this.e2 = m2Var2;
    }

    @Override // org.telegram.ui.r71
    public final void m() {
        this.f2.a.invalidate();
    }

    @Override // org.telegram.ui.r71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        v vVar = this.f2.c;
        gl0 gl0Var = this.d2;
        m2 m2Var = this.e2;
        if (m2Var != null && !gl0Var.A0 && gl0Var.getWindowType() != 13 && !UserConfig.getInstance(m2Var.getCurrentAccount()).isPremium()) {
            try {
                vVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new zc(vVar, null).q(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 5)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            s5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        i1 i1Var = new i1();
        i1Var.g = longValue;
        i1Var.h = longValue;
        gl0Var.l(view, i1Var, false);
        AndroidUtilities.hideKeyboard(vVar);
    }

    @Override // org.telegram.ui.r71
    public final void q() {
        t0 t0Var = this.f2;
        if (t0Var.v) {
            return;
        }
        t0Var.v = true;
        if (!t0Var.d) {
            t0Var.b.updateViewLayout(t0Var.c, t0Var.b(true));
        }
        m2 m2Var = this.e2;
        if (m2Var instanceof fo) {
            ((fo) m2Var).U9();
        }
        gl0 gl0Var = this.d2;
        if (gl0Var.getDelegate() != null) {
            gl0Var.getDelegate().n();
        }
    }

    @Override // org.telegram.ui.r71
    public final void r(a71 a71Var, i1 i1Var) {
        this.d2.l(a71Var, i1Var, false);
        AndroidUtilities.hideKeyboard(this.f2.c);
    }

    @Override // org.telegram.ui.r71
    public final boolean u() {
        gl0 gl0Var = this.d2;
        if (gl0Var.getDelegate() != null) {
            return gl0Var.getDelegate().n();
        }
        return false;
    }
}
