// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i43 extends tx9 {
    public final /* synthetic */ t09 f2;
    public final /* synthetic */ d g2;
    public final /* synthetic */ m43 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i43(m43 m43Var, d dVar, Context context, int i, boolean z, wjb wjbVar, t09 t09Var, d dVar2) {
        super(dVar, context, false, null, i, z, wjbVar, 16);
        this.h2 = m43Var;
        this.f2 = t09Var;
        this.g2 = dVar2;
    }

    @Override // tx9
    public final void l() {
        this.h2.a.invalidate();
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        st stVar = this.h2.c;
        t09 t09Var = this.f2;
        d dVar = this.g2;
        if (dVar != null && !t09Var.B0 && t09Var.getWindowType() != 13 && !y6c.h(dVar.getCurrentAccount()).p()) {
            try {
                stVar.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            new u21(stVar, null).r(document, gl.T2(k96.M0(2131743622, null)), k96.M0(2131746842, null), new mk2(this, (byte) 17)).j();
            return;
        }
        if (l == null && document == null) {
            return;
        }
        if (document != null) {
            vl.g(y6c.t0).e(document);
        }
        long longValue = l == null ? document.id : l.longValue();
        h19 h19Var = new h19();
        h19Var.g = longValue;
        h19Var.h = longValue;
        t09Var.i(view, h19Var, false);
        gl.t1(stVar);
    }

    @Override // tx9
    public final void p() {
        m43 m43Var = this.h2;
        if (m43Var.v) {
            return;
        }
        m43Var.v = true;
        if (!m43Var.d) {
            m43Var.b.updateViewLayout(m43Var.c, m43Var.b(true));
        }
        d dVar = this.g2;
        if (dVar instanceof mu1) {
            ((mu1) dVar).S9();
        }
        t09 t09Var = this.f2;
        if (t09Var.getDelegate() != null) {
            t09Var.getDelegate().u();
        }
    }

    @Override // tx9
    public final void q(dx9 dx9Var, h19 h19Var) {
        this.f2.i(dx9Var, h19Var, false);
        gl.t1(this.h2.c);
    }

    @Override // tx9
    public final boolean t() {
        t09 t09Var = this.f2;
        if (t09Var.getDelegate() != null) {
            return t09Var.getDelegate().u();
        }
        return false;
    }
}
