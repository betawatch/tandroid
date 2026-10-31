package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zs {
    public static final int A = 11;
    public static final int A0 = 63;
    public static final int A1 = 115;
    public static final int A2 = 170;
    public static final int A3 = 223;
    public static final int A4 = 277;
    public static final int A5 = 329;
    public static final int B = 12;
    public static final int B0 = 64;
    public static final int B1 = 116;
    public static final int B2 = 171;
    public static final int B3 = 224;
    public static final int B4 = 278;
    public static final int B5 = 330;
    public static final int C = 13;
    public static final int C0 = 65;
    public static final int C1 = 117;
    public static final int C2 = 172;
    public static final int C3 = 225;
    public static final int C4 = 279;
    public static final int C5 = 331;
    public static final int D = 14;
    public static final int D0 = 66;
    public static final int D1 = 118;
    public static final int D2 = 173;
    public static final int D3 = 226;
    public static final int D4 = 280;
    public static final int D5 = 332;
    public static final int E = 15;
    public static final int E0 = 67;
    public static final int E1 = 119;
    public static final int E2 = 174;
    public static final int E3 = 228;
    public static final int E4 = 281;
    public static final int E5 = 333;
    public static final int F = 16;
    public static final int F0 = 68;
    public static final int F1 = 121;
    public static final int F2 = 175;
    public static final int F3 = 229;
    public static final int F4 = 282;
    public static final int F5 = 334;
    public static final int G = 17;
    public static final int G0 = 69;
    public static final int G1 = 122;
    public static final int G2 = 176;
    public static final int G3 = 230;
    public static final int G4 = 283;
    public static final int G5 = 335;
    public static final int H = 18;
    public static final int H0 = 70;
    public static final int H1 = 123;
    public static final int H2 = 177;
    public static final int H3 = 231;
    public static final int H4 = 284;
    public static final int H5 = 336;
    public static final int I = 19;
    public static final int I0 = 71;
    public static final int I1 = 124;
    public static final int I2 = 178;
    public static final int I3 = 232;
    public static final int I4 = 285;
    public static final int I5 = 337;
    public static final int J = 20;
    public static final int J0 = 72;
    public static final int J1 = 125;
    public static final int J2 = 179;
    public static final int J3 = 234;
    public static final int J4 = 286;
    public static final int J5 = 338;
    public static final int K = 21;
    public static final int K0 = 73;
    public static final int K1 = 126;
    public static final int K2 = 180;
    public static final int K3 = 235;
    public static final int K4 = 287;
    public static final int K5 = 339;
    public static final int L = 22;
    public static final int L0 = 74;
    public static final int L1 = 127;
    public static final int L2 = 181;
    public static final int L3 = 236;
    public static final int L4 = 288;
    public static final int L5 = 340;
    public static final int M = 23;
    public static final int M0 = 75;
    public static final int M1 = 128;
    public static final int M2 = 182;
    public static final int M3 = 237;
    public static final int M4 = 289;
    public static final int M5 = 341;
    public static final int N = 24;
    public static final int N0 = 76;
    public static final int N1 = 129;
    public static final int N2 = 183;
    public static final int N3 = 238;
    public static final int N4 = 290;
    public static final int N5 = 342;
    public static final int O = 25;
    public static final int O0 = 77;
    public static final int O1 = 130;
    public static final int O2 = 184;
    public static final int O3 = 239;
    public static final int O4 = 291;
    public static final int O5 = 343;
    public static final int P = 26;
    public static final int P0 = 78;
    public static final int P1 = 131;
    public static final int P2 = 185;
    public static final int P3 = 240;
    public static final int P4 = 292;
    public static final int P5 = 344;
    public static final int Q = 27;
    public static final int Q0 = 79;
    public static final int Q1 = 132;
    public static final int Q2 = 186;
    public static final int Q3 = 241;
    public static final int Q4 = 293;
    public static final int Q5 = 345;
    public static final int R = 28;
    public static final int R0 = 80;
    public static final int R1 = 135;
    public static final int R2 = 187;
    public static final int R3 = 242;
    public static final int R4 = 294;
    public static final int R5 = 346;
    public static final int S = 29;
    public static final int S0 = 81;
    public static final int S1 = 136;
    public static final int S2 = 188;
    public static final int S3 = 243;
    public static final int S4 = 295;
    public static final int S5 = 347;
    public static final int T = 30;
    public static final int T0 = 82;
    public static final int T1 = 137;
    public static final int T2 = 189;
    public static final int T3 = 244;
    public static final int T4 = 296;
    public static final int T5 = 348;
    public static final int U = 31;
    public static final int U0 = 83;
    public static final int U1 = 138;
    public static final int U2 = 190;
    public static final int U3 = 245;
    public static final int U4 = 297;
    public static boolean U5 = false;
    public static final int V = 32;
    public static final int V0 = 84;
    public static final int V1 = 139;
    public static final int V2 = 191;
    public static final int V3 = 246;
    public static final int V4 = 298;
    public static volatile zs[] V5 = new zs[4];
    public static final int W = 33;
    public static final int W0 = 85;
    public static final int W1 = 140;
    public static final int W2 = 192;
    public static final int W3 = 247;
    public static final int W4 = 299;
    public static volatile zs W5 = null;
    public static final int X = 34;
    public static final int X0 = 86;
    public static final int X1 = 141;
    public static final int X2 = 193;
    public static final int X3 = 248;
    public static final int X4 = 300;
    public static final int Y = 35;
    public static final int Y0 = 87;
    public static final int Y1 = 142;
    public static final int Y2 = 194;
    public static final int Y3 = 249;
    public static final int Y4 = 301;
    public static final int Z = 36;
    public static final int Z0 = 88;
    public static final int Z1 = 143;
    public static final int Z2 = 195;
    public static final int Z3 = 250;
    public static final int Z4 = 302;
    public static final int a0 = 37;
    public static final int a1 = 89;
    public static final int a2 = 144;
    public static final int a3 = 196;
    public static final int a4 = 251;
    public static final int a5 = 303;
    public static final int b0 = 38;
    public static final int b1 = 90;
    public static final int b2 = 145;
    public static final int b3 = 197;
    public static final int b4 = 252;
    public static final int b5 = 304;
    public static final int c0 = 39;
    public static final int c1 = 91;
    public static final int c2 = 146;
    public static final int c3 = 198;
    public static final int c4 = 253;
    public static final int c5 = 305;
    public static final int d0 = 40;
    public static final int d1 = 92;
    public static final int d2 = 147;
    public static final int d3 = 199;
    public static final int d4 = 254;
    public static final int d5 = 306;
    public static final int e0 = 41;
    public static final int e1 = 93;
    public static final int e2 = 148;
    public static final int e3 = 200;
    public static final int e4 = 255;
    public static final int e5 = 307;
    public static final int f0 = 42;
    public static final int f1 = 94;
    public static final int f2 = 149;
    public static final int f3 = 201;
    public static final int f4 = 256;
    public static final int f5 = 308;
    public static final int g0 = 43;
    public static final int g1 = 95;
    public static final int g2 = 150;
    public static final int g3 = 202;
    public static final int g4 = 257;
    public static final int g5 = 309;
    public static final int h0 = 44;
    public static final int h1 = 96;
    public static final int h2 = 151;
    public static final int h3 = 203;
    public static final int h4 = 258;
    public static final int h5 = 310;
    public static final int i0 = 45;
    public static final int i1 = 97;
    public static final int i2 = 152;
    public static final int i3 = 204;
    public static final int i4 = 259;
    public static final int i5 = 311;
    public static final int j0 = 46;
    public static final int j1 = 98;
    public static final int j2 = 153;
    public static final int j3 = 205;
    public static final int j4 = 260;
    public static final int j5 = 312;
    public static final int k0 = 47;
    public static final int k1 = 99;
    public static final int k2 = 154;
    public static final int k3 = 206;
    public static final int k4 = 261;
    public static final int k5 = 313;
    public static final int l0 = 48;
    public static final int l1 = 100;
    public static final int l2 = 155;
    public static final int l3 = 207;
    public static final int l4 = 262;
    public static final int l5 = 314;
    public static final int m0 = 49;
    public static final int m1 = 101;
    public static final int m2 = 156;
    public static final int m3 = 209;
    public static final int m4 = 263;
    public static final int m5 = 315;
    public static final int n0 = 50;
    public static final int n1 = 102;
    public static final int n2 = 157;
    public static final int n3 = 210;
    public static final int n4 = 264;
    public static final int n5 = 316;
    public static final int o0 = 51;
    public static final int o1 = 103;
    public static final int o2 = 158;
    public static final int o3 = 211;
    public static final int o4 = 265;
    public static final int o5 = 317;
    public static final int p0 = 52;
    public static final int p1 = 104;
    public static final int p2 = 159;
    public static final int p3 = 212;
    public static final int p4 = 266;
    public static final int p5 = 318;
    public static final int q0 = 53;
    public static final int q1 = 105;
    public static final int q2 = 160;
    public static final int q3 = 213;
    public static final int q4 = 267;
    public static final int q5 = 319;
    public static final int r = 2;
    public static final int r0 = 54;
    public static final int r1 = 106;
    public static final int r2 = 161;
    public static final int r3 = 214;
    public static final int r4 = 268;
    public static final int r5 = 320;
    public static final int s = 3;
    public static final int s0 = 55;
    public static final int s1 = 107;
    public static final int s2 = 162;
    public static final int s3 = 215;
    public static final int s4 = 269;
    public static final int s5 = 321;
    public static final int t = 4;
    public static final int t0 = 56;
    public static final int t1 = 108;
    public static final int t2 = 163;
    public static final int t3 = 216;
    public static final int t4 = 270;
    public static final int t5 = 322;
    public static final int u = 5;
    public static final int u0 = 57;
    public static final int u1 = 109;
    public static final int u2 = 164;
    public static final int u3 = 217;
    public static final int u4 = 271;
    public static final int u5 = 323;
    public static final int v = 6;
    public static final int v0 = 58;
    public static final int v1 = 110;
    public static final int v2 = 165;
    public static final int v3 = 218;
    public static final int v4 = 272;
    public static final int v5 = 324;
    public static final int w = 7;
    public static final int w0 = 59;
    public static final int w1 = 111;
    public static final int w2 = 166;
    public static final int w3 = 219;
    public static final int w4 = 273;
    public static final int w5 = 325;
    public static final int x = 8;
    public static final int x0 = 60;
    public static final int x1 = 112;
    public static final int x2 = 167;
    public static final int x3 = 220;
    public static final int x4 = 274;
    public static final int x5 = 326;
    public static final int y = 9;
    public static final int y0 = 61;
    public static final int y1 = 113;
    public static final int y2 = 168;
    public static final int y3 = 221;
    public static final int y4 = 275;
    public static final int y5 = 327;
    public static final int z = 10;
    public static final int z0 = 62;
    public static final int z1 = 114;
    public static final int z2 = 169;
    public static final int z3 = 222;
    public static final int z4 = 276;
    public static final int z5 = 328;
    public Runnable i;
    public int k;
    public final int o;
    public int p;
    public final SparseArray a = new SparseArray();
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final ArrayList d = new ArrayList(10);
    public final ArrayList e = new ArrayList(10);
    public final ArrayList f = new ArrayList(10);
    public final ArrayList g = new ArrayList(10);
    public final ArrayList h = new ArrayList(10);
    public int j = 0;
    public int l = 1;
    public final HashSet m = new HashSet();
    public final SparseArray n = new SparseArray();
    public final SparseArray q = new SparseArray();

    public zs(int i10) {
        this.o = i10;
    }

    public static zs e() {
        zs zsVar;
        zs zsVar2 = W5;
        if (zsVar2 != null) {
            return zsVar2;
        }
        synchronized (zs.class) {
            try {
                zsVar = W5;
                if (zsVar == null) {
                    zsVar = new zs(-1);
                    W5 = zsVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zsVar;
    }

    public static zs f(int i10) {
        zs zsVar;
        zs zsVar2 = V5[i10];
        if (zsVar2 != null) {
            return zsVar2;
        }
        synchronized (zs.class) {
            try {
                zsVar = V5[i10];
                if (zsVar == null) {
                    zs[] zsVarArr = V5;
                    zs zsVar3 = new zs(i10);
                    zsVarArr[i10] = zsVar3;
                    zsVar = zsVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zsVar;
    }

    public static void i(View view) {
        e().h(view, i4, new x3(view, 2));
    }

    public final void a(ys ysVar) {
        b(ysVar, d5);
    }

    public final void b(us usVar, int i10) {
        ArrayList arrayList;
        boolean z10 = v2.a;
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            throw new RuntimeException("addObserver allowed only from MAIN thread");
        }
        if (this.j != 0) {
            ArrayList arrayList2 = (ArrayList) this.c.get(i10);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.c.put(i10, arrayList2);
            }
            arrayList2.add(usVar);
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.a.get(i10);
        if (arrayList3 == null) {
            SparseArray sparseArray = this.a;
            if (i10 == m4 || i10 == j1 || i10 == k1) {
                ws wsVar = new ws();
                wsVar.a = new HashSet();
                arrayList = wsVar;
            } else {
                arrayList = new ArrayList();
            }
            sparseArray.put(i10, arrayList);
            arrayList3 = arrayList;
        }
        us usVar2 = usVar instanceof xs ? (us) ((xs) usVar).b.get() : usVar;
        if (usVar2 != null) {
            if (arrayList3 instanceof ws) {
                HashSet hashSet = ((ws) arrayList3).a;
                if (hashSet.contains(usVar2) || hashSet.contains(new xs(null, usVar2))) {
                    return;
                }
            } else {
                int size = arrayList3.size();
                for (int i11 = 0; i11 < size; i11++) {
                    us usVar3 = (us) arrayList3.get(i11);
                    if (usVar2.equals(usVar3)) {
                        return;
                    }
                    if ((usVar3 instanceof xs) && ((xs) usVar3).b.get() == usVar2) {
                        return;
                    }
                }
            }
        }
        arrayList3.add(usVar);
        boolean z11 = v2.a;
        if (U5 || arrayList3.size() <= 1000) {
            return;
        }
        U5 = true;
        f8.g(new RuntimeException(i0.a.i(i10, "Total observers more than 1000, need check for memory leak. ")), true);
    }

    public final void c(us usVar, int i10) {
        if (usVar == null) {
            return;
        }
        b(new xs(this, usVar), i10);
    }

    public final void d(Runnable runnable) {
        if (g()) {
            this.e.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final boolean g() {
        return this.k > 0;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, org.telegram.messenger.qs] */
    public final Runnable h(View view, final int i10, final q20 q20Var) {
        if (view == null) {
            return new ag.f3(13);
        }
        ?? r42 = new us() { // from class: org.telegram.messenger.qs
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                if (i11 == i10) {
                    q20Var.a(objArr);
                }
            }
        };
        rs rsVar = new rs(this, r42, i10);
        view.addOnAttachStateChangeListener(rsVar);
        return new kk(this, view, rsVar, (Object) r42, i10, 5);
    }

    public final void j(int i10) {
        SparseArray sparseArray = this.n;
        ss ssVar = (ss) sparseArray.get(i10);
        sparseArray.delete(i10);
        if (ssVar != null) {
            this.k--;
            HashSet hashSet = this.m;
            if (!hashSet.isEmpty()) {
                hashSet.remove(Integer.valueOf(i10));
                if (hashSet.isEmpty()) {
                    e().k(k1, 512);
                }
            }
            if (this.k == 0) {
                o();
            }
        }
        if (this.i == null || sparseArray.size() != 0) {
            return;
        }
        i0.r(this.i);
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i10, Object... objArr) {
        int i11;
        int i12 = j1;
        int i13 = k1;
        boolean z10 = i10 == i13 || i10 == i12 || i10 == m4 || i10 == t || i10 == j4 || i10 == r4 || i10 == L;
        ArrayList arrayList = null;
        if (!z10) {
            SparseArray sparseArray = this.n;
            if (sparseArray.size() > 0) {
                int size = sparseArray.size();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i14 >= sparseArray.size()) {
                        i11 = 0;
                        break;
                    }
                    ss ssVar = (ss) sparseArray.valueAt(i14);
                    i11 = 0;
                    if (elapsedRealtime - ssVar.b > 5017) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(Integer.valueOf(sparseArray.keyAt(i14)));
                    }
                    int[] iArr = ssVar.a;
                    if (iArr == null) {
                        break;
                    }
                    int i16 = 0;
                    while (true) {
                        if (i16 >= iArr.length) {
                            break;
                        }
                        if (iArr[i16] == i10) {
                            i15++;
                            break;
                        }
                        i16++;
                    }
                    i14++;
                }
                z10 = size == i15 ? true : i11 == true ? 1 : 0;
                if (i10 != i13) {
                    this.p = (~((Integer) objArr[i11]).intValue()) & this.p;
                } else if (i10 == i12) {
                    this.p = ((Integer) objArr[i11]).intValue() | this.p;
                }
                if (i10 != r) {
                    boolean z11 = v2.a;
                    int hashCode = (Arrays.hashCode(objArr) << 16) + i10;
                    SparseArray sparseArray2 = this.q;
                    if (sparseArray2.indexOfKey(hashCode) < 0) {
                        i2.a0 a0Var = new i2.a0(this, i10, objArr, hashCode);
                        sparseArray2.put(hashCode, a0Var);
                        i0.h3(a0Var, 250L);
                    }
                } else {
                    l(objArr, i10, z10);
                }
                if (arrayList == null) {
                    for (int i17 = i11; i17 < arrayList.size(); i17++) {
                        j(((Integer) arrayList.get(i17)).intValue());
                    }
                    return;
                }
                return;
            }
        }
        i11 = 0;
        if (i10 != i13) {
        }
        if (i10 != r) {
        }
        if (arrayList == null) {
        }
    }

    public final void l(Object[] objArr, int i10, boolean z10) {
        boolean z11 = v2.a;
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            throw new RuntimeException("postNotificationName allowed only from MAIN thread");
        }
        if (!z10 && g()) {
            this.d.add(new ts(i10, objArr));
            return;
        }
        if (!this.h.isEmpty()) {
            for (int i11 = 0; i11 < this.h.size(); i11++) {
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.h.get(i11);
                zkVar.getClass();
                if (i10 == 1) {
                    long longValue = ((Long) objArr[0]).longValue();
                    org.telegram.ui.un unVar = zkVar.a;
                    if (unVar.X6 && longValue == unVar.j6) {
                        this.d.add(new ts(i10, objArr));
                        return;
                    }
                }
            }
        }
        this.j++;
        ArrayList arrayList = (ArrayList) this.a.get(i10);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((us) arrayList.get(i12)).didReceivedNotification(i10, this.o, objArr);
            }
        }
        int i13 = this.j - 1;
        this.j = i13;
        if (i13 == 0) {
            if (this.b.size() != 0) {
                for (int i14 = 0; i14 < this.b.size(); i14++) {
                    int keyAt = this.b.keyAt(i14);
                    ArrayList arrayList2 = (ArrayList) this.b.get(keyAt);
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        n((us) arrayList2.get(i15), keyAt);
                    }
                }
                this.b.clear();
            }
            if (this.c.size() != 0) {
                for (int i16 = 0; i16 < this.c.size(); i16++) {
                    int keyAt2 = this.c.keyAt(i16);
                    ArrayList arrayList3 = (ArrayList) this.c.get(keyAt2);
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        b((us) arrayList3.get(i17), keyAt2);
                    }
                }
                this.c.clear();
            }
        }
    }

    public final void m(int i10, Object... objArr) {
        i0.g3(new o7(this, i10, objArr, 19));
    }

    public final void n(us usVar, int i10) {
        us usVar2;
        boolean z10 = v2.a;
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            throw new RuntimeException("removeObserver allowed only from MAIN thread");
        }
        if (this.j != 0) {
            ArrayList arrayList = (ArrayList) this.b.get(i10);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b.put(i10, arrayList);
            }
            arrayList.add(usVar);
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.a.get(i10);
        if (arrayList2 != null) {
            us usVar3 = usVar instanceof xs ? (us) ((xs) usVar).b.get() : usVar;
            if (arrayList2 instanceof ws) {
                arrayList2.remove(usVar);
                if (usVar3 != null) {
                    arrayList2.remove(usVar3);
                    arrayList2.remove(new xs(null, usVar3));
                    return;
                }
                return;
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                us usVar4 = (us) arrayList2.get(size);
                if (usVar.equals(usVar4)) {
                    arrayList2.remove(size);
                } else if ((usVar4 instanceof xs) && ((usVar2 = (us) ((xs) usVar4).b.get()) == null || usVar2 == usVar3)) {
                    arrayList2.remove(size);
                }
            }
        }
    }

    public final void o() {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = this.g;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ts tsVar = (ts) arrayList2.get(i10);
                l(tsVar.b, tsVar.a, true);
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.e;
        if (arrayList3.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            i0.g3((Runnable) arrayList4.get(i11));
        }
        arrayList4.clear();
    }

    public final int p(int[] iArr, int i10) {
        return q(iArr, i10, true);
    }

    public final int q(int[] iArr, int i10, boolean z10) {
        j(i10);
        HashSet hashSet = this.m;
        int i11 = 0;
        if (hashSet.isEmpty() && z10) {
            e().k(j1, 512);
        }
        this.k++;
        int i12 = this.l + 1;
        this.l = i12;
        if (z10) {
            hashSet.add(Integer.valueOf(i12));
        }
        ss ssVar = new ss();
        ssVar.a = iArr;
        this.n.put(this.l, ssVar);
        if (this.i == null) {
            ps psVar = new ps(this, i11);
            this.i = psVar;
            i0.h3(psVar, 5017L);
        }
        return this.l;
    }
}
