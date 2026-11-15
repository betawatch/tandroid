package gc;

import e2.r0;
import f5.v;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final f[] f = a();
    public final int a;
    public final int[] b;
    public final v[] c;
    public final int d;

    public f(int i7, int[] iArr, v... vVarArr) {
        this.a = i7;
        this.b = iArr;
        this.c = vVarArr;
        v vVar = vVarArr[0];
        int i10 = vVar.b;
        int i11 = 0;
        for (r0 r0Var : (r0[]) vVar.c) {
            i11 += (r0Var.b + i10) * r0Var.a;
        }
        this.d = i11;
    }

    public static f[] a() {
        int i7 = 5;
        int i10 = 10;
        f fVar = new f(1, new int[0], new v(7, new r0[]{new r0(1, 19)}, i7), new v(i10, new r0[]{new r0(1, 16)}, i7), new v(13, new r0[]{new r0(1, 13)}, i7), new v(17, new r0[]{new r0(1, 9)}, i7));
        int i11 = 22;
        f fVar2 = new f(2, new int[]{6, 18}, new v(i10, new r0[]{new r0(1, 34)}, i7), new v(16, new r0[]{new r0(1, 28)}, i7), new v(i11, new r0[]{new r0(1, 22)}, i7), new v(28, new r0[]{new r0(1, 16)}, i7));
        int i12 = 26;
        f fVar3 = new f(3, new int[]{6, 22}, new v(15, new r0[]{new r0(1, 55)}, i7), new v(i12, new r0[]{new r0(1, 44)}, i7), new v(18, new r0[]{new r0(2, 17)}, i7), new v(i11, new r0[]{new r0(2, 13)}, i7));
        f fVar4 = new f(4, new int[]{6, 26}, new v(20, new r0[]{new r0(1, 80)}, i7), new v(18, new r0[]{new r0(2, 32)}, i7), new v(i12, new r0[]{new r0(2, 24)}, i7), new v(16, new r0[]{new r0(4, 9)}, i7));
        f fVar5 = new f(5, new int[]{6, 30}, new v(i12, new r0[]{new r0(1, ns.t1)}, i7), new v(24, new r0[]{new r0(2, 43)}, i7), new v(18, new r0[]{new r0(2, 15), new r0(2, 16)}, i7), new v(22, new r0[]{new r0(2, 11), new r0(2, 12)}, i7));
        f fVar6 = new f(6, new int[]{6, 34}, new v(18, new r0[]{new r0(2, 68)}, i7), new v(16, new r0[]{new r0(4, 27)}, i7), new v(24, new r0[]{new r0(4, 19)}, i7), new v(28, new r0[]{new r0(4, 15)}, i7));
        f fVar7 = new f(7, new int[]{6, 22, 38}, new v(20, new r0[]{new r0(2, 78)}, i7), new v(18, new r0[]{new r0(4, 31)}, i7), new v(18, new r0[]{new r0(2, 14), new r0(4, 15)}, 5), new v(26, new r0[]{new r0(4, 13), new r0(1, 14)}, 5));
        int i13 = 5;
        int i14 = 22;
        f fVar8 = new f(8, new int[]{6, 24, 42}, new v(24, new r0[]{new r0(2, 97)}, i13), new v(i14, new r0[]{new r0(2, 38), new r0(2, 39)}, i13), new v(i14, new r0[]{new r0(4, 18), new r0(2, 19)}, 5), new v(26, new r0[]{new r0(4, 14), new r0(2, 15)}, 5));
        int i15 = 5;
        f fVar9 = new f(9, new int[]{6, 26, 46}, new v(30, new r0[]{new r0(2, ns.B1)}, i15), new v(22, new r0[]{new r0(3, 36), new r0(2, 37)}, i15), new v(20, new r0[]{new r0(4, 16), new r0(4, 17)}, 5), new v(24, new r0[]{new r0(4, 12), new r0(4, 13)}, 5));
        int i16 = 5;
        f fVar10 = new f(10, new int[]{6, 28, 50}, new v(18, new r0[]{new r0(2, 68), new r0(2, 69)}, i16), new v(26, new r0[]{new r0(4, 43), new r0(1, 44)}, i16), new v(24, new r0[]{new r0(6, 19), new r0(2, 20)}, i16), new v(28, new r0[]{new r0(6, 15), new r0(2, 16)}, 5));
        int i17 = 5;
        f fVar11 = new f(11, new int[]{6, 30, 54}, new v(20, new r0[]{new r0(4, 81)}, i17), new v(30, new r0[]{new r0(1, 50), new r0(4, 51)}, i17), new v(28, new r0[]{new r0(4, 22), new r0(4, 23)}, 5), new v(24, new r0[]{new r0(3, 12), new r0(8, 13)}, 5));
        int i18 = 5;
        f fVar12 = new f(12, new int[]{6, 32, 58}, new v(24, new r0[]{new r0(2, 92), new r0(2, 93)}, i18), new v(22, new r0[]{new r0(6, 36), new r0(2, 37)}, i18), new v(26, new r0[]{new r0(4, 20), new r0(6, 21)}, 5), new v(28, new r0[]{new r0(7, 14), new r0(4, 15)}, 5));
        int i19 = 5;
        f fVar13 = new f(13, new int[]{6, 34, 62}, new v(26, new r0[]{new r0(4, ns.s1)}, i19), new v(22, new r0[]{new r0(8, 37), new r0(1, 38)}, i19), new v(24, new r0[]{new r0(8, 20), new r0(4, 21)}, 5), new v(22, new r0[]{new r0(12, 11), new r0(4, 12)}, 5));
        int i20 = 5;
        f fVar14 = new f(14, new int[]{6, 26, 46, 66}, new v(30, new r0[]{new r0(3, ns.A1), new r0(1, ns.B1)}, i20), new v(24, new r0[]{new r0(4, 40), new r0(5, 41)}, i20), new v(20, new r0[]{new r0(11, 16), new r0(5, 17)}, 5), new v(24, new r0[]{new r0(11, 12), new r0(5, 13)}, 5));
        int i21 = 5;
        f fVar15 = new f(15, new int[]{6, 26, 48, 70}, new v(22, new r0[]{new r0(5, 87), new r0(1, 88)}, i21), new v(24, new r0[]{new r0(5, 41), new r0(5, 42)}, i21), new v(30, new r0[]{new r0(5, 24), new r0(7, 25)}, 5), new v(24, new r0[]{new r0(11, 12), new r0(7, 13)}, 5));
        f fVar16 = new f(16, new int[]{6, 26, 50, 74}, new v(24, new r0[]{new r0(5, 98), new r0(1, 99)}, 5), new v(28, new r0[]{new r0(7, 45), new r0(3, 46)}, 5), new v(24, new r0[]{new r0(15, 19), new r0(2, 20)}, 5), new v(30, new r0[]{new r0(3, 15), new r0(13, 16)}, 5));
        f fVar17 = new f(17, new int[]{6, 30, 54, 78}, new v(28, new r0[]{new r0(1, ns.s1), new r0(5, ns.t1)}, 5), new v(28, new r0[]{new r0(10, 46), new r0(1, 47)}, 5), new v(28, new r0[]{new r0(1, 22), new r0(15, 23)}, 5), new v(28, new r0[]{new r0(2, 14), new r0(17, 15)}, 5));
        f fVar18 = new f(18, new int[]{6, 30, 56, 82}, new v(30, new r0[]{new r0(5, 120), new r0(1, ns.F1)}, 5), new v(26, new r0[]{new r0(9, 43), new r0(4, 44)}, 5), new v(28, new r0[]{new r0(17, 22), new r0(1, 23)}, 5), new v(28, new r0[]{new r0(2, 14), new r0(19, 15)}, 5));
        int i22 = 5;
        f fVar19 = new f(19, new int[]{6, 30, 58, 86}, new v(28, new r0[]{new r0(3, ns.y1), new r0(4, ns.z1)}, i22), new v(26, new r0[]{new r0(3, 44), new r0(11, 45)}, i22), new v(26, new r0[]{new r0(17, 21), new r0(4, 22)}, 5), new v(26, new r0[]{new r0(9, 13), new r0(16, 14)}, 5));
        int i23 = 5;
        int i24 = 28;
        f fVar20 = new f(20, new int[]{6, 34, 62, 90}, new v(28, new r0[]{new r0(3, ns.s1), new r0(5, ns.t1)}, i23), new v(26, new r0[]{new r0(3, 41), new r0(13, 42)}, i23), new v(30, new r0[]{new r0(15, 24), new r0(5, 25)}, i23), new v(i24, new r0[]{new r0(15, 15), new r0(10, 16)}, 5));
        int i25 = 5;
        f fVar21 = new f(21, new int[]{6, 28, 50, 72, 94}, new v(i24, new r0[]{new r0(4, ns.B1), new r0(4, ns.C1)}, i25), new v(26, new r0[]{new r0(17, 42)}, i25), new v(28, new r0[]{new r0(17, 22), new r0(6, 23)}, i25), new v(30, new r0[]{new r0(19, 16), new r0(6, 17)}, 5));
        int i26 = 28;
        int i27 = 5;
        f fVar22 = new f(22, new int[]{6, 26, 50, 74, 98}, new v(i26, new r0[]{new r0(2, ns.w1), new r0(7, ns.x1)}, i27), new v(i26, new r0[]{new r0(17, 46)}, i27), new v(30, new r0[]{new r0(7, 24), new r0(16, 25)}, i27), new v(24, new r0[]{new r0(34, 13)}, i27));
        f fVar23 = new f(23, new int[]{6, 30, 54, 78, ns.n1}, new v(30, new r0[]{new r0(4, ns.F1), new r0(5, ns.G1)}, 5), new v(28, new r0[]{new r0(4, 47), new r0(14, 48)}, 5), new v(30, new r0[]{new r0(11, 24), new r0(14, 25)}, 5), new v(30, new r0[]{new r0(16, 15), new r0(14, 16)}, 5));
        f fVar24 = new f(24, new int[]{6, 28, 54, 80, ns.r1}, new v(30, new r0[]{new r0(6, ns.C1), new r0(4, ns.D1)}, 5), new v(28, new r0[]{new r0(6, 45), new r0(14, 46)}, 5), new v(30, new r0[]{new r0(11, 24), new r0(16, 25)}, 5), new v(30, new r0[]{new r0(30, 16), new r0(2, 17)}, 5));
        f fVar25 = new f(25, new int[]{6, 32, 58, 84, ns.v1}, new v(26, new r0[]{new r0(8, ns.r1), new r0(4, ns.s1)}, 5), new v(28, new r0[]{new r0(8, 47), new r0(13, 48)}, 5), new v(30, new r0[]{new r0(7, 24), new r0(22, 25)}, 5), new v(30, new r0[]{new r0(22, 15), new r0(13, 16)}, 5));
        int i28 = 5;
        f fVar26 = new f(26, new int[]{6, 30, 58, 86, ns.z1}, new v(28, new r0[]{new r0(10, ns.z1), new r0(2, ns.A1)}, i28), new v(28, new r0[]{new r0(19, 46), new r0(4, 47)}, i28), new v(28, new r0[]{new r0(28, 22), new r0(6, 23)}, 5), new v(30, new r0[]{new r0(33, 16), new r0(4, 17)}, 5));
        int i29 = 5;
        f fVar27 = new f(27, new int[]{6, 34, 62, 90, ns.D1}, new v(30, new r0[]{new r0(8, ns.G1), new r0(4, ns.H1)}, i29), new v(28, new r0[]{new r0(22, 45), new r0(3, 46)}, i29), new v(30, new r0[]{new r0(8, 23), new r0(26, 24)}, 5), new v(30, new r0[]{new r0(12, 15), new r0(28, 16)}, 5));
        int i30 = 5;
        f fVar28 = new f(28, new int[]{6, 26, 50, 74, 98, ns.G1}, new v(30, new r0[]{new r0(3, ns.C1), new r0(10, ns.D1)}, i30), new v(28, new r0[]{new r0(3, 45), new r0(23, 46)}, i30), new v(30, new r0[]{new r0(4, 24), new r0(31, 25)}, 5), new v(30, new r0[]{new r0(11, 15), new r0(31, 16)}, 5));
        int i31 = 5;
        f fVar29 = new f(29, new int[]{6, 30, 54, 78, ns.n1, ns.K1}, new v(30, new r0[]{new r0(7, ns.B1), new r0(7, ns.C1)}, i31), new v(28, new r0[]{new r0(21, 45), new r0(7, 46)}, i31), new v(30, new r0[]{new r0(1, 23), new r0(37, 24)}, 5), new v(30, new r0[]{new r0(19, 15), new r0(26, 16)}, 5));
        int i32 = 5;
        f fVar30 = new f(30, new int[]{6, 26, 52, 78, ns.p1, ns.O1}, new v(30, new r0[]{new r0(5, ns.A1), new r0(10, ns.B1)}, i32), new v(28, new r0[]{new r0(19, 47), new r0(10, 48)}, i32), new v(30, new r0[]{new r0(15, 24), new r0(25, 25)}, i32), new v(30, new r0[]{new r0(23, 15), new r0(25, 16)}, 5));
        int i33 = 5;
        f fVar31 = new f(31, new int[]{6, 30, 56, 82, ns.t1, 134}, new v(30, new r0[]{new r0(13, ns.A1), new r0(3, ns.B1)}, i33), new v(28, new r0[]{new r0(2, 46), new r0(29, 47)}, i33), new v(30, new r0[]{new r0(42, 24), new r0(1, 25)}, 5), new v(30, new r0[]{new r0(23, 15), new r0(28, 16)}, 5));
        int i34 = 5;
        f fVar32 = new f(32, new int[]{6, 34, 60, 86, ns.x1, ns.U1}, new v(30, new r0[]{new r0(17, ns.A1)}, i34), new v(28, new r0[]{new r0(10, 46), new r0(23, 47)}, i34), new v(30, new r0[]{new r0(10, 24), new r0(35, 25)}, 5), new v(30, new r0[]{new r0(19, 15), new r0(35, 16)}, 5));
        int i35 = 5;
        f fVar33 = new f(33, new int[]{6, 30, 58, 86, ns.z1, ns.Y1}, new v(30, new r0[]{new r0(17, ns.A1), new r0(1, ns.B1)}, i35), new v(28, new r0[]{new r0(14, 46), new r0(21, 47)}, i35), new v(30, new r0[]{new r0(29, 24), new r0(19, 25)}, 5), new v(30, new r0[]{new r0(11, 15), new r0(46, 16)}, 5));
        int i36 = 5;
        f fVar34 = new f(34, new int[]{6, 34, 62, 90, ns.D1, ns.c2}, new v(30, new r0[]{new r0(13, ns.A1), new r0(6, ns.B1)}, i36), new v(28, new r0[]{new r0(14, 46), new r0(23, 47)}, i36), new v(30, new r0[]{new r0(44, 24), new r0(7, 25)}, 5), new v(30, new r0[]{new r0(59, 16), new r0(1, 17)}, 5));
        int i37 = 5;
        f fVar35 = new f(35, new int[]{6, 30, 54, 78, ns.n1, ns.K1, ns.g2}, new v(30, new r0[]{new r0(12, ns.F1), new r0(7, ns.G1)}, i37), new v(28, new r0[]{new r0(12, 47), new r0(26, 48)}, i37), new v(30, new r0[]{new r0(39, 24), new r0(14, 25)}, 5), new v(30, new r0[]{new r0(22, 15), new r0(41, 16)}, 5));
        int i38 = 5;
        f fVar36 = new f(36, new int[]{6, 24, 50, 76, ns.n1, 128, ns.k2}, new v(30, new r0[]{new r0(6, ns.F1), new r0(14, ns.G1)}, i38), new v(28, new r0[]{new r0(6, 47), new r0(34, 48)}, i38), new v(30, new r0[]{new r0(46, 24), new r0(10, 25)}, 5), new v(30, new r0[]{new r0(2, 15), new r0(64, 16)}, 5));
        int i39 = 5;
        f fVar37 = new f(37, new int[]{6, 28, 54, 80, ns.r1, ns.Q1, ns.o2}, new v(30, new r0[]{new r0(17, ns.G1), new r0(4, ns.H1)}, i39), new v(28, new r0[]{new r0(29, 46), new r0(14, 47)}, i39), new v(30, new r0[]{new r0(49, 24), new r0(10, 25)}, 5), new v(30, new r0[]{new r0(24, 15), new r0(46, 16)}, 5));
        int i40 = 5;
        f fVar38 = new f(38, new int[]{6, 32, 58, 84, ns.v1, ns.S1, ns.s2}, new v(30, new r0[]{new r0(4, ns.G1), new r0(18, ns.H1)}, i40), new v(28, new r0[]{new r0(13, 46), new r0(32, 47)}, i40), new v(30, new r0[]{new r0(48, 24), new r0(14, 25)}, 5), new v(30, new r0[]{new r0(42, 15), new r0(32, 16)}, 5));
        int i41 = 5;
        f fVar39 = new f(39, new int[]{6, 26, 54, 82, ns.v1, ns.U1, ns.w2}, new v(30, new r0[]{new r0(20, ns.C1), new r0(4, ns.D1)}, i41), new v(28, new r0[]{new r0(40, 47), new r0(7, 48)}, i41), new v(30, new r0[]{new r0(43, 24), new r0(22, 25)}, 5), new v(30, new r0[]{new r0(10, 15), new r0(67, 16)}, 5));
        int i42 = 5;
        return new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18, fVar19, fVar20, fVar21, fVar22, fVar23, fVar24, fVar25, fVar26, fVar27, fVar28, fVar29, fVar30, fVar31, fVar32, fVar33, fVar34, fVar35, fVar36, fVar37, fVar38, fVar39, new f(40, new int[]{6, 30, 58, 86, ns.z1, ns.Y1, ns.A2}, new v(30, new r0[]{new r0(19, ns.D1), new r0(6, ns.E1)}, i42), new v(28, new r0[]{new r0(18, 47), new r0(31, 48)}, i42), new v(30, new r0[]{new r0(34, 24), new r0(34, 25)}, 5), new v(30, new r0[]{new r0(20, 15), new r0(61, 16)}, 5))};
    }

    public static f b(int i7) {
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

    public static f c(int i7) {
        if (i7 < 1 || i7 > 40) {
            throw new IllegalArgumentException();
        }
        return f[i7 - 1];
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
