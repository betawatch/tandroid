package ch;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.an;
import org.telegram.ui.n11;
import org.telegram.ui.x01;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x extends n11 {
    public final /* synthetic */ mi0 f2;
    public final /* synthetic */ e2 g2;
    public final /* synthetic */ b0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, e2 e2Var, Context context, int i7, boolean z10, e6 e6Var, mi0 mi0Var, e2 e2Var2) {
        super(e2Var, context, false, null, i7, z10, e6Var, 16);
        this.h2 = b0Var;
        this.f2 = mi0Var;
        this.g2 = e2Var2;
    }

    @Override // org.telegram.ui.n11
    public final void m() {
        this.h2.a.invalidate();
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        ai.k0 k0Var = this.h2.c;
        int i7 = 0;
        mi0 mi0Var = this.f2;
        e2 e2Var = this.g2;
        if (e2Var != null && !mi0Var.B0 && mi0Var.getWindowType() != 13 && !m10.i(e2Var.getCurrentAccount()).q()) {
            try {
                k0Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new cc(k0Var, null).r(document, org.telegram.messenger.g0.X2(hd.M0(2131743861, null)), hd.M0(2131747033, null), new w(this, i7)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            g5.g(m10.t0).e(document);
        }
        long longValue = l10 == null ? document.id : l10.longValue();
        p0 p0Var = new p0();
        p0Var.g = longValue;
        p0Var.h = longValue;
        mi0Var.l(view, p0Var, false);
        org.telegram.messenger.g0.v1(k0Var);
    }

    @Override // org.telegram.ui.n11
    public final void q() {
        b0 b0Var = this.h2;
        if (b0Var.v) {
            return;
        }
        b0Var.v = true;
        if (!b0Var.d) {
            b0Var.b.updateViewLayout(b0Var.c, b0Var.b(true));
        }
        e2 e2Var = this.g2;
        if (e2Var instanceof an) {
            ((an) e2Var).sa();
        }
        mi0 mi0Var = this.f2;
        if (mi0Var.getDelegate() != null) {
            mi0Var.getDelegate().B();
        }
    }

    @Override // org.telegram.ui.n11
    public final void r(x01 x01Var, p0 p0Var) {
        this.f2.l(x01Var, p0Var, false);
        org.telegram.messenger.g0.v1(this.h2.c);
    }

    @Override // org.telegram.ui.n11
    public final boolean u() {
        mi0 mi0Var = this.f2;
        if (mi0Var.getDelegate() != null) {
            return mi0Var.getDelegate().B();
        }
        return false;
    }
}
