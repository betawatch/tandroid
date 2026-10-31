package a4;

import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends k {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, zs.C3, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, TLRPC.LAYER, 93, zs.M3, zs.S3, zs.Z3, 97, 98, 99, 100, 101, zs.n1, zs.o1, zs.p1, zs.q1, zs.r1, zs.s1, zs.t1, zs.u1, zs.v1, zs.w1, zs.x1, zs.y1, zs.z1, zs.A1, zs.B1, zs.C1, zs.D1, zs.E1, 120, zs.F1, zs.G1, zs.H3, zs.W3, zs.m3, zs.Q3, 9632};
    public static final int[] D = {zs.E2, zs.G2, zs.T2, zs.V2, 8482, zs.s2, zs.t2, 9834, zs.B3, 32, zs.I3, zs.D3, zs.J3, zs.N3, zs.T3, zs.a4};
    public static final int[] E = {zs.X2, zs.f3, zs.o3, zs.v3, zs.x3, zs.b4, 8216, zs.r2, 42, 39, 8212, zs.z2, 8480, 8226, 8220, 8221, zs.W2, zs.Y2, zs.d3, zs.e3, zs.g3, 203, zs.K3, zs.k3, zs.l3, zs.O3, zs.p3, zs.u3, zs.Y3, zs.w3, zs.B2, zs.R2};
    public static final int[] F = {zs.Z2, 227, zs.j3, zs.i3, zs.L3, zs.n3, zs.R3, zs.q3, zs.U3, zs.H1, zs.J1, 92, 94, 95, zs.I1, zs.K1, zs.a3, zs.E3, zs.r3, zs.V3, zs.A3, zs.v2, zs.u2, 9474, zs.b3, zs.F3, zs.t3, zs.X3, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final x h = new x();
    public final ArrayList m = new ArrayList();
    public b n = new b(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public c(String str, int i10) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i10 == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i10 == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i10 != 4) {
            e2.a.l("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // a4.k
    public final l f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new l(list, 0);
    }

    @Override // a4.k, h2.e
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = 4;
        this.n.h = 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // a4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(i iVar) {
        boolean z10;
        ByteBuffer byteBuffer = iVar.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.h;
        xVar.L(limit, array);
        boolean z11 = false;
        while (true) {
            int a2 = xVar.a();
            int i10 = this.i;
            if (a2 < i10) {
                if (z11) {
                    int i11 = this.q;
                    if (i11 == 1 || i11 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int A2 = i10 == 2 ? -4 : xVar.A();
            int A3 = xVar.A();
            int A4 = xVar.A();
            if ((A2 & 2) == 0 && (A2 & 1) == this.j) {
                byte b10 = (byte) (A3 & zs.L1);
                byte b11 = (byte) (A4 & zs.L1);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.s;
                    if ((A2 & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[A3] && zArr[A4]) {
                            z10 = true;
                            this.s = z10;
                            if (z10 || (b10 & 240) != 16) {
                                this.t = false;
                            } else if (this.t && this.u == b10 && this.v == b11) {
                                this.t = false;
                            } else {
                                this.t = true;
                                this.u = b10;
                                this.v = b11;
                            }
                            if (!z10) {
                                if (1 <= b10 && b10 <= 15) {
                                    this.x = false;
                                } else if ((b10 & 246) == 20) {
                                    if (b11 != 32 && b11 != 47) {
                                        switch (b11) {
                                            default:
                                                switch (b11) {
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
                                    int i12 = b10 & 224;
                                    if (i12 == 0) {
                                        this.w = (b10 >> 3) & 1;
                                    }
                                    if (this.w == this.k) {
                                        if (i12 == 0) {
                                            int i13 = b10 & 247;
                                            if (i13 == 17 && (b11 & 240) == 48) {
                                                this.n.a((char) D[b11 & 15]);
                                            } else {
                                                int i14 = b10 & 246;
                                                if (i14 == 18 && (b11 & 224) == 32) {
                                                    this.n.b();
                                                    this.n.a((char) ((b10 & 1) == 0 ? E[b11 & 31] : F[b11 & 31]));
                                                } else if (i13 == 17 && (b11 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z13 = (b11 & 1) == 1;
                                                    b bVar = this.n;
                                                    bVar.a.add(new a((b11 >> 1) & 7, z13, bVar.c.length()));
                                                } else if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                    int i15 = z[b10 & 7];
                                                    if ((b11 & 32) != 0) {
                                                        i15++;
                                                    }
                                                    b bVar2 = this.n;
                                                    if (i15 != bVar2.d) {
                                                        if (this.q != 1 && !bVar2.e()) {
                                                            b bVar3 = new b(this.q, this.r);
                                                            this.n = bVar3;
                                                            this.m.add(bVar3);
                                                        }
                                                        this.n.d = i15;
                                                    }
                                                    boolean z14 = (b11 & 16) == 16;
                                                    boolean z15 = (b11 & 1) == 1;
                                                    int i16 = (b11 >> 1) & 7;
                                                    b bVar4 = this.n;
                                                    bVar4.a.add(new a(z14 ? 8 : i16, z15, bVar4.c.length()));
                                                    if (z14) {
                                                        this.n.e = A[i16];
                                                    }
                                                } else if (i13 == 23 && b11 >= 33 && b11 <= 35) {
                                                    this.n.f = b11 - 32;
                                                } else if (i14 == 20 && (b11 & 240) == 32) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                int i17 = this.q;
                                                                if (i17 != 0) {
                                                                    if (b11 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i17 == 1 || i17 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i17 == 1 && !this.n.e()) {
                                                                                    b bVar5 = this.n;
                                                                                    ArrayList arrayList = bVar5.b;
                                                                                    arrayList.add(bVar5.d());
                                                                                    bVar5.c.setLength(0);
                                                                                    bVar5.a.clear();
                                                                                    int min = Math.min(bVar5.h, bVar5.d);
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
                                            b bVar6 = this.n;
                                            int[] iArr = C;
                                            bVar6.a((char) iArr[(b10 & Byte.MAX_VALUE) - 32]);
                                            if ((b11 & 224) != 0) {
                                                this.n.a((char) iArr[(b11 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z11 = true;
                                    }
                                }
                            } else if (z12) {
                                k();
                                z11 = true;
                            }
                        }
                    }
                    z10 = false;
                    this.s = z10;
                    if (z10) {
                    }
                    this.t = false;
                    if (!z10) {
                    }
                }
            }
        }
    }

    @Override // h2.e
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // a4.k, h2.e
    /* renamed from: h */
    public final z3.j c() {
        z3.j jVar;
        z3.j c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j10 = this.l;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.y;
        if (j11 == -9223372036854775807L || this.e - j11 < j10 || (jVar = (z3.j) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        l f7 = f();
        long j12 = this.e;
        jVar.timeUs = j12;
        jVar.a = f7;
        jVar.b = j12;
        return jVar;
    }

    @Override // a4.k
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            d2.b c10 = ((b) arrayList.get(i11)).c(TLObject.FLAG_31);
            arrayList2.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            d2.b bVar = (d2.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.i != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.n;
        bVar.g = this.q;
        bVar.a.clear();
        bVar.b.clear();
        bVar.c.setLength(0);
        bVar.d = 15;
        bVar.e = 0;
        bVar.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i10) {
        int i11 = this.q;
        if (i11 == i10) {
            return;
        }
        this.q = i10;
        if (i10 != 3) {
            k();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).g = i10;
            i12++;
        }
    }

    @Override // a4.k, h2.e
    public final void release() {
    }
}
