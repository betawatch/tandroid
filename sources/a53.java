// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a53 extends n1a {
    public final /* synthetic */ i49 f2;
    public final /* synthetic */ e g2;
    public final /* synthetic */ e53 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a53(e53 e53Var, e eVar, Context context, int i, boolean z, vnb vnbVar, i49 i49Var, e eVar2) {
        super(eVar, context, false, null, i, z, vnbVar, 16);
        this.h2 = e53Var;
        this.f2 = i49Var;
        this.g2 = eVar2;
    }

    @Override // n1a
    public final void l() {
        this.h2.a.invalidate();
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        tt ttVar = this.h2.c;
        i49 i49Var = this.f2;
        e eVar = this.g2;
        if (eVar != null && !i49Var.B0 && i49Var.getWindowType() != 13 && !yac.h(eVar.getCurrentAccount()).p()) {
            try {
                ttVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new d31(ttVar, null).r(document, hl.S2(ob6.M0(2131743516, null)), ob6.M0(2131746762, null), new vd2(this, (byte) 23)).j();
            return;
        }
        if (l == null && document == null) {
            return;
        }
        if (document != null) {
            wl.g(yac.t0).e(document);
        }
        long longValue = l == null ? document.id : l.longValue();
        w49 w49Var = new w49();
        w49Var.g = longValue;
        w49Var.h = longValue;
        i49Var.i(view, w49Var, false);
        hl.t1(ttVar);
    }

    @Override // n1a
    public final void p() {
        e53 e53Var = this.h2;
        if (e53Var.v) {
            return;
        }
        e53Var.v = true;
        if (!e53Var.d) {
            e53Var.b.updateViewLayout(e53Var.c, e53Var.b(true));
        }
        e eVar = this.g2;
        if (eVar instanceof zu1) {
            ((zu1) eVar).fa();
        }
        i49 i49Var = this.f2;
        if (i49Var.getDelegate() != null) {
            i49Var.getDelegate().k();
        }
    }

    @Override // n1a
    public final void q(w0a w0aVar, w49 w49Var) {
        this.f2.i(w0aVar, w49Var, false);
        hl.t1(this.h2.c);
    }

    @Override // n1a
    public final boolean t() {
        i49 i49Var = this.f2;
        if (i49Var.getDelegate() != null) {
            return i49Var.getDelegate().k();
        }
        return false;
    }
}
