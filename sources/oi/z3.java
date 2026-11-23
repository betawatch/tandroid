package oi;

import a8.la;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class z3 implements z2.a {
    public ArrayList a;

    public z3(wf.e eVar) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(eVar);
    }

    @Override // z2.a
    public long a(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((c4.a) arrayList.get(0)).b) {
            return ((c4.a) arrayList.get(0)).b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            c4.a aVar = (c4.a) arrayList.get(i7);
            long j10 = aVar.b;
            long j11 = aVar.b;
            if (j3 < j10) {
                long j12 = ((c4.a) arrayList.get(i7 - 1)).d;
                return (j12 == -9223372036854775807L || j12 <= j3 || j12 >= j11) ? j11 : j12;
            }
        }
        long j13 = ((c4.a) h9.o.n(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // z2.a
    public h9.i0 b(long j3) {
        int i7 = i(j3);
        if (i7 == 0) {
            h9.g0 g0Var = h9.i0.b;
            return h9.t1.e;
        }
        c4.a aVar = (c4.a) this.a.get(i7 - 1);
        long j10 = aVar.d;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return aVar.a;
        }
        h9.g0 g0Var2 = h9.i0.b;
        return h9.t1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // z2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(c4.a aVar, long j3) {
        boolean z10;
        int size;
        ArrayList arrayList = this.a;
        long j10 = aVar.b;
        la.f(j10 != -9223372036854775807L);
        if (j10 <= j3) {
            long j11 = aVar.d;
            if (j11 == -9223372036854775807L || j3 < j11) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j10 >= ((c4.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((c4.a) arrayList.get(size)).b <= j3) {
                        z10 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // z2.a
    public void clear() {
        this.a.clear();
    }

    @Override // z2.a
    public long d(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j3 < ((c4.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j10 = ((c4.a) arrayList.get(i7)).b;
            if (j3 == j10) {
                return j10;
            }
            if (j3 < j10) {
                c4.a aVar = (c4.a) arrayList.get(i7 - 1);
                long j11 = aVar.d;
                return (j11 == -9223372036854775807L || j11 > j3) ? aVar.b : j11;
            }
        }
        c4.a aVar2 = (c4.a) h9.o.n(arrayList);
        long j12 = aVar2.d;
        return (j12 == -9223372036854775807L || j3 < j12) ? aVar2.b : j12;
    }

    @Override // z2.a
    public void e(long j3) {
        ArrayList arrayList = this.a;
        int i7 = i(j3);
        if (i7 == 0) {
            return;
        }
        long j10 = ((c4.a) arrayList.get(i7 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            i7--;
        }
        arrayList.subList(0, i7).clear();
    }

    public s4.r f() {
        if (this.a == null) {
            return s4.r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new s4.r(bundle, this.a);
    }

    public void g(StringBuilder sb2) {
        sb2.append(((Boolean) p5.c.g(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void h(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            g(sb2);
        }
    }

    public int i(long j3) {
        ArrayList arrayList = this.a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (j3 < ((c4.a) arrayList.get(i7)).b) {
                return i7;
            }
        }
        return arrayList.size();
    }

    public wf.e j(int i7) {
        return (wf.e) this.a.get(i7);
    }

    public z3(int i7) {
        switch (i7) {
            case 3:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }
}
