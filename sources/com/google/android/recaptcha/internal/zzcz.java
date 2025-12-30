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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (r5 == null) goto L13;
     */
    @Override // com.google.android.recaptcha.internal.zzda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(Context context) {
        PackageManager packageManager;
        String packageName;
        String installerPackageName;
        InstallSourceInfo installSourceInfo;
        String str = "";
        try {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            installSourceInfo = packageManager.getInstallSourceInfo(packageName);
            installerPackageName = installSourceInfo.getInitiatingPackageName();
            if (installerPackageName == null) {
                return str;
            }
            str = installerPackageName;
            return str;
        }
        installerPackageName = packageManager.getInstallerPackageName(packageName);
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final boolean zzb(Context context) {
        return zzd(context) == 3;
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final boolean zzc(Context context) {
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
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
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final int zzd(Context context) {
        int isGooglePlayServicesAvailable = this.zza.isGooglePlayServicesAvailable(context);
        return (isGooglePlayServicesAvailable == 1 || isGooglePlayServicesAvailable == 3 || isGooglePlayServicesAvailable == 9) ? 4 : 3;
    }
}
