// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class hc3 implements mfb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hc3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // mfb
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (uz6) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    vr9.l(e);
                    return null;
                }
            case 1:
                return (ec3) obj;
            case 2:
                return (ld3) obj;
            case 3:
                return (oc3) obj;
            default:
                return (or9) obj;
        }
    }
}
