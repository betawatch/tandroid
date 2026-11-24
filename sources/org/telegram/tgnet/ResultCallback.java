package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public interface ResultCallback<T> {
    void onComplete(T t);

    void onError(Throwable th);

    void onError(TLRPC.TL_error tL_error);
}
