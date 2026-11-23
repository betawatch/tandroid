package l2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements g9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // g9.t
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
