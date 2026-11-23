package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ t01(g11 g11Var, int i7) {
        this.a = i7;
        this.b = g11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4.c0 c0Var;
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                g11Var.P = null;
                g11Var.k();
                break;
            default:
                g11 g11Var2 = this.b;
                long j3 = g11Var2.b;
                if (!g11Var2.d && g11Var2.y > 0.0f && (c0Var = (v4.c0) g11Var2.r.getLayoutManager()) != null && c0Var.N0() >= g11Var2.s.c.size() - 3) {
                    if (!g11Var2.j()) {
                        org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(g11Var2.a).t7;
                        long j10 = -j3;
                        if (!f00Var.e(j10)) {
                            f00Var.o(j10);
                            break;
                        }
                    } else {
                        g11Var2.k();
                        break;
                    }
                }
                break;
        }
    }
}
