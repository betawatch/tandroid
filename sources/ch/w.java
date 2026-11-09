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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.c11;
import org.telegram.ui.cn;
import org.telegram.ui.s11;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w extends s11 {
    public final /* synthetic */ ji0 e2;
    public final /* synthetic */ f2 f2;
    public final /* synthetic */ b0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, f2 f2Var, Context context, int i7, boolean z9, g6 g6Var, ji0 ji0Var, f2 f2Var2) {
        super(f2Var, context, false, null, i7, z9, g6Var, 16);
        this.g2 = b0Var;
        this.e2 = ji0Var;
        this.f2 = f2Var2;
    }

    @Override // org.telegram.ui.s11
    public final void m() {
        this.g2.a.invalidate();
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        x5 x5Var = this.g2.c;
        ji0 ji0Var = this.e2;
        f2 f2Var = this.f2;
        if (f2Var != null && !ji0Var.A0 && ji0Var.getWindowType() != 13 && !p10.i(f2Var.getCurrentAccount()).q()) {
            try {
                x5Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new hc(x5Var, null).r(document, org.telegram.messenger.g0.X2(id.M0(2131743861, null)), id.M0(2131747033, null), new ab(this, 10)).j();
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
        ji0Var.l(view, o0Var, false);
        org.telegram.messenger.g0.v1(x5Var);
    }

    @Override // org.telegram.ui.s11
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
        if (f2Var instanceof cn) {
            ((cn) f2Var).ra();
        }
        ji0 ji0Var = this.e2;
        if (ji0Var.getDelegate() != null) {
            ji0Var.getDelegate().E();
        }
    }

    @Override // org.telegram.ui.s11
    public final void r(c11 c11Var, o0 o0Var) {
        this.e2.l(c11Var, o0Var, false);
        org.telegram.messenger.g0.v1(this.g2.c);
    }

    @Override // org.telegram.ui.s11
    public final boolean u() {
        ji0 ji0Var = this.e2;
        if (ji0Var.getDelegate() != null) {
            return ji0Var.getDelegate().E();
        }
        return false;
    }
}
