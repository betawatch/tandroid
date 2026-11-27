// default package

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ip2 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lp2 b;

    public /* synthetic */ ip2(lp2 lp2Var, byte b) {
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
                Map d = lp2Var.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = lp2Var.f(entry.getKey());
                    if (f != -1 && tue.a(lp2Var.l(f), entry.getValue())) {
                        return true;
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
                Map d = lp2Var.d();
                return d != null ? d.entrySet().iterator() : new hp2(lp2Var, (byte) 1);
            default:
                Map d2 = lp2Var.d();
                return d2 != null ? d2.keySet().iterator() : new hp2(lp2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        lp2 lp2Var = this.b;
        switch (b) {
            case 0:
                Map d = lp2Var.d();
                if (d == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!lp2Var.i()) {
                            int e = lp2Var.e();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = lp2Var.b;
                            Objects.requireNonNull(obj2);
                            int[] iArr = lp2Var.c;
                            Objects.requireNonNull(iArr);
                            Object[] objArr = lp2Var.d;
                            Objects.requireNonNull(objArr);
                            Object[] objArr2 = lp2Var.e;
                            Objects.requireNonNull(objArr2);
                            int c = twd.c(key, value, e, obj2, iArr, objArr, objArr2);
                            if (c != -1) {
                                lp2Var.h(c, e);
                                lp2Var.h--;
                                lp2Var.f += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map d2 = lp2Var.d();
                if (d2 == null) {
                    if (lp2Var.j(obj) != lp2.w) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
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
