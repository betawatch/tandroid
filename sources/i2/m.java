package i2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements d9.t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // d9.t
    public final Object get() {
        switch (this.a) {
            case 0:
                return (h) this.b;
            case 1:
                return (x2.t) this.b;
            case 2:
                return (j) this.b;
            default:
                try {
                    return (u2.f0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
