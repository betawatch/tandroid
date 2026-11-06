package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public interface ResultCallback<T> {
    void onComplete(T t6);

    void onError(Throwable th2);

    void onError(TLRPC.TL_error tL_error);
}
