// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class en9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un9 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ en9(un9 un9Var, Exception exc, byte b) {
        this.a = b;
        this.b = un9Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        un9 un9Var = this.b;
        switch (b) {
            case 0:
                un9Var.h(exc);
                break;
            case 1:
                un9Var.h(exc);
                break;
            case 2:
                un9Var.h(exc);
                break;
            default:
                un9Var.h(exc);
                break;
        }
    }
}
