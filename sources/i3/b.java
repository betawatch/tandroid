package i3;

import a4.h;
import b2.r;
import b2.r0;
import c3.h0;
import c3.l;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.y;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b implements o {
    public final v a = new v(4);
    public final v b = new v(9);
    public final v c = new v(11);
    public final v d = new v();
    public final c e;
    public q f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public e p;

    public b() {
        c cVar = new c(new n());
        cVar.b = -9223372036854775807L;
        cVar.c = new long[0];
        cVar.d = new long[0];
        this.e = cVar;
        this.g = 1;
    }

    public final v a(p pVar) {
        int i10 = this.l;
        v vVar = this.d;
        byte[] bArr = vVar.a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.l);
        pVar.readFully(vVar.a, 0, this.l);
        return vVar;
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        v vVar = this.a;
        l lVar = (l) pVar;
        lVar.g(vVar.a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.g(vVar.a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & MediaDataController.MAX_LINKS_COUNT) == 0) {
                lVar.g(vVar.a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f = 0;
                lVar.s(j3, false);
                lVar.g(vVar.a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.f = qVar;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        long j3;
        long j10;
        int i10;
        int i11;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        e2.d.h(this.f);
        while (true) {
            int i12 = this.g;
            if (i12 == 1) {
                v vVar = this.b;
                if (!pVar.d(vVar.a, 0, 9, true)) {
                    return -1;
                }
                vVar.J(0);
                vVar.K(4);
                int x10 = vVar.x();
                boolean z13 = (x10 & 4) != 0;
                boolean z14 = (x10 & 1) != 0;
                if (z13 && this.o == null) {
                    this.o = new a(this.f.I(8, 1));
                }
                if (z14 && this.p == null) {
                    this.p = new e(this.f.I(9, 2));
                }
                this.f.B();
                this.j = vVar.j() - 5;
                this.g = 2;
            } else if (i12 == 2) {
                pVar.q(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i12 == 3) {
                v vVar2 = this.c;
                if (!pVar.d(vVar2.a, 0, 11, true)) {
                    return -1;
                }
                vVar2.J(0);
                this.k = vVar2.x();
                this.l = vVar2.A();
                this.m = vVar2.A();
                this.m = ((vVar2.x() << 24) | this.m) * 1000;
                vVar2.K(3);
                this.g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z15 = this.h;
                c cVar = this.e;
                if (z15) {
                    j3 = this.i + this.m;
                } else if (cVar.b == -9223372036854775807L) {
                    j10 = 0;
                    i10 = this.k;
                    if (i10 == 8 || this.o == null) {
                        i11 = 0;
                        if (i10 == 9 || this.p == null) {
                            j11 = -9223372036854775807L;
                            if (i10 == 18 || this.n) {
                                pVar.q(this.l);
                                z10 = false;
                                z11 = false;
                                if (!this.h && z10) {
                                    this.h = true;
                                    this.i = cVar.b != j11 ? -this.m : 0L;
                                }
                                this.j = 4;
                                this.g = 2;
                                if (z11) {
                                    return i11;
                                }
                            } else {
                                v a2 = a(pVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (a2.x() == 2 && "onMetaData".equals(c.b1(a2)) && a2.a() != 0 && a2.x() == 8) {
                                    HashMap a12 = c.a1(a2);
                                    Object obj = a12.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            cVar.b = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = a12.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            cVar.c = new long[size];
                                            cVar.d = new long[size];
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj5 = list.get(i13);
                                                Object obj6 = list2.get(i13);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    cVar.c = new long[0];
                                                    cVar.d = new long[0];
                                                    break;
                                                }
                                                double d10 = d;
                                                cVar.c[i13] = (long) (((Double) obj6).doubleValue() * d10);
                                                cVar.d[i13] = ((Double) obj5).longValue();
                                                i13++;
                                                d = d10;
                                            }
                                        }
                                    }
                                }
                                long j12 = cVar.b;
                                if (j12 != -9223372036854775807L) {
                                    this.f.G(new y(j12, cVar.d, cVar.c));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f.G(new t(-9223372036854775807L));
                                this.n = true;
                            }
                            e eVar = this.p;
                            v a10 = a(pVar);
                            eVar.getClass();
                            int x11 = a10.x();
                            int i14 = (x11 >> 4) & 15;
                            int i15 = x11 & 15;
                            if (i15 != 7) {
                                throw new d(hc.b.j(i15, "Video format not supported: "));
                            }
                            eVar.g = i14;
                            if (i14 != 5) {
                                v vVar3 = eVar.b;
                                h0 h0Var = (h0) eVar.a;
                                v vVar4 = eVar.c;
                                int x12 = a10.x();
                                byte[] bArr = a10.a;
                                int i16 = a10.b;
                                j11 = -9223372036854775807L;
                                int i17 = i16 + 1;
                                a10.b = i17;
                                int i18 = ((bArr[i16] & 255) << 24) >> 8;
                                a10.b = i16 + 2;
                                int i19 = ((bArr[i17] & 255) << 8) | i18;
                                a10.b = i16 + 3;
                                long j13 = (((bArr[r5] & 255) | i19) * 1000) + j10;
                                boolean z16 = false;
                                if (x12 == 0 && !eVar.e) {
                                    byte[] bArr2 = new byte[a10.a()];
                                    v vVar5 = new v(bArr2);
                                    a10.h(0, a10.a(), bArr2);
                                    c3.d a11 = c3.d.a(vVar5);
                                    eVar.d = a11.b;
                                    r rVar = new r();
                                    rVar.p = r0.n("video/x-flv");
                                    rVar.q = r0.n(MediaController.VIDEO_MIME_TYPE);
                                    rVar.j = a11.l;
                                    rVar.x = a11.c;
                                    rVar.y = a11.d;
                                    rVar.D = a11.k;
                                    rVar.t = a11.a;
                                    hc.b.u(rVar, h0Var);
                                    eVar.e = true;
                                } else if (x12 == 1 && eVar.e) {
                                    int i20 = eVar.g == 1 ? 1 : 0;
                                    if (eVar.f || i20 != 0) {
                                        byte[] bArr3 = vVar4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i21 = 4 - eVar.d;
                                        int i22 = 0;
                                        while (a10.a() > 0) {
                                            a10.h(i21, eVar.d, vVar4.a);
                                            vVar4.J(0);
                                            int B = vVar4.B();
                                            vVar3.J(0);
                                            h0Var.d(4, vVar3);
                                            h0Var.d(B, a10);
                                            i22 = i22 + 4 + B;
                                        }
                                        ((h0) eVar.a).c(j13, i20, i22, 0, null);
                                        eVar.f = true;
                                        z16 = true;
                                    }
                                }
                                if (z16) {
                                    z10 = true;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        z10 = false;
                    } else {
                        if (!this.n) {
                            this.f.G(new t(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        v a13 = a(pVar);
                        h0 h0Var2 = (h0) aVar.a;
                        if (aVar.b) {
                            i11 = 0;
                            a13.K(1);
                        } else {
                            int x13 = a13.x();
                            int i23 = (x13 >> 4) & 15;
                            aVar.d = i23;
                            i11 = 0;
                            if (i23 == 2) {
                                int i24 = a.e[(x13 >> 2) & 3];
                                r rVar2 = new r();
                                rVar2.p = r0.n("video/x-flv");
                                rVar2.q = r0.n("audio/mpeg");
                                rVar2.I = 1;
                                rVar2.J = i24;
                                hc.b.u(rVar2, h0Var2);
                                aVar.c = true;
                            } else if (i23 == 7 || i23 == 8) {
                                String str = i23 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                r rVar3 = new r();
                                rVar3.p = r0.n("video/x-flv");
                                rVar3.q = r0.n(str);
                                rVar3.I = 1;
                                rVar3.J = 8000;
                                hc.b.u(rVar3, h0Var2);
                                aVar.c = true;
                            } else if (i23 != 10) {
                                throw new d("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        h0 h0Var3 = (h0) aVar.a;
                        if (aVar.d == 2) {
                            int a14 = a13.a();
                            h0Var3.d(a14, a13);
                            ((h0) aVar.a).c(j10, 1, a14, 0, null);
                        } else {
                            int x14 = a13.x();
                            z12 = false;
                            if (x14 == 0 && !aVar.c) {
                                int a15 = a13.a();
                                byte[] bArr4 = new byte[a15];
                                a13.h(0, a15, bArr4);
                                c3.a n10 = c3.b.n(new h(bArr4, a15), false);
                                r rVar4 = new r();
                                rVar4.p = r0.n("video/x-flv");
                                rVar4.q = r0.n(MediaController.AUDIO_MIME_TYPE);
                                rVar4.j = n10.a;
                                rVar4.I = n10.c;
                                rVar4.J = n10.b;
                                rVar4.t = Collections.singletonList(bArr4);
                                hc.b.u(rVar4, h0Var3);
                                aVar.c = true;
                            } else if (aVar.d != 10 || x14 == 1) {
                                int a16 = a13.a();
                                h0Var3.d(a16, a13);
                                ((h0) aVar.a).c(j10, 1, a16, 0, null);
                            }
                            j11 = -9223372036854775807L;
                            z10 = z12;
                        }
                        z12 = true;
                        j11 = -9223372036854775807L;
                        z10 = z12;
                    }
                    z11 = true;
                    if (!this.h) {
                        this.h = true;
                        this.i = cVar.b != j11 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z11) {
                    }
                } else {
                    j3 = this.m;
                }
                j10 = j3;
                i10 = this.k;
                if (i10 == 8) {
                }
                i11 = 0;
                if (i10 == 9) {
                }
                j11 = -9223372036854775807L;
                if (i10 == 18) {
                }
                pVar.q(this.l);
                z10 = false;
                z11 = false;
                if (!this.h) {
                }
                this.j = 4;
                this.g = 2;
                if (z11) {
                }
            }
        }
    }

    @Override // c3.o
    public final o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
