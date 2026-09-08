package i2;

import android.util.Pair;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
