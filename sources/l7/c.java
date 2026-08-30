package l7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import n7.ee;
import n7.fd;
import n7.mg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class c implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(AbstractSet abstractSet, Iterator it, int i10) {
        this.a = i10;
        this.d = abstractSet;
        this.b = it;
    }

    public void a() {
        e eVar = (e) this.d;
        eVar.n();
        if (eVar.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.d;
                eVar.zzb();
                if (eVar.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                e eVar2 = (e) this.d;
                eVar2.zzb();
                if (eVar2.c != ((Collection) this.c)) {
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
                xa xaVar = (xa) this.d;
                Object key = entry.getKey();
                h hVar = (h) xaVar.e;
                Collection collection = (Collection) entry.getValue();
                hVar.getClass();
                List list = (List) collection;
                return new p(key, list instanceof RandomAccess ? new b(hVar, key, list, null) : new e(hVar, key, list, (e) null));
            case 2:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                this.c = (Collection) entry3.getValue();
                Object key2 = entry3.getKey();
                Collection collection2 = (Collection) entry3.getValue();
                mg mgVar = (mg) ((xa) this.d).e;
                mgVar.getClass();
                List list2 = (List) collection2;
                return new n7.f(key2, list2 instanceof RandomAccess ? new ee(mgVar, key2, list2, null) : new e(mgVar, key2, list2, (e) null));
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
                return ((xa) this.d).a(entry5);
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
                e eVar = (e) this.d;
                h hVar = (h) eVar.f;
                hVar.d--;
                eVar.q();
                return;
            case 1:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((h) ((xa) this.d).e).d -= ((Collection) this.c).size();
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
                ((a) this.d).c.d -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 3:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((mg) ((xa) this.d).e).getClass();
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
                ((fd) this.d).c.getClass();
                collection2.size();
                collection2.clear();
                this.c = null;
                return;
            case 5:
                this.b.remove();
                ((e) this.d).q();
                return;
            case 6:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((s8.e0) ((xa) this.d).e).e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 7:
                Map.Entry entry3 = (Map.Entry) this.c;
                if (!(entry3 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection3 = (Collection) entry3.getValue();
                this.b.remove();
                ((s8.c) this.d).c.e -= collection3.size();
                collection3.clear();
                this.c = null;
                return;
            default:
                this.b.remove();
                e eVar2 = (e) this.d;
                s8.e0 e0Var = (s8.e0) eVar2.f;
                e0Var.e--;
                eVar2.o();
                return;
        }
    }

    public c(e eVar, ListIterator listIterator) {
        this.a = 0;
        this.d = eVar;
        this.c = eVar.c;
        this.b = listIterator;
    }

    public c(e eVar, ListIterator listIterator, byte b10) {
        this.a = 5;
        this.d = eVar;
        this.c = eVar.c;
        this.b = listIterator;
    }

    public c(e eVar) {
        Iterator it;
        this.a = 0;
        this.d = eVar;
        Collection collection = eVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c(e eVar, byte b10) {
        Iterator it;
        this.a = 5;
        this.d = eVar;
        Collection collection = eVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c(xa xaVar) {
        this.a = 1;
        this.d = xaVar;
        this.b = xaVar.b.entrySet().iterator();
    }

    public c(xa xaVar, byte b10) {
        this.a = 3;
        this.d = xaVar;
        this.b = xaVar.b.entrySet().iterator();
    }

    public c(e eVar, char c3) {
        Iterator it;
        this.a = 8;
        this.d = eVar;
        Collection collection = eVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c(e eVar, ListIterator listIterator, char c3) {
        this.a = 8;
        this.d = eVar;
        this.c = eVar.c;
        this.b = listIterator;
    }

    public c(xa xaVar, char c3) {
        this.a = 6;
        this.d = xaVar;
        this.b = xaVar.b.entrySet().iterator();
    }
}
