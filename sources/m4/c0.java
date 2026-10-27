package m4;

import a8.ie;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c0 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ f0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, Looper looper) {
        super(looper);
        this.c = f0Var;
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
        w wVar;
        int i10;
        l1 l1Var;
        f0 f0Var = this.c;
        j1 j1Var = f0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        l1 c10 = f0Var.s.c(f0Var.t.T0(), f0Var.t.R0(), f0Var.s.k);
        f0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        l1 Y0 = j1Var.Y0(c10);
        com.google.firebase.messaging.q qVar = j1Var.b;
        f9.i0 k10 = qVar.k();
        for (int i11 = 0; i11 < k10.size(); i11++) {
            w wVar2 = (w) k10.get(i11);
            try {
                com.google.android.gms.common.api.internal.u p10 = qVar.p(wVar2);
                if (p10 != null) {
                    i10 = p10.e();
                } else if (!f0Var.h(wVar2)) {
                    break;
                } else {
                    i10 = 0;
                }
                l1 o10 = qVar.o(wVar2);
                if (o10 == null) {
                    qVar.n(wVar2);
                    b2.c1 a2 = ie.a(qVar.j(wVar2), f0Var.t.s());
                    try {
                        v vVar = wVar2.d;
                        vVar.getClass();
                        if (o10 == null) {
                            wVar = wVar2;
                            l1Var = Y0;
                        } else {
                            wVar = wVar2;
                            l1Var = o10;
                        }
                        try {
                            vVar.h(i10, l1Var, a2, z10, z11);
                        } catch (DeadObjectException unused) {
                            j1Var.b.B(wVar);
                        } catch (RemoteException e) {
                            e = e;
                            e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
                        }
                    } catch (DeadObjectException unused2) {
                        wVar = wVar2;
                    } catch (RemoteException e10) {
                        e = e10;
                        wVar = wVar2;
                    }
                }
            } catch (DeadObjectException unused3) {
                wVar = wVar2;
            } catch (RemoteException e11) {
                e = e11;
                wVar = wVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
