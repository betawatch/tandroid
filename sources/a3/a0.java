package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 {
    public final n a;
    public final f0 b;
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
    public e2.g0 l = e2.g0.a;
    public final boolean o = true;

    public a0(Context context, n nVar, long j10) {
        this.a = nVar;
        this.c = j10;
        this.b = new f0(context);
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
    public final int a(long j10, long j11, long j12, long j13, boolean z10, boolean z11, z zVar) {
        long j14;
        long j15;
        long j16;
        int i10;
        int i11;
        boolean z12;
        int i12;
        long j17;
        int i13;
        long j18;
        long j19;
        long j20;
        float f7;
        float f10;
        long j21;
        zVar.a = -9223372036854775807L;
        zVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j11;
        }
        if (this.h != j10) {
            f0 f0Var = this.b;
            j14 = -9223372036854775807L;
            long j22 = f0Var.n;
            if (j22 != -1) {
                f0Var.q = j22;
                f0Var.r = f0Var.o;
                f0Var.s = f0Var.p;
                f0Var.k = f0Var.l;
            }
            f0Var.m++;
            h hVar = f0Var.a;
            j15 = 1000;
            long j23 = j10 * 1000;
            hVar.a.b(j23);
            if (hVar.a.a()) {
                hVar.c = false;
                j16 = 0;
            } else {
                j16 = 0;
                if (hVar.d != -9223372036854775807L) {
                    if (hVar.c) {
                        g gVar = hVar.b;
                        long j24 = gVar.d;
                    }
                    hVar.b.c();
                    hVar.b.b(hVar.d);
                    hVar.c = true;
                    hVar.b.b(j23);
                }
            }
            if (hVar.c && hVar.b.a()) {
                g gVar2 = hVar.a;
                hVar.a = hVar.b;
                hVar.b = gVar2;
                hVar.c = false;
            }
            hVar.d = j23;
            hVar.e = hVar.a.a() ? 0 : hVar.e + 1;
            f0Var.c();
            this.h = j10;
        } else {
            j14 = -9223372036854775807L;
            j15 = 1000;
            j16 = 0;
        }
        long j25 = (long) ((j10 - j11) / this.k);
        if (this.d) {
            this.l.getClass();
            j25 -= e2.l0.S(SystemClock.elapsedRealtime()) - j12;
        }
        zVar.a = j25;
        if (!z10 || z11) {
            if (this.m || !this.o) {
                if (!this.o) {
                    this.n = true;
                }
                if (this.i == j14 || this.j) {
                    int i14 = this.e;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            i10 = 3;
                            i11 = 5;
                        } else if (i14 == 2) {
                            i10 = 3;
                            i11 = 5;
                        } else {
                            if (i14 != 3) {
                                throw new IllegalStateException();
                            }
                            this.l.getClass();
                            i10 = 3;
                            i11 = 5;
                            long S = e2.l0.S(SystemClock.elapsedRealtime()) - this.g;
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
                        i10 = 3;
                        i11 = 5;
                        z12 = this.d;
                    }
                    if (!z12) {
                        return 0;
                    }
                    if (this.d && j11 != this.f) {
                        this.l.getClass();
                        long nanoTime = System.nanoTime();
                        f0 f0Var2 = this.b;
                        long j27 = (zVar.a * j15) + nanoTime;
                        if (f0Var2.q != -1) {
                            if (f0Var2.a.a.a()) {
                                h hVar2 = f0Var2.a;
                                if (hVar2.a.a()) {
                                    g gVar3 = hVar2.a;
                                    j17 = -30000;
                                    long j28 = gVar3.e;
                                    i12 = 1;
                                    j21 = j28 == j16 ? j16 : gVar3.f / j28;
                                } else {
                                    i12 = 1;
                                    j17 = -30000;
                                    j21 = j14;
                                }
                                i13 = 2;
                                f7 = (f0Var2.m - f0Var2.q) * j21;
                                f10 = f0Var2.i;
                            } else {
                                i12 = 1;
                                j17 = -30000;
                                i13 = 2;
                                f7 = (j10 - f0Var2.s) * j15;
                                f10 = f0Var2.i;
                            }
                            long j29 = f0Var2.r + ((long) (f7 / f10));
                            if (Math.abs(j27 - j29) <= 20000000) {
                                j27 = j29;
                            } else {
                                f0Var2.b();
                            }
                        } else {
                            i12 = 1;
                            j17 = -30000;
                            i13 = 2;
                        }
                        f0Var2.n = f0Var2.m;
                        f0Var2.o = j27;
                        f0Var2.p = j10;
                        c0 c0Var = f0Var2.c;
                        if (c0Var != null) {
                            long j30 = c0Var.c;
                            long j31 = f0Var2.c.d;
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
                                        long j36 = f0Var2.k;
                                        if (j36 != j16) {
                                            f0Var2.l = j36;
                                        } else {
                                            if (j33 < j34) {
                                                j35 = -j35;
                                            }
                                            f0Var2.l = j35;
                                        }
                                    } else {
                                        j19 = j18;
                                        f0Var2.l = j16;
                                    }
                                } else {
                                    j19 = j18;
                                    j20 = j31;
                                    f0Var2.l = f0Var2.k;
                                }
                                if (j33 + f0Var2.l >= j34) {
                                    j32 = j19;
                                }
                                j27 = j32 - ((j20 * 80) / 100);
                            }
                        }
                        zVar.b = j27;
                        long j37 = (j27 - nanoTime) / j15;
                        zVar.a = j37;
                        boolean z13 = (this.i == j14 || this.j) ? 0 : i12;
                        if (this.a.O0(j37, j11, z11, z13)) {
                            return 4;
                        }
                        long j38 = zVar.a;
                        if (((j38 >= j17 || z11) ? 0 : i12) != 0) {
                            return z13 != 0 ? i10 : i13;
                        }
                        if (j38 <= 50000) {
                            return i12;
                        }
                    }
                    return i11;
                }
                i10 = 3;
                i11 = 5;
                z12 = false;
                if (!z12) {
                }
            } else {
                if (this.a.O0(j25, j11, z11, true)) {
                    return 4;
                }
                if (!this.d || zVar.a >= 30000) {
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
        this.g = e2.l0.S(SystemClock.elapsedRealtime());
        f0 f0Var = this.b;
        f0Var.d = true;
        f0Var.b();
        DisplayManager displayManager = (DisplayManager) f0Var.b.getSystemService("display");
        c0 c0Var = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                c0Var = Build.VERSION.SDK_INT >= 33 ? new e0(choreographer, displayManager) : new d0(choreographer, displayManager);
            } catch (RuntimeException e) {
                e2.a.m("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        f0Var.c = c0Var;
        if (c0Var != null) {
            c0Var.a();
        }
        f0Var.d(false);
    }

    public final void e(int i10) {
        if (i10 == 0) {
            this.e = 1;
        } else if (i10 == 1) {
            this.e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f7) {
        f0 f0Var = this.b;
        f0Var.f = f7;
        h hVar = f0Var.a;
        hVar.a.c();
        hVar.b.c();
        hVar.c = false;
        hVar.d = -9223372036854775807L;
        hVar.e = 0;
        f0Var.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        f0 f0Var = this.b;
        if (f0Var.e != surface) {
            f0Var.a();
            f0Var.e = surface;
            f0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f7) {
        t6.f(f7 > 0.0f);
        if (f7 == this.k) {
            return;
        }
        this.k = f7;
        f0 f0Var = this.b;
        f0Var.i = f7;
        f0Var.d(false);
    }
}
