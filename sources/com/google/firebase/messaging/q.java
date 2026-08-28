package com.google.firebase.messaging;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class q {
    public static void a(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        try {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                taskCompletionSource.trySetResult(null);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("proxy_notification_initialized", true);
            edit.apply();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
            taskCompletionSource.trySetResult(null);
        } catch (Throwable th) {
            taskCompletionSource.trySetResult(null);
            throw th;
        }
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static Insets d(int i9, int i10, int i11, int i12) {
        return Insets.of(i9, i10, i11, i12);
    }

    public static void e(Notification.Builder builder, boolean z10) {
        builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static void f(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void g(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void h(RemoteInput.Builder builder) {
        builder.setEditChoicesBeforeSending(0);
    }

    public static void i(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }
}
