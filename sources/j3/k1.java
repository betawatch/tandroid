package j3;

import android.util.Pair;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7.b b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ o4.j d;
    public final /* synthetic */ o4.r e;

    public /* synthetic */ k1(f7.b bVar, Pair pair, o4.j jVar, o4.r rVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = pair;
        this.d = jVar;
        this.e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k3.f fVar = ((q1) this.b.c).h;
                Pair pair = this.c;
                fVar.a(((Integer) pair.first).intValue(), (o4.v) pair.second, this.d, this.e);
                break;
            case 1:
                k3.f fVar2 = ((q1) this.b.c).h;
                Pair pair2 = this.c;
                fVar2.h(((Integer) pair2.first).intValue(), (o4.v) pair2.second, this.d, this.e);
                break;
            default:
                k3.f fVar3 = ((q1) this.b.c).h;
                Pair pair3 = this.c;
                fVar3.d(((Integer) pair3.first).intValue(), (o4.v) pair3.second, this.d, this.e);
                break;
        }
    }
}
