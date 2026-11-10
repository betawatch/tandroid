package gc;

import e2.r0;
import f5.u;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final e[] f = a();
    public final int a;
    public final int[] b;
    public final u[] c;
    public final int d;

    public e(int i7, int[] iArr, u... uVarArr) {
        this.a = i7;
        this.b = iArr;
        this.c = uVarArr;
        u uVar = uVarArr[0];
        int i10 = uVar.b;
        int i11 = 0;
        for (r0 r0Var : (r0[]) uVar.c) {
            i11 += (r0Var.b + i10) * r0Var.a;
        }
        this.d = i11;
    }

    public static e[] a() {
        int i7 = 5;
        int i10 = 10;
        e eVar = new e(1, new int[0], new u(7, new r0[]{new r0(1, 19)}, i7), new u(i10, new r0[]{new r0(1, 16)}, i7), new u(13, new r0[]{new r0(1, 13)}, i7), new u(17, new r0[]{new r0(1, 9)}, i7));
        int i11 = 22;
        e eVar2 = new e(2, new int[]{6, 18}, new u(i10, new r0[]{new r0(1, 34)}, i7), new u(16, new r0[]{new r0(1, 28)}, i7), new u(i11, new r0[]{new r0(1, 22)}, i7), new u(28, new r0[]{new r0(1, 16)}, i7));
        int i12 = 26;
        e eVar3 = new e(3, new int[]{6, 22}, new u(15, new r0[]{new r0(1, 55)}, i7), new u(i12, new r0[]{new r0(1, 44)}, i7), new u(18, new r0[]{new r0(2, 17)}, i7), new u(i11, new r0[]{new r0(2, 13)}, i7));
        e eVar4 = new e(4, new int[]{6, 26}, new u(20, new r0[]{new r0(1, 80)}, i7), new u(18, new r0[]{new r0(2, 32)}, i7), new u(i12, new r0[]{new r0(2, 24)}, i7), new u(16, new r0[]{new r0(4, 9)}, i7));
        e eVar5 = new e(5, new int[]{6, 30}, new u(i12, new r0[]{new r0(1, qs.t1)}, i7), new u(24, new r0[]{new r0(2, 43)}, i7), new u(18, new r0[]{new r0(2, 15), new r0(2, 16)}, i7), new u(22, new r0[]{new r0(2, 11), new r0(2, 12)}, i7));
        e eVar6 = new e(6, new int[]{6, 34}, new u(18, new r0[]{new r0(2, 68)}, i7), new u(16, new r0[]{new r0(4, 27)}, i7), new u(24, new r0[]{new r0(4, 19)}, i7), new u(28, new r0[]{new r0(4, 15)}, i7));
        e eVar7 = new e(7, new int[]{6, 22, 38}, new u(20, new r0[]{new r0(2, 78)}, i7), new u(18, new r0[]{new r0(4, 31)}, i7), new u(18, new r0[]{new r0(2, 14), new r0(4, 15)}, 5), new u(26, new r0[]{new r0(4, 13), new r0(1, 14)}, 5));
        int i13 = 5;
        int i14 = 22;
        e eVar8 = new e(8, new int[]{6, 24, 42}, new u(24, new r0[]{new r0(2, 97)}, i13), new u(i14, new r0[]{new r0(2, 38), new r0(2, 39)}, i13), new u(i14, new r0[]{new r0(4, 18), new r0(2, 19)}, 5), new u(26, new r0[]{new r0(4, 14), new r0(2, 15)}, 5));
        int i15 = 5;
        e eVar9 = new e(9, new int[]{6, 26, 46}, new u(30, new r0[]{new r0(2, qs.B1)}, i15), new u(22, new r0[]{new r0(3, 36), new r0(2, 37)}, i15), new u(20, new r0[]{new r0(4, 16), new r0(4, 17)}, 5), new u(24, new r0[]{new r0(4, 12), new r0(4, 13)}, 5));
        int i16 = 5;
        e eVar10 = new e(10, new int[]{6, 28, 50}, new u(18, new r0[]{new r0(2, 68), new r0(2, 69)}, i16), new u(26, new r0[]{new r0(4, 43), new r0(1, 44)}, i16), new u(24, new r0[]{new r0(6, 19), new r0(2, 20)}, i16), new u(28, new r0[]{new r0(6, 15), new r0(2, 16)}, 5));
        int i17 = 5;
        e eVar11 = new e(11, new int[]{6, 30, 54}, new u(20, new r0[]{new r0(4, 81)}, i17), new u(30, new r0[]{new r0(1, 50), new r0(4, 51)}, i17), new u(28, new r0[]{new r0(4, 22), new r0(4, 23)}, 5), new u(24, new r0[]{new r0(3, 12), new r0(8, 13)}, 5));
        int i18 = 5;
        e eVar12 = new e(12, new int[]{6, 32, 58}, new u(24, new r0[]{new r0(2, 92), new r0(2, 93)}, i18), new u(22, new r0[]{new r0(6, 36), new r0(2, 37)}, i18), new u(26, new r0[]{new r0(4, 20), new r0(6, 21)}, 5), new u(28, new r0[]{new r0(7, 14), new r0(4, 15)}, 5));
        int i19 = 5;
        e eVar13 = new e(13, new int[]{6, 34, 62}, new u(26, new r0[]{new r0(4, qs.s1)}, i19), new u(22, new r0[]{new r0(8, 37), new r0(1, 38)}, i19), new u(24, new r0[]{new r0(8, 20), new r0(4, 21)}, 5), new u(22, new r0[]{new r0(12, 11), new r0(4, 12)}, 5));
        int i20 = 5;
        e eVar14 = new e(14, new int[]{6, 26, 46, 66}, new u(30, new r0[]{new r0(3, qs.A1), new r0(1, qs.B1)}, i20), new u(24, new r0[]{new r0(4, 40), new r0(5, 41)}, i20), new u(20, new r0[]{new r0(11, 16), new r0(5, 17)}, 5), new u(24, new r0[]{new r0(11, 12), new r0(5, 13)}, 5));
        int i21 = 5;
        e eVar15 = new e(15, new int[]{6, 26, 48, 70}, new u(22, new r0[]{new r0(5, 87), new r0(1, 88)}, i21), new u(24, new r0[]{new r0(5, 41), new r0(5, 42)}, i21), new u(30, new r0[]{new r0(5, 24), new r0(7, 25)}, 5), new u(24, new r0[]{new r0(11, 12), new r0(7, 13)}, 5));
        e eVar16 = new e(16, new int[]{6, 26, 50, 74}, new u(24, new r0[]{new r0(5, 98), new r0(1, 99)}, 5), new u(28, new r0[]{new r0(7, 45), new r0(3, 46)}, 5), new u(24, new r0[]{new r0(15, 19), new r0(2, 20)}, 5), new u(30, new r0[]{new r0(3, 15), new r0(13, 16)}, 5));
        e eVar17 = new e(17, new int[]{6, 30, 54, 78}, new u(28, new r0[]{new r0(1, qs.s1), new r0(5, qs.t1)}, 5), new u(28, new r0[]{new r0(10, 46), new r0(1, 47)}, 5), new u(28, new r0[]{new r0(1, 22), new r0(15, 23)}, 5), new u(28, new r0[]{new r0(2, 14), new r0(17, 15)}, 5));
        e eVar18 = new e(18, new int[]{6, 30, 56, 82}, new u(30, new r0[]{new r0(5, 120), new r0(1, qs.F1)}, 5), new u(26, new r0[]{new r0(9, 43), new r0(4, 44)}, 5), new u(28, new r0[]{new r0(17, 22), new r0(1, 23)}, 5), new u(28, new r0[]{new r0(2, 14), new r0(19, 15)}, 5));
        int i22 = 5;
        e eVar19 = new e(19, new int[]{6, 30, 58, 86}, new u(28, new r0[]{new r0(3, qs.y1), new r0(4, qs.z1)}, i22), new u(26, new r0[]{new r0(3, 44), new r0(11, 45)}, i22), new u(26, new r0[]{new r0(17, 21), new r0(4, 22)}, 5), new u(26, new r0[]{new r0(9, 13), new r0(16, 14)}, 5));
        int i23 = 5;
        int i24 = 28;
        e eVar20 = new e(20, new int[]{6, 34, 62, 90}, new u(28, new r0[]{new r0(3, qs.s1), new r0(5, qs.t1)}, i23), new u(26, new r0[]{new r0(3, 41), new r0(13, 42)}, i23), new u(30, new r0[]{new r0(15, 24), new r0(5, 25)}, i23), new u(i24, new r0[]{new r0(15, 15), new r0(10, 16)}, 5));
        int i25 = 5;
        e eVar21 = new e(21, new int[]{6, 28, 50, 72, 94}, new u(i24, new r0[]{new r0(4, qs.B1), new r0(4, qs.C1)}, i25), new u(26, new r0[]{new r0(17, 42)}, i25), new u(28, new r0[]{new r0(17, 22), new r0(6, 23)}, i25), new u(30, new r0[]{new r0(19, 16), new r0(6, 17)}, 5));
        int i26 = 28;
        int i27 = 5;
        e eVar22 = new e(22, new int[]{6, 26, 50, 74, 98}, new u(i26, new r0[]{new r0(2, qs.w1), new r0(7, qs.x1)}, i27), new u(i26, new r0[]{new r0(17, 46)}, i27), new u(30, new r0[]{new r0(7, 24), new r0(16, 25)}, i27), new u(24, new r0[]{new r0(34, 13)}, i27));
        e eVar23 = new e(23, new int[]{6, 30, 54, 78, qs.n1}, new u(30, new r0[]{new r0(4, qs.F1), new r0(5, qs.G1)}, 5), new u(28, new r0[]{new r0(4, 47), new r0(14, 48)}, 5), new u(30, new r0[]{new r0(11, 24), new r0(14, 25)}, 5), new u(30, new r0[]{new r0(16, 15), new r0(14, 16)}, 5));
        e eVar24 = new e(24, new int[]{6, 28, 54, 80, qs.r1}, new u(30, new r0[]{new r0(6, qs.C1), new r0(4, qs.D1)}, 5), new u(28, new r0[]{new r0(6, 45), new r0(14, 46)}, 5), new u(30, new r0[]{new r0(11, 24), new r0(16, 25)}, 5), new u(30, new r0[]{new r0(30, 16), new r0(2, 17)}, 5));
        e eVar25 = new e(25, new int[]{6, 32, 58, 84, qs.v1}, new u(26, new r0[]{new r0(8, qs.r1), new r0(4, qs.s1)}, 5), new u(28, new r0[]{new r0(8, 47), new r0(13, 48)}, 5), new u(30, new r0[]{new r0(7, 24), new r0(22, 25)}, 5), new u(30, new r0[]{new r0(22, 15), new r0(13, 16)}, 5));
        int i28 = 5;
        e eVar26 = new e(26, new int[]{6, 30, 58, 86, qs.z1}, new u(28, new r0[]{new r0(10, qs.z1), new r0(2, qs.A1)}, i28), new u(28, new r0[]{new r0(19, 46), new r0(4, 47)}, i28), new u(28, new r0[]{new r0(28, 22), new r0(6, 23)}, 5), new u(30, new r0[]{new r0(33, 16), new r0(4, 17)}, 5));
        int i29 = 5;
        e eVar27 = new e(27, new int[]{6, 34, 62, 90, qs.D1}, new u(30, new r0[]{new r0(8, qs.G1), new r0(4, qs.H1)}, i29), new u(28, new r0[]{new r0(22, 45), new r0(3, 46)}, i29), new u(30, new r0[]{new r0(8, 23), new r0(26, 24)}, 5), new u(30, new r0[]{new r0(12, 15), new r0(28, 16)}, 5));
        int i30 = 5;
        e eVar28 = new e(28, new int[]{6, 26, 50, 74, 98, qs.G1}, new u(30, new r0[]{new r0(3, qs.C1), new r0(10, qs.D1)}, i30), new u(28, new r0[]{new r0(3, 45), new r0(23, 46)}, i30), new u(30, new r0[]{new r0(4, 24), new r0(31, 25)}, 5), new u(30, new r0[]{new r0(11, 15), new r0(31, 16)}, 5));
        int i31 = 5;
        e eVar29 = new e(29, new int[]{6, 30, 54, 78, qs.n1, qs.K1}, new u(30, new r0[]{new r0(7, qs.B1), new r0(7, qs.C1)}, i31), new u(28, new r0[]{new r0(21, 45), new r0(7, 46)}, i31), new u(30, new r0[]{new r0(1, 23), new r0(37, 24)}, 5), new u(30, new r0[]{new r0(19, 15), new r0(26, 16)}, 5));
        int i32 = 5;
        e eVar30 = new e(30, new int[]{6, 26, 52, 78, qs.p1, qs.O1}, new u(30, new r0[]{new r0(5, qs.A1), new r0(10, qs.B1)}, i32), new u(28, new r0[]{new r0(19, 47), new r0(10, 48)}, i32), new u(30, new r0[]{new r0(15, 24), new r0(25, 25)}, i32), new u(30, new r0[]{new r0(23, 15), new r0(25, 16)}, 5));
        int i33 = 5;
        e eVar31 = new e(31, new int[]{6, 30, 56, 82, qs.t1, 134}, new u(30, new r0[]{new r0(13, qs.A1), new r0(3, qs.B1)}, i33), new u(28, new r0[]{new r0(2, 46), new r0(29, 47)}, i33), new u(30, new r0[]{new r0(42, 24), new r0(1, 25)}, 5), new u(30, new r0[]{new r0(23, 15), new r0(28, 16)}, 5));
        int i34 = 5;
        e eVar32 = new e(32, new int[]{6, 34, 60, 86, qs.x1, qs.U1}, new u(30, new r0[]{new r0(17, qs.A1)}, i34), new u(28, new r0[]{new r0(10, 46), new r0(23, 47)}, i34), new u(30, new r0[]{new r0(10, 24), new r0(35, 25)}, 5), new u(30, new r0[]{new r0(19, 15), new r0(35, 16)}, 5));
        int i35 = 5;
        e eVar33 = new e(33, new int[]{6, 30, 58, 86, qs.z1, qs.Y1}, new u(30, new r0[]{new r0(17, qs.A1), new r0(1, qs.B1)}, i35), new u(28, new r0[]{new r0(14, 46), new r0(21, 47)}, i35), new u(30, new r0[]{new r0(29, 24), new r0(19, 25)}, 5), new u(30, new r0[]{new r0(11, 15), new r0(46, 16)}, 5));
        int i36 = 5;
        e eVar34 = new e(34, new int[]{6, 34, 62, 90, qs.D1, qs.c2}, new u(30, new r0[]{new r0(13, qs.A1), new r0(6, qs.B1)}, i36), new u(28, new r0[]{new r0(14, 46), new r0(23, 47)}, i36), new u(30, new r0[]{new r0(44, 24), new r0(7, 25)}, 5), new u(30, new r0[]{new r0(59, 16), new r0(1, 17)}, 5));
        int i37 = 5;
        e eVar35 = new e(35, new int[]{6, 30, 54, 78, qs.n1, qs.K1, qs.g2}, new u(30, new r0[]{new r0(12, qs.F1), new r0(7, qs.G1)}, i37), new u(28, new r0[]{new r0(12, 47), new r0(26, 48)}, i37), new u(30, new r0[]{new r0(39, 24), new r0(14, 25)}, 5), new u(30, new r0[]{new r0(22, 15), new r0(41, 16)}, 5));
        int i38 = 5;
        e eVar36 = new e(36, new int[]{6, 24, 50, 76, qs.n1, 128, qs.k2}, new u(30, new r0[]{new r0(6, qs.F1), new r0(14, qs.G1)}, i38), new u(28, new r0[]{new r0(6, 47), new r0(34, 48)}, i38), new u(30, new r0[]{new r0(46, 24), new r0(10, 25)}, 5), new u(30, new r0[]{new r0(2, 15), new r0(64, 16)}, 5));
        int i39 = 5;
        e eVar37 = new e(37, new int[]{6, 28, 54, 80, qs.r1, qs.Q1, qs.o2}, new u(30, new r0[]{new r0(17, qs.G1), new r0(4, qs.H1)}, i39), new u(28, new r0[]{new r0(29, 46), new r0(14, 47)}, i39), new u(30, new r0[]{new r0(49, 24), new r0(10, 25)}, 5), new u(30, new r0[]{new r0(24, 15), new r0(46, 16)}, 5));
        int i40 = 5;
        e eVar38 = new e(38, new int[]{6, 32, 58, 84, qs.v1, qs.S1, qs.s2}, new u(30, new r0[]{new r0(4, qs.G1), new r0(18, qs.H1)}, i40), new u(28, new r0[]{new r0(13, 46), new r0(32, 47)}, i40), new u(30, new r0[]{new r0(48, 24), new r0(14, 25)}, 5), new u(30, new r0[]{new r0(42, 15), new r0(32, 16)}, 5));
        int i41 = 5;
        e eVar39 = new e(39, new int[]{6, 26, 54, 82, qs.v1, qs.U1, qs.w2}, new u(30, new r0[]{new r0(20, qs.C1), new r0(4, qs.D1)}, i41), new u(28, new r0[]{new r0(40, 47), new r0(7, 48)}, i41), new u(30, new r0[]{new r0(43, 24), new r0(22, 25)}, 5), new u(30, new r0[]{new r0(10, 15), new r0(67, 16)}, 5));
        int i42 = 5;
        return new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29, eVar30, eVar31, eVar32, eVar33, eVar34, eVar35, eVar36, eVar37, eVar38, eVar39, new e(40, new int[]{6, 30, 58, 86, qs.z1, qs.Y1, qs.A2}, new u(30, new r0[]{new r0(19, qs.D1), new r0(6, qs.E1)}, i42), new u(28, new r0[]{new r0(18, 47), new r0(31, 48)}, i42), new u(30, new r0[]{new r0(34, 24), new r0(34, 25)}, 5), new u(30, new r0[]{new r0(20, 15), new r0(61, 16)}, 5))};
    }

    public static e b(int i7) {
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        for (int i12 = 0; i12 < 34; i12++) {
            int i13 = e[i12];
            if (i13 == i7) {
                return c(i12 + 7);
            }
            int bitCount = Integer.bitCount(i13 ^ i7);
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

    public static e c(int i7) {
        if (i7 < 1 || i7 > 40) {
            throw new IllegalArgumentException();
        }
        return f[i7 - 1];
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
