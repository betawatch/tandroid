package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
