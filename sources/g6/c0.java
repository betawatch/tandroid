package g6;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.e3;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.p2;
import com.google.android.gms.internal.cast.r6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c0 extends h6.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // h6.g
    public void a() {
        switch (this.a) {
            case 2:
                ((i6.h) this.b).b();
                break;
        }
    }

    @Override // h6.g
    public void c() {
        switch (this.a) {
            case 2:
                ((i6.h) this.b).b();
                break;
        }
    }

    @Override // h6.g
    public void d() {
        switch (this.a) {
            case 2:
                ((i6.h) this.b).b();
                break;
        }
    }

    @Override // h6.g
    public void e() {
        switch (this.a) {
            case 2:
                ((i6.h) this.b).b();
                break;
        }
    }

    @Override // h6.g
    public void g() {
        switch (this.a) {
            case 1:
                h6.c cVar = (h6.c) this.b;
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
                ((i6.h) this.b).b();
                break;
        }
    }

    @Override // h6.g
    public void h(String str, long j3, int i7, long j10, long j11) {
        switch (this.a) {
            case 0:
                l4 l4Var = ((c) this.b).l;
                if (l4Var != null) {
                    r6 N = l4Var.a.N();
                    p2 p2Var = new p2(str);
                    p2Var.b = j3;
                    p2Var.c = i7;
                    p2Var.d = j10;
                    p2Var.e = j11;
                    e3 e3Var = new e3(p2Var);
                    e3Var.f = N.h;
                    N.d.add(e3Var);
                    break;
                }
                break;
        }
    }

    @Override // h6.g
    public void i(int[] iArr) {
        switch (this.a) {
            case 1:
                h6.c cVar = (h6.c) this.b;
                ArrayList c10 = j6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f.evictAll();
                    cVar.g.clear();
                    cVar.d = c10;
                    h6.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    break;
                }
                break;
        }
    }

    @Override // h6.g
    public void j(int[] iArr, int i7) {
        int i10;
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    i10 = ((h6.c) this.b).d.size();
                } else {
                    i10 = ((h6.c) this.b).e.get(i7, -1);
                    if (i10 == -1) {
                        ((h6.c) this.b).d();
                        return;
                    }
                }
                ((h6.c) this.b).h();
                ((h6.c) this.b).d.addAll(i10, j6.a.c(iArr));
                h6.c.b((h6.c) this.b);
                h6.c cVar = (h6.c) this.b;
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((h6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // h6.g
    public void k(f6.o[] oVarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                h6.c cVar = (h6.c) this.b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.g;
                arrayList.clear();
                int i7 = 0;
                for (f6.o oVar : oVarArr) {
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
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    int i12 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i12 != -1) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                j6.a.e(arrayList2);
                h6.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // h6.g
    public void l(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i7 : iArr) {
                    ((h6.c) this.b).f.remove(Integer.valueOf(i7));
                    int i10 = ((h6.c) this.b).e.get(i7, -1);
                    if (i10 == -1) {
                        ((h6.c) this.b).d();
                        return;
                    } else {
                        ((h6.c) this.b).e.delete(i7);
                        arrayList.add(Integer.valueOf(i10));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((h6.c) this.b).h();
                ((h6.c) this.b).d.removeAll(j6.a.c(iArr));
                h6.c.b((h6.c) this.b);
                h6.c cVar = (h6.c) this.b;
                j6.a.e(arrayList);
                synchronized (cVar.m) {
                    Iterator it = cVar.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((h6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // h6.g
    public void m(ArrayList arrayList, ArrayList arrayList2, int i7) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                if (i7 == 0) {
                    ((h6.c) this.b).d.size();
                } else if (arrayList2.isEmpty()) {
                    j6.b bVar = ((h6.c) this.b).a;
                    Log.w(bVar.a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((h6.c) this.b).e.get(i7, -1) == -1) {
                    h6.c cVar = (h6.c) this.b;
                    cVar.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    int i11 = ((h6.c) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i11 == -1) {
                        ((h6.c) this.b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i11));
                }
                ((h6.c) this.b).h();
                h6.c cVar2 = (h6.c) this.b;
                cVar2.d = arrayList;
                h6.c.b(cVar2);
                h6.c cVar3 = (h6.c) this.b;
                synchronized (cVar3.m) {
                    Iterator it = cVar3.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((h6.c) this.b).f();
                return;
            default:
                return;
        }
    }

    @Override // h6.g
    public void n(int[] iArr) {
        switch (this.a) {
            case 1:
                h6.c cVar = (h6.c) this.b;
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (i7 < iArr.length) {
                    int i10 = iArr[i7];
                    cVar.f.remove(Integer.valueOf(i10));
                    int i11 = cVar.e.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        break;
                    } else {
                        i7 = com.google.android.recaptcha.internal.a.f(i11, i7, 1, arrayList);
                    }
                }
                Collections.sort(arrayList);
                cVar.h();
                j6.a.e(arrayList);
                h6.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override // h6.g
    public void o() {
        switch (this.a) {
            case 1:
                ((h6.c) this.b).d();
                break;
        }
    }
}
