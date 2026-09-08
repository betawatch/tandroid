package fb;

import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l implements Map.Entry {
    public l a;
    public l b;
    public l c;
    public l d;
    public l e;
    public final Object f;
    public final boolean h;
    public Object n;
    public int r;

    public l(boolean z10) {
        this.f = null;
        this.h = z10;
        this.e = this;
        this.d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.n;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.n;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.h) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.n;
    }

    public l(boolean z10, l lVar, Object obj, l lVar2, l lVar3) {
        this.a = lVar;
        this.f = obj;
        this.h = z10;
        this.r = 1;
        this.d = lVar2;
        this.e = lVar3;
        lVar3.d = this;
        lVar2.e = this;
    }
}
