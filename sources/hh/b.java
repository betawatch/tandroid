package hh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final boolean a;
    public long k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public ArrayList b = new ArrayList();
    public final LongSparseArray c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet i = new HashSet();
    public final HashSet j = new HashSet();
    public final HashSet l = new HashSet();

    public b(boolean z10) {
        this.a = z10;
    }

    public final void a(int i9, boolean z10) {
        if (this.a) {
            if (!z10) {
                if (i9 == 0) {
                    this.m = false;
                    return;
                }
                if (i9 == 1) {
                    this.n = false;
                    return;
                }
                if (i9 == 2) {
                    this.o = false;
                    return;
                } else if (i9 == 3) {
                    this.p = false;
                    return;
                } else {
                    if (i9 == 4) {
                        this.q = false;
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i9 == 0) {
                this.m = b(i9, arrayList);
                return;
            }
            if (i9 == 1) {
                this.n = b(i9, arrayList);
                return;
            }
            if (i9 == 2) {
                this.o = b(i9, this.e);
                return;
            }
            if (i9 == 3) {
                this.p = b(i9, this.f);
            } else if (i9 == 4) {
                this.q = b(i9, this.g);
            } else if (i9 == 7) {
                b(i9, this.h);
            }
        }
    }

    public final boolean b(int i9, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((a) arrayList.get(i10)).d == i9 && !this.j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (this.a) {
            return;
        }
        HashSet hashSet = this.i;
        hashSet.clear();
        HashSet hashSet2 = this.j;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            long j10 = ((a) it.next()).b;
            if (j10 != 0) {
                hashSet.add(Long.valueOf(j10));
            }
        }
        HashSet hashSet3 = this.l;
        hashSet3.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            r6 r6Var = (r6) this.c.get(((Long) it2.next()).longValue());
            if (r6Var != null) {
                SparseArray sparseArray = r6Var.d;
                int i9 = 0;
                while (true) {
                    if (i9 >= sparseArray.size()) {
                        hashSet3.add(Long.valueOf(r6Var.a));
                        break;
                    }
                    ArrayList arrayList = ((s6) sparseArray.valueAt(i9)).b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!hashSet2.contains((a) obj)) {
                            break;
                        }
                    }
                    i9++;
                }
            }
        }
    }

    public final void d() {
        this.k = 0L;
        this.j.clear();
        this.l.clear();
    }

    public final ArrayList e(int i9) {
        if (i9 == 0 || i9 == 1) {
            return this.d;
        }
        if (i9 == 2) {
            return this.e;
        }
        if (i9 == 3) {
            return this.f;
        }
        if (i9 == 4) {
            return this.g;
        }
        if (i9 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i9) {
        if (i9 == 0) {
            return this.r;
        }
        if (i9 == 1) {
            return this.s;
        }
        if (i9 == 2) {
            return this.t;
        }
        if (i9 == 3) {
            return this.u;
        }
        if (i9 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j10 = aVar.c;
        if (!z10) {
            j10 = -j10;
        }
        int i9 = aVar.d;
        if (i9 == 0) {
            this.r += j10;
            return;
        }
        if (i9 == 1) {
            this.s += j10;
            return;
        }
        if (i9 == 2) {
            this.t += j10;
        } else if (i9 == 3) {
            this.u += j10;
        } else if (i9 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f.isEmpty()) {
            return this.a || this.b.isEmpty();
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.k -= aVar.c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.k += aVar.c;
            a(aVar.d, true);
        }
        c();
    }
}
