package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzo {
    private static final Uri zza = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final String zzb;
    private final String zzc;
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        return Objects.equal(this.zzb, zzoVar.zzb) && Objects.equal(this.zzc, zzoVar.zzc) && Objects.equal(this.zzd, zzoVar.zzd) && this.zzf == zzoVar.zzf;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, 4225, Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zzd);
        return this.zzd.flattenToString();
    }

    public final ComponentName zza() {
        return this.zzd;
    }

    public final Intent zzb(Context context) {
        Bundle bundle;
        if (this.zzb == null) {
            return new Intent().setComponent(this.zzd);
        }
        if (this.zzf) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.zzb);
            try {
                bundle = context.getContentResolver().call(zza, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.zzb)));
            }
        }
        return r2 == null ? new Intent(this.zzb).setPackage(this.zzc) : r2;
    }

    public final String zzc() {
        return this.zzc;
    }

    public zzo(String str, String str2, int i, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = 4225;
        this.zzf = z;
    }
}
