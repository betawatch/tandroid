package c8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class na {
    public static int a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, x10 x10Var) {
        Activity activity = LaunchActivity.H1;
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
                        e(strArr, new zc0(strArr, activity, x10Var, 1));
                        return;
                    }
                    if (activity.shouldShowRequestPermissionRationale(strArr[i7])) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                        int i11 = org.telegram.ui.ActionBar.n6.L5;
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131747116, null));
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new yc0(activity, i10));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
                        alertDialog$Builder.a.show();
                        x10Var.a(Boolean.FALSE);
                        return;
                    }
                    i7++;
                }
            }
        }
        x10Var.a(Boolean.TRUE);
    }

    public static void c(int i7, int i10, String[] strArr, String[] strArr2, x10 x10Var) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        int i11 = 0;
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                x10Var.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                int i12 = org.telegram.ui.ActionBar.n6.L5;
                alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.n6.x0(null, i12, false), null);
                alertDialog$Builder.n(i12, null);
                alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i10, null));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747107, null), new yc0(activity, i11));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751761, null), null);
                alertDialog$Builder.a.show();
                x10Var.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new zc0(strArr2, activity, x10Var, 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        return context != null && context.checkSelfPermission(str) == 0;
    }

    public static void e(String[] strArr, x10 x10Var) {
        Activity activity = LaunchActivity.H1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        }
        if (activity == null) {
            return;
        }
        int i7 = a;
        a = i7 + 1;
        fs[] fsVarArr = new fs[1];
        fsVarArr[0] = new ad0(i7, x10Var, fsVarArr);
        ks.e().b(fsVarArr[0], ks.s5);
        activity.requestPermissions(strArr, i7);
    }

    public static void f() {
        Activity activity = LaunchActivity.H1;
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
