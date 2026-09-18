package gb;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
            throw new db.j(t8.b.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // gb.t
    public final Object b(Object obj) {
        return obj;
    }
}
