package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a;

    public static boolean a(int i10, TLRPC.User user) {
        String publicUsername;
        if (user == null || (publicUsername = UserObject.getPublicUsername(user)) == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(MessagesController.getInstance(i10).freezeAppealUrl);
            if (matcher.find()) {
                if (publicUsername.equalsIgnoreCase(matcher.group(1))) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static void b(int i10) {
        if (!a && UserConfig.selectedAccount == i10) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            c(context, i10, U != null ? U.getResourceProvider() : null);
        }
    }

    public static void c(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        if (a) {
            return;
        }
        int i11 = 1;
        org.telegram.ui.ActionBar.k3 i12 = org.telegram.messenger.vh.i(1, context, u6Var, false);
        ai.h0 h0Var = new ai.h0(i10, context, r5, 26);
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
        ak0Var.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        ak0Var.d();
        d.addView(ak0Var, org.telegram.ui.Components.gb1.x(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.vh.j(20.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.messenger.vh.k(R.string.AccountFrozenTitle, textView, 17);
        d.addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 17, 0, 0, 0, 23));
        bi.p0 p0Var = new bi.p0(context, 1, u6Var);
        p0Var.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        d.addView(p0Var, org.telegram.ui.Components.gb1.x(-1, -2, 17, 0, 0, 0, 0));
        bi.p0 p0Var2 = new bi.p0(context, 1, u6Var);
        p0Var2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        d.addView(p0Var2, org.telegram.ui.Components.gb1.x(-1, -2, 17, 0, 0, 0, 0));
        bi.p0 p0Var3 = new bi.p0(context, 1, u6Var);
        p0Var3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new zt0(h0Var, 2)), R.drawable.menu_feature_hourglass);
        d.addView(p0Var3, org.telegram.ui.Components.gb1.x(-1, -2, 17, 0, 0, 0, 0));
        fi.d dVar = new fi.d(context, u6Var, true);
        dVar.i(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(h0Var, 0));
        d.addView(dVar, org.telegram.ui.Components.gb1.x(-1, 48, 7, 0, 13, 0, 4));
        fi.d dVar2 = new fi.d(context, u6Var, false);
        dVar2.i(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, i11));
        d.addView(dVar2, org.telegram.ui.Components.gb1.x(-1, 48, 7, 0, 0, 0, 0));
        i12.customView = d;
        org.telegram.ui.ActionBar.k3[] k3VarArr = {i12};
        i12.useBackgroundTopPadding = false;
        i12.fixNavigationBar();
        a = true;
        k3VarArr[0].show();
        k3VarArr[0].setOnDismissListener(new fi.e1(i11));
    }
}
