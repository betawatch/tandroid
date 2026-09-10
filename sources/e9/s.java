package e9;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import v7.s6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ s(v vVar, int i10) {
        this.a = i10;
        this.b = vVar;
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
                v vVar = this.b;
                Map b10 = vVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = vVar.d(entry.getKey());
                    if (d != -1 && s6.a(vVar.j()[d], entry.getValue())) {
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
                v vVar = this.b;
                Map b10 = vVar.b();
                return b10 != null ? b10.entrySet().iterator() : new r(vVar, 1);
            default:
                v vVar2 = this.b;
                Map b11 = vVar2.b();
                return b11 != null ? b11.keySet().iterator() : new r(vVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                v vVar = this.b;
                Map b10 = vVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!vVar.f()) {
                        int c10 = vVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = vVar.a;
                        Objects.requireNonNull(obj2);
                        int q6 = q.q(key, value, c10, obj2, vVar.h(), vVar.i(), vVar.j());
                        if (q6 != -1) {
                            vVar.e(q6, c10);
                            vVar.f--;
                            vVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                v vVar2 = this.b;
                Map b11 = vVar2.b();
                return b11 != null ? b11.keySet().remove(obj) : vVar2.g(obj) != v.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
