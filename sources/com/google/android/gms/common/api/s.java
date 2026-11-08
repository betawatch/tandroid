package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class s extends BasePendingResult {
    public final Status o;

    public s(Status status) {
        super(null);
        this.o = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final q d(Status status) {
        return this.o;
    }
}
