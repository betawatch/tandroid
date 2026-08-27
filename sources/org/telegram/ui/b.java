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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static void b(int i10) {
        if (!a && UserConfig.selectedAccount == i10) {
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            c(context, i10, U != null ? U.getResourceProvider() : null);
        }
    }

    public static void c(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        if (a) {
            return;
        }
        org.telegram.ui.ActionBar.e3 o10 = org.telegram.messenger.y1.o(context, c6Var, false, false);
        int i11 = 1;
        d5.i iVar = new d5.i(i10, context, r5, 21);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        g10.setClipChildren(false);
        g10.setClipToPadding(false);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        ri0Var.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        ri0Var.d();
        g10.addView(ri0Var, h7.z5.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.h(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        org.telegram.messenger.rl.i(R.string.AccountFrozenTitle, textView, 17);
        g10.addView(textView, h7.z5.t(-1, -2, 17, 0, 0, 0, 23));
        hh.f0 f0Var = new hh.f0(context, 1, c6Var);
        f0Var.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        g10.addView(f0Var, h7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        hh.f0 f0Var2 = new hh.f0(context, 1, c6Var);
        f0Var2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        g10.addView(f0Var2, h7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        hh.f0 f0Var3 = new hh.f0(context, 1, c6Var);
        f0Var3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new lt0(iVar, 2)), R.drawable.menu_feature_hourglass);
        g10.addView(f0Var3, h7.z5.t(-1, -2, 17, 0, 0, 0, 0));
        lh.d dVar = new lh.d(context, c6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(iVar, 0));
        g10.addView(dVar, h7.z5.t(-1, 48, 7, 0, 13, 0, 4));
        lh.d dVar2 = new lh.d(context, c6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, i11));
        g10.addView(dVar2, h7.z5.t(-1, 48, 7, 0, 0, 0, 0));
        o10.customView = g10;
        org.telegram.ui.ActionBar.e3[] e3VarArr = {o10};
        o10.useBackgroundTopPadding = false;
        o10.fixNavigationBar();
        a = true;
        e3VarArr[0].show();
        e3VarArr[0].setOnDismissListener(new lh.e1(i11));
    }
}
