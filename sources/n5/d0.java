package n5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.s2;
import com.google.android.gms.internal.cast.v6;
import j3.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 extends o5.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i9) {
        this.a = i9;
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
                ((p5.h) this.b).b();
                break;
        }
    }

    @Override // o5.g
    public void h(String str, long j10, int i9, long j11, long j12) {
        switch (this.a) {
            case 0:
                o4 o4Var = ((c) this.b).l;
                if (o4Var != null) {
                    v6 E = o4Var.a.E();
                    s2 s2Var = new s2(str);
                    s2Var.b = j10;
                    s2Var.c = i9;
                    s2Var.d = j11;
                    s2Var.e = j12;
                    h3 h3Var = new h3(s2Var);
                    h3Var.f = E.h;
                    E.d.add(h3Var);
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
                ArrayList c10 = q5.a.c(iArr);
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
    public void j(int[] iArr, int i9) {
        int i10;
        switch (this.a) {
            case 1:
                if (i9 == 0) {
                    i10 = ((o5.c) this.b).d.size();
                } else {
                    i10 = ((o5.c) this.b).e.get(i9, -1);
                    if (i10 == -1) {
                        ((o5.c) this.b).d();
                        return;
                    }
                }
                ((o5.c) this.b).h();
                ((o5.c) this.b).d.addAll(i10, q5.a.c(iArr));
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
    public void k(m5.o[] oVarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                o5.c cVar = (o5.c) this.b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.g;
                arrayList.clear();
                int i9 = 0;
                for (m5.o oVar : oVarArr) {
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
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    int i12 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i12 != -1) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                q5.a.e(arrayList2);
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
                for (int i9 : iArr) {
                    ((o5.c) this.b).f.remove(Integer.valueOf(i9));
                    int i10 = ((o5.c) this.b).e.get(i9, -1);
                    if (i10 == -1) {
                        ((o5.c) this.b).d();
                        return;
                    } else {
                        ((o5.c) this.b).e.delete(i9);
                        arrayList.add(Integer.valueOf(i10));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((o5.c) this.b).h();
                ((o5.c) this.b).d.removeAll(q5.a.c(iArr));
                o5.c.b((o5.c) this.b);
                o5.c cVar = (o5.c) this.b;
                q5.a.e(arrayList);
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
    public void m(ArrayList arrayList, ArrayList arrayList2, int i9) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                if (i9 == 0) {
                    ((o5.c) this.b).d.size();
                } else if (arrayList2.isEmpty()) {
                    q5.b bVar = ((o5.c) this.b).a;
                    Log.w(bVar.a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((o5.c) this.b).e.get(i9, -1) == -1) {
                    o5.c cVar = (o5.c) this.b;
                    cVar.e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    int i11 = ((o5.c) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i11 == -1) {
                        ((o5.c) this.b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i11));
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
                int i9 = 0;
                while (i9 < iArr.length) {
                    int i10 = iArr[i9];
                    cVar.f.remove(Integer.valueOf(i10));
                    int i11 = cVar.e.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        break;
                    } else {
                        i9 = r0.e(i11, i9, 1, arrayList);
                    }
                }
                Collections.sort(arrayList);
                cVar.h();
                q5.a.e(arrayList);
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
