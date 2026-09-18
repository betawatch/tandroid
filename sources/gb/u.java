package gb;

import java.lang.reflect.Field;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
            throw new db.j(p6.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // gb.t
    public final Object b(Object obj) {
        return obj;
    }
}
