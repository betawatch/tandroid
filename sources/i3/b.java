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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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

    @Override // c3.o
    public final boolean a(p pVar) {
        v vVar = this.a;
        l lVar = (l) pVar;
        lVar.h(vVar.a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.h(vVar.a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & MediaDataController.MAX_LINKS_COUNT) == 0) {
                lVar.h(vVar.a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f = 0;
                lVar.s(j3, false);
                lVar.h(vVar.a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final v b(p pVar) {
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
                    this.o = new a(this.f.Z1(8, 1));
                }
                if (z14 && this.p == null) {
                    this.p = new e(this.f.Z1(9, 2));
                }
                this.f.e1();
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
                                v b10 = b(pVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (b10.x() == 2 && "onMetaData".equals(c.b1(b10)) && b10.a() != 0 && b10.x() == 8) {
                                    HashMap a12 = c.a1(b10);
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
                                    this.f.X1(new y(j12, cVar.d, cVar.c));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f.X1(new t(-9223372036854775807L));
                                this.n = true;
                            }
                            e eVar = this.p;
                            v b11 = b(pVar);
                            eVar.getClass();
                            int x11 = b11.x();
                            int i14 = (x11 >> 4) & 15;
                            int i15 = x11 & 15;
                            if (i15 != 7) {
                                throw new d(hg.c.i(i15, "Video format not supported: "));
                            }
                            eVar.g = i14;
                            if (i14 != 5) {
                                v vVar3 = eVar.b;
                                h0 h0Var = (h0) eVar.a;
                                v vVar4 = eVar.c;
                                int x12 = b11.x();
                                byte[] bArr = b11.a;
                                int i16 = b11.b;
                                j11 = -9223372036854775807L;
                                int i17 = i16 + 1;
                                b11.b = i17;
                                int i18 = ((bArr[i16] & 255) << 24) >> 8;
                                b11.b = i16 + 2;
                                int i19 = ((bArr[i17] & 255) << 8) | i18;
                                b11.b = i16 + 3;
                                long j13 = (((bArr[r5] & 255) | i19) * 1000) + j10;
                                boolean z16 = false;
                                if (x12 == 0 && !eVar.e) {
                                    byte[] bArr2 = new byte[b11.a()];
                                    v vVar5 = new v(bArr2);
                                    b11.h(0, b11.a(), bArr2);
                                    c3.d a2 = c3.d.a(vVar5);
                                    eVar.d = a2.b;
                                    r rVar = new r();
                                    rVar.p = r0.n("video/x-flv");
                                    rVar.q = r0.n(MediaController.VIDEO_MIME_TYPE);
                                    rVar.j = a2.l;
                                    rVar.x = a2.c;
                                    rVar.y = a2.d;
                                    rVar.D = a2.k;
                                    rVar.t = a2.a;
                                    hg.c.u(rVar, h0Var);
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
                                        while (b11.a() > 0) {
                                            b11.h(i21, eVar.d, vVar4.a);
                                            vVar4.J(0);
                                            int B = vVar4.B();
                                            vVar3.J(0);
                                            h0Var.d(4, vVar3);
                                            h0Var.d(B, b11);
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
                            this.f.X1(new t(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        v b12 = b(pVar);
                        h0 h0Var2 = (h0) aVar.a;
                        if (aVar.b) {
                            i11 = 0;
                            b12.K(1);
                        } else {
                            int x13 = b12.x();
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
                                hg.c.u(rVar2, h0Var2);
                                aVar.c = true;
                            } else if (i23 == 7 || i23 == 8) {
                                String str = i23 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                r rVar3 = new r();
                                rVar3.p = r0.n("video/x-flv");
                                rVar3.q = r0.n(str);
                                rVar3.I = 1;
                                rVar3.J = 8000;
                                hg.c.u(rVar3, h0Var2);
                                aVar.c = true;
                            } else if (i23 != 10) {
                                throw new d("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        h0 h0Var3 = (h0) aVar.a;
                        if (aVar.d == 2) {
                            int a10 = b12.a();
                            h0Var3.d(a10, b12);
                            ((h0) aVar.a).c(j10, 1, a10, 0, null);
                        } else {
                            int x14 = b12.x();
                            z12 = false;
                            if (x14 == 0 && !aVar.c) {
                                int a11 = b12.a();
                                byte[] bArr4 = new byte[a11];
                                b12.h(0, a11, bArr4);
                                c3.a n10 = c3.b.n(new h(bArr4, a11), false);
                                r rVar4 = new r();
                                rVar4.p = r0.n("video/x-flv");
                                rVar4.q = r0.n(MediaController.AUDIO_MIME_TYPE);
                                rVar4.j = n10.a;
                                rVar4.I = n10.c;
                                rVar4.J = n10.b;
                                rVar4.t = Collections.singletonList(bArr4);
                                hg.c.u(rVar4, h0Var3);
                                aVar.c = true;
                            } else if (aVar.d != 10 || x14 == 1) {
                                int a13 = b12.a();
                                h0Var3.d(a13, b12);
                                ((h0) aVar.a).c(j10, 1, a13, 0, null);
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
