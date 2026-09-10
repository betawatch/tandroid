package kotlin.jvm.internal;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
