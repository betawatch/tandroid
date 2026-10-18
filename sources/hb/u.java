package hb;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
