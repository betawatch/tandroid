// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ad3 implements sdb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ad3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // sdb
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (qz6) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    dq9.o(e);
                    return null;
                }
            case 1:
                return (xc3) obj;
            case 2:
                return (fe3) obj;
            case 3:
                return (hd3) obj;
            default:
                return (yp9) obj;
        }
    }
}
