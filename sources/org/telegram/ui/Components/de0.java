package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class de0 {
    public static int a = 1500;

    public static /* synthetic */ void a(String[] strArr, Activity activity, Utilities.Callback callback) {
        int length = strArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (activity.checkSelfPermission(strArr[i10]) == 0) {
                z10 = true;
                break;
            }
            i10++;
        }
        callback.run(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void b(String[] strArr, Activity activity, Utilities.Callback callback) {
        int length = strArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            } else if (activity.checkSelfPermission(strArr[i10]) != 0) {
                break;
            } else {
                i10++;
            }
        }
        callback.run(Boolean.valueOf(z10));
    }

    public static boolean c() {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity != null && Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        return false;
    }

    public static void d(int i10, int i11, String[] strArr, Utilities.Callback callback) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            callback.run(Boolean.TRUE);
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, null);
                        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k1(activity, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.a.show();
                        callback.run(Boolean.FALSE);
                        return;
                    }
                }
                g(strArr, new be0(strArr, activity, callback, 1));
                return;
            }
        }
        callback.run(Boolean.TRUE);
    }

    public static void e(int i10, int i11, String[] strArr, String[] strArr2, Utilities.Callback callback) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            callback.run(Boolean.TRUE);
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                callback.run(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, null);
                alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k1(activity, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                alertDialog$Builder.a.show();
                callback.run(Boolean.FALSE);
                return;
            }
        }
        g(strArr2, new be0(strArr2, activity, callback, 0));
    }

    public static boolean f(String str) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission(str) == 0;
    }

    public static void g(String[] strArr, Utilities.Callback callback) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int i10 = a;
            a = i10 + 1;
            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
            notificationCenterDelegateArr[0] = new ce0(i10, callback, notificationCenterDelegateArr);
            NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegateArr[0], NotificationCenter.activityPermissionsGranted);
            activity.requestPermissions(strArr, i10);
            return;
        }
        if (callback != null) {
            int[] iArr = new int[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                iArr[i11] = f(strArr[i11]) ? 0 : -1;
            }
            callback.run(iArr);
        }
    }

    public static void h() {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
