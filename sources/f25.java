// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class f25 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jac b;

    public /* synthetic */ f25(jac jacVar, byte b) {
        this.a = b;
        this.b = jacVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                jacVar.a((y25) obj, (String) obj2);
                break;
            default:
                jacVar.a((Long) obj, (Boolean) obj2);
                break;
        }
    }
}
