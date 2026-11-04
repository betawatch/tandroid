package ci;

import org.telegram.messenger.hs;
import org.telegram.messenger.zi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ a9(c9 c9Var, int i3) {
        this.a = i3;
        this.b = c9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        c9 c9Var = this.b;
        switch (i3) {
            case 0:
                c9Var.b();
                break;
            case 1:
                c9Var.a();
                break;
            default:
                org.telegram.ui.Components.ac acVar = c9Var.d;
                e9 e9Var = c9Var.q;
                a9 a9Var = c9Var.p;
                zi ziVar = c9Var.b;
                if (!c9Var.l) {
                    c9Var.l = true;
                    ziVar.f((int) c9Var.k, c9Var.c(), true);
                    long j10 = e9Var.g;
                    int i10 = e9Var.a;
                    e9Var.g = j10 + c9Var.k;
                    hs.f(i10).k(hs.y3, new Object[0]);
                    c9Var.k = 0L;
                    hs.f(i10).k(hs.o1, Long.valueOf(zi.B0(ziVar.k)), Integer.valueOf(ziVar.f1()), ziVar.k.reactions);
                }
                if (!c9Var.m) {
                    c9Var.m = true;
                    c9Var.f.b = 5000L;
                    org.telegram.messenger.g0.r(a9Var);
                    org.telegram.messenger.g0.i3(a9Var, 5000L);
                    acVar.k(true);
                    acVar.v = a9Var;
                }
                c9Var.e.b.setText(c9Var.d());
                break;
        }
    }
}
