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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            if (context == null) {
                return;
            }
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            c(context, i10, U != null ? U.getResourceProvider() : null);
        }
    }

    public static void c(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        if (a) {
            return;
        }
        int i11 = 1;
        org.telegram.ui.ActionBar.h3 i12 = org.telegram.messenger.em.i(1, context, f6Var, false);
        bi.g3 g3Var = new bi.g3(i10, context, r5, 19);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        kj0Var.f(R.raw.media_forbidden, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        kj0Var.d();
        f7.addView(kj0Var, w7.a6.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        org.telegram.messenger.em.j(20.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        org.telegram.messenger.em.k(R.string.AccountFrozenTitle, textView, 17);
        f7.addView(textView, w7.a6.t(-1, -2, 17, 0, 0, 0, 23));
        xh.s sVar = new xh.s(context, 1, f6Var);
        sVar.a(LocaleController.getString(R.string.AccountFrozen1Title), LocaleController.getString(R.string.AccountFrozen1Text), R.drawable.msg_block2);
        f7.addView(sVar, w7.a6.t(-1, -2, 17, 0, 0, 0, 0));
        xh.s sVar2 = new xh.s(context, 1, f6Var);
        sVar2.a(LocaleController.getString(R.string.AccountFrozen2Title), LocaleController.getString(R.string.AccountFrozen2Text), R.drawable.menu_privacy);
        f7.addView(sVar2, w7.a6.t(-1, -2, 17, 0, 0, 0, 0));
        xh.s sVar3 = new xh.s(context, 1, f6Var);
        sVar3.a(LocaleController.getString(R.string.AccountFrozen3Title), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.AccountFrozen3Text, LocaleController.formatYearMonthDay(MessagesController.getInstance(i10).freezeUntilDate, true)), new mu0(g3Var, 2)), R.drawable.menu_feature_hourglass);
        f7.addView(sVar3, w7.a6.t(-1, -2, 17, 0, 0, 0, 0));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.AccountFrozenButtonAppeal), false, true);
        dVar.setOnClickListener(new a(g3Var, 0));
        f7.addView(dVar, w7.a6.t(-1, 48, 7, 0, 13, 0, 4));
        bi.d dVar2 = new bi.d(context, f6Var, false);
        dVar2.g(LocaleController.getString(R.string.AccountFrozenButtonUnderstood), false, true);
        dVar2.setOnClickListener(new a(r5, i11));
        f7.addView(dVar2, w7.a6.t(-1, 48, 7, 0, 0, 0, 0));
        i12.customView = f7;
        org.telegram.ui.ActionBar.h3[] h3VarArr = {i12};
        i12.useBackgroundTopPadding = false;
        i12.fixNavigationBar();
        a = true;
        h3VarArr[0].show();
        h3VarArr[0].setOnDismissListener(new bi.k1(i11));
    }
}
