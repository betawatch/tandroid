package h3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements n8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // n8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return (j) this.b;
            case 1:
                return (b5.w) this.b;
            case 2:
                return (l) this.b;
            case 3:
                return Boolean.valueOf(((q0) this.b).K);
            default:
                try {
                    return (j4.c0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
