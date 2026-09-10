package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class y extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Looper looper) {
        super(looper);
        this.c = b0Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12 = false;
        this.a = this.a && z10;
        if (this.b && z11) {
            z12 = true;
        }
        this.b = z12;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        r rVar;
        int i10;
        j1 j1Var;
        b0 b0Var = this.c;
        h1 h1Var = b0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        j1 c10 = b0Var.s.c(b0Var.t.Q0(), b0Var.t.O0(), b0Var.s.k);
        b0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        j1 H0 = h1Var.H0(c10);
        ki.f fVar = h1Var.b;
        e9.i0 r10 = fVar.r();
        for (int i11 = 0; i11 < r10.size(); i11++) {
            r rVar2 = (r) r10.get(i11);
            try {
                com.google.android.gms.common.api.internal.v w10 = fVar.w(rVar2);
                if (w10 != null) {
                    i10 = w10.e();
                } else if (!b0Var.h(rVar2)) {
                    break;
                } else {
                    i10 = 0;
                }
                j1 v = fVar.v(rVar2);
                if (v == null) {
                    fVar.u(rVar2);
                    b2.x0 a2 = w7.u.a(fVar.q(rVar2), b0Var.t.t());
                    try {
                        q qVar = rVar2.d;
                        e2.d.h(qVar);
                        if (v == null) {
                            rVar = rVar2;
                            j1Var = H0;
                        } else {
                            rVar = rVar2;
                            j1Var = v;
                        }
                        try {
                            qVar.g(i10, j1Var, a2, z10, z11);
                        } catch (DeadObjectException unused) {
                            h1Var.b.K(rVar);
                        } catch (RemoteException e) {
                            e = e;
                            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
                        }
                    } catch (DeadObjectException unused2) {
                        rVar = rVar2;
                    } catch (RemoteException e7) {
                        e = e7;
                        rVar = rVar2;
                    }
                }
            } catch (DeadObjectException unused3) {
                rVar = rVar2;
            } catch (RemoteException e10) {
                e = e10;
                rVar = rVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
