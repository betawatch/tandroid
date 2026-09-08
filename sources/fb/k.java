package fb;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ k(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        l a2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                m mVar = this.b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        a2 = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                        lVar = a2;
                    }
                    return lVar == null;
                }
                a2 = null;
                if (a2 != null) {
                    lVar = a2;
                }
                if (lVar == null) {
                }
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new j(this.b, 0);
            default:
                return new j(this.b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        l a2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = this.b;
                l lVar = null;
                if (key != null) {
                    try {
                        a2 = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                        lVar = a2;
                    }
                    if (lVar != null) {
                        return false;
                    }
                    mVar.c(lVar, true);
                    return true;
                }
                a2 = null;
                if (a2 != null) {
                    lVar = a2;
                }
                if (lVar != null) {
                }
            default:
                m mVar2 = this.b;
                l lVar2 = null;
                if (obj != null) {
                    try {
                        lVar2 = mVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lVar2 != null) {
                    mVar2.c(lVar2, true);
                }
                return lVar2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.d;
    }
}
