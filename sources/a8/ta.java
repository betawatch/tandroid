package a8;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class ta implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public ta(dh dhVar, ListIterator listIterator) {
        this.a = 2;
        this.d = dhVar;
        this.c = dhVar.c;
        this.b = listIterator;
    }

    public void a() {
        dh dhVar = (dh) this.d;
        dhVar.m();
        if (dhVar.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        switch (this.a) {
            case 2:
                dh dhVar = (dh) this.d;
                dhVar.zzb();
                if (dhVar.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                dh dhVar2 = (dh) this.d;
                dhVar2.zzb();
                if (dhVar2.c != ((Collection) this.c)) {
                    throw new ConcurrentModificationException();
                }
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 2:
                b();
                break;
            case 5:
                a();
                break;
            case 6:
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
                Object key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                gh ghVar = (gh) ((pb) this.d).e;
                ghVar.getClass();
                List list = (List) collection;
                return new i(key, list instanceof RandomAccess ? new le(ghVar, key, list, null) : new dh(ghVar, key, list, (dh) null));
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                b();
                return this.b.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                this.c = (Collection) entry3.getValue();
                return ((pb) this.d).a(entry3);
            case 4:
                Map.Entry entry4 = (Map.Entry) this.b.next();
                this.c = entry4;
                return entry4.getKey();
            case 5:
                a();
                return this.b.next();
            case 6:
                b();
                return this.b.next();
            case 7:
                Map.Entry entry5 = (Map.Entry) this.b.next();
                this.c = (Collection) entry5.getValue();
                pb pbVar = (pb) this.d;
                Object key2 = entry5.getKey();
                y7.e eVar = (y7.e) pbVar.e;
                Collection collection2 = (Collection) entry5.getValue();
                eVar.getClass();
                List list2 = (List) collection2;
                return new y7.k(key2, list2 instanceof RandomAccess ? new y7.b(eVar, key2, list2, null) : new dh(eVar, key2, list2, (dh) null));
            default:
                Map.Entry entry6 = (Map.Entry) this.b.next();
                this.c = entry6;
                return entry6.getKey();
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
                ((gh) ((pb) this.d).e).getClass();
                ((Collection) this.c).size();
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
                ((nd) this.d).c.getClass();
                collection.size();
                collection.clear();
                this.c = null;
                return;
            case 2:
                this.b.remove();
                ((dh) this.d).p();
                return;
            case 3:
                yb.o("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                this.b.remove();
                ((f9.k1) ((pb) this.d).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 4:
                yb.o("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection2 = (Collection) ((Map.Entry) this.c).getValue();
                this.b.remove();
                ((f9.d) this.d).c.f -= collection2.size();
                collection2.clear();
                this.c = null;
                return;
            case 5:
                this.b.remove();
                dh dhVar = (dh) this.d;
                f9.k1 k1Var = (f9.k1) dhVar.f;
                k1Var.f--;
                dhVar.n();
                return;
            case 6:
                this.b.remove();
                dh dhVar2 = (dh) this.d;
                y7.e eVar = (y7.e) dhVar2.f;
                eVar.d--;
                dhVar2.p();
                return;
            case 7:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((y7.e) ((pb) this.d).e).d -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            default:
                Map.Entry entry2 = (Map.Entry) this.c;
                if (!(entry2 != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection3 = (Collection) entry2.getValue();
                this.b.remove();
                ((y7.a) this.d).c.d -= collection3.size();
                collection3.clear();
                this.c = null;
                return;
        }
    }

    public ta(dh dhVar, ListIterator listIterator, char c10) {
        this.a = 6;
        this.d = dhVar;
        this.c = dhVar.c;
        this.b = listIterator;
    }

    public /* synthetic */ ta(AbstractSet abstractSet, Iterator it, int i10) {
        this.a = i10;
        this.d = abstractSet;
        this.b = it;
    }

    public ta(pb pbVar) {
        this.a = 0;
        this.d = pbVar;
        this.b = pbVar.b.entrySet().iterator();
    }

    public ta(pb pbVar, char c10) {
        this.a = 7;
        this.d = pbVar;
        this.b = pbVar.b.entrySet().iterator();
    }

    public ta(dh dhVar) {
        Iterator it;
        this.a = 2;
        this.d = dhVar;
        Collection collection = dhVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public ta(dh dhVar, char c10) {
        Iterator it;
        this.a = 6;
        this.d = dhVar;
        Collection collection = dhVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public ta(dh dhVar, byte b10) {
        Iterator it;
        this.a = 5;
        this.d = dhVar;
        Collection collection = dhVar.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public ta(dh dhVar, ListIterator listIterator, byte b10) {
        this.a = 5;
        this.d = dhVar;
        this.c = dhVar.c;
        this.b = listIterator;
    }

    public ta(pb pbVar, byte b10) {
        this.a = 3;
        this.d = pbVar;
        this.b = pbVar.b.entrySet().iterator();
    }
}
