package d3;

import a8.ia;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import h2.m0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
    public h2.g0 l = h2.g0.a;
    public final boolean o = true;

    public y(Context context, l lVar, long j3) {
        this.a = lVar;
        this.c = j3;
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
    public final int a(long j3, long j10, long j11, long j12, boolean z9, boolean z10, x xVar) {
        long j13;
        long j14;
        long j15;
        int i7;
        int i10;
        boolean z11;
        int i11;
        long j16;
        int i12;
        long j17;
        long j18;
        long j19;
        float f10;
        float f11;
        long j20;
        xVar.a = -9223372036854775807L;
        xVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j10;
        }
        if (this.h != j3) {
            d0 d0Var = this.b;
            j13 = -9223372036854775807L;
            long j21 = d0Var.n;
            if (j21 != -1) {
                d0Var.q = j21;
                d0Var.r = d0Var.o;
                d0Var.s = d0Var.p;
                d0Var.k = d0Var.l;
            }
            d0Var.m++;
            g gVar = d0Var.a;
            j14 = 1000;
            long j22 = j3 * 1000;
            gVar.a.b(j22);
            if (gVar.a.a()) {
                gVar.c = false;
                j15 = 0;
            } else {
                j15 = 0;
                if (gVar.d != -9223372036854775807L) {
                    if (gVar.c) {
                        f fVar = gVar.b;
                        long j23 = fVar.d;
                    }
                    gVar.b.c();
                    gVar.b.b(gVar.d);
                    gVar.c = true;
                    gVar.b.b(j22);
                }
            }
            if (gVar.c && gVar.b.a()) {
                f fVar2 = gVar.a;
                gVar.a = gVar.b;
                gVar.b = fVar2;
                gVar.c = false;
            }
            gVar.d = j22;
            gVar.e = gVar.a.a() ? 0 : gVar.e + 1;
            d0Var.c();
            this.h = j3;
        } else {
            j13 = -9223372036854775807L;
            j14 = 1000;
            j15 = 0;
        }
        long j24 = (long) ((j3 - j10) / this.k);
        if (this.d) {
            this.l.getClass();
            j24 -= m0.S(SystemClock.elapsedRealtime()) - j11;
        }
        xVar.a = j24;
        if (!z9 || z10) {
            if (this.m || !this.o) {
                if (!this.o) {
                    this.n = true;
                }
                if (this.i == j13 || this.j) {
                    int i13 = this.e;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            i7 = 3;
                            i10 = 5;
                        } else if (i13 == 2) {
                            i7 = 3;
                            i10 = 5;
                        } else {
                            if (i13 != 3) {
                                throw new IllegalStateException();
                            }
                            this.l.getClass();
                            i7 = 3;
                            i10 = 5;
                            long S = m0.S(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j25 = this.f;
                                if (j25 != j13) {
                                    if (j25 != j10) {
                                        if (j24 < -30000) {
                                        }
                                    }
                                }
                            }
                        }
                        z11 = true;
                    } else {
                        i7 = 3;
                        i10 = 5;
                        z11 = this.d;
                    }
                    if (!z11) {
                        return 0;
                    }
                    if (this.d && j10 != this.f) {
                        this.l.getClass();
                        long nanoTime = System.nanoTime();
                        d0 d0Var2 = this.b;
                        long j26 = (xVar.a * j14) + nanoTime;
                        if (d0Var2.q != -1) {
                            if (d0Var2.a.a.a()) {
                                g gVar2 = d0Var2.a;
                                if (gVar2.a.a()) {
                                    f fVar3 = gVar2.a;
                                    j16 = -30000;
                                    long j27 = fVar3.e;
                                    i11 = 1;
                                    j20 = j27 == j15 ? j15 : fVar3.f / j27;
                                } else {
                                    i11 = 1;
                                    j16 = -30000;
                                    j20 = j13;
                                }
                                i12 = 2;
                                f10 = (d0Var2.m - d0Var2.q) * j20;
                                f11 = d0Var2.i;
                            } else {
                                i11 = 1;
                                j16 = -30000;
                                i12 = 2;
                                f10 = (j3 - d0Var2.s) * j14;
                                f11 = d0Var2.i;
                            }
                            long j28 = d0Var2.r + ((long) (f10 / f11));
                            if (Math.abs(j26 - j28) <= 20000000) {
                                j26 = j28;
                            } else {
                                d0Var2.b();
                            }
                        } else {
                            i11 = 1;
                            j16 = -30000;
                            i12 = 2;
                        }
                        d0Var2.n = d0Var2.m;
                        d0Var2.o = j26;
                        d0Var2.p = j3;
                        a0 a0Var = d0Var2.c;
                        if (a0Var != null) {
                            long j29 = a0Var.c;
                            long j30 = d0Var2.c.d;
                            if (j29 != j13 && j30 != j13) {
                                long j31 = (((j26 - j29) / j30) * j30) + j29;
                                if (j26 <= j31) {
                                    j17 = j31 - j30;
                                } else {
                                    j31 += j30;
                                    j17 = j31;
                                }
                                long j32 = j31 - j26;
                                long j33 = j26 - j17;
                                long abs = Math.abs(j32 - j33);
                                if (abs < j30 / 2) {
                                    j19 = j30;
                                    long j34 = j19 / 4;
                                    if (abs < j34) {
                                        j18 = j17;
                                        long j35 = d0Var2.k;
                                        if (j35 != j15) {
                                            d0Var2.l = j35;
                                        } else {
                                            if (j32 < j33) {
                                                j34 = -j34;
                                            }
                                            d0Var2.l = j34;
                                        }
                                    } else {
                                        j18 = j17;
                                        d0Var2.l = j15;
                                    }
                                } else {
                                    j18 = j17;
                                    j19 = j30;
                                    d0Var2.l = d0Var2.k;
                                }
                                if (j32 + d0Var2.l >= j33) {
                                    j31 = j18;
                                }
                                j26 = j31 - ((j19 * 80) / 100);
                            }
                        }
                        xVar.b = j26;
                        long j36 = (j26 - nanoTime) / j14;
                        xVar.a = j36;
                        boolean z12 = (this.i == j13 || this.j) ? 0 : i11;
                        if (this.a.O0(j36, j10, z10, z12)) {
                            return 4;
                        }
                        long j37 = xVar.a;
                        if (((j37 >= j16 || z10) ? 0 : i11) != 0) {
                            return z12 != 0 ? i7 : i12;
                        }
                        if (j37 <= 50000) {
                            return i11;
                        }
                    }
                    return i10;
                }
                i7 = 3;
                i10 = 5;
                z11 = false;
                if (!z11) {
                }
            } else {
                if (this.a.O0(j24, j10, z10, true)) {
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

    public final boolean b(boolean z9) {
        if (z9 && (this.e == 3 || (this.n && (!this.m || !this.o)))) {
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

    public final void c(boolean z9) {
        long j3;
        this.j = z9;
        long j10 = this.c;
        if (j10 > 0) {
            this.l.getClass();
            j3 = SystemClock.elapsedRealtime() + j10;
        } else {
            j3 = -9223372036854775807L;
        }
        this.i = j3;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = m0.S(SystemClock.elapsedRealtime());
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
                h2.a.m("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }
        d0Var.c = a0Var;
        if (a0Var != null) {
            a0Var.a();
        }
        d0Var.d(false);
    }

    public final void e(int i7) {
        if (i7 == 0) {
            this.e = 1;
        } else if (i7 == 1) {
            this.e = 0;
        } else {
            if (i7 != 2) {
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
        ia.f(f10 > 0.0f);
        if (f10 == this.k) {
            return;
        }
        this.k = f10;
        d0 d0Var = this.b;
        d0Var.i = f10;
        d0Var.d(false);
    }
}
