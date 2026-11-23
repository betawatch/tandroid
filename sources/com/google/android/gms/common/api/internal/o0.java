package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o0 extends com.google.android.gms.common.api.m {
    public final com.google.android.gms.common.api.j b;

    public o0(com.google.android.gms.common.api.j jVar) {
        this.b = jVar;
    }

    @Override // com.google.android.gms.common.api.m
    public final Looper a() {
        return this.b.g;
    }
}
