package a8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ k(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
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
                o oVar = this.b;
                Map b10 = oVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = oVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = oVar.d;
                        objArr.getClass();
                        if (w0.a(objArr[f10], entry.getValue())) {
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
                o oVar = this.b;
                Map b10 = oVar.b();
                return b10 != null ? b10.entrySet().iterator() : new j(oVar, 1);
            default:
                o oVar2 = this.b;
                Map b11 = oVar2.b();
                return b11 != null ? b11.keySet().iterator() : new j(oVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                Map b10 = oVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!oVar.d()) {
                        int e10 = oVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = oVar.a;
                        obj2.getClass();
                        int[] iArr = oVar.b;
                        iArr.getClass();
                        Object[] objArr = oVar.c;
                        objArr.getClass();
                        Object[] objArr2 = oVar.d;
                        objArr2.getClass();
                        int a10 = s0.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            oVar.c(a10, e10);
                            oVar.f--;
                            oVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                o oVar2 = this.b;
                Map b11 = oVar2.b();
                return b11 != null ? b11.keySet().remove(obj) : oVar2.h(obj) != o.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
