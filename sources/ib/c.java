package ib;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends fb.u {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(fb.g gVar, Type type, fb.u uVar, hb.n nVar) {
        this.b = new o(gVar, uVar, type);
        this.c = nVar;
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                Collection collection = (Collection) ((hb.n) this.c).U1();
                aVar.a();
                while (aVar.k()) {
                    collection.add(((fb.u) ((o) this.b).c).read(aVar));
                }
                aVar.e();
                return collection;
            default:
                Class cls = (Class) this.b;
                Object read = ((x0) this.c).c.read(aVar);
                if (read == null || cls.isInstance(read)) {
                    return read;
                }
                throw new fb.j("Expected a " + cls.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.j());
        }
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
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
