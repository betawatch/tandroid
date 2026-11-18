package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ t8(v8 v8Var, int i7) {
        this.a = i7;
        this.b = v8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        v8 v8Var = this.b;
        switch (i7) {
            case 0:
                v8Var.b();
                break;
            case 1:
                v8Var.a();
                break;
            default:
                org.telegram.ui.Components.gc gcVar = v8Var.d;
                x8 x8Var = v8Var.q;
                t8 t8Var = v8Var.p;
                fj fjVar = v8Var.b;
                if (!v8Var.l) {
                    v8Var.l = true;
                    fjVar.f((int) v8Var.k, v8Var.c(), true);
                    long j3 = x8Var.g;
                    int i10 = x8Var.a;
                    x8Var.g = j3 + v8Var.k;
                    ks.f(i10).k(ks.A3, new Object[0]);
                    v8Var.k = 0L;
                    ks.f(i10).k(ks.o1, Long.valueOf(fj.B0(fjVar.k)), Integer.valueOf(fjVar.e1()), fjVar.k.reactions);
                }
                if (!v8Var.m) {
                    v8Var.m = true;
                    v8Var.f.b = 5000L;
                    org.telegram.messenger.g0.r(t8Var);
                    org.telegram.messenger.g0.h3(t8Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = t8Var;
                }
                v8Var.e.b.setText(v8Var.d());
                break;
        }
    }
}
