package i2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements d9.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // d9.u
    public final Object get() {
        switch (this.a) {
            case 0:
                return (i) this.b;
            case 1:
                return (x2.s) this.b;
            case 2:
                return (k) this.b;
            default:
                try {
                    return (u2.f0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
