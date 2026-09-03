package com.google.android.gms.internal.cast;

import android.media.MediaCodec;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h4 {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern a() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ void b() {
        if (Build.VERSION.SDK_INT <= 23 || ForkJoinPool.commonPool() != null) {
            throw null;
        }
    }

    public static void c(l4 l4Var) {
        boolean isTerminated;
        ExecutorService executorService = l4Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || l4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            l4Var.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        l4Var.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void d(p4 p4Var) {
        boolean isTerminated;
        ExecutorService executorService = p4Var.a;
        if ((Build.VERSION.SDK_INT <= 23 || p4Var != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            p4Var.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        p4Var.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void e(d9.g gVar) {
        if ((Build.VERSION.SDK_INT <= 23 || gVar != ForkJoinPool.commonPool()) && !gVar.a.isTerminated()) {
            gVar.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void f(h7.m mVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || mVar != ForkJoinPool.commonPool()) && !(isTerminated = mVar.isTerminated())) {
            mVar.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = mVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        mVar.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void g(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        executorService.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h(re.a aVar) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || aVar != ForkJoinPool.commonPool()) && !(isTerminated = aVar.isTerminated())) {
            aVar.shutdown();
            boolean z4 = false;
            while (!isTerminated) {
                try {
                    isTerminated = aVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        aVar.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
