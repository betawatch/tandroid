package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
