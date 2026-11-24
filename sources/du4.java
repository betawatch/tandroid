// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class du4 implements w37 {
    public static final du4 b = new du4(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ du4(byte b2) {
        this.a = b2;
    }

    @Override // w37
    public final j19 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!gu4.class.isAssignableFrom(cls)) {
                    u36.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (j19) gu4.d(cls.asSubclass(gu4.class)).c(3);
                } catch (Exception e) {
                    rjb.k("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // w37
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return gu4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
