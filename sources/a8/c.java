package a8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ c(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                Map a2 = gVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = gVar.e(entry.getKey());
                    if (e != -1) {
                        Object[] objArr = gVar.d;
                        objArr.getClass();
                        if (n0.a(objArr[e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                Map a2 = gVar.a();
                return a2 != null ? a2.entrySet().iterator() : new b(gVar, 1);
            default:
                g gVar2 = this.b;
                Map a10 = gVar2.a();
                return a10 != null ? a10.keySet().iterator() : new b(gVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                Map a2 = gVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!gVar.c()) {
                        int d = gVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = gVar.a;
                        obj2.getClass();
                        int[] iArr = gVar.b;
                        iArr.getClass();
                        Object[] objArr = gVar.c;
                        objArr.getClass();
                        Object[] objArr2 = gVar.d;
                        objArr2.getClass();
                        int a10 = j0.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            gVar.b(a10, d);
                            gVar.f--;
                            gVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                g gVar2 = this.b;
                Map a11 = gVar2.a();
                return a11 != null ? a11.keySet().remove(obj) : gVar2.g(obj) != g.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
