package m3;

import b4.k;
import b8.ig;
import d2.s0;
import d2.u;
import d2.u0;
import d2.v0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.List;
import org.telegram.ui.Cells.f1;
import org.xmlpull.v1.XmlPullParserException;
import y3.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements o {
    public q b;
    public int c;
    public int d;
    public int e;
    public n3.b g;
    public p h;
    public ig i;
    public m j;
    public final y a = new y(2);
    public long f = -1;

    @Override // e3.o
    public final boolean b(p pVar) {
        String v;
        l lVar = (l) pVar;
        y yVar = this.a;
        yVar.K(2);
        lVar.h(yVar.a, 0, 2, false);
        if (yVar.H() == 65496) {
            while (true) {
                yVar.K(2);
                lVar.h(yVar.a, 0, 2, false);
                int H = yVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                yVar.K(2);
                lVar.c(0, 2, yVar.a);
                int H2 = yVar.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    lVar.w(H2, false);
                } else {
                    yVar.K(H2);
                    lVar.h(yVar.a, 0, H2, false);
                    if (Objects.equals(yVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = yVar.v()) != null) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            if (v.contains(d.a[i3] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.b = qVar;
    }

    @Override // e3.o
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            m mVar = this.j;
            mVar.getClass();
            mVar.d(j10, j11);
        }
    }

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    @Override // e3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        String v;
        ig igVar;
        s1 s1Var;
        int i3;
        n3.b bVar;
        long j10;
        long j11;
        int i10 = this.c;
        long j12 = -1;
        y yVar = this.a;
        if (i10 == 0) {
            yVar.K(2);
            pVar.readFully(yVar.a, 0, 2);
            int H = yVar.H();
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
        if (i10 == 1) {
            yVar.K(2);
            pVar.c(0, 2, yVar.a);
            this.e = yVar.H() - 2;
            pVar.u(2);
            this.c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || pVar != this.h) {
                    this.h = pVar;
                    this.i = new ig(pVar, this.f);
                }
                m mVar = this.j;
                mVar.getClass();
                int f10 = mVar.f(this.i, sVar);
                if (f10 == 1) {
                    sVar.a += this.f;
                }
                return f10;
            }
            long position = pVar.getPosition();
            long j13 = this.f;
            if (position != j13) {
                sVar.a = j13;
                return 1;
            }
            if (!pVar.h(yVar.a, 0, 1, true)) {
                g();
                return 0;
            }
            pVar.o();
            if (this.j == null) {
                this.j = new m(k.g, 8);
            }
            ig igVar2 = new ig(pVar, this.f);
            this.i = igVar2;
            if (!this.j.b(igVar2)) {
                g();
                return 0;
            }
            m mVar2 = this.j;
            long j14 = this.f;
            q qVar = this.b;
            qVar.getClass();
            mVar2.c(new ig(j14, qVar, 2));
            n3.b bVar2 = this.g;
            bVar2.getClass();
            q qVar2 = this.b;
            qVar2.getClass();
            e3.i0 i02 = qVar2.i0(1024, 4);
            u uVar = new u();
            uVar.q = u0.n("image/jpeg");
            uVar.k = new s0(bVar2);
            f1.w(uVar, i02);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            y yVar2 = new y(this.e);
            pVar.readFully(yVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar2.v()) && (v = yVar2.v()) != null) {
                long length = pVar.getLength();
                if (length != -1) {
                    try {
                        igVar = d.a(v);
                    } catch (v0 | NumberFormatException | XmlPullParserException unused) {
                        g2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        igVar = null;
                    }
                    if (igVar != null && (i3 = (s1Var = (s1) igVar.c).d) >= 2) {
                        int i11 = i3 - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        while (i11 >= 0) {
                            c cVar = (c) s1Var.get(i11);
                            String str = cVar.a;
                            boolean z10 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i11 == 0) {
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
                            if (i11 == 0) {
                                j16 = j19;
                                j15 = length;
                            }
                            i11--;
                            j12 = j10;
                        }
                        long j20 = j12;
                        if (j17 != j20 && j18 != j20 && j15 != j20 && j16 != j20) {
                            bVar = new n3.b(j15, j16, igVar.b, j17, j18);
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
            pVar.u(this.e);
        }
        this.c = 0;
        return 0;
    }

    public final void g() {
        q qVar = this.b;
        qVar.getClass();
        qVar.L();
        this.b.f(new t(-9223372036854775807L));
        this.c = 6;
    }

    @Override // e3.o
    public final void release() {
        m mVar = this.j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override // e3.o
    public final o a() {
        return this;
    }
}
