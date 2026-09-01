package j3;

import android.util.Pair;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7.b b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ o4.r d;

    public /* synthetic */ m1(f7.b bVar, Pair pair, o4.r rVar, int i10) {
        this.a = i10;
        this.b = bVar;
        this.c = pair;
        this.d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k3.f fVar = ((q1) this.b.c).h;
                Pair pair = this.c;
                fVar.f(((Integer) pair.first).intValue(), (o4.v) pair.second, this.d);
                break;
            default:
                k3.f fVar2 = ((q1) this.b.c).h;
                Pair pair2 = this.c;
                int intValue = ((Integer) pair2.first).intValue();
                o4.v vVar = (o4.v) pair2.second;
                vVar.getClass();
                fVar2.i(intValue, vVar, this.d);
                break;
        }
    }
}
