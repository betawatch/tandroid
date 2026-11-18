package androidx.lifecycle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class q0 implements s0 {
    public static final q0 a = new q0();
    public static final q0 b = new q0();
    public static q0 c;

    @Override // androidx.lifecycle.s0
    public p0 f(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.j.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (p0) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    @Override // androidx.lifecycle.s0
    public p0 g(Class cls, y1.b bVar) {
        return f(cls);
    }
}
