package a8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class pb extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ pb(Serializable serializable, Map map, int i10) {
        this.a = i10;
        this.e = serializable;
        this.b = map;
    }

    public f9.e0 a(Map.Entry entry) {
        Object key = entry.getKey();
        f9.k1 k1Var = (f9.k1) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new f9.e0(key, list instanceof RandomAccess ? new f9.g(k1Var, key, list, null) : new dh(k1Var, key, list, (dh) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                g gVar = ((gh) this.e).c;
                if (this.b != gVar) {
                    ta taVar = new ta(this);
                    while (taVar.hasNext()) {
                        taVar.next();
                        taVar.remove();
                    }
                    break;
                } else {
                    Iterator it = gVar.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    gVar.clear();
                    break;
                }
            case 1:
                f9.k1 k1Var = (f9.k1) this.e;
                if (this.b != k1Var.e) {
                    ta taVar2 = new ta(this, (byte) 0);
                    while (taVar2.hasNext()) {
                        taVar2.next();
                        taVar2.remove();
                    }
                    break;
                } else {
                    k1Var.clear();
                    break;
                }
            default:
                y7.e eVar = (y7.e) this.e;
                y7.i iVar = eVar.c;
                if (this.b != iVar) {
                    ta taVar3 = new ta(this, (char) 0);
                    while (taVar3.hasNext()) {
                        taVar3.next();
                        taVar3.remove();
                    }
                    break;
                } else {
                    Iterator it2 = iVar.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    iVar.clear();
                    eVar.d = 0;
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
                u9 u9Var = (u9) this.c;
                if (u9Var != null) {
                    return u9Var;
                }
                u9 u9Var2 = new u9(this);
                this.c = u9Var2;
                return u9Var2;
            case 1:
                f9.c cVar = (f9.c) this.c;
                if (cVar != null) {
                    return cVar;
                }
                f9.c cVar2 = new f9.c(this, 0);
                this.c = cVar2;
                return cVar2;
            default:
                y7.na naVar = (y7.na) this.c;
                if (naVar != null) {
                    return naVar;
                }
                y7.na naVar2 = new y7.na(this);
                this.c = naVar2;
                return naVar2;
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
                gh ghVar = (gh) this.e;
                ghVar.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new le(ghVar, obj, list, null) : new dh(ghVar, obj, list, (dh) null);
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
                f9.k1 k1Var = (f9.k1) this.e;
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new f9.g(k1Var, obj, list2, null) : new dh(k1Var, obj, list2, (dh) null);
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
                y7.e eVar = (y7.e) this.e;
                eVar.getClass();
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new y7.b(eVar, obj, list3, null) : new dh(eVar, obj, list3, (dh) null);
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
                gh ghVar = (gh) this.e;
                nd ndVar = ghVar.a;
                if (ndVar != null) {
                    return ndVar;
                }
                nd ndVar2 = new nd(ghVar, ghVar.c);
                ghVar.a = ndVar2;
                return ndVar2;
            case 1:
                return ((f9.k1) this.e).keySet();
            default:
                y7.e eVar = (y7.e) this.e;
                y7.a aVar = eVar.a;
                if (aVar != null) {
                    return aVar;
                }
                y7.a aVar2 = new y7.a(eVar, eVar.c);
                eVar.a = aVar2;
                return aVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                gh ghVar = (gh) this.e;
                Collection collection = (Collection) this.b.remove(obj);
                if (collection == null) {
                    return null;
                }
                ghVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                collection.size();
                collection.clear();
                return arrayList;
            case 1:
                f9.k1 k1Var = (f9.k1) this.e;
                Collection collection2 = (Collection) this.b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                Collection h = k1Var.h();
                h.addAll(collection2);
                k1Var.f -= collection2.size();
                collection2.clear();
                return h;
            default:
                y7.e eVar = (y7.e) this.e;
                Collection collection3 = (Collection) this.b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                eVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                eVar.d -= collection3.size();
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
                f fVar = (f) this.d;
                if (fVar != null) {
                    return fVar;
                }
                f fVar2 = new f((AbstractMap) this, 1);
                this.d = fVar2;
                return fVar2;
            case 1:
                f fVar3 = (f) this.d;
                if (fVar3 != null) {
                    return fVar3;
                }
                f fVar4 = new f((AbstractMap) this, 5);
                this.d = fVar4;
                return fVar4;
            default:
                f fVar5 = (f) this.d;
                if (fVar5 != null) {
                    return fVar5;
                }
                f fVar6 = new f((AbstractMap) this, 7);
                this.d = fVar6;
                return fVar6;
        }
    }
}
