package oa;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends la.u {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(la.g gVar, Type type, la.u uVar, na.n nVar) {
        this.b = new o(gVar, uVar, type);
        this.c = nVar;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((na.n) this.c).Y1();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((la.u) ((o) this.b).c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.b;
                Object read = ((x0) this.c).c.read(aVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                throw new la.j("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    cVar.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((o) this.b).write(cVar, it.next());
                    }
                    cVar.e();
                    break;
                } else {
                    cVar.i();
                    break;
                }
            default:
                ((x0) this.c).c.write(cVar, obj);
                break;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.c = x0Var;
        this.b = cls;
    }
}
