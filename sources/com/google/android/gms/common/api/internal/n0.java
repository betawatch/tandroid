package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
