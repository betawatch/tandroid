package l2;

import android.util.Pair;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ x2.b0 d;

    public /* synthetic */ d1(g1 g1Var, Pair pair, x2.b0 b0Var, int i7) {
        this.a = i7;
        this.b = g1Var;
        this.c = pair;
        this.d = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2.e eVar = this.b.b.h;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                x2.f0 f0Var = (x2.f0) pair.second;
                f0Var.getClass();
                eVar.E(intValue, f0Var, this.d);
                break;
            default:
                m2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.d(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, this.d);
                break;
        }
    }
}
