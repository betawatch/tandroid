package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class t implements q0 {
    public static final t b = new t(0);
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i10) {
        this.a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final a1 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (a1) w.e(cls.asSubclass(w.class)).d(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
