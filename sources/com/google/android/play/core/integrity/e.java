package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {
    private final long a;

    public /* synthetic */ e(long j, int i, d dVar) {
        this.a = j;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final int a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return ls6.p(new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="), this.a, ", webViewRequestMode=0}");
    }
}
