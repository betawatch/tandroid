package dh;

import android.content.Context;
import android.view.View;
import ci.d1;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.li0;
import org.telegram.ui.g11;
import org.telegram.ui.q01;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends g11 {
    public final /* synthetic */ li0 f2;
    public final /* synthetic */ d2 g2;
    public final /* synthetic */ a0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a0 a0Var, d2 d2Var, Context context, int i3, boolean z10, e6 e6Var, li0 li0Var, d2 d2Var2) {
        super(d2Var, context, false, null, i3, z10, e6Var, 16);
        this.h2 = a0Var;
        this.f2 = li0Var;
        this.g2 = d2Var2;
    }

    @Override // org.telegram.ui.g11
    public final void m() {
        this.h2.a.invalidate();
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ai.c0 c0Var = this.h2.c;
        li0 li0Var = this.f2;
        d2 d2Var = this.g2;
        if (d2Var != null && !li0Var.B0 && li0Var.getWindowType() != 13 && !h10.i(d2Var.getCurrentAccount()).q()) {
            try {
                c0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new fc(c0Var, null).r(document, org.telegram.messenger.g0.X2(bd.M0(2131743871, null)), bd.M0(2131747041, null), new d1(this, 17)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            g5.g(h10.t0).e(document);
        }
        long longValue = l10 == null ? document.id : l10.longValue();
        n0 n0Var = new n0();
        n0Var.g = longValue;
        n0Var.h = longValue;
        li0Var.l(view, n0Var, false);
        org.telegram.messenger.g0.v1(c0Var);
    }

    @Override // org.telegram.ui.g11
    public final void q() {
        a0 a0Var = this.h2;
        if (a0Var.v) {
            return;
        }
        a0Var.v = true;
        if (!a0Var.d) {
            a0Var.b.updateViewLayout(a0Var.c, a0Var.b(true));
        }
        d2 d2Var = this.g2;
        if (d2Var instanceof wm) {
            ((wm) d2Var).pa();
        }
        li0 li0Var = this.f2;
        if (li0Var.getDelegate() != null) {
            li0Var.getDelegate().v();
        }
    }

    @Override // org.telegram.ui.g11
    public final void r(q01 q01Var, n0 n0Var) {
        this.f2.l(q01Var, n0Var, false);
        org.telegram.messenger.g0.v1(this.h2.c);
    }

    @Override // org.telegram.ui.g11
    public final boolean u() {
        li0 li0Var = this.f2;
        if (li0Var.getDelegate() != null) {
            return li0Var.getDelegate().v();
        }
        return false;
    }
}
