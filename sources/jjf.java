// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
