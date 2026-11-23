package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public interface ResultCallback<T> {
    void onComplete(T t6);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
