package gb;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends db.u {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(db.g gVar, Type type, db.u uVar, fb.n nVar) {
        this.b = new o(gVar, uVar, type);
        this.c = nVar;
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((fb.n) this.c).h2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((db.u) ((o) this.b).c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.b;
                Object read = ((x0) this.c).c.read(aVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                throw new db.j("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((o) this.b).write(bVar, it.next());
                    }
                    bVar.e();
                    break;
                } else {
                    bVar.i();
                    break;
                }
            default:
                ((x0) this.c).c.write(bVar, obj);
                break;
        }
    }

    public c(x0 x0Var, Class cls) {
        this.c = x0Var;
        this.b = cls;
    }
}
