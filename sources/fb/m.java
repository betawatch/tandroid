package fb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m extends AbstractMap implements Serializable {
    public static final i r = new i(0);
    public final boolean b;
    public l c;
    public final l f;
    public k h;
    public k n;
    public int d = 0;
    public int e = 0;
    public final Comparator a = r;

    public m(boolean z10) {
        this.b = z10;
        this.f = new l(z10);
    }

    public final l a(Object obj, boolean z10) {
        int i10;
        l lVar;
        l lVar2 = this.c;
        i iVar = r;
        Comparator comparator = this.a;
        if (lVar2 != null) {
            Comparable comparable = comparator == iVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = lVar2.f;
                i10 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i10 == 0) {
                    return lVar2;
                }
                l lVar3 = i10 < 0 ? lVar2.b : lVar2.c;
                if (lVar3 == null) {
                    break;
                }
                lVar2 = lVar3;
            }
        } else {
            i10 = 0;
        }
        l lVar4 = lVar2;
        if (!z10) {
            return null;
        }
        l lVar5 = this.f;
        if (lVar4 != null) {
            lVar = new l(this.b, lVar4, obj, lVar5, lVar5.e);
            if (i10 < 0) {
                lVar4.b = lVar;
            } else {
                lVar4.c = lVar;
            }
            b(lVar4, true);
        } else {
            if (comparator == iVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.b, lVar4, obj, lVar5, lVar5.e);
            this.c = lVar;
        }
        this.d++;
        this.e++;
        return lVar;
    }

    public final void b(l lVar, boolean z10) {
        while (lVar != null) {
            l lVar2 = lVar.b;
            l lVar3 = lVar.c;
            int i10 = lVar2 != null ? lVar2.r : 0;
            int i11 = lVar3 != null ? lVar3.r : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                l lVar4 = lVar3.b;
                l lVar5 = lVar3.c;
                int i13 = (lVar4 != null ? lVar4.r : 0) - (lVar5 != null ? lVar5.r : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(lVar);
                } else {
                    f(lVar3);
                    e(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                l lVar6 = lVar2.b;
                l lVar7 = lVar2.c;
                int i14 = (lVar6 != null ? lVar6.r : 0) - (lVar7 != null ? lVar7.r : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(lVar);
                } else {
                    e(lVar2);
                    f(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                lVar.r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                lVar.r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            lVar = lVar.a;
        }
    }

    public final void c(l lVar, boolean z10) {
        l lVar2;
        l lVar3;
        int i10;
        if (z10) {
            l lVar4 = lVar.e;
            lVar4.d = lVar.d;
            lVar.d.e = lVar4;
        }
        l lVar5 = lVar.b;
        l lVar6 = lVar.c;
        l lVar7 = lVar.a;
        int i11 = 0;
        if (lVar5 == null || lVar6 == null) {
            if (lVar5 != null) {
                d(lVar, lVar5);
                lVar.b = null;
            } else if (lVar6 != null) {
                d(lVar, lVar6);
                lVar.c = null;
            } else {
                d(lVar, null);
            }
            b(lVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (lVar5.r > lVar6.r) {
            l lVar8 = lVar5.c;
            while (true) {
                l lVar9 = lVar8;
                lVar3 = lVar5;
                lVar5 = lVar9;
                if (lVar5 == null) {
                    break;
                } else {
                    lVar8 = lVar5.c;
                }
            }
        } else {
            l lVar10 = lVar6.b;
            while (true) {
                lVar2 = lVar6;
                lVar6 = lVar10;
                if (lVar6 == null) {
                    break;
                } else {
                    lVar10 = lVar6.b;
                }
            }
            lVar3 = lVar2;
        }
        c(lVar3, false);
        l lVar11 = lVar.b;
        if (lVar11 != null) {
            i10 = lVar11.r;
            lVar3.b = lVar11;
            lVar11.a = lVar3;
            lVar.b = null;
        } else {
            i10 = 0;
        }
        l lVar12 = lVar.c;
        if (lVar12 != null) {
            i11 = lVar12.r;
            lVar3.c = lVar12;
            lVar12.a = lVar3;
            lVar.c = null;
        }
        lVar3.r = Math.max(i10, i11) + 1;
        d(lVar, lVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        l lVar = this.f;
        lVar.e = lVar;
        lVar.d = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVar = null;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return lVar != null;
    }

    public final void d(l lVar, l lVar2) {
        l lVar3 = lVar.a;
        lVar.a = null;
        if (lVar2 != null) {
            lVar2.a = lVar3;
        }
        if (lVar3 == null) {
            this.c = lVar2;
        } else if (lVar3.b == lVar) {
            lVar3.b = lVar2;
        } else {
            lVar3.c = lVar2;
        }
    }

    public final void e(l lVar) {
        l lVar2 = lVar.b;
        l lVar3 = lVar.c;
        l lVar4 = lVar3.b;
        l lVar5 = lVar3.c;
        lVar.c = lVar4;
        if (lVar4 != null) {
            lVar4.a = lVar;
        }
        d(lVar, lVar3);
        lVar3.b = lVar;
        lVar.a = lVar3;
        int max = Math.max(lVar2 != null ? lVar2.r : 0, lVar4 != null ? lVar4.r : 0) + 1;
        lVar.r = max;
        lVar3.r = Math.max(max, lVar5 != null ? lVar5.r : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.h;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 0);
        this.h = kVar2;
        return kVar2;
    }

    public final void f(l lVar) {
        l lVar2 = lVar.b;
        l lVar3 = lVar.c;
        l lVar4 = lVar2.b;
        l lVar5 = lVar2.c;
        lVar.b = lVar5;
        if (lVar5 != null) {
            lVar5.a = lVar;
        }
        d(lVar, lVar2);
        lVar2.c = lVar;
        lVar.a = lVar2;
        int max = Math.max(lVar3 != null ? lVar3.r : 0, lVar5 != null ? lVar5.r : 0) + 1;
        lVar.r = max;
        lVar2.r = Math.max(max, lVar4 != null ? lVar4.r : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        l lVar;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (lVar == null) {
                return lVar.n;
            }
            return null;
        }
        lVar = null;
        if (lVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k kVar = this.n;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.n = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        l a2 = a(obj, true);
        Object obj3 = a2.n;
        a2.n = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        l lVar;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (lVar != null) {
                c(lVar, true);
            }
            if (lVar == null) {
                return lVar.n;
            }
            return null;
        }
        lVar = null;
        if (lVar != null) {
        }
        if (lVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
