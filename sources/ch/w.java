package ch;

import android.content.Context;
import android.view.View;
import bi.ab;
import bi.x5;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.a11;
import org.telegram.ui.an;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class w extends q11 {
    public final /* synthetic */ ii0 e2;
    public final /* synthetic */ f2 f2;
    public final /* synthetic */ b0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, f2 f2Var, Context context, int i7, boolean z9, f6 f6Var, ii0 ii0Var, f2 f2Var2) {
        super(f2Var, context, false, null, i7, z9, f6Var, 16);
        this.g2 = b0Var;
        this.e2 = ii0Var;
        this.f2 = f2Var2;
    }

    @Override // org.telegram.ui.q11
    public final void m() {
        this.g2.a.invalidate();
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        x5 x5Var = this.g2.c;
        ii0 ii0Var = this.e2;
        f2 f2Var = this.f2;
        if (f2Var != null && !ii0Var.A0 && ii0Var.getWindowType() != 13 && !p10.i(f2Var.getCurrentAccount()).q()) {
            try {
                x5Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new hc(x5Var, null).r(document, org.telegram.messenger.g0.X2(id.M0(2131743864, null)), id.M0(2131747034, null), new ab(this, 10)).j();
            return;
        }
        if (l10 == null && document == null) {
            return;
        }
        if (document != null) {
            i5.g(p10.s0).e(document);
        }
        long longValue = l10 == null ? document.id : l10.longValue();
        o0 o0Var = new o0();
        o0Var.g = longValue;
        o0Var.h = longValue;
        ii0Var.l(view, o0Var, false);
        org.telegram.messenger.g0.v1(x5Var);
    }

    @Override // org.telegram.ui.q11
    public final void q() {
        b0 b0Var = this.g2;
        if (b0Var.v) {
            return;
        }
        b0Var.v = true;
        if (!b0Var.d) {
            b0Var.b.updateViewLayout(b0Var.c, b0Var.b(true));
        }
        f2 f2Var = this.f2;
        if (f2Var instanceof an) {
            ((an) f2Var).pa();
        }
        ii0 ii0Var = this.e2;
        if (ii0Var.getDelegate() != null) {
            ii0Var.getDelegate().E();
        }
    }

    @Override // org.telegram.ui.q11
    public final void r(a11 a11Var, o0 o0Var) {
        this.e2.l(a11Var, o0Var, false);
        org.telegram.messenger.g0.v1(this.g2.c);
    }

    @Override // org.telegram.ui.q11
    public final boolean u() {
        ii0 ii0Var = this.e2;
        if (ii0Var.getDelegate() != null) {
            return ii0Var.getDelegate().E();
        }
        return false;
    }
}
