package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class CallbackToFutureAdapter {

    public interface Resolver {
        Object attachCompleter(Completer completer);
    }

    public static ListenableFuture getFuture(Resolver resolver) {
        Completer completer = new Completer();
        SafeFuture safeFuture = new SafeFuture(completer);
        completer.future = safeFuture;
        completer.tag = resolver.getClass();
        try {
            Object attachCompleter = resolver.attachCompleter(completer);
            if (attachCompleter != null) {
                completer.tag = attachCompleter;
            }
        } catch (Exception e) {
            safeFuture.setException(e);
        }
        return safeFuture;
    }

    private static final class SafeFuture implements ListenableFuture {
        final WeakReference completerWeakReference;
        private final AbstractResolvableFuture delegate = new AbstractResolvableFuture() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            protected String pendingToString() {
                Completer completer = (Completer) SafeFuture.this.completerWeakReference.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + completer.tag + "]";
            }
        };

        SafeFuture(Completer completer) {
            this.completerWeakReference = new WeakReference(completer);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            Completer completer = (Completer) this.completerWeakReference.get();
            boolean cancel = this.delegate.cancel(z);
            if (cancel && completer != null) {
                completer.fireCancellationListeners();
            }
            return cancel;
        }

        boolean cancelWithoutNotifyingCompleter(boolean z) {
            return this.delegate.cancel(z);
        }

        boolean set(Object obj) {
            return this.delegate.set(obj);
        }

        boolean setException(Throwable th) {
            return this.delegate.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.delegate.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.delegate.addListener(runnable, executor);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    public static final class Completer {
        private boolean attemptedSetting;
        private ResolvableFuture cancellationFuture = ResolvableFuture.create();
        SafeFuture future;
        Object tag;

        Completer() {
        }

        public boolean set(Object obj) {
            this.attemptedSetting = true;
            SafeFuture safeFuture = this.future;
            boolean z = safeFuture != null && safeFuture.set(obj);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public boolean setCancelled() {
            this.attemptedSetting = true;
            SafeFuture safeFuture = this.future;
            boolean z = safeFuture != null && safeFuture.cancelWithoutNotifyingCompleter(true);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        void fireCancellationListeners() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture.set(null);
        }

        private void setCompletedNormally() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture = null;
        }

        protected void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.future;
            if (safeFuture != null && !safeFuture.isDone()) {
                safeFuture.setException(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.tag));
            }
            if (this.attemptedSetting || (resolvableFuture = this.cancellationFuture) == null) {
                return;
            }
            resolvableFuture.set(null);
        }
    }

    static final class FutureGarbageCollectedException extends Throwable {
        FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }
}
