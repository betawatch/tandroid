package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements r0 {
    public static final u b = new u(0);
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i9) {
        this.a = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final b1 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!x.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (b1) x.e(cls.asSubclass(x.class)).d(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
