package di;

import org.telegram.messenger.fj;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.Components.fc fcVar = w8Var.d;
                y8 y8Var = w8Var.q;
                u8 u8Var = w8Var.p;
                fj fjVar = w8Var.b;
                if (!w8Var.l) {
                    w8Var.l = true;
                    fjVar.f((int) w8Var.k, w8Var.c(), true);
                    long j3 = y8Var.g;
                    int i10 = y8Var.a;
                    y8Var.g = j3 + w8Var.k;
                    ks.f(i10).k(ks.A3, new Object[0]);
                    w8Var.k = 0L;
                    ks.f(i10).k(ks.o1, Long.valueOf(fj.B0(fjVar.k)), Integer.valueOf(fjVar.e1()), fjVar.k.reactions);
                }
                if (!w8Var.m) {
                    w8Var.m = true;
                    w8Var.f.b = 5000L;
                    org.telegram.messenger.g0.r(u8Var);
                    org.telegram.messenger.g0.h3(u8Var, 5000L);
                    fcVar.k(true);
                    fcVar.v = u8Var;
                }
                w8Var.e.b.setText(w8Var.d());
                break;
        }
    }
}
