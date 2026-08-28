package h3;

import android.util.Pair;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5.b b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ j4.q d;
    public final /* synthetic */ j4.y e;

    public /* synthetic */ n1(g5.b bVar, Pair pair, j4.q qVar, j4.y yVar, int i9) {
        this.a = i9;
        this.b = bVar;
        this.c = pair;
        this.d = qVar;
        this.e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i3.f fVar = ((s1) this.b.c).h;
                Pair pair = this.c;
                fVar.g(((Integer) pair.first).intValue(), (j4.d0) pair.second, this.d, this.e);
                break;
            case 1:
                i3.f fVar2 = ((s1) this.b.c).h;
                Pair pair2 = this.c;
                fVar2.f(((Integer) pair2.first).intValue(), (j4.d0) pair2.second, this.d, this.e);
                break;
            default:
                i3.f fVar3 = ((s1) this.b.c).h;
                Pair pair3 = this.c;
                fVar3.e(((Integer) pair3.first).intValue(), (j4.d0) pair3.second, this.d, this.e);
                break;
        }
    }
}
