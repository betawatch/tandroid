// default package

/* loaded from: classes.dex */
public final class jnd implements fvd {
    public static final jnd b = new jnd(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ jnd(byte b2) {
        this.a = b2;
    }

    @Override // fvd
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return mnd.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // fvd
    public final vyd zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!mnd.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
                }
                try {
                    return (vyd) mnd.d(cls.asSubclass(mnd.class)).a(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
