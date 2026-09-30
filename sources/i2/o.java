package i2;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
