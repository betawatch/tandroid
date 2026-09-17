package i2;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements d9.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // d9.j
    public final Object get() {
        switch (this.a) {
            case 0:
                return (l) this.b;
            case 1:
                return (x2.u) this.b;
            case 2:
                return (m) this.b;
            default:
                try {
                    return (u2.e0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
