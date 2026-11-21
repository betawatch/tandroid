package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h11 b;

    public /* synthetic */ u01(h11 h11Var, int i7) {
        this.a = i7;
        this.b = h11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4.c0 c0Var;
        switch (this.a) {
            case 0:
                h11 h11Var = this.b;
                h11Var.P = null;
                h11Var.k();
                break;
            default:
                h11 h11Var2 = this.b;
                long j3 = h11Var2.b;
                if (!h11Var2.d && h11Var2.y > 0.0f && (c0Var = (v4.c0) h11Var2.r.getLayoutManager()) != null && c0Var.N0() >= h11Var2.s.c.size() - 3) {
                    if (!h11Var2.j()) {
                        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(h11Var2.a).t7;
                        long j10 = -j3;
                        if (!e00Var.e(j10)) {
                            e00Var.o(j10);
                            break;
                        }
                    } else {
                        h11Var2.k();
                        break;
                    }
                }
                break;
        }
    }
}
