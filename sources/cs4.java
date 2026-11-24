// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cs4 implements w17 {
    public static final cs4 b = new cs4(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ cs4(byte b2) {
        this.a = b2;
    }

    @Override // w17
    public final iz8 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!fs4.class.isAssignableFrom(cls)) {
                    w26.j("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (iz8) fs4.d(cls.asSubclass(fs4.class)).c(3);
                } catch (Exception e) {
                    fyb.j("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // w17
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return fs4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
