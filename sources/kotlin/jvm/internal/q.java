package kotlin.jvm.internal;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
