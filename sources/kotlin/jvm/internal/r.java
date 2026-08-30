package kotlin.jvm.internal;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class r {
    public static final s a;

    static {
        s sVar;
        try {
            sVar = (s) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            sVar = null;
        }
        if (sVar == null) {
            sVar = new s();
        }
        a = sVar;
    }

    public static e a(Class cls) {
        a.getClass();
        return new e(cls);
    }
}
