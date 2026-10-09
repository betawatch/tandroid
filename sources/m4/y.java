package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        d1 d1Var;
        b0 b0Var = this.c;
        b1 b1Var = b0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        d1 c10 = b0Var.s.c(b0Var.t.Q0(), b0Var.t.O0(), b0Var.s.k);
        b0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        d1 G0 = b1Var.G0(c10);
        oi.f fVar = b1Var.b;
        e9.i0 s10 = fVar.s();
        for (int i11 = 0; i11 < s10.size(); i11++) {
            r rVar2 = (r) s10.get(i11);
            try {
                com.google.android.gms.common.api.internal.v x10 = fVar.x(rVar2);
                if (x10 != null) {
                    i10 = x10.e();
                } else if (!b0Var.h(rVar2)) {
                    break;
                } else {
                    i10 = 0;
                }
                d1 w10 = fVar.w(rVar2);
                if (w10 == null) {
                    fVar.v(rVar2);
                    b2.x0 a2 = w7.s.a(fVar.r(rVar2), b0Var.t.t());
                    try {
                        q qVar = rVar2.d;
                        e2.d.h(qVar);
                        if (w10 == null) {
                            rVar = rVar2;
                            d1Var = G0;
                        } else {
                            rVar = rVar2;
                            d1Var = w10;
                        }
                        try {
                            qVar.g(i10, d1Var, a2, z10, z11);
                        } catch (DeadObjectException unused) {
                            b1Var.b.M(rVar);
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
