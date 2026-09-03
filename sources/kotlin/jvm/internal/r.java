package kotlin.jvm.internal;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
