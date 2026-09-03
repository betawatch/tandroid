package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
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
