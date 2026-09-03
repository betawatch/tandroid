package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public interface ResultCallback<T> {
    void onComplete(T t6);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
