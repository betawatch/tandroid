package a3;

import b2.x1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.x b;

    public /* synthetic */ e(int i10, n4.x xVar) {
        this.a = i10;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((f) this.b.c).g.onFirstFrameRendered();
                break;
            case 1:
                ((f) this.b.c).g.x();
                break;
            default:
                ((f) this.b.c).g.P();
                break;
        }
    }

    public /* synthetic */ e(n4.x xVar, x1 x1Var) {
        this.a = 2;
        this.b = xVar;
    }
}
