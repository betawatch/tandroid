package di;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ y3(b4 b4Var, int i10) {
        this.a = i10;
        this.b = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                super/*org.telegram.ui.ActionBar.f3*/.dismiss();
                break;
        }
    }
}
