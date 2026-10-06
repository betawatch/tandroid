package kotlin.jvm.internal;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
