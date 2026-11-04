package com.google.android.play.core.integrity;

import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.f a(Bundle bundle) {
        int i3 = bundle.getInt("error");
        if (i3 == 0) {
            return null;
        }
        return new StandardIntegrityException(i3, null);
    }
}
