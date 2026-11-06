package com.google.android.play.core.integrity;

import android.os.Bundle;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
