package kotlin.jvm.internal;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
