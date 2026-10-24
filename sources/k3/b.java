package k3;

import b2.t0;
import b2.v;
import b2.v0;
import b2.w0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.o1;
import j$.util.Objects;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import w3.l;
import z3.k;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class b implements q {
    public s b;
    public int c;
    public int d;
    public int e;
    public l3.b g;
    public r h;
    public ad.d i;
    public l j;
    public final x a = new x(2);
    public long f = -1;

    @Override // c3.q
    public final boolean a(r rVar) {
        String v;
        c3.l lVar = (c3.l) rVar;
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
                lVar.a(0, 2, xVar.a);
                int H2 = xVar.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    lVar.u(H2, false);
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

    @Override // c3.q
    public final void c(s sVar) {
        this.b = sVar;
    }

    @Override // c3.q
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

    @Override // c3.q
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    @Override // c3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(r rVar, u uVar) {
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
            rVar.readFully(xVar.a, 0, 2);
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
            rVar.a(0, 2, xVar.a);
            this.e = xVar.H() - 2;
            rVar.r(2);
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
                if (this.i == null || rVar != this.h) {
                    this.h = rVar;
                    this.i = new ad.d(rVar, this.f);
                }
                l lVar = this.j;
                lVar.getClass();
                int f7 = lVar.f(this.i, uVar);
                if (f7 == 1) {
                    uVar.a += this.f;
                }
                return f7;
            }
            long position = rVar.getPosition();
            long j13 = this.f;
            if (position != j13) {
                uVar.a = j13;
                return 1;
            }
            if (!rVar.j(xVar.a, 0, 1, true)) {
                g();
                return 0;
            }
            rVar.q();
            if (this.j == null) {
                this.j = new l(k.D, 8);
            }
            ad.d dVar2 = new ad.d(rVar, this.f);
            this.i = dVar2;
            if (!this.j.a(dVar2)) {
                g();
                return 0;
            }
            l lVar2 = this.j;
            long j14 = this.f;
            s sVar = this.b;
            sVar.getClass();
            lVar2.c(new ad.d(j14, sVar, 2));
            l3.b bVar2 = this.g;
            bVar2.getClass();
            s sVar2 = this.b;
            sVar2.getClass();
            c3.l0 j02 = sVar2.j0(1024, 4);
            v vVar = new v();
            vVar.q = v0.n("image/jpeg");
            vVar.k = new t0(bVar2);
            o1.v(vVar, j02);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            x xVar2 = new x(this.e);
            rVar.readFully(xVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(xVar2.v()) && (v = xVar2.v()) != null) {
                long length = rVar.getLength();
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
            rVar.r(this.e);
        }
        this.c = 0;
        return 0;
    }

    public final void g() {
        s sVar = this.b;
        sVar.getClass();
        sVar.C();
        this.b.g0(new c3.v(-9223372036854775807L));
        this.c = 6;
    }

    @Override // c3.q
    public final void release() {
        l lVar = this.j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override // c3.q
    public final q b() {
        return this;
    }
}
