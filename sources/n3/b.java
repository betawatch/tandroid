package n3;

import a8.ua;
import c4.k;
import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.List;
import org.telegram.ui.Cells.f1;
import org.xmlpull.v1.XmlPullParserException;
import z3.l;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements o {
    public q b;
    public int c;
    public int d;
    public int e;
    public o3.b g;
    public p h;
    public ua i;
    public l j;
    public final x a = new x(2);
    public long f = -1;

    @Override // f3.o
    public final boolean b(p pVar) {
        String v;
        f3.l lVar = (f3.l) pVar;
        x xVar = this.a;
        xVar.K(2);
        lVar.k(xVar.a, 0, 2, false);
        if (xVar.H() == 65496) {
            while (true) {
                xVar.K(2);
                lVar.k(xVar.a, 0, 2, false);
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
                    lVar.k(xVar.a, 0, H2, false);
                    if (Objects.equals(xVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = xVar.v()) != null) {
                        for (int i7 = 0; i7 < 4; i7++) {
                            if (v.contains(d.a[i7] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.b = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            l lVar = this.j;
            lVar.getClass();
            lVar.d(j3, j10);
        }
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        String v;
        ua uaVar;
        t1 t1Var;
        int i7;
        o3.b bVar;
        long j3;
        long j10;
        int i10 = this.c;
        long j11 = -1;
        x xVar = this.a;
        if (i10 == 0) {
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
        if (i10 == 1) {
            xVar.K(2);
            pVar.b(0, 2, xVar.a);
            this.e = xVar.H() - 2;
            pVar.s(2);
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
                    this.i = new ua(pVar, this.f);
                }
                l lVar = this.j;
                lVar.getClass();
                int f10 = lVar.f(this.i, sVar);
                if (f10 == 1) {
                    sVar.a += this.f;
                }
                return f10;
            }
            long position = pVar.getPosition();
            long j12 = this.f;
            if (position != j12) {
                sVar.a = j12;
                return 1;
            }
            if (!pVar.k(xVar.a, 0, 1, true)) {
                g();
                return 0;
            }
            pVar.q();
            if (this.j == null) {
                this.j = new l(k.i, 8);
            }
            ua uaVar2 = new ua(pVar, this.f);
            this.i = uaVar2;
            if (!this.j.b(uaVar2)) {
                g();
                return 0;
            }
            l lVar2 = this.j;
            long j13 = this.f;
            q qVar = this.b;
            qVar.getClass();
            lVar2.c(new ua(j13, qVar, 3));
            o3.b bVar2 = this.g;
            bVar2.getClass();
            q qVar2 = this.b;
            qVar2.getClass();
            j0 O1 = qVar2.O1(1024, 4);
            t tVar = new t();
            tVar.q = s0.n("image/jpeg");
            tVar.k = new q0(bVar2);
            f1.s(tVar, O1);
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
                        uaVar = d.a(v);
                    } catch (t0 | NumberFormatException | XmlPullParserException unused) {
                        h2.a.l("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        uaVar = null;
                    }
                    if (uaVar != null && (i7 = (t1Var = (t1) uaVar.c).d) >= 2) {
                        int i11 = i7 - 1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        while (i11 >= 0) {
                            c cVar = (c) t1Var.get(i11);
                            String str = cVar.a;
                            boolean z9 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i11 == 0) {
                                j3 = j11;
                                length -= cVar.d;
                                j10 = 0;
                            } else {
                                j3 = j11;
                                j10 = length - cVar.c;
                            }
                            long j18 = length;
                            length = j10;
                            if (z9 && length != j18) {
                                j17 = j18 - length;
                                j16 = length;
                            }
                            if (i11 == 0) {
                                j15 = j18;
                                j14 = length;
                            }
                            i11--;
                            j11 = j3;
                        }
                        long j19 = j11;
                        if (j16 != j19 && j17 != j19 && j14 != j19 && j15 != j19) {
                            bVar = new o3.b(j14, j15, uaVar.b, j16, j17);
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
            pVar.s(this.e);
        }
        this.c = 0;
        return 0;
    }

    public final void g() {
        q qVar = this.b;
        qVar.getClass();
        qVar.U0();
        this.b.f(new f3.t(-9223372036854775807L));
        this.c = 6;
    }

    @Override // f3.o
    public final void release() {
        l lVar = this.j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override // f3.o
    public final o a() {
        return this;
    }
}
