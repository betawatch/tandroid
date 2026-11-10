package c8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class n9 {
    public static int a(d4.f fVar, int i7, int i10, int i11) {
        a8.ia.f(Math.max(Math.max(i7, i10), i11) <= 31);
        int i12 = (1 << i7) - 1;
        int i13 = (1 << i10) - 1;
        r0.a(r0.a(i12, i13), 1 << i11);
        if (fVar.b() < i7) {
            return -1;
        }
        int j3 = fVar.j(i7);
        if (j3 == i12) {
            if (fVar.b() < i10) {
                return -1;
            }
            int j10 = fVar.j(i10);
            j3 += j10;
            if (j10 == i13) {
                if (fVar.b() < i11) {
                    return -1;
                }
                return fVar.j(i11) + j3;
            }
        }
        return j3;
    }

    public static void b(d4.f fVar) {
        fVar.L(3);
        fVar.L(8);
        boolean i7 = fVar.i();
        boolean i10 = fVar.i();
        if (i7) {
            fVar.L(5);
        }
        if (i10) {
            fVar.L(6);
        }
    }

    public static void c(d4.f fVar) {
        int j3;
        int j10 = fVar.j(2);
        if (j10 == 0) {
            fVar.L(6);
            return;
        }
        int a10 = a(fVar, 5, 8, 16) + 1;
        if (j10 == 1) {
            fVar.L(a10 * 7);
            return;
        }
        if (j10 == 2) {
            boolean i7 = fVar.i();
            int i10 = i7 ? 1 : 5;
            int i11 = i7 ? 7 : 5;
            int i12 = i7 ? 8 : 6;
            int i13 = 0;
            while (i13 < a10) {
                if (fVar.i()) {
                    fVar.L(7);
                    j3 = 0;
                } else {
                    if (fVar.j(2) == 3 && fVar.j(i11) * i10 != 0) {
                        fVar.K();
                    }
                    j3 = fVar.j(i12) * i10;
                    if (j3 != 0 && j3 != 180) {
                        fVar.K();
                    }
                    fVar.K();
                }
                if (j3 != 0 && j3 != 180 && fVar.i()) {
                    i13++;
                }
                i13++;
            }
        }
    }
}
