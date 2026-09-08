package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {
    private long a;
    private byte b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
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
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j3) {
        this.a = j3;
        this.b = (byte) (this.b | 1);
        return this;
    }
}
