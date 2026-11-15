package kotlin.jvm.internal;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
