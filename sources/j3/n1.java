package j3;

import android.util.Pair;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9.l b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ l4.p d;
    public final /* synthetic */ l4.x e;

    public /* synthetic */ n1(g9.l lVar, Pair pair, l4.p pVar, l4.x xVar, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = pair;
        this.d = pVar;
        this.e = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k3.f fVar = ((s1) this.b.c).h;
                Pair pair = this.c;
                fVar.h(((Integer) pair.first).intValue(), (l4.c0) pair.second, this.d, this.e);
                break;
            case 1:
                k3.f fVar2 = ((s1) this.b.c).h;
                Pair pair2 = this.c;
                fVar2.g(((Integer) pair2.first).intValue(), (l4.c0) pair2.second, this.d, this.e);
                break;
            default:
                k3.f fVar3 = ((s1) this.b.c).h;
                Pair pair3 = this.c;
                fVar3.a(((Integer) pair3.first).intValue(), (l4.c0) pair3.second, this.d, this.e);
                break;
        }
    }
}
