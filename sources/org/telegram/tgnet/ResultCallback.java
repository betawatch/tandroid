package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public interface ResultCallback<T> {
    void onComplete(T t10);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
