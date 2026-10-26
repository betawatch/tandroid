package i3;

import a4.g;
import b2.w;
import b2.w0;
import c3.j0;
import c3.l;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import c3.y;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b implements o {
    public final x a = new x(4);
    public final x b = new x(9);
    public final x c = new x(11);
    public final x d = new x();
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
        x xVar = this.a;
        l lVar = (l) pVar;
        lVar.h(xVar.a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.h(xVar.a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & MediaDataController.MAX_LINKS_COUNT) == 0) {
                lVar.h(xVar.a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f = 0;
                lVar.s(m10, false);
                lVar.h(xVar.a, 0, 4, false);
                xVar.N(0);
                if (xVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.f = qVar;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // c3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0009 A[SYNTHETIC] */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        long j10;
        long j11;
        int i10;
        int i11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        this.f.getClass();
        while (true) {
            int i12 = this.g;
            if (i12 == 1) {
                x xVar = this.b;
                if (!pVar.c(xVar.a, 0, 9, true)) {
                    return -1;
                }
                xVar.N(0);
                xVar.O(4);
                int A = xVar.A();
                boolean z13 = (A & 4) != 0;
                boolean z14 = (A & 1) != 0;
                if (z13 && this.o == null) {
                    this.o = new a(this.f.F1(8, 1));
                }
                if (z14 && this.p == null) {
                    this.p = new e(this.f.F1(9, 2));
                }
                this.f.Q0();
                this.j = xVar.m() - 5;
                this.g = 2;
            } else if (i12 == 2) {
                pVar.q(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i12 == 3) {
                x xVar2 = this.c;
                if (!pVar.c(xVar2.a, 0, 11, true)) {
                    return -1;
                }
                xVar2.N(0);
                this.k = xVar2.A();
                this.l = xVar2.D();
                this.m = xVar2.D();
                this.m = ((xVar2.A() << 24) | this.m) * 1000;
                xVar2.O(3);
                this.g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z15 = this.h;
                c cVar = this.e;
                if (z15) {
                    j10 = this.i + this.m;
                } else if (cVar.b == -9223372036854775807L) {
                    j11 = 0;
                    i10 = this.k;
                    if (i10 == 8 || this.o == null) {
                        i11 = 0;
                        if (i10 == 9 || this.p == null) {
                            j12 = -9223372036854775807L;
                            if (i10 == 18 || this.n) {
                                pVar.q(this.l);
                                z10 = false;
                                z11 = false;
                            } else {
                                x g7 = g(pVar);
                                cVar.getClass();
                                cVar.getClass();
                                if (g7.A() == 2 && "onMetaData".equals(c.g1(g7)) && g7.a() != 0 && g7.A() == 8) {
                                    HashMap f12 = c.f1(g7);
                                    Object obj = f12.get("duration");
                                    double d = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            cVar.b = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = f12.get("keyframes");
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
                                long j13 = cVar.b;
                                if (j13 != -9223372036854775807L) {
                                    this.f.D1(new y(j13, cVar.d, cVar.c));
                                    this.n = true;
                                }
                            }
                        } else {
                            if (!this.n) {
                                this.f.D1(new t(-9223372036854775807L));
                                this.n = true;
                            }
                            e eVar = this.p;
                            x g10 = g(pVar);
                            eVar.getClass();
                            int A2 = g10.A();
                            int i14 = (A2 >> 4) & 15;
                            int i15 = A2 & 15;
                            if (i15 != 7) {
                                throw new d(ic.a.i(i15, "Video format not supported: "));
                            }
                            eVar.g = i14;
                            if (i14 != 5) {
                                x xVar3 = eVar.b;
                                j0 j0Var = (j0) eVar.a;
                                x xVar4 = eVar.c;
                                int A3 = g10.A();
                                g10.f(3);
                                byte[] bArr = g10.a;
                                j12 = -9223372036854775807L;
                                int i16 = g10.b;
                                int i17 = i16 + 1;
                                g10.b = i17;
                                int i18 = ((bArr[i16] & 255) << 24) >> 8;
                                g10.b = i16 + 2;
                                int i19 = ((bArr[i17] & 255) << 8) | i18;
                                g10.b = i16 + 3;
                                long j14 = (((bArr[r5] & 255) | i19) * 1000) + j11;
                                boolean z16 = false;
                                if (A3 == 0 && !eVar.e) {
                                    byte[] bArr2 = new byte[g10.a()];
                                    x xVar5 = new x(bArr2);
                                    g10.k(0, g10.a(), bArr2);
                                    c3.d a2 = c3.d.a(xVar5);
                                    eVar.d = a2.b;
                                    w wVar = new w();
                                    wVar.q = w0.n("video/x-flv");
                                    wVar.r = w0.n(MediaController.VIDEO_MIME_TYPE);
                                    wVar.j = a2.l;
                                    wVar.y = a2.c;
                                    wVar.z = a2.d;
                                    wVar.E = a2.k;
                                    wVar.u = a2.a;
                                    ic.a.u(wVar, j0Var);
                                    eVar.e = true;
                                } else if (A3 == 1 && eVar.e) {
                                    int i20 = eVar.g == 1 ? 1 : 0;
                                    if (eVar.f || i20 != 0) {
                                        byte[] bArr3 = xVar4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i21 = 4 - eVar.d;
                                        int i22 = 0;
                                        while (g10.a() > 0) {
                                            g10.k(i21, eVar.d, xVar4.a);
                                            xVar4.N(0);
                                            int E = xVar4.E();
                                            xVar3.N(0);
                                            j0Var.d(4, xVar3);
                                            j0Var.d(E, g10);
                                            i22 = i22 + 4 + E;
                                        }
                                        ((j0) eVar.a).c(j14, i20, i22, 0, null);
                                        eVar.f = true;
                                        z16 = true;
                                    }
                                }
                                if (z16) {
                                    z10 = true;
                                    z11 = true;
                                }
                            } else {
                                j12 = -9223372036854775807L;
                            }
                        }
                        z10 = false;
                        z11 = true;
                    } else {
                        if (!this.n) {
                            this.f.D1(new t(-9223372036854775807L));
                            this.n = true;
                        }
                        a aVar = this.o;
                        x g11 = g(pVar);
                        j0 j0Var2 = (j0) aVar.a;
                        if (aVar.b) {
                            i11 = 0;
                            g11.O(1);
                        } else {
                            int A4 = g11.A();
                            int i23 = (A4 >> 4) & 15;
                            aVar.d = i23;
                            i11 = 0;
                            if (i23 == 2) {
                                int i24 = a.e[(A4 >> 2) & 3];
                                w wVar2 = new w();
                                wVar2.q = w0.n("video/x-flv");
                                wVar2.r = w0.n("audio/mpeg");
                                wVar2.J = 1;
                                wVar2.K = i24;
                                ic.a.u(wVar2, j0Var2);
                                aVar.c = true;
                            } else if (i23 == 7 || i23 == 8) {
                                String str = i23 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                w wVar3 = new w();
                                wVar3.q = w0.n("video/x-flv");
                                wVar3.r = w0.n(str);
                                wVar3.J = 1;
                                wVar3.K = 8000;
                                ic.a.u(wVar3, j0Var2);
                                aVar.c = true;
                            } else if (i23 != 10) {
                                throw new d("Audio format not supported: " + aVar.d);
                            }
                            aVar.b = true;
                        }
                        j0 j0Var3 = (j0) aVar.a;
                        if (aVar.d == 2) {
                            int a10 = g11.a();
                            j0Var3.d(a10, g11);
                            ((j0) aVar.a).c(j11, 1, a10, 0, null);
                        } else {
                            int A5 = g11.A();
                            z12 = false;
                            if (A5 == 0 && !aVar.c) {
                                int a11 = g11.a();
                                byte[] bArr4 = new byte[a11];
                                g11.k(0, a11, bArr4);
                                c3.a n10 = c3.b.n(new g(bArr4, a11), false);
                                w wVar4 = new w();
                                wVar4.q = w0.n("video/x-flv");
                                wVar4.r = w0.n(MediaController.AUDIO_MIME_TYPE);
                                wVar4.j = n10.a;
                                wVar4.J = n10.c;
                                wVar4.K = n10.b;
                                wVar4.u = Collections.singletonList(bArr4);
                                ic.a.u(wVar4, j0Var3);
                                aVar.c = true;
                            } else if (aVar.d != 10 || A5 == 1) {
                                int a12 = g11.a();
                                j0Var3.d(a12, g11);
                                ((j0) aVar.a).c(j11, 1, a12, 0, null);
                            }
                            z11 = true;
                            j12 = -9223372036854775807L;
                            z10 = z12;
                        }
                        z12 = true;
                        z11 = true;
                        j12 = -9223372036854775807L;
                        z10 = z12;
                    }
                    if (!this.h && z10) {
                        this.h = true;
                        this.i = cVar.b != j12 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z11) {
                        return i11;
                    }
                } else {
                    j10 = this.m;
                }
                j11 = j10;
                i10 = this.k;
                if (i10 == 8) {
                }
                i11 = 0;
                if (i10 == 9) {
                }
                j12 = -9223372036854775807L;
                if (i10 == 18) {
                }
                pVar.q(this.l);
                z10 = false;
                z11 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = cVar.b != j12 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z11) {
                }
            }
        }
    }

    public final x g(p pVar) {
        int i10 = this.l;
        x xVar = this.d;
        byte[] bArr = xVar.a;
        if (i10 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.l);
        pVar.readFully(xVar.a, 0, this.l);
        return xVar;
    }

    @Override // c3.o
    public final o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
