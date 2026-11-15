package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
