package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import z7.de;
import z7.ed;
import z7.lg;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class c implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public c(l lVar, ListIterator listIterator, byte b10) {
        this.a = 3;
        this.d = lVar;
        this.c = lVar.c;
        this.b = listIterator;
    }

    public void a() {
        l lVar = (l) this.d;
        lVar.n();
        if (lVar.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        switch (this.a) {
            case 3:
                l lVar = (l) this.d;
                lVar.zzb();
                if (lVar.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                l lVar2 = (l) this.d;
                lVar2.zzb();
                if (lVar2.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                a();
                break;
            case 3:
                b();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                b();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = (Collection) entry.getValue();
                return ((d) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.b.next();
            case 3:
                b();
                return this.b.next();
            case 4:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                this.c = (Collection) entry3.getValue();
                d dVar = (d) this.d;
                Object key = entry3.getKey();
                x7.f fVar = (x7.f) dVar.e;
                Collection collection = (Collection) entry3.getValue();
                fVar.getClass();
                List list = (List) collection;
                return new x7.l(key, list instanceof RandomAccess ? new x7.b(fVar, key, list, null) : new l(fVar, key, list, (l) null));
            case 5:
                Map.Entry entry4 = (Map.Entry) this.b.next();
                this.c = entry4;
                return entry4.getKey();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.b.next();
                this.c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                Collection collection2 = (Collection) entry5.getValue();
                lg lgVar = (lg) ((d) this.d).e;
                lgVar.getClass();
                List list2 = (List) collection2;
                return new z7.f(key2, list2 instanceof RandomAccess ? new de(lgVar, key2, list2, null) : new l(lgVar, key2, list2, (l) null));
            case 7:
                Map.Entry entry6 = (Map.Entry) this.b.next();
                this.c = entry6;
                return entry6.getKey();
            default:
                b();
                return this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((v0) ((d) this.d).e).e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.c;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.b.remove();
                ((e) this.d).c.e -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 2:
                this.b.remove();
                l lVar = (l) this.d;
                v0 v0Var = (v0) lVar.f;
                v0Var.e--;
                lVar.o();
                return;
            case 3:
                this.b.remove();
                l lVar2 = (l) this.d;
                x7.f fVar = (x7.f) lVar2.f;
                fVar.d--;
                lVar2.q();
                return;
            case 4:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((x7.f) ((d) this.d).e).d -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 5:
                Map.Entry entry2 = (Map.Entry) this.c;
                if (!(entry2 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection2 = (Collection) entry2.getValue();
                this.b.remove();
                ((x7.a) this.d).c.d -= collection2.size();
                collection2.clear();
                this.c = null;
                return;
            case 6:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((lg) ((d) this.d).e).getClass();
                ((Collection) this.c).size();
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
                ((ed) this.d).c.getClass();
                collection3.size();
                collection3.clear();
                this.c = null;
                return;
            default:
                this.b.remove();
                ((l) this.d).q();
                return;
        }
    }

    public c(l lVar, ListIterator listIterator, char c10) {
        this.a = 8;
        this.d = lVar;
        this.c = lVar.c;
        this.b = listIterator;
    }

    public /* synthetic */ c(AbstractSet abstractSet, Iterator it, int i10) {
        this.a = i10;
        this.b = it;
        this.d = abstractSet;
    }

    public c(d dVar, byte b10) {
        this.a = 4;
        this.d = dVar;
        this.b = dVar.b.entrySet().iterator();
    }

    public c(d dVar, char c10) {
        this.a = 6;
        this.d = dVar;
        this.b = dVar.b.entrySet().iterator();
    }

    public c(l lVar, byte b10) {
        Iterator it;
        this.a = 3;
        this.d = lVar;
        Collection collection = lVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c(l lVar, char c10) {
        Iterator it;
        this.a = 8;
        this.d = lVar;
        Collection collection = lVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c(l lVar) {
        Iterator it;
        this.a = 2;
        this.d = lVar;
        Collection collection = lVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public c(l lVar, ListIterator listIterator) {
        this.a = 2;
        this.d = lVar;
        this.c = lVar.c;
        this.b = listIterator;
    }

    public c(d dVar) {
        this.a = 0;
        this.d = dVar;
        this.b = dVar.b.entrySet().iterator();
    }
}
