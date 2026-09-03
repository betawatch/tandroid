package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import y5.e;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzcz implements zzda {
    private final e zza;

    public zzcz() {
        this.zza = e.b;
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final String zza(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                String initiatingPackageName = packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
                return initiatingPackageName == null ? "" : initiatingPackageName;
            }
            String installerPackageName = packageManager.getInstallerPackageName(packageName);
            return installerPackageName == null ? "" : installerPackageName;
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
            if (j.a(((PackageInfo) it.next()).packageName, "com.android.vending")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzda
    public final int zzd(Context context) {
        int c3 = this.zza.c(context);
        return (c3 == 1 || c3 == 3 || c3 == 9) ? 4 : 3;
    }

    public zzcz(e eVar) {
        this.zza = eVar;
    }
}
