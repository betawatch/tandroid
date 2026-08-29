package kotlin.jvm.internal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
