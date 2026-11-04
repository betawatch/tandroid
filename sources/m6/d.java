package m6;

import android.R;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.o0;
import e0.q;
import k2.p1;
import p6.s;
import p6.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends e {
    public static final Object d = new Object();
    public static final d e = new d();
    public r6.d c;

    public static o0 g(Context context, c6.i iVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        o0 o0Var = new o0(iVar);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            f0.b.b(context, o0Var, intentFilter);
        } else if (i3 >= 26) {
            f0.b.a(context, o0Var, intentFilter);
        } else {
            context.registerReceiver(o0Var, intentFilter, null, null);
        }
        o0Var.b = context;
        if (g.c(context)) {
            return o0Var;
        }
        iVar.C();
        o0Var.b();
        return null;
    }

    @Override // m6.e
    public final int c(Context context) {
        return d(context, e.a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        t tVar = new t(super.b(i3, googleApiActivity, "d"), googleApiActivity);
        AlertDialog alertDialog = null;
        if (i3 != 0) {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(s.b(googleApiActivity, i3));
            if (googleApiActivity2 != null) {
                builder.setOnCancelListener(googleApiActivity2);
            }
            String c2 = s.c(googleApiActivity, i3);
            if (c2 != null) {
                builder.setPositiveButton(c2, tVar);
            }
            String a10 = s.a(googleApiActivity, i3);
            if (a10 != null) {
                builder.setTitle(a10);
            }
            Log.w("GoogleApiAvailability", p1.i(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        b bVar = new b();
        p6.m.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.a = alertDialog;
        if (googleApiActivity2 != null) {
            bVar.b = googleApiActivity2;
        }
        bVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    public final void f(Context context, int i3, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", p1.j(i3, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i3 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f10 = i3 == 6 ? s.f(context, "common_google_play_services_resolution_required_title") : s.a(context, i3);
        if (f10 == null) {
            f10 = context.getResources().getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker);
        }
        String e10 = (i3 == 6 || i3 == 19) ? s.e(context, "common_google_play_services_resolution_required_text", s.d(context)) : s.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        p6.m.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        q qVar = new q(context, null);
        qVar.t = true;
        qVar.h(16, true);
        qVar.e = q.d(f10);
        e0.l lVar = new e0.l(false);
        lVar.f = q.d(e10);
        qVar.n(lVar);
        PackageManager packageManager = context.getPackageManager();
        if (w6.b.b == null) {
            w6.b.b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = w6.b.b.booleanValue();
        int i11 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            qVar.F.icon = i11;
            qVar.j = 2;
            if (w6.b.f(context)) {
                qVar.a(org.telegram.messenger.beta.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(org.telegram.messenger.beta.R.string.common_open_on_phone));
            } else {
                qVar.g = pendingIntent;
            }
        } else {
            qVar.F.icon = R.drawable.stat_sys_warning;
            qVar.p(resources.getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker));
            qVar.F.when = System.currentTimeMillis();
            qVar.g = pendingIntent;
            qVar.f(e10);
        }
        if (w6.b.d()) {
            p6.m.j(w6.b.d());
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
            qVar.y = "com.google.android.gms.availability";
        }
        Notification b10 = qVar.b();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            g.a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, b10);
    }
}
