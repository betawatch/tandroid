package i2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements d9.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // d9.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return (k) this.b;
            case 1:
                return (x2.u) this.b;
            case 2:
                return (l) this.b;
            default:
                try {
                    return (u2.e0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
