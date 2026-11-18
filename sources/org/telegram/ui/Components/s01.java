package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f11 b;

    public /* synthetic */ s01(f11 f11Var, int i7) {
        this.a = i7;
        this.b = f11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4.c0 c0Var;
        switch (this.a) {
            case 0:
                f11 f11Var = this.b;
                f11Var.P = null;
                f11Var.k();
                break;
            default:
                f11 f11Var2 = this.b;
                long j3 = f11Var2.b;
                if (!f11Var2.d && f11Var2.y > 0.0f && (c0Var = (v4.c0) f11Var2.r.getLayoutManager()) != null && c0Var.N0() >= f11Var2.s.c.size() - 3) {
                    if (!f11Var2.j()) {
                        org.telegram.messenger.e00 e00Var = org.telegram.messenger.mp.u1(f11Var2.a).t7;
                        long j10 = -j3;
                        if (!e00Var.e(j10)) {
                            e00Var.o(j10);
                            break;
                        }
                    } else {
                        f11Var2.k();
                        break;
                    }
                }
                break;
        }
    }
}
