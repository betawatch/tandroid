package c8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class ia {
    public static int a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, c20 c20Var) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                int length = strArr.length;
                int i7 = 0;
                while (true) {
                    int i10 = 1;
                    if (i7 >= length) {
                        e(strArr, new oc0(strArr, activity, c20Var, 1));
                        return;
                    }
                    if (activity.shouldShowRequestPermissionRationale(strArr[i7])) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                        int i11 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747308, null));
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new nc0(activity, i10));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                        alertDialog$Builder.a.show();
                        c20Var.a(Boolean.FALSE);
                        return;
                    }
                    i7++;
                }
            }
        }
        c20Var.a(Boolean.TRUE);
    }

    public static void c(int i7, int i10, String[] strArr, String[] strArr2, c20 c20Var) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        int i11 = 0;
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                c20Var.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                int i12 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                alertDialog$Builder.n(i12, null);
                alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i10, null));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747299, null), new nc0(activity, i11));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751772, null), null);
                alertDialog$Builder.a.show();
                c20Var.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new oc0(strArr2, activity, c20Var, 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        return context != null && context.checkSelfPermission(str) == 0;
    }

    public static void e(String[] strArr, c20 c20Var) {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        int i7 = a;
        a = i7 + 1;
        ls[] lsVarArr = new ls[1];
        lsVarArr[0] = new pc0(i7, c20Var, lsVarArr);
        qs.e().b(lsVarArr[0], qs.p5);
        activity.requestPermissions(strArr, i7);
    }

    public static void f() {
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
