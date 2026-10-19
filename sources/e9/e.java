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
import java.util.RandomAccess;
import java.util.Set;
import x7.qa;
import z7.ee;
import z7.fd;
import z7.l9;
import z7.mg;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class e extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ e(Serializable serializable, Map map, int i10) {
        this.a = i10;
        this.e = serializable;
        this.b = map;
    }

    public j0 a(Map.Entry entry) {
        Object key = entry.getKey();
        p1 p1Var = (p1) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new j0(key, list instanceof RandomAccess ? new i(p1Var, key, list, null) : new m(p1Var, key, list, (m) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                p1 p1Var = (p1) this.e;
                if (this.b != p1Var.e) {
                    d dVar = new d(this);
                    while (dVar.hasNext()) {
                        dVar.next();
                        dVar.remove();
                    }
                    break;
                } else {
                    p1Var.clear();
                    break;
                }
            case 1:
                x7.f fVar = (x7.f) this.e;
                x7.j jVar = fVar.c;
                if (this.b != jVar) {
                    d dVar2 = new d(this, (byte) 0);
                    while (dVar2.hasNext()) {
                        dVar2.next();
                        dVar2.remove();
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
                z7.d dVar3 = ((mg) this.e).c;
                if (this.b != dVar3) {
                    d dVar4 = new d(this, (char) 0);
                    while (dVar4.hasNext()) {
                        dVar4.next();
                        dVar4.remove();
                    }
                    break;
                } else {
                    Iterator it2 = dVar3.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    dVar3.clear();
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
                c cVar = (c) this.c;
                if (cVar != null) {
                    return cVar;
                }
                c cVar2 = new c(this, 0);
                this.c = cVar2;
                return cVar2;
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
                p1 p1Var = (p1) this.e;
                List list = (List) collection;
                return list instanceof RandomAccess ? new i(p1Var, obj, list, null) : new m(p1Var, obj, list, (m) null);
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
                return list2 instanceof RandomAccess ? new x7.b(fVar, obj, list2, null) : new m(fVar, obj, list2, (m) null);
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
                mg mgVar = (mg) this.e;
                mgVar.getClass();
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new ee(mgVar, obj, list3, null) : new m(mgVar, obj, list3, (m) null);
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
                return ((p1) this.e).keySet();
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
                mg mgVar = (mg) this.e;
                fd fdVar = mgVar.a;
                if (fdVar != null) {
                    return fdVar;
                }
                fd fdVar2 = new fd(mgVar, mgVar.c);
                mgVar.a = fdVar2;
                return fdVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                p1 p1Var = (p1) this.e;
                Collection collection = (Collection) this.b.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection h = p1Var.h();
                h.addAll(collection);
                p1Var.f -= collection.size();
                collection.clear();
                return h;
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
                mg mgVar = (mg) this.e;
                Collection collection3 = (Collection) this.b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                mgVar.getClass();
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
                o oVar = (o) this.d;
                if (oVar != null) {
                    return oVar;
                }
                o oVar2 = new o((AbstractMap) this, 3);
                this.d = oVar2;
                return oVar2;
            case 1:
                o oVar3 = (o) this.d;
                if (oVar3 != null) {
                    return oVar3;
                }
                o oVar4 = new o((AbstractMap) this, 5);
                this.d = oVar4;
                return oVar4;
            default:
                o oVar5 = (o) this.d;
                if (oVar5 != null) {
                    return oVar5;
                }
                o oVar6 = new o((AbstractMap) this, 7);
                this.d = oVar6;
                return oVar6;
        }
    }
}
