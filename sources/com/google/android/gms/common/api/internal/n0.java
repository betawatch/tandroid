package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
