package n6;

import ab.e0;
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
import e0.q;
import q6.s;
import q6.t;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d extends e {
    public static final Object d = new Object();
    public static final d e = new d();
    public s6.d c;

    public static e0 g(Context context, cb.c cVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        e0 e0Var = new e0(cVar);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            f0.b.b(context, e0Var, intentFilter);
        } else if (i7 >= 26) {
            f0.b.a(context, e0Var, intentFilter);
        } else {
            context.registerReceiver(e0Var, intentFilter, null, null);
        }
        e0Var.b = context;
        if (g.c(context)) {
            return e0Var;
        }
        cVar.D();
        e0Var.b();
        return null;
    }

    @Override // n6.e
    public final int c(Context context) {
        return d(context, e.a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i7, GoogleApiActivity googleApiActivity2) {
        t tVar = new t(super.b(i7, googleApiActivity, "d"), googleApiActivity);
        AlertDialog alertDialog = null;
        if (i7 != 0) {
            TypedValue typedValue = new TypedValue();
            googleApiActivity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(googleApiActivity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(googleApiActivity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(googleApiActivity);
            }
            builder.setMessage(s.b(googleApiActivity, i7));
            if (googleApiActivity2 != null) {
                builder.setOnCancelListener(googleApiActivity2);
            }
            String c10 = s.c(googleApiActivity, i7);
            if (c10 != null) {
                builder.setPositiveButton(c10, tVar);
            }
            String a10 = s.a(googleApiActivity, i7);
            if (a10 != null) {
                builder.setTitle(a10);
            }
            Log.w("GoogleApiAvailability", jg.g.j(i7, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog == null) {
            return;
        }
        FragmentManager fragmentManager = googleApiActivity.getFragmentManager();
        b bVar = new b();
        q6.m.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.a = alertDialog;
        if (googleApiActivity2 != null) {
            bVar.b = googleApiActivity2;
        }
        bVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
    }

    public final void f(Context context, int i7, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", jg.g.k(i7, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i7 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f10 = i7 == 6 ? s.f(context, "common_google_play_services_resolution_required_title") : s.a(context, i7);
        if (f10 == null) {
            f10 = context.getResources().getString(org.telegram.messenger.beta.R.string.common_google_play_services_notification_ticker);
        }
        String e10 = (i7 == 6 || i7 == 19) ? s.e(context, "common_google_play_services_resolution_required_text", s.d(context)) : s.b(context, i7);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        q6.m.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        q qVar = new q(context, null);
        qVar.t = true;
        qVar.h(16, true);
        qVar.e = q.d(f10);
        e0.l lVar = new e0.l(false);
        lVar.f = q.d(e10);
        qVar.n(lVar);
        PackageManager packageManager = context.getPackageManager();
        if (x6.b.b == null) {
            x6.b.b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = x6.b.b.booleanValue();
        int i11 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            qVar.F.icon = i11;
            qVar.j = 2;
            if (x6.b.f(context)) {
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
        if (x6.b.d()) {
            q6.m.j(x6.b.d());
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
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            g.a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, b10);
    }
}
