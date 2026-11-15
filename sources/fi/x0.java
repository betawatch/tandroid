package fi;

import c8.ka;
import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ x0(e1 e1Var, int i7) {
        this.a = i7;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                this.b.q();
                break;
            case 2:
                this.b.t(true);
                break;
            case 3:
                e1 e1Var = this.b;
                ns.f(e1Var.e).k(ns.G2, Long.valueOf(e1Var.w.id));
                e1Var.u(true);
                break;
            case 4:
                this.b.w();
                break;
            case 5:
                this.b.t(true);
                break;
            case 6:
                e1 e1Var2 = this.b;
                if (e1Var2.F != null) {
                    org.telegram.messenger.p5 p5Var = Utilities.e;
                    NativeInstance nativeInstance = e1Var2.F;
                    Objects.requireNonNull(nativeInstance);
                    p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                    e1Var2.N.clear();
                    e1Var2.F = null;
                }
                e1Var2.k();
                break;
            case 7:
                this.b.t(true);
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                e1 e1Var3 = this.b;
                if (e1Var3.F != null) {
                    org.telegram.messenger.p5 p5Var2 = Utilities.e;
                    NativeInstance nativeInstance2 = e1Var3.F;
                    Objects.requireNonNull(nativeInstance2);
                    p5Var2.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                    e1Var3.N.clear();
                    e1Var3.F = null;
                }
                e1Var3.k();
                break;
            case 10:
                this.b.p();
                break;
            case 11:
                this.b.q();
                break;
            default:
                e1 e1Var4 = this.b;
                if (!e1Var4.n) {
                    ka.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.f0(e1Var4, 14));
                    break;
                }
                break;
        }
    }
}
