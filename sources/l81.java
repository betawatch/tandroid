// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l81 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ l81(i91 i91Var, byte b) {
        this.a = b;
        this.b = i91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i91 i91Var = this.b;
        switch (b) {
            case 0:
                i91Var.k0(false);
                break;
            default:
                i91Var.b0();
                break;
        }
    }
}
