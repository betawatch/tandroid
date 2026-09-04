package ai;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class c {
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

    public c(boolean z10) {
        this.a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.a) {
            if (!z10) {
                if (i10 == 0) {
                    this.m = false;
                    return;
                }
                if (i10 == 1) {
                    this.n = false;
                    return;
                }
                if (i10 == 2) {
                    this.o = false;
                    return;
                } else if (i10 == 3) {
                    this.p = false;
                    return;
                } else {
                    if (i10 == 4) {
                        this.q = false;
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.m = b(i10, arrayList);
                return;
            }
            if (i10 == 1) {
                this.n = b(i10, arrayList);
                return;
            }
            if (i10 == 2) {
                this.o = b(i10, this.e);
                return;
            }
            if (i10 == 3) {
                this.p = b(i10, this.f);
            } else if (i10 == 4) {
                this.q = b(i10, this.g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((b) arrayList.get(i11)).d == i10 && !this.j.contains(arrayList.get(i11))) {
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
            long j3 = ((b) it.next()).b;
            if (j3 != 0) {
                hashSet.add(Long.valueOf(j3));
            }
        }
        HashSet hashSet3 = this.l;
        hashSet3.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            s6 s6Var = (s6) this.c.get(((Long) it2.next()).longValue());
            if (s6Var != null) {
                SparseArray sparseArray = s6Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseArray.size()) {
                        hashSet3.add(Long.valueOf(s6Var.a));
                        break;
                    }
                    ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (!hashSet2.contains((b) obj)) {
                            break;
                        }
                    }
                    i10++;
                }
            }
        }
    }

    public final void d() {
        this.k = 0L;
        this.j.clear();
        this.l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f;
        }
        if (i10 == 4) {
            return this.g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.r;
        }
        if (i10 == 1) {
            return this.s;
        }
        if (i10 == 2) {
            return this.t;
        }
        if (i10 == 3) {
            return this.u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = bVar.d;
        if (i10 == 0) {
            this.r += j3;
            return;
        }
        if (i10 == 1) {
            this.s += j3;
            return;
        }
        if (i10 == 2) {
            this.t += j3;
        } else if (i10 == 3) {
            this.u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f.isEmpty()) {
            return this.a || this.b.isEmpty();
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.k -= bVar.c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.k += bVar.c;
            a(bVar.d, true);
        }
        c();
    }
}
