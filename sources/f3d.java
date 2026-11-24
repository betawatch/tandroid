// default package

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f3d implements r3d {
    public final t3d a;

    public f3d(t3d t3dVar) {
        this.a = t3dVar;
    }

    @Override // r3d
    public final void I0(int i) {
        t3d t3dVar = this.a;
        t3dVar.h();
        t3dVar.p.C0(i);
    }

    @Override // r3d
    public final jh0 e(jh0 jh0Var) {
        t3d t3dVar = this.a;
        try {
            o3d o3dVar = t3dVar.o;
            lx6 lx6Var = o3dVar.N;
            ((Set) lx6Var.b).add(jh0Var);
            jh0Var.g.set((m4d) lx6Var.c);
            xo xoVar = jh0Var.o;
            zz4 zz4Var = (zz4) o3dVar.F.get(xoVar);
            ite.i(zz4Var, "Appropriate Api was not requested.");
            if (!zz4Var.q() && t3dVar.i.containsKey(xoVar)) {
                jh0Var.o(new Status(17, null, null, null));
                return jh0Var;
            }
            try {
                jh0Var.n(zz4Var);
            } catch (DeadObjectException e) {
                jh0Var.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                jh0Var.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
            return jh0Var;
        } catch (DeadObjectException unused) {
            e3d e3dVar = new e3d(this, this);
            m3d m3dVar = t3dVar.e;
            m3dVar.sendMessage(m3dVar.obtainMessage(1, e3dVar));
            return jh0Var;
        }
    }

    @Override // r3d
    public final boolean p1() {
        t3d t3dVar = this.a;
        t3dVar.o.getClass();
        t3dVar.h();
        return true;
    }

    @Override // r3d
    public final void K1() {
    }

    @Override // r3d
    public final void a() {
    }

    @Override // r3d
    public final void J(Bundle bundle) {
    }

    @Override // r3d
    public final void A1(ot2 ot2Var, zo zoVar, boolean z) {
    }
}
