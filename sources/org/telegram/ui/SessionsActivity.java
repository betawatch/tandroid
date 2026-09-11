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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public cy0 Y;
    public t81 a;
    public r60 b;
    public org.telegram.ui.Components.mz c;
    public org.telegram.ui.Components.t00 d;
    public final ArrayList e;
    public final ArrayList f;
    public ArrayList h;
    public TLRPC.TL_authorization n;
    public boolean r;
    public p81 s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public int v;
    public final int w;
    public int x;
    public int y;

    public SessionsActivity(int i10) {
        super(null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.V = 0;
        this.w = i10;
    }

    public static void U(SessionsActivity sessionsActivity, int i10) {
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        ArrayList arrayList;
        String string;
        ArrayList arrayList2 = sessionsActivity.e;
        int i13 = sessionsActivity.w;
        int i14 = 6;
        float f7 = 4.0f;
        int i15 = 1;
        if (i10 != sessionsActivity.ttlRow) {
            if (i10 == sessionsActivity.terminateAllSessionsRow) {
                if (sessionsActivity.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList3 = sessionsActivity.h;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (i13 == 0) {
                        b2Var.T = LocaleController.getString(R.string.AreYouSureSessions);
                        b2Var.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                        string = LocaleController.getString(R.string.Terminate);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                        b2Var.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                        string = LocaleController.getString(R.string.Disconnect);
                    }
                    alertDialog$Builder.k(string, new n81(sessionsActivity, i15));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    sessionsActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                        return;
                    }
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = sessionsActivity.h;
                int size = arrayList4.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList4.get(i16);
                    i16++;
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
                            append.setSpan(new org.telegram.ui.Components.l51(org.telegram.ui.Cells.p6.i("https://t.me/", publicUsername), (org.telegram.ui.Components.n01) null), 0, append.length(), 33);
                            spannableStringBuilder.append((CharSequence) append);
                        }
                    }
                }
                org.telegram.ui.Components.e5.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new m81(sessionsActivity, i15), sessionsActivity.resourceProvider, false);
                return;
            }
            if (i10 >= sessionsActivity.M && i10 < sessionsActivity.N) {
                if (sessionsActivity.getParentActivity() == null || (arrayList = sessionsActivity.h) == null || arrayList.isEmpty()) {
                    return;
                }
                int i17 = i10 - sessionsActivity.M;
                new ig.k0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i17), new org.telegram.ui.Components.m8(sessionsActivity, i17, 28), sessionsActivity.resourceProvider).show();
                return;
            }
            if (((i10 < sessionsActivity.K || i10 >= sessionsActivity.L) && ((i10 < sessionsActivity.G || i10 >= sessionsActivity.H) && i10 != sessionsActivity.y)) || sessionsActivity.getParentActivity() == null) {
                return;
            }
            if (i13 != 0) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                boolean[] zArr = new boolean[1];
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                if (i13 == 0) {
                    b2Var2.T = LocaleController.getString(R.string.TerminateSessionText);
                    b2Var2.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
                    charSequence = LocaleController.getString(R.string.Terminate);
                } else {
                    TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.K);
                    b2Var2.T = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                    b2Var2.R = LocaleController.getString(R.string.TerminateWebSessionTitle);
                    CharSequence string2 = LocaleController.getString(R.string.Disconnect);
                    FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                    TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                    String firstName = user2 != null ? UserObject.getFirstName(user2) : "";
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(sessionsActivity.getParentActivity(), 1);
                    z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    z1Var.e(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, firstName), "", false, false, false);
                    z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(z1Var, w7.x5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1Var.setOnClickListener(new m8(i14, zArr));
                    b2Var2.G = 16;
                    alertDialog$Builder2.n(frameLayout);
                    charSequence = string2;
                }
                alertDialog$Builder2.k(charSequence, new hg.c2(sessionsActivity, i10, zArr, 15));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(b2Var2);
                TextView textView2 = (TextView) b2Var2.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            if (i10 == sessionsActivity.y) {
                tL_authorization = sessionsActivity.n;
                z10 = true;
            } else {
                int i18 = sessionsActivity.K;
                tL_authorization = (i10 < i18 || i10 >= sessionsActivity.L) ? (TLRPC.TL_authorization) sessionsActivity.f.get(i10 - sessionsActivity.G) : (TLRPC.TL_authorization) arrayList2.get(i10 - i18);
                z10 = false;
            }
            if (tL_authorization == null) {
                return;
            }
            q81 q81Var = new q81(sessionsActivity);
            g81 g81Var = new g81(sessionsActivity.getParentActivity(), false);
            g81Var.setOpenNoDelay(true);
            Activity parentActivity = sessionsActivity.getParentActivity();
            g81Var.b = tL_authorization;
            g81Var.c = sessionsActivity;
            g81Var.fixNavigationBar();
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(parentActivity);
            g81Var.d = aj0Var;
            aj0Var.setOnClickListener(new x71(g81Var));
            aj0Var.setScaleType(ImageView.ScaleType.CENTER);
            linearLayout.addView(aj0Var, w7.x5.t(70, 70, 1, 0, 16, 0, 0));
            TextView textView3 = new TextView(parentActivity);
            com.google.android.gms.internal.vision.e2.m(20.0f, 2, textView3);
            com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.G6, null, false, textView3, 17);
            linearLayout.addView(textView3, w7.x5.t(-1, -2, 1, 21, 12, 21, 0));
            TextView textView4 = new TextView(parentActivity);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
            textView4.setTextSize(2, 13.0f);
            textView4.setGravity(17);
            linearLayout.addView(textView4, w7.x5.t(-1, -2, 1, 21, 4, 21, 21));
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
                i11 = R.raw.safari_30;
                i12 = org.telegram.ui.ActionBar.j6.U7;
            } else if (lowerCase2.contains("edge")) {
                i11 = R.raw.edge_30;
                i12 = org.telegram.ui.ActionBar.j6.U7;
            } else if (lowerCase2.contains("chrome")) {
                i11 = R.raw.chrome_30;
                i12 = org.telegram.ui.ActionBar.j6.U7;
            } else if (lowerCase2.contains("firefox")) {
                i11 = R.raw.firefox_30;
                i12 = org.telegram.ui.ActionBar.j6.O7;
            } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
                i11 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
                i12 = org.telegram.ui.ActionBar.j6.U7;
                i15 = 0;
            } else {
                if (lowerCase.contains("ubuntu")) {
                    i11 = R.raw.ubuntu_30;
                    i12 = org.telegram.ui.ActionBar.j6.T7;
                } else if (lowerCase.contains("linux")) {
                    i11 = R.raw.linux_30;
                    i12 = org.telegram.ui.ActionBar.j6.T7;
                } else if (lowerCase.contains("ios")) {
                    i11 = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                    i12 = org.telegram.ui.ActionBar.j6.T7;
                } else if (lowerCase.contains("windows")) {
                    i11 = R.raw.windows_30;
                    i12 = org.telegram.ui.ActionBar.j6.S7;
                } else if (lowerCase.contains("macos")) {
                    i11 = R.raw.mac_30;
                    i12 = org.telegram.ui.ActionBar.j6.S7;
                } else if (lowerCase.contains("android")) {
                    i11 = R.raw.android_30;
                    i12 = org.telegram.ui.ActionBar.j6.R7;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i11 = R.raw.windows_30;
                    i12 = org.telegram.ui.ActionBar.j6.S7;
                } else {
                    i11 = R.raw.chrome_30;
                    i12 = org.telegram.ui.ActionBar.j6.U7;
                }
                i15 = 1;
            }
            aj0Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
            if (i15 != 0) {
                aj0Var.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.j6.w0(null, i12, false)});
            } else {
                aj0Var.setImageDrawable(g81Var.getContext().getDrawable(i11));
            }
            f81 f81Var = new f81(parentActivity, false);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_authorization.app_name);
            sb3.append(" ");
            sb3.append(tL_authorization.app_version);
            f81Var.b.setText(sb3);
            Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
            int i19 = org.telegram.ui.ActionBar.j6.m6;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i19, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            f81Var.a.setImageDrawable(mutate);
            f81Var.c.setText(LocaleController.getString(R.string.Application));
            linearLayout.addView(f81Var);
            if (tL_authorization.country.length() != 0) {
                f81 f81Var2 = new f81(parentActivity, false);
                f81Var2.b.setText(tL_authorization.country);
                Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i19, false), mode));
                f81Var2.a.setImageDrawable(mutate2);
                f81Var2.c.setText(LocaleController.getString(R.string.Location));
                f81Var2.setOnClickListener(new y71(g81Var, tL_authorization));
                f81Var2.setOnLongClickListener(new z71(g81Var, tL_authorization));
                f81Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                linearLayout.addView(f81Var2);
                f81Var.e = true;
                f81Var = f81Var2;
            }
            if (tL_authorization.ip.length() != 0) {
                f81 f81Var3 = new f81(parentActivity, false);
                f81Var3.b.setText(tL_authorization.ip);
                Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i19, false), mode));
                f81Var3.a.setImageDrawable(mutate3);
                f81Var3.c.setText(LocaleController.getString(R.string.IpAddress));
                f81Var3.setOnClickListener(new a81(g81Var, tL_authorization));
                f81Var3.setOnLongClickListener(new b81(g81Var, tL_authorization));
                f81Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                linearLayout.addView(f81Var3);
                z11 = true;
                f81Var.e = true;
                f81Var = f81Var3;
            } else {
                z11 = true;
            }
            int i20 = tL_authorization.api_id;
            if (i20 != 2040 && i20 != 2496) {
                f81 f81Var4 = new f81(parentActivity, z11);
                f81Var4.b.setText(LocaleController.getString(R.string.AcceptSecretChats));
                Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i19, false), mode));
                f81Var4.a.setImageDrawable(mutate4);
                f81Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
                f81Var4.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
                f81Var4.setOnClickListener(new c81(g81Var, f81Var4, tL_authorization));
                f81Var.e = true;
                f81Var4.c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
                linearLayout.addView(f81Var4);
                f81Var = f81Var4;
            }
            if (tL_authorization.api_id != 22) {
                f81 f81Var5 = new f81(parentActivity, true);
                f81Var5.b.setText(LocaleController.getString(R.string.AcceptCalls));
                Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i19, false), mode));
                f81Var5.a.setImageDrawable(mutate5);
                f81Var5.d.c(!tL_authorization.call_requests_disabled, false);
                f81Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
                f81Var5.setOnClickListener(new d81(g81Var, f81Var5, tL_authorization));
                f81Var.e = true;
                f81Var5.c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
                linearLayout.addView(f81Var5);
            }
            if (!z10) {
                TextView textView5 = new TextView(parentActivity);
                textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                textView5.setGravity(17);
                textView5.setTextSize(1, 14.0f);
                textView5.setTypeface(AndroidUtilities.bold());
                textView5.setText(LocaleController.getString(R.string.TerminateSession));
                textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                int dp = AndroidUtilities.dp(24.0f);
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ka, false);
                int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), 120);
                textView5.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w03, k10, k10));
                linearLayout.addView(textView5, w7.x5.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                textView5.setOnClickListener(new e81(g81Var, q81Var, tL_authorization, sessionsActivity));
            }
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.addView(linearLayout);
            g81Var.setCustomView(scrollView);
            g81Var.show();
            return;
        }
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        int i21 = sessionsActivity.v;
        int i22 = i21 <= 7 ? 0 : i21 <= 93 ? 1 : i21 <= 183 ? 2 : 3;
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
        String string3 = LocaleController.getString(R.string.SessionsSelfDestruct);
        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
        b2Var3.R = string3;
        String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
        LinearLayout linearLayout2 = new LinearLayout(sessionsActivity.getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder3.n(linearLayout2);
        int i23 = 0;
        while (true) {
            int i24 = 4;
            if (i23 >= 4) {
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(b2Var3);
                return;
            }
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(sessionsActivity.getParentActivity(), null);
            k6Var.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(4.0f), 0);
            k6Var.setTag(Integer.valueOf(i23));
            k6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
            k6Var.b(strArr[i23], i22 == i23);
            linearLayout2.addView(k6Var);
            k6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            k6Var.setOnClickListener(new wy0(i24, sessionsActivity, alertDialog$Builder3));
            i23++;
            f7 = 4.0f;
        }
    }

    public static /* synthetic */ void V(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.h.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new j81(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new j81(sessionsActivity, 1));
    }

    public static /* synthetic */ void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new j81(sessionsActivity, 2));
        } else {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new j81(sessionsActivity, 3));
        }
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        ArrayList arrayList = sessionsActivity.e;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(sessionsActivity.getParentActivity(), 3, null);
        b2Var.g0 = false;
        b2Var.show();
        if (sessionsActivity.w == 0) {
            int i11 = sessionsActivity.K;
            TLRPC.TL_authorization tL_authorization = (i10 < i11 || i10 >= sessionsActivity.L) ? (TLRPC.TL_authorization) sessionsActivity.f.get(i10 - sessionsActivity.G) : (TLRPC.TL_authorization) arrayList.get(i10 - i11);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new ms0(sessionsActivity, b2Var, tL_authorization, 8));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.K);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new ms0(sessionsActivity, b2Var, tL_webAuthorization, 9));
        if (zArr[0]) {
            MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
        }
    }

    public static /* synthetic */ void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.e;
        sessionsActivity.r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        t81 t81Var = sessionsActivity.a;
        if (t81Var != null) {
            t81Var.l();
        }
        cy0 cy0Var = sessionsActivity.Y;
        if (cy0Var != null) {
            cy0Var.a();
        }
        int i10 = sessionsActivity.V;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.V = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new k81(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.d = t00Var;
        int i10 = 1;
        t00Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.w;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 0));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new t81(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.c = mzVar;
        mzVar.b();
        frameLayout.addView(this.c, w7.x5.e(-1, -1, 17));
        r60 r60Var = new r60(this, context);
        this.b = r60Var;
        r60Var.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setLayoutManager(new hg.b0(i10, false, 18));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        r60 r60Var2 = this.b;
        r60Var2.Y1 = true;
        r60Var2.Z1 = 0;
        frameLayout.addView(r60Var2, w7.x5.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        s4.j jVar = new s4.j();
        jVar.n(150L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
        jVar.i = prVar;
        jVar.o = prVar;
        this.b.setItemAnimator(jVar);
        this.b.setOnItemClickListener(new b31(this, 5));
        if (i11 == 0) {
            p81 p81Var = new p81(this, context);
            this.s = p81Var;
            frameLayout.addView(p81Var, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        m0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newSessionReceived) {
            k0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.u6.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        int i10 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262148, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262148, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i10));
        int i13 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i13));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int j0() {
        ArrayList arrayList = this.e;
        if (arrayList.size() == 0 && this.r) {
            return 0;
        }
        return arrayList.size() + (this.w == 0 ? 1 : 0);
    }

    public final void k0(final boolean z10) {
        if (this.r) {
            return;
        }
        if (!z10) {
            this.r = true;
        }
        if (this.w == 0) {
            final int i10 = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.h81
                public final /* synthetic */ SessionsActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i10) {
                        case 0:
                            final int i11 = 0;
                            final SessionsActivity sessionsActivity = this.b;
                            final boolean z11 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.i81
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
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
                                                for (int i12 = 0; i12 < size; i12++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i12);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.m0();
                                                cy0 cy0Var = sessionsActivity2.Y;
                                                if (cy0Var != null) {
                                                    cy0Var.a();
                                                }
                                            }
                                            t81 t81Var = sessionsActivity2.a;
                                            if (t81Var != null) {
                                                t81Var.l();
                                            }
                                            cy0 cy0Var2 = sessionsActivity2.Y;
                                            if (cy0Var2 != null) {
                                                cy0Var2.a();
                                            }
                                            int i13 = sessionsActivity2.V;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity2.V = i14;
                                                if (i14 > 0) {
                                                    AndroidUtilities.runOnUIThread(new k81(sessionsActivity2, z11, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z11);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i12 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.i81
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
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
                                                for (int i122 = 0; i122 < size; i122++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i122);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.n = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.m0();
                                                cy0 cy0Var = sessionsActivity22.Y;
                                                if (cy0Var != null) {
                                                    cy0Var.a();
                                                }
                                            }
                                            t81 t81Var = sessionsActivity22.a;
                                            if (t81Var != null) {
                                                t81Var.l();
                                            }
                                            cy0 cy0Var2 = sessionsActivity22.Y;
                                            if (cy0Var2 != null) {
                                                cy0Var2.a();
                                            }
                                            int i13 = sessionsActivity22.V;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity22.V = i14;
                                                if (i14 > 0) {
                                                    AndroidUtilities.runOnUIThread(new k81(sessionsActivity22, z12, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z12);
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
        final int i11 = 1;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.h81
            public final /* synthetic */ SessionsActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i11) {
                    case 0:
                        final int i112 = 0;
                        final SessionsActivity sessionsActivity = this.b;
                        final boolean z11 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.i81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
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
                                            for (int i122 = 0; i122 < size; i122++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i122);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            cy0 cy0Var = sessionsActivity22.Y;
                                            if (cy0Var != null) {
                                                cy0Var.a();
                                            }
                                        }
                                        t81 t81Var = sessionsActivity22.a;
                                        if (t81Var != null) {
                                            t81Var.l();
                                        }
                                        cy0 cy0Var2 = sessionsActivity22.Y;
                                        if (cy0Var2 != null) {
                                            cy0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.V;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.V = i14;
                                            if (i14 > 0) {
                                                AndroidUtilities.runOnUIThread(new k81(sessionsActivity22, z11, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z11);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i12 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.i81
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
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
                                            for (int i122 = 0; i122 < size; i122++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i122);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.n = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.v = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.m0();
                                            cy0 cy0Var = sessionsActivity22.Y;
                                            if (cy0Var != null) {
                                                cy0Var.a();
                                            }
                                        }
                                        t81 t81Var = sessionsActivity22.a;
                                        if (t81Var != null) {
                                            t81Var.l();
                                        }
                                        cy0 cy0Var2 = sessionsActivity22.Y;
                                        if (cy0Var2 != null) {
                                            cy0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.V;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.V = i14;
                                            if (i14 > 0) {
                                                AndroidUtilities.runOnUIThread(new k81(sessionsActivity22, z12, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z12);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }), this.classGuid);
    }

    public final void l0() {
        this.W = true;
    }

    public final void m0() {
        this.S = 0;
        this.x = -1;
        this.y = -1;
        this.terminateAllSessionsRow = -1;
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
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.T = -1;
        this.ttlRow = -1;
        this.U = -1;
        int i10 = this.w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.S;
            this.Q = i11;
            this.S = i11 + 2;
            this.R = i11 + 1;
        }
        if (this.r) {
            if (i10 == 0) {
                int i12 = this.S;
                this.x = i12;
                this.S = i12 + 2;
                this.y = i12 + 1;
                return;
            }
            return;
        }
        if (this.n != null) {
            int i13 = this.S;
            this.x = i13;
            this.S = i13 + 2;
            this.y = i13 + 1;
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i10 == 1 || this.n != null) {
                int i14 = this.S;
                this.S = i14 + 1;
                this.P = i14;
            } else {
                this.P = -1;
            }
        } else {
            int i15 = this.S;
            this.terminateAllSessionsRow = i15;
            this.S = i15 + 2;
            this.E = i15 + 1;
            this.P = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.S;
            int i17 = i16 + 1;
            this.S = i17;
            this.F = i16;
            this.G = i17;
            int size = arrayList.size() + i17;
            this.H = size;
            this.S = size + 1;
            this.I = size;
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.S;
                int i19 = i18 + 1;
                this.S = i19;
                this.J = i18;
                this.M = i19;
                int size2 = this.h.size() + i19;
                this.N = size2;
                this.S = size2 + 1;
                this.O = size2;
            }
        } else {
            int i20 = this.S;
            this.S = i20 + 1;
            this.J = i20;
            ArrayList arrayList4 = this.h;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.S;
                this.M = i21;
                int size3 = this.h.size() + i21;
                this.S = size3;
                this.N = size3;
            }
            int i22 = this.S;
            this.K = i22;
            this.L = arrayList2.size() + i22;
            int size4 = arrayList2.size() + this.S;
            this.S = size4 + 1;
            this.O = size4;
        }
        if (this.v > 0) {
            int i23 = this.S;
            this.T = i23;
            this.ttlRow = i23 + 1;
            this.S = i23 + 3;
            this.U = i23 + 2;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        p81 p81Var = this.s;
        if (p81Var != null) {
            p81Var.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.w == 0) {
            ig.f.a(this.currentAccount).c(new m81(this, 0));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
        p81 p81Var = this.s;
        if (p81Var != null) {
            p81Var.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        p81 p81Var = this.s;
        if (p81Var != null) {
            p81Var.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.e0(getParentActivity(), 2, new s81(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new n81(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        t81 t81Var = this.a;
        if (t81Var != null) {
            t81Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.X = true;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof u81) {
                ((u81) childAt).b.invalidate();
            }
        }
    }
}
