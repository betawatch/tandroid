package a8;

import c8.be;
import c8.cd;
import c8.jg;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class d implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public d(f fVar, ListIterator listIterator) {
        this.a = 0;
        this.d = fVar;
        this.c = fVar.c;
        this.b = listIterator;
    }

    public void a() {
        f fVar = (f) this.d;
        fVar.i();
        if (fVar.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                f fVar = (f) this.d;
                fVar.zzb();
                if (fVar.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                f fVar2 = (f) this.d;
                fVar2.zzb();
                if (fVar2.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                b();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                b();
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                b();
                return this.b.next();
            case 1:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = (Collection) entry.getValue();
                kb kbVar = (kb) this.d;
                Object key = entry.getKey();
                i iVar = (i) kbVar.e;
                Collection collection = (Collection) entry.getValue();
                iVar.getClass();
                List list = (List) collection;
                return new r(key, list instanceof RandomAccess ? new c(iVar, key, list, null) : new f(iVar, key, list, (f) null));
            case 2:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                this.c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                Collection collection2 = (Collection) entry3.getValue();
                jg jgVar = (jg) ((kb) this.d).e;
                jgVar.getClass();
                List list2 = (List) collection2;
                return new c8.f(key2, list2 instanceof RandomAccess ? new be(jgVar, key2, list2, null) : new f(jgVar, key2, list2, (f) null));
            case 4:
                Map.Entry entry4 = (Map.Entry) this.b.next();
                this.c = entry4;
                return entry4.getKey();
            case 5:
                b();
                return this.b.next();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.b.next();
                this.c = (Collection) entry5.getValue();
                return ((kb) this.d).b(entry5);
            case 7:
                Map.Entry entry6 = (Map.Entry) this.b.next();
                this.c = entry6;
                return entry6.getKey();
            default:
                a();
                return this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                f fVar = (f) this.d;
                i iVar = (i) fVar.f;
                iVar.d--;
                fVar.l();
                return;
            case 1:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((i) ((kb) this.d).e).d -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 2:
                Map.Entry entry = (Map.Entry) this.c;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.b.remove();
                ((b) this.d).c.d -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 3:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((jg) ((kb) this.d).e).getClass();
                ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 4:
                Map.Entry entry2 = (Map.Entry) this.c;
                if (!(entry2 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection2 = (Collection) entry2.getValue();
                this.b.remove();
                ((cd) this.d).c.getClass();
                collection2.size();
                collection2.clear();
                this.c = null;
                return;
            case 5:
                this.b.remove();
                ((f) this.d).l();
                return;
            case 6:
                ia.o("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                this.b.remove();
                ((h9.l1) ((kb) this.d).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 7:
                ia.o("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection3 = (Collection) ((Map.Entry) this.c).getValue();
                this.b.remove();
                ((h9.d) this.d).c.f -= collection3.size();
                collection3.clear();
                this.c = null;
                return;
            default:
                this.b.remove();
                f fVar2 = (f) this.d;
                h9.l1 l1Var = (h9.l1) fVar2.f;
                l1Var.f--;
                fVar2.j();
                return;
        }
    }

    public d(f fVar, ListIterator listIterator, byte b10) {
        this.a = 5;
        this.d = fVar;
        this.c = fVar.c;
        this.b = listIterator;
    }

    public /* synthetic */ d(AbstractSet abstractSet, Iterator it, int i7) {
        this.a = i7;
        this.d = abstractSet;
        this.b = it;
    }

    public d(f fVar) {
        Iterator it;
        this.a = 0;
        this.d = fVar;
        Collection collection = fVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d(f fVar, byte b10) {
        Iterator it;
        this.a = 5;
        this.d = fVar;
        Collection collection = fVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d(kb kbVar) {
        this.a = 1;
        this.d = kbVar;
        this.b = kbVar.b.entrySet().iterator();
    }

    public d(kb kbVar, byte b10) {
        this.a = 3;
        this.d = kbVar;
        this.b = kbVar.b.entrySet().iterator();
    }

    public d(f fVar, char c10) {
        Iterator it;
        this.a = 8;
        this.d = fVar;
        Collection collection = fVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d(f fVar, ListIterator listIterator, char c10) {
        this.a = 8;
        this.d = fVar;
        this.c = fVar.c;
        this.b = listIterator;
    }

    public d(kb kbVar, char c10) {
        this.a = 6;
        this.d = kbVar;
        this.b = kbVar.b.entrySet().iterator();
    }
}
