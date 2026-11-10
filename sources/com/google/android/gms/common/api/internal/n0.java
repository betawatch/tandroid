package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
