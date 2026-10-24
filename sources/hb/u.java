package hb;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
            throw new eb.j(si.o0.h("Cannot set value of 'static final' ", jb.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // hb.t
    public final Object b(Object obj) {
        return obj;
    }
}
