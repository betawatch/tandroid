package h7;

import j7.de;
import j7.ed;
import j7.lg;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class c implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public c(e eVar, ListIterator listIterator) {
        this.a = 0;
        this.d = eVar;
        this.c = eVar.c;
        this.b = listIterator;
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
                wa waVar = (wa) this.d;
                Object key = entry.getKey();
                h hVar = (h) waVar.e;
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
                lg lgVar = (lg) ((wa) this.d).e;
                lgVar.getClass();
                List list2 = (List) collection2;
                return new j7.f(key2, list2 instanceof RandomAccess ? new de(lgVar, key2, list2, null) : new e(lgVar, key2, list2, (e) null));
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
                return ((wa) this.d).a(entry5);
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
                ((h) ((wa) this.d).e).d -= ((Collection) this.c).size();
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
                ((lg) ((wa) this.d).e).getClass();
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
                ((ed) this.d).c.getClass();
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
                ((o8.h0) ((wa) this.d).e).e -= ((Collection) this.c).size();
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
                ((o8.c) this.d).c.e -= collection3.size();
                collection3.clear();
                this.c = null;
                return;
            default:
                this.b.remove();
                e eVar2 = (e) this.d;
                o8.h0 h0Var = (o8.h0) eVar2.f;
                h0Var.e--;
                eVar2.o();
                return;
        }
    }

    public c(e eVar, ListIterator listIterator, byte b10) {
        this.a = 5;
        this.d = eVar;
        this.c = eVar.c;
        this.b = listIterator;
    }

    public /* synthetic */ c(AbstractSet abstractSet, Iterator it, int i9) {
        this.a = i9;
        this.d = abstractSet;
        this.b = it;
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

    public c(wa waVar) {
        this.a = 1;
        this.d = waVar;
        this.b = waVar.b.entrySet().iterator();
    }

    public c(wa waVar, byte b10) {
        this.a = 3;
        this.d = waVar;
        this.b = waVar.b.entrySet().iterator();
    }

    public c(e eVar, char c10) {
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

    public c(e eVar, ListIterator listIterator, char c10) {
        this.a = 8;
        this.d = eVar;
        this.c = eVar.c;
        this.b = listIterator;
    }

    public c(wa waVar, char c10) {
        this.a = 6;
        this.d = waVar;
        this.b = waVar.b.entrySet().iterator();
    }
}
