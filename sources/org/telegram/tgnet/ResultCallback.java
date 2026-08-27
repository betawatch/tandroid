package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public interface ResultCallback<T> {
    void onComplete(T t10);

    void onError(Throwable th);

    void onError(TLRPC.TL_error tL_error);
}
