package c3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import b8.zb;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y {
    public final l a;
    public final d0 b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public g2.h0 l = g2.h0.a;
    public final boolean o = true;

    public y(Context context, l lVar, long j10) {
        this.a = lVar;
        this.c = j10;
        this.b = new d0(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0164, code lost:
    
        if (r3 > 100000) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0174, code lost:
    
        if (r33 >= r37) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0080, code lost:
    
        if ((r9 == 0 ? false : r7.g[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, x xVar) {
        long j14;
        long j15;
        long j16;
        int i3;
        int i10;
        boolean z12;
        int i11;
        long j17;
        int i12;
        long j18;
        long j19;
        long j20;
        float f10;
        float f11;
        long j21;
        xVar.a = -9223372036854775807L;
        xVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j11;
        }
        if (this.h != j10) {
            d0 d0Var = this.b;
            j14 = -9223372036854775807L;
            long j22 = d0Var.n;
            if (j22 != -1) {
                d0Var.q = j22;
                d0Var.r = d0Var.o;
                d0Var.s = d0Var.p;
                d0Var.k = d0Var.l;
            }
            d0Var.m++;
            g gVar = d0Var.a;
            j15 = 1000;
            long j23 = j10 * 1000;
            gVar.a.b(j23);
            if (gVar.a.a()) {
                gVar.c = false;
                j16 = 0;
            } else {
                j16 = 0;
                if (gVar.d != -9223372036854775807L) {
                    if (gVar.c) {
                        f fVar = gVar.b;
                        long j24 = fVar.d;
                    }
                    gVar.b.c();
                    gVar.b.b(gVar.d);
                    gVar.c = true;
                    gVar.b.b(j23);
                }
            }
            if (gVar.c && gVar.b.a()) {
                f fVar2 = gVar.a;
                gVar.a = gVar.b;
                gVar.b = fVar2;
                gVar.c = false;
            }
            gVar.d = j23;
            gVar.e = gVar.a.a() ? 0 : gVar.e + 1;
            d0Var.c();
            this.h = j10;
        } else {
            j14 = -9223372036854775807L;
            j15 = 1000;
            j16 = 0;
        }
        long j25 = (long) ((j10 - j11) / this.k);
        if (this.d) {
            this.l.getClass();
            j25 -= n0.S(SystemClock.elapsedRealtime()) - j12;
        }
        xVar.a = j25;
        if (!z10 || z11) {
            if (this.m || !this.o) {
                if (!this.o) {
                    this.n = true;
                }
                if (this.i == j14 || this.j) {
                    int i13 = this.e;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            i3 = 3;
                            i10 = 5;
                        } else if (i13 == 2) {
                            i3 = 3;
                            i10 = 5;
                        } else {
                            if (i13 != 3) {
                                throw new IllegalStateException();
                            }
                            this.l.getClass();
                            i3 = 3;
                            i10 = 5;
                            long S = n0.S(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j26 = this.f;
                                if (j26 != j14) {
                                    if (j26 != j11) {
                                        if (j25 < -30000) {
                                        }
                                    }
                                }
                            }
                        }
                        z12 = true;
                    } else {
                        i3 = 3;
                        i10 = 5;
                        z12 = this.d;
                    }
                    if (!z12) {
                        return 0;
                    }
                    if (this.d && j11 != this.f) {
                        this.l.getClass();
                        long nanoTime = System.nanoTime();
                        d0 d0Var2 = this.b;
                        long j27 = (xVar.a * j15) + nanoTime;
                        if (d0Var2.q != -1) {
                            if (d0Var2.a.a.a()) {
                                g gVar2 = d0Var2.a;
                                if (gVar2.a.a()) {
                                    f fVar3 = gVar2.a;
                                    j17 = -30000;
                                    long j28 = fVar3.e;
                                    i11 = 1;
                                    j21 = j28 == j16 ? j16 : fVar3.f / j28;
                                } else {
                                    i11 = 1;
                                    j17 = -30000;
                                    j21 = j14;
                                }
                                i12 = 2;
                                f10 = (d0Var2.m - d0Var2.q) * j21;
                                f11 = d0Var2.i;
                            } else {
                                i11 = 1;
                                j17 = -30000;
                                i12 = 2;
                                f10 = (j10 - d0Var2.s) * j15;
                                f11 = d0Var2.i;
                            }
                            long j29 = d0Var2.r + ((long) (f10 / f11));
                            if (Math.abs(j27 - j29) <= 20000000) {
                                j27 = j29;
                            } else {
                                d0Var2.b();
                            }
                        } else {
                            i11 = 1;
                            j17 = -30000;
                            i12 = 2;
                        }
                        d0Var2.n = d0Var2.m;
                        d0Var2.o = j27;
                        d0Var2.p = j10;
                        a0 a0Var = d0Var2.c;
                        if (a0Var != null) {
                            long j30 = a0Var.c;
                            long j31 = d0Var2.c.d;
                            if (j30 != j14 && j31 != j14) {
                                long j32 = (((j27 - j30) / j31) * j31) + j30;
                                if (j27 <= j32) {
                                    j18 = j32 - j31;
                                } else {
                                    j32 += j31;
                                    j18 = j32;
                                }
                                long j33 = j32 - j27;
                                long j34 = j27 - j18;
                                long abs = Math.abs(j33 - j34);
                                if (abs < j31 / 2) {
                                    j20 = j31;
                                    long j35 = j20 / 4;
                                    if (abs < j35) {
                                        j19 = j18;
                                        long j36 = d0Var2.k;
                                        if (j36 != j16) {
                                            d0Var2.l = j36;
                                        } else {
                                            if (j33 < j34) {
                                                j35 = -j35;
                                            }
                                            d0Var2.l = j35;
                                        }
                                    } else {
                                        j19 = j18;
                                        d0Var2.l = j16;
                                    }
                                } else {
                                    j19 = j18;
                                    j20 = j31;
                                    d0Var2.l = d0Var2.k;
                                }
                                if (j33 + d0Var2.l >= j34) {
                                    j32 = j19;
                                }
                                j27 = j32 - ((j20 * 80) / 100);
                            }
                        }
                        xVar.b = j27;
                        long j37 = (j27 - nanoTime) / j15;
                        xVar.a = j37;
                        boolean z13 = (this.i == j14 || this.j) ? 0 : i11;
                        if (this.a.O0(j37, j11, z11, z13)) {
                            return 4;
                        }
                        long j38 = xVar.a;
                        if (((j38 >= j17 || z11) ? 0 : i11) != 0) {
                            return z13 != 0 ? i3 : i12;
                        }
                        if (j38 <= 50000) {
                            return i11;
                        }
                    }
                    return i10;
                }
                i3 = 3;
                i10 = 5;
                z12 = false;
                if (!z12) {
                }
            } else {
                if (this.a.O0(j25, j11, z11, true)) {
                    return 4;
                }
                if (!this.d || xVar.a >= 30000) {
                    this.n = true;
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.e == 3 || (this.n && (!this.m || !this.o)))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z10) {
        long j10;
        this.j = z10;
        long j11 = this.c;
        if (j11 > 0) {
            this.l.getClass();
            j10 = SystemClock.elapsedRealtime() + j11;
        } else {
            j10 = -9223372036854775807L;
        }
        this.i = j10;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = n0.S(SystemClock.elapsedRealtime());
        d0 d0Var = this.b;
        d0Var.d = true;
        d0Var.b();
        DisplayManager displayManager = (DisplayManager) d0Var.b.getSystemService("display");
        a0 a0Var = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                a0Var = Build.VERSION.SDK_INT >= 33 ? new c0(choreographer, displayManager) : new b0(choreographer, displayManager);
            } catch (RuntimeException e10) {
                g2.a.m("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        d0Var.c = a0Var;
        if (a0Var != null) {
            a0Var.a();
        }
        d0Var.d(false);
    }

    public final void e(int i3) {
        if (i3 == 0) {
            this.e = 1;
        } else if (i3 == 1) {
            this.e = 0;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException();
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f10) {
        d0 d0Var = this.b;
        d0Var.f = f10;
        g gVar = d0Var.a;
        gVar.a.c();
        gVar.b.c();
        gVar.c = false;
        gVar.d = -9223372036854775807L;
        gVar.e = 0;
        d0Var.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        d0 d0Var = this.b;
        if (d0Var.e != surface) {
            d0Var.a();
            d0Var.e = surface;
            d0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f10) {
        zb.f(f10 > 0.0f);
        if (f10 == this.k) {
            return;
        }
        this.k = f10;
        d0 d0Var = this.b;
        d0Var.i = f10;
        d0Var.d(false);
    }
}
