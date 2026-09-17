package i2;

import android.util.Pair;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ z0(c1 c1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.f fVar = this.b.b.h;
                Pair pair = this.c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                break;
            case 1:
                j2.f fVar2 = this.b.b.h;
                Pair pair2 = this.c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                break;
            default:
                j2.f fVar3 = this.b.b.h;
                Pair pair3 = this.c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                break;
        }
    }
}
