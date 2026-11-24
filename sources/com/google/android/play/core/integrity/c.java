package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {
    private long a;
    private byte b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i) {
        this.b = (byte) (this.b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        d dVar = null;
        if (this.b == 3) {
            return new e(this.a, 0, dVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        sc8.j("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.a = j;
        this.b = (byte) (this.b | 1);
        return this;
    }
}
