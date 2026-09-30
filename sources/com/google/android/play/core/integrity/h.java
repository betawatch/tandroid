package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {
    private final String a;
    private final Set b;

    public /* synthetic */ h(String str, Set set, g gVar) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
            String str = this.a;
            if (str != null ? str.equals(standardIntegrityTokenRequest.requestHash()) : standardIntegrityTokenRequest.requestHash() == null) {
                if (this.b.equals(standardIntegrityTokenRequest.verdictOptOut())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String requestHash() {
        return this.a;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.a + ", verdictOptOut=" + this.b.toString() + "}";
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final Set<Integer> verdictOptOut() {
        return this.b;
    }
}
