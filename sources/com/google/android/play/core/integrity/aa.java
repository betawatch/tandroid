package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class aa implements IntegrityManager {
    private final aj a;

    public aa(aj ajVar) {
        this.a = ajVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.a.c(integrityTokenRequest);
    }
}
