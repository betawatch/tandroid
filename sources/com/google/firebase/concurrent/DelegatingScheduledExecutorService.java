package com.google.firebase.concurrent;

import androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl$$ExternalSyntheticAutoCloseableForwarder1;
import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        FontProvider$ContentQueryWrapperApi24Impl$$ExternalSyntheticAutoCloseableForwarder1.m(this);
    }

    DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.delegate.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.delegate.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.delegate.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.delegate.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda0
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture schedule;
                schedule = r0.scheduler.schedule(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelegatingScheduledExecutorService.this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.$r8$lambda$eeSfYQ6BJhS7zSXRLrNL2MRv5Cc(r1, r2);
                            }
                        });
                    }
                }, j, timeUnit);
                return schedule;
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$eeSfYQ6BJhS7zSXRLrNL2MRv5Cc(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda3
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture schedule;
                schedule = r0.scheduler.schedule(new Callable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda6
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Future submit;
                        submit = DelegatingScheduledExecutorService.this.delegate.submit(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda9
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.$r8$lambda$DPkf5Azy2quQUi97kfFjV0McX98(r1, r2);
                            }
                        });
                        return submit;
                    }
                }, j, timeUnit);
                return schedule;
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$DPkf5Azy2quQUi97kfFjV0McX98(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e) {
            completer.setException(e);
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda1
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture scheduleAtFixedRate;
                scheduleAtFixedRate = r0.scheduler.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelegatingScheduledExecutorService.this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda10
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.$r8$lambda$EbEzOZCjWOxrxgoPIN3wANG2ziw(r1, r2);
                            }
                        });
                    }
                }, j, j2, timeUnit);
                return scheduleAtFixedRate;
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$EbEzOZCjWOxrxgoPIN3wANG2ziw(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
            throw e;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda2
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                ScheduledFuture scheduleWithFixedDelay;
                scheduleWithFixedDelay = r0.scheduler.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        DelegatingScheduledExecutorService.this.delegate.execute(new Runnable() { // from class: com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda11
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.$r8$lambda$M3Tx009A2yliSiUlG7LADIaVIu4(r1, r2);
                            }
                        });
                    }
                }, j, j2, timeUnit);
                return scheduleWithFixedDelay;
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$M3Tx009A2yliSiUlG7LADIaVIu4(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.setException(e);
        }
    }
}
