package k2;

import android.util.Pair;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ w2.c0 d;

    public /* synthetic */ c1(f1 f1Var, Pair pair, w2.c0 c0Var, int i3) {
        this.a = i3;
        this.b = f1Var;
        this.c = pair;
        this.d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l2.f fVar = this.b.b.h;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                w2.g0 g0Var = (w2.g0) pair.second;
                g0Var.getClass();
                fVar.D(intValue, g0Var, this.d);
                break;
            default:
                l2.f fVar2 = this.b.b.h;
                Pair pair2 = this.c;
                fVar2.d(((Integer) pair2.first).intValue(), (w2.g0) pair2.second, this.d);
                break;
        }
    }
}
