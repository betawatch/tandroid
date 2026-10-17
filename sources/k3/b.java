package k3;

import b2.t0;
import b2.v;
import b2.v0;
import b2.w0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import w3.l;
import z3.k;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class b implements o {
    public q b;
    public int c;
    public int d;
    public int e;
    public l3.b g;
    public p h;
    public ad.d i;
    public l j;
    public final x a = new x(2);
    public long f = -1;

    @Override // c3.o
    public final boolean a(p pVar) {
        String v;
        c3.l lVar = (c3.l) pVar;
        x xVar = this.a;
        xVar.K(2);
        lVar.j(xVar.a, 0, 2, false);
        if (xVar.H() == 65496) {
            while (true) {
                xVar.K(2);
                lVar.j(xVar.a, 0, 2, false);
                int H = xVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xVar.K(2);
                lVar.b(0, 2, xVar.a);
                int H2 = xVar.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    lVar.v(H2, false);
                } else {
                    xVar.K(H2);
                    lVar.j(xVar.a, 0, H2, false);
                    if (Objects.equals(xVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = xVar.v()) != null) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (v.contains(d.a[i10] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.b = qVar;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            l lVar = this.j;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        String v;
        ad.d dVar;
        x1 x1Var;
        int i10;
        l3.b bVar;
        long j10;
        long j11;
        int i11 = this.c;
        long j12 = -1;
        x xVar = this.a;
        if (i11 == 0) {
            xVar.K(2);
            pVar.readFully(xVar.a, 0, 2);
            int H = xVar.H();
            this.d = H;
            if (H == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((H < 65488 || H > 65497) && H != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            xVar.K(2);
            pVar.b(0, 2, xVar.a);
            this.e = xVar.H() - 2;
            pVar.r(2);
            this.c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || pVar != this.h) {
                    this.h = pVar;
                    this.i = new ad.d(pVar, this.f);
                }
                l lVar = this.j;
                lVar.getClass();
                int f7 = lVar.f(this.i, sVar);
                if (f7 == 1) {
                    sVar.a += this.f;
                }
                return f7;
            }
            long position = pVar.getPosition();
            long j13 = this.f;
            if (position != j13) {
                sVar.a = j13;
                return 1;
            }
            if (!pVar.j(xVar.a, 0, 1, true)) {
                g();
                return 0;
            }
            pVar.q();
            if (this.j == null) {
                this.j = new l(k.D, 8);
            }
            ad.d dVar2 = new ad.d(pVar, this.f);
            this.i = dVar2;
            if (!this.j.a(dVar2)) {
                g();
                return 0;
            }
            l lVar2 = this.j;
            long j14 = this.f;
            q qVar = this.b;
            qVar.getClass();
            lVar2.c(new ad.d(j14, qVar, 2));
            l3.b bVar2 = this.g;
            bVar2.getClass();
            q qVar2 = this.b;
            qVar2.getClass();
            j0 j02 = qVar2.j0(1024, 4);
            v vVar = new v();
            vVar.q = v0.n("image/jpeg");
            vVar.k = new t0(bVar2);
            i0.a.u(vVar, j02);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            x xVar2 = new x(this.e);
            pVar.readFully(xVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(xVar2.v()) && (v = xVar2.v()) != null) {
                long length = pVar.getLength();
                if (length != -1) {
                    try {
                        dVar = d.a(v);
                    } catch (w0 | NumberFormatException | XmlPullParserException unused) {
                        e2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        dVar = null;
                    }
                    if (dVar != null && (i10 = (x1Var = (x1) dVar.c).d) >= 2) {
                        int i12 = i10 - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        while (i12 >= 0) {
                            c cVar = (c) x1Var.get(i12);
                            String str = cVar.a;
                            boolean z10 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i12 == 0) {
                                j10 = j12;
                                length -= cVar.d;
                                j11 = 0;
                            } else {
                                j10 = j12;
                                j11 = length - cVar.c;
                            }
                            long j19 = length;
                            length = j11;
                            if (z10 && length != j19) {
                                j18 = j19 - length;
                                j17 = length;
                            }
                            if (i12 == 0) {
                                j16 = j19;
                                j15 = length;
                            }
                            i12--;
                            j12 = j10;
                        }
                        long j20 = j12;
                        if (j17 != j20 && j18 != j20 && j15 != j20 && j16 != j20) {
                            bVar = new l3.b(j15, j16, dVar.b, j17, j18);
                            this.g = bVar;
                            if (bVar != null) {
                                this.f = bVar.d;
                            }
                        }
                    }
                }
                bVar = null;
                this.g = bVar;
                if (bVar != null) {
                }
            }
        } else {
            pVar.r(this.e);
        }
        this.c = 0;
        return 0;
    }

    public final void g() {
        q qVar = this.b;
        qVar.getClass();
        qVar.H();
        this.b.g0(new t(-9223372036854775807L));
        this.c = 6;
    }

    @Override // c3.o
    public final void release() {
        l lVar = this.j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override // c3.o
    public final o b() {
        return this;
    }
}
