package k2;

import hg.o1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.x b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ f(n4.x xVar, Exception exc, int i10) {
        this.a = i10;
        this.b = xVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        n4.x xVar = this.b;
        switch (i10) {
            case 0:
                j jVar = (j) xVar.c;
                String str = e2.d0.a;
                j2.f fVar = ((i2.c0) jVar).a.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new o1(p5, exc, 29));
                break;
            default:
                j jVar2 = (j) xVar.c;
                String str2 = e2.d0.a;
                j2.f fVar2 = ((i2.c0) jVar2).a.s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 23));
                break;
        }
    }
}
