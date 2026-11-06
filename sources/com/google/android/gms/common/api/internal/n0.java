package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n0 extends com.google.android.gms.common.api.m {
    public final com.google.android.gms.common.api.j b;

    public n0(com.google.android.gms.common.api.j jVar) {
        this.b = jVar;
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper a() {
        return this.b.g;
    }
}
