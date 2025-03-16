package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
class OptionalProvider implements Provider, Deferred {
    private volatile Provider delegate;
    private Deferred.DeferredHandler handler;
    private static final Deferred.DeferredHandler NOOP_HANDLER = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            OptionalProvider.lambda$static$0(provider);
        }
    };
    private static final Provider EMPTY_PROVIDER = new Provider() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda1
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            Object lambda$static$1;
            lambda$static$1 = OptionalProvider.lambda$static$1();
            return lambda$static$1;
        }
    };

    private OptionalProvider(Deferred.DeferredHandler deferredHandler, Provider provider) {
        this.handler = deferredHandler;
        this.delegate = provider;
    }

    static OptionalProvider empty() {
        return new OptionalProvider(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Provider provider) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$static$1() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$whenAvailable$2(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    static OptionalProvider of(Provider provider) {
        return new OptionalProvider(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public Object get() {
        return this.delegate.get();
    }

    void set(Provider provider) {
        Deferred.DeferredHandler deferredHandler;
        if (this.delegate != EMPTY_PROVIDER) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            deferredHandler = this.handler;
            this.handler = null;
            this.delegate = provider;
        }
        deferredHandler.handle(provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(final Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.delegate;
        Provider provider4 = EMPTY_PROVIDER;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.delegate;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler deferredHandler2 = this.handler;
                this.handler = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda2
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        OptionalProvider.lambda$whenAvailable$2(Deferred.DeferredHandler.this, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }
}
