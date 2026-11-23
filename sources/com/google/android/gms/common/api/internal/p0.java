package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class p0 extends com.google.android.gms.common.api.m {
    public final com.google.android.gms.common.api.j b;

    public p0(com.google.android.gms.common.api.j jVar) {
        this.b = jVar;
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper a() {
        return this.b.g;
    }
}
