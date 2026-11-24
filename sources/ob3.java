// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
