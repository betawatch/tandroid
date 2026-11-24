// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class d25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jac b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ d25(jac jacVar, Exception exc, byte b) {
        this.a = b;
        this.b = jacVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                jacVar.a(null, exc.getMessage() != null ? exc.getMessage() : "NULL_ERROR");
                break;
            case 1:
                jacVar.a(null, exc.getMessage() != null ? exc.getMessage() : "NULL_ERROR");
                break;
            case 2:
                jacVar.a(null, exc.getMessage());
                break;
            default:
                jacVar.a(null, exc.getMessage());
                break;
        }
    }
}
