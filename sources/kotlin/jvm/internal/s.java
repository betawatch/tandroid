package kotlin.jvm.internal;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
