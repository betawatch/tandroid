// default package

import j$.util.Objects;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kw5 implements s84 {
    public u84 b;
    public byte c;
    public int d;
    public int e;
    public hh7 g;
    public vb3 h;
    public vh2 i;
    public sh7 j;
    public final yw7 a = new yw7(2);
    public long f = -1;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        String v;
        vh2 vh2Var;
        y79 y79Var;
        int i;
        hh7 hh7Var;
        long j;
        byte b = this.c;
        long j2 = -1;
        yw7 yw7Var = this.a;
        if (b == 0) {
            yw7Var.K(2);
            ((vb3) t84Var).c(yw7Var.a, 0, 2, false);
            int H = yw7Var.H();
            this.d = H;
            if (H == 65498) {
                if (this.f != -1) {
                    this.c = (byte) 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((H < 65488 || H > 65497) && H != 65281) {
                this.c = (byte) 1;
            }
            return 0;
        }
        if (b == 1) {
            yw7Var.K(2);
            ((vb3) t84Var).d(yw7Var.a, 0, 2, false);
            this.e = yw7Var.H() - 2;
            ((vb3) t84Var).m(2, false);
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 4) {
                if (b != 5) {
                    if (b == 6) {
                        return -1;
                    }
                    rjb.h();
                    return 0;
                }
                if (this.i == null || t84Var != this.h) {
                    vb3 vb3Var = (vb3) t84Var;
                    this.h = vb3Var;
                    this.i = new vh2(vb3Var, this.f);
                }
                sh7 sh7Var = this.j;
                sh7Var.getClass();
                int b2 = sh7Var.b(this.i, u21Var);
                if (b2 == 1) {
                    u21Var.a += this.f;
                }
                return b2;
            }
            long j3 = ((vb3) t84Var).d;
            long j4 = this.f;
            if (j3 != j4) {
                u21Var.a = j4;
                return 1;
            }
            vb3 vb3Var2 = (vb3) t84Var;
            if (!vb3Var2.d(yw7Var.a, 0, 1, true)) {
                g();
                return 0;
            }
            vb3Var2.f = 0;
            if (this.j == null) {
                this.j = new sh7(tcb.B, 8);
            }
            vh2 vh2Var2 = new vh2(vb3Var2, this.f);
            this.i = vh2Var2;
            if (!this.j.c(vh2Var2)) {
                g();
                return 0;
            }
            sh7 sh7Var2 = this.j;
            long j5 = this.f;
            u84 u84Var = this.b;
            u84Var.getClass();
            sh7Var2.f(new vh2(j5, u84Var, (byte) 8));
            hh7 hh7Var2 = this.g;
            hh7Var2.getClass();
            u84 u84Var2 = this.b;
            u84Var2.getClass();
            yzb c0 = u84Var2.c0(1024, 4);
            fo4 fo4Var = new fo4();
            fo4Var.r = wf7.n("image/jpeg");
            fo4Var.l = new nf7(hh7Var2);
            mlb.w(fo4Var, c0);
            this.c = (byte) 5;
            return 0;
        }
        if (this.d == 65505) {
            yw7 yw7Var2 = new yw7(this.e);
            ((vb3) t84Var).c(yw7Var2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(yw7Var2.v()) && (v = yw7Var2.v()) != null) {
                long j6 = ((vb3) t84Var).c;
                if (j6 != -1) {
                    try {
                        vh2Var = tfd.a(v);
                    } catch (bx7 | NumberFormatException | XmlPullParserException unused) {
                        ncd.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        vh2Var = null;
                    }
                    if (vh2Var != null && (i = (y79Var = (y79) vh2Var.c).d) >= 2) {
                        int i2 = i - 1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        long j10 = -1;
                        while (i2 >= 0) {
                            gh7 gh7Var = (gh7) y79Var.get(i2);
                            String str = gh7Var.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            long j11 = j2;
                            if (i2 == 0) {
                                j6 -= gh7Var.d;
                                j = 0;
                            } else {
                                j = j6 - gh7Var.c;
                            }
                            long j12 = j6;
                            j6 = j;
                            if (z && j6 != j12) {
                                j10 = j12 - j6;
                                j9 = j6;
                            }
                            if (i2 == 0) {
                                j8 = j12;
                                j7 = j6;
                            }
                            i2--;
                            j2 = j11;
                        }
                        long j13 = j2;
                        if (j9 != j13 && j10 != j13 && j7 != j13 && j8 != j13) {
                            hh7Var = new hh7(j7, j8, vh2Var.b, j9, j10);
                            this.g = hh7Var;
                            if (hh7Var != null) {
                                this.f = hh7Var.d;
                            }
                        }
                    }
                }
                hh7Var = null;
                this.g = hh7Var;
                if (hh7Var != null) {
                }
            }
        } else {
            ((vb3) t84Var).m(this.e, false);
        }
        this.c = (byte) 0;
        return 0;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        String v;
        yw7 yw7Var = this.a;
        yw7Var.K(2);
        ((vb3) t84Var).d(yw7Var.a, 0, 2, false);
        if (yw7Var.H() == 65496) {
            while (true) {
                vb3 vb3Var = (vb3) t84Var;
                yw7Var.K(2);
                vb3Var.d(yw7Var.a, 0, 2, false);
                int H = yw7Var.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                yw7Var.K(2);
                vb3Var.d(yw7Var.a, 0, 2, false);
                int H2 = yw7Var.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    vb3Var.a(H2, false);
                } else {
                    yw7Var.K(H2);
                    vb3Var.d(yw7Var.a, 0, H2, false);
                    if (Objects.equals(yw7Var.v(), "http://ns.adobe.com/xap/1.0/") && (v = yw7Var.v()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(tfd.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // s84
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            sh7 sh7Var = this.j;
            sh7Var.getClass();
            sh7Var.d(j, j2);
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.b = u84Var;
    }

    public final void g() {
        u84 u84Var = this.b;
        u84Var.getClass();
        u84Var.B();
        this.b.f0(new od0(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override // s84
    public final void release() {
        sh7 sh7Var = this.j;
        if (sh7Var != null) {
            sh7Var.getClass();
        }
    }

    @Override // s84
    public final s84 a() {
        return this;
    }
}
