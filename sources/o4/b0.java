package o4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import b8.xe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ e0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, Looper looper) {
        super(looper);
        this.c = e0Var;
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
        v vVar;
        int i3;
        j1 j1Var;
        e0 e0Var = this.c;
        h1 h1Var = e0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        j1 c2 = e0Var.s.c(e0Var.t.T0(), e0Var.t.R0(), e0Var.s.k);
        e0Var.s = c2;
        boolean z10 = this.a;
        boolean z11 = this.b;
        j1 a12 = h1Var.a1(c2);
        ui.f fVar = h1Var.b;
        g9.i0 n4 = fVar.n();
        for (int i10 = 0; i10 < n4.size(); i10++) {
            v vVar2 = (v) n4.get(i10);
            try {
                com.google.android.gms.common.api.internal.s s6 = fVar.s(vVar2);
                if (s6 != null) {
                    i3 = s6.e();
                } else if (!e0Var.h(vVar2)) {
                    break;
                } else {
                    i3 = 0;
                }
                j1 q10 = fVar.q(vVar2);
                if (q10 == null) {
                    fVar.p(vVar2);
                    d2.a1 a10 = xe.a(fVar.m(vVar2), e0Var.t.t());
                    try {
                        u uVar = vVar2.d;
                        uVar.getClass();
                        if (q10 == null) {
                            vVar = vVar2;
                            j1Var = a12;
                        } else {
                            vVar = vVar2;
                            j1Var = q10;
                        }
                        try {
                            uVar.f(i3, j1Var, a10, z10, z11);
                        } catch (DeadObjectException unused) {
                            h1Var.b.K(vVar);
                        } catch (RemoteException e10) {
                            e = e10;
                            g2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
                        }
                    } catch (DeadObjectException unused2) {
                        vVar = vVar2;
                    } catch (RemoteException e11) {
                        e = e11;
                        vVar = vVar2;
                    }
                }
            } catch (DeadObjectException unused3) {
                vVar = vVar2;
            } catch (RemoteException e12) {
                e = e12;
                vVar = vVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
