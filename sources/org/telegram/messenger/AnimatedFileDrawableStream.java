package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class AnimatedFileDrawableStream implements ib4 {
    public final boolean E;
    public int F;
    public boolean G;
    public hb4 a;
    public CountDownLatch b;
    public final TLRPC.Document c;
    public final jn5 d;
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
    public AnimatedFileDrawableStream(TLRPC.Document document, jn5 jn5Var, Object obj, int i, boolean z, int i2, int i3) {
        this.c = document;
        this.d = jn5Var;
        this.e = obj;
        this.f = i;
        this.w = z;
        this.E = i2;
        xb4 G = xb4.G(i);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hb4[] hb4VarArr = new hb4[1];
        xb4.K.c(new jb4(G, hb4VarArr, document, jn5Var, obj, i2, this, 0L, z, i3, countDownLatch));
        xb4.a(countDownLatch, true);
        this.a = hb4VarArr[0];
    }

    @Override // ib4
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
                    xb4.G(this.f).Z(this.c, false, true);
                }
            }
            Object obj = this.e;
            if (obj instanceof r47) {
                r47 r47Var = (r47) obj;
                lq3 q = lq3.q(r47Var.K1);
                int e1 = r47Var.e1();
                ArrayList arrayList = q.H;
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        z2 = false;
                        break;
                    } else {
                        if (((r47) arrayList.get(i)).k.id == e1) {
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
        xb4.G(i).f(this.c);
        jn5 jn5Var = this.d;
        if (jn5Var != null) {
            xb4.G(i).e(null, null, null, jn5Var.f, "mp4", null);
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
    /* JADX WARN: Type inference failed for: r2v5 */
    public int read(int i, int i2) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        int i3;
        int i4 = i2;
        synchronized (this.n) {
            int i5 = 0;
            ?? r2 = 1;
            if (this.h) {
                int i6 = this.F + 1;
                this.F = i6;
                if (!this.G && i6 > 200) {
                    this.G = true;
                    cc4.g(new RuntimeException("infinity stream reading!!!"), true);
                }
                return 0;
            }
            if (i4 == 0) {
                return 0;
            }
            long j3 = 0;
            while (j3 == 0) {
                try {
                    hb4 hb4Var = this.a;
                    j = i;
                    hb4Var.getClass();
                    CountDownLatch countDownLatch = new CountDownLatch(r2);
                    ?? r10 = new long[2];
                    Utilities.d.c(new hv4((Object) hb4Var, (Serializable) r10, j, i4, (Object) countDownLatch, (byte) 4));
                    try {
                        countDownLatch.await();
                    } catch (Exception unused) {
                    }
                    j2 = r10[i5];
                    try {
                        if (!this.x) {
                            try {
                                if (r10[r2] != 0) {
                                    this.x = r2;
                                    this.y = this.a.L0.getAbsolutePath();
                                }
                            } catch (Exception e) {
                                e = e;
                                z = i5;
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
                            return i5;
                        }
                        this.b = new CountDownLatch(r2);
                        if (this.a.Z || this.r != j || this.w) {
                            xb4 G = xb4.G(this.f);
                            TLRPC.Document document = this.c;
                            jn5 jn5Var = this.d;
                            Object obj = this.e;
                            boolean z3 = this.w;
                            boolean z4 = this.E;
                            int i7 = document == null ? r2 : i5;
                            CountDownLatch countDownLatch2 = new CountDownLatch(r2);
                            int i8 = r2;
                            hb4[] hb4VarArr = new hb4[i8];
                            boolean z5 = i8;
                            i3 = i5;
                            xb4.K.c(new jb4(G, hb4VarArr, document, jn5Var, obj, z4 ? 1 : 0, this, j, z3, i7, countDownLatch2));
                            xb4.a(countDownLatch2, z5);
                            hb4 hb4Var2 = hb4VarArr[i3];
                            hb4 hb4Var3 = this.a;
                            if (hb4Var3 != hb4Var2) {
                                try {
                                    hb4Var3.getClass();
                                    Utilities.d.c(new ya4(hb4Var3, this, z5 ? (byte) 1 : (byte) 0));
                                    this.a = hb4Var2;
                                } catch (Exception e4) {
                                    e = e4;
                                    j3 = j2;
                                    z = i3;
                                }
                            }
                            this.r = j + j2;
                            z2 = z5;
                        } else {
                            z2 = r2;
                            i3 = i5;
                        }
                        synchronized (this.n) {
                            if (this.h) {
                                this.b = null;
                                c();
                                return i3;
                            }
                        }
                        if (!this.w) {
                            xb4.G(this.f).b0(this.c, i3, z2);
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
                        cc4.g(e, z);
                        return (int) j3;
                    }
                }
                z2 = r2;
                r2 = z2;
                j3 = j2;
                i5 = 0;
                i4 = i2;
            }
            this.r = i + j3;
            return (int) j3;
        }
    }
}
