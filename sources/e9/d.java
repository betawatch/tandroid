package e9;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import v7.u6;
import z7.fe;
import z7.gd;
import z7.ng;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class d implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public d(m mVar, ListIterator listIterator, byte b10) {
        this.a = 3;
        this.d = mVar;
        this.c = mVar.c;
        this.b = listIterator;
    }

    public void a() {
        m mVar = (m) this.d;
        mVar.m();
        if (mVar.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        switch (this.a) {
            case 3:
                m mVar = (m) this.d;
                mVar.zzb();
                if (mVar.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                m mVar2 = (m) this.d;
                mVar2.zzb();
                if (mVar2.c != ((Collection) this.c)) {
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
                return ((e) this.d).a(entry);
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
                e eVar = (e) this.d;
                Object key = entry3.getKey();
                x7.f fVar = (x7.f) eVar.e;
                Collection collection = (Collection) entry3.getValue();
                fVar.getClass();
                List list = (List) collection;
                return new x7.l(key, list instanceof RandomAccess ? new x7.b(fVar, key, list, null) : new m(fVar, key, list, (m) null));
            case 5:
                Map.Entry entry4 = (Map.Entry) this.b.next();
                this.c = entry4;
                return entry4.getKey();
            case 6:
                Map.Entry entry5 = (Map.Entry) this.b.next();
                this.c = (Collection) entry5.getValue();
                Object key2 = entry5.getKey();
                Collection collection2 = (Collection) entry5.getValue();
                ng ngVar = (ng) ((e) this.d).e;
                ngVar.getClass();
                List list2 = (List) collection2;
                return new z7.f(key2, list2 instanceof RandomAccess ? new fe(ngVar, key2, list2, null) : new m(ngVar, key2, list2, (m) null));
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
                u6.o("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                this.b.remove();
                ((p1) ((e) this.d).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                u6.o("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                this.b.remove();
                ((f) this.d).c.f -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 2:
                this.b.remove();
                m mVar = (m) this.d;
                p1 p1Var = (p1) mVar.f;
                p1Var.f--;
                mVar.n();
                return;
            case 3:
                this.b.remove();
                m mVar2 = (m) this.d;
                x7.f fVar = (x7.f) mVar2.f;
                fVar.d--;
                mVar2.p();
                return;
            case 4:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((x7.f) ((e) this.d).e).d -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 5:
                Map.Entry entry = (Map.Entry) this.c;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection2 = (Collection) entry.getValue();
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
                ((ng) ((e) this.d).e).getClass();
                ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 7:
                Map.Entry entry2 = (Map.Entry) this.c;
                if (!(entry2 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection3 = (Collection) entry2.getValue();
                this.b.remove();
                ((gd) this.d).c.getClass();
                collection3.size();
                collection3.clear();
                this.c = null;
                return;
            default:
                this.b.remove();
                ((m) this.d).p();
                return;
        }
    }

    public d(m mVar, ListIterator listIterator, char c10) {
        this.a = 8;
        this.d = mVar;
        this.c = mVar.c;
        this.b = listIterator;
    }

    public /* synthetic */ d(AbstractSet abstractSet, Iterator it, int i10) {
        this.a = i10;
        this.b = it;
        this.d = abstractSet;
    }

    public d(e eVar, byte b10) {
        this.a = 4;
        this.d = eVar;
        this.b = eVar.b.entrySet().iterator();
    }

    public d(e eVar, char c10) {
        this.a = 6;
        this.d = eVar;
        this.b = eVar.b.entrySet().iterator();
    }

    public d(m mVar, byte b10) {
        Iterator it;
        this.a = 3;
        this.d = mVar;
        Collection collection = mVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d(m mVar, char c10) {
        Iterator it;
        this.a = 8;
        this.d = mVar;
        Collection collection = mVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d(m mVar) {
        Iterator it;
        this.a = 2;
        this.d = mVar;
        Collection collection = mVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public d(m mVar, ListIterator listIterator) {
        this.a = 2;
        this.d = mVar;
        this.c = mVar.c;
        this.b = listIterator;
    }

    public d(e eVar) {
        this.a = 0;
        this.d = eVar;
        this.b = eVar.b.entrySet().iterator();
    }
}
