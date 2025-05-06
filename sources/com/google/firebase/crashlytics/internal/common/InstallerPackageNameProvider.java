package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* loaded from: classes3.dex */
class InstallerPackageNameProvider {
    private String installerPackageName;

    InstallerPackageNameProvider() {
    }

    private static String loadInstallerPackageName(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String getInstallerPackageName(Context context) {
        try {
            if (this.installerPackageName == null) {
                this.installerPackageName = loadInstallerPackageName(context);
            }
        } finally {
        }
        return "".equals(this.installerPackageName) ? null : this.installerPackageName;
    }
}
