package oa;

import g7.t6;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class t extends la.u {
    public final v a;

    public t(v vVar) {
        this.a = vVar;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, ta.a aVar, s sVar);

    @Override // la.u
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        Object a2 = a();
        Map map = this.a.a;
        try {
            aVar.b();
            while (aVar.k()) {
                s sVar = (s) map.get(aVar.r());
                if (sVar == null) {
                    aVar.C();
                } else {
                    c(a2, aVar, sVar);
                }
            }
            aVar.f();
            return b(a2);
        } catch (IllegalAccessException e10) {
            t6 t6Var = qa.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new la.j(e11);
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        if (obj == null) {
            cVar.i();
            return;
        }
        cVar.c();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(cVar, obj);
            }
            cVar.f();
        } catch (IllegalAccessException e10) {
            t6 t6Var = qa.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }
}
