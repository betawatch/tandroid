package hb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class v0 implements eb.v {
    @Override // eb.v
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new o(cls);
    }
}
