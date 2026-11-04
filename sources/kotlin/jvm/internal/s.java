package kotlin.jvm.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class s {
    public static final t a;

    static {
        t tVar;
        try {
            tVar = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            tVar = null;
        }
        if (tVar == null) {
            tVar = new t();
        }
        a = tVar;
    }

    public static e a(Class cls) {
        a.getClass();
        return new e(cls);
    }
}
