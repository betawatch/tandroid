// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class d3 extends AbstractMap {
    public final /* synthetic */ byte a;
    public transient AbstractSet b;
    public transient AbstractCollection c;
    public final transient Map d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ d3(Serializable serializable, Map map, byte b) {
        this.a = b;
        this.e = serializable;
        this.d = map;
    }

    public final ho5 b(Map.Entry entry) {
        Object key = entry.getKey();
        zi7 zi7Var = (zi7) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new ho5(key, list instanceof RandomAccess ? new h3(zi7Var, key, list, null) : new l3(zi7Var, key, list, (l3) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                zi7 zi7Var = (zi7) serializable;
                if (map != zi7Var.e) {
                    c3 c3Var = new c3(this);
                    while (c3Var.hasNext()) {
                        c3Var.next();
                        c3Var.remove();
                    }
                    break;
                } else {
                    zi7Var.b();
                    break;
                }
            case 1:
                dq2 dq2Var = (dq2) map;
                dq2 dq2Var2 = ((wjf) serializable).c;
                if (dq2Var != dq2Var2) {
                    c3 c3Var2 = new c3(this, (byte) 0);
                    while (c3Var2.hasNext()) {
                        c3Var2.next();
                        c3Var2.remove();
                    }
                    break;
                } else {
                    Iterator it = dq2Var2.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    dq2Var2.clear();
                    break;
                }
            default:
                dq2 dq2Var3 = (dq2) map;
                l9d l9dVar = (l9d) serializable;
                dq2 dq2Var4 = l9dVar.c;
                if (dq2Var3 != dq2Var4) {
                    c3 c3Var3 = new c3(this, (char) 0);
                    while (c3Var3.hasNext()) {
                        c3Var3.next();
                        c3Var3.remove();
                    }
                    break;
                } else {
                    Iterator it2 = dq2Var4.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    dq2Var4.clear();
                    l9dVar.d = 0;
                    break;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        byte b = this.a;
        Map map = this.d;
        switch (b) {
            case 0:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            case 1:
                dq2 dq2Var = (dq2) map;
                dq2Var.getClass();
                try {
                    return dq2Var.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                dq2 dq2Var2 = (dq2) map;
                dq2Var2.getClass();
                try {
                    return dq2Var2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.b;
                if (b3Var != null) {
                    return b3Var;
                }
                b3 b3Var2 = new b3(this, (byte) 0);
                this.b = b3Var2;
                return b3Var2;
            case 1:
                z1f z1fVar = (z1f) this.b;
                if (z1fVar != null) {
                    return z1fVar;
                }
                z1f z1fVar2 = new z1f(this);
                this.b = z1fVar2;
                return z1fVar2;
            default:
                xif xifVar = (xif) this.b;
                if (xifVar != null) {
                    return xifVar;
                }
                xif xifVar2 = new xif(this);
                this.b = xifVar2;
                return xifVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this == obj || this.d.equals(obj)) {
                }
                break;
            case 1:
                if (this == obj || ((dq2) this.d).equals(obj)) {
                }
                break;
            default:
                if (this == obj || ((dq2) this.d).equals(obj)) {
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
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    zi7 zi7Var = (zi7) serializable;
                    List list = (List) collection;
                    break;
                }
                break;
            case 1:
                dq2 dq2Var = (dq2) map;
                dq2Var.getClass();
                try {
                    obj3 = dq2Var.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 != null) {
                    wjf wjfVar = (wjf) serializable;
                    List list2 = (List) collection2;
                    break;
                }
                break;
            default:
                dq2 dq2Var2 = (dq2) map;
                dq2Var2.getClass();
                try {
                    obj4 = dq2Var2.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 != null) {
                    l9d l9dVar = (l9d) serializable;
                    List list3 = (List) collection3;
                    break;
                }
                break;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
        }
        return ((dq2) this.d).hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        byte b = this.a;
        Serializable serializable = this.e;
        switch (b) {
            case 0:
                return ((zi7) serializable).j();
            case 1:
                wjf wjfVar = (wjf) serializable;
                z1f z1fVar = wjfVar.a;
                if (z1fVar != null) {
                    return z1fVar;
                }
                z1f z1fVar2 = new z1f(wjfVar, wjfVar.c);
                wjfVar.a = z1fVar2;
                return z1fVar2;
            default:
                l9d l9dVar = (l9d) serializable;
                f7d f7dVar = l9dVar.a;
                if (f7dVar != null) {
                    return f7dVar;
                }
                f7d f7dVar2 = new f7d(l9dVar, l9dVar.c);
                l9dVar.a = f7dVar2;
                return f7dVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                zi7 zi7Var = (zi7) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection m = zi7Var.m();
                m.addAll(collection);
                zi7Var.f -= collection.size();
                collection.clear();
                return m;
            case 1:
                Collection collection2 = (Collection) ((dq2) map).remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
            default:
                l9d l9dVar = (l9d) serializable;
                Collection collection3 = (Collection) ((dq2) map).remove(obj);
                if (collection3 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                l9dVar.d -= collection3.size();
                collection3.clear();
                return arrayList2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return ((dq2) this.d).size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
        }
        return ((dq2) this.d).toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.c;
                if (p3Var != null) {
                    return p3Var;
                }
                p3 p3Var2 = new p3((AbstractMap) this, (byte) 3);
                this.c = p3Var2;
                return p3Var2;
            case 1:
                p3 p3Var3 = (p3) this.c;
                if (p3Var3 != null) {
                    return p3Var3;
                }
                p3 p3Var4 = new p3((AbstractMap) this, (byte) 6);
                this.c = p3Var4;
                return p3Var4;
            default:
                p3 p3Var5 = (p3) this.c;
                if (p3Var5 != null) {
                    return p3Var5;
                }
                p3 p3Var6 = new p3((AbstractMap) this, (byte) 7);
                this.c = p3Var6;
                return p3Var6;
        }
    }
}
