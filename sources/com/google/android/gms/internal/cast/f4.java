package com.google.android.gms.internal.cast;

import android.media.MediaCodec;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f4 {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern a() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ void b() {
        if (Build.VERSION.SDK_INT <= 23 || ForkJoinPool.commonPool() != null) {
            throw null;
        }
    }

    public static void c(j4 j4Var) {
        boolean isTerminated;
        ExecutorService executorService = j4Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || j4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            j4Var.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        j4Var.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void d(n4 n4Var) {
        boolean isTerminated;
        ExecutorService executorService = n4Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || n4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            n4Var.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        n4Var.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void e(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        executorService.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void f(m9.a0 a0Var) {
        boolean isTerminated;
        ExecutorService executorService = a0Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || a0Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            a0Var.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        a0Var.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void g(m9.d0 d0Var) {
        boolean isTerminated;
        ExecutorService executorService = d0Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || d0Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            d0Var.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        d0Var.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h(of.a aVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || aVar != ForkJoinPool.commonPool()) && !(isTerminated = aVar.isTerminated())) {
            aVar.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = aVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        aVar.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(v9.f fVar) {
        if ((Build.VERSION.SDK_INT <= 23 || fVar != ForkJoinPool.commonPool()) && !fVar.a.isTerminated()) {
            fVar.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void j(w7.m mVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || mVar != ForkJoinPool.commonPool()) && !(isTerminated = mVar.isTerminated())) {
            mVar.shutdown();
            boolean z9 = false;
            while (!isTerminated) {
                try {
                    isTerminated = mVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z9) {
                        mVar.shutdownNow();
                        z9 = true;
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
