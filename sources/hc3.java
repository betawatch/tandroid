// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
