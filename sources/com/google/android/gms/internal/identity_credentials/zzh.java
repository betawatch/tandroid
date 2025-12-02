package com.google.android.gms.internal.identity_credentials;

import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* loaded from: classes.dex */
public abstract class zzh {
    public static ApiMetadata zza(Context context) {
        zzf.zza();
        return ApiMetadata.fromComplianceOptions(ComplianceOptions.newBuilder(context).build());
    }
}
