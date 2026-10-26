package ib;

import java.lang.reflect.Field;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u extends t {
    public final hb.n b;

    public u(hb.n nVar, v vVar) {
        super(vVar);
        this.b = nVar;
    }

    @Override // ib.t
    public final Object a() {
        return this.b.U1();
    }

    @Override // ib.t
    public final void c(Object obj, nb.a aVar, s sVar) {
        Field field = sVar.b;
        Object read = sVar.f.read(aVar);
        if (read == null && sVar.g) {
            return;
        }
        if (sVar.h) {
            throw new fb.j(b10.j("Cannot set value of 'static final' ", kb.c.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // ib.t
    public final Object b(Object obj) {
        return obj;
    }
}
