package a8;

import c8.be;
import c8.cd;
import c8.jg;
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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class kb extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ kb(Serializable serializable, Map map, int i7) {
        this.a = i7;
        this.e = serializable;
        this.b = map;
    }

    public h9.e0 b(Map.Entry entry) {
        Object key = entry.getKey();
        h9.l1 l1Var = (h9.l1) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new h9.e0(key, list instanceof RandomAccess ? new h9.g(l1Var, key, list, null) : new f(l1Var, key, list, (f) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                i iVar = (i) this.e;
                o oVar = iVar.c;
                if (this.b != oVar) {
                    d dVar = new d(this);
                    while (dVar.hasNext()) {
                        dVar.next();
                        dVar.remove();
                    }
                    break;
                } else {
                    Iterator it = oVar.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    oVar.clear();
                    iVar.d = 0;
                    break;
                }
            case 1:
                c8.d dVar2 = ((jg) this.e).c;
                if (this.b != dVar2) {
                    d dVar3 = new d(this, (byte) 0);
                    while (dVar3.hasNext()) {
                        dVar3.next();
                        dVar3.remove();
                    }
                    break;
                } else {
                    Iterator it2 = dVar2.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    dVar2.clear();
                    break;
                }
            default:
                h9.l1 l1Var = (h9.l1) this.e;
                if (this.b != l1Var.e) {
                    d dVar4 = new d(this, (char) 0);
                    while (dVar4.hasNext()) {
                        dVar4.next();
                        dVar4.remove();
                    }
                    break;
                } else {
                    l1Var.clear();
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
                jb jbVar = (jb) this.c;
                if (jbVar != null) {
                    return jbVar;
                }
                jb jbVar2 = new jb(this);
                this.c = jbVar2;
                return jbVar2;
            case 1:
                c8.k9 k9Var = (c8.k9) this.c;
                if (k9Var != null) {
                    return k9Var;
                }
                c8.k9 k9Var2 = new c8.k9(this);
                this.c = k9Var2;
                return k9Var2;
            default:
                h9.c cVar = (h9.c) this.c;
                if (cVar != null) {
                    return cVar;
                }
                h9.c cVar2 = new h9.c(this, 0);
                this.c = cVar2;
                return cVar2;
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
                i iVar = (i) this.e;
                iVar.getClass();
                List list = (List) collection;
                return list instanceof RandomAccess ? new c(iVar, obj, list, null) : new f(iVar, obj, list, (f) null);
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
                jg jgVar = (jg) this.e;
                jgVar.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new be(jgVar, obj, list2, null) : new f(jgVar, obj, list2, (f) null);
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
                h9.l1 l1Var = (h9.l1) this.e;
                List list3 = (List) collection3;
                return list3 instanceof RandomAccess ? new h9.g(l1Var, obj, list3, null) : new f(l1Var, obj, list3, (f) null);
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
                i iVar = (i) this.e;
                b bVar = iVar.a;
                if (bVar != null) {
                    return bVar;
                }
                b bVar2 = new b(iVar, iVar.c);
                iVar.a = bVar2;
                return bVar2;
            case 1:
                jg jgVar = (jg) this.e;
                cd cdVar = jgVar.a;
                if (cdVar != null) {
                    return cdVar;
                }
                cd cdVar2 = new cd(jgVar, jgVar.c);
                jgVar.a = cdVar2;
                return cdVar2;
            default:
                return ((h9.l1) this.e).keySet();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.e;
                Collection collection = (Collection) this.b.remove(obj);
                if (collection == null) {
                    return null;
                }
                iVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection);
                iVar.d -= collection.size();
                collection.clear();
                return arrayList;
            case 1:
                jg jgVar = (jg) this.e;
                Collection collection2 = (Collection) this.b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                jgVar.getClass();
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList2;
            default:
                h9.l1 l1Var = (h9.l1) this.e;
                Collection collection3 = (Collection) this.b.remove(obj);
                if (collection3 == null) {
                    return null;
                }
                Collection h = l1Var.h();
                h.addAll(collection3);
                l1Var.f -= collection3.size();
                collection3.clear();
                return h;
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
                n nVar2 = new n((AbstractMap) this, 1);
                this.d = nVar2;
                return nVar2;
            case 1:
                n nVar3 = (n) this.d;
                if (nVar3 != null) {
                    return nVar3;
                }
                n nVar4 = new n((AbstractMap) this, 3);
                this.d = nVar4;
                return nVar4;
            default:
                n nVar5 = (n) this.d;
                if (nVar5 != null) {
                    return nVar5;
                }
                n nVar6 = new n((AbstractMap) this, 7);
                this.d = nVar6;
                return nVar6;
        }
    }
}
