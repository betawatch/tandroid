// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e37 implements o43 {
    public static final kr2 b = new kr2(new d51(new p31((byte) 14), qk7.b), new d51(new p31((byte) 15), qk7.c));
    public final ArrayList a = new ArrayList();

    @Override // o43
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((p43) arrayList.get(i)).b;
            long j4 = ((p43) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // o43
    public final boolean b(p43 p43Var, long j) {
        long j2 = p43Var.b;
        yve.f(j2 != -9223372036854775807L);
        yve.f(p43Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < p43Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((p43) arrayList.get(size)).b) {
                arrayList.add(size + 1, p43Var);
                return z;
            }
        }
        arrayList.add(0, p43Var);
        return z;
    }

    @Override // o43
    public final po5 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((p43) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    p43 p43Var = (p43) arrayList.get(i);
                    if (j >= p43Var.b && j < p43Var.d) {
                        arrayList2.add(p43Var);
                    }
                    if (j < p43Var.b) {
                        break;
                    }
                }
                j99 w = po5.w(b, arrayList2);
                mo5 p = po5.p();
                for (int i2 = 0; i2 < w.d; i2++) {
                    p.d(((p43) w.get(i2)).a);
                }
                return p.f();
            }
        }
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // o43
    public final void clear() {
        this.a.clear();
    }

    @Override // o43
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((p43) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((p43) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((p43) arrayList.get(i)).b;
            long j4 = ((p43) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    @Override // o43
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((p43) arrayList.get(i)).b;
            if (j > j2 && j > ((p43) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
