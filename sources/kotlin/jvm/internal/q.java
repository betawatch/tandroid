package kotlin.jvm.internal;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
