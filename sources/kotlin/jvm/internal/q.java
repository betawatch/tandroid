package kotlin.jvm.internal;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public abstract class q {
    public static final r a;

    static {
        r rVar;
        try {
            rVar = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            rVar = null;
        }
        if (rVar == null) {
            rVar = new r();
        }
        a = rVar;
    }

    public static d a(Class cls) {
        a.getClass();
        return new d(cls);
    }
}
