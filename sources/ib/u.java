package ib;

import java.lang.reflect.Field;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
