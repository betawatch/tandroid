// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ivd {
    public static void a(long j, ey7 ey7Var, x1c[] x1cVarArr) {
        int i;
        while (true) {
            if (ey7Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (ey7Var.a() == 0) {
                    i = -1;
                    break;
                }
                int A = ey7Var.A();
                i2 += A;
                if (A != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (ey7Var.a() == 0) {
                    i3 = -1;
                    break;
                }
                int A2 = ey7Var.A();
                i3 += A2;
                if (A2 != 255) {
                    break;
                }
            }
            int i4 = ey7Var.b + i3;
            if (i3 == -1 || i3 > ey7Var.a()) {
                efd.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = ey7Var.c;
            } else if (i == 4 && i3 >= 8) {
                int A3 = ey7Var.A();
                int H = ey7Var.H();
                int m = H == 49 ? ey7Var.m() : 0;
                int A4 = ey7Var.A();
                if (H == 47) {
                    ey7Var.O(1);
                }
                boolean z = A3 == 181 && (H == 49 || H == 47) && A4 == 3;
                if (H == 49) {
                    z &= m == 1195456820;
                }
                if (z) {
                    b(j, ey7Var, x1cVarArr);
                }
            }
            ey7Var.N(i4);
        }
    }

    public static void b(long j, ey7 ey7Var, x1c[] x1cVarArr) {
        int A = ey7Var.A();
        if ((A & 64) != 0) {
            ey7Var.O(1);
            int i = (A & 31) * 3;
            int i2 = ey7Var.b;
            for (x1c x1cVar : x1cVarArr) {
                ey7Var.N(i2);
                x1cVar.e(i, ey7Var);
                yve.p(j != -9223372036854775807L);
                x1cVar.a(j, 1, i, 0, null);
            }
        }
    }
}
