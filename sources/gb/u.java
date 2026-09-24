package gb;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class u extends t {
    public final fb.n b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.b = nVar;
    }

    @Override // gb.t
    public final Object a() {
        return this.b.p2();
    }

    @Override // gb.t
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new db.j(v7.j.g("Cannot set value of 'static final' ", ib.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // gb.t
    public final Object b(Object obj) {
        return obj;
    }
}
