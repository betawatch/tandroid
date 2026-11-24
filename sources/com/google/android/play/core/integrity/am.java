package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class am extends IntegrityTokenRequest.Builder {
    private String a;
    private Long b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.a;
        an anVar = null;
        if (str != null) {
            return new ao(str, this.b, anVar, anVar);
        }
        sc8.j("Missing required properties: nonce");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        fvc.f("Null nonce");
        return null;
    }
}
