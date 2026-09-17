package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class u extends BasePendingResult {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.google.android.gms.common.api.m mVar, int i10) {
        super(mVar);
        this.o = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        switch (this.o) {
            case 0:
                return status;
            default:
                return new e6.o(status, 0);
        }
    }
}
