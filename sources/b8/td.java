package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class td {
    public static int a(c4.f fVar, int i3, int i10, int i11) {
        zb.f(Math.max(Math.max(i3, i10), i11) <= 31);
        int i12 = (1 << i3) - 1;
        int i13 = (1 << i10) - 1;
        wc.a(wc.a(i12, i13), 1 << i11);
        if (fVar.b() < i3) {
            return -1;
        }
        int j10 = fVar.j(i3);
        if (j10 == i12) {
            if (fVar.b() < i10) {
                return -1;
            }
            int j11 = fVar.j(i10);
            j10 += j11;
            if (j11 == i13) {
                if (fVar.b() < i11) {
                    return -1;
                }
                return fVar.j(i11) + j10;
            }
        }
        return j10;
    }

    public static void b(c4.f fVar) {
        fVar.L(3);
        fVar.L(8);
        boolean i3 = fVar.i();
        boolean i10 = fVar.i();
        if (i3) {
            fVar.L(5);
        }
        if (i10) {
            fVar.L(6);
        }
    }

    public static void c(c4.f fVar) {
        int j10;
        int j11 = fVar.j(2);
        if (j11 == 0) {
            fVar.L(6);
            return;
        }
        int a10 = a(fVar, 5, 8, 16) + 1;
        if (j11 == 1) {
            fVar.L(a10 * 7);
            return;
        }
        if (j11 == 2) {
            boolean i3 = fVar.i();
            int i10 = i3 ? 1 : 5;
            int i11 = i3 ? 7 : 5;
            int i12 = i3 ? 8 : 6;
            int i13 = 0;
            while (i13 < a10) {
                if (fVar.i()) {
                    fVar.L(7);
                    j10 = 0;
                } else {
                    if (fVar.j(2) == 3 && fVar.j(i11) * i10 != 0) {
                        fVar.K();
                    }
                    j10 = fVar.j(i12) * i10;
                    if (j10 != 0 && j10 != 180) {
                        fVar.K();
                    }
                    fVar.K();
                }
                if (j10 != 0 && j10 != 180 && fVar.i()) {
                    i13++;
                }
                i13++;
            }
        }
    }
}
