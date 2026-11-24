// default package

import j$.util.Objects;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ku5 implements j74 {
    public l74 b;
    public byte c;
    public int d;
    public int e;
    public ef7 g;
    public ja3 h;
    public hg2 i;
    public pf7 j;
    public final xu7 a = new xu7(2);
    public long f = -1;

    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        String v;
        hg2 hg2Var;
        w59 w59Var;
        int i;
        ef7 ef7Var;
        long j;
        byte b = this.c;
        long j2 = -1;
        xu7 xu7Var = this.a;
        if (b == 0) {
            xu7Var.K(2);
            ((ja3) k74Var).c(xu7Var.a, 0, 2, false);
            int H = xu7Var.H();
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
            xu7Var.K(2);
            ((ja3) k74Var).d(xu7Var.a, 0, 2, false);
            this.e = xu7Var.H() - 2;
            ((ja3) k74Var).l(2, false);
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 4) {
                if (b != 5) {
                    if (b == 6) {
                        return -1;
                    }
                    sdb.a();
                    return 0;
                }
                if (this.i == null || k74Var != this.h) {
                    ja3 ja3Var = (ja3) k74Var;
                    this.h = ja3Var;
                    this.i = new hg2(ja3Var, this.f);
                }
                pf7 pf7Var = this.j;
                pf7Var.getClass();
                int b2 = pf7Var.b(this.i, m11Var);
                if (b2 == 1) {
                    m11Var.a += this.f;
                }
                return b2;
            }
            long j3 = ((ja3) k74Var).d;
            long j4 = this.f;
            if (j3 != j4) {
                m11Var.a = j4;
                return 1;
            }
            ja3 ja3Var2 = (ja3) k74Var;
            if (!ja3Var2.d(xu7Var.a, 0, 1, true)) {
                g();
                return 0;
            }
            ja3Var2.f = 0;
            if (this.j == null) {
                this.j = new pf7(sab.B, 8);
            }
            hg2 hg2Var2 = new hg2(ja3Var2, this.f);
            this.i = hg2Var2;
            if (!this.j.c(hg2Var2)) {
                g();
                return 0;
            }
            pf7 pf7Var2 = this.j;
            long j5 = this.f;
            l74 l74Var = this.b;
            l74Var.getClass();
            pf7Var2.f(new hg2(j5, l74Var, (byte) 7));
            ef7 ef7Var2 = this.g;
            ef7Var2.getClass();
            l74 l74Var2 = this.b;
            l74Var2.getClass();
            wxb S = l74Var2.S(1024, 4);
            em4 em4Var = new em4();
            em4Var.r = ud7.n("image/jpeg");
            em4Var.l = new ld7(ef7Var2);
            yjb.v(em4Var, S);
            this.c = (byte) 5;
            return 0;
        }
        if (this.d == 65505) {
            xu7 xu7Var2 = new xu7(this.e);
            ((ja3) k74Var).c(xu7Var2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(xu7Var2.v()) && (v = xu7Var2.v()) != null) {
                long j6 = ((ja3) k74Var).c;
                if (j6 != -1) {
                    try {
                        hg2Var = rdd.a(v);
                    } catch (av7 | NumberFormatException | XmlPullParserException unused) {
                        lad.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        hg2Var = null;
                    }
                    if (hg2Var != null && (i = (w59Var = (w59) hg2Var.c).d) >= 2) {
                        int i2 = i - 1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        long j10 = -1;
                        while (i2 >= 0) {
                            df7 df7Var = (df7) w59Var.get(i2);
                            String str = df7Var.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            long j11 = j2;
                            if (i2 == 0) {
                                j6 -= df7Var.d;
                                j = 0;
                            } else {
                                j = j6 - df7Var.c;
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
                            ef7Var = new ef7(j7, j8, hg2Var.b, j9, j10);
                            this.g = ef7Var;
                            if (ef7Var != null) {
                                this.f = ef7Var.d;
                            }
                        }
                    }
                }
                ef7Var = null;
                this.g = ef7Var;
                if (ef7Var != null) {
                }
            }
        } else {
            ((ja3) k74Var).l(this.e, false);
        }
        this.c = (byte) 0;
        return 0;
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        String v;
        xu7 xu7Var = this.a;
        xu7Var.K(2);
        ((ja3) k74Var).d(xu7Var.a, 0, 2, false);
        if (xu7Var.H() == 65496) {
            while (true) {
                ja3 ja3Var = (ja3) k74Var;
                xu7Var.K(2);
                ja3Var.d(xu7Var.a, 0, 2, false);
                int H = xu7Var.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xu7Var.K(2);
                ja3Var.d(xu7Var.a, 0, 2, false);
                int H2 = xu7Var.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    ja3Var.a(H2, false);
                } else {
                    xu7Var.K(H2);
                    ja3Var.d(xu7Var.a, 0, H2, false);
                    if (Objects.equals(xu7Var.v(), "http://ns.adobe.com/xap/1.0/") && (v = xu7Var.v()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(rdd.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // j74
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            pf7 pf7Var = this.j;
            pf7Var.getClass();
            pf7Var.d(j, j2);
        }
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.b = l74Var;
    }

    public final void g() {
        l74 l74Var = this.b;
        l74Var.getClass();
        l74Var.z();
        this.b.g0(new oc0(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override // j74
    public final void release() {
        pf7 pf7Var = this.j;
        if (pf7Var != null) {
            pf7Var.getClass();
        }
    }

    @Override // j74
    public final j74 a() {
        return this;
    }
}
