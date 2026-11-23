package l2;

import android.util.Pair;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ x2.c0 d;

    public /* synthetic */ z0(c1 c1Var, Pair pair, x2.c0 c0Var, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = pair;
        this.d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2.d dVar = this.b.b.h;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                x2.g0 g0Var = (x2.g0) pair.second;
                g0Var.getClass();
                dVar.C(intValue, g0Var, this.d);
                break;
            default:
                m2.d dVar2 = this.b.b.h;
                Pair pair2 = this.c;
                dVar2.b(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d);
                break;
        }
    }
}
