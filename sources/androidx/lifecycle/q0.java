package androidx.lifecycle;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }

    @Override // androidx.lifecycle.s0
    public p0 x(Class cls, v1.b bVar) {
        return f(cls);
    }
}
