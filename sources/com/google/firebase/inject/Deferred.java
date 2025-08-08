package com.google.firebase.inject;

/* loaded from: classes.dex */
public interface Deferred {

    public interface DeferredHandler {
        void handle(Provider provider);
    }

    void whenAvailable(DeferredHandler deferredHandler);
}
