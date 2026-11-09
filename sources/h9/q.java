package h9;

import a8.ha;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class q extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ q(s sVar, int i7) {
        this.a = i7;
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
                Map d = sVar.d();
                if (d != null) {
                    return d.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = sVar.f(entry.getKey());
                    if (f10 != -1 && ha.a(sVar.l()[f10], entry.getValue())) {
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
                Map d = sVar.d();
                return d != null ? d.entrySet().iterator() : new p(sVar, 1);
            default:
                s sVar2 = this.b;
                Map d2 = sVar2.d();
                return d2 != null ? d2.keySet().iterator() : new p(sVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                s sVar = this.b;
                Map d = sVar.d();
                if (d != null) {
                    return d.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!sVar.h()) {
                        int e10 = sVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = sVar.a;
                        Objects.requireNonNull(obj2);
                        int s5 = o.s(key, value, e10, obj2, sVar.j(), sVar.k(), sVar.l());
                        if (s5 != -1) {
                            sVar.g(s5, e10);
                            sVar.f--;
                            sVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                s sVar2 = this.b;
                Map d2 = sVar2.d();
                return d2 != null ? d2.keySet().remove(obj) : sVar2.i(obj) != s.s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }
}
