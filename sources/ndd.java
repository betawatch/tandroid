// default package

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ndd extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lp2 b;

    public /* synthetic */ ndd(lp2 lp2Var, byte b) {
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
                Map n = lp2Var.n();
                if (n != null) {
                    return n.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int x = lp2Var.x(entry.getKey());
                    if (x != -1) {
                        Object[] objArr = lp2Var.e;
                        objArr.getClass();
                        if (l8f.a(objArr[x], entry.getValue())) {
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
                Map n = lp2Var.n();
                return n != null ? n.entrySet().iterator() : new cdd(lp2Var, (byte) 1);
            default:
                Map n2 = lp2Var.n();
                return n2 != null ? n2.keySet().iterator() : new cdd(lp2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map n = lp2Var.n();
                if (n == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!lp2Var.t()) {
                            int w = lp2Var.w();
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
                            int a = f4f.a(key, value, w, obj2, iArr, objArr, objArr2);
                            if (a != -1) {
                                lp2Var.r(a, w);
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
                Map n2 = lp2Var.n();
                if (n2 == null) {
                    if (lp2Var.z(obj) == lp2.y) {
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
