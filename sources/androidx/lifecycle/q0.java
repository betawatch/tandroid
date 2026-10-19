package androidx.lifecycle;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class q0 implements s0 {
    public static final q0 a = new q0();
    public static final q0 b = new q0();
    public static q0 c;

    @Override // androidx.lifecycle.s0
    public p0 W0(Class cls, v1.b bVar) {
        return f(cls);
    }

    @Override // androidx.lifecycle.s0
    public p0 f(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.i.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (p0) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }
}
