package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public interface ResultCallback<T> {
    void onComplete(T t);

    void onError(Throwable th);

    void onError(TLRPC.TL_error tL_error);
}
