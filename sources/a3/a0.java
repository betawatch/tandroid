package a3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a0 {
    public final n a;
    public final e0 b;
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
    public e2.x l = e2.x.a;

    public a0(Context context, n nVar, long j3) {
        this.a = nVar;
        this.c = j3;
        this.b = new e0(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0149, code lost:
    
        if (r4 > 100000) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0155, code lost:
    
        if (r30 >= r34) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x007a, code lost:
    
        if ((r10 == 0 ? false : r7.g[(int) ((r10 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j3, long j10, long j11, long j12, boolean z10, boolean z11, z zVar) {
        long j13;
        long j14;
        long j15;
        boolean z12;
        long j16;
        long j17;
        int i10;
        int i11;
        long j18;
        long j19;
        zVar.a = -9223372036854775807L;
        zVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j10;
        }
        if (this.h != j3) {
            e0 e0Var = this.b;
            j13 = -9223372036854775807L;
            long j20 = e0Var.n;
            if (j20 != -1) {
                e0Var.p = j20;
                e0Var.q = e0Var.o;
            }
            e0Var.m++;
            h hVar = e0Var.a;
            j14 = -1;
            long j21 = j3 * 1000;
            hVar.a.b(j21);
            if (hVar.a.a()) {
                hVar.c = false;
                j15 = 0;
            } else {
                j15 = 0;
                if (hVar.d != -9223372036854775807L) {
                    if (hVar.c) {
                        g gVar = hVar.b;
                        long j22 = gVar.d;
                    }
                    hVar.b.c();
                    hVar.b.b(hVar.d);
                    hVar.c = true;
                    hVar.b.b(j21);
                }
            }
            if (hVar.c && hVar.b.a()) {
                g gVar2 = hVar.a;
                hVar.a = hVar.b;
                hVar.b = gVar2;
                hVar.c = false;
            }
            hVar.d = j21;
            hVar.e = hVar.a.a() ? 0 : hVar.e + 1;
            e0Var.c();
            this.h = j3;
        } else {
            j13 = -9223372036854775807L;
            j14 = -1;
            j15 = 0;
        }
        long j23 = (long) ((j3 - j10) / this.k);
        if (this.d) {
            this.l.getClass();
            j23 -= e2.d0.Q(SystemClock.elapsedRealtime()) - j11;
        }
        zVar.a = j23;
        if (!z10 || z11) {
            if (this.m) {
                if (this.i == j13 || this.j) {
                    int i12 = this.e;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    throw new IllegalStateException();
                                }
                                this.l.getClass();
                                long Q = e2.d0.Q(SystemClock.elapsedRealtime()) - this.g;
                                if (this.d) {
                                    long j24 = this.f;
                                    if (j24 != j13) {
                                        if (j24 != j10) {
                                            if (j23 < -30000) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z12 = true;
                    } else {
                        z12 = this.d;
                    }
                    if (!z12) {
                        return 0;
                    }
                    if (!this.d || j10 == this.f) {
                        return 5;
                    }
                    this.l.getClass();
                    long nanoTime = System.nanoTime();
                    e0 e0Var2 = this.b;
                    long j25 = (zVar.a * 1000) + nanoTime;
                    if (e0Var2.p == j14 || !e0Var2.a.a.a()) {
                        j16 = nanoTime;
                        j17 = -30000;
                        i10 = 3;
                        i11 = 2;
                    } else {
                        h hVar2 = e0Var2.a;
                        if (hVar2.a.a()) {
                            g gVar3 = hVar2.a;
                            long j26 = gVar3.e;
                            j17 = -30000;
                            if (j26 == j15) {
                                j19 = j15;
                                i10 = 3;
                            } else {
                                i10 = 3;
                                j19 = gVar3.f / j26;
                            }
                        } else {
                            j17 = -30000;
                            i10 = 3;
                            j19 = j13;
                        }
                        i11 = 2;
                        j16 = nanoTime;
                        long j27 = e0Var2.q + ((long) (((e0Var2.m - e0Var2.p) * j19) / e0Var2.i));
                        if (Math.abs(j25 - j27) <= 20000000) {
                            j25 = j27;
                        } else {
                            e0Var2.m = j15;
                            long j28 = j14;
                            e0Var2.p = j28;
                            e0Var2.n = j28;
                        }
                    }
                    e0Var2.n = e0Var2.m;
                    e0Var2.o = j25;
                    d0 d0Var = e0Var2.c;
                    if (d0Var != null && e0Var2.k != j13) {
                        long j29 = d0Var.a;
                        if (j29 != j13) {
                            long j30 = e0Var2.k;
                            long j31 = (((j25 - j29) / j30) * j30) + j29;
                            if (j25 <= j31) {
                                j18 = j31 - j30;
                            } else {
                                j18 = j31;
                                j31 = j30 + j31;
                            }
                            if (j31 - j25 >= j25 - j18) {
                                j31 = j18;
                            }
                            j25 = j31 - e0Var2.l;
                        }
                    }
                    zVar.b = j25;
                    long j32 = (j25 - j16) / 1000;
                    zVar.a = j32;
                    boolean z13 = (this.i == j13 || this.j) ? false : true;
                    if (this.a.K0(j32, j10, z11, z13)) {
                        return 4;
                    }
                    long j33 = zVar.a;
                    return (j33 > j17 ? 1 : (j33 == j17 ? 0 : -1)) < 0 && !z11 ? z13 ? i10 : i11 : j33 > 50000 ? 5 : 1;
                }
                z12 = false;
                if (!z12) {
                }
            } else {
                this.n = true;
                if (this.a.K0(j23, j10, z11, true)) {
                    return 4;
                }
                if (!this.d || zVar.a >= 30000) {
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean b(boolean z10) {
        if (z10 && (this.e == 3 || (!this.m && this.n))) {
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
        long j3;
        this.j = z10;
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
        this.g = e2.d0.Q(SystemClock.elapsedRealtime());
        e0 e0Var = this.b;
        e0Var.d = true;
        e0Var.m = 0L;
        e0Var.p = -1L;
        e0Var.n = -1L;
        c0 c0Var = e0Var.b;
        if (c0Var != null) {
            DisplayManager displayManager = c0Var.a;
            d0 d0Var = e0Var.c;
            d0Var.getClass();
            d0Var.b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(c0Var, e2.d0.o(null));
            e0.a(c0Var.b, displayManager.getDisplay(0));
        }
        e0Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.i = -9223372036854775807L;
        e0 e0Var = this.b;
        e0Var.d = false;
        c0 c0Var = e0Var.b;
        if (c0Var != null) {
            c0Var.a.unregisterDisplayListener(c0Var);
            d0 d0Var = e0Var.c;
            d0Var.getClass();
            d0Var.b.sendEmptyMessage(3);
        }
        e0Var.b();
    }

    public final void f(int i10) {
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
    }

    public final void g(float f7) {
        e0 e0Var = this.b;
        e0Var.f = f7;
        h hVar = e0Var.a;
        hVar.a.c();
        hVar.b.c();
        hVar.c = false;
        hVar.d = -9223372036854775807L;
        hVar.e = 0;
        e0Var.c();
    }

    public final void h(Surface surface) {
        this.m = surface != null;
        this.n = false;
        e0 e0Var = this.b;
        if (e0Var.e != surface) {
            e0Var.b();
            e0Var.e = surface;
            e0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void i(float f7) {
        e2.d.b(f7 > 0.0f);
        if (f7 == this.k) {
            return;
        }
        this.k = f7;
        e0 e0Var = this.b;
        e0Var.i = f7;
        e0Var.m = 0L;
        e0Var.p = -1L;
        e0Var.n = -1L;
        e0Var.d(false);
    }
}
