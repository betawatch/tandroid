package f9;

import a8.xb;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ q(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
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
                s sVar = this.b;
                Map c10 = sVar.c();
                if (c10 != null) {
                    return c10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = sVar.e(entry.getKey());
                    if (e != -1 && xb.a(sVar.k()[e], entry.getValue())) {
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
                s sVar = this.b;
                Map c10 = sVar.c();
                return c10 != null ? c10.entrySet().iterator() : new p(sVar, 1);
            default:
                s sVar2 = this.b;
                Map c11 = sVar2.c();
                return c11 != null ? c11.keySet().iterator() : new p(sVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                s sVar = this.b;
                Map c10 = sVar.c();
                if (c10 != null) {
                    return c10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!sVar.g()) {
                        int d = sVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = sVar.a;
                        Objects.requireNonNull(obj2);
                        int r6 = o.r(key, value, d, obj2, sVar.i(), sVar.j(), sVar.k());
                        if (r6 != -1) {
                            sVar.f(r6, d);
                            sVar.f--;
                            sVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                s sVar2 = this.b;
                Map c11 = sVar2.c();
                return c11 != null ? c11.keySet().remove(obj) : sVar2.h(obj) != s.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
