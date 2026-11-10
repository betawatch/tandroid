package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r extends BasePendingResult {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.google.android.gms.common.api.m mVar, int i7) {
        super(mVar);
        this.o = i7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new h6.n(status, 0);
        }
    }
}
