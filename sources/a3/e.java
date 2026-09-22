package a3;

import b2.x1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.y b;

    public /* synthetic */ e(int i10, n4.y yVar) {
        this.a = i10;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((f) this.b.b).g.onFirstFrameRendered();
                break;
            case 1:
                ((f) this.b.b).g.B();
                break;
            default:
                ((f) this.b.b).g.U();
                break;
        }
    }

    public /* synthetic */ e(n4.y yVar, x1 x1Var) {
        this.a = 2;
        this.b = yVar;
    }
}
