package i2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements e9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return (i) this.b;
            case 1:
                return (x2.t) this.b;
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
