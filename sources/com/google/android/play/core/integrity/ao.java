package com.google.android.play.core.integrity;

import android.os.Build;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {
    private final String a;
    private final Long b;
    private final Object c = null;

    public /* synthetic */ ao(String str, Long l4, Object obj, an anVar) {
        this.a = str;
        this.b = l4;
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
        Long l4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.a.equals(integrityTokenRequest.nonce()) && ((l4 = this.b) != null ? l4.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
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
        Long l4 = this.b;
        int hashCode2 = (hashCode * 1000003) ^ (l4 == null ? 0 : l4.hashCode());
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
