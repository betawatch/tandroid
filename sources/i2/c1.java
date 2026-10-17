package i2;

import android.util.Pair;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ c1(e1 e1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = e1Var;
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
