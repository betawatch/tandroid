package e9;

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
import x7.qa;
import z7.de;
import z7.ed;
import z7.l9;
import z7.lg;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class d extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ d(Serializable serializable, Map map, int i10) {
        this.a = i10;
        this.e = serializable;
        this.b = map;
    }

    public e0 a(Map.Entry entry) {
        Object key = entry.getKey();
        v0 v0Var = (v0) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new e0(key, list instanceof RandomAccess ? new h(v0Var, key, list, null) : new l(v0Var, key, list, (l) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.e;
                if (this.b != v0Var.d) {
                    c cVar = new c(this);
                    while (cVar.hasNext()) {
                        cVar.next();
                        cVar.remove();
                    }
                    break;
                } else {
                    v0Var.b();
                    break;
                }
            case 1:
                x7.f fVar = (x7.f) this.e;
                x7.j jVar = fVar.c;
                if (this.b != jVar) {
                    c cVar2 = new c(this, (byte) 0);
                    while (cVar2.hasNext()) {
                        cVar2.next();
                        cVar2.remove();
                    }
                    break;
                } else {
                    Iterator it = jVar.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    jVar.clear();
                    fVar.d = 0;
                    break;
                }
            default:
                z7.d dVar = ((lg) this.e).c;
                if (this.b != dVar) {
                    c cVar3 = new c(this, (char) 0);
                    while (cVar3.hasNext()) {
                        cVar3.next();
                        cVar3.remove();
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
                b bVar = (b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                b bVar2 = new b(this);
                this.c = bVar2;
                return bVar2;
            case 1:
                qa qaVar = (qa) this.c;
                if (qaVar != null) {
                    return qaVar;
                }
                qa qaVar2 = new qa(this);
                this.c = qaVar2;
                return qaVar2;
            default:
                l9 l9Var = (l9) this.c;
                if (l9Var != null) {
                    return l9Var;
                }
                l9 l9Var2 = new l9(this);
                this.c = l9Var2;
                return l9Var2;
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
                v0 v0Var = (v0) this.e;
                List list = (List) collection;
                return list instanceof RandomAccess ? new h(v0Var, obj, list, null) : new l(v0Var, obj, list, (l) null);
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
                x7.f fVar = (x7.f) this.e;
                fVar.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new x7.b(fVar, obj, list2, null) : new l(fVar, obj, list2, (l) null);
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
                lg lgVar = (lg) this.e;
                lgVar.getClass();
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new de(lgVar, obj, list3, null) : new l(lgVar, obj, list3, (l) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
        }
        return this.b.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.e;
                Set set = v0Var.a;
                if (set == null) {
                    Map map = v0Var.d;
                    set = map instanceof NavigableMap ? new g(v0Var, (NavigableMap) map) : map instanceof SortedMap ? new j(v0Var, (SortedMap) map) : new e(v0Var, map);
                    v0Var.a = set;
                }
                return set;
            case 1:
                x7.f fVar = (x7.f) this.e;
                x7.a aVar = fVar.a;
                if (aVar != null) {
                    return aVar;
                }
                x7.a aVar2 = new x7.a(fVar, fVar.c);
                fVar.a = aVar2;
                return aVar2;
            default:
                lg lgVar = (lg) this.e;
                ed edVar = lgVar.a;
                if (edVar != null) {
                    return edVar;
                }
                ed edVar2 = new ed(lgVar, lgVar.c);
                lgVar.a = edVar2;
                return edVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.e;
                Collection collection = (Collection) this.b.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection c10 = v0Var.c();
                c10.addAll(collection);
                v0Var.e -= collection.size();
                collection.clear();
                return c10;
            case 1:
                x7.f fVar = (x7.f) this.e;
                Collection collection2 = (Collection) this.b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                fVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                fVar.d -= collection2.size();
                collection2.clear();
                return arrayList;
            default:
                lg lgVar = (lg) this.e;
                Collection collection3 = (Collection) this.b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                lgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                collection3.size();
                collection3.clear();
                return arrayList2;
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
                n nVar = (n) this.d;
                if (nVar != null) {
                    return nVar;
                }
                n nVar2 = new n(this, 2);
                this.d = nVar2;
                return nVar2;
            case 1:
                n nVar3 = (n) this.d;
                if (nVar3 != null) {
                    return nVar3;
                }
                n nVar4 = new n(this, 4);
                this.d = nVar4;
                return nVar4;
            default:
                n nVar5 = (n) this.d;
                if (nVar5 != null) {
                    return nVar5;
                }
                n nVar6 = new n(this, 6);
                this.d = nVar6;
                return nVar6;
        }
    }
}
