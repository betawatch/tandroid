// default package

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d1d implements p1d {
    public final r1d a;

    public d1d(r1d r1dVar) {
        this.a = r1dVar;
    }

    @Override // p1d
    public final boolean S0() {
        r1d r1dVar = this.a;
        r1dVar.o.getClass();
        r1dVar.h();
        return true;
    }

    @Override // p1d
    public final ig0 e(ig0 ig0Var) {
        r1d r1dVar = this.a;
        try {
            m1d m1dVar = r1dVar.o;
            lv6 lv6Var = m1dVar.N;
            ((Set) lv6Var.b).add(ig0Var);
            ig0Var.g.set((k2d) lv6Var.c);
            wn wnVar = ig0Var.o;
            xx4 xx4Var = (xx4) m1dVar.F.get(wnVar);
            fre.i(xx4Var, "Appropriate Api was not requested.");
            if (!xx4Var.q() && r1dVar.i.containsKey(wnVar)) {
                ig0Var.o(new Status(17, null, null, null));
                return ig0Var;
            }
            try {
                ig0Var.n(xx4Var);
            } catch (DeadObjectException e) {
                ig0Var.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                ig0Var.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
            return ig0Var;
        } catch (DeadObjectException unused) {
            c1d c1dVar = new c1d(this, this);
            k1d k1dVar = r1dVar.e;
            k1dVar.sendMessage(k1dVar.obtainMessage(1, c1dVar));
            return ig0Var;
        }
    }

    @Override // p1d
    public final void t0(int i) {
        r1d r1dVar = this.a;
        r1dVar.h();
        r1dVar.p.n0(i);
    }

    @Override // p1d
    public final void a() {
    }

    @Override // p1d
    public final void g1() {
    }

    @Override // p1d
    public final void i(Bundle bundle) {
    }

    @Override // p1d
    public final void a1(ds2 ds2Var, yn ynVar, boolean z) {
    }
}
