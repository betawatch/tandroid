// default package

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d05 extends e05 {
    public static final Object d = new Object();
    public static final d05 e = new d05();
    public ua4 c;

    public static AlertDialog e(Activity activity, int i, v4d v4dVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(r4d.b(activity, i));
        builder.setOnCancelListener(onCancelListener);
        String c = r4d.c(activity, i);
        if (c != null) {
            builder.setPositiveButton(c, v4dVar);
        }
        String a = r4d.a(activity, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", hg9.j(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof gp4) {
                iq4 u = ((gp4) activity).u();
                wdb wdbVar = new wdb();
                ite.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                wdbVar.B0 = alertDialog;
                wdbVar.C0 = onCancelListener;
                wdbVar.y0 = false;
                wdbVar.z0 = true;
                u.getClass();
                ie0 ie0Var = new ie0(u);
                ie0Var.o = true;
                ie0Var.f(0, wdbVar, str);
                ie0Var.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        h54 h54Var = new h54();
        ite.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        h54Var.a = alertDialog;
        h54Var.b = onCancelListener;
        h54Var.show(fragmentManager, str);
    }

    @Override // e05
    public final Intent a(int i, Context context, String str) {
        return super.a(i, context, str);
    }

    @Override // e05
    public final int b(Context context) {
        return super.c(context, e05.a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog e2 = e(googleApiActivity, i, new v4d(super.a(i, googleApiActivity, "d"), googleApiActivity, (byte) 0), googleApiActivity2);
        if (e2 == null) {
            return;
        }
        h(googleApiActivity, e2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Activity activity, c36 c36Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e2 = e(activity, i, new v4d(super.a(i, activity, "d"), c36Var, (byte) 1), onCancelListener);
        if (e2 == null) {
            return;
        }
        h(activity, e2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", td4.o(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new n4d(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f = i == 6 ? r4d.f(context, "common_google_play_services_resolution_required_title") : r4d.a(context, i);
        if (f == null) {
            f = context.getResources().getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker);
        }
        String e2 = (i == 6 || i == 19) ? r4d.e(context, "common_google_play_services_resolution_required_text", r4d.d(context)) : r4d.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        ite.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        an7 an7Var = new an7(context, null);
        an7Var.t = true;
        an7Var.f(16, true);
        an7Var.e = an7.c(f);
        vm7 vm7Var = new vm7((byte) 0);
        vm7Var.f = an7.c(e2);
        an7Var.i(vm7Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = nfe.a;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            nfe.a = bool;
        }
        boolean booleanValue = bool.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            an7Var.F.icon = i3;
            an7Var.j = 2;
            if (nfe.a(context)) {
                an7Var.a(org.telegram.messenger.beta.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(org.telegram.messenger.beta.R.string.common_open_on_phone));
            } else {
                an7Var.g = pendingIntent;
            }
        } else {
            an7Var.F.icon = R.drawable.stat_sys_warning;
            an7Var.k(resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker));
            an7Var.F.when = System.currentTimeMillis();
            an7Var.g = pendingIntent;
            an7Var.d(e2);
        }
        if (ate.a()) {
            ite.k(ate.a());
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            an7Var.y = "com.google.android.gms.availability";
        }
        Notification b = an7Var.b();
        if (i == 1 || i == 2 || i == 3) {
            x05.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, b);
    }
}
