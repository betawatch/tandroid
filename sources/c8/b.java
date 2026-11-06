package c8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ b(d dVar, int i7) {
        this.a = i7;
        this.b = dVar;
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
                d dVar = this.b;
                Map b10 = dVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = dVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = dVar.d;
                        objArr.getClass();
                        if (a8.e8.a(objArr[f10], entry.getValue())) {
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
                d dVar = this.b;
                Map b10 = dVar.b();
                return b10 != null ? b10.entrySet().iterator() : new a(dVar, 1);
            default:
                d dVar2 = this.b;
                Map b11 = dVar2.b();
                return b11 != null ? b11.keySet().iterator() : new a(dVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                Map b10 = dVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.d()) {
                        int e10 = dVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.a;
                        obj2.getClass();
                        int[] iArr = dVar.b;
                        iArr.getClass();
                        Object[] objArr = dVar.c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = a8.v7.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.c(a10, e10);
                            dVar.f--;
                            dVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.b;
                Map b11 = dVar2.b();
                return b11 != null ? b11.keySet().remove(obj) : dVar2.h(obj) != d.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
