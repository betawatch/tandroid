package gb;

import java.lang.reflect.Field;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class u extends t {
    public final fb.n b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.b = nVar;
    }

    @Override // gb.t
    public final Object a() {
        return this.b.h2();
    }

    @Override // gb.t
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new db.j(p6.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // gb.t
    public final Object b(Object obj) {
        return obj;
    }
}
