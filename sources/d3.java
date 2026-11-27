// default package

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class d3 implements Iterator {
    public final /* synthetic */ byte a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public d3(m3 m3Var, byte b) {
        this.a = (byte) 3;
        this.d = m3Var;
        Collection collection = m3Var.c;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void a() {
        m3 m3Var = (m3) this.d;
        m3Var.i();
        if (m3Var.c == ((Collection) this.c)) {
            return;
        }
        bg.b();
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 3:
                m3 m3Var = (m3) obj;
                m3Var.zzb();
                if (m3Var.c != ((Collection) this.c)) {
                    bg.b();
                    break;
                }
                break;
            default:
                m3 m3Var2 = (m3) obj;
                m3Var2.zzb();
                if (m3Var2.c != ((Collection) this.c)) {
                    bg.b();
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
                return ((e3) obj).b(entry);
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
                lmf lmfVar = (lmf) ((e3) obj).e;
                List list = (List) collection;
                return new tdd(key, list instanceof RandomAccess ? new qff(lmfVar, key, list, null) : new m3(lmfVar, key, list, (m3) null));
            case 5:
                b();
                return it.next();
            case 6:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = (Collection) entry4.getValue();
                Object key2 = entry4.getKey();
                ccd ccdVar = (ccd) ((e3) obj).e;
                List list2 = (List) ((Collection) entry4.getValue());
                return new mgd(key2, list2 instanceof RandomAccess ? new dad(ccdVar, key2, list2, null) : new m3(ccdVar, key2, list2, (m3) null));
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
                yve.o("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((fj7) ((e3) obj).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                yve.o("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((f3) obj).c.f -= collection.size();
                collection.clear();
                this.c = null;
                break;
            case 2:
                it.remove();
                m3 m3Var = (m3) obj;
                ((fj7) m3Var.f).f--;
                m3Var.j();
                break;
            case 3:
                it.remove();
                m3 m3Var2 = (m3) obj;
                ccd ccdVar = (ccd) m3Var2.f;
                ccdVar.d--;
                m3Var2.l();
                break;
            case 4:
                if (!(((Collection) this.c) != null)) {
                    grb.i("no calls to next() since the last call to remove()");
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
                ((m3) obj).l();
                break;
            case 6:
                if (!(((Collection) this.c) != null)) {
                    grb.i("no calls to next() since the last call to remove()");
                    break;
                } else {
                    it.remove();
                    ((ccd) ((e3) obj).e).d -= ((Collection) this.c).size();
                    ((Collection) this.c).clear();
                    this.c = null;
                    break;
                }
            default:
                Map.Entry entry = (Map.Entry) this.c;
                if (!(entry != null)) {
                    grb.i("no calls to next() since the last call to remove()");
                    break;
                } else {
                    Collection collection2 = (Collection) entry.getValue();
                    it.remove();
                    ((w9d) obj).c.d -= collection2.size();
                    collection2.clear();
                    this.c = null;
                    break;
                }
        }
    }

    public d3(m3 m3Var, ListIterator listIterator, char c) {
        this.a = (byte) 5;
        this.d = m3Var;
        this.c = m3Var.c;
        this.b = listIterator;
    }

    public /* synthetic */ d3(AbstractSet abstractSet, Iterator it, byte b) {
        this.a = b;
        this.b = it;
        this.d = abstractSet;
    }

    public d3(e3 e3Var, byte b) {
        this.a = (byte) 4;
        this.d = e3Var;
        this.b = ((lp2) e3Var.d).entrySet().iterator();
    }

    public d3(e3 e3Var, char c) {
        this.a = (byte) 6;
        this.d = e3Var;
        this.b = ((lp2) e3Var.d).entrySet().iterator();
    }

    public d3(m3 m3Var, ListIterator listIterator, byte b) {
        this.a = (byte) 3;
        this.d = m3Var;
        this.c = m3Var.c;
        this.b = listIterator;
    }

    public d3(m3 m3Var, char c) {
        Iterator it;
        this.a = (byte) 5;
        this.d = m3Var;
        Collection collection = m3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d3(m3 m3Var) {
        Iterator it;
        this.a = (byte) 2;
        this.d = m3Var;
        Collection collection = m3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d3(m3 m3Var, ListIterator listIterator) {
        this.a = (byte) 2;
        this.d = m3Var;
        this.c = m3Var.c;
        this.b = listIterator;
    }

    public d3(e3 e3Var) {
        this.a = (byte) 0;
        this.d = e3Var;
        this.b = e3Var.d.entrySet().iterator();
    }
}
