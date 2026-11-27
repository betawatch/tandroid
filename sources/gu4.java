// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gu4 implements d47 {
    public static final gu4 b = new gu4(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ gu4(byte b2) {
        this.a = b2;
    }

    @Override // d47
    public final v29 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!ju4.class.isAssignableFrom(cls)) {
                    lq5.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (v29) ju4.d(cls.asSubclass(ju4.class)).c(3);
                } catch (Exception e) {
                    grb.j("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // d47
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return ju4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
