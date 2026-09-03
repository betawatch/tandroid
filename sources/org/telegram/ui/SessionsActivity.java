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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public int S;
    public boolean T;
    public boolean U;
    public ox0 V;
    public i81 a;
    public d81 b;
    public org.telegram.ui.Components.mz c;
    public org.telegram.ui.Components.u00 d;
    public final ArrayList e;
    public final ArrayList f;
    public ArrayList h;
    public TLRPC.TL_authorization n;
    public boolean r;
    public e81 s;
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
        this.S = 0;
        this.w = i10;
    }

    public static void U(SessionsActivity sessionsActivity, int i10) {
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z4;
        int i11;
        int i12;
        boolean z10;
        ArrayList arrayList;
        String string;
        ArrayList arrayList2 = sessionsActivity.e;
        int i13 = sessionsActivity.w;
        int i14 = 6;
        int i15 = 1;
        if (i10 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            int i16 = sessionsActivity.v;
            int i17 = i16 <= 7 ? 0 : i16 <= 93 ? 1 : i16 <= 183 ? 2 : 3;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.SessionsSelfDestruct);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string2;
            String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
            LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            int i18 = 0;
            while (i18 < 4) {
                org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(sessionsActivity.getParentActivity(), null);
                j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                j6Var.setTag(Integer.valueOf(i18));
                j6Var.a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
                j6Var.b(strArr[i18], i17 == i18);
                linearLayout.addView(j6Var);
                j6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                j6Var.setOnClickListener(new ib0(19, sessionsActivity, alertDialog$Builder));
                i18++;
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(d2Var);
            return;
        }
        if (i10 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            ArrayList arrayList3 = sessionsActivity.h;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                if (i13 == 0) {
                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureSessions);
                    d2Var2.O = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    d2Var2.Q = LocaleController.getString(R.string.AreYouSureWebSessions);
                    d2Var2.O = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new c81(sessionsActivity, i15));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(d2Var2);
                TextView textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList4 = sessionsActivity.h;
            int size = arrayList4.size();
            int i19 = 0;
            while (i19 < size) {
                Object obj = arrayList4.get(i19);
                i19++;
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
                        append.setSpan(new org.telegram.ui.Components.m51(vh.w2.e("https://t.me/", publicUsername), (org.telegram.ui.Components.s01) null), 0, append.length(), 33);
                        spannableStringBuilder.append((CharSequence) append);
                    }
                }
            }
            org.telegram.ui.Components.z4.i0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new b81(sessionsActivity, i15), sessionsActivity.resourceProvider, false);
            return;
        }
        if (i10 >= sessionsActivity.J && i10 < sessionsActivity.K) {
            if (sessionsActivity.getParentActivity() == null || (arrayList = sessionsActivity.h) == null || arrayList.isEmpty()) {
                return;
            }
            int i20 = i10 - sessionsActivity.J;
            new uf.f0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.h.get(i20), new org.telegram.ui.Components.dw(sessionsActivity, i20, 24), sessionsActivity.resourceProvider).show();
            return;
        }
        if (((i10 < sessionsActivity.H || i10 >= sessionsActivity.I) && ((i10 < sessionsActivity.D || i10 >= sessionsActivity.E) && i10 != sessionsActivity.y)) || sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (i13 != 0) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
            if (i13 == 0) {
                d2Var3.Q = LocaleController.getString(R.string.TerminateSessionText);
                d2Var3.O = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.H);
                d2Var3.Q = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                d2Var3.O = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                String firstName = user2 != null ? UserObject.getFirstName(user2) : "";
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(sessionsActivity.getParentActivity(), 1);
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                y1Var.e(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, firstName), "", false, false, false);
                y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                frameLayout.addView(y1Var, k7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                y1Var.setOnClickListener(new q8(i14, zArr));
                d2Var3.D = 16;
                alertDialog$Builder3.n(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new e3.d(sessionsActivity, i10, zArr, 13));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(d2Var3);
            TextView textView2 = (TextView) d2Var3.d(-1);
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        if (i10 == sessionsActivity.y) {
            tL_authorization = sessionsActivity.n;
            z4 = true;
        } else {
            int i21 = sessionsActivity.H;
            tL_authorization = (i10 < i21 || i10 >= sessionsActivity.I) ? (TLRPC.TL_authorization) sessionsActivity.f.get(i10 - sessionsActivity.D) : (TLRPC.TL_authorization) arrayList2.get(i10 - i21);
            z4 = false;
        }
        if (tL_authorization == null) {
            return;
        }
        f81 f81Var = new f81(sessionsActivity);
        v71 v71Var = new v71(sessionsActivity.getParentActivity(), false);
        v71Var.setOpenNoDelay(true);
        Activity parentActivity = sessionsActivity.getParentActivity();
        v71Var.b = tL_authorization;
        v71Var.c = sessionsActivity;
        v71Var.fixNavigationBar();
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(parentActivity);
        v71Var.d = jj0Var;
        jj0Var.setOnClickListener(new m71(v71Var));
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout2.addView(jj0Var, k7.b6.t(70, 70, 1, 0, 16, 0, 0));
        TextView textView3 = new TextView(parentActivity);
        ai.o(20.0f, 2, textView3);
        ai.s(org.telegram.ui.ActionBar.j6.G6, null, false, textView3, 17);
        linearLayout2.addView(textView3, k7.b6.t(-1, -2, 1, 21, 12, 21, 0));
        TextView textView4 = new TextView(parentActivity);
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
        textView4.setTextSize(2, 13.0f);
        textView4.setGravity(17);
        linearLayout2.addView(textView4, k7.b6.t(-1, -2, 1, 21, 4, 21, 21));
        textView4.setText((tL_authorization.flags & 1) != 0 ? LocaleController.getString(R.string.Online) : LocaleController.formatDateTime(tL_authorization.date_active, true));
        StringBuilder sb = new StringBuilder();
        if (tL_authorization.device_model.length() != 0) {
            sb.append(tL_authorization.device_model);
        }
        if (sb.length() == 0) {
            if (tL_authorization.platform.length() != 0) {
                sb.append(tL_authorization.platform);
            }
            if (tL_authorization.system_version.length() != 0) {
                if (tL_authorization.platform.length() != 0) {
                    sb.append(" ");
                }
                sb.append(tL_authorization.system_version);
            }
        }
        textView3.setText(sb);
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
        jj0Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        if (i15 != 0) {
            jj0Var.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.j6.w0(null, i12, false)});
        } else {
            jj0Var.setImageDrawable(v71Var.getContext().getDrawable(i11));
        }
        u71 u71Var = new u71(parentActivity, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_authorization.app_name);
        sb2.append(" ");
        sb2.append(tL_authorization.app_version);
        u71Var.b.setText(sb2);
        Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
        int i22 = org.telegram.ui.ActionBar.j6.m6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
        u71Var.a.setImageDrawable(mutate);
        u71Var.c.setText(LocaleController.getString(R.string.Application));
        linearLayout2.addView(u71Var);
        if (tL_authorization.country.length() != 0) {
            u71 u71Var2 = new u71(parentActivity, false);
            u71Var2.b.setText(tL_authorization.country);
            Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
            u71Var2.a.setImageDrawable(mutate2);
            u71Var2.c.setText(LocaleController.getString(R.string.Location));
            u71Var2.setOnClickListener(new n71(v71Var, tL_authorization));
            u71Var2.setOnLongClickListener(new o71(v71Var, tL_authorization));
            u71Var2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            linearLayout2.addView(u71Var2);
            u71Var.e = true;
            u71Var = u71Var2;
        }
        if (tL_authorization.ip.length() != 0) {
            u71 u71Var3 = new u71(parentActivity, false);
            u71Var3.b.setText(tL_authorization.ip);
            Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
            u71Var3.a.setImageDrawable(mutate3);
            u71Var3.c.setText(LocaleController.getString(R.string.IpAddress));
            u71Var3.setOnClickListener(new p71(v71Var, tL_authorization));
            u71Var3.setOnLongClickListener(new q71(v71Var, tL_authorization));
            u71Var3.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
            linearLayout2.addView(u71Var3);
            z10 = true;
            u71Var.e = true;
            u71Var = u71Var3;
        } else {
            z10 = true;
        }
        int i23 = tL_authorization.api_id;
        if (i23 != 2040 && i23 != 2496) {
            u71 u71Var4 = new u71(parentActivity, z10);
            u71Var4.b.setText(LocaleController.getString(R.string.AcceptSecretChats));
            Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
            u71Var4.a.setImageDrawable(mutate4);
            u71Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
            u71Var4.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
            u71Var4.setOnClickListener(new r71(v71Var, u71Var4, tL_authorization));
            u71Var.e = true;
            u71Var4.c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
            linearLayout2.addView(u71Var4);
            u71Var = u71Var4;
        }
        if (tL_authorization.api_id != 22) {
            u71 u71Var5 = new u71(parentActivity, true);
            u71Var5.b.setText(LocaleController.getString(R.string.AcceptCalls));
            Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
            mutate5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i22, false), mode));
            u71Var5.a.setImageDrawable(mutate5);
            u71Var5.d.c(!tL_authorization.call_requests_disabled, false);
            u71Var5.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 7, -1));
            u71Var5.setOnClickListener(new s71(v71Var, u71Var5, tL_authorization));
            u71Var.e = true;
            u71Var5.c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
            linearLayout2.addView(u71Var5);
        }
        if (!z4) {
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
            linearLayout2.addView(textView5, k7.b6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView5.setOnClickListener(new t71(v71Var, f81Var, tL_authorization, sessionsActivity));
        }
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayout2);
        v71Var.setCustomView(scrollView);
        v71Var.show();
    }

    public static /* synthetic */ void V(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.h) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.h.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new y71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new y71(sessionsActivity, 1));
    }

    public static /* synthetic */ void W(SessionsActivity sessionsActivity) {
        if (sessionsActivity.w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new y71(sessionsActivity, 2));
        } else {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new y71(sessionsActivity, 3));
        }
    }

    public static void X(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        ArrayList arrayList = sessionsActivity.e;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(sessionsActivity.getParentActivity(), 3, null);
        d2Var.d0 = false;
        d2Var.show();
        if (sessionsActivity.w == 0) {
            int i11 = sessionsActivity.H;
            TLRPC.TL_authorization tL_authorization = (i10 < i11 || i10 >= sessionsActivity.I) ? (TLRPC.TL_authorization) sessionsActivity.f.get(i10 - sessionsActivity.D) : (TLRPC.TL_authorization) arrayList.get(i10 - i11);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new yr0(sessionsActivity, d2Var, tL_authorization, 8));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.H);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new yr0(sessionsActivity, d2Var, tL_webAuthorization, 9));
        if (zArr[0]) {
            MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
        }
    }

    public static /* synthetic */ void Y(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        ArrayList arrayList = sessionsActivity.e;
        sessionsActivity.r = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.m0();
        }
        i81 i81Var = sessionsActivity.a;
        if (i81Var != null) {
            i81Var.l();
        }
        ox0 ox0Var = sessionsActivity.V;
        if (ox0Var != null) {
            ox0Var.a();
        }
        int i10 = sessionsActivity.S;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.S = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new z71(sessionsActivity, z4, 0), 2500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.d = u00Var;
        int i10 = 1;
        u00Var.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.w;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 16));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new i81(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.c = mzVar;
        mzVar.b();
        frameLayout.addView(this.c, k7.b6.e(-1, -1, 17));
        d81 d81Var = new d81(this, context, 0);
        this.b = d81Var;
        d81Var.o1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setLayoutManager(new k(i10, false, 16));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        d81 d81Var2 = this.b;
        d81Var2.V1 = true;
        d81Var2.W1 = 0;
        frameLayout.addView(d81Var2, k7.b6.c(-1.0f, -1));
        this.b.setAdapter(this.a);
        f2.l lVar = new f2.l();
        lVar.n(150L);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f;
        lVar.i = mrVar;
        lVar.o = mrVar;
        this.b.setItemAnimator(lVar);
        this.b.setOnItemClickListener(new p21(this, 5));
        if (i11 == 0) {
            e81 e81Var = new e81(this, context);
            this.s = e81Var;
            frameLayout.addView(e81Var, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
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

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.s6.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        int i10 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262148, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262148, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"onlineTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"onlineTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"detailTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"detailExTextView"}, null, null, -1, null, i12));
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

    @Override // org.telegram.ui.ActionBar.p2
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

    public final void k0(final boolean z4) {
        if (this.r) {
            return;
        }
        if (!z4) {
            this.r = true;
        }
        if (this.w == 0) {
            final int i10 = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.w71
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
                            final boolean z10 = z4;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.x71
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
                                                ox0 ox0Var = sessionsActivity2.V;
                                                if (ox0Var != null) {
                                                    ox0Var.a();
                                                }
                                            }
                                            i81 i81Var = sessionsActivity2.a;
                                            if (i81Var != null) {
                                                i81Var.l();
                                            }
                                            ox0 ox0Var2 = sessionsActivity2.V;
                                            if (ox0Var2 != null) {
                                                ox0Var2.a();
                                            }
                                            int i13 = sessionsActivity2.S;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity2.S = i14;
                                                if (i14 > 0) {
                                                    AndroidUtilities.runOnUIThread(new z71(sessionsActivity2, z10, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z10);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i12 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z11 = z4;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.x71
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
                                                ox0 ox0Var = sessionsActivity22.V;
                                                if (ox0Var != null) {
                                                    ox0Var.a();
                                                }
                                            }
                                            i81 i81Var = sessionsActivity22.a;
                                            if (i81Var != null) {
                                                i81Var.l();
                                            }
                                            ox0 ox0Var2 = sessionsActivity22.V;
                                            if (ox0Var2 != null) {
                                                ox0Var2.a();
                                            }
                                            int i13 = sessionsActivity22.S;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity22.S = i14;
                                                if (i14 > 0) {
                                                    AndroidUtilities.runOnUIThread(new z71(sessionsActivity22, z11, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z11);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.w71
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
                        final boolean z10 = z4;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.x71
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
                                            ox0 ox0Var = sessionsActivity22.V;
                                            if (ox0Var != null) {
                                                ox0Var.a();
                                            }
                                        }
                                        i81 i81Var = sessionsActivity22.a;
                                        if (i81Var != null) {
                                            i81Var.l();
                                        }
                                        ox0 ox0Var2 = sessionsActivity22.V;
                                        if (ox0Var2 != null) {
                                            ox0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.S;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.S = i14;
                                            if (i14 > 0) {
                                                AndroidUtilities.runOnUIThread(new z71(sessionsActivity22, z10, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.Y(sessionsActivity, tL_error, tLObject, z10);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i12 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z11 = z4;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.x71
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
                                            ox0 ox0Var = sessionsActivity22.V;
                                            if (ox0Var != null) {
                                                ox0Var.a();
                                            }
                                        }
                                        i81 i81Var = sessionsActivity22.a;
                                        if (i81Var != null) {
                                            i81Var.l();
                                        }
                                        ox0 ox0Var2 = sessionsActivity22.V;
                                        if (ox0Var2 != null) {
                                            ox0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.S;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.S = i14;
                                            if (i14 > 0) {
                                                AndroidUtilities.runOnUIThread(new z71(sessionsActivity22, z11, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.Y(sessionsActivity2, tL_error, tLObject, z11);
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
        this.T = true;
    }

    public final void m0() {
        this.P = 0;
        this.x = -1;
        this.y = -1;
        this.terminateAllSessionsRow = -1;
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
        this.O = -1;
        this.Q = -1;
        this.ttlRow = -1;
        this.R = -1;
        int i10 = this.w;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.P;
            this.N = i11;
            this.P = i11 + 2;
            this.O = i11 + 1;
        }
        if (this.r) {
            if (i10 == 0) {
                int i12 = this.P;
                this.x = i12;
                this.P = i12 + 2;
                this.y = i12 + 1;
                return;
            }
            return;
        }
        if (this.n != null) {
            int i13 = this.P;
            this.x = i13;
            this.P = i13 + 2;
            this.y = i13 + 1;
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.e;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.B = -1;
            if (i10 == 1 || this.n != null) {
                int i14 = this.P;
                this.P = i14 + 1;
                this.M = i14;
            } else {
                this.M = -1;
            }
        } else {
            int i15 = this.P;
            this.terminateAllSessionsRow = i15;
            this.P = i15 + 2;
            this.B = i15 + 1;
            this.M = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.P;
            int i17 = i16 + 1;
            this.P = i17;
            this.C = i16;
            this.D = i17;
            int size = arrayList.size() + i17;
            this.E = size;
            this.P = size + 1;
            this.F = size;
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.h;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.P;
                int i19 = i18 + 1;
                this.P = i19;
                this.G = i18;
                this.J = i19;
                int size2 = this.h.size() + i19;
                this.K = size2;
                this.P = size2 + 1;
                this.L = size2;
            }
        } else {
            int i20 = this.P;
            this.P = i20 + 1;
            this.G = i20;
            ArrayList arrayList4 = this.h;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.P;
                this.J = i21;
                int size3 = this.h.size() + i21;
                this.P = size3;
                this.K = size3;
            }
            int i22 = this.P;
            this.H = i22;
            this.I = arrayList2.size() + i22;
            int size4 = arrayList2.size() + this.P;
            this.P = size4 + 1;
            this.L = size4;
        }
        if (this.v > 0) {
            int i23 = this.P;
            this.Q = i23;
            this.ttlRow = i23 + 1;
            this.P = i23 + 3;
            this.R = i23 + 2;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        e81 e81Var = this.s;
        if (e81Var != null) {
            e81Var.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        k0(false);
        if (this.w == 0) {
            uf.f.a(this.currentAccount).c(new b81(this, 0));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.b.setPadding(0, 0, 0, i13);
        this.b.setClipToPadding(false);
        e81 e81Var = this.s;
        if (e81Var != null) {
            e81Var.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        e81 e81Var = this.s;
        if (e81Var != null) {
            e81Var.e(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                x9.e0(getParentActivity(), 2, new h81(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c81(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        i81 i81Var = this.a;
        if (i81Var != null) {
            i81Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (!z4 || z10) {
            return;
        }
        this.U = true;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof j81) {
                ((j81) childAt).b.invalidate();
            }
        }
    }
}
