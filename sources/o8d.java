// default package

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o8d extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dq2 b;

    public /* synthetic */ o8d(dq2 dq2Var, byte b) {
        this.a = b;
        this.b = dq2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                dq2Var.clear();
                break;
            default:
                dq2Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map m = dq2Var.m();
                if (m != null) {
                    return m.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int s = dq2Var.s(entry.getKey());
                    if (s != -1) {
                        Object[] objArr = dq2Var.e;
                        objArr.getClass();
                        if (o3f.a(objArr[s], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return dq2Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map m = dq2Var.m();
                return m != null ? m.entrySet().iterator() : new v7d(dq2Var, (byte) 1);
            default:
                Map m2 = dq2Var.m();
                return m2 != null ? m2.keySet().iterator() : new v7d(dq2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map m = dq2Var.m();
                if (m == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!dq2Var.p()) {
                            int q = dq2Var.q();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = dq2Var.b;
                            obj2.getClass();
                            int[] iArr = dq2Var.c;
                            iArr.getClass();
                            Object[] objArr = dq2Var.d;
                            objArr.getClass();
                            Object[] objArr2 = dq2Var.e;
                            objArr2.getClass();
                            int a = i1f.a(key, value, q, obj2, iArr, objArr, objArr2);
                            if (a != -1) {
                                dq2Var.o(a, q);
                                dq2Var.h--;
                                dq2Var.f += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map m2 = dq2Var.m();
                if (m2 == null) {
                    if (dq2Var.v(obj) == dq2.x) {
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
        dq2 dq2Var = this.b;
        switch (b) {
        }
        return dq2Var.size();
    }
}
