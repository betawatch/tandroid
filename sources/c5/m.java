package c5;

import android.os.Bundle;
import e9.a1;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class m implements w2.a {
    public ArrayList a;

    public m(int i10) {
        switch (i10) {
            case 3:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // w2.a
    public long a(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).b) {
            return ((z3.a) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.b;
            long j11 = aVar.b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                return (j12 == -9223372036854775807L || j12 <= j3 || j12 >= j11) ? j11 : j12;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // w2.a
    public e9.i0 b(long j3) {
        int i10 = i(j3);
        if (i10 == 0) {
            e9.g0 g0Var = e9.i0.b;
            return a1.e;
        }
        z3.a aVar = (z3.a) this.a.get(i10 - 1);
        long j10 = aVar.d;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return aVar.a;
        }
        e9.g0 g0Var2 = e9.i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(z3.a aVar, long j3) {
        boolean z10;
        int size;
        ArrayList arrayList = this.a;
        long j10 = aVar.b;
        e2.d.b(j10 != -9223372036854775807L);
        if (j10 <= j3) {
            long j11 = aVar.d;
            if (j11 == -9223372036854775807L || j3 < j11) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j10 >= ((z3.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((z3.a) arrayList.get(size)).b <= j3) {
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
    public long d(long j3) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).b;
            if (j3 == j10) {
                return j10;
            }
            if (j3 < j10) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                return (j11 == -9223372036854775807L || j11 > j3) ? aVar.b : j11;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        return (j12 == -9223372036854775807L || j3 < j12) ? aVar2.b : j12;
    }

    @Override // w2.a
    public void e(long j3) {
        ArrayList arrayList = this.a;
        int i10 = i(j3);
        if (i10 == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(i10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
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
        sb2.append(((Boolean) hg.c.w(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void h(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            g(sb2);
        }
    }

    public int i(long j3) {
        ArrayList arrayList = this.a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
