package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class s0 extends com.google.android.gms.common.api.m {
    public final com.google.android.gms.common.api.j b;

    public s0(com.google.android.gms.common.api.j jVar) {
        this.b = jVar;
    }

    @Override // com.google.android.gms.common.api.m
    public final void a() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // com.google.android.gms.common.api.m
    public final void b() {
        throw new UnsupportedOperationException("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper c() {
        return this.b.f;
    }
}
