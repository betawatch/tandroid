package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {
    private String a;
    private Set b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        Set set = this.b;
        if (set != null) {
            return new h(this.a, set, null);
        }
        throw new IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(Set<Integer> set) {
        if (set == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        this.b = set;
        return this;
    }
}
