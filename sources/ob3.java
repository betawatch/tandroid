// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ob3 implements qbb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // qbb
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (qx6) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    ho9.n(e);
                    return null;
                }
            case 1:
                return (lb3) obj;
            case 2:
                return (sc3) obj;
            case 3:
                return (vb3) obj;
            default:
                return (xn9) obj;
        }
    }
}
