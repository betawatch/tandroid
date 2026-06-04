package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Result;

/* loaded from: classes.dex */
final class zas {
    final /* synthetic */ BasePendingResult zaa;

    /* synthetic */ zas(BasePendingResult basePendingResult, zar zarVar) {
        this.zaa = basePendingResult;
    }

    protected final void finalize() {
        Result result;
        result = this.zaa.zaj;
        BasePendingResult.zal(result);
        super.finalize();
    }
}
