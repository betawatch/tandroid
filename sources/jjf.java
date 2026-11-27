// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jjf implements tkf {
    public static final jjf b = new jjf(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ jjf(byte b2) {
        this.a = b2;
    }

    @Override // tkf
    public final ilf zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (!ljf.class.isAssignableFrom(cls)) {
                    lq5.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (ilf) ljf.k(cls.asSubclass(ljf.class)).h(3, null);
                } catch (Exception e) {
                    grb.j("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // tkf
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return ljf.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
