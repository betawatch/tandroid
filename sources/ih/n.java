package ih;

import android.view.ViewGroup;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n extends wf.b {
    public final boolean d;
    public final /* synthetic */ vw e;

    public n(vw vwVar, boolean z10) {
        this.e = vwVar;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        boolean z10 = this.d;
        vw vwVar = this.e;
        return (z10 ? vwVar.y : vwVar.x).size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        q qVar = (q) q1Var.a;
        qVar.b = i9;
        boolean z10 = this.d;
        vw vwVar = this.e;
        if (z10) {
            qVar.setDialogId(((o) vwVar.y.get(i9)).c);
        } else {
            qVar.setDialogId(((o) vwVar.x.get(i9)).c);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        q qVar = new q(this.e, viewGroup.getContext());
        boolean z10 = this.d;
        qVar.J = z10;
        if (z10) {
            qVar.d(1.0f, 1.0f, 0.0f, false);
        }
        return new ik0(qVar);
    }
}
