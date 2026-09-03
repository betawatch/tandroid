package kotlin.jvm.internal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
