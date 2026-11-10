package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public interface ResultCallback<T> {
    void onComplete(T t6);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
