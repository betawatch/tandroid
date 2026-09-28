package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public interface ResultCallback<T> {
    void onComplete(T t10);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
