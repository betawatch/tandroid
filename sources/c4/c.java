package c4;

import g2.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends j {
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
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, hs.C3, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, TLRPC.LAYER, 93, hs.M3, hs.S3, hs.Z3, 97, 98, 99, 100, 101, hs.n1, hs.o1, hs.p1, hs.q1, hs.r1, hs.s1, hs.t1, hs.u1, hs.v1, hs.w1, hs.x1, hs.y1, hs.z1, hs.A1, hs.B1, hs.C1, hs.D1, hs.E1, 120, hs.F1, hs.G1, hs.H3, hs.W3, hs.m3, hs.Q3, 9632};
    public static final int[] D = {hs.E2, hs.G2, hs.T2, hs.V2, 8482, hs.s2, hs.t2, 9834, hs.B3, 32, hs.I3, hs.D3, hs.J3, hs.N3, hs.T3, hs.a4};
    public static final int[] E = {hs.X2, hs.f3, hs.o3, hs.v3, hs.x3, hs.b4, 8216, hs.r2, 42, 39, 8212, hs.z2, 8480, 8226, 8220, 8221, hs.W2, hs.Y2, hs.d3, hs.e3, hs.g3, 203, hs.K3, hs.k3, hs.l3, hs.O3, hs.p3, hs.u3, hs.Y3, hs.w3, hs.B2, hs.R2};
    public static final int[] F = {hs.Z2, 227, hs.j3, hs.i3, hs.L3, hs.n3, hs.R3, hs.q3, hs.U3, hs.H1, hs.J1, 92, 94, 95, hs.I1, hs.K1, hs.a3, hs.E3, hs.r3, hs.V3, hs.A3, hs.v2, hs.u2, 9474, hs.b3, hs.F3, hs.t3, hs.X3, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final y h = new y();
    public final ArrayList m = new ArrayList();
    public b n = new b(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public c(String str, int i3) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i3 == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i3 == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i3 == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i3 != 4) {
            g2.a.l("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
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

    @Override // c4.j
    public final android.support.v4.media.c f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new android.support.v4.media.c(list, 6);
    }

    @Override // c4.j, j2.e
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
    @Override // c4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(h hVar) {
        boolean z10;
        ByteBuffer byteBuffer = hVar.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.h;
        yVar.L(limit, array);
        boolean z11 = false;
        while (true) {
            int a10 = yVar.a();
            int i3 = this.i;
            if (a10 < i3) {
                if (z11) {
                    int i10 = this.q;
                    if (i10 == 1 || i10 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int A2 = i3 == 2 ? -4 : yVar.A();
            int A3 = yVar.A();
            int A4 = yVar.A();
            if ((A2 & 2) == 0 && (A2 & 1) == this.j) {
                byte b10 = (byte) (A3 & hs.L1);
                byte b11 = (byte) (A4 & hs.L1);
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
                                    int i11 = b10 & 224;
                                    if (i11 == 0) {
                                        this.w = (b10 >> 3) & 1;
                                    }
                                    if (this.w == this.k) {
                                        if (i11 == 0) {
                                            int i12 = b10 & 247;
                                            if (i12 == 17 && (b11 & 240) == 48) {
                                                this.n.a((char) D[b11 & 15]);
                                            } else {
                                                int i13 = b10 & 246;
                                                if (i13 == 18 && (b11 & 224) == 32) {
                                                    this.n.b();
                                                    this.n.a((char) ((b10 & 1) == 0 ? E[b11 & 31] : F[b11 & 31]));
                                                } else if (i12 == 17 && (b11 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z13 = (b11 & 1) == 1;
                                                    b bVar = this.n;
                                                    bVar.a.add(new a((b11 >> 1) & 7, z13, bVar.c.length()));
                                                } else if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                    int i14 = z[b10 & 7];
                                                    if ((b11 & 32) != 0) {
                                                        i14++;
                                                    }
                                                    b bVar2 = this.n;
                                                    if (i14 != bVar2.d) {
                                                        if (this.q != 1 && !bVar2.e()) {
                                                            b bVar3 = new b(this.q, this.r);
                                                            this.n = bVar3;
                                                            this.m.add(bVar3);
                                                        }
                                                        this.n.d = i14;
                                                    }
                                                    boolean z14 = (b11 & 16) == 16;
                                                    boolean z15 = (b11 & 1) == 1;
                                                    int i15 = (b11 >> 1) & 7;
                                                    b bVar4 = this.n;
                                                    bVar4.a.add(new a(z14 ? 8 : i15, z15, bVar4.c.length()));
                                                    if (z14) {
                                                        this.n.e = A[i15];
                                                    }
                                                } else if (i12 == 23 && b11 >= 33 && b11 <= 35) {
                                                    this.n.f = b11 - 32;
                                                } else if (i13 == 20 && (b11 & 240) == 32) {
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
                                                                int i16 = this.q;
                                                                if (i16 != 0) {
                                                                    if (b11 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i16 == 1 || i16 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i16 == 1 && !this.n.e()) {
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

    @Override // j2.e
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // c4.j, j2.e
    /* renamed from: h */
    public final b4.j c() {
        b4.j jVar;
        b4.j c2 = super.c();
        if (c2 != null) {
            return c2;
        }
        long j10 = this.l;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.y;
        if (j11 == -9223372036854775807L || this.e - j11 < j10 || (jVar = (b4.j) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        android.support.v4.media.c f10 = f();
        long j12 = this.e;
        jVar.timeUs = j12;
        jVar.a = f10;
        jVar.b = j12;
        return jVar;
    }

    @Override // c4.j
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i3 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            f2.b c2 = ((b) arrayList.get(i10)).c(TLObject.FLAG_31);
            arrayList2.add(c2);
            if (c2 != null) {
                i3 = Math.min(i3, c2.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            f2.b bVar = (f2.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.i != i3) {
                    bVar = ((b) arrayList.get(i11)).c(i3);
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

    public final void l(int i3) {
        int i10 = this.q;
        if (i10 == i3) {
            return;
        }
        this.q = i3;
        if (i3 != 3) {
            k();
            if (i10 == 3 || i3 == 1 || i3 == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).g = i3;
            i11++;
        }
    }

    @Override // c4.j, j2.e
    public final void release() {
    }
}
