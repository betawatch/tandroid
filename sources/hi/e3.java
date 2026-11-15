package hi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ e3(h3 h3Var, int i7) {
        this.a = i7;
        this.b = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                super/*org.telegram.ui.ActionBar.u2*/.dismiss();
                break;
        }
    }
}
