package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u implements r0 {
    public static final u b = new u(0);
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i10) {
        this.a = i10;
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
