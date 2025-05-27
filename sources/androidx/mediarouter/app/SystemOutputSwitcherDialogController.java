package androidx.mediarouter.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaRouter2;
import android.os.Build;
import java.util.Iterator;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public abstract class SystemOutputSwitcherDialogController {

    static class Api30Impl {
        static MediaRouter2 getInstance(Context context) {
            return MediaRouter2.getInstance(context);
        }
    }

    static class Api34Impl {
        static boolean showSystemOutputSwitcher(MediaRouter2 mediaRouter2) {
            return mediaRouter2.showSystemOutputSwitcher();
        }
    }

    private static boolean isRunningOnWear(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    private static boolean showBluetoothSettingsFragment(Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra("EXTRA_CONNECTION_ONLY", true).putExtra("android.bluetooth.devicepicker.extra.FILTER_TYPE", 1);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & NotificationCenter.didGenerateFingerprintKeyPair) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    public static boolean showDialog(Context context) {
        boolean showDialogForAndroidR;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            showDialogForAndroidR = showDialogForAndroidUAndAbove(context);
        } else if (i >= 31) {
            if (showDialogForAndroidSAndT(context) || showDialogForAndroidR(context)) {
                showDialogForAndroidR = true;
            }
            showDialogForAndroidR = false;
        } else {
            if (i == 30) {
                showDialogForAndroidR = showDialogForAndroidR(context);
            }
            showDialogForAndroidR = false;
        }
        if (showDialogForAndroidR) {
            return true;
        }
        return isRunningOnWear(context) && showBluetoothSettingsFragment(context);
    }

    private static boolean showDialogForAndroidR(Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & NotificationCenter.didGenerateFingerprintKeyPair) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    private static boolean showDialogForAndroidSAndT(Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & NotificationCenter.didGenerateFingerprintKeyPair) != 0) {
                context.sendBroadcast(putExtra);
                return true;
            }
        }
        return false;
    }

    private static boolean showDialogForAndroidUAndAbove(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            return false;
        }
        MediaRouter2 api30Impl = Api30Impl.getInstance(context);
        if (i >= 34) {
            return Api34Impl.showSystemOutputSwitcher(api30Impl);
        }
        return false;
    }
}
