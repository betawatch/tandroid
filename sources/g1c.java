// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jac b;
    public final /* synthetic */ String c;

    public /* synthetic */ g1c(jac jacVar, String str, byte b) {
        this.a = b;
        this.b = jacVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                jacVar.a(str, Boolean.FALSE);
                break;
            case 1:
                jacVar.a(null, str);
                break;
            case 2:
                jacVar.a(null, str);
                break;
            default:
                jacVar.a(null, str);
                break;
        }
    }
}
