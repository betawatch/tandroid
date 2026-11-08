package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class AnimatedFileDrawableStream implements j7 {
    public final int D;
    public int E;
    public boolean F;
    public i7 a;
    public CountDownLatch b;
    public final TLRPC.Document c;
    public final hc d;
    public final Object e;
    public final int f;
    public volatile boolean h;
    public final Object n = new Object();
    public long r;
    public boolean s;
    public final boolean w;
    public boolean x;
    public String y;

    public AnimatedFileDrawableStream(TLRPC.Document document, hc hcVar, Object obj, int i7, boolean z9, int i10, int i11) {
        this.c = document;
        this.d = hcVar;
        this.e = obj;
        this.f = i7;
        this.w = z9;
        this.D = i10;
        w7 G = w7.G(i7);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        i7[] i7VarArr = new i7[1];
        w7.J.c(new k7(G, i7VarArr, document, hcVar, obj, i10, this, 0L, z9, i11, countDownLatch));
        w7.a(countDownLatch, true);
        this.a = i7VarArr[0];
    }

    @Override // org.telegram.messenger.j7
    public final void a() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.b = null;
        }
    }

    public final void b(boolean z9) {
        boolean z10;
        if (this.h) {
            return;
        }
        synchronized (this.n) {
            try {
                CountDownLatch countDownLatch = this.b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.b = null;
                    if (z9 && !this.h && !this.w) {
                        w7.G(this.f).Z(this.c, false, true);
                    }
                }
                Object obj = this.e;
                if (obj instanceof ij) {
                    ij ijVar = (ij) obj;
                    z5 q10 = z5.q(ijVar.I1);
                    int f12 = ijVar.f1();
                    ArrayList arrayList = q10.G;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            z10 = false;
                            break;
                        } else {
                            if (((ij) arrayList.get(i7)).k.id == f12) {
                                z10 = true;
                                break;
                            }
                            i7++;
                        }
                    }
                    if (z10) {
                        z9 = false;
                    }
                }
                if (z9) {
                    c();
                }
                this.h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        int i7 = this.f;
        w7.G(i7).f(this.c);
        hc hcVar = this.d;
        if (hcVar != null) {
            w7.G(i7).e(null, null, null, hcVar.f, "mp4", null);
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
    public int read(int i7, int i10) {
        boolean z9;
        long j3;
        long j10;
        boolean z10;
        int i11;
        int i12 = i10;
        synchronized (this.n) {
            try {
                int i13 = 0;
                ?? r22 = 1;
                if (this.h) {
                    int i14 = this.E + 1;
                    this.E = i14;
                    if (!this.F && i14 > 200) {
                        this.F = true;
                        a8.g(new RuntimeException("infinity stream reading!!!"), true);
                    }
                    return 0;
                }
                if (i12 == 0) {
                    return 0;
                }
                long j11 = 0;
                while (j11 == 0) {
                    try {
                        i7 i7Var = this.a;
                        j3 = i7;
                        i7Var.getClass();
                        CountDownLatch countDownLatch = new CountDownLatch(r22);
                        ?? r10 = new long[2];
                        Utilities.d.c(new l9(i7Var, (Serializable) r10, j3, i12, countDownLatch, 2));
                        try {
                            countDownLatch.await();
                        } catch (Exception unused) {
                        }
                        j10 = r10[i13];
                        try {
                            if (!this.x) {
                                try {
                                    if (r10[r22] != 0) {
                                        this.x = r22;
                                        this.y = this.a.L0.getAbsolutePath();
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    z9 = i13;
                                    j11 = j10;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            j11 = j10;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    if (j10 == 0) {
                        synchronized (this.n) {
                            try {
                                if (this.h) {
                                    c();
                                    return i13;
                                }
                                this.b = new CountDownLatch(r22);
                                if (this.a.Z || this.r != j3 || this.w) {
                                    w7 G = w7.G(this.f);
                                    TLRPC.Document document = this.c;
                                    hc hcVar = this.d;
                                    Object obj = this.e;
                                    boolean z11 = this.w;
                                    int i15 = this.D;
                                    int i16 = document == null ? r22 : i13;
                                    CountDownLatch countDownLatch2 = new CountDownLatch(r22);
                                    int i17 = r22;
                                    i7[] i7VarArr = new i7[i17];
                                    boolean z12 = i17;
                                    i11 = i13;
                                    w7.J.c(new k7(G, i7VarArr, document, hcVar, obj, i15, this, j3, z11, i16, countDownLatch2));
                                    w7.a(countDownLatch2, z12);
                                    i7 i7Var2 = i7VarArr[i11];
                                    i7 i7Var3 = this.a;
                                    if (i7Var3 != i7Var2) {
                                        try {
                                            i7Var3.getClass();
                                            Utilities.d.c(new e7(i7Var3, this, 0));
                                            this.a = i7Var2;
                                        } catch (Exception e13) {
                                            e = e13;
                                            j11 = j10;
                                            z9 = i11;
                                        }
                                    }
                                    this.r = j3 + j10;
                                    z10 = z12;
                                } else {
                                    z10 = r22;
                                    i11 = i13;
                                }
                                synchronized (this.n) {
                                    try {
                                        if (this.h) {
                                            this.b = null;
                                            c();
                                            return i11;
                                        }
                                    } finally {
                                    }
                                }
                                if (!this.w) {
                                    w7.G(this.f).b0(this.c, i11, z10);
                                }
                                CountDownLatch countDownLatch3 = this.b;
                                if (countDownLatch3 != null) {
                                    this.s = z10;
                                    countDownLatch3.await();
                                    this.s = false;
                                }
                            } finally {
                            }
                            e = e11;
                            j11 = j10;
                            z9 = 0;
                            a8.g(e, z9);
                            return (int) j11;
                        }
                    }
                    z10 = r22;
                    r22 = z10;
                    j11 = j10;
                    i13 = 0;
                    i12 = i10;
                }
                this.r = i7 + j11;
                return (int) j11;
            } finally {
            }
        }
    }
}
