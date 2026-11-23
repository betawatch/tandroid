package d4;

import h2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ls.C3, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, ls.J3, 93, ls.M3, ls.S3, ls.Z3, 97, 98, 99, 100, 101, ls.n1, ls.o1, ls.p1, ls.q1, ls.r1, ls.s1, ls.t1, ls.u1, ls.v1, ls.w1, ls.x1, ls.y1, ls.z1, ls.A1, ls.B1, ls.C1, ls.D1, ls.E1, 120, ls.F1, ls.G1, ls.H3, ls.W3, ls.n3, ls.Q3, 9632};
    public static final int[] D = {ls.E2, ls.G2, ls.T2, ls.V2, 8482, ls.s2, ls.t2, 9834, ls.B3, 32, ls.I3, ls.D3, 234, ls.N3, ls.T3, ls.a4};
    public static final int[] E = {ls.X2, ls.f3, ls.o3, ls.v3, ls.x3, ls.b4, 8216, ls.r2, 42, 39, 8212, ls.z2, 8480, 8226, 8220, 8221, ls.W2, ls.Y2, ls.d3, ls.e3, ls.g3, 203, ls.L3, ls.k3, ls.l3, ls.O3, ls.p3, ls.u3, ls.Y3, ls.w3, ls.B2, ls.R2};
    public static final int[] F = {ls.Z2, ls.E3, ls.j3, ls.i3, 236, 210, ls.R3, ls.q3, ls.U3, ls.H1, ls.J1, 92, 94, 95, ls.I1, ls.K1, ls.a3, ls.F3, ls.r3, ls.V3, ls.A3, ls.v2, ls.u2, 9474, ls.b3, 229, ls.t3, ls.X3, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final x h = new x();
    public final ArrayList m = new ArrayList();
    public b n = new b(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public c(String str, int i7) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i7 == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i7 == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i7 != 4) {
            h2.a.l("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
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

    @Override // d4.j
    public final ob.c f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new ob.c(list, 14);
    }

    @Override // d4.j, k2.e
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
    @Override // d4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(h hVar) {
        boolean z10;
        ByteBuffer byteBuffer = hVar.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.h;
        xVar.L(limit, array);
        boolean z11 = false;
        while (true) {
            int a10 = xVar.a();
            int i7 = this.i;
            if (a10 < i7) {
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
            int A2 = i7 == 2 ? -4 : xVar.A();
            int A3 = xVar.A();
            int A4 = xVar.A();
            if ((A2 & 2) == 0 && (A2 & 1) == this.j) {
                byte b10 = (byte) (A3 & ls.L1);
                byte b11 = (byte) (A4 & ls.L1);
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

    @Override // k2.e
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // d4.j, k2.e
    /* renamed from: h */
    public final c4.j c() {
        c4.j jVar;
        c4.j c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j3 = this.l;
        if (j3 == -9223372036854775807L) {
            return null;
        }
        long j10 = this.y;
        if (j10 == -9223372036854775807L || this.e - j10 < j3 || (jVar = (c4.j) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        ob.c f10 = f();
        long j11 = this.e;
        jVar.timeUs = j11;
        jVar.a = f10;
        jVar.b = j11;
        return jVar;
    }

    @Override // d4.j
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i7 = 2;
        for (int i10 = 0; i10 < size; i10++) {
            g2.b c10 = ((b) arrayList.get(i10)).c(TLObject.FLAG_31);
            arrayList2.add(c10);
            if (c10 != null) {
                i7 = Math.min(i7, c10.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            g2.b bVar = (g2.b) arrayList2.get(i11);
            if (bVar != null) {
                if (bVar.i != i7) {
                    bVar = ((b) arrayList.get(i11)).c(i7);
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

    public final void l(int i7) {
        int i10 = this.q;
        if (i10 == i7) {
            return;
        }
        this.q = i7;
        if (i7 != 3) {
            k();
            if (i10 == 3 || i7 == 1 || i7 == 0) {
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
            ((b) arrayList.get(i11)).g = i7;
            i11++;
        }
    }

    @Override // d4.j, k2.e
    public final void release() {
    }
}
