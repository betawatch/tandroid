package d6;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.j3;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.u2;
import com.google.android.gms.internal.cast.x6;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c0 extends e6.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // e6.g
    public void a() {
        switch (this.a) {
            case 2:
                ((f6.i) this.b).b();
                break;
        }
    }

    @Override // e6.g
    public void c() {
        switch (this.a) {
            case 2:
                ((f6.i) this.b).b();
                break;
        }
    }

    @Override // e6.g
    public void d() {
        switch (this.a) {
            case 2:
                ((f6.i) this.b).b();
                break;
        }
    }

    @Override // e6.g
    public void e() {
        switch (this.a) {
            case 2:
                ((f6.i) this.b).b();
                break;
        }
    }

    @Override // e6.g
    public void g() {
        switch (this.a) {
            case 1:
                e6.c cVar = (e6.c) this.b;
                long e = cVar.e();
                if (e != cVar.b) {
                    cVar.b = e;
                    cVar.c();
                    if (cVar.b != 0) {
                        cVar.d();
                        break;
                    }
                }
                break;
            case 2:
                ((f6.i) this.b).b();
                break;
        }
    }

    @Override // e6.g
    public void h(String str, long j3, int i10, long j10, long j11) {
        switch (this.a) {
            case 0:
                q4 q4Var = ((c) this.b).l;
                if (q4Var != null) {
                    x6 E = q4Var.a.E();
                    u2 u2Var = new u2(str);
                    u2Var.b = j3;
                    u2Var.c = i10;
                    u2Var.d = j10;
                    u2Var.e = j11;
                    j3 j3Var = new j3(u2Var);
                    j3Var.f = E.h;
                    E.d.add(j3Var);
                    break;
                }
                break;
        }
    }

    @Override // e6.g
    public void i(int[] iArr) {
        switch (this.a) {
            case 1:
                e6.c cVar = (e6.c) this.b;
                ArrayList c10 = g6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f.evictAll();
                    cVar.g.clear();
                    cVar.d = c10;
                    e6.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    break;
                }
                break;
        }
    }

    @Override // e6.g
    public void j(int[] iArr, int i10) {
        int i11;
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((e6.c) this.b).d.size();
                } else {
                    i11 = ((e6.c) this.b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.b).d();
                        return;
                    }
                }
                ((e6.c) this.b).h();
                ((e6.c) this.b).d.addAll(i11, g6.a.c(iArr));
                e6.c.b((e6.c) this.b);
                e6.c cVar = (e6.c) this.b;
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((e6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // e6.g
    public void k(c6.o[] oVarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                e6.c cVar = (e6.c) this.b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.g;
                arrayList.clear();
                int i10 = 0;
                for (c6.o oVar : oVarArr) {
                    int i11 = oVar.b;
                    cVar.f.put(Integer.valueOf(i11), oVar);
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
                g6.a.e(arrayList2);
                e6.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // e6.g
    public void l(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((e6.c) this.b).f.remove(Integer.valueOf(i10));
                    int i11 = ((e6.c) this.b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.b).d();
                        return;
                    } else {
                        ((e6.c) this.b).e.delete(i10);
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((e6.c) this.b).h();
                ((e6.c) this.b).d.removeAll(g6.a.c(iArr));
                e6.c.b((e6.c) this.b);
                e6.c cVar = (e6.c) this.b;
                g6.a.e(arrayList);
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((e6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // e6.g
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((e6.c) this.b).d.size();
                } else if (arrayList2.isEmpty()) {
                    g6.b bVar = ((e6.c) this.b).a;
                    Log.w(bVar.a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((e6.c) this.b).e.get(i10, -1) == -1) {
                    e6.c cVar = (e6.c) this.b;
                    cVar.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((e6.c) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((e6.c) this.b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((e6.c) this.b).h();
                e6.c cVar2 = (e6.c) this.b;
                cVar2.d = arrayList;
                e6.c.b(cVar2);
                e6.c cVar3 = (e6.c) this.b;
                synchronized (cVar3.m) {
                    Iterator it = cVar3.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((e6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // e6.g
    public void n(int[] iArr) {
        switch (this.a) {
            case 1:
                e6.c cVar = (e6.c) this.b;
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
                        i10 = e2.d(i12, i10, 1, arrayList);
                    }
                }
                Collections.sort(arrayList);
                cVar.h();
                g6.a.e(arrayList);
                e6.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // e6.g
    public void o() {
        switch (this.a) {
            case 1:
                ((e6.c) this.b).d();
                break;
        }
    }
}
