package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public interface ResultCallback<T> {
    void onComplete(T t10);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
