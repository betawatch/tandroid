package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class u0 extends com.google.android.gms.common.api.m {
    public final com.google.android.gms.common.api.j b;

    public u0(com.google.android.gms.common.api.j jVar) {
        this.b = jVar;
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper a() {
        return this.b.f;
    }
}
