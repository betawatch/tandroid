// default package

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fbd extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lp2 b;

    public /* synthetic */ fbd(lp2 lp2Var, byte b) {
        this.a = b;
        this.b = lp2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                lp2Var.clear();
                break;
            default:
                lp2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map m = lp2Var.m();
                if (m != null) {
                    return m.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int s = lp2Var.s(entry.getKey());
                    if (s != -1) {
                        Object[] objArr = lp2Var.e;
                        objArr.getClass();
                        if (e6f.a(objArr[s], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return lp2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map m = lp2Var.m();
                return m != null ? m.entrySet().iterator() : new mad(lp2Var, (byte) 1);
            default:
                Map m2 = lp2Var.m();
                return m2 != null ? m2.keySet().iterator() : new mad(lp2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map m = lp2Var.m();
                if (m == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!lp2Var.p()) {
                            int q = lp2Var.q();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = lp2Var.b;
                            obj2.getClass();
                            int[] iArr = lp2Var.c;
                            iArr.getClass();
                            Object[] objArr = lp2Var.d;
                            objArr.getClass();
                            Object[] objArr2 = lp2Var.e;
                            objArr2.getClass();
                            int a = b4f.a(key, value, q, obj2, iArr, objArr, objArr2);
                            if (a != -1) {
                                lp2Var.o(a, q);
                                lp2Var.h--;
                                lp2Var.f += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map m2 = lp2Var.m();
                if (m2 == null) {
                    if (lp2Var.v(obj) == lp2.x) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
        }
        return lp2Var.size();
    }
}
