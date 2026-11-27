package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
