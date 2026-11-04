package b8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class nf {
    public static int a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, u10 u10Var) {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    int i10 = 1;
                    if (i3 >= length) {
                        e(strArr, new jc0(strArr, activity, u10Var, 1));
                        return;
                    }
                    if (activity.shouldShowRequestPermissionRationale(strArr[i3])) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                        int i11 = org.telegram.ui.ActionBar.k6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747317, null));
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new ic0(activity, i10));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                        alertDialog$Builder.a.show();
                        u10Var.a(Boolean.FALSE);
                        return;
                    }
                    i3++;
                }
            }
        }
        u10Var.a(Boolean.TRUE);
    }

    public static void c(int i3, int i10, String[] strArr, String[] strArr2, u10 u10Var) {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        int i11 = 0;
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                u10Var.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                int i12 = org.telegram.ui.ActionBar.k6.L5;
                alertDialog$Builder.m(i3, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
                alertDialog$Builder.n(i12, null);
                alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i10, null));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new ic0(activity, i11));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
                alertDialog$Builder.a.show();
                u10Var.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new jc0(strArr2, activity, u10Var, 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        return context != null && context.checkSelfPermission(str) == 0;
    }

    public static void e(String[] strArr, u10 u10Var) {
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        int i3 = a;
        a = i3 + 1;
        cs[] csVarArr = new cs[1];
        csVarArr[0] = new kc0(i3, u10Var, csVarArr);
        hs.e().b(csVarArr[0], hs.p5);
        activity.requestPermissions(strArr, i3);
    }

    public static void f() {
        Activity activity = LaunchActivity.K1;
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
