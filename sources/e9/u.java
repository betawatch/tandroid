package e9;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import v7.t6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class u extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ u(x xVar, int i10) {
        this.a = i10;
        this.b = xVar;
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
                x xVar = this.b;
                Map c10 = xVar.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = xVar.e(entry.getKey());
                    if (e != -1 && t6.a(xVar.k()[e], entry.getValue())) {
                        return true;
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
                x xVar = this.b;
                Map c10 = xVar.c();
                return c10 != null ? c10.entrySet().iterator() : new t(xVar, 1);
            default:
                x xVar2 = this.b;
                Map c11 = xVar2.c();
                return c11 != null ? c11.keySet().iterator() : new t(xVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                x xVar = this.b;
                Map c10 = xVar.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!xVar.g()) {
                        int d = xVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = xVar.a;
                        Objects.requireNonNull(obj2);
                        int r10 = s.r(key, value, d, obj2, xVar.i(), xVar.j(), xVar.k());
                        if (r10 != -1) {
                            xVar.f(r10, d);
                            xVar.f--;
                            xVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                x xVar2 = this.b;
                Map c11 = xVar2.c();
                return c11 != null ? c11.keySet().remove(obj) : xVar2.h(obj) != x.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
