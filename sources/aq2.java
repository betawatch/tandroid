// default package

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class aq2 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dq2 b;

    public /* synthetic */ aq2(dq2 dq2Var, byte b) {
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
                Map d = dq2Var.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = dq2Var.f(entry.getKey());
                    if (f != -1 && ese.a(dq2Var.l(f), entry.getValue())) {
                        return true;
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
                Map d = dq2Var.d();
                return d != null ? d.entrySet().iterator() : new zp2(dq2Var, (byte) 1);
            default:
                Map d2 = dq2Var.d();
                return d2 != null ? d2.keySet().iterator() : new zp2(dq2Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                Map d = dq2Var.d();
                if (d == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!dq2Var.i()) {
                            int e = dq2Var.e();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = dq2Var.b;
                            Objects.requireNonNull(obj2);
                            int[] iArr = dq2Var.c;
                            Objects.requireNonNull(iArr);
                            Object[] objArr = dq2Var.d;
                            Objects.requireNonNull(objArr);
                            Object[] objArr2 = dq2Var.e;
                            Objects.requireNonNull(objArr2);
                            int c = gud.c(key, value, e, obj2, iArr, objArr, objArr2);
                            if (c != -1) {
                                dq2Var.h(c, e);
                                dq2Var.h--;
                                dq2Var.f += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map d2 = dq2Var.d();
                if (d2 == null) {
                    if (dq2Var.j(obj) != dq2.w) {
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
        dq2 dq2Var = this.b;
        switch (b) {
        }
        return dq2Var.size();
    }
}
