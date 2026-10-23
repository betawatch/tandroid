package ad;

import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class e implements w2.a {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new ArrayList();
                break;
            case 2:
                this.b = new ArrayList();
                break;
            default:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
        }
    }

    @Override // w2.a
    public long a(long j10) {
        ArrayList arrayList = this.b;
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
        long j14 = ((z3.a) s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // w2.a
    public n0 b(long j10) {
        int h = h(j10);
        if (h == 0) {
            l0 l0Var = n0.b;
            return x1.e;
        }
        z3.a aVar = (z3.a) this.b.get(h - 1);
        long j11 = aVar.d;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return aVar.a;
        }
        l0 l0Var2 = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(z3.a aVar, long j10) {
        boolean z10;
        int size;
        long j11 = aVar.b;
        u6.g(j11 != -9223372036854775807L);
        if (j11 <= j10) {
            long j12 = aVar.d;
            if (j12 == -9223372036854775807L || j10 < j12) {
                z10 = true;
                ArrayList arrayList = this.b;
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
        ArrayList arrayList2 = this.b;
        while (size >= 0) {
        }
        arrayList2.add(0, aVar);
        return z10;
    }

    @Override // w2.a
    public void clear() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                        break;
                    } catch (Exception e) {
                        m.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                    }
                }
                arrayList.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    @Override // w2.a
    public long d(long j10) {
        ArrayList arrayList = this.b;
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
        z3.a aVar2 = (z3.a) s.m(arrayList);
        long j13 = aVar2.d;
        return (j13 == -9223372036854775807L || j10 < j13) ? aVar2.b : j13;
    }

    @Override // w2.a
    public void e(long j10) {
        int h = h(j10);
        if (h == 0) {
            return;
        }
        ArrayList arrayList = this.b;
        long j11 = ((z3.a) arrayList.get(h - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            h--;
        }
        arrayList.subList(0, h).clear();
    }

    public void f(StringBuilder sb2) {
        sb2.append(((Boolean) i2.e.A(1, this.b)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void g(StringBuilder sb2) {
        while (!this.b.isEmpty()) {
            f(sb2);
        }
    }

    public int h(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j10 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
            i10++;
        }
    }
}
