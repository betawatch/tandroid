package com.google.android.play.core.integrity;

import android.os.Bundle;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class i implements k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.f a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new IntegrityServiceException(i10, null);
    }
}
