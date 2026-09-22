package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class x extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, Looper looper) {
        super(looper);
        this.c = a0Var;
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
        i1 i1Var;
        a0 a0Var = this.c;
        g1 g1Var = a0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        i1 c10 = a0Var.s.c(a0Var.t.Q0(), a0Var.t.O0(), a0Var.s.k);
        a0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        i1 H0 = g1Var.H0(c10);
        ni.f fVar = g1Var.b;
        e9.i0 s10 = fVar.s();
        for (int i11 = 0; i11 < s10.size(); i11++) {
            r rVar2 = (r) s10.get(i11);
            try {
                com.google.android.gms.common.api.internal.v x10 = fVar.x(rVar2);
                if (x10 != null) {
                    i10 = x10.e();
                } else if (!a0Var.h(rVar2)) {
                    break;
                } else {
                    i10 = 0;
                }
                i1 w10 = fVar.w(rVar2);
                if (w10 == null) {
                    fVar.v(rVar2);
                    b2.x0 a2 = w7.t.a(fVar.r(rVar2), a0Var.t.t());
                    try {
                        q qVar = rVar2.d;
                        e2.d.h(qVar);
                        if (w10 == null) {
                            rVar = rVar2;
                            i1Var = H0;
                        } else {
                            rVar = rVar2;
                            i1Var = w10;
                        }
                        try {
                            qVar.g(i10, i1Var, a2, z10, z11);
                        } catch (DeadObjectException unused) {
                            g1Var.b.M(rVar);
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
