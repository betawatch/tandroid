package hb;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class u extends t {
    public final gb.n b;

    public u(gb.n nVar, v vVar) {
        super(vVar);
        this.b = nVar;
    }

    @Override // hb.t
    public final Object a() {
        return this.b.f2();
    }

    @Override // hb.t
    public final void c(Object obj, mb.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new eb.j(r4.c.h("Cannot set value of 'static final' ", jb.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // hb.t
    public final Object b(Object obj) {
        return obj;
    }
}
