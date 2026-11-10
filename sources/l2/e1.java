package l2;

import android.util.Pair;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ x2.t d;
    public final /* synthetic */ x2.b0 e;

    public /* synthetic */ e1(g1 g1Var, Pair pair, x2.t tVar, x2.b0 b0Var, int i7) {
        this.a = i7;
        this.b = g1Var;
        this.c = pair;
        this.d = tVar;
        this.e = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.A(((Integer) pair.first).intValue(), (x2.f0) pair.second, this.d, this.e);
                break;
            default:
                m2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.G(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, this.d, this.e);
                break;
        }
    }
}
