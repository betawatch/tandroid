package com.google.android.gms.internal.cast;

import android.media.MediaCodec;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        j4Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void d(n4 n4Var) {
        boolean isTerminated;
        ExecutorService executorService = n4Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || n4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            n4Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        n4Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void e(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        executorService.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void f(jf.a aVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || aVar != ForkJoinPool.commonPool()) && !(isTerminated = aVar.isTerminated())) {
            aVar.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = aVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        aVar.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void g(k9.a0 a0Var) {
        boolean isTerminated;
        ExecutorService executorService = a0Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || a0Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            a0Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        a0Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void h(k9.d0 d0Var) {
        boolean isTerminated;
        ExecutorService executorService = d0Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || d0Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            d0Var.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        d0Var.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(t9.f fVar) {
        if ((Build.VERSION.SDK_INT <= 23 || fVar != ForkJoinPool.commonPool()) && !fVar.a.isTerminated()) {
            fVar.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void j(u7.m mVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || mVar != ForkJoinPool.commonPool()) && !(isTerminated = mVar.isTerminated())) {
            mVar.shutdown();
            boolean z10 = false;
            while (!isTerminated) {
                try {
                    isTerminated = mVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        mVar.shutdownNow();
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
