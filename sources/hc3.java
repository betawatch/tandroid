// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
