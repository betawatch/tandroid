// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o29 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ e29 c;

    public /* synthetic */ o29(jo0 jo0Var, e29 e29Var, byte b) {
        this.a = b;
        this.b = jo0Var;
        this.c = e29Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e29 e29Var = this.c;
        jo0 jo0Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new o29(jo0Var, e29Var, (byte) 1));
                break;
            default:
                jo0Var.removeView(e29Var);
                break;
        }
    }
}
