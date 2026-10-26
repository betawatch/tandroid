package bh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.c61;
import org.telegram.ui.l51;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d0 extends c61 {
    public final /* synthetic */ fl0 e2;
    public final /* synthetic */ r2 f2;
    public final /* synthetic */ i0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(i0 i0Var, r2 r2Var, Context context, int i10, boolean z10, u6 u6Var, fl0 fl0Var, r2 r2Var2) {
        super(r2Var, context, false, null, i10, z10, u6Var, 16);
        this.g2 = i0Var;
        this.e2 = fl0Var;
        this.f2 = r2Var2;
    }

    @Override // org.telegram.ui.c61
    public final void m() {
        this.g2.a.invalidate();
    }

    @Override // org.telegram.ui.c61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        p pVar = this.g2.c;
        fl0 fl0Var = this.e2;
        r2 r2Var = this.f2;
        if (r2Var != null && !fl0Var.A0 && fl0Var.getWindowType() != 13 && !UserConfig.getInstance(r2Var.getCurrentAccount()).isPremium()) {
            try {
                pVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new wc(pVar, null).r(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiReaction)), LocaleController.getString(R.string.PremiumMore), new a3.d(this, 15)).j();
            return;
        }
        if (l4 == null && document == null) {
            return;
        }
        if (document != null) {
            t5.h(UserConfig.selectedAccount).e(document);
        }
        long longValue = l4 == null ? document.id : l4.longValue();
        x0 x0Var = new x0();
        x0Var.g = longValue;
        x0Var.h = longValue;
        fl0Var.l(view, x0Var, false);
        AndroidUtilities.hideKeyboard(pVar);
    }

    @Override // org.telegram.ui.c61
    public final void q() {
        i0 i0Var = this.g2;
        if (i0Var.v) {
            return;
        }
        i0Var.v = true;
        if (!i0Var.d) {
            i0Var.b.updateViewLayout(i0Var.c, i0Var.b(true));
        }
        r2 r2Var = this.f2;
        if (r2Var instanceof un) {
            ((un) r2Var).Z9();
        }
        fl0 fl0Var = this.e2;
        if (fl0Var.getDelegate() != null) {
            fl0Var.getDelegate().i();
        }
    }

    @Override // org.telegram.ui.c61
    public final void r(l51 l51Var, x0 x0Var) {
        this.e2.l(l51Var, x0Var, false);
        AndroidUtilities.hideKeyboard(this.g2.c);
    }

    @Override // org.telegram.ui.c61
    public final boolean u() {
        fl0 fl0Var = this.e2;
        if (fl0Var.getDelegate() != null) {
            return fl0Var.getDelegate().i();
        }
        return false;
    }
}
