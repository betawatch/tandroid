package a4;

import androidx.car.app.navigation.model.Maneuver;
import e2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d extends l {
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
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, MediaDataController.MAX_LINKS_COUNT, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, TLRPC.LAYER, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final v h = new v();
    public final ArrayList m = new ArrayList();
    public c n = new c(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public d(String str, int i10) {
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
            e2.a.n("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
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

    @Override // a4.l
    public final m f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new m(list, 0);
    }

    @Override // a4.l, h2.d
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
    @Override // a4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(j jVar) {
        boolean z10;
        ByteBuffer byteBuffer = jVar.e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.h;
        vVar.H(limit, array);
        boolean z11 = false;
        while (true) {
            int a2 = vVar.a();
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
            int x10 = i10 == 2 ? -4 : vVar.x();
            int x11 = vVar.x();
            int x12 = vVar.x();
            if ((x10 & 2) == 0 && (x10 & 1) == this.j) {
                byte b10 = (byte) (x11 & 127);
                byte b11 = (byte) (x12 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.s;
                    if ((x10 & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[x11] && zArr[x12]) {
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
                                                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                                        this.x = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case Maneuver.TYPE_DESTINATION /* 39 */:
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
                                                    c cVar = this.n;
                                                    cVar.a.add(new b((b11 >> 1) & 7, z13, cVar.c.length()));
                                                } else if ((b10 & 240) == 16 && (b11 & 192) == 64) {
                                                    int i15 = z[b10 & 7];
                                                    if ((b11 & 32) != 0) {
                                                        i15++;
                                                    }
                                                    c cVar2 = this.n;
                                                    if (i15 != cVar2.d) {
                                                        if (this.q != 1 && !cVar2.e()) {
                                                            c cVar3 = new c(this.q, this.r);
                                                            this.n = cVar3;
                                                            this.m.add(cVar3);
                                                        }
                                                        this.n.d = i15;
                                                    }
                                                    boolean z14 = (b11 & 16) == 16;
                                                    boolean z15 = (b11 & 1) == 1;
                                                    int i16 = (b11 >> 1) & 7;
                                                    c cVar4 = this.n;
                                                    cVar4.a.add(new b(z14 ? 8 : i16, z15, cVar4.c.length()));
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
                                                            case Maneuver.TYPE_DESTINATION /* 39 */:
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
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i17 == 1 || i17 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                                                if (i17 == 1 && !this.n.e()) {
                                                                                    c cVar5 = this.n;
                                                                                    ArrayList arrayList = cVar5.b;
                                                                                    arrayList.add(cVar5.d());
                                                                                    cVar5.c.setLength(0);
                                                                                    cVar5.a.clear();
                                                                                    int min = Math.min(cVar5.h, cVar5.d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                                                k();
                                                                                break;
                                                                            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
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
                                            c cVar6 = this.n;
                                            int[] iArr = C;
                                            cVar6.a((char) iArr[(b10 & Byte.MAX_VALUE) - 32]);
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

    @Override // a4.l, h2.d
    /* renamed from: h */
    public final z3.j c() {
        z3.j jVar;
        z3.j c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j3 = this.l;
        if (j3 == -9223372036854775807L) {
            return null;
        }
        long j10 = this.y;
        if (j10 == -9223372036854775807L || this.e - j10 < j3 || (jVar = (z3.j) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        m f7 = f();
        long j11 = this.e;
        jVar.c = j11;
        jVar.f = f7;
        jVar.h = j11;
        return jVar;
    }

    @Override // a4.l
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            d2.b c10 = ((c) arrayList.get(i11)).c(TLObject.FLAG_31);
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
                    bVar = ((c) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        c cVar = this.n;
        cVar.g = this.q;
        cVar.a.clear();
        cVar.b.clear();
        cVar.c.setLength(0);
        cVar.d = 15;
        cVar.e = 0;
        cVar.f = 0;
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
            ((c) arrayList.get(i12)).g = i10;
            i12++;
        }
    }

    @Override // a4.l, h2.d
    public final void release() {
    }
}
