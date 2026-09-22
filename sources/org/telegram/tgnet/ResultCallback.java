package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public interface ResultCallback<T> {
    void onComplete(T t10);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
