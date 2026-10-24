package hb;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c extends eb.u {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(eb.g gVar, Type type, eb.u uVar, gb.n nVar) {
        this.b = new o(gVar, uVar, type);
        this.c = nVar;
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((gb.n) this.c).f2();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((eb.u) ((o) this.b).c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.b;
                Object read = ((x0) this.c).c.read(aVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                throw new eb.j("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
        }
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
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
