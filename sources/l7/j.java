package l7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ j(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
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
                n nVar = this.b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e6 = nVar.e(entry.getKey());
                    if (e6 != -1) {
                        Object[] objArr = nVar.d;
                        objArr.getClass();
                        if (k7.j.a(objArr[e6], entry.getValue())) {
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
                n nVar = this.b;
                Map a2 = nVar.a();
                return a2 != null ? a2.entrySet().iterator() : new i(nVar, 1);
            default:
                n nVar2 = this.b;
                Map a10 = nVar2.a();
                return a10 != null ? a10.keySet().iterator() : new i(nVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                Map a2 = nVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!nVar.c()) {
                        int d = nVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = nVar.a;
                        obj2.getClass();
                        int[] iArr = nVar.b;
                        iArr.getClass();
                        Object[] objArr = nVar.c;
                        objArr.getClass();
                        Object[] objArr2 = nVar.d;
                        objArr2.getClass();
                        int b10 = j7.g9.b(key, value, d, obj2, iArr, objArr, objArr2);
                        if (b10 != -1) {
                            nVar.b(b10, d);
                            nVar.f--;
                            nVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                n nVar2 = this.b;
                Map a10 = nVar2.a();
                return a10 != null ? a10.keySet().remove(obj) : nVar2.g(obj) != n.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
