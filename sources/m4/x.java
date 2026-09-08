package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        h1 h1Var;
        a0 a0Var = this.c;
        f1 f1Var = a0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        h1 c10 = a0Var.s.c(a0Var.t.Q0(), a0Var.t.O0(), a0Var.s.k);
        a0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        h1 H0 = f1Var.H0(c10);
        fg.f fVar = f1Var.b;
        e9.i0 t10 = fVar.t();
        for (int i11 = 0; i11 < t10.size(); i11++) {
            r rVar2 = (r) t10.get(i11);
            try {
                com.google.android.gms.common.api.internal.v y3 = fVar.y(rVar2);
                if (y3 != null) {
                    i10 = y3.e();
                } else if (!a0Var.h(rVar2)) {
                    break;
                } else {
                    i10 = 0;
                }
                h1 x10 = fVar.x(rVar2);
                if (x10 == null) {
                    fVar.w(rVar2);
                    b2.x0 a2 = w7.t.a(fVar.s(rVar2), a0Var.t.t());
                    try {
                        q qVar = rVar2.d;
                        e2.d.h(qVar);
                        if (x10 == null) {
                            rVar = rVar2;
                            h1Var = H0;
                        } else {
                            rVar = rVar2;
                            h1Var = x10;
                        }
                        try {
                            qVar.g(i10, h1Var, a2, z10, z11);
                        } catch (DeadObjectException unused) {
                            f1Var.b.N(rVar);
                        } catch (RemoteException e7) {
                            e = e7;
                            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
                        }
                    } catch (DeadObjectException unused2) {
                        rVar = rVar2;
                    } catch (RemoteException e10) {
                        e = e10;
                        rVar = rVar2;
                    }
                }
            } catch (DeadObjectException unused3) {
                rVar = rVar2;
            } catch (RemoteException e11) {
                e = e11;
                rVar = rVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
