package n5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.r2;
import com.google.android.gms.internal.cast.t6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d0 extends o5.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o5.g
    public void a() {
        switch (this.a) {
            case 2:
                ((p5.h) this.b).b();
                break;
        }
    }

    @Override // o5.g
    public void c() {
        switch (this.a) {
            case 2:
                ((p5.h) this.b).b();
                break;
        }
    }

    @Override // o5.g
    public void d() {
        switch (this.a) {
            case 2:
                ((p5.h) this.b).b();
                break;
        }
    }

    @Override // o5.g
    public void e() {
        switch (this.a) {
            case 2:
                ((p5.h) this.b).b();
                break;
        }
    }

    @Override // o5.g
    public void g() {
        switch (this.a) {
            case 1:
                o5.c cVar = (o5.c) this.b;
                long e9 = cVar.e();
                if (e9 != cVar.b) {
                    cVar.b = e9;
                    cVar.c();
                    if (cVar.b != 0) {
                        cVar.d();
                        break;
                    }
                }
                break;
            case 2:
                ((p5.h) this.b).b();
                break;
        }
    }

    @Override // o5.g
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.a) {
            case 0:
                m4 m4Var = ((c) this.b).l;
                if (m4Var != null) {
                    t6 F = m4Var.a.F();
                    r2 r2Var = new r2(str);
                    r2Var.b = j10;
                    r2Var.c = i10;
                    r2Var.d = j11;
                    r2Var.e = j12;
                    g3 g3Var = new g3(r2Var);
                    g3Var.f = F.h;
                    F.d.add(g3Var);
                    break;
                }
                break;
        }
    }

    @Override // o5.g
    public void i(int[] iArr) {
        switch (this.a) {
            case 1:
                o5.c cVar = (o5.c) this.b;
                ArrayList c10 = r5.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f.evictAll();
                    cVar.g.clear();
                    cVar.d = c10;
                    o5.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    break;
                }
                break;
        }
    }

    @Override // o5.g
    public void j(int[] iArr, int i10) {
        int i11;
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((o5.c) this.b).d.size();
                } else {
                    i11 = ((o5.c) this.b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((o5.c) this.b).d();
                        return;
                    }
                }
                ((o5.c) this.b).h();
                ((o5.c) this.b).d.addAll(i11, r5.a.c(iArr));
                o5.c.b((o5.c) this.b);
                o5.c cVar = (o5.c) this.b;
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((o5.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // o5.g
    public void k(m5.p[] pVarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                o5.c cVar = (o5.c) this.b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.g;
                arrayList.clear();
                int i10 = 0;
                for (m5.p pVar : pVarArr) {
                    int i11 = pVar.b;
                    cVar.f.put(Integer.valueOf(i11), pVar);
                    int i12 = sparseIntArray.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        break;
                    } else {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    int i13 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i13 != -1) {
                        hashSet.add(Integer.valueOf(i13));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                r5.a.e(arrayList2);
                o5.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // o5.g
    public void l(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((o5.c) this.b).f.remove(Integer.valueOf(i10));
                    int i11 = ((o5.c) this.b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((o5.c) this.b).d();
                        return;
                    } else {
                        ((o5.c) this.b).e.delete(i10);
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((o5.c) this.b).h();
                ((o5.c) this.b).d.removeAll(r5.a.c(iArr));
                o5.c.b((o5.c) this.b);
                o5.c cVar = (o5.c) this.b;
                r5.a.e(arrayList);
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((o5.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // o5.g
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((o5.c) this.b).d.size();
                } else if (arrayList2.isEmpty()) {
                    r5.b bVar = ((o5.c) this.b).a;
                    Log.w(bVar.a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((o5.c) this.b).e.get(i10, -1) == -1) {
                    o5.c cVar = (o5.c) this.b;
                    cVar.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((o5.c) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((o5.c) this.b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((o5.c) this.b).h();
                o5.c cVar2 = (o5.c) this.b;
                cVar2.d = arrayList;
                o5.c.b(cVar2);
                o5.c cVar3 = (o5.c) this.b;
                synchronized (cVar3.m) {
                    Iterator it = cVar3.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((o5.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // o5.g
    public void n(int[] iArr) {
        switch (this.a) {
            case 1:
                o5.c cVar = (o5.c) this.b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f.remove(Integer.valueOf(i11));
                    int i12 = cVar.e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        break;
                    } else {
                        i10 = i0.a.f(i12, i10, 1, arrayList);
                    }
                }
                Collections.sort(arrayList);
                cVar.h();
                r5.a.e(arrayList);
                o5.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // o5.g
    public void o() {
        switch (this.a) {
            case 1:
                ((o5.c) this.b).d();
                break;
        }
    }
}
