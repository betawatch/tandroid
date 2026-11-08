package com.google.android.play.core.integrity;

import android.os.Bundle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.f a(Bundle bundle) {
        int i7 = bundle.getInt("error");
        if (i7 == 0) {
            return null;
        }
        return new StandardIntegrityException(i7, null);
    }
}
