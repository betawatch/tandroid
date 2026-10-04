package a3;

import b2.x1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                ((f) this.b.c).g.onFirstFrameRendered();
                break;
            case 1:
                ((f) this.b.c).g.q();
                break;
            default:
                ((f) this.b.c).g.D();
                break;
        }
    }

    public /* synthetic */ e(n4.y yVar, x1 x1Var) {
        this.a = 2;
        this.b = yVar;
    }
}
