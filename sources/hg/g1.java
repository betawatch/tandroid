package hg;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ g1(i1 i1Var, int i10) {
        this.a = i10;
        this.b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i1.e0(this.b);
                break;
            default:
                i1.d0(this.b);
                break;
        }
    }
}
