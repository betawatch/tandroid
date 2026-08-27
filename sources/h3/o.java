package h3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements o8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return (j) this.b;
            case 1:
                return (b5.v) this.b;
            case 2:
                return (l) this.b;
            case 3:
                return Boolean.valueOf(((q0) this.b).K);
            default:
                try {
                    return (j4.b0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e9) {
                    throw new IllegalStateException(e9);
                }
        }
    }
}
