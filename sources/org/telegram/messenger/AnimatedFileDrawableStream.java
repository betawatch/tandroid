package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class AnimatedFileDrawableStream implements j7 {
    public final int E;
    public int F;
    public boolean G;
    public i7 a;
    public CountDownLatch b;
    public final TLRPC.Document c;
    public final ac d;
    public final Object e;
    public final int f;
    public volatile boolean h;
    public final Object n = new Object();
    public long r;
    public boolean s;
    public final boolean w;
    public boolean x;
    public String y;

    public AnimatedFileDrawableStream(TLRPC.Document document, ac acVar, Object obj, int i3, boolean z10, int i10, int i11) {
        this.c = document;
        this.d = acVar;
        this.e = obj;
        this.f = i3;
        this.w = z10;
        this.E = i10;
        w7 G = w7.G(i3);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        i7[] i7VarArr = new i7[1];
        w7.K.c(new o7(G, i7VarArr, document, acVar, obj, i10, this, 0L, z10, i11, countDownLatch));
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

    public final void b(boolean z10) {
        boolean z11;
        if (this.h) {
            return;
        }
        synchronized (this.n) {
            try {
                CountDownLatch countDownLatch = this.b;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.b = null;
                    if (z10 && !this.h && !this.w) {
                        w7.G(this.f).a0(this.c, false, true);
                    }
                }
                Object obj = this.e;
                if (obj instanceof zi) {
                    zi ziVar = (zi) obj;
                    z5 q10 = z5.q(ziVar.I1);
                    int f12 = ziVar.f1();
                    ArrayList arrayList = q10.H;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (((zi) arrayList.get(i3)).k.id == f12) {
                                z11 = true;
                                break;
                            }
                            i3++;
                        }
                    }
                    if (z11) {
                        z10 = false;
                    }
                }
                if (z10) {
                    c();
                }
                this.h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        int i3 = this.f;
        w7.G(i3).f(this.c);
        ac acVar = this.d;
        if (acVar != null) {
            w7.G(i3).e(null, null, null, acVar.f, "mp4", null);
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
    public int read(int i3, int i10) {
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        int i11;
        int i12 = i10;
        synchronized (this.n) {
            try {
                int i13 = 0;
                ?? r22 = 1;
                if (this.h) {
                    int i14 = this.F + 1;
                    this.F = i14;
                    if (!this.G && i14 > 200) {
                        this.G = true;
                        a8.g(new RuntimeException("infinity stream reading!!!"), true);
                    }
                    return 0;
                }
                if (i12 == 0) {
                    return 0;
                }
                long j12 = 0;
                while (j12 == 0) {
                    try {
                        i7 i7Var = this.a;
                        j10 = i3;
                        i7Var.getClass();
                        CountDownLatch countDownLatch = new CountDownLatch(r22);
                        ?? r10 = new long[2];
                        Utilities.d.c(new f9(i7Var, (Serializable) r10, j10, i12, countDownLatch, 2));
                        try {
                            countDownLatch.await();
                        } catch (Exception unused) {
                        }
                        j11 = r10[i13];
                        try {
                            if (!this.x) {
                                try {
                                    if (r10[r22] != 0) {
                                        this.x = r22;
                                        this.y = this.a.L0.getAbsolutePath();
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    z10 = i13;
                                    j12 = j11;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            j12 = j11;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    if (j11 == 0) {
                        synchronized (this.n) {
                            try {
                                if (this.h) {
                                    c();
                                    return i13;
                                }
                                this.b = new CountDownLatch(r22);
                                if (this.a.Z || this.r != j10 || this.w) {
                                    w7 G = w7.G(this.f);
                                    TLRPC.Document document = this.c;
                                    ac acVar = this.d;
                                    Object obj = this.e;
                                    boolean z12 = this.w;
                                    int i15 = this.E;
                                    int i16 = document == null ? r22 : i13;
                                    CountDownLatch countDownLatch2 = new CountDownLatch(r22);
                                    int i17 = r22;
                                    i7[] i7VarArr = new i7[i17];
                                    boolean z13 = i17;
                                    i11 = i13;
                                    w7.K.c(new o7(G, i7VarArr, document, acVar, obj, i15, this, j10, z12, i16, countDownLatch2));
                                    w7.a(countDownLatch2, z13);
                                    i7 i7Var2 = i7VarArr[i11];
                                    i7 i7Var3 = this.a;
                                    if (i7Var3 != i7Var2) {
                                        try {
                                            i7Var3.getClass();
                                            Utilities.d.c(new e7(i7Var3, this, 0));
                                            this.a = i7Var2;
                                        } catch (Exception e13) {
                                            e = e13;
                                            j12 = j11;
                                            z10 = i11;
                                        }
                                    }
                                    this.r = j10 + j11;
                                    z11 = z13;
                                } else {
                                    z11 = r22;
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
                                    w7.G(this.f).c0(this.c, i11, z11);
                                }
                                CountDownLatch countDownLatch3 = this.b;
                                if (countDownLatch3 != null) {
                                    this.s = z11;
                                    countDownLatch3.await();
                                    this.s = false;
                                }
                            } finally {
                            }
                            e = e11;
                            j12 = j11;
                            z10 = 0;
                            a8.g(e, z10);
                            return (int) j12;
                        }
                    }
                    z11 = r22;
                    r22 = z11;
                    j12 = j11;
                    i13 = 0;
                    i12 = i10;
                }
                this.r = i3 + j12;
                return (int) j12;
            } finally {
            }
        }
    }
}
