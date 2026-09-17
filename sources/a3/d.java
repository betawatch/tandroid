package a3;

import b2.x1;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4.y b;

    public /* synthetic */ d(int i10, n4.y yVar) {
        this.a = i10;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((e) this.b.c).g.onFirstFrameRendered();
                break;
            case 1:
                ((e) this.b.c).g.H();
                break;
            default:
                ((e) this.b.c).g.h0();
                break;
        }
    }

    public /* synthetic */ d(n4.y yVar, x1 x1Var) {
        this.a = 2;
        this.b = yVar;
    }
}
