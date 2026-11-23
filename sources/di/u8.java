package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ u8(w8 w8Var, int i7) {
        this.a = i7;
        this.b = w8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        w8 w8Var = this.b;
        switch (i7) {
            case 0:
                w8Var.b();
                break;
            case 1:
                w8Var.a();
                break;
            default:
                org.telegram.ui.Components.gc gcVar = w8Var.d;
                y8 y8Var = w8Var.q;
                u8 u8Var = w8Var.p;
                gj gjVar = w8Var.b;
                if (!w8Var.l) {
                    w8Var.l = true;
                    gjVar.f((int) w8Var.k, w8Var.c(), true);
                    long j3 = y8Var.g;
                    int i10 = y8Var.a;
                    y8Var.g = j3 + w8Var.k;
                    ls.f(i10).k(ls.A3, new Object[0]);
                    w8Var.k = 0L;
                    ls.f(i10).k(ls.o1, Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()), gjVar.k.reactions);
                }
                if (!w8Var.m) {
                    w8Var.m = true;
                    w8Var.f.b = 5000L;
                    org.telegram.messenger.g0.r(u8Var);
                    org.telegram.messenger.g0.h3(u8Var, 5000L);
                    gcVar.k(true);
                    gcVar.v = u8Var;
                }
                w8Var.e.b.setText(w8Var.d());
                break;
        }
    }
}
