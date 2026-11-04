package f6;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.f3;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q2;
import com.google.android.gms.internal.cast.s6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 extends g6.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // g6.g
    public void a() {
        switch (this.a) {
            case 2:
                ((h6.h) this.b).b();
                break;
        }
    }

    @Override // g6.g
    public void c() {
        switch (this.a) {
            case 2:
                ((h6.h) this.b).b();
                break;
        }
    }

    @Override // g6.g
    public void d() {
        switch (this.a) {
            case 2:
                ((h6.h) this.b).b();
                break;
        }
    }

    @Override // g6.g
    public void e() {
        switch (this.a) {
            case 2:
                ((h6.h) this.b).b();
                break;
        }
    }

    @Override // g6.g
    public void g() {
        switch (this.a) {
            case 1:
                g6.c cVar = (g6.c) this.b;
                long e10 = cVar.e();
                if (e10 != cVar.b) {
                    cVar.b = e10;
                    cVar.c();
                    if (cVar.b != 0) {
                        cVar.d();
                        break;
                    }
                }
                break;
            case 2:
                ((h6.h) this.b).b();
                break;
        }
    }

    @Override // g6.g
    public void h(String str, long j10, int i3, long j11, long j12) {
        switch (this.a) {
            case 0:
                m4 m4Var = ((c) this.b).l;
                if (m4Var != null) {
                    s6 Q = m4Var.a.Q();
                    q2 q2Var = new q2(str);
                    q2Var.b = j10;
                    q2Var.c = i3;
                    q2Var.d = j11;
                    q2Var.e = j12;
                    f3 f3Var = new f3(q2Var);
                    f3Var.f = Q.h;
                    Q.d.add(f3Var);
                    break;
                }
                break;
        }
    }

    @Override // g6.g
    public void i(int[] iArr) {
        switch (this.a) {
            case 1:
                g6.c cVar = (g6.c) this.b;
                ArrayList c2 = i6.a.c(iArr);
                if (!cVar.d.equals(c2)) {
                    cVar.h();
                    cVar.f.evictAll();
                    cVar.g.clear();
                    cVar.d = c2;
                    g6.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    break;
                }
                break;
        }
    }

    @Override // g6.g
    public void j(int[] iArr, int i3) {
        int i10;
        switch (this.a) {
            case 1:
                if (i3 == 0) {
                    i10 = ((g6.c) this.b).d.size();
                } else {
                    i10 = ((g6.c) this.b).e.get(i3, -1);
                    if (i10 == -1) {
                        ((g6.c) this.b).d();
                        return;
                    }
                }
                ((g6.c) this.b).h();
                ((g6.c) this.b).d.addAll(i10, i6.a.c(iArr));
                g6.c.b((g6.c) this.b);
                g6.c cVar = (g6.c) this.b;
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((g6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // g6.g
    public void k(e6.o[] oVarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                g6.c cVar = (g6.c) this.b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.g;
                arrayList.clear();
                int i3 = 0;
                for (e6.o oVar : oVarArr) {
                    int i10 = oVar.b;
                    cVar.f.put(Integer.valueOf(i10), oVar);
                    int i11 = sparseIntArray.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        break;
                    } else {
                        hashSet.add(Integer.valueOf(i11));
                    }
                }
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    int i12 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i12 != -1) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                i6.a.e(arrayList2);
                g6.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // g6.g
    public void l(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i3 : iArr) {
                    ((g6.c) this.b).f.remove(Integer.valueOf(i3));
                    int i10 = ((g6.c) this.b).e.get(i3, -1);
                    if (i10 == -1) {
                        ((g6.c) this.b).d();
                        return;
                    } else {
                        ((g6.c) this.b).e.delete(i3);
                        arrayList.add(Integer.valueOf(i10));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((g6.c) this.b).h();
                ((g6.c) this.b).d.removeAll(i6.a.c(iArr));
                g6.c.b((g6.c) this.b);
                g6.c cVar = (g6.c) this.b;
                i6.a.e(arrayList);
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((g6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // g6.g
    public void m(ArrayList arrayList, ArrayList arrayList2, int i3) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                if (i3 == 0) {
                    ((g6.c) this.b).d.size();
                } else if (arrayList2.isEmpty()) {
                    i6.b bVar = ((g6.c) this.b).a;
                    Log.w(bVar.a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((g6.c) this.b).e.get(i3, -1) == -1) {
                    g6.c cVar = (g6.c) this.b;
                    cVar.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    int i11 = ((g6.c) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i11 == -1) {
                        ((g6.c) this.b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i11));
                }
                ((g6.c) this.b).h();
                g6.c cVar2 = (g6.c) this.b;
                cVar2.d = arrayList;
                g6.c.b(cVar2);
                g6.c cVar3 = (g6.c) this.b;
                synchronized (cVar3.m) {
                    Iterator it = cVar3.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((g6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // g6.g
    public void n(int[] iArr) {
        switch (this.a) {
            case 1:
                g6.c cVar = (g6.c) this.b;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i10 = iArr[i3];
                    cVar.f.remove(Integer.valueOf(i10));
                    int i11 = cVar.e.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        break;
                    } else {
                        i3 = com.google.android.recaptcha.internal.a.f(i11, i3, 1, arrayList);
                    }
                }
                Collections.sort(arrayList);
                cVar.h();
                i6.a.e(arrayList);
                g6.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // g6.g
    public void o() {
        switch (this.a) {
            case 1:
                ((g6.c) this.b).d();
                break;
        }
    }
}
