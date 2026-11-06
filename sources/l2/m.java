package l2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements g9.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // g9.u
    public final Object get() {
        switch (this.a) {
            case 0:
                return (h) this.b;
            case 1:
                return (a3.x) this.b;
            case 2:
                return (j) this.b;
            default:
                try {
                    return (x2.f0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
