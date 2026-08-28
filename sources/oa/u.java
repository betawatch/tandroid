package oa;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u extends t {
    public final na.n b;

    public u(na.n nVar, v vVar) {
        super(vVar);
        this.b = nVar;
    }

    @Override // oa.t
    public final Object a() {
        return this.b.Y1();
    }

    @Override // oa.t
    public final void c(Object obj, ta.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new la.j(ta.b.d("Cannot set value of 'static final' ", qa.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // oa.t
    public final Object b(Object obj) {
        return obj;
    }
}
