// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j53 implements lcb {
    public static final c61 c = new c61(new o41(3), jk7.b);
    public final mo5 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j53(y79 y79Var) {
        long j;
        int i = y79Var.d;
        long j2 = -9223372036854775807L;
        int i2 = 0;
        if (i == 1) {
            ko5 listIterator = y79Var.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && listIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                    i2++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            i53 i53Var = (i53) next;
            long j3 = i53Var.b;
            long j4 = i53Var.c;
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            mo5 mo5Var = i53Var.a;
            if (j4 == -9223372036854775807L) {
                this.a = mo5.u(mo5Var);
                this.b = new long[]{j5};
                return;
            } else {
                ko5 ko5Var = mo5.b;
                this.a = mo5.v(mo5Var, y79.e);
                this.b = new long[]{j5, j4 + j5};
                return;
            }
        }
        long[] jArr = new long[i << 1];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        y79 w = mo5.w(c, y79Var);
        int i3 = 0;
        while (i2 < w.d) {
            i53 i53Var2 = (i53) w.get(i2);
            long j6 = i53Var2.b;
            long j7 = i53Var2.c;
            mo5 mo5Var2 = i53Var2.a;
            j6 = j6 == j2 ? 0L : j6;
            long j8 = j6 + j7;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j9 = this.b[i4];
                if (j9 >= j6) {
                    if (j9 == j6 && ((mo5) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, mo5Var2);
                        j = j2;
                    } else {
                        j = j2;
                        ncd.f("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[i4] = j6;
                        arrayList.set(i4, mo5Var2);
                    }
                    if (j7 == j) {
                        this.b[i3] = j8;
                        arrayList.add(y79.e);
                        i3++;
                    }
                    i2++;
                    j2 = j;
                }
            }
            j = j2;
            this.b[i3] = j6;
            arrayList.add(mo5Var2);
            i3++;
            if (j7 == j) {
            }
            i2++;
            j2 = j;
        }
        this.a = mo5.q(arrayList);
    }

    @Override // lcb
    public final int b(long j) {
        int b = hac.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }

    @Override // lcb
    public final long k(int i) {
        jte.f(i < this.a.size());
        return this.b[i];
    }

    @Override // lcb
    public final List p(long j) {
        int f = hac.f(this.b, j, false);
        if (f != -1) {
            return (mo5) this.a.get(f);
        }
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // lcb
    public final int q() {
        return this.a.size();
    }
}
