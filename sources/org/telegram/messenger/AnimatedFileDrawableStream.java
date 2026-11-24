package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class AnimatedFileDrawableStream implements m94 {
    public final boolean E;
    public int F;
    public boolean G;
    public l94 a;
    public CountDownLatch b;
    public final TLRPC.Document c;
    public final gl5 d;
    public final Object e;
    public final int f;
    public volatile boolean h;
    public final Object n = new Object();
    public long r;
    public boolean s;
    public final boolean w;
    public boolean x;
    public String y;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedFileDrawableStream(TLRPC.Document document, gl5 gl5Var, Object obj, int i, boolean z, int i2, int i3) {
        this.c = document;
        this.d = gl5Var;
        this.e = obj;
        this.f = i;
        this.w = z;
        this.E = i2;
        ba4 G = ba4.G(i);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        l94[] l94VarArr = new l94[1];
        ba4.K.c(new n94(G, l94VarArr, document, gl5Var, obj, i2, this, 0L, z, i3, countDownLatch));
        ba4.a(countDownLatch, true);
        this.a = l94VarArr[0];
    }

    @Override // m94
    public final void a() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.b = null;
        }
    }

    public final void b(boolean z) {
        boolean z2;
        if (this.h) {
            return;
        }
        synchronized (this.n) {
            CountDownLatch countDownLatch = this.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                this.b = null;
                if (z && !this.h && !this.w) {
                    ba4.G(this.f).Z(this.c, false, true);
                }
            }
            Object obj = this.e;
            if (obj instanceof k27) {
                k27 k27Var = (k27) obj;
                up3 q = up3.q(k27Var.K1);
                int e1 = k27Var.e1();
                ArrayList arrayList = q.H;
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        z2 = false;
                        break;
                    } else {
                        if (((k27) arrayList.get(i)).k.id == e1) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    z = false;
                }
            }
            if (z) {
                c();
            }
            this.h = true;
        }
    }

    public final void c() {
        int i = this.f;
        ba4.G(i).f(this.c);
        gl5 gl5Var = this.d;
        if (gl5Var != null) {
            ba4.G(i).e(null, null, null, gl5Var.f, "mp4", null);
        }
    }

    public void cancel() {
        b(true);
    }

    public final void d() {
        synchronized (this.n) {
            this.h = false;
        }
    }

    public String getFinishedFilePath() {
        return this.y;
    }

    public boolean isCanceled() {
        return this.h;
    }

    public boolean isFinishedLoadingFile() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int read(int i, int i2) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        int i3 = i2;
        synchronized (this.n) {
            byte b = 0;
            ?? r2 = 1;
            if (this.h) {
                int i4 = this.F + 1;
                this.F = i4;
                if (!this.G && i4 > 200) {
                    this.G = true;
                    fa4.g(new RuntimeException("infinity stream reading!!!"), true);
                }
                return 0;
            }
            if (i3 == 0) {
                return 0;
            }
            long j3 = 0;
            while (j3 == 0) {
                try {
                    l94 l94Var = this.a;
                    j = i;
                    l94Var.getClass();
                    CountDownLatch countDownLatch = new CountDownLatch(r2);
                    ?? r10 = new long[2];
                    Utilities.d.c(new dt4((Object) l94Var, (Serializable) r10, j, i3, (Object) countDownLatch, (byte) 4));
                    try {
                        countDownLatch.await();
                    } catch (Exception unused) {
                    }
                    j2 = r10[b];
                    try {
                        if (!this.x) {
                            try {
                                if (r10[r2] != 0) {
                                    this.x = r2;
                                    this.y = this.a.L0.getAbsolutePath();
                                }
                            } catch (Exception e) {
                                e = e;
                                z = b;
                                j3 = j2;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        j3 = j2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                if (j2 == 0) {
                    synchronized (this.n) {
                        if (this.h) {
                            c();
                            return b;
                        }
                        this.b = new CountDownLatch(r2);
                        if (this.a.Z || this.r != j || this.w) {
                            ba4 G = ba4.G(this.f);
                            TLRPC.Document document = this.c;
                            gl5 gl5Var = this.d;
                            Object obj = this.e;
                            boolean z3 = this.w;
                            boolean z4 = this.E;
                            byte b2 = document == null ? r2 : b;
                            CountDownLatch countDownLatch2 = new CountDownLatch(r2);
                            int i5 = r2;
                            l94[] l94VarArr = new l94[i5];
                            boolean z5 = i5;
                            byte b3 = b;
                            ba4.K.c(new n94(G, l94VarArr, document, gl5Var, obj, z4 ? 1 : 0, this, j, z3, b2, countDownLatch2));
                            ba4.a(countDownLatch2, z5);
                            l94 l94Var2 = l94VarArr[b3];
                            l94 l94Var3 = this.a;
                            if (l94Var3 != l94Var2) {
                                l94Var3.getClass();
                                Utilities.d.c(new h94(l94Var3, this, b3));
                                this.a = l94Var2;
                            }
                            this.r = j + j2;
                            z2 = z5;
                        } else {
                            z2 = r2;
                        }
                        synchronized (this.n) {
                            if (this.h) {
                                this.b = null;
                                c();
                                return 0;
                            }
                        }
                        if (!this.w) {
                            ba4.G(this.f).b0(this.c, false, z2);
                        }
                        CountDownLatch countDownLatch3 = this.b;
                        if (countDownLatch3 != null) {
                            this.s = z2;
                            countDownLatch3.await();
                            this.s = false;
                        }
                        e = e2;
                        j3 = j2;
                        z = 0;
                        fa4.g(e, z);
                        return (int) j3;
                    }
                }
                z2 = r2;
                r2 = z2;
                j3 = j2;
                b = 0;
                i3 = i2;
            }
            this.r = i + j3;
            return (int) j3;
        }
    }
}
