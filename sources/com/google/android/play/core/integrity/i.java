package com.google.android.play.core.integrity;

import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.f a(Bundle bundle) {
        int i9 = bundle.getInt("error");
        if (i9 == 0) {
            return null;
        }
        return new IntegrityServiceException(i9, null);
    }
}
