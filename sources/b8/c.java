package b8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ c(g gVar, int i3) {
        this.a = i3;
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
                Map b10 = gVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = gVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = gVar.d;
                        objArr.getClass();
                        if (m1.a(objArr[f10], entry.getValue())) {
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
                Map b10 = gVar.b();
                return b10 != null ? b10.entrySet().iterator() : new b(gVar, 1);
            default:
                g gVar2 = this.b;
                Map b11 = gVar2.b();
                return b11 != null ? b11.keySet().iterator() : new b(gVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                Map b10 = gVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!gVar.d()) {
                        int e10 = gVar.e();
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
                        int a10 = i1.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            gVar.c(a10, e10);
                            gVar.f--;
                            gVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                g gVar2 = this.b;
                Map b11 = gVar2.b();
                return b11 != null ? b11.keySet().remove(obj) : gVar2.h(obj) != g.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
