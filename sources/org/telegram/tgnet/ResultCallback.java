package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public interface ResultCallback<T> {
    void onComplete(T t6);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
