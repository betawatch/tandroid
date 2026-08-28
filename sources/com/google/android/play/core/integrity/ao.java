package com.google.android.play.core.integrity;

import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {
    private final String a;
    private final Long b;
    private final Object c = null;

    public /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.a = str;
        this.b = l10;
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.a.equals(integrityTokenRequest.nonce()) && ((l10 = this.b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z10 = true;
                return ((obj instanceof ao) || !a()) ? z10 : z10;
            }
        }
        z10 = false;
        if (obj instanceof ao) {
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Long l10 = this.b;
        int hashCode2 = (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
