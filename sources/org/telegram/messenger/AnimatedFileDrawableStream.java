package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class AnimatedFileDrawableStream implements n7 {
    public final int D;
    public int E;
    public boolean F;
    public m7 a;
    public CountDownLatch b;
    public final TLRPC.Document c;
    public final ic d;
    public final Object e;
    public final int f;
    public volatile boolean h;
    public final Object n = new Object();
    public long r;
    public boolean s;
    public final boolean w;
    public boolean x;
    public String y;

    public AnimatedFileDrawableStream(TLRPC.Document document, ic icVar, Object obj, int i10, boolean z10, int i11, int i12) {
        this.c = document;
        this.d = icVar;
        this.e = obj;
        this.f = i10;
        this.w = z10;
        this.D = i11;
        b8 G = b8.G(i10);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m7[] m7VarArr = new m7[1];
        b8.J.c(new t7(G, m7VarArr, document, icVar, obj, i11, this, 0L, z10, i12, countDownLatch));
        b8.a(countDownLatch, true);
        this.a = m7VarArr[0];
    }

    @Override // org.telegram.messenger.n7
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
                        b8.G(this.f).a0(this.c, false, true);
                    }
                }
                Object obj = this.e;
                if (obj instanceof jj) {
                    jj jjVar = (jj) obj;
                    b6 q6 = b6.q(jjVar.I1);
                    int f12 = jjVar.f1();
                    ArrayList arrayList = q6.G;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            z11 = false;
                            break;
                        } else {
                            if (((jj) arrayList.get(i10)).k.id == f12) {
                                z11 = true;
                                break;
                            }
                            i10++;
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
        int i10 = this.f;
        b8.G(i10).f(this.c);
        ic icVar = this.d;
        if (icVar != null) {
            b8.G(i10).e(null, null, null, icVar.f, "mp4", null);
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
    public int read(int i10, int i11) {
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        int i12;
        int i13 = i11;
        synchronized (this.n) {
            try {
                int i14 = 0;
                ?? r22 = 1;
                if (this.h) {
                    int i15 = this.E + 1;
                    this.E = i15;
                    if (!this.F && i15 > 200) {
                        this.F = true;
                        f8.g(new RuntimeException("infinity stream reading!!!"), true);
                    }
                    return 0;
                }
                if (i13 == 0) {
                    return 0;
                }
                long j12 = 0;
                while (j12 == 0) {
                    try {
                        m7 m7Var = this.a;
                        j10 = i10;
                        m7Var.getClass();
                        CountDownLatch countDownLatch = new CountDownLatch(r22);
                        ?? r10 = new long[2];
                        Utilities.d.c(new m9(m7Var, (Serializable) r10, j10, i13, countDownLatch, 2));
                        try {
                            countDownLatch.await();
                        } catch (Exception unused) {
                        }
                        j11 = r10[i14];
                        try {
                            if (!this.x) {
                                try {
                                    if (r10[r22] != 0) {
                                        this.x = r22;
                                        this.y = this.a.L0.getAbsolutePath();
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    z10 = i14;
                                    j12 = j11;
                                }
                            }
                        } catch (Exception e7) {
                            e = e7;
                            j12 = j11;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                    if (j11 == 0) {
                        synchronized (this.n) {
                            try {
                                if (this.h) {
                                    c();
                                    return i14;
                                }
                                this.b = new CountDownLatch(r22);
                                if (this.a.Z || this.r != j10 || this.w) {
                                    b8 G = b8.G(this.f);
                                    TLRPC.Document document = this.c;
                                    ic icVar = this.d;
                                    Object obj = this.e;
                                    boolean z12 = this.w;
                                    int i16 = this.D;
                                    int i17 = document == null ? r22 : i14;
                                    CountDownLatch countDownLatch2 = new CountDownLatch(r22);
                                    int i18 = r22;
                                    m7[] m7VarArr = new m7[i18];
                                    boolean z13 = i18;
                                    i12 = i14;
                                    b8.J.c(new t7(G, m7VarArr, document, icVar, obj, i16, this, j10, z12, i17, countDownLatch2));
                                    b8.a(countDownLatch2, z13);
                                    m7 m7Var2 = m7VarArr[i12];
                                    m7 m7Var3 = this.a;
                                    if (m7Var3 != m7Var2) {
                                        try {
                                            m7Var3.getClass();
                                            Utilities.d.c(new i7(m7Var3, this, 0));
                                            this.a = m7Var2;
                                        } catch (Exception e11) {
                                            e = e11;
                                            j12 = j11;
                                            z10 = i12;
                                        }
                                    }
                                    this.r = j10 + j11;
                                    z11 = z13;
                                } else {
                                    z11 = r22;
                                    i12 = i14;
                                }
                                synchronized (this.n) {
                                    try {
                                        if (this.h) {
                                            this.b = null;
                                            c();
                                            return i12;
                                        }
                                    } finally {
                                    }
                                }
                                if (!this.w) {
                                    b8.G(this.f).c0(this.c, i12, z11);
                                }
                                CountDownLatch countDownLatch3 = this.b;
                                if (countDownLatch3 != null) {
                                    this.s = z11;
                                    countDownLatch3.await();
                                    this.s = false;
                                }
                            } finally {
                            }
                            e = e7;
                            j12 = j11;
                            z10 = 0;
                            f8.g(e, z10);
                            return (int) j12;
                        }
                    }
                    z11 = r22;
                    r22 = z11;
                    j12 = j11;
                    i14 = 0;
                    i13 = i11;
                }
                this.r = i10 + j12;
                return (int) j12;
            } finally {
            }
        }
    }
}
