package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.List;

/* loaded from: classes.dex */
public class AppData {
    public final String buildId;
    public final List buildIdInfoList;
    public final DevelopmentPlatformProvider developmentPlatformProvider;
    public final String googleAppId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public static AppData create(Context context, IdManager idManager, String str, String str2, List list, DevelopmentPlatformProvider developmentPlatformProvider) {
        String packageName = context.getPackageName();
        String installerPackageName = idManager.getInstallerPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String appBuildVersion = getAppBuildVersion(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new AppData(str, str2, list, installerPackageName, packageName, appBuildVersion, str3, developmentPlatformProvider);
    }

    private static String getAppBuildVersion(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }

    public AppData(String str, String str2, List list, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.googleAppId = str;
        this.buildId = str2;
        this.buildIdInfoList = list;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
        this.developmentPlatformProvider = developmentPlatformProvider;
    }
}
