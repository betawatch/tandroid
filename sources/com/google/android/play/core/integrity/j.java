package com.google.android.play.core.integrity;

import android.os.Bundle;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.f a(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new StandardIntegrityException(i10, null);
    }
}
