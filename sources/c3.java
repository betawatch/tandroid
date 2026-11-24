// default package

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class c3 implements Iterator {
    public final /* synthetic */ byte a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public c3(l3 l3Var, byte b) {
        this.a = (byte) 3;
        this.d = l3Var;
        Collection collection = l3Var.c;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void a() {
        l3 l3Var = (l3) this.d;
        l3Var.i();
        if (l3Var.c == ((Collection) this.c)) {
            return;
        }
        zf.b();
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 3:
                l3 l3Var = (l3) obj;
                l3Var.zzb();
                if (l3Var.c != ((Collection) this.c)) {
                    zf.b();
                    break;
                }
                break;
            default:
                l3 l3Var2 = (l3) obj;
                l3Var2.zzb();
                if (l3Var2.c != ((Collection) this.c)) {
                    zf.b();
                    break;
                }
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 2:
                a();
                break;
            case 3:
                b();
                break;
            case 5:
                b();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((d3) obj).b(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return it.next();
            case 3:
                b();
                return it.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                vhf vhfVar = (vhf) ((d3) obj).e;
                List list = (List) collection;
                return new a9d(key, list instanceof RandomAccess ? new abf(vhfVar, key, list, null) : new l3(vhfVar, key, list, (l3) null));
            case 5:
                b();
                return it.next();
            case 6:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = (Collection) entry4.getValue();
                Object key2 = entry4.getKey();
                j7d j7dVar = (j7d) ((d3) obj).e;
                List list2 = (List) ((Collection) entry4.getValue());
                return new tbd(key2, list2 instanceof RandomAccess ? new k5d(j7dVar, key2, list2, null) : new l3(j7dVar, key2, list2, (l3) null));
            default:
                Map.Entry entry5 = (Map.Entry) it.next();
                this.c = entry5;
                return entry5.getKey();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (b) {
            case 0:
                gre.o("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((wg7) ((d3) obj).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                gre.o("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((e3) obj).c.f -= collection.size();
                collection.clear();
                this.c = null;
                break;
            case 2:
                it.remove();
                l3 l3Var = (l3) obj;
                ((wg7) l3Var.f).f--;
                l3Var.j();
                break;
            case 3:
                it.remove();
                l3 l3Var2 = (l3) obj;
                j7d j7dVar = (j7d) l3Var2.f;
                j7dVar.d--;
                l3Var2.l();
                break;
            case 4:
                if (!(((Collection) this.c) != null)) {
                    sc8.j("no calls to next() since the last call to remove()");
                    break;
                } else {
                    it.remove();
                    ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    break;
                }
            case 5:
                it.remove();
                ((l3) obj).l();
                break;
            case 6:
                if (!(((Collection) this.c) != null)) {
                    sc8.j("no calls to next() since the last call to remove()");
                    break;
                } else {
                    it.remove();
                    ((j7d) ((d3) obj).e).d -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    break;
                }
            default:
                Map.Entry entry = (Map.Entry) this.c;
                if (!(entry != null)) {
                    sc8.j("no calls to next() since the last call to remove()");
                    break;
                } else {
                    Collection collection2 = (Collection) entry.getValue();
                    it.remove();
                    ((d5d) obj).c.d -= collection2.size();
                    collection2.clear();
                    this.c = null;
                    break;
                }
        }
    }

    public c3(l3 l3Var, ListIterator listIterator, char c) {
        this.a = (byte) 5;
        this.d = l3Var;
        this.c = l3Var.c;
        this.b = listIterator;
    }

    public /* synthetic */ c3(AbstractSet abstractSet, Iterator it, byte b) {
        this.a = b;
        this.b = it;
        this.d = abstractSet;
    }

    public c3(d3 d3Var, byte b) {
        this.a = (byte) 4;
        this.d = d3Var;
        this.b = ((so2) d3Var.d).entrySet().iterator();
    }

    public c3(d3 d3Var, char c) {
        this.a = (byte) 6;
        this.d = d3Var;
        this.b = ((so2) d3Var.d).entrySet().iterator();
    }

    public c3(l3 l3Var, ListIterator listIterator, byte b) {
        this.a = (byte) 3;
        this.d = l3Var;
        this.c = l3Var.c;
        this.b = listIterator;
    }

    public c3(l3 l3Var, char c) {
        Iterator it;
        this.a = (byte) 5;
        this.d = l3Var;
        Collection collection = l3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c3(l3 l3Var) {
        Iterator it;
        this.a = (byte) 2;
        this.d = l3Var;
        Collection collection = l3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c3(l3 l3Var, ListIterator listIterator) {
        this.a = (byte) 2;
        this.d = l3Var;
        this.c = l3Var.c;
        this.b = listIterator;
    }

    public c3(d3 d3Var) {
        this.a = (byte) 0;
        this.d = d3Var;
        this.b = d3Var.d.entrySet().iterator();
    }
}
