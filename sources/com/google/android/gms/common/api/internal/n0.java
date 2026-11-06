package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
