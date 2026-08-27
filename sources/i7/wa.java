package i7;

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
import k7.de;
import k7.ed;
import k7.lg;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class wa extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ wa(Serializable serializable, Map map, int i10) {
        this.a = i10;
        this.e = serializable;
        this.b = map;
    }

    public p8.v a(Map.Entry entry) {
        Object key = entry.getKey();
        p8.h0 h0Var = (p8.h0) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new p8.v(key, list instanceof RandomAccess ? new p8.f(h0Var, key, list, null) : new e(h0Var, key, list, (e) null));
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
                k7.d dVar = ((lg) this.e).c;
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
                p8.h0 h0Var = (p8.h0) this.e;
                if (this.b != h0Var.d) {
                    c cVar3 = new c(this, (char) 0);
                    while (cVar3.hasNext()) {
                        cVar3.next();
                        cVar3.remove();
                    }
                    break;
                } else {
                    h0Var.b();
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
                va vaVar = (va) this.c;
                if (vaVar != null) {
                    return vaVar;
                }
                va vaVar2 = new va(this);
                this.c = vaVar2;
                return vaVar2;
            case 1:
                k7.l9 l9Var = (k7.l9) this.c;
                if (l9Var != null) {
                    return l9Var;
                }
                k7.l9 l9Var2 = new k7.l9(this);
                this.c = l9Var2;
                return l9Var2;
            default:
                p8.b bVar = (p8.b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                p8.b bVar2 = new p8.b(this);
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
                lg lgVar = (lg) this.e;
                lgVar.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new de(lgVar, obj, list2, null) : new e(lgVar, obj, list2, (e) null);
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
                p8.h0 h0Var = (p8.h0) this.e;
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new p8.f(h0Var, obj, list3, null) : new e(h0Var, obj, list3, (e) null);
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
                lg lgVar = (lg) this.e;
                ed edVar = lgVar.a;
                if (edVar != null) {
                    return edVar;
                }
                ed edVar2 = new ed(lgVar, lgVar.c);
                lgVar.a = edVar2;
                return edVar2;
            default:
                p8.h0 h0Var = (p8.h0) this.e;
                p8.c cVar = h0Var.a;
                if (cVar == null) {
                    Map map = h0Var.d;
                    cVar = map instanceof NavigableMap ? new p8.e(h0Var, (NavigableMap) map) : map instanceof SortedMap ? new p8.h(h0Var, (SortedMap) map) : new p8.c(h0Var, map);
                    h0Var.a = cVar;
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
                lg lgVar = (lg) this.e;
                Collection collection2 = (Collection) this.b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                lgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList2;
            default:
                p8.h0 h0Var = (p8.h0) this.e;
                Collection collection3 = (Collection) this.b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                List list = (List) h0Var.f.get();
                list.addAll(collection3);
                h0Var.e -= collection3.size();
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
                m mVar6 = new m(this, 6);
                this.d = mVar6;
                return mVar6;
        }
    }
}
