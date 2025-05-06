package com.google.firebase.inject;

/* loaded from: classes3.dex */
public interface Deferred {

    public interface DeferredHandler {
        void handle(Provider provider);
    }

    void whenAvailable(DeferredHandler deferredHandler);
}
