package li;

import a8.yb;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b4 implements w2.a {
    public ArrayList a;

    public b4(int i10) {
        switch (i10) {
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // w2.a
    public long a(long j10) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.a) arrayList.get(0)).b) {
            return ((z3.a) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j11 = aVar.b;
            long j12 = aVar.b;
            if (j10 < j11) {
                long j13 = ((z3.a) arrayList.get(i10 - 1)).d;
                return (j13 == -9223372036854775807L || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((z3.a) f9.o.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // w2.a
    public f9.i0 b(long j10) {
        int i10 = i(j10);
        if (i10 == 0) {
            f9.g0 g0Var = f9.i0.b;
            return f9.s1.e;
        }
        z3.a aVar = (z3.a) this.a.get(i10 - 1);
        long j11 = aVar.d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.a;
        }
        f9.g0 g0Var2 = f9.i0.b;
        return f9.s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(z3.a aVar, long j10) {
        boolean z10;
        int size;
        ArrayList arrayList = this.a;
        long j11 = aVar.b;
        yb.g(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = aVar.d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j11 >= ((z3.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((z3.a) arrayList.get(size)).b <= j10) {
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

    @Override // w2.a
    public void clear() {
        this.a.clear();
    }

    @Override // w2.a
    public long d(long j10) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j10 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j12 = aVar.d;
                return (j12 == -9223372036854775807L || j12 > j10) ? aVar.b : j12;
            }
        }
        z3.a aVar2 = (z3.a) f9.o.m(arrayList);
        long j13 = aVar2.d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.b : j13;
    }

    @Override // w2.a
    public void e(long j10) {
        ArrayList arrayList = this.a;
        int i10 = i(j10);
        if (i10 == 0) {
            return;
        }
        long j11 = ((z3.a) arrayList.get(i10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            i10--;
        }
        arrayList.subList(0, i10).clear();
    }

    public p4.r f() {
        if (this.a == null) {
            return p4.r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new p4.r(bundle, this.a);
    }

    public void g(StringBuilder sb2) {
        sb2.append(((Boolean) ic.a.y(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void h(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            g(sb2);
        }
    }

    public int i(long j10) {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
