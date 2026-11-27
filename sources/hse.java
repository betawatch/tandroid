// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hse implements uye {
    public static final hse b = new hse(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ hse(byte b2) {
        this.a = b2;
    }

    @Override // uye
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return ese.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // uye
    public final j1f zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!ese.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (j1f) ese.f(cls.asSubclass(ese.class)).d(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
