package l2;

import android.util.Pair;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ x2.u d;
    public final /* synthetic */ x2.c0 e;

    public /* synthetic */ e1(g1 g1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.a = i7;
        this.b = g1Var;
        this.c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.e);
                break;
            default:
                m2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.e);
                break;
        }
    }
}
