package fb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class n extends AbstractMap implements Serializable {
    public static final j r = new j(0);
    public final boolean b;
    public m c;
    public final m f;
    public l h;
    public l n;
    public int d = 0;
    public int e = 0;
    public final Comparator a = r;

    public n(boolean z10) {
        this.b = z10;
        this.f = new m(z10);
    }

    public final m a(Object obj, boolean z10) {
        int i10;
        m mVar;
        m mVar2 = this.c;
        j jVar = r;
        Comparator comparator = this.a;
        if (mVar2 != null) {
            Comparable comparable = comparator == jVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mVar2.f;
                i10 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i10 == 0) {
                    return mVar2;
                }
                m mVar3 = i10 < 0 ? mVar2.b : mVar2.c;
                if (mVar3 == null) {
                    break;
                }
                mVar2 = mVar3;
            }
        } else {
            i10 = 0;
        }
        m mVar4 = mVar2;
        if (!z10) {
            return null;
        }
        m mVar5 = this.f;
        if (mVar4 != null) {
            mVar = new m(this.b, mVar4, obj, mVar5, mVar5.e);
            if (i10 < 0) {
                mVar4.b = mVar;
            } else {
                mVar4.c = mVar;
            }
            b(mVar4, true);
        } else {
            if (comparator == jVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.b, mVar4, obj, mVar5, mVar5.e);
            this.c = mVar;
        }
        this.d++;
        this.e++;
        return mVar;
    }

    public final void b(m mVar, boolean z10) {
        while (mVar != null) {
            m mVar2 = mVar.b;
            m mVar3 = mVar.c;
            int i10 = mVar2 != null ? mVar2.r : 0;
            int i11 = mVar3 != null ? mVar3.r : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                m mVar4 = mVar3.b;
                m mVar5 = mVar3.c;
                int i13 = (mVar4 != null ? mVar4.r : 0) - (mVar5 != null ? mVar5.r : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(mVar);
                } else {
                    f(mVar3);
                    e(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                m mVar6 = mVar2.b;
                m mVar7 = mVar2.c;
                int i14 = (mVar6 != null ? mVar6.r : 0) - (mVar7 != null ? mVar7.r : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(mVar);
                } else {
                    e(mVar2);
                    f(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                mVar.r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                mVar.r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            mVar = mVar.a;
        }
    }

    public final void c(m mVar, boolean z10) {
        m mVar2;
        m mVar3;
        int i10;
        if (z10) {
            m mVar4 = mVar.e;
            mVar4.d = mVar.d;
            mVar.d.e = mVar4;
        }
        m mVar5 = mVar.b;
        m mVar6 = mVar.c;
        m mVar7 = mVar.a;
        int i11 = 0;
        if (mVar5 == null || mVar6 == null) {
            if (mVar5 != null) {
                d(mVar, mVar5);
                mVar.b = null;
            } else if (mVar6 != null) {
                d(mVar, mVar6);
                mVar.c = null;
            } else {
                d(mVar, null);
            }
            b(mVar7, false);
            this.d--;
            this.e++;
            return;
        }
        if (mVar5.r > mVar6.r) {
            m mVar8 = mVar5.c;
            while (true) {
                m mVar9 = mVar8;
                mVar3 = mVar5;
                mVar5 = mVar9;
                if (mVar5 == null) {
                    break;
                } else {
                    mVar8 = mVar5.c;
                }
            }
        } else {
            m mVar10 = mVar6.b;
            while (true) {
                mVar2 = mVar6;
                mVar6 = mVar10;
                if (mVar6 == null) {
                    break;
                } else {
                    mVar10 = mVar6.b;
                }
            }
            mVar3 = mVar2;
        }
        c(mVar3, false);
        m mVar11 = mVar.b;
        if (mVar11 != null) {
            i10 = mVar11.r;
            mVar3.b = mVar11;
            mVar11.a = mVar3;
            mVar.b = null;
        } else {
            i10 = 0;
        }
        m mVar12 = mVar.c;
        if (mVar12 != null) {
            i11 = mVar12.r;
            mVar3.c = mVar12;
            mVar12.a = mVar3;
            mVar.c = null;
        }
        mVar3.r = Math.max(i10, i11) + 1;
        d(mVar, mVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        m mVar = this.f;
        mVar.e = mVar;
        mVar.d = mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        m mVar = null;
        if (obj != null) {
            try {
                mVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mVar != null;
    }

    public final void d(m mVar, m mVar2) {
        m mVar3 = mVar.a;
        mVar.a = null;
        if (mVar2 != null) {
            mVar2.a = mVar3;
        }
        if (mVar3 == null) {
            this.c = mVar2;
        } else if (mVar3.b == mVar) {
            mVar3.b = mVar2;
        } else {
            mVar3.c = mVar2;
        }
    }

    public final void e(m mVar) {
        m mVar2 = mVar.b;
        m mVar3 = mVar.c;
        m mVar4 = mVar3.b;
        m mVar5 = mVar3.c;
        mVar.c = mVar4;
        if (mVar4 != null) {
            mVar4.a = mVar;
        }
        d(mVar, mVar3);
        mVar3.b = mVar;
        mVar.a = mVar3;
        int max = Math.max(mVar2 != null ? mVar2.r : 0, mVar4 != null ? mVar4.r : 0) + 1;
        mVar.r = max;
        mVar3.r = Math.max(max, mVar5 != null ? mVar5.r : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.h;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.h = lVar2;
        return lVar2;
    }

    public final void f(m mVar) {
        m mVar2 = mVar.b;
        m mVar3 = mVar.c;
        m mVar4 = mVar2.b;
        m mVar5 = mVar2.c;
        mVar.b = mVar5;
        if (mVar5 != null) {
            mVar5.a = mVar;
        }
        d(mVar, mVar2);
        mVar2.c = mVar;
        mVar.a = mVar2;
        int max = Math.max(mVar3 != null ? mVar3.r : 0, mVar5 != null ? mVar5.r : 0) + 1;
        mVar.r = max;
        mVar2.r = Math.max(max, mVar4 != null ? mVar4.r : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        m mVar;
        if (obj != null) {
            try {
                mVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (mVar == null) {
                return mVar.n;
            }
            return null;
        }
        mVar = null;
        if (mVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        l lVar = this.n;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.n = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        m a2 = a(obj, true);
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
        m mVar;
        if (obj != null) {
            try {
                mVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (mVar != null) {
                c(mVar, true);
            }
            if (mVar == null) {
                return mVar.n;
            }
            return null;
        }
        mVar = null;
        if (mVar != null) {
        }
        if (mVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }
}
