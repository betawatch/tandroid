package ac;

import c5.x;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final h[] f = a();
    public final int a;
    public final int[] b;
    public final x[] c;
    public final int d;

    public h(int i10, int[] iArr, x... xVarArr) {
        this.a = i10;
        this.b = iArr;
        this.c = xVarArr;
        x xVar = xVarArr[0];
        int i11 = xVar.b;
        int i12 = 0;
        for (g gVar : (g[]) xVar.c) {
            i12 += (gVar.b + i11) * gVar.a;
        }
        this.d = i12;
    }

    public static h[] a() {
        int i10 = 1;
        int i11 = 10;
        h hVar = new h(1, new int[0], new x(7, new g[]{new g(1, 19)}, i10), new x(i11, new g[]{new g(1, 16)}, i10), new x(13, new g[]{new g(1, 13)}, i10), new x(17, new g[]{new g(1, 9)}, i10));
        int i12 = 22;
        h hVar2 = new h(2, new int[]{6, 18}, new x(i11, new g[]{new g(1, 34)}, i10), new x(16, new g[]{new g(1, 28)}, i10), new x(i12, new g[]{new g(1, 22)}, i10), new x(28, new g[]{new g(1, 16)}, i10));
        int i13 = 26;
        h hVar3 = new h(3, new int[]{6, 22}, new x(15, new g[]{new g(1, 55)}, i10), new x(i13, new g[]{new g(1, 44)}, i10), new x(18, new g[]{new g(2, 17)}, i10), new x(i12, new g[]{new g(2, 13)}, i10));
        h hVar4 = new h(4, new int[]{6, 26}, new x(20, new g[]{new g(1, 80)}, i10), new x(18, new g[]{new g(2, 32)}, i10), new x(i13, new g[]{new g(2, 24)}, i10), new x(16, new g[]{new g(4, 9)}, i10));
        h hVar5 = new h(5, new int[]{6, 30}, new x(i13, new g[]{new g(1, zs.t1)}, i10), new x(24, new g[]{new g(2, 43)}, i10), new x(18, new g[]{new g(2, 15), new g(2, 16)}, i10), new x(22, new g[]{new g(2, 11), new g(2, 12)}, i10));
        h hVar6 = new h(6, new int[]{6, 34}, new x(18, new g[]{new g(2, 68)}, i10), new x(16, new g[]{new g(4, 27)}, i10), new x(24, new g[]{new g(4, 19)}, i10), new x(28, new g[]{new g(4, 15)}, i10));
        h hVar7 = new h(7, new int[]{6, 22, 38}, new x(20, new g[]{new g(2, 78)}, i10), new x(18, new g[]{new g(4, 31)}, i10), new x(18, new g[]{new g(2, 14), new g(4, 15)}, i10), new x(26, new g[]{new g(4, 13), new g(1, 14)}, i10));
        h hVar8 = new h(8, new int[]{6, 24, 42}, new x(24, new g[]{new g(2, 97)}, i10), new x(22, new g[]{new g(2, 38), new g(2, 39)}, i10), new x(22, new g[]{new g(4, 18), new g(2, 19)}, i10), new x(26, new g[]{new g(4, 14), new g(2, 15)}, i10));
        int i14 = 1;
        h hVar9 = new h(9, new int[]{6, 26, 46}, new x(30, new g[]{new g(2, zs.B1)}, i14), new x(22, new g[]{new g(3, 36), new g(2, 37)}, i14), new x(20, new g[]{new g(4, 16), new g(4, 17)}, i14), new x(24, new g[]{new g(4, 12), new g(4, 13)}, i14));
        int i15 = 1;
        h hVar10 = new h(10, new int[]{6, 28, 50}, new x(18, new g[]{new g(2, 68), new g(2, 69)}, i15), new x(26, new g[]{new g(4, 43), new g(1, 44)}, i15), new x(24, new g[]{new g(6, 19), new g(2, 20)}, i15), new x(28, new g[]{new g(6, 15), new g(2, 16)}, i15));
        h hVar11 = new h(11, new int[]{6, 30, 54}, new x(20, new g[]{new g(4, 81)}, i15), new x(30, new g[]{new g(1, 50), new g(4, 51)}, i15), new x(28, new g[]{new g(4, 22), new g(4, 23)}, i15), new x(24, new g[]{new g(3, 12), new g(8, 13)}, i15));
        int i16 = 1;
        h hVar12 = new h(12, new int[]{6, 32, 58}, new x(24, new g[]{new g(2, 92), new g(2, 93)}, i16), new x(22, new g[]{new g(6, 36), new g(2, 37)}, i16), new x(26, new g[]{new g(4, 20), new g(6, 21)}, i16), new x(28, new g[]{new g(7, 14), new g(4, 15)}, i16));
        h hVar13 = new h(13, new int[]{6, 34, 62}, new x(26, new g[]{new g(4, zs.s1)}, i16), new x(22, new g[]{new g(8, 37), new g(1, 38)}, i16), new x(24, new g[]{new g(8, 20), new g(4, 21)}, i16), new x(22, new g[]{new g(12, 11), new g(4, 12)}, i16));
        int i17 = 1;
        h hVar14 = new h(14, new int[]{6, 26, 46, 66}, new x(30, new g[]{new g(3, zs.A1), new g(1, zs.B1)}, i17), new x(24, new g[]{new g(4, 40), new g(5, 41)}, i17), new x(20, new g[]{new g(11, 16), new g(5, 17)}, i17), new x(24, new g[]{new g(11, 12), new g(5, 13)}, i17));
        int i18 = 1;
        h hVar15 = new h(15, new int[]{6, 26, 48, 70}, new x(22, new g[]{new g(5, 87), new g(1, 88)}, i18), new x(24, new g[]{new g(5, 41), new g(5, 42)}, i18), new x(30, new g[]{new g(5, 24), new g(7, 25)}, i18), new x(24, new g[]{new g(11, 12), new g(7, 13)}, i18));
        int i19 = 1;
        h hVar16 = new h(16, new int[]{6, 26, 50, 74}, new x(24, new g[]{new g(5, 98), new g(1, 99)}, i19), new x(28, new g[]{new g(7, 45), new g(3, 46)}, i19), new x(24, new g[]{new g(15, 19), new g(2, 20)}, i19), new x(30, new g[]{new g(3, 15), new g(13, 16)}, i19));
        h hVar17 = new h(17, new int[]{6, 30, 54, 78}, new x(28, new g[]{new g(1, zs.s1), new g(5, zs.t1)}, i19), new x(28, new g[]{new g(10, 46), new g(1, 47)}, i19), new x(28, new g[]{new g(1, 22), new g(15, 23)}, i19), new x(28, new g[]{new g(2, 14), new g(17, 15)}, i19));
        int i20 = 1;
        h hVar18 = new h(18, new int[]{6, 30, 56, 82}, new x(30, new g[]{new g(5, 120), new g(1, zs.F1)}, i20), new x(26, new g[]{new g(9, 43), new g(4, 44)}, i20), new x(28, new g[]{new g(17, 22), new g(1, 23)}, i20), new x(28, new g[]{new g(2, 14), new g(19, 15)}, i20));
        int i21 = 1;
        h hVar19 = new h(19, new int[]{6, 30, 58, 86}, new x(28, new g[]{new g(3, zs.y1), new g(4, zs.z1)}, i21), new x(26, new g[]{new g(3, 44), new g(11, 45)}, i21), new x(26, new g[]{new g(17, 21), new g(4, 22)}, i21), new x(26, new g[]{new g(9, 13), new g(16, 14)}, i21));
        int i22 = 1;
        int i23 = 28;
        h hVar20 = new h(20, new int[]{6, 34, 62, 90}, new x(28, new g[]{new g(3, zs.s1), new g(5, zs.t1)}, i22), new x(26, new g[]{new g(3, 41), new g(13, 42)}, i22), new x(30, new g[]{new g(15, 24), new g(5, 25)}, i22), new x(i23, new g[]{new g(15, 15), new g(10, 16)}, i22));
        int i24 = 1;
        h hVar21 = new h(21, new int[]{6, 28, 50, 72, 94}, new x(i23, new g[]{new g(4, zs.B1), new g(4, zs.C1)}, i24), new x(26, new g[]{new g(17, 42)}, i24), new x(28, new g[]{new g(17, 22), new g(6, 23)}, i24), new x(30, new g[]{new g(19, 16), new g(6, 17)}, i24));
        int i25 = 1;
        int i26 = 28;
        h hVar22 = new h(22, new int[]{6, 26, 50, 74, 98}, new x(i26, new g[]{new g(2, zs.w1), new g(7, zs.x1)}, i25), new x(i26, new g[]{new g(17, 46)}, i25), new x(30, new g[]{new g(7, 24), new g(16, 25)}, i25), new x(24, new g[]{new g(34, 13)}, i25));
        int i27 = 1;
        h hVar23 = new h(23, new int[]{6, 30, 54, 78, zs.n1}, new x(30, new g[]{new g(4, zs.F1), new g(5, zs.G1)}, i27), new x(28, new g[]{new g(4, 47), new g(14, 48)}, i27), new x(30, new g[]{new g(11, 24), new g(14, 25)}, i27), new x(30, new g[]{new g(16, 15), new g(14, 16)}, i27));
        int i28 = 1;
        h hVar24 = new h(24, new int[]{6, 28, 54, 80, zs.r1}, new x(30, new g[]{new g(6, zs.C1), new g(4, zs.D1)}, i28), new x(28, new g[]{new g(6, 45), new g(14, 46)}, i28), new x(30, new g[]{new g(11, 24), new g(16, 25)}, i28), new x(30, new g[]{new g(30, 16), new g(2, 17)}, i28));
        int i29 = 1;
        h hVar25 = new h(25, new int[]{6, 32, 58, 84, zs.v1}, new x(26, new g[]{new g(8, zs.r1), new g(4, zs.s1)}, i29), new x(28, new g[]{new g(8, 47), new g(13, 48)}, i29), new x(30, new g[]{new g(7, 24), new g(22, 25)}, i29), new x(30, new g[]{new g(22, 15), new g(13, 16)}, i29));
        int i30 = 1;
        int i31 = 28;
        h hVar26 = new h(26, new int[]{6, 30, 58, 86, zs.z1}, new x(i31, new g[]{new g(10, zs.z1), new g(2, zs.A1)}, i30), new x(i31, new g[]{new g(19, 46), new g(4, 47)}, i30), new x(28, new g[]{new g(28, 22), new g(6, 23)}, i30), new x(30, new g[]{new g(33, 16), new g(4, 17)}, i30));
        int i32 = 1;
        h hVar27 = new h(27, new int[]{6, 34, 62, 90, zs.D1}, new x(30, new g[]{new g(8, zs.G1), new g(4, zs.H1)}, i32), new x(28, new g[]{new g(22, 45), new g(3, 46)}, i32), new x(30, new g[]{new g(8, 23), new g(26, 24)}, i32), new x(30, new g[]{new g(12, 15), new g(28, 16)}, i32));
        int i33 = 1;
        h hVar28 = new h(28, new int[]{6, 26, 50, 74, 98, zs.G1}, new x(30, new g[]{new g(3, zs.C1), new g(10, zs.D1)}, i33), new x(28, new g[]{new g(3, 45), new g(23, 46)}, i33), new x(30, new g[]{new g(4, 24), new g(31, 25)}, i33), new x(30, new g[]{new g(11, 15), new g(31, 16)}, i33));
        int i34 = 1;
        h hVar29 = new h(29, new int[]{6, 30, 54, 78, zs.n1, zs.K1}, new x(30, new g[]{new g(7, zs.B1), new g(7, zs.C1)}, i34), new x(28, new g[]{new g(21, 45), new g(7, 46)}, i34), new x(30, new g[]{new g(1, 23), new g(37, 24)}, i34), new x(30, new g[]{new g(19, 15), new g(26, 16)}, i34));
        int i35 = 1;
        h hVar30 = new h(30, new int[]{6, 26, 52, 78, zs.p1, zs.O1}, new x(30, new g[]{new g(5, zs.A1), new g(10, zs.B1)}, i35), new x(28, new g[]{new g(19, 47), new g(10, 48)}, i35), new x(30, new g[]{new g(15, 24), new g(25, 25)}, i35), new x(30, new g[]{new g(23, 15), new g(25, 16)}, i35));
        int i36 = 1;
        h hVar31 = new h(31, new int[]{6, 30, 56, 82, zs.t1, 134}, new x(30, new g[]{new g(13, zs.A1), new g(3, zs.B1)}, i36), new x(28, new g[]{new g(2, 46), new g(29, 47)}, i36), new x(30, new g[]{new g(42, 24), new g(1, 25)}, i36), new x(30, new g[]{new g(23, 15), new g(28, 16)}, i36));
        int i37 = 1;
        h hVar32 = new h(32, new int[]{6, 34, 60, 86, zs.x1, zs.U1}, new x(30, new g[]{new g(17, zs.A1)}, i37), new x(28, new g[]{new g(10, 46), new g(23, 47)}, i37), new x(30, new g[]{new g(10, 24), new g(35, 25)}, i37), new x(30, new g[]{new g(19, 15), new g(35, 16)}, i37));
        int i38 = 1;
        h hVar33 = new h(33, new int[]{6, 30, 58, 86, zs.z1, zs.Y1}, new x(30, new g[]{new g(17, zs.A1), new g(1, zs.B1)}, i38), new x(28, new g[]{new g(14, 46), new g(21, 47)}, i38), new x(30, new g[]{new g(29, 24), new g(19, 25)}, i38), new x(30, new g[]{new g(11, 15), new g(46, 16)}, i38));
        int i39 = 1;
        h hVar34 = new h(34, new int[]{6, 34, 62, 90, zs.D1, zs.c2}, new x(30, new g[]{new g(13, zs.A1), new g(6, zs.B1)}, i39), new x(28, new g[]{new g(14, 46), new g(23, 47)}, i39), new x(30, new g[]{new g(44, 24), new g(7, 25)}, i39), new x(30, new g[]{new g(59, 16), new g(1, 17)}, i39));
        int i40 = 1;
        h hVar35 = new h(35, new int[]{6, 30, 54, 78, zs.n1, zs.K1, zs.g2}, new x(30, new g[]{new g(12, zs.F1), new g(7, zs.G1)}, i40), new x(28, new g[]{new g(12, 47), new g(26, 48)}, i40), new x(30, new g[]{new g(39, 24), new g(14, 25)}, i40), new x(30, new g[]{new g(22, 15), new g(41, 16)}, i40));
        int i41 = 1;
        h hVar36 = new h(36, new int[]{6, 24, 50, 76, zs.n1, 128, zs.k2}, new x(30, new g[]{new g(6, zs.F1), new g(14, zs.G1)}, i41), new x(28, new g[]{new g(6, 47), new g(34, 48)}, i41), new x(30, new g[]{new g(46, 24), new g(10, 25)}, i41), new x(30, new g[]{new g(2, 15), new g(64, 16)}, i41));
        int i42 = 1;
        h hVar37 = new h(37, new int[]{6, 28, 54, 80, zs.r1, zs.Q1, zs.o2}, new x(30, new g[]{new g(17, zs.G1), new g(4, zs.H1)}, i42), new x(28, new g[]{new g(29, 46), new g(14, 47)}, i42), new x(30, new g[]{new g(49, 24), new g(10, 25)}, i42), new x(30, new g[]{new g(24, 15), new g(46, 16)}, i42));
        int i43 = 1;
        h hVar38 = new h(38, new int[]{6, 32, 58, 84, zs.v1, zs.S1, zs.s2}, new x(30, new g[]{new g(4, zs.G1), new g(18, zs.H1)}, i43), new x(28, new g[]{new g(13, 46), new g(32, 47)}, i43), new x(30, new g[]{new g(48, 24), new g(14, 25)}, i43), new x(30, new g[]{new g(42, 15), new g(32, 16)}, i43));
        int i44 = 1;
        h hVar39 = new h(39, new int[]{6, 26, 54, 82, zs.v1, zs.U1, zs.w2}, new x(30, new g[]{new g(20, zs.C1), new g(4, zs.D1)}, i44), new x(28, new g[]{new g(40, 47), new g(7, 48)}, i44), new x(30, new g[]{new g(43, 24), new g(22, 25)}, i44), new x(30, new g[]{new g(10, 15), new g(67, 16)}, i44));
        int i45 = 1;
        return new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, hVar19, hVar20, hVar21, hVar22, hVar23, hVar24, hVar25, hVar26, hVar27, hVar28, hVar29, hVar30, hVar31, hVar32, hVar33, hVar34, hVar35, hVar36, hVar37, hVar38, hVar39, new h(40, new int[]{6, 30, 58, 86, zs.z1, zs.Y1, zs.A2}, new x(30, new g[]{new g(19, zs.D1), new g(6, zs.E1)}, i45), new x(28, new g[]{new g(18, 47), new g(31, 48)}, i45), new x(30, new g[]{new g(34, 24), new g(34, 25)}, i45), new x(30, new g[]{new g(20, 15), new g(61, 16)}, i45))};
    }

    public static h b(int i10) {
        int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i12 = 0;
        for (int i13 = 0; i13 < 34; i13++) {
            int i14 = e[i13];
            if (i14 == i10) {
                return c(i13 + 7);
            }
            int bitCount = Integer.bitCount(i14 ^ i10);
            if (bitCount < i11) {
                i12 = i13 + 7;
                i11 = bitCount;
            }
        }
        if (i11 <= 3) {
            return c(i12);
        }
        return null;
    }

    public static h c(int i10) {
        if (i10 < 1 || i10 > 40) {
            throw new IllegalArgumentException();
        }
        return f[i10 - 1];
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
