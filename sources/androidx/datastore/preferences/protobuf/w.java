package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class w implements r0 {
    public static final w b = new w(0);
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i7) {
        this.a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final a1 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (a1) z.d(cls.asSubclass(z.class)).c(3);
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
                return z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
