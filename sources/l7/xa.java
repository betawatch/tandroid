package l7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import n7.ee;
import n7.fd;
import n7.mg;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class xa extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ xa(Serializable serializable, Map map, int i10) {
        this.a = i10;
        this.e = serializable;
        this.b = map;
    }

    public s8.r a(Map.Entry entry) {
        Object key = entry.getKey();
        s8.e0 e0Var = (s8.e0) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new s8.r(key, list instanceof RandomAccess ? new s8.f(e0Var, key, list, null) : new e(e0Var, key, list, (e) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.e;
                n nVar = hVar.c;
                if (this.b != nVar) {
                    c cVar = new c(this);
                    while (cVar.hasNext()) {
                        cVar.next();
                        cVar.remove();
                    }
                    break;
                } else {
                    Iterator it = nVar.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    nVar.clear();
                    hVar.d = 0;
                    break;
                }
            case 1:
                n7.d dVar = ((mg) this.e).c;
                if (this.b != dVar) {
                    c cVar2 = new c(this, (byte) 0);
                    while (cVar2.hasNext()) {
                        cVar2.next();
                        cVar2.remove();
                    }
                    break;
                } else {
                    Iterator it2 = dVar.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    dVar.clear();
                    break;
                }
            default:
                s8.e0 e0Var = (s8.e0) this.e;
                if (this.b != e0Var.d) {
                    c cVar3 = new c(this, (char) 0);
                    while (cVar3.hasNext()) {
                        cVar3.next();
                        cVar3.remove();
                    }
                    break;
                } else {
                    e0Var.b();
                    break;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map map = this.b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                Map map2 = this.b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                Map map3 = this.b;
                map3.getClass();
                try {
                    return map3.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                wa waVar = (wa) this.c;
                if (waVar != null) {
                    return waVar;
                }
                wa waVar2 = new wa(this);
                this.c = waVar2;
                return waVar2;
            case 1:
                n7.l9 l9Var = (n7.l9) this.c;
                if (l9Var != null) {
                    return l9Var;
                }
                n7.l9 l9Var2 = new n7.l9(this);
                this.c = l9Var2;
                return l9Var2;
            default:
                s8.b bVar = (s8.b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                s8.b bVar2 = new s8.b(this);
                this.c = bVar2;
                return bVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this == obj || this.b.equals(obj)) {
                }
                break;
            case 1:
                if (this == obj || this.b.equals(obj)) {
                }
                break;
            default:
                if (this == obj || this.b.equals(obj)) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.a) {
            case 0:
                Map map = this.b;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                h hVar = (h) this.e;
                hVar.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new b(hVar, obj, list, null) : new e(hVar, obj, list, (e) null);
            case 1:
                Map map2 = this.b;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                mg mgVar = (mg) this.e;
                mgVar.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new ee(mgVar, obj, list2, null) : new e(mgVar, obj, list2, (e) null);
            default:
                Map map3 = this.b;
                map3.getClass();
                try {
                    obj4 = map3.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 == null) {
                    return null;
                }
                s8.e0 e0Var = (s8.e0) this.e;
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new s8.f(e0Var, obj, list3, null) : new e(e0Var, obj, list3, (e) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                return this.b.hashCode();
            case 1:
                return this.b.hashCode();
            default:
                return this.b.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.e;
                a aVar = hVar.a;
                if (aVar != null) {
                    return aVar;
                }
                a aVar2 = new a(hVar, hVar.c);
                hVar.a = aVar2;
                return aVar2;
            case 1:
                mg mgVar = (mg) this.e;
                fd fdVar = mgVar.a;
                if (fdVar != null) {
                    return fdVar;
                }
                fd fdVar2 = new fd(mgVar, mgVar.c);
                mgVar.a = fdVar2;
                return fdVar2;
            default:
                s8.e0 e0Var = (s8.e0) this.e;
                s8.c cVar = e0Var.a;
                if (cVar == null) {
                    Map map = e0Var.d;
                    cVar = map instanceof NavigableMap ? new s8.e(e0Var, (NavigableMap) map) : map instanceof SortedMap ? new s8.h(e0Var, (SortedMap) map) : new s8.c(e0Var, map);
                    e0Var.a = cVar;
                }
                return cVar;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.e;
                Collection collection = (Collection) this.b.remove(obj);
                if (collection == null) {
                    return null;
                }
                hVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                hVar.d -= collection.size();
                collection.clear();
                return arrayList;
            case 1:
                mg mgVar = (mg) this.e;
                Collection collection2 = (Collection) this.b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                mgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList2;
            default:
                s8.e0 e0Var = (s8.e0) this.e;
                Collection collection3 = (Collection) this.b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                List list = (List) e0Var.f.get();
                list.addAll(collection3);
                e0Var.e -= collection3.size();
                collection3.clear();
                return list;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
        }
        return this.b.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                m mVar = (m) this.d;
                if (mVar != null) {
                    return mVar;
                }
                m mVar2 = new m(this, 1);
                this.d = mVar2;
                return mVar2;
            case 1:
                m mVar3 = (m) this.d;
                if (mVar3 != null) {
                    return mVar3;
                }
                m mVar4 = new m(this, 3);
                this.d = mVar4;
                return mVar4;
            default:
                m mVar5 = (m) this.d;
                if (mVar5 != null) {
                    return mVar5;
                }
                m mVar6 = new m(this, 5);
                this.d = mVar6;
                return mVar6;
        }
    }
}
