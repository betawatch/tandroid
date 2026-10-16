package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        int i10;
        k1 k1Var;
        e0 e0Var = this.c;
        i1 i1Var = e0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        k1 c10 = e0Var.s.c(e0Var.t.T0(), e0Var.t.R0(), e0Var.s.k);
        e0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        k1 Y0 = i1Var.Y0(c10);
        pi.e eVar = i1Var.b;
        e9.n0 m10 = eVar.m();
        for (int i11 = 0; i11 < m10.size(); i11++) {
            v vVar2 = (v) m10.get(i11);
            try {
                com.google.android.gms.common.api.internal.v q6 = eVar.q(vVar2);
                if (q6 != null) {
                    i10 = q6.e();
                } else if (!e0Var.h(vVar2)) {
                    break;
                } else {
                    i10 = 0;
                }
                k1 p5 = eVar.p(vVar2);
                if (p5 == null) {
                    eVar.o(vVar2);
                    b2.c1 a2 = w7.v.a(eVar.l(vVar2), e0Var.t.s());
                    try {
                        u uVar = vVar2.d;
                        uVar.getClass();
                        if (p5 == null) {
                            vVar = vVar2;
                            k1Var = Y0;
                        } else {
                            vVar = vVar2;
                            k1Var = p5;
                        }
                        try {
                            uVar.h(i10, k1Var, a2, z10, z11);
                        } catch (DeadObjectException unused) {
                            i1Var.b.C(vVar);
                        } catch (RemoteException e) {
                            e = e;
                            e2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
                        }
                    } catch (DeadObjectException unused2) {
                        vVar = vVar2;
                    } catch (RemoteException e7) {
                        e = e7;
                        vVar = vVar2;
                    }
                }
            } catch (DeadObjectException unused3) {
                vVar = vVar2;
            } catch (RemoteException e10) {
                e = e10;
                vVar = vVar2;
            }
        }
        this.a = true;
        this.b = true;
    }
}
