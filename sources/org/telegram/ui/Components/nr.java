package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class nr {
    public static boolean a(String str, String str2) {
        return str.length() >= str2.length() && str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static String b(TreeSet treeSet) {
        ArrayList arrayList = new ArrayList(treeSet.size());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!"gay".equalsIgnoreCase(str)) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        String str2 = "";
        int i10 = 0;
        while (i10 < arrayList.size()) {
            String s10 = a1.g.s(new StringBuilder("'"), (String) arrayList.get(i10), "'");
            str2 = i10 == 0 ? s10 : i10 == arrayList.size() - 1 ? LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesOr, str2, s10) : LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesComma, str2, s10);
            i10++;
        }
        return str2;
    }

    public static String c(String str, TreeSet treeSet) {
        String str2 = null;
        if (a(str, "bot")) {
            return null;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!TextUtils.isEmpty(str3) && a(str, str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        return str2;
    }

    public static CharSequence d(int i10, String str, TreeSet treeSet, String str2, d2 d2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        if (str2 == null) {
            return null;
        }
        String upperCase = str2.toUpperCase(Locale.US);
        upperCase.getClass();
        switch (upperCase) {
            case "OWNER_USERNAMES_LIMIT_EXCEEDED":
                return LocaleController.formatString(R.string.CreateManagedBotUsernameOwnerLimit, Integer.valueOf(AppGlobalConfig.getInstance(i10).botAdditionalUsernamesLimit.get()), b(treeSet));
            case "PREMIUM_ACCOUNT_REQUIRED":
                String c10 = c(str, treeSet);
                return AndroidUtilities.replaceSingleLinkKey(c10 == null ? LocaleController.getString(R.string.CreateManagedBotUsernamePremiumRequiredGeneric) : LocaleController.formatString(R.string.CreateManagedBotUsernamePremiumRequired, c10), org.telegram.ui.ActionBar.k6.gc, g6Var, d2Var);
            case "ADDITIONAL_USERNAME_SUFFIX_MISSING":
                return LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixMissing, b(treeSet));
            case "USERNAME_INVALID":
                return LocaleController.getString(R.string.UsernameInvalid);
            case "USERNAME_PURCHASE_AVAILABLE":
            case "USERNAME_OCCUPIED":
                return LocaleController.getString(R.string.UsernameInUse);
            case "BOT_USERNAMES_LIMIT_EXCEEDED":
                return LocaleController.getString(R.string.CreateManagedBotUsernameBotLimit);
            default:
                return null;
        }
    }

    public static void e(Context context, int i10, TLRPC.User user, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot, boolean z10, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var, xc xcVar) {
        xc xcVar2;
        if (!user.bot_can_manage_bots) {
            if (xcVar == null) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    callback.run(null);
                    return;
                }
                xcVar2 = xc.a0(U);
            } else {
                xcVar2 = xcVar;
            }
            xcVar2.Q(R.raw.error, 36, AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.CreateManagedBotUnsupported, TextUtils.isEmpty(UserObject.getPublicUsername(user)) ? UserObject.getUserName(user) : "@" + UserObject.getPublicUsername(user)), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, g6Var))).j();
            callback.run(null);
            return;
        }
        TreeSet treeSet = new TreeSet();
        Set<String> set = AppGlobalConfig.getInstance(i10).botAllowedSuffixes.get();
        if (set != null) {
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    treeSet.add(str.toLowerCase(Locale.US));
                }
            }
        }
        treeSet.remove("bot");
        org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.sl.j(1, context, g6Var, true);
        mr mrVar = new mr(context);
        mrVar.setClipChildren(false);
        mrVar.setClipToPadding(false);
        mrVar.setOrientation(1);
        j10.customView = mrVar;
        w9 w9Var = new w9(context);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.r(user);
        w9Var.e(user, h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        mrVar.addView(w9Var, w7.z5.t(80, 80, 49, 0, 22, 0, 16));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 20.0f);
        org.telegram.messenger.sl.m(R.string.CreateManagedBotTitle, textView, 17);
        mrVar.addView(textView, w7.z5.t(-1, -2, 55, 16, 0, 16, 5));
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
        textView2.setTextSize(1, 14.0f);
        String formatString = LocaleController.formatString(R.string.CreateManagedBotText, UserObject.getUserName(user));
        int i12 = org.telegram.ui.ActionBar.k6.gc;
        textView2.setText(AndroidUtilities.replaceSingleLinkBoldKey(formatString, i12, g6Var, null));
        textView2.setGravity(17);
        mrVar.addView(textView2, w7.z5.t(-1, -2, 55, 16, 0, 16, 22));
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.CreateManagedBotName), false, false, -1, g6Var);
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setImeOptions(5);
        int dp = AndroidUtilities.dp(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        h3Var.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(h3Var, c02, O, null, g6Var);
        h3Var.setText(tL_requestPeerTypeCreateBot.suggested_name);
        mrVar.addView(h3Var, w7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, g6Var);
        e9Var.setText(LocaleController.getString(R.string.CreateManagedBotNameInfo));
        mrVar.addView(e9Var, w7.z5.t(-1, -2, 55, 9, 0, 9, 0));
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.CreateManagedBotUsername), false, false, 32, g6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        org.telegram.ui.Cells.f3 f3Var2 = h3Var2.d;
        h3Var2.removeView(f3Var2);
        org.telegram.ui.ActionBar.r6.C(f3Var2, org.telegram.ui.ActionBar.k6.H6, g6Var);
        f3Var2.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(15.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 17.0f);
        textView3.setText("@");
        org.telegram.ui.ActionBar.r6.W(textView3, i11, g6Var);
        textView3.setGravity(17);
        textView3.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        linearLayout.addView(textView3, w7.z5.k(21.0f, -1.0f, 0.0f, 0.0f, -2, -1));
        linearLayout.addView(f3Var2, w7.z5.p(0, -1, 119.0f, 1, 0, 0, 0, 0));
        h3Var2.addView(linearLayout, w7.z5.c(-1.0f, -1));
        Drawable c03 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        h3Var2.setBackground(c03);
        org.telegram.ui.ActionBar.r6.k(h3Var2, c03, O2, null, g6Var);
        f3Var2.setImeOptions(6);
        f3Var2.setInputType(145);
        f3Var2.setSingleLine(true);
        String str2 = tL_requestPeerTypeCreateBot.suggested_username;
        if (str2 != null) {
            str2 = str2.trim();
        }
        h3Var2.setText(str2);
        mrVar.addView(h3Var2, w7.z5.t(-1, -2, 55, 12, 0, 12, 0));
        f3Var.setOnEditorActionListener(new d1(h3Var2, 2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context, g6Var);
        mrVar.addView(e9Var2, w7.z5.t(-1, -2, 55, 9, 0, 9, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        linearLayout2.setClipToPadding(false);
        mrVar.addView(linearLayout2, w7.z5.n(-1, -2));
        ei.d dVar = new ei.d(context, g6Var, true);
        dVar.setRoundRadius(24);
        dVar.e();
        dVar.setColor(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var)));
        if (dVar.getBackground() != null) {
            Drawable background = dVar.getBackground();
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i11);
            dVar.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(dVar, background, M, null, g6Var);
        }
        dVar.setText(LocaleController.getString(R.string.Cancel));
        linearLayout2.addView(dVar, w7.z5.p(0, 48, 119.0f, 1, 0, 0, 5, 0));
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        g10.setText(LocaleController.getString(R.string.CreateManagedBotButton));
        linearLayout2.addView(g10, w7.z5.p(0, 48, 119.0f, 1, 5, 0, 0, 0));
        j10.useBackgroundTopPadding = false;
        j10.smoothKeyboardAnimationEnabled = true;
        j10.doNotOverlayNavigationBar = true;
        j10.setBackgroundColorKey(org.telegram.ui.ActionBar.k6.a7);
        j10.fixNavigationBar();
        new WeakReference(j10);
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        String[] strArr = new String[1];
        int[] iArr = {-1};
        int[] iArr2 = {-1};
        int[] iArr3 = new int[1];
        Runnable[] runnableArr = new Runnable[1];
        int[] iArr4 = {4};
        d2 d2Var = new d2(j10, i10, 6);
        String b10 = b(treeSet);
        lg lgVar = new lg(e9Var2, TextUtils.isEmpty(b10) ? LocaleController.getString(R.string.CreateManagedBotUsernameInfo) : AndroidUtilities.replaceSingleLinkKey(LocaleController.formatString(R.string.CreateManagedBotUsernameSuffixesInfo, b10), i12, g6Var, d2Var), g6Var, 4);
        ai.db dbVar = new ai.db(iArr3, runnableArr, iArr2, i10, 20);
        ee eeVar = new ee(24, h3Var2, treeSet);
        jr jrVar = new jr(zArr2, iArr, dbVar, strArr, g10, h3Var2, treeSet, lgVar, e9Var2, g6Var, iArr3, runnableArr, iArr2, i10, d2Var, j10);
        lgVar.run();
        kr krVar = new kr(zArr2, iArr, h3Var2, treeSet, strArr, jrVar, h3Var, iArr4, dbVar, g10, z10, i10, user, zArr, callback, j10, d2Var, g6Var, e9Var2, context);
        f3Var2.addTextChangedListener(new lr(eeVar, jrVar));
        eeVar.run();
        if (!TextUtils.isEmpty(str2)) {
            jrVar.run();
        }
        f3Var2.setOnEditorActionListener(new d1(krVar, 3));
        dVar.setOnClickListener(new e3(j10, 2));
        g10.setEnabled(false);
        g10.setOnClickListener(new f0(krVar, 9));
        j10.setOnDismissListener(new gi.l4(zArr2, dbVar, zArr, callback, iArr, i10));
        j10.show();
    }
}
