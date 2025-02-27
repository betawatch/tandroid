package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public interface zzam extends IInterface {
    void zze(boolean z, int i);

    void zzf(ApplicationMetadata applicationMetadata, String str, String str2, boolean z);

    void zzg(int i);

    void zzh(Bundle bundle);

    void zzi(ConnectionResult connectionResult);

    void zzj(int i);
}
