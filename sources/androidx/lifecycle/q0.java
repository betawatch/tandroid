package androidx.lifecycle;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class q0 implements s0 {
    public static final q0 a = new q0();
    public static final q0 b = new q0();
    public static q0 c;

    @Override // androidx.lifecycle.s0
    public p0 b(Class cls) {
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
    public p0 p(Class cls, v1.b bVar) {
        return b(cls);
    }
}
