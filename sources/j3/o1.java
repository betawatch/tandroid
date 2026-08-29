package j3;

import android.util.Pair;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9.l b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ l4.x d;

    public /* synthetic */ o1(g9.l lVar, Pair pair, l4.x xVar, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = pair;
        this.d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k3.f fVar = ((s1) this.b.c).h;
                Pair pair = this.c;
                fVar.c(((Integer) pair.first).intValue(), (l4.c0) pair.second, this.d);
                break;
            default:
                k3.f fVar2 = ((s1) this.b.c).h;
                Pair pair2 = this.c;
                int intValue = ((Integer) pair2.first).intValue();
                l4.c0 c0Var = (l4.c0) pair2.second;
                c0Var.getClass();
                fVar2.b(intValue, c0Var, this.d);
                break;
        }
    }
}
