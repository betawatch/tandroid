package ch;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.bn;
import org.telegram.ui.c11;
import org.telegram.ui.s11;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x extends s11 {
    public final /* synthetic */ xi0 f2;
    public final /* synthetic */ g2 g2;
    public final /* synthetic */ b0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, g2 g2Var, Context context, int i7, boolean z10, h6 h6Var, xi0 xi0Var, g2 g2Var2) {
        super(g2Var, context, false, null, i7, z10, h6Var, 16);
        this.h2 = b0Var;
        this.f2 = xi0Var;
        this.g2 = g2Var2;
    }

    @Override // org.telegram.ui.s11
    public final void m() {
        this.h2.a.invalidate();
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ai.l0 l0Var = this.h2.c;
        xi0 xi0Var = this.f2;
        g2 g2Var = this.g2;
        if (g2Var != null && !xi0Var.B0 && xi0Var.getWindowType() != 13 && !k10.i(g2Var.getCurrentAccount()).q()) {
            try {
                l0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new lc(l0Var, null).r(document, org.telegram.messenger.g0.W2(hd.N0(2131743616, null)), hd.N0(2131746839, null), new ca.r(this, 4)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            p5.g(k10.t0).e(document);
        }
        long longValue = l10 == null ? document.id : l10.longValue();
        p0 p0Var = new p0();
        p0Var.g = longValue;
        p0Var.h = longValue;
        xi0Var.l(view, p0Var, false);
        org.telegram.messenger.g0.v1(l0Var);
    }

    @Override // org.telegram.ui.s11
    public final void q() {
        b0 b0Var = this.h2;
        if (b0Var.v) {
            return;
        }
        b0Var.v = true;
        if (!b0Var.d) {
            b0Var.b.updateViewLayout(b0Var.c, b0Var.b(true));
        }
        g2 g2Var = this.g2;
        if (g2Var instanceof bn) {
            ((bn) g2Var).sa();
        }
        xi0 xi0Var = this.f2;
        if (xi0Var.getDelegate() != null) {
            xi0Var.getDelegate().q();
        }
    }

    @Override // org.telegram.ui.s11
    public final void r(c11 c11Var, p0 p0Var) {
        this.f2.l(c11Var, p0Var, false);
        org.telegram.messenger.g0.v1(this.h2.c);
    }

    @Override // org.telegram.ui.s11
    public final boolean u() {
        xi0 xi0Var = this.f2;
        if (xi0Var.getDelegate() != null) {
            return xi0Var.getDelegate().q();
        }
        return false;
    }
}
