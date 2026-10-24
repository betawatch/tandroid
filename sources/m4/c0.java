package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        v vVar;
        int i10;
        k1 k1Var;
        f0 f0Var = this.c;
        i1 i1Var = f0Var.g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        k1 c10 = f0Var.s.c(f0Var.t.T0(), f0Var.t.R0(), f0Var.s.k);
        f0Var.s = c10;
        boolean z10 = this.a;
        boolean z11 = this.b;
        k1 Y0 = i1Var.Y0(c10);
        qi.e eVar = i1Var.b;
        e9.n0 p5 = eVar.p();
        for (int i11 = 0; i11 < p5.size(); i11++) {
            v vVar2 = (v) p5.get(i11);
            try {
                com.google.android.gms.common.api.internal.u t10 = eVar.t(vVar2);
                if (t10 != null) {
                    i10 = t10.e();
                } else if (!f0Var.h(vVar2)) {
                    break;
                } else {
                    i10 = 0;
                }
                k1 s10 = eVar.s(vVar2);
                if (s10 == null) {
                    eVar.r(vVar2);
                    b2.b1 a2 = w7.v.a(eVar.o(vVar2), f0Var.t.s());
                    try {
                        u uVar = vVar2.d;
                        uVar.getClass();
                        if (s10 == null) {
                            vVar = vVar2;
                            k1Var = Y0;
                        } else {
                            vVar = vVar2;
                            k1Var = s10;
                        }
                        try {
                            uVar.h(i10, k1Var, a2, z10, z11);
                        } catch (DeadObjectException unused) {
                            i1Var.b.E(vVar);
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
