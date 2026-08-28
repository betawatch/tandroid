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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class kd0 {
    public static int a = 1500;

    public static /* synthetic */ void a(String[] strArr, Activity activity, Utilities.Callback callback) {
        int length = strArr.length;
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            if (activity.checkSelfPermission(strArr[i9]) == 0) {
                z10 = true;
                break;
            }
            i9++;
        }
        callback.run(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void b(String[] strArr, Activity activity, Utilities.Callback callback) {
        int length = strArr.length;
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                z10 = true;
                break;
            } else if (activity.checkSelfPermission(strArr[i9]) != 0) {
                break;
            } else {
                i9++;
            }
        }
        callback.run(Boolean.valueOf(z10));
    }

    public static boolean c() {
        Activity activity = LaunchActivity.C1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity != null && Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        return false;
    }

    public static void d(int i9, int i10, String[] strArr, Utilities.Callback callback) {
        Activity activity = LaunchActivity.C1;
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
                        alertDialog$Builder.m(i9, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                        alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i1(activity, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.a.show();
                        callback.run(Boolean.FALSE);
                        return;
                    }
                }
                g(strArr, new id0(strArr, activity, callback, 1));
                return;
            }
        }
        callback.run(Boolean.TRUE);
    }

    public static void e(int i9, int i10, String[] strArr, String[] strArr2, Utilities.Callback callback) {
        Activity activity = LaunchActivity.C1;
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
                alertDialog$Builder.m(i9, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i1(activity, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                alertDialog$Builder.a.show();
                callback.run(Boolean.FALSE);
                return;
            }
        }
        g(strArr2, new id0(strArr2, activity, callback, 0));
    }

    public static boolean f(String str) {
        Activity activity = LaunchActivity.C1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission(str) == 0;
    }

    public static void g(String[] strArr, Utilities.Callback callback) {
        Activity activity = LaunchActivity.C1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int i9 = a;
            a = i9 + 1;
            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = new NotificationCenter.NotificationCenterDelegate[1];
            notificationCenterDelegateArr[0] = new jd0(i9, callback, notificationCenterDelegateArr);
            NotificationCenter.getGlobalInstance().addObserver(notificationCenterDelegateArr[0], NotificationCenter.activityPermissionsGranted);
            activity.requestPermissions(strArr, i9);
            return;
        }
        if (callback != null) {
            int[] iArr = new int[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                iArr[i10] = f(strArr[i10]) ? 0 : -1;
            }
            callback.run(iArr);
        }
    }

    public static void h() {
        Activity activity = LaunchActivity.C1;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
