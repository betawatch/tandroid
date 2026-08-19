package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzcz implements zzda {
    private final GoogleApiAvailabilityLight zza;

    public zzcz() {
        this.zza = GoogleApiAvailabilityLight.getInstance();
    }

    public zzcz(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zza = googleApiAvailabilityLight;
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final String zza(Context context) {
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT < 30) {
                String installerPackageName = packageManager.getInstallerPackageName(packageName);
                return installerPackageName == null ? "" : installerPackageName;
            }
            installSourceInfo = packageManager.getInstallSourceInfo(packageName);
            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
            return initiatingPackageName == null ? "" : initiatingPackageName;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final boolean zzb(Context context) {
        return zzd(context) == 3;
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final boolean zzc(Context context) {
        List<PackageInfo> installedPackages;
        try {
            installedPackages = context.getPackageManager().getInstalledPackages(0);
        } catch (Exception unused) {
        }
        if ((installedPackages instanceof Collection) && installedPackages.isEmpty()) {
            return false;
        }
        Iterator<T> it = installedPackages.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((PackageInfo) it.next()).packageName, "com.android.vending")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final int zzd(Context context) {
        int isGooglePlayServicesAvailable = this.zza.isGooglePlayServicesAvailable(context);
        return (isGooglePlayServicesAvailable == 1 || isGooglePlayServicesAvailable == 3 || isGooglePlayServicesAvailable == 9) ? 4 : 3;
    }
}
