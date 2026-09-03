package androidx.lifecycle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class q0 implements s0 {
    public static final q0 a = new q0();
    public static final q0 b = new q0();
    public static q0 c;

    @Override // androidx.lifecycle.s0
    public p0 C(Class cls, v1.b bVar) {
        return h(cls);
    }

    @Override // androidx.lifecycle.s0
    public p0 h(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.j.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (p0) newInstance;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }
}
