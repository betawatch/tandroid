package k3;

import b2.p0;
import b2.r;
import b2.r0;
import b2.s0;
import c3.h0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import e2.v;
import e6.n;
import e9.a1;
import e9.g0;
import e9.i0;
import i2.g;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import w3.k;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements o {
    public q b;
    public int c;
    public int d;
    public int e;
    public r3.a g;
    public p h;
    public n i;
    public k j;
    public final v a = new v(2);
    public long f = -1;

    public final void a() {
        q qVar = this.b;
        qVar.getClass();
        qVar.Z0();
        this.b.P1(new t(-9223372036854775807L));
        this.c = 6;
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        l lVar = (l) pVar;
        v vVar = this.a;
        vVar.G(2);
        lVar.j(vVar.a, 0, 2, false);
        if (vVar.D() == 65496) {
            vVar.G(2);
            lVar.j(vVar.a, 0, 2, false);
            int D = vVar.D();
            this.d = D;
            if (D == 65504) {
                vVar.G(2);
                lVar.j(vVar.a, 0, 2, false);
                lVar.v(vVar.D() - 2, false);
                vVar.G(2);
                lVar.j(vVar.a, 0, 2, false);
                this.d = vVar.D();
            }
            if (this.d == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // c3.o
    public final void g(q qVar) {
        this.b = qVar;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            k kVar = this.j;
            kVar.getClass();
            kVar.h(j3, j10);
        }
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, s sVar) {
        String s10;
        n nVar;
        a1 a1Var;
        int i10;
        r3.a aVar;
        long j3;
        int i11 = this.c;
        v vVar = this.a;
        if (i11 == 0) {
            vVar.G(2);
            pVar.readFully(vVar.a, 0, 2);
            int D = vVar.D();
            this.d = D;
            if (D == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((D < 65488 || D > 65497) && D != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            vVar.G(2);
            pVar.readFully(vVar.a, 0, 2);
            this.e = vVar.D() - 2;
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
                    this.i = new n(pVar, this.f);
                }
                k kVar = this.j;
                kVar.getClass();
                int m10 = kVar.m(this.i, sVar);
                if (m10 == 1) {
                    sVar.a += this.f;
                }
                return m10;
            }
            long position = pVar.getPosition();
            long j10 = this.f;
            if (position != j10) {
                sVar.a = j10;
                return 1;
            }
            if (!pVar.j(vVar.a, 0, 1, true)) {
                a();
                return 0;
            }
            pVar.q();
            if (this.j == null) {
                this.j = new k(z3.k.D, 8);
            }
            n nVar2 = new n(pVar, this.f);
            this.i = nVar2;
            if (!this.j.b(nVar2)) {
                a();
                return 0;
            }
            k kVar2 = this.j;
            long j11 = this.f;
            q qVar = this.b;
            qVar.getClass();
            kVar2.g(new n(j11, qVar, 3));
            r3.a aVar2 = this.g;
            aVar2.getClass();
            q qVar2 = this.b;
            qVar2.getClass();
            h0 R1 = qVar2.R1(1024, 4);
            r rVar = new r();
            rVar.p = r0.n("image/jpeg");
            rVar.k = new p0(aVar2);
            g.u(rVar, R1);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            v vVar2 = new v(this.e);
            pVar.readFully(vVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(vVar2.s()) && (s10 = vVar2.s()) != null) {
                long length = pVar.getLength();
                if (length != -1) {
                    try {
                        nVar = e.a(s10);
                    } catch (s0 | NumberFormatException | XmlPullParserException unused) {
                        e2.a.n("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        nVar = null;
                    }
                    if (nVar != null && (i10 = (a1Var = (a1) nVar.c).d) >= 2) {
                        int i12 = i10 - 1;
                        long j12 = -1;
                        long j13 = -1;
                        long j14 = -1;
                        long j15 = -1;
                        boolean z10 = false;
                        while (i12 >= 0) {
                            c cVar = (c) a1Var.get(i12);
                            boolean equals = "video/mp4".equals(cVar.a) | z10;
                            if (i12 == 0) {
                                length -= cVar.d;
                                j3 = 0;
                            } else {
                                j3 = length - cVar.c;
                            }
                            long j16 = j3;
                            long j17 = length;
                            length = j16;
                            if (equals && length != j17) {
                                j15 = j17 - length;
                                j14 = length;
                                equals = false;
                            }
                            if (i12 == 0) {
                                j12 = length;
                                j13 = j17;
                            }
                            i12--;
                            z10 = equals;
                        }
                        if (j14 != -1 && j15 != -1 && j12 != -1 && j13 != -1) {
                            aVar = new r3.a(j12, j13, nVar.b, j14, j15);
                            this.g = aVar;
                            if (aVar != null) {
                                this.f = aVar.d;
                            }
                        }
                    }
                }
                aVar = null;
                this.g = aVar;
                if (aVar != null) {
                }
            }
        } else {
            pVar.r(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // c3.o
    public final void release() {
        k kVar = this.j;
        if (kVar != null) {
            kVar.getClass();
        }
    }

    @Override // c3.o
    public final o c() {
        return this;
    }
}
