package i2;

import android.util.Pair;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ e1(g1 g1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = g1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.f fVar = this.b.b.h;
                Pair pair = this.c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                break;
            default:
                j2.f fVar2 = this.b.b.h;
                Pair pair2 = this.c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                break;
        }
    }
}
