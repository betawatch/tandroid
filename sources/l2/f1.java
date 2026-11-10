package l2;

import android.util.Pair;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ f1(g1 g1Var, Pair pair, int i7) {
        this.a = i7;
        this.b = g1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.z(((Integer) pair.first).intValue(), (x2.f0) pair.second);
                break;
            default:
                m2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.w(((Integer) pair2.first).intValue(), (x2.f0) pair2.second);
                break;
        }
    }
}
