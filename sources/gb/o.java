package gb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class o extends AbstractMap implements Serializable {
    public static final k r = new k(0);
    public final boolean b;
    public n c;
    public final n f;
    public m h;
    public m n;
    public int d = 0;
    public int e = 0;
    public final Comparator a = r;

    public o(boolean z10) {
        this.b = z10;
        this.f = new n(z10);
    }

    public final n a(Object obj, boolean z10) {
        int i10;
        n nVar;
        n nVar2 = this.c;
        k kVar = r;
        Comparator comparator = this.a;
        if (nVar2 != null) {
            Comparable comparable = comparator == kVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = nVar2.f;
                i10 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i10 == 0) {
                    return nVar2;
                }
                n nVar3 = i10 < 0 ? nVar2.b : nVar2.c;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            i10 = 0;
        }
        n nVar4 = nVar2;
        if (!z10) {
            return null;
        }
        n nVar5 = this.f;
        if (nVar4 != null) {
            nVar = new n(this.b, nVar4, obj, nVar5, nVar5.e);
            if (i10 < 0) {
                nVar4.b = nVar;
            } else {
                nVar4.c = nVar;
            }
            b(nVar4, true);
        } else {
            if (comparator == kVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.b, nVar4, obj, nVar5, nVar5.e);
            this.c = nVar;
        }
        this.d++;
        this.e++;
        return nVar;
    }

    public final void b(n nVar, boolean z10) {
        while (nVar != null) {
            n nVar2 = nVar.b;
            n nVar3 = nVar.c;
            int i10 = nVar2 != null ? nVar2.r : 0;
            int i11 = nVar3 != null ? nVar3.r : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                n nVar4 = nVar3.b;
                n nVar5 = nVar3.c;
                int i13 = (nVar4 != null ? nVar4.r : 0) - (nVar5 != null ? nVar5.r : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(nVar);
                } else {
                    f(nVar3);
                    e(nVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                n nVar6 = nVar2.b;
                n nVar7 = nVar2.c;
                int i14 = (nVar6 != null ? nVar6.r : 0) - (nVar7 != null ? nVar7.r : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(nVar);
                } else {
                    e(nVar2);
                    f(nVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                nVar.r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                nVar.r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            nVar = nVar.a;
        }
    }

    public final void c(n nVar, boolean z10) {
        n nVar2;
        n nVar3;
        int i10;
        if (z10) {
            n nVar4 = nVar.e;
            nVar4.d = nVar.d;
            nVar.d.e = nVar4;
        }
        n nVar5 = nVar.b;
        n nVar6 = nVar.c;
        n nVar7 = nVar.a;
        int i11 = 0;
        if (nVar5 == null || nVar6 == null) {
            if (nVar5 != null) {
                d(nVar, nVar5);
                nVar.b = null;
            } else if (nVar6 != null) {
                d(nVar, nVar6);
                nVar.c = null;
            } else {
                d(nVar, null);
            }
            b(nVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (nVar5.r > nVar6.r) {
            n nVar8 = nVar5.c;
            while (true) {
                n nVar9 = nVar8;
                nVar3 = nVar5;
                nVar5 = nVar9;
                if (nVar5 == null) {
                    break;
                } else {
                    nVar8 = nVar5.c;
                }
            }
        } else {
            n nVar10 = nVar6.b;
            while (true) {
                nVar2 = nVar6;
                nVar6 = nVar10;
                if (nVar6 == null) {
                    break;
                } else {
                    nVar10 = nVar6.b;
                }
            }
            nVar3 = nVar2;
        }
        c(nVar3, false);
        n nVar11 = nVar.b;
        if (nVar11 != null) {
            i10 = nVar11.r;
            nVar3.b = nVar11;
            nVar11.a = nVar3;
            nVar.b = null;
        } else {
            i10 = 0;
        }
        n nVar12 = nVar.c;
        if (nVar12 != null) {
            i11 = nVar12.r;
            nVar3.c = nVar12;
            nVar12.a = nVar3;
            nVar.c = null;
        }
        nVar3.r = Math.max(i10, i11) + 1;
        d(nVar, nVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        n nVar = this.f;
        nVar.e = nVar;
        nVar.d = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nVar != null;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.a;
        nVar.a = null;
        if (nVar2 != null) {
            nVar2.a = nVar3;
        }
        if (nVar3 == null) {
            this.c = nVar2;
        } else if (nVar3.b == nVar) {
            nVar3.b = nVar2;
        } else {
            nVar3.c = nVar2;
        }
    }

    public final void e(n nVar) {
        n nVar2 = nVar.b;
        n nVar3 = nVar.c;
        n nVar4 = nVar3.b;
        n nVar5 = nVar3.c;
        nVar.c = nVar4;
        if (nVar4 != null) {
            nVar4.a = nVar;
        }
        d(nVar, nVar3);
        nVar3.b = nVar;
        nVar.a = nVar3;
        int max = Math.max(nVar2 != null ? nVar2.r : 0, nVar4 != null ? nVar4.r : 0) + 1;
        nVar.r = max;
        nVar3.r = Math.max(max, nVar5 != null ? nVar5.r : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.h;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 0);
        this.h = mVar2;
        return mVar2;
    }

    public final void f(n nVar) {
        n nVar2 = nVar.b;
        n nVar3 = nVar.c;
        n nVar4 = nVar2.b;
        n nVar5 = nVar2.c;
        nVar.b = nVar5;
        if (nVar5 != null) {
            nVar5.a = nVar;
        }
        d(nVar, nVar2);
        nVar2.c = nVar;
        nVar.a = nVar2;
        int max = Math.max(nVar3 != null ? nVar3.r : 0, nVar5 != null ? nVar5.r : 0) + 1;
        nVar.r = max;
        nVar2.r = Math.max(max, nVar4 != null ? nVar4.r : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        n nVar;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (nVar == null) {
                return nVar.n;
            }
            return null;
        }
        nVar = null;
        if (nVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.n;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 1);
        this.n = mVar2;
        return mVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        n a2 = a(obj, true);
        Object obj3 = a2.n;
        a2.n = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        n nVar;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (nVar != null) {
                c(nVar, true);
            }
            if (nVar == null) {
                return nVar.n;
            }
            return null;
        }
        nVar = null;
        if (nVar != null) {
        }
        if (nVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
