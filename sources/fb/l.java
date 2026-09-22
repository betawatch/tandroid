package fb;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class l extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ l(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
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
        m a2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                n nVar = this.b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        a2 = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                        mVar = a2;
                    }
                    return mVar == null;
                }
                a2 = null;
                if (a2 != null) {
                    mVar = a2;
                }
                if (mVar == null) {
                }
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new k(this.b, 0);
            default:
                return new k(this.b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        m a2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                n nVar = this.b;
                m mVar = null;
                if (key != null) {
                    try {
                        a2 = nVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                        mVar = a2;
                    }
                    if (mVar != null) {
                        return false;
                    }
                    nVar.c(mVar, true);
                    return true;
                }
                a2 = null;
                if (a2 != null) {
                    mVar = a2;
                }
                if (mVar != null) {
                }
            default:
                n nVar2 = this.b;
                m mVar2 = null;
                if (obj != null) {
                    try {
                        mVar2 = nVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mVar2 != null) {
                    nVar2.c(mVar2, true);
                }
                return mVar2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.d;
    }
}
