package com.microsoft.appcenter.utils.async;

/* loaded from: classes3.dex */
public interface AppCenterFuture {
    Object get();

    void thenAccept(AppCenterConsumer appCenterConsumer);
}
