package a3;

import b2.x1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((f) this.b.c).g.B();
                break;
            default:
                ((f) this.b.c).g.J();
                break;
        }
    }

    public /* synthetic */ e(n4.y yVar, x1 x1Var) {
        this.a = 2;
        this.b = yVar;
    }
}
