package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
