package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzcz implements zzda {
    private final j05 zza;

    public zzcz() {
        this.zza = j05.b;
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
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            if ((installedPackages instanceof Collection) && installedPackages.isEmpty()) {
                return false;
            }
            Iterator<T> it = installedPackages.iterator();
            while (it.hasNext()) {
                if (ur5.a(((PackageInfo) it.next()).packageName, "com.android.vending")) {
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
        int b = this.zza.b(context);
        return (b == 1 || b == 3 || b == 9) ? 4 : 3;
    }

    public zzcz(j05 j05Var) {
        this.zza = j05Var;
    }
}
