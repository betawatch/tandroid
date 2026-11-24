// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nd1 extends ud1 {
    public final byte i;
    public final boolean j;
    public final boolean k;
    public List o;
    public List p;
    public byte q;
    public byte r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, kk7.B3, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, kk7.I3, 93, kk7.L3, kk7.R3, kk7.Y3, 97, 98, 99, 100, 101, kk7.m1, kk7.n1, kk7.o1, kk7.p1, kk7.q1, kk7.r1, kk7.s1, kk7.t1, kk7.u1, kk7.v1, kk7.w1, kk7.x1, kk7.y1, kk7.z1, kk7.A1, kk7.B1, kk7.C1, kk7.D1, 120, kk7.E1, kk7.F1, kk7.G3, kk7.V3, kk7.m3, kk7.P3, 9632};
    public static final int[] D = {kk7.D2, kk7.F2, kk7.S2, kk7.U2, 8482, kk7.r2, kk7.s2, 9834, kk7.A3, 32, kk7.H3, kk7.C3, 234, kk7.M3, kk7.S3, kk7.Z3};
    public static final int[] E = {kk7.W2, kk7.e3, kk7.n3, kk7.u3, kk7.w3, kk7.a4, 8216, kk7.q2, 42, 39, 8212, kk7.y2, 8480, 8226, 8220, 8221, kk7.V2, kk7.X2, kk7.c3, kk7.d3, kk7.f3, 203, kk7.K3, kk7.j3, kk7.k3, kk7.N3, kk7.o3, kk7.t3, kk7.X3, kk7.v3, kk7.A2, kk7.Q2};
    public static final int[] F = {kk7.Y2, kk7.D3, kk7.i3, kk7.h3, 236, 210, kk7.Q3, kk7.p3, kk7.T3, kk7.G1, kk7.I1, 92, 94, 95, kk7.H1, kk7.J1, kk7.Z2, kk7.E3, kk7.q3, kk7.U3, kk7.z3, kk7.u2, kk7.t2, 9474, kk7.a3, 229, kk7.s3, kk7.W3, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final xu7 h = new xu7();
    public final ArrayList m = new ArrayList();
    public md1 n = new md1(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public nd1(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? (byte) 2 : (byte) 3;
        if (i == 1) {
            this.k = false;
            this.j = false;
        } else if (i == 2) {
            this.k = true;
            this.j = false;
        } else if (i == 3) {
            this.k = false;
            this.j = true;
        } else if (i != 4) {
            lad.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = false;
            this.j = false;
        } else {
            this.k = true;
            this.j = true;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // ud1
    public final qx4 f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new qx4(list);
    }

    @Override // ud1, u83
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = (byte) 4;
        this.n.h = (byte) 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[SYNTHETIC] */
    @Override // ud1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(sd1 sd1Var) {
        boolean z2;
        ByteBuffer byteBuffer = sd1Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xu7 xu7Var = this.h;
        xu7Var.L(limit, array);
        boolean z3 = false;
        while (true) {
            int a = xu7Var.a();
            byte b = this.i;
            if (a < b) {
                if (z3) {
                    byte b2 = this.q;
                    if (b2 == 1 || b2 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int A2 = b == 2 ? -4 : xu7Var.A();
            int A3 = xu7Var.A();
            int A4 = xu7Var.A();
            if ((A2 & 2) == 0 && (A2 & 1) == this.j) {
                byte b3 = (byte) (A3 & kk7.K1);
                byte b4 = (byte) (A4 & kk7.K1);
                if (b3 != 0 || b4 != 0) {
                    boolean z4 = this.s;
                    if ((A2 & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[A3] && zArr[A4]) {
                            z2 = true;
                            this.s = z2;
                            if (z2 || (b3 & 240) != 16) {
                                this.t = false;
                            } else if (this.t && this.u == b3 && this.v == b4) {
                                this.t = false;
                            } else {
                                this.t = true;
                                this.u = b3;
                                this.v = b4;
                            }
                            if (!z2) {
                                if (1 <= b3 && b3 <= 15) {
                                    this.x = false;
                                } else if ((b3 & 246) == 20) {
                                    if (b4 != 32 && b4 != 47) {
                                        switch (b4) {
                                            default:
                                                switch (b4) {
                                                    case 42:
                                                    case 43:
                                                        this.x = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.x = true;
                                                break;
                                        }
                                    }
                                    this.x = true;
                                }
                                if (this.x) {
                                    int i = b3 & 224;
                                    if (i == 0) {
                                        this.w = (b3 >> 3) & 1;
                                    }
                                    if (this.w == this.k) {
                                        if (i == 0) {
                                            int i2 = b3 & 247;
                                            if (i2 == 17 && (b4 & 240) == 48) {
                                                this.n.a((char) D[b4 & 15]);
                                            } else {
                                                int i3 = b3 & 246;
                                                if (i3 == 18 && (b4 & 224) == 32) {
                                                    this.n.b();
                                                    int i4 = b4 & 31;
                                                    this.n.a((char) ((b3 & 1) == 0 ? E[i4] : F[i4]));
                                                } else if (i2 == 17 && (b4 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z5 = (b4 & 1) == 1;
                                                    md1 md1Var = this.n;
                                                    md1Var.a.add(new ld1((b4 >> 1) & 7, md1Var.c.length(), z5));
                                                } else if ((b3 & 240) == 16 && (b4 & 192) == 64) {
                                                    int i5 = z[b3 & 7];
                                                    if ((b4 & 32) != 0) {
                                                        i5++;
                                                    }
                                                    md1 md1Var2 = this.n;
                                                    if (i5 != md1Var2.d) {
                                                        if (this.q != 1 && !md1Var2.e()) {
                                                            md1 md1Var3 = new md1(this.q, this.r);
                                                            this.n = md1Var3;
                                                            this.m.add(md1Var3);
                                                        }
                                                        md1Var2 = this.n;
                                                        md1Var2.d = i5;
                                                    }
                                                    boolean z6 = (b4 & 16) == 16;
                                                    boolean z7 = (b4 & 1) == 1;
                                                    int i6 = (b4 >> 1) & 7;
                                                    md1Var2.a.add(new ld1(z6 ? 8 : i6, md1Var2.c.length(), z7));
                                                    if (z6) {
                                                        this.n.e = A[i6];
                                                    }
                                                } else if (i2 == 23 && b4 >= 33 && b4 <= 35) {
                                                    this.n.f = b4 - 32;
                                                } else if (i3 == 20 && (b4 & 240) == 32) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                byte b5 = this.q;
                                                                if (b5 != 0) {
                                                                    if (b4 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b5 == 1 || b5 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (b5 == 1 && !this.n.e()) {
                                                                                    md1 md1Var4 = this.n;
                                                                                    ArrayList arrayList = md1Var4.b;
                                                                                    arrayList.add(md1Var4.d());
                                                                                    md1Var4.c.setLength(0);
                                                                                    md1Var4.a.clear();
                                                                                    int min = Math.min((int) md1Var4.h, md1Var4.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            md1 md1Var5 = this.n;
                                            int[] iArr = C;
                                            md1Var5.a((char) iArr[(b3 & Byte.MAX_VALUE) - 32]);
                                            if ((b4 & 224) != 0) {
                                                this.n.a((char) iArr[(b4 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                            } else if (z4) {
                                k();
                                z3 = true;
                            }
                        }
                    }
                    z2 = false;
                    this.s = z2;
                    if (z2) {
                    }
                    this.t = false;
                    if (!z2) {
                    }
                }
            }
        }
    }

    @Override // u83
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // ud1, u83
    /* renamed from: h */
    public final rab c() {
        rab rabVar;
        rab c = super.c();
        if (c != null) {
            return c;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (rabVar = (rab) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        qx4 f = f();
        long j3 = this.e;
        rabVar.timeUs = j3;
        rabVar.a = f;
        rabVar.b = j3;
        return rabVar;
    }

    @Override // ud1
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            u33 c = ((md1) arrayList.get(i2)).c(TLObject.FLAG_31);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            u33 u33Var = (u33) arrayList2.get(i3);
            if (u33Var != null) {
                if (u33Var.i != i) {
                    u33Var = ((md1) arrayList.get(i3)).c(i);
                    u33Var.getClass();
                }
                arrayList3.add(u33Var);
            }
        }
        return arrayList3;
    }

    public final void k() {
        md1 md1Var = this.n;
        md1Var.g = this.q;
        md1Var.a.clear();
        md1Var.b.clear();
        md1Var.c.setLength(0);
        md1Var.d = 15;
        md1Var.e = 0;
        md1Var.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        byte b = this.q;
        if (b == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            k();
            if (b == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((md1) arrayList.get(i2)).g = i;
            i2++;
        }
    }

    @Override // ud1, u83
    public final void release() {
    }
}
