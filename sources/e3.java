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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class e3 extends AbstractMap {
    public final /* synthetic */ byte a;
    public transient AbstractSet b;
    public transient AbstractCollection c;
    public final transient Map d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ e3(Serializable serializable, Map map, byte b) {
        this.a = b;
        this.e = serializable;
        this.d = map;
    }

    public final ko5 b(Map.Entry entry) {
        Object key = entry.getKey();
        fj7 fj7Var = (fj7) this.e;
        List list = (List) ((Collection) entry.getValue());
        return new ko5(key, list instanceof RandomAccess ? new i3(fj7Var, key, list, null) : new m3(fj7Var, key, list, (m3) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                fj7 fj7Var = (fj7) serializable;
                if (map != fj7Var.e) {
                    d3 d3Var = new d3(this);
                    while (d3Var.hasNext()) {
                        d3Var.next();
                        d3Var.remove();
                    }
                    break;
                } else {
                    fj7Var.b();
                    break;
                }
            case 1:
                lp2 lp2Var = (lp2) map;
                lp2 lp2Var2 = ((lmf) serializable).c;
                if (lp2Var != lp2Var2) {
                    d3 d3Var2 = new d3(this, (byte) 0);
                    while (d3Var2.hasNext()) {
                        d3Var2.next();
                        d3Var2.remove();
                    }
                    break;
                } else {
                    Iterator it = lp2Var2.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    lp2Var2.clear();
                    break;
                }
            default:
                lp2 lp2Var3 = (lp2) map;
                ccd ccdVar = (ccd) serializable;
                lp2 lp2Var4 = ccdVar.c;
                if (lp2Var3 != lp2Var4) {
                    d3 d3Var3 = new d3(this, (char) 0);
                    while (d3Var3.hasNext()) {
                        d3Var3.next();
                        d3Var3.remove();
                    }
                    break;
                } else {
                    Iterator it2 = lp2Var4.values().iterator();
                    while (it2.hasNext()) {
                        ((Collection) it2.next()).clear();
                    }
                    lp2Var4.clear();
                    ccdVar.d = 0;
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
                lp2 lp2Var = (lp2) map;
                lp2Var.getClass();
                try {
                    return lp2Var.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
            default:
                lp2 lp2Var2 = (lp2) map;
                lp2Var2.getClass();
                try {
                    return lp2Var2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.b;
                if (c3Var != null) {
                    return c3Var;
                }
                c3 c3Var2 = new c3(this, (byte) 0);
                this.b = c3Var2;
                return c3Var2;
            case 1:
                o4f o4fVar = (o4f) this.b;
                if (o4fVar != null) {
                    return o4fVar;
                }
                o4f o4fVar2 = new o4f(this);
                this.b = o4fVar2;
                return o4fVar2;
            default:
                mlf mlfVar = (mlf) this.b;
                if (mlfVar != null) {
                    return mlfVar;
                }
                mlf mlfVar2 = new mlf(this);
                this.b = mlfVar2;
                return mlfVar2;
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
                if (this == obj || ((lp2) this.d).equals(obj)) {
                }
                break;
            default:
                if (this == obj || ((lp2) this.d).equals(obj)) {
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
                    fj7 fj7Var = (fj7) serializable;
                    List list = (List) collection;
                    break;
                }
                break;
            case 1:
                lp2 lp2Var = (lp2) map;
                lp2Var.getClass();
                try {
                    obj3 = lp2Var.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 != null) {
                    lmf lmfVar = (lmf) serializable;
                    List list2 = (List) collection2;
                    break;
                }
                break;
            default:
                lp2 lp2Var2 = (lp2) map;
                lp2Var2.getClass();
                try {
                    obj4 = lp2Var2.get(obj);
                } catch (ClassCastException | NullPointerException unused3) {
                    obj4 = null;
                }
                Collection collection3 = (Collection) obj4;
                if (collection3 != null) {
                    ccd ccdVar = (ccd) serializable;
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
        return ((lp2) this.d).hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        byte b = this.a;
        Serializable serializable = this.e;
        switch (b) {
            case 0:
                return ((fj7) serializable).j();
            case 1:
                lmf lmfVar = (lmf) serializable;
                o4f o4fVar = lmfVar.a;
                if (o4fVar != null) {
                    return o4fVar;
                }
                o4f o4fVar2 = new o4f(lmfVar, lmfVar.c);
                lmfVar.a = o4fVar2;
                return o4fVar2;
            default:
                ccd ccdVar = (ccd) serializable;
                w9d w9dVar = ccdVar.a;
                if (w9dVar != null) {
                    return w9dVar;
                }
                w9d w9dVar2 = new w9d(ccdVar, ccdVar.c);
                ccdVar.a = w9dVar2;
                return w9dVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        byte b = this.a;
        Serializable serializable = this.e;
        Map map = this.d;
        switch (b) {
            case 0:
                fj7 fj7Var = (fj7) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection m = fj7Var.m();
                m.addAll(collection);
                fj7Var.f -= collection.size();
                collection.clear();
                return m;
            case 1:
                Collection collection2 = (Collection) ((lp2) map).remove(obj);
                if (collection2 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
            default:
                ccd ccdVar = (ccd) serializable;
                Collection collection3 = (Collection) ((lp2) map).remove(obj);
                if (collection3 == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.addAll(collection3);
                ccdVar.d -= collection3.size();
                collection3.clear();
                return arrayList2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return ((lp2) this.d).size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
        }
        return ((lp2) this.d).toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                q3 q3Var = (q3) this.c;
                if (q3Var != null) {
                    return q3Var;
                }
                q3 q3Var2 = new q3((AbstractMap) this, (byte) 3);
                this.c = q3Var2;
                return q3Var2;
            case 1:
                q3 q3Var3 = (q3) this.c;
                if (q3Var3 != null) {
                    return q3Var3;
                }
                q3 q3Var4 = new q3((AbstractMap) this, (byte) 6);
                this.c = q3Var4;
                return q3Var4;
            default:
                q3 q3Var5 = (q3) this.c;
                if (q3Var5 != null) {
                    return q3Var5;
                }
                q3 q3Var6 = new q3((AbstractMap) this, (byte) 7);
                this.c = q3Var6;
                return q3Var6;
        }
    }
}
