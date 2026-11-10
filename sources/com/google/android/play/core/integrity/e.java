package com.google.android.play.core.integrity;

import a8.p0;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {
    private final long a;

    public /* synthetic */ e(long j3, int i7, d dVar) {
        this.a = j3;
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
        long j3 = this.a;
        return (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return p0.r(new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="), this.a, ", webViewRequestMode=0}");
    }
}
