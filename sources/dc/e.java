package dc;

import d2.t0;
import e5.u;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final e[] f = a();
    public final int a;
    public final int[] b;
    public final u[] c;
    public final int d;

    public e(int i3, int[] iArr, u... uVarArr) {
        this.a = i3;
        this.b = iArr;
        this.c = uVarArr;
        u uVar = uVarArr[0];
        int i10 = uVar.b;
        int i11 = 0;
        for (t0 t0Var : (t0[]) uVar.c) {
            i11 += (t0Var.b + i10) * t0Var.a;
        }
        this.d = i11;
    }

    public static e[] a() {
        int i3 = 4;
        int i10 = 10;
        e eVar = new e(1, new int[0], new u(7, new t0[]{new t0(1, 19)}, i3), new u(i10, new t0[]{new t0(1, 16)}, i3), new u(13, new t0[]{new t0(1, 13)}, i3), new u(17, new t0[]{new t0(1, 9)}, i3));
        int i11 = 22;
        e eVar2 = new e(2, new int[]{6, 18}, new u(i10, new t0[]{new t0(1, 34)}, i3), new u(16, new t0[]{new t0(1, 28)}, i3), new u(i11, new t0[]{new t0(1, 22)}, i3), new u(28, new t0[]{new t0(1, 16)}, i3));
        int i12 = 26;
        e eVar3 = new e(3, new int[]{6, 22}, new u(15, new t0[]{new t0(1, 55)}, i3), new u(i12, new t0[]{new t0(1, 44)}, i3), new u(18, new t0[]{new t0(2, 17)}, i3), new u(i11, new t0[]{new t0(2, 13)}, i3));
        e eVar4 = new e(4, new int[]{6, 26}, new u(20, new t0[]{new t0(1, 80)}, i3), new u(18, new t0[]{new t0(2, 32)}, i3), new u(i12, new t0[]{new t0(2, 24)}, i3), new u(16, new t0[]{new t0(4, 9)}, i3));
        e eVar5 = new e(5, new int[]{6, 30}, new u(i12, new t0[]{new t0(1, hs.t1)}, i3), new u(24, new t0[]{new t0(2, 43)}, i3), new u(18, new t0[]{new t0(2, 15), new t0(2, 16)}, i3), new u(22, new t0[]{new t0(2, 11), new t0(2, 12)}, i3));
        e eVar6 = new e(6, new int[]{6, 34}, new u(18, new t0[]{new t0(2, 68)}, i3), new u(16, new t0[]{new t0(4, 27)}, i3), new u(24, new t0[]{new t0(4, 19)}, i3), new u(28, new t0[]{new t0(4, 15)}, i3));
        e eVar7 = new e(7, new int[]{6, 22, 38}, new u(20, new t0[]{new t0(2, 78)}, i3), new u(18, new t0[]{new t0(4, 31)}, i3), new u(18, new t0[]{new t0(2, 14), new t0(4, 15)}, i3), new u(26, new t0[]{new t0(4, 13), new t0(1, 14)}, 4));
        int i13 = 4;
        e eVar8 = new e(8, new int[]{6, 24, 42}, new u(24, new t0[]{new t0(2, 97)}, i13), new u(22, new t0[]{new t0(2, 38), new t0(2, 39)}, i13), new u(22, new t0[]{new t0(4, 18), new t0(2, 19)}, i13), new u(26, new t0[]{new t0(4, 14), new t0(2, 15)}, 4));
        int i14 = 4;
        e eVar9 = new e(9, new int[]{6, 26, 46}, new u(30, new t0[]{new t0(2, hs.B1)}, i14), new u(22, new t0[]{new t0(3, 36), new t0(2, 37)}, i14), new u(20, new t0[]{new t0(4, 16), new t0(4, 17)}, i14), new u(24, new t0[]{new t0(4, 12), new t0(4, 13)}, i14));
        int i15 = 4;
        e eVar10 = new e(10, new int[]{6, 28, 50}, new u(18, new t0[]{new t0(2, 68), new t0(2, 69)}, i15), new u(26, new t0[]{new t0(4, 43), new t0(1, 44)}, i15), new u(24, new t0[]{new t0(6, 19), new t0(2, 20)}, i15), new u(28, new t0[]{new t0(6, 15), new t0(2, 16)}, 4));
        int i16 = 4;
        e eVar11 = new e(11, new int[]{6, 30, 54}, new u(20, new t0[]{new t0(4, 81)}, i16), new u(30, new t0[]{new t0(1, 50), new t0(4, 51)}, i16), new u(28, new t0[]{new t0(4, 22), new t0(4, 23)}, i16), new u(24, new t0[]{new t0(3, 12), new t0(8, 13)}, 4));
        int i17 = 4;
        e eVar12 = new e(12, new int[]{6, 32, 58}, new u(24, new t0[]{new t0(2, 92), new t0(2, 93)}, i17), new u(22, new t0[]{new t0(6, 36), new t0(2, 37)}, i17), new u(26, new t0[]{new t0(4, 20), new t0(6, 21)}, 4), new u(28, new t0[]{new t0(7, 14), new t0(4, 15)}, 4));
        int i18 = 4;
        e eVar13 = new e(13, new int[]{6, 34, 62}, new u(26, new t0[]{new t0(4, hs.s1)}, i18), new u(22, new t0[]{new t0(8, 37), new t0(1, 38)}, i18), new u(24, new t0[]{new t0(8, 20), new t0(4, 21)}, 4), new u(22, new t0[]{new t0(12, 11), new t0(4, 12)}, 4));
        e eVar14 = new e(14, new int[]{6, 26, 46, 66}, new u(30, new t0[]{new t0(3, hs.A1), new t0(1, hs.B1)}, 4), new u(24, new t0[]{new t0(4, 40), new t0(5, 41)}, 4), new u(20, new t0[]{new t0(11, 16), new t0(5, 17)}, 4), new u(24, new t0[]{new t0(11, 12), new t0(5, 13)}, 4));
        e eVar15 = new e(15, new int[]{6, 26, 48, 70}, new u(22, new t0[]{new t0(5, 87), new t0(1, 88)}, 4), new u(24, new t0[]{new t0(5, 41), new t0(5, 42)}, 4), new u(30, new t0[]{new t0(5, 24), new t0(7, 25)}, 4), new u(24, new t0[]{new t0(11, 12), new t0(7, 13)}, 4));
        e eVar16 = new e(16, new int[]{6, 26, 50, 74}, new u(24, new t0[]{new t0(5, 98), new t0(1, 99)}, 4), new u(28, new t0[]{new t0(7, 45), new t0(3, 46)}, 4), new u(24, new t0[]{new t0(15, 19), new t0(2, 20)}, 4), new u(30, new t0[]{new t0(3, 15), new t0(13, 16)}, 4));
        e eVar17 = new e(17, new int[]{6, 30, 54, 78}, new u(28, new t0[]{new t0(1, hs.s1), new t0(5, hs.t1)}, 4), new u(28, new t0[]{new t0(10, 46), new t0(1, 47)}, 4), new u(28, new t0[]{new t0(1, 22), new t0(15, 23)}, 4), new u(28, new t0[]{new t0(2, 14), new t0(17, 15)}, 4));
        int i19 = 4;
        e eVar18 = new e(18, new int[]{6, 30, 56, 82}, new u(30, new t0[]{new t0(5, 120), new t0(1, hs.F1)}, i19), new u(26, new t0[]{new t0(9, 43), new t0(4, 44)}, i19), new u(28, new t0[]{new t0(17, 22), new t0(1, 23)}, 4), new u(28, new t0[]{new t0(2, 14), new t0(19, 15)}, 4));
        int i20 = 4;
        e eVar19 = new e(19, new int[]{6, 30, 58, 86}, new u(28, new t0[]{new t0(3, hs.y1), new t0(4, hs.z1)}, i20), new u(26, new t0[]{new t0(3, 44), new t0(11, 45)}, i20), new u(26, new t0[]{new t0(17, 21), new t0(4, 22)}, i20), new u(26, new t0[]{new t0(9, 13), new t0(16, 14)}, 4));
        int i21 = 4;
        int i22 = 28;
        e eVar20 = new e(20, new int[]{6, 34, 62, 90}, new u(28, new t0[]{new t0(3, hs.s1), new t0(5, hs.t1)}, i21), new u(26, new t0[]{new t0(3, 41), new t0(13, 42)}, i21), new u(30, new t0[]{new t0(15, 24), new t0(5, 25)}, 4), new u(i22, new t0[]{new t0(15, 15), new t0(10, 16)}, 4));
        int i23 = 4;
        e eVar21 = new e(21, new int[]{6, 28, 50, 72, 94}, new u(i22, new t0[]{new t0(4, hs.B1), new t0(4, hs.C1)}, i23), new u(26, new t0[]{new t0(17, 42)}, i23), new u(28, new t0[]{new t0(17, 22), new t0(6, 23)}, i23), new u(30, new t0[]{new t0(19, 16), new t0(6, 17)}, 4));
        int i24 = 28;
        int i25 = 4;
        e eVar22 = new e(22, new int[]{6, 26, 50, 74, 98}, new u(i24, new t0[]{new t0(2, hs.w1), new t0(7, hs.x1)}, i25), new u(i24, new t0[]{new t0(17, 46)}, i25), new u(30, new t0[]{new t0(7, 24), new t0(16, 25)}, i25), new u(24, new t0[]{new t0(34, 13)}, i25));
        e eVar23 = new e(23, new int[]{6, 30, 54, 78, hs.n1}, new u(30, new t0[]{new t0(4, hs.F1), new t0(5, hs.G1)}, 4), new u(28, new t0[]{new t0(4, 47), new t0(14, 48)}, 4), new u(30, new t0[]{new t0(11, 24), new t0(14, 25)}, 4), new u(30, new t0[]{new t0(16, 15), new t0(14, 16)}, 4));
        e eVar24 = new e(24, new int[]{6, 28, 54, 80, hs.r1}, new u(30, new t0[]{new t0(6, hs.C1), new t0(4, hs.D1)}, 4), new u(28, new t0[]{new t0(6, 45), new t0(14, 46)}, 4), new u(30, new t0[]{new t0(11, 24), new t0(16, 25)}, 4), new u(30, new t0[]{new t0(30, 16), new t0(2, 17)}, 4));
        e eVar25 = new e(25, new int[]{6, 32, 58, 84, hs.v1}, new u(26, new t0[]{new t0(8, hs.r1), new t0(4, hs.s1)}, 4), new u(28, new t0[]{new t0(8, 47), new t0(13, 48)}, 4), new u(30, new t0[]{new t0(7, 24), new t0(22, 25)}, 4), new u(30, new t0[]{new t0(22, 15), new t0(13, 16)}, 4));
        int i26 = 28;
        int i27 = 4;
        e eVar26 = new e(26, new int[]{6, 30, 58, 86, hs.z1}, new u(i26, new t0[]{new t0(10, hs.z1), new t0(2, hs.A1)}, i27), new u(i26, new t0[]{new t0(19, 46), new t0(4, 47)}, i27), new u(28, new t0[]{new t0(28, 22), new t0(6, 23)}, 4), new u(30, new t0[]{new t0(33, 16), new t0(4, 17)}, 4));
        e eVar27 = new e(27, new int[]{6, 34, 62, 90, hs.D1}, new u(30, new t0[]{new t0(8, hs.G1), new t0(4, hs.H1)}, 4), new u(28, new t0[]{new t0(22, 45), new t0(3, 46)}, 4), new u(30, new t0[]{new t0(8, 23), new t0(26, 24)}, 4), new u(30, new t0[]{new t0(12, 15), new t0(28, 16)}, 4));
        int i28 = 4;
        e eVar28 = new e(28, new int[]{6, 26, 50, 74, 98, hs.G1}, new u(30, new t0[]{new t0(3, hs.C1), new t0(10, hs.D1)}, i28), new u(28, new t0[]{new t0(3, 45), new t0(23, 46)}, i28), new u(30, new t0[]{new t0(4, 24), new t0(31, 25)}, 4), new u(30, new t0[]{new t0(11, 15), new t0(31, 16)}, 4));
        int i29 = 4;
        e eVar29 = new e(29, new int[]{6, 30, 54, 78, hs.n1, hs.K1}, new u(30, new t0[]{new t0(7, hs.B1), new t0(7, hs.C1)}, i29), new u(28, new t0[]{new t0(21, 45), new t0(7, 46)}, i29), new u(30, new t0[]{new t0(1, 23), new t0(37, 24)}, 4), new u(30, new t0[]{new t0(19, 15), new t0(26, 16)}, 4));
        int i30 = 4;
        e eVar30 = new e(30, new int[]{6, 26, 52, 78, hs.p1, hs.O1}, new u(30, new t0[]{new t0(5, hs.A1), new t0(10, hs.B1)}, i30), new u(28, new t0[]{new t0(19, 47), new t0(10, 48)}, i30), new u(30, new t0[]{new t0(15, 24), new t0(25, 25)}, i30), new u(30, new t0[]{new t0(23, 15), new t0(25, 16)}, 4));
        int i31 = 4;
        e eVar31 = new e(31, new int[]{6, 30, 56, 82, hs.t1, 134}, new u(30, new t0[]{new t0(13, hs.A1), new t0(3, hs.B1)}, i31), new u(28, new t0[]{new t0(2, 46), new t0(29, 47)}, i31), new u(30, new t0[]{new t0(42, 24), new t0(1, 25)}, 4), new u(30, new t0[]{new t0(23, 15), new t0(28, 16)}, 4));
        int i32 = 4;
        e eVar32 = new e(32, new int[]{6, 34, 60, 86, hs.x1, hs.U1}, new u(30, new t0[]{new t0(17, hs.A1)}, i32), new u(28, new t0[]{new t0(10, 46), new t0(23, 47)}, i32), new u(30, new t0[]{new t0(10, 24), new t0(35, 25)}, 4), new u(30, new t0[]{new t0(19, 15), new t0(35, 16)}, 4));
        int i33 = 4;
        e eVar33 = new e(33, new int[]{6, 30, 58, 86, hs.z1, hs.Y1}, new u(30, new t0[]{new t0(17, hs.A1), new t0(1, hs.B1)}, i33), new u(28, new t0[]{new t0(14, 46), new t0(21, 47)}, i33), new u(30, new t0[]{new t0(29, 24), new t0(19, 25)}, 4), new u(30, new t0[]{new t0(11, 15), new t0(46, 16)}, 4));
        int i34 = 4;
        e eVar34 = new e(34, new int[]{6, 34, 62, 90, hs.D1, hs.c2}, new u(30, new t0[]{new t0(13, hs.A1), new t0(6, hs.B1)}, i34), new u(28, new t0[]{new t0(14, 46), new t0(23, 47)}, i34), new u(30, new t0[]{new t0(44, 24), new t0(7, 25)}, 4), new u(30, new t0[]{new t0(59, 16), new t0(1, 17)}, 4));
        int i35 = 4;
        e eVar35 = new e(35, new int[]{6, 30, 54, 78, hs.n1, hs.K1, hs.g2}, new u(30, new t0[]{new t0(12, hs.F1), new t0(7, hs.G1)}, i35), new u(28, new t0[]{new t0(12, 47), new t0(26, 48)}, i35), new u(30, new t0[]{new t0(39, 24), new t0(14, 25)}, 4), new u(30, new t0[]{new t0(22, 15), new t0(41, 16)}, 4));
        int i36 = 4;
        e eVar36 = new e(36, new int[]{6, 24, 50, 76, hs.n1, 128, hs.k2}, new u(30, new t0[]{new t0(6, hs.F1), new t0(14, hs.G1)}, i36), new u(28, new t0[]{new t0(6, 47), new t0(34, 48)}, i36), new u(30, new t0[]{new t0(46, 24), new t0(10, 25)}, 4), new u(30, new t0[]{new t0(2, 15), new t0(64, 16)}, 4));
        int i37 = 4;
        e eVar37 = new e(37, new int[]{6, 28, 54, 80, hs.r1, hs.Q1, hs.o2}, new u(30, new t0[]{new t0(17, hs.G1), new t0(4, hs.H1)}, i37), new u(28, new t0[]{new t0(29, 46), new t0(14, 47)}, i37), new u(30, new t0[]{new t0(49, 24), new t0(10, 25)}, 4), new u(30, new t0[]{new t0(24, 15), new t0(46, 16)}, 4));
        int i38 = 4;
        e eVar38 = new e(38, new int[]{6, 32, 58, 84, hs.v1, hs.S1, hs.s2}, new u(30, new t0[]{new t0(4, hs.G1), new t0(18, hs.H1)}, i38), new u(28, new t0[]{new t0(13, 46), new t0(32, 47)}, i38), new u(30, new t0[]{new t0(48, 24), new t0(14, 25)}, 4), new u(30, new t0[]{new t0(42, 15), new t0(32, 16)}, 4));
        int i39 = 4;
        e eVar39 = new e(39, new int[]{6, 26, 54, 82, hs.v1, hs.U1, hs.w2}, new u(30, new t0[]{new t0(20, hs.C1), new t0(4, hs.D1)}, i39), new u(28, new t0[]{new t0(40, 47), new t0(7, 48)}, i39), new u(30, new t0[]{new t0(43, 24), new t0(22, 25)}, 4), new u(30, new t0[]{new t0(10, 15), new t0(67, 16)}, 4));
        int i40 = 4;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar36, eVar37, eVar38, eVar39, new e(40, new int[]{6, 30, 58, 86, hs.z1, hs.Y1, hs.A2}, new u(30, new t0[]{new t0(19, hs.D1), new t0(6, hs.E1)}, i40), new u(28, new t0[]{new t0(18, 47), new t0(31, 48)}, i40), new u(30, new t0[]{new t0(34, 24), new t0(34, 25)}, 4), new u(30, new t0[]{new t0(20, 15), new t0(61, 16)}, 4))};
    }

    public static e b(int i3) {
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        for (int i12 = 0; i12 < 34; i12++) {
            int i13 = e[i12];
            if (i13 == i3) {
                return c(i12 + 7);
            }
            int bitCount = Integer.bitCount(i13 ^ i3);
            if (bitCount < i10) {
                i11 = i12 + 7;
                i10 = bitCount;
            }
        }
        if (i10 <= 3) {
            return c(i11);
        }
        return null;
    }

    public static e c(int i3) {
        if (i3 < 1 || i3 > 40) {
            throw new IllegalArgumentException();
        }
        return f[i3 - 1];
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
