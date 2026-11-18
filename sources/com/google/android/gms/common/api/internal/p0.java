package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
