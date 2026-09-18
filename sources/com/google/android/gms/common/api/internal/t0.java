package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class t0 extends com.google.android.gms.common.api.m {
    public final com.google.android.gms.common.api.j b;

    public t0(com.google.android.gms.common.api.j jVar) {
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
