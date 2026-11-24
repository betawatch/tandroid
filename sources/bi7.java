// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bi7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ji7 b;

    public /* synthetic */ bi7(ji7 ji7Var, byte b) {
        this.a = b;
        this.b = ji7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ji7 ji7Var = this.b;
        switch (b) {
            case 0:
                ji7Var.dismiss();
                break;
            case 1:
                ji7Var.b1(true, false);
                break;
            default:
                ji7Var.b1(true, false);
                break;
        }
    }
}
