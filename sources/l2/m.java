package l2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                    return (x2.e0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
