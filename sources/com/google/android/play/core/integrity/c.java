package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {
    private long a;
    private byte b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i9) {
        this.b = (byte) (this.b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.b == 3) {
            return new e(this.a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.a = j10;
        this.b = (byte) (this.b | 1);
        return this;
    }
}
