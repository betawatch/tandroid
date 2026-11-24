// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lq2 implements q4a {
    public final w59 a;
    public long b;

    public lq2(List list, List list2) {
        jm5 p = mm5.p();
        gre.f(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            p.c(new kq2((q4a) list.get(i), (List) list2.get(i)));
        }
        this.a = p.f();
        this.b = -9223372036854775807L;
    }

    @Override // q4a
    public final boolean d() {
        int i = 0;
        while (true) {
            w59 w59Var = this.a;
            if (i >= w59Var.d) {
                return false;
            }
            if (((kq2) w59Var.get(i)).a.d()) {
                return true;
            }
            i++;
        }
    }

    @Override // q4a
    public final long g() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            w59 w59Var = this.a;
            if (i >= w59Var.d) {
                break;
            }
            long g = ((kq2) w59Var.get(i)).a.g();
            if (g != Long.MIN_VALUE) {
                j = Math.min(j, g);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // q4a
    public final boolean r(t86 t86Var) {
        boolean z;
        boolean z2 = false;
        do {
            long g = g();
            if (g == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                w59 w59Var = this.a;
                if (i >= w59Var.d) {
                    break;
                }
                long g2 = ((kq2) w59Var.get(i)).a.g();
                boolean z3 = g2 != Long.MIN_VALUE && g2 <= t86Var.a;
                if (g2 == g || z3) {
                    z |= ((kq2) w59Var.get(i)).a.r(t86Var);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // q4a
    public final long s() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            w59 w59Var = this.a;
            if (i >= w59Var.d) {
                break;
            }
            kq2 kq2Var = (kq2) w59Var.get(i);
            long s = kq2Var.a.s();
            mm5 mm5Var = kq2Var.b;
            if ((mm5Var.contains(1) || mm5Var.contains(2) || mm5Var.contains(4)) && s != Long.MIN_VALUE) {
                j = Math.min(j, s);
            }
            if (s != Long.MIN_VALUE) {
                j2 = Math.min(j2, s);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // q4a
    public final void t(long j) {
        int i = 0;
        while (true) {
            w59 w59Var = this.a;
            if (i >= w59Var.d) {
                return;
            }
            ((kq2) w59Var.get(i)).t(j);
            i++;
        }
    }
}
