package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public xw0 U;
    public k71 a;
    public w50 b;
    public org.telegram.ui.Components.yy c;
    public org.telegram.ui.Components.e00 d;
    public final ArrayList e;
    public final ArrayList f;
    public ArrayList h;
    public TLRPC.TL_authorization n;
    public boolean r;
    public g71 s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int w;
    public int x;
    public int y;

    public SessionsActivity(int i9) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.R = 0;
        this.w = i9;
    }

    public static void T(SessionsActivity sessionsActivity, int i9) {
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        ArrayList arrayList;
        String string;
        ArrayList arrayList2 = sessionsActivity.e;
        int i12 = sessionsActivity.w;
        int i13 = 6;
        int i14 = 1;
        if (i9 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            int i15 = sessionsActivity.v;
            int i16 = i15 <= 7 ? 0 : i15 <= 93 ? 1 : i15 <= 183 ? 2 : 3;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.SessionsSelfDestruct);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string2;
            String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
            LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            int i17 = 0;
            while (i17 < 4) {
                org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(sessionsActivity.getParentActivity(), null);
                k6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                k6Var.setTag(Integer.valueOf(i17));
                k6Var.a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
                k6Var.b(strArr[i17], i16 == i17);
                linearLayout.addView(k6Var);
                k6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
                k6Var.setOnClickListener(new v80(21, sessionsActivity, alertDialog$Builder));
                i17++;
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(c2Var);
            return;
        }
        if (i9 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            ArrayList arrayList3 = sessionsActivity.h;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                if (i12 == 0) {
                    c2Var2.P = LocaleController.getString(R.string.AreYouSureSessions);
                    c2Var2.N = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    c2Var2.P = LocaleController.getString(R.string.AreYouSureWebSessions);
                    c2Var2.N = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new f71(sessionsActivity, i14));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList4 = sessionsActivity.h;
            int size = arrayList4.size();
            int i18 = 0;
            while (i18 < size) {
                Object obj = arrayList4.get(i18);
                i18++;
                TLRPC.User user = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    String publicUsername = UserObject.getPublicUsername(user);
                    if (TextUtils.isEmpty(publicUsername)) {
                        spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                    } else {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) publicUsername);
                        append.setSpan(new org.telegram.ui.Components.p41(ta.b.d("https://t.me/", publicUsername), (org.telegram.ui.Components.vz0) null), 0, append.length(), 33);
                        spannableStringBuilder.append((CharSequence) append);
                    }
                }
            }
            org.telegram.ui.Components.y4.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new e71(sessionsActivity, i14), sessionsActivity.resourceProvider, false);
            return;
        }
        if (i9 >= sessionsActivity.I && i9 < sessionsActivity.J) {
            if (sessionsActivity.getParentActivity() == null || (arrayList = sessionsActivity.h) == null || arrayList.isEmpty()) {
                return;
            }
            int i19 = i9 - sessionsActivity.I;
            new pf.g0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i19), new org.telegram.ui.Components.qd(sessionsActivity, i19, 25), sessionsActivity.resourceProvider).show();
            return;
        }
        if (((i9 < sessionsActivity.G || i9 >= sessionsActivity.H) && ((i9 < sessionsActivity.C || i9 >= sessionsActivity.D) && i9 != sessionsActivity.y)) || sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (i12 != 0) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
            if (i12 == 0) {
                c2Var3.P = LocaleController.getString(R.string.TerminateSessionText);
                c2Var3.N = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i9 - sessionsActivity.G);
                c2Var3.P = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                c2Var3.N = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                String firstName = user2 != null ? UserObject.getFirstName(user2) : "";
                org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(sessionsActivity.getParentActivity(), 1);
                z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                z1Var.e(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, firstName), "", false, false, false);
                z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                frameLayout.addView(z1Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                z1Var.setOnClickListener(new l8(i13, zArr));
                c2Var3.C = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new c3.e(sessionsActivity, i9, zArr, 14));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(c2Var3);
            TextView textView2 = (TextView) c2Var3.d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i9 == sessionsActivity.y) {
            tL_authorization = sessionsActivity.n;
            z10 = true;
        } else {
            int i20 = sessionsActivity.G;
            tL_authorization = (i9 < i20 || i9 >= sessionsActivity.H) ? (TLRPC.TL_authorization) sessionsActivity.f.get(i9 - sessionsActivity.C) : (TLRPC.TL_authorization) arrayList2.get(i9 - i20);
            z10 = false;
        }
        if (tL_authorization == null) {
            return;
        }
        h71 h71Var = new h71(sessionsActivity);
        y61 y61Var = new y61(sessionsActivity.getParentActivity(), false);
        y61Var.setOpenNoDelay(true);
        Activity parentActivity = sessionsActivity.getParentActivity();
        y61Var.b = tL_authorization;
        y61Var.c = sessionsActivity;
        y61Var.fixNavigationBar();
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(parentActivity);
        y61Var.d = pi0Var;
        pi0Var.setOnClickListener(new p61(y61Var));
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout2.addView(pi0Var, g7.e6.t(70, 70, 1, 0, 16, 0, 0));
        TextView textView3 = new TextView(parentActivity);
        j3.r0.u(20.0f, 2, textView3);
        j3.r0.w(org.telegram.ui.ActionBar.f6.G6, null, false, textView3, 17);
        linearLayout2.addView(textView3, g7.e6.t(-1, -2, 1, 21, 12, 21, 0));
        TextView textView4 = new TextView(parentActivity);
        textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false));
        textView4.setTextSize(2, 13.0f);
        textView4.setGravity(17);
        linearLayout2.addView(textView4, g7.e6.t(-1, -2, 1, 21, 4, 21, 21));
        textView4.setText((tL_authorization.flags & 1) != 0 ? LocaleController.getString(R.string.Online) : LocaleController.formatDateTime(tL_authorization.date_active, true));
        StringBuilder sb2 = new StringBuilder();
        if (tL_authorization.device_model.length() != 0) {
            sb2.append(tL_authorization.device_model);
        }
        if (sb2.length() == 0) {
            if (tL_authorization.platform.length() != 0) {
                sb2.append(tL_authorization.platform);
            }
            if (tL_authorization.system_version.length() != 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb2.append(" ");
                }
                sb2.append(tL_authorization.system_version);
            }
        }
        textView3.setText(sb2);
        String lowerCase = tL_authorization.platform.toLowerCase();
        if (lowerCase.isEmpty()) {
            lowerCase = tL_authorization.system_version.toLowerCase();
        }
        String lowerCase2 = tL_authorization.device_model.toLowerCase();
        if (lowerCase2.contains("safari")) {
            i10 = R.raw.safari_30;
            i11 = org.telegram.ui.ActionBar.f6.U7;
        } else if (lowerCase2.contains("edge")) {
            i10 = R.raw.edge_30;
            i11 = org.telegram.ui.ActionBar.f6.U7;
        } else if (lowerCase2.contains("chrome")) {
            i10 = R.raw.chrome_30;
            i11 = org.telegram.ui.ActionBar.f6.U7;
        } else if (lowerCase2.contains("firefox")) {
            i10 = R.raw.firefox_30;
            i11 = org.telegram.ui.ActionBar.f6.O7;
        } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
            i10 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
            i11 = org.telegram.ui.ActionBar.f6.U7;
            i14 = 0;
        } else {
            if (lowerCase.contains("ubuntu")) {
                i10 = R.raw.ubuntu_30;
                i11 = org.telegram.ui.ActionBar.f6.T7;
            } else if (lowerCase.contains("linux")) {
                i10 = R.raw.linux_30;
                i11 = org.telegram.ui.ActionBar.f6.T7;
            } else if (lowerCase.contains("ios")) {
                i10 = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                i11 = org.telegram.ui.ActionBar.f6.T7;
            } else if (lowerCase.contains("windows")) {
                i10 = R.raw.windows_30;
                i11 = org.telegram.ui.ActionBar.f6.S7;
            } else if (lowerCase.contains("macos")) {
                i10 = R.raw.mac_30;
                i11 = org.telegram.ui.ActionBar.f6.S7;
            } else if (lowerCase.contains("android")) {
                i10 = R.raw.android_30;
                i11 = org.telegram.ui.ActionBar.f6.R7;
            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                i10 = R.raw.windows_30;
                i11 = org.telegram.ui.ActionBar.f6.S7;
            } else {
                i10 = R.raw.chrome_30;
                i11 = org.telegram.ui.ActionBar.f6.U7;
            }
            i14 = 1;
        }
        pi0Var.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
        if (i14 != 0) {
            pi0Var.f(i10, 50, 50, new int[]{0, org.telegram.ui.ActionBar.f6.w0(null, i11, false)});
        } else {
            pi0Var.setImageDrawable(y61Var.getContext().getDrawable(i10));
        }
        x61 x61Var = new x61(parentActivity, false);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(tL_authorization.app_name);
        sb3.append(" ");
        sb3.append(tL_authorization.app_version);
        x61Var.b.setText(sb3);
        Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
        int i21 = org.telegram.ui.ActionBar.f6.m6;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i21, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
        x61Var.a.setImageDrawable(mutate);
        x61Var.c.setText(LocaleController.getString(R.string.Application));
        linearLayout2.addView(x61Var);
        if (tL_authorization.country.length() != 0) {
            x61 x61Var2 = new x61(parentActivity, false);
            x61Var2.b.setText(tL_authorization.country);
            Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
            x61Var2.a.setImageDrawable(mutate2);
            x61Var2.c.setText(LocaleController.getString(R.string.Location));
            x61Var2.setOnClickListener(new q61(y61Var, tL_authorization));
            x61Var2.setOnLongClickListener(new r61(y61Var, tL_authorization));
            x61Var2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
            linearLayout2.addView(x61Var2);
            x61Var.e = true;
            x61Var = x61Var2;
        }
        if (tL_authorization.ip.length() != 0) {
            x61 x61Var3 = new x61(parentActivity, false);
            x61Var3.b.setText(tL_authorization.ip);
            Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
            x61Var3.a.setImageDrawable(mutate3);
            x61Var3.c.setText(LocaleController.getString(R.string.IpAddress));
            x61Var3.setOnClickListener(new s61(y61Var, tL_authorization));
            x61Var3.setOnLongClickListener(new t61(y61Var, tL_authorization));
            x61Var3.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
            linearLayout2.addView(x61Var3);
            z11 = true;
            x61Var.e = true;
            x61Var = x61Var3;
        } else {
            z11 = true;
        }
        int i22 = tL_authorization.api_id;
        if (i22 != 2040 && i22 != 2496) {
            x61 x61Var4 = new x61(parentActivity, z11);
            x61Var4.b.setText(LocaleController.getString(R.string.AcceptSecretChats));
            Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
            x61Var4.a.setImageDrawable(mutate4);
            x61Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
            x61Var4.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 7, -1));
            x61Var4.setOnClickListener(new u61(y61Var, x61Var4, tL_authorization));
            x61Var.e = true;
            x61Var4.c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
            linearLayout2.addView(x61Var4);
            x61Var = x61Var4;
        }
        if (tL_authorization.api_id != 22) {
            x61 x61Var5 = new x61(parentActivity, true);
            x61Var5.b.setText(LocaleController.getString(R.string.AcceptCalls));
            Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
            mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i21, false), mode));
            x61Var5.a.setImageDrawable(mutate5);
            x61Var5.d.c(!tL_authorization.call_requests_disabled, false);
            x61Var5.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 7, -1));
            x61Var5.setOnClickListener(new v61(y61Var, x61Var5, tL_authorization));
            x61Var.e = true;
            x61Var5.c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
            linearLayout2.addView(x61Var5);
        }
        if (!z10) {
            TextView textView5 = new TextView(parentActivity);
            textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView5.setGravity(17);
            textView5.setTextSize(1, 14.0f);
            textView5.setTypeface(AndroidUtilities.bold());
            textView5.setText(LocaleController.getString(R.string.TerminateSession));
            textView5.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            int dp = AndroidUtilities.dp(24.0f);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ka, false);
            int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), 120);
            textView5.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w03, k10, k10));
            linearLayout2.addView(textView5, g7.e6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView5.setOnClickListener(new w61(y61Var, h71Var, tL_authorization, sessionsActivity));
        }
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayout2);
        y61Var.setCustomView(scrollView);
        y61Var.show();
    }

    public static /* synthetic */ void U(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.h.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new b71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new b71(sessionsActivity, 1));
    }

    public static /* synthetic */ void V(SessionsActivity sessionsActivity) {
        if (sessionsActivity.w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new b71(sessionsActivity, 2));
        } else {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new b71(sessionsActivity, 3));
        }
    }

    public static void W(SessionsActivity sessionsActivity, int i9, boolean[] zArr) {
        ArrayList arrayList = sessionsActivity.e;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(sessionsActivity.getParentActivity(), 3, null);
        c2Var.c0 = false;
        c2Var.show();
        if (sessionsActivity.w == 0) {
            int i10 = sessionsActivity.G;
            TLRPC.TL_authorization tL_authorization = (i9 < i10 || i9 >= sessionsActivity.H) ? (TLRPC.TL_authorization) sessionsActivity.f.get(i9 - sessionsActivity.C) : (TLRPC.TL_authorization) arrayList.get(i9 - i10);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new kr0(sessionsActivity, c2Var, tL_authorization, 8));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i9 - sessionsActivity.G);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new kr0(sessionsActivity, c2Var, tL_webAuthorization, 9));
        if (zArr[0]) {
            MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
        }
    }

    public static /* synthetic */ void X(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.e;
        sessionsActivity.r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.l0();
        }
        k71 k71Var = sessionsActivity.a;
        if (k71Var != null) {
            k71Var.l();
        }
        xw0 xw0Var = sessionsActivity.U;
        if (xw0Var != null) {
            xw0Var.a();
        }
        int i9 = sessionsActivity.R;
        if (i9 > 0) {
            int i10 = i9 - 1;
            sessionsActivity.R = i10;
            if (i10 > 0) {
                AndroidUtilities.runOnUIThread(new c71(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.d = e00Var;
        int i9 = 1;
        e00Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.w;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 24));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new k71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.c = yyVar;
        yyVar.b();
        frameLayout.addView(this.c, g7.e6.e(-1, -1, 17));
        w50 w50Var = new w50(this, context);
        this.b = w50Var;
        w50Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setLayoutManager(new of.y(i9, false, 17));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        w50 w50Var2 = this.b;
        w50Var2.U1 = true;
        w50Var2.V1 = 0;
        frameLayout.addView(w50Var2, g7.e6.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        f2.n nVar = new f2.n();
        nVar.n(150L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
        nVar.i = grVar;
        nVar.o = grVar;
        this.b.setItemAnimator(nVar);
        this.b.setOnItemClickListener(new c21(this, 4));
        if (i10 == 0) {
            g71 g71Var = new g71(this, context);
            this.s = g71Var;
            frameLayout.addView(g71Var, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        l0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.newSessionReceived) {
            j0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.t6.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
        int i9 = org.telegram.ui.ActionBar.f6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262148, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262148, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        int i11 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i9));
        int i12 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i12));
        return arrayList;
    }

    public final int i0() {
        ArrayList arrayList = this.e;
        if (arrayList.size() == 0 && this.r) {
            return 0;
        }
        return arrayList.size() + (this.w == 0 ? 1 : 0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(final boolean z10) {
        if (this.r) {
            return;
        }
        if (!z10) {
            this.r = true;
        }
        if (this.w == 0) {
            final int i9 = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.z61
                public final /* synthetic */ SessionsActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i9) {
                        case 0:
                            final int i10 = 0;
                            final SessionsActivity sessionsActivity = this.b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.a71
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.f;
                                            ArrayList arrayList2 = sessionsActivity2.e;
                                            sessionsActivity2.r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i11 = 0; i11 < size; i11++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i11);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.l0();
                                                xw0 xw0Var = sessionsActivity2.U;
                                                if (xw0Var != null) {
                                                    xw0Var.a();
                                                }
                                            }
                                            k71 k71Var = sessionsActivity2.a;
                                            if (k71Var != null) {
                                                k71Var.l();
                                            }
                                            xw0 xw0Var2 = sessionsActivity2.U;
                                            if (xw0Var2 != null) {
                                                xw0Var2.a();
                                            }
                                            int i12 = sessionsActivity2.R;
                                            if (i12 > 0) {
                                                int i13 = i12 - 1;
                                                sessionsActivity2.R = i13;
                                                if (i13 > 0) {
                                                    AndroidUtilities.runOnUIThread(new c71(sessionsActivity2, z11, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.X(sessionsActivity, tL_error, tLObject, z11);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i11 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.a71
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.f;
                                            ArrayList arrayList2 = sessionsActivity22.e;
                                            sessionsActivity22.r = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i112 = 0; i112 < size; i112++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i112);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.l0();
                                                xw0 xw0Var = sessionsActivity22.U;
                                                if (xw0Var != null) {
                                                    xw0Var.a();
                                                }
                                            }
                                            k71 k71Var = sessionsActivity22.a;
                                            if (k71Var != null) {
                                                k71Var.l();
                                            }
                                            xw0 xw0Var2 = sessionsActivity22.U;
                                            if (xw0Var2 != null) {
                                                xw0Var2.a();
                                            }
                                            int i12 = sessionsActivity22.R;
                                            if (i12 > 0) {
                                                int i13 = i12 - 1;
                                                sessionsActivity22.R = i13;
                                                if (i13 > 0) {
                                                    AndroidUtilities.runOnUIThread(new c71(sessionsActivity22, z12, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.X(sessionsActivity2, tL_error, tLObject, z12);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            }), this.classGuid);
            return;
        }
        final int i10 = 1;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.z61
            public final /* synthetic */ SessionsActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i10) {
                    case 0:
                        final int i102 = 0;
                        final SessionsActivity sessionsActivity = this.b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.a71
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i102) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i112 = 0; i112 < size; i112++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i112);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.l0();
                                            xw0 xw0Var = sessionsActivity22.U;
                                            if (xw0Var != null) {
                                                xw0Var.a();
                                            }
                                        }
                                        k71 k71Var = sessionsActivity22.a;
                                        if (k71Var != null) {
                                            k71Var.l();
                                        }
                                        xw0 xw0Var2 = sessionsActivity22.U;
                                        if (xw0Var2 != null) {
                                            xw0Var2.a();
                                        }
                                        int i12 = sessionsActivity22.R;
                                        if (i12 > 0) {
                                            int i13 = i12 - 1;
                                            sessionsActivity22.R = i13;
                                            if (i13 > 0) {
                                                AndroidUtilities.runOnUIThread(new c71(sessionsActivity22, z11, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.X(sessionsActivity, tL_error, tLObject, z11);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i11 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.a71
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.f;
                                        ArrayList arrayList2 = sessionsActivity22.e;
                                        sessionsActivity22.r = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i112 = 0; i112 < size; i112++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i112);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.l0();
                                            xw0 xw0Var = sessionsActivity22.U;
                                            if (xw0Var != null) {
                                                xw0Var.a();
                                            }
                                        }
                                        k71 k71Var = sessionsActivity22.a;
                                        if (k71Var != null) {
                                            k71Var.l();
                                        }
                                        xw0 xw0Var2 = sessionsActivity22.U;
                                        if (xw0Var2 != null) {
                                            xw0Var2.a();
                                        }
                                        int i12 = sessionsActivity22.R;
                                        if (i12 > 0) {
                                            int i13 = i12 - 1;
                                            sessionsActivity22.R = i13;
                                            if (i13 > 0) {
                                                AndroidUtilities.runOnUIThread(new c71(sessionsActivity22, z12, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.X(sessionsActivity2, tL_error, tLObject, z12);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }), this.classGuid);
    }

    public final void k0() {
        this.S = true;
    }

    public final void l0() {
        this.O = 0;
        this.x = -1;
        this.y = -1;
        this.terminateAllSessionsRow = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.ttlRow = -1;
        this.Q = -1;
        int i9 = this.w;
        if (i9 == 0 && getMessagesController().qrLoginCamera) {
            int i10 = this.O;
            this.M = i10;
            this.O = i10 + 2;
            this.N = i10 + 1;
        }
        if (this.r) {
            if (i9 == 0) {
                int i11 = this.O;
                this.x = i11;
                this.O = i11 + 2;
                this.y = i11 + 1;
                return;
            }
            return;
        }
        if (this.n != null) {
            int i12 = this.O;
            this.x = i12;
            this.O = i12 + 2;
            this.y = i12 + 1;
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.A = -1;
            if (i9 == 1 || this.n != null) {
                int i13 = this.O;
                this.O = i13 + 1;
                this.L = i13;
            } else {
                this.L = -1;
            }
        } else {
            int i14 = this.O;
            this.terminateAllSessionsRow = i14;
            this.O = i14 + 2;
            this.A = i14 + 1;
            this.L = -1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.O;
            int i16 = i15 + 1;
            this.O = i16;
            this.B = i15;
            this.C = i16;
            int size = arrayList.size() + i16;
            this.D = size;
            this.O = size + 1;
            this.E = size;
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i17 = this.O;
                int i18 = i17 + 1;
                this.O = i18;
                this.F = i17;
                this.I = i18;
                int size2 = this.h.size() + i18;
                this.J = size2;
                this.O = size2 + 1;
                this.K = size2;
            }
        } else {
            int i19 = this.O;
            this.O = i19 + 1;
            this.F = i19;
            ArrayList arrayList4 = this.h;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.O;
                this.I = i20;
                int size3 = this.h.size() + i20;
                this.O = size3;
                this.J = size3;
            }
            int i21 = this.O;
            this.G = i21;
            this.H = arrayList2.size() + i21;
            int size4 = arrayList2.size() + this.O;
            this.O = size4 + 1;
            this.K = size4;
        }
        if (this.v > 0) {
            int i22 = this.O;
            this.P = i22;
            this.ttlRow = i22 + 1;
            this.O = i22 + 3;
            this.Q = i22 + 2;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        g71 g71Var = this.s;
        if (g71Var != null) {
            g71Var.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        l0();
        j0(false);
        if (this.w == 0) {
            pf.g.a(this.currentAccount).c(new e71(this, 0));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.b.setPadding(0, 0, 0, i12);
        this.b.setClipToPadding(false);
        g71 g71Var = this.s;
        if (g71Var != null) {
            g71Var.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        g71 g71Var = this.s;
        if (g71Var != null) {
            g71Var.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i9 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.d0(getParentActivity(), 2, new j71(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new f71(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        k71 k71Var = this.a;
        if (k71Var != null) {
            k71Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.T = true;
        for (int i9 = 0; i9 < this.b.getChildCount(); i9++) {
            View childAt = this.b.getChildAt(i9);
            if (childAt instanceof l71) {
                ((l71) childAt).b.invalidate();
            }
        }
    }
}
