package gb;

import java.lang.reflect.Field;
import org.telegram.ui.Cells.q3;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
            throw new db.j(q3.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // gb.t
    public final Object b(Object obj) {
        return obj;
    }
}
