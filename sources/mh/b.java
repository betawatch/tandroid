package mh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.w6;
import org.telegram.ui.x6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
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

    public b(boolean z4) {
        this.a = z4;
    }

    public final void a(int i10, boolean z4) {
        if (this.a) {
            if (!z4) {
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
            if (((a) arrayList.get(i11)).d == i10 && !this.j.contains(arrayList.get(i11))) {
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
            w6 w6Var = (w6) this.c.get(((Long) it2.next()).longValue());
            if (w6Var != null) {
                SparseArray sparseArray = w6Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseArray.size()) {
                        hashSet3.add(Long.valueOf(w6Var.a));
                        break;
                    }
                    ArrayList arrayList = ((x6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (!hashSet2.contains((a) obj)) {
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

    public final void g(a aVar, boolean z4) {
        long j10 = aVar.c;
        if (!z4) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.r += j10;
            return;
        }
        if (i10 == 1) {
            this.s += j10;
            return;
        }
        if (i10 == 2) {
            this.t += j10;
        } else if (i10 == 3) {
            this.u += j10;
        } else if (i10 == 4) {
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
