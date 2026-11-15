package di;

import org.telegram.messenger.gj;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ q8(s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        s8 s8Var = this.b;
        switch (i7) {
            case 0:
                s8Var.b();
                break;
            case 1:
                s8Var.a();
                break;
            default:
                org.telegram.ui.Components.xb xbVar = s8Var.d;
                u8 u8Var = s8Var.q;
                q8 q8Var = s8Var.p;
                gj gjVar = s8Var.b;
                if (!s8Var.l) {
                    s8Var.l = true;
                    gjVar.f((int) s8Var.k, s8Var.c(), true);
                    long j3 = u8Var.g;
                    int i10 = u8Var.a;
                    u8Var.g = j3 + s8Var.k;
                    ns.f(i10).k(ns.y3, new Object[0]);
                    s8Var.k = 0L;
                    ns.f(i10).k(ns.o1, Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()), gjVar.k.reactions);
                }
                if (!s8Var.m) {
                    s8Var.m = true;
                    s8Var.f.b = 5000L;
                    org.telegram.messenger.g0.r(q8Var);
                    org.telegram.messenger.g0.i3(q8Var, 5000L);
                    xbVar.k(true);
                    xbVar.v = q8Var;
                }
                s8Var.e.b.setText(s8Var.d());
                break;
        }
    }
}
