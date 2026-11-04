package b8;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class mb extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ mb(Serializable serializable, Map map, int i3) {
        this.a = i3;
        this.e = serializable;
        this.b = map;
    }

    public g9.e0 b(Map.Entry entry) {
        Object key = entry.getKey();
        g9.k1 k1Var = (g9.k1) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new g9.e0(key, list instanceof RandomAccess ? new g9.g(k1Var, key, list, null) : new ah(k1Var, key, list, (ah) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                g gVar = ((dh) this.e).c;
                if (this.b != gVar) {
                    ra raVar = new ra(this);
                    while (raVar.hasNext()) {
                        raVar.next();
                        raVar.remove();
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
                g9.k1 k1Var = (g9.k1) this.e;
                if (this.b != k1Var.e) {
                    ra raVar2 = new ra(this, (byte) 0);
                    while (raVar2.hasNext()) {
                        raVar2.next();
                        raVar2.remove();
                    }
                    break;
                } else {
                    k1Var.clear();
                    break;
                }
            default:
                z7.e eVar = (z7.e) this.e;
                z7.i iVar = eVar.c;
                if (this.b != iVar) {
                    ra raVar3 = new ra(this, (char) 0);
                    while (raVar3.hasNext()) {
                        raVar3.next();
                        raVar3.remove();
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
                s9 s9Var = (s9) this.c;
                if (s9Var != null) {
                    return s9Var;
                }
                s9 s9Var2 = new s9(this);
                this.c = s9Var2;
                return s9Var2;
            case 1:
                g9.c cVar = (g9.c) this.c;
                if (cVar != null) {
                    return cVar;
                }
                g9.c cVar2 = new g9.c(this, 0);
                this.c = cVar2;
                return cVar2;
            default:
                z7.oa oaVar = (z7.oa) this.c;
                if (oaVar != null) {
                    return oaVar;
                }
                z7.oa oaVar2 = new z7.oa(this);
                this.c = oaVar2;
                return oaVar2;
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
                dh dhVar = (dh) this.e;
                dhVar.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new je(dhVar, obj, list, null) : new ah(dhVar, obj, list, (ah) null);
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
                g9.k1 k1Var = (g9.k1) this.e;
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new g9.g(k1Var, obj, list2, null) : new ah(k1Var, obj, list2, (ah) null);
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
                z7.e eVar = (z7.e) this.e;
                eVar.getClass();
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new z7.b(eVar, obj, list3, null) : new ah(eVar, obj, list3, (ah) null);
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
                dh dhVar = (dh) this.e;
                kd kdVar = dhVar.a;
                if (kdVar != null) {
                    return kdVar;
                }
                kd kdVar2 = new kd(dhVar, dhVar.c);
                dhVar.a = kdVar2;
                return kdVar2;
            case 1:
                return ((g9.k1) this.e).keySet();
            default:
                z7.e eVar = (z7.e) this.e;
                z7.a aVar = eVar.a;
                if (aVar != null) {
                    return aVar;
                }
                z7.a aVar2 = new z7.a(eVar, eVar.c);
                eVar.a = aVar2;
                return aVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                dh dhVar = (dh) this.e;
                Collection collection = (Collection) this.b.remove(obj);
                if (collection == null) {
                    return null;
                }
                dhVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                collection.size();
                collection.clear();
                return arrayList;
            case 1:
                g9.k1 k1Var = (g9.k1) this.e;
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
                z7.e eVar = (z7.e) this.e;
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
