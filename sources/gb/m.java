package gb;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class m extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ m(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        n a2;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                o oVar = this.b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                n nVar = null;
                if (key != null) {
                    try {
                        a2 = oVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                        nVar = a2;
                    }
                    return nVar == null;
                }
                a2 = null;
                if (a2 != null) {
                    nVar = a2;
                }
                if (nVar == null) {
                }
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new l(this.b, 0);
            default:
                return new l(this.b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        n a2;
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    o oVar = this.b;
                    n nVar = null;
                    if (key != null) {
                        try {
                            a2 = oVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (a2 != null && Objects.equals(a2.n, entry.getValue())) {
                            nVar = a2;
                        }
                        if (nVar == null) {
                            oVar.c(nVar, true);
                            break;
                        }
                    }
                    a2 = null;
                    if (a2 != null) {
                        nVar = a2;
                    }
                    if (nVar == null) {
                    }
                }
                break;
            default:
                o oVar2 = this.b;
                n nVar2 = null;
                if (obj != null) {
                    try {
                        nVar2 = oVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (nVar2 != null) {
                    oVar2.c(nVar2, true);
                }
                if (nVar2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
        }
        return this.b.d;
    }
}
