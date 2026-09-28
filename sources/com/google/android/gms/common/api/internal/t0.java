package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
