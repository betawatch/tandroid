package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public boolean V;
    public boolean W;
    public nx0 X;
    public n71 a;
    public k10 b;
    public org.telegram.ui.Components.uz c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public i71 r;
    public int s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int v;
    public int w;
    public int x;
    public int y;

    public SessionsActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.U = 0;
        this.v = i10;
    }

    public static void V(SessionsActivity sessionsActivity, int i10) {
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        j71 j71Var;
        String formatDateTime;
        int i11;
        int i12;
        boolean z11;
        ArrayList arrayList;
        String string;
        ArrayList arrayList2 = sessionsActivity.d;
        int i13 = sessionsActivity.v;
        int i14 = 6;
        int i15 = 1;
        if (i10 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            int i16 = sessionsActivity.s;
            int i17 = i16 <= 7 ? 0 : i16 <= 93 ? 1 : i16 <= 183 ? 2 : 3;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.SessionsSelfDestruct);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string2;
            String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
            LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            int i18 = 0;
            while (i18 < 4) {
                org.telegram.ui.Cells.p6 p6Var = new org.telegram.ui.Cells.p6(sessionsActivity.getParentActivity(), null);
                p6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                p6Var.setTag(Integer.valueOf(i18));
                p6Var.a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.g7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E5, false));
                p6Var.b(strArr[i18], i17 == i18);
                linearLayout.addView(p6Var);
                p6Var.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false), 2, -1));
                p6Var.setOnClickListener(new xd0(15, sessionsActivity, alertDialog$Builder));
                i18++;
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(e2Var);
            return;
        }
        if (i10 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            ArrayList arrayList3 = sessionsActivity.f;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                if (i13 == 0) {
                    e2Var2.T = LocaleController.getString(R.string.AreYouSureSessions);
                    e2Var2.R = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string = LocaleController.getString(R.string.Terminate);
                } else {
                    e2Var2.T = LocaleController.getString(R.string.AreYouSureWebSessions);
                    e2Var2.R = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string = LocaleController.getString(R.string.Disconnect);
                }
                alertDialog$Builder2.k(string, new g71(sessionsActivity, i15));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                sessionsActivity.showDialog(e2Var2);
                TextView textView = (TextView) e2Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList4 = sessionsActivity.f;
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
                        append.setSpan(new org.telegram.ui.Components.x61(org.telegram.ui.Components.b10.j("https://t.me/", publicUsername), (org.telegram.ui.Components.y11) null), 0, append.length(), 33);
                        spannableStringBuilder.append((CharSequence) append);
                    }
                }
            }
            org.telegram.ui.Components.g5.h0(sessionsActivity.getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new f71(sessionsActivity, i15), sessionsActivity.resourceProvider, false);
            return;
        }
        if (i10 >= sessionsActivity.L && i10 < sessionsActivity.M) {
            if (sessionsActivity.getParentActivity() == null || (arrayList = sessionsActivity.f) == null || arrayList.isEmpty()) {
                return;
            }
            int i20 = i10 - sessionsActivity.L;
            new jg.k0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f.get(i20), new org.telegram.ui.Components.h2(sessionsActivity, i20, 29), sessionsActivity.resourceProvider).show();
            return;
        }
        if (((i10 < sessionsActivity.J || i10 >= sessionsActivity.K) && ((i10 < sessionsActivity.F || i10 >= sessionsActivity.G) && i10 != sessionsActivity.x)) || sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (i13 != 0) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
            if (i13 == 0) {
                e2Var3.T = LocaleController.getString(R.string.TerminateSessionText);
                e2Var3.R = LocaleController.getString(R.string.AreYouSureSessionTitle);
                charSequence = LocaleController.getString(R.string.Terminate);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.J);
                e2Var3.T = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
                e2Var3.R = LocaleController.getString(R.string.TerminateWebSessionTitle);
                CharSequence string3 = LocaleController.getString(R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User user2 = MessagesController.getInstance(sessionsActivity.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
                String firstName = user2 != null ? UserObject.getFirstName(user2) : "";
                org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(sessionsActivity.getParentActivity(), 1);
                y1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
                y1Var.e(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, firstName), "", false, false, false);
                y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                frameLayout.addView(y1Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                y1Var.setOnClickListener(new p8(i14, zArr));
                e2Var3.G = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = string3;
            }
            alertDialog$Builder3.k(charSequence, new i2.z(sessionsActivity, i10, zArr, 17));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            sessionsActivity.showDialog(e2Var3);
            TextView textView2 = (TextView) e2Var3.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, null);
                return;
            }
            return;
        }
        if (i10 == sessionsActivity.x) {
            tL_authorization = sessionsActivity.h;
            z10 = true;
        } else {
            int i21 = sessionsActivity.J;
            tL_authorization = (i10 < i21 || i10 >= sessionsActivity.K) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F) : (TLRPC.TL_authorization) arrayList2.get(i10 - i21);
            z10 = false;
        }
        if (tL_authorization == null) {
            return;
        }
        j71 j71Var2 = new j71(sessionsActivity);
        z61 z61Var = new z61(sessionsActivity.getParentActivity(), false);
        z61Var.setOpenNoDelay(true);
        Activity parentActivity = sessionsActivity.getParentActivity();
        z61Var.b = tL_authorization;
        z61Var.c = sessionsActivity;
        z61Var.fixNavigationBar();
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(parentActivity);
        z61Var.d = ak0Var;
        ak0Var.setOnClickListener(new q61(z61Var));
        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout2.addView(ak0Var, org.telegram.ui.Components.gb1.x(70, 70, 1, 0, 16, 0, 0));
        TextView textView3 = new TextView(parentActivity);
        ic.a.o(20.0f, 2, textView3);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.G6, null);
        textView3.setGravity(17);
        linearLayout2.addView(textView3, org.telegram.ui.Components.gb1.x(-1, -2, 1, 21, 12, 21, 0));
        TextView textView4 = new TextView(parentActivity);
        org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.y6, null);
        textView4.setTextSize(2, 13.0f);
        textView4.setGravity(17);
        linearLayout2.addView(textView4, org.telegram.ui.Components.gb1.x(-1, -2, 1, 21, 4, 21, 21));
        if ((tL_authorization.flags & 1) != 0) {
            formatDateTime = LocaleController.getString(R.string.Online);
            j71Var = j71Var2;
        } else {
            j71Var = j71Var2;
            formatDateTime = LocaleController.formatDateTime(tL_authorization.date_active, true);
        }
        textView4.setText(formatDateTime);
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
            i12 = org.telegram.ui.ActionBar.y6.U7;
        } else if (lowerCase2.contains("edge")) {
            i11 = R.raw.edge_30;
            i12 = org.telegram.ui.ActionBar.y6.U7;
        } else if (lowerCase2.contains("chrome")) {
            i11 = R.raw.chrome_30;
            i12 = org.telegram.ui.ActionBar.y6.U7;
        } else if (lowerCase2.contains("firefox")) {
            i11 = R.raw.firefox_30;
            i12 = org.telegram.ui.ActionBar.y6.O7;
        } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
            i11 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
            i12 = org.telegram.ui.ActionBar.y6.U7;
            i15 = 0;
        } else {
            if (lowerCase.contains("ubuntu")) {
                i11 = R.raw.ubuntu_30;
                i12 = org.telegram.ui.ActionBar.y6.T7;
            } else if (lowerCase.contains("linux")) {
                i11 = R.raw.linux_30;
                i12 = org.telegram.ui.ActionBar.y6.T7;
            } else if (lowerCase.contains("ios")) {
                i11 = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                i12 = org.telegram.ui.ActionBar.y6.T7;
            } else if (lowerCase.contains("windows")) {
                i11 = R.raw.windows_30;
                i12 = org.telegram.ui.ActionBar.y6.S7;
            } else if (lowerCase.contains("macos")) {
                i11 = R.raw.mac_30;
                i12 = org.telegram.ui.ActionBar.y6.S7;
            } else if (lowerCase.contains("android")) {
                i11 = R.raw.android_30;
                i12 = org.telegram.ui.ActionBar.y6.R7;
            } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                i11 = R.raw.windows_30;
                i12 = org.telegram.ui.ActionBar.y6.S7;
            } else {
                i11 = R.raw.chrome_30;
                i12 = org.telegram.ui.ActionBar.y6.U7;
            }
            i15 = 1;
        }
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(42.0f), org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        ak0Var.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(ak0Var, K, N, null, null);
        if (i15 != 0) {
            ak0Var.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.y6.x0(null, i12, false)});
        } else {
            ak0Var.setImageDrawable(z61Var.getContext().getDrawable(i11));
        }
        y61 y61Var = new y61(parentActivity, false);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(tL_authorization.app_name);
        sb3.append(" ");
        sb3.append(tL_authorization.app_version);
        y61Var.b.setText(sb3);
        Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
        int i22 = org.telegram.ui.ActionBar.y6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        ImageView imageView = y61Var.a;
        org.telegram.ui.ActionBar.f7.y(imageView, mutate, i22, null, mode);
        imageView.setImageDrawable(mutate);
        y61Var.c.setText(LocaleController.getString(R.string.Application));
        linearLayout2.addView(y61Var);
        if (tL_authorization.country.length() != 0) {
            y61 y61Var2 = new y61(parentActivity, false);
            y61Var2.b.setText(tL_authorization.country);
            Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
            ImageView imageView2 = y61Var2.a;
            org.telegram.ui.ActionBar.f7.y(imageView2, mutate2, i22, null, mode);
            imageView2.setImageDrawable(mutate2);
            y61Var2.c.setText(LocaleController.getString(R.string.Location));
            y61Var2.setOnClickListener(new r61(z61Var, tL_authorization));
            y61Var2.setOnLongClickListener(new s61(z61Var, tL_authorization));
            int i23 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i23, false), 2, -1);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i23);
            y61Var2.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(y61Var2, g02, null, N2, null);
            linearLayout2.addView(y61Var2);
            y61Var.e = true;
            y61Var = y61Var2;
        }
        if (tL_authorization.ip.length() != 0) {
            y61 y61Var3 = new y61(parentActivity, false);
            y61Var3.b.setText(tL_authorization.ip);
            Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
            ImageView imageView3 = y61Var3.a;
            org.telegram.ui.ActionBar.f7.y(imageView3, mutate3, i22, null, mode);
            imageView3.setImageDrawable(mutate3);
            y61Var3.c.setText(LocaleController.getString(R.string.IpAddress));
            y61Var3.setOnClickListener(new t61(z61Var, tL_authorization));
            y61Var3.setOnLongClickListener(new u61(z61Var, tL_authorization));
            int i24 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i24, false), 2, -1);
            org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i24);
            y61Var3.setBackground(g03);
            org.telegram.ui.ActionBar.f7.k(y61Var3, g03, null, N3, null);
            linearLayout2.addView(y61Var3);
            z11 = true;
            y61Var.e = true;
            y61Var = y61Var3;
        } else {
            z11 = true;
        }
        int i25 = tL_authorization.api_id;
        if (i25 != 2040 && i25 != 2496) {
            y61 y61Var4 = new y61(parentActivity, z11);
            y61Var4.b.setText(LocaleController.getString(R.string.AcceptSecretChats));
            Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
            ImageView imageView4 = y61Var4.a;
            org.telegram.ui.ActionBar.f7.y(imageView4, mutate4, i22, null, mode);
            imageView4.setImageDrawable(mutate4);
            y61Var4.d.c(!tL_authorization.encrypted_requests_disabled, false);
            int i26 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i26, false), 7, -1);
            org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i26);
            y61Var4.setBackground(g04);
            org.telegram.ui.ActionBar.f7.k(y61Var4, g04, null, N4, null);
            y61Var4.setOnClickListener(new v61(z61Var, y61Var4, tL_authorization));
            y61Var.e = true;
            y61Var4.c.setText(LocaleController.getString(R.string.AcceptSecretChatsDescription));
            linearLayout2.addView(y61Var4);
            y61Var = y61Var4;
        }
        if (tL_authorization.api_id != 22) {
            y61 y61Var5 = new y61(parentActivity, true);
            y61Var5.b.setText(LocaleController.getString(R.string.AcceptCalls));
            Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
            ImageView imageView5 = y61Var5.a;
            org.telegram.ui.ActionBar.f7.y(imageView5, mutate5, i22, null, mode);
            imageView5.setImageDrawable(mutate5);
            y61Var5.d.c(!tL_authorization.call_requests_disabled, false);
            int i27 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.Cells.y g05 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i27, false), 7, -1);
            org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i27);
            y61Var5.setBackground(g05);
            org.telegram.ui.ActionBar.f7.k(y61Var5, g05, null, N5, null);
            y61Var5.setOnClickListener(new w61(z61Var, y61Var5, tL_authorization));
            y61Var.e = true;
            y61Var5.c.setText(LocaleController.getString(R.string.AcceptCallsChatsDescription));
            linearLayout2.addView(y61Var5);
        }
        if (!z10) {
            TextView textView5 = new TextView(parentActivity);
            textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            textView5.setGravity(17);
            textView5.setTextSize(1, 14.0f);
            textView5.setTypeface(AndroidUtilities.bold());
            textView5.setText(LocaleController.getString(R.string.TerminateSession));
            org.telegram.ui.ActionBar.f7.V(textView5, org.telegram.ui.ActionBar.y6.Sh, null);
            int dp = AndroidUtilities.dp(24.0f);
            int i28 = org.telegram.ui.ActionBar.y6.ka;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i28, false);
            int i29 = org.telegram.ui.ActionBar.y6.d6;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i29, false), 120);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, o10, o10);
            org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i28);
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i29, 120);
            textView5.setBackground(j02);
            org.telegram.ui.ActionBar.f7.k(textView5, j02, N6, h, null);
            linearLayout2.addView(textView5, org.telegram.ui.Components.gb1.h(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView5.setOnClickListener(new x61(z61Var, j71Var, tL_authorization, sessionsActivity));
        }
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayout2);
        z61Var.setCustomView(scrollView);
        z61Var.show();
    }

    public static /* synthetic */ void W(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(sessionsActivity.currentAccount).getInputUser(((TL_account.TL_connectedBot) sessionsActivity.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new c71(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new c71(sessionsActivity, 1));
    }

    public static /* synthetic */ void X(SessionsActivity sessionsActivity) {
        if (sessionsActivity.v == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new c71(sessionsActivity, 2));
        } else {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new c71(sessionsActivity, 3));
        }
    }

    public static void Y(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(sessionsActivity.getParentActivity(), 3, null);
        e2Var.i0 = false;
        e2Var.show();
        if (sessionsActivity.v == 0) {
            int i11 = sessionsActivity.J;
            TLRPC.TL_authorization tL_authorization = (i10 < i11 || i10 >= sessionsActivity.K) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F) : (TLRPC.TL_authorization) arrayList.get(i10 - i11);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new as0(sessionsActivity, e2Var, tL_authorization, 8));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.J);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new as0(sessionsActivity, e2Var, tL_webAuthorization, 9));
        if (zArr[0]) {
            MessagesController.getInstance(sessionsActivity.currentAccount).blockPeer(tL_webAuthorization.bot_id);
        }
    }

    public static /* synthetic */ void Z(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(sessionsActivity.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.n0();
        }
        n71 n71Var = sessionsActivity.a;
        if (n71Var != null) {
            n71Var.l();
        }
        nx0 nx0Var = sessionsActivity.X;
        if (nx0Var != null) {
            nx0Var.a();
        }
        int i10 = sessionsActivity.U;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.U = i11;
            if (i11 > 0) {
                AndroidUtilities.runOnUIThread(new d71(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        new org.telegram.ui.Components.c10(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.v;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 6));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new n71(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.c = uzVar;
        uzVar.b();
        k10 k10Var = new k10(3, context, this);
        this.b = k10Var;
        k10Var.u1();
        this.b.setLayoutManager(new ig.a0(i10, false, 18));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        k10 k10Var2 = this.b;
        k10Var2.W1 = true;
        k10Var2.X1 = 0;
        frameLayout.addView(k10Var2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.c, org.telegram.ui.Components.gb1.i(-1, -1, 17));
        this.b.setAdapter(this.a);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        this.b.setItemAnimator(lVar);
        this.b.setOnItemClickListener(new m11(this, 6));
        if (i11 == 0) {
            i71 i71Var = new i71(this, context);
            this.r = i71Var;
            frameLayout.addView(i71Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        n0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.newSessionReceived) {
            l0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.q4.class, org.telegram.ui.Cells.z6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        int i10 = org.telegram.ui.ActionBar.y6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 262148, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 262148, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 262144, new Class[]{org.telegram.ui.Cells.z6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        ArrayList arrayList = this.d;
        if (arrayList.size() == 0 && this.n) {
            return 0;
        }
        return arrayList.size() + (this.v == 0 ? 1 : 0);
    }

    public final void l0(final boolean z10) {
        if (this.n) {
            return;
        }
        if (!z10) {
            this.n = true;
        }
        if (this.v == 0) {
            final int i10 = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.a71
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
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.b71
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            ArrayList arrayList = sessionsActivity2.e;
                                            ArrayList arrayList2 = sessionsActivity2.d;
                                            sessionsActivity2.n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i12 = 0; i12 < size; i12++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i12);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.n0();
                                                nx0 nx0Var = sessionsActivity2.X;
                                                if (nx0Var != null) {
                                                    nx0Var.a();
                                                }
                                            }
                                            n71 n71Var = sessionsActivity2.a;
                                            if (n71Var != null) {
                                                n71Var.l();
                                            }
                                            nx0 nx0Var2 = sessionsActivity2.X;
                                            if (nx0Var2 != null) {
                                                nx0Var2.a();
                                            }
                                            int i13 = sessionsActivity2.U;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity2.U = i14;
                                                if (i14 > 0) {
                                                    AndroidUtilities.runOnUIThread(new d71(sessionsActivity2, z11, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.Z(sessionsActivity, tL_error, tLObject, z11);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i12 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z12 = z10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.b71
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            SessionsActivity sessionsActivity22 = sessionsActivity2;
                                            ArrayList arrayList = sessionsActivity22.e;
                                            ArrayList arrayList2 = sessionsActivity22.d;
                                            sessionsActivity22.n = false;
                                            if (tL_error == null) {
                                                arrayList2.clear();
                                                arrayList.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i122 = 0; i122 < size; i122++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i122);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.n0();
                                                nx0 nx0Var = sessionsActivity22.X;
                                                if (nx0Var != null) {
                                                    nx0Var.a();
                                                }
                                            }
                                            n71 n71Var = sessionsActivity22.a;
                                            if (n71Var != null) {
                                                n71Var.l();
                                            }
                                            nx0 nx0Var2 = sessionsActivity22.X;
                                            if (nx0Var2 != null) {
                                                nx0Var2.a();
                                            }
                                            int i13 = sessionsActivity22.U;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity22.U = i14;
                                                if (i14 > 0) {
                                                    AndroidUtilities.runOnUIThread(new d71(sessionsActivity22, z12, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.Z(sessionsActivity2, tL_error, tLObject, z12);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.a71
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
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.b71
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i112) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i122 = 0; i122 < size; i122++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i122);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.n0();
                                            nx0 nx0Var = sessionsActivity22.X;
                                            if (nx0Var != null) {
                                                nx0Var.a();
                                            }
                                        }
                                        n71 n71Var = sessionsActivity22.a;
                                        if (n71Var != null) {
                                            n71Var.l();
                                        }
                                        nx0 nx0Var2 = sessionsActivity22.X;
                                        if (nx0Var2 != null) {
                                            nx0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.U;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.U = i14;
                                            if (i14 > 0) {
                                                AndroidUtilities.runOnUIThread(new d71(sessionsActivity22, z11, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.Z(sessionsActivity, tL_error, tLObject, z11);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i12 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z12 = z10;
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.b71
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        SessionsActivity sessionsActivity22 = sessionsActivity2;
                                        ArrayList arrayList = sessionsActivity22.e;
                                        ArrayList arrayList2 = sessionsActivity22.d;
                                        sessionsActivity22.n = false;
                                        if (tL_error == null) {
                                            arrayList2.clear();
                                            arrayList.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i122 = 0; i122 < size; i122++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i122);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.n0();
                                            nx0 nx0Var = sessionsActivity22.X;
                                            if (nx0Var != null) {
                                                nx0Var.a();
                                            }
                                        }
                                        n71 n71Var = sessionsActivity22.a;
                                        if (n71Var != null) {
                                            n71Var.l();
                                        }
                                        nx0 nx0Var2 = sessionsActivity22.X;
                                        if (nx0Var2 != null) {
                                            nx0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.U;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.U = i14;
                                            if (i14 > 0) {
                                                AndroidUtilities.runOnUIThread(new d71(sessionsActivity22, z12, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.Z(sessionsActivity2, tL_error, tLObject, z12);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }), this.classGuid);
    }

    public final void m0() {
        this.V = true;
    }

    public final void n0() {
        this.R = 0;
        this.w = -1;
        this.x = -1;
        this.terminateAllSessionsRow = -1;
        this.y = -1;
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
        this.S = -1;
        this.ttlRow = -1;
        this.T = -1;
        int i10 = this.v;
        if (i10 == 0 && getMessagesController().qrLoginCamera) {
            int i11 = this.R;
            this.P = i11;
            this.R = i11 + 2;
            this.Q = i11 + 1;
        }
        if (this.n) {
            if (i10 == 0) {
                int i12 = this.R;
                this.w = i12;
                this.R = i12 + 2;
                this.x = i12 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i13 = this.R;
            this.w = i13;
            this.R = i13 + 2;
            this.x = i13 + 1;
        }
        ArrayList arrayList = this.e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.y = -1;
            if (i10 == 1 || this.h != null) {
                int i14 = this.R;
                this.R = i14 + 1;
                this.O = i14;
            } else {
                this.O = -1;
            }
        } else {
            int i15 = this.R;
            this.terminateAllSessionsRow = i15;
            this.R = i15 + 2;
            this.y = i15 + 1;
            this.O = -1;
        }
        if (!arrayList.isEmpty()) {
            int i16 = this.R;
            int i17 = i16 + 1;
            this.R = i17;
            this.E = i16;
            this.F = i17;
            int size = arrayList.size() + i17;
            this.G = size;
            this.R = size + 1;
            this.H = size;
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i18 = this.R;
                int i19 = i18 + 1;
                this.R = i19;
                this.I = i18;
                this.L = i19;
                int size2 = this.f.size() + i19;
                this.M = size2;
                this.R = size2 + 1;
                this.N = size2;
            }
        } else {
            int i20 = this.R;
            this.R = i20 + 1;
            this.I = i20;
            ArrayList arrayList4 = this.f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i21 = this.R;
                this.L = i21;
                int size3 = this.f.size() + i21;
                this.R = size3;
                this.M = size3;
            }
            int i22 = this.R;
            this.J = i22;
            this.K = arrayList2.size() + i22;
            int size4 = arrayList2.size() + this.R;
            this.R = size4 + 1;
            this.N = size4;
        }
        if (this.s > 0) {
            int i23 = this.R;
            this.S = i23;
            this.ttlRow = i23 + 1;
            this.R = i23 + 3;
            this.T = i23 + 2;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyHidden() {
        i71 i71Var = this.r;
        if (i71Var != null) {
            i71Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        n0();
        l0(false);
        if (this.v == 0) {
            jg.f.a(this.currentAccount).c(new f71(this, 0));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        i71 i71Var = this.r;
        if (i71Var != null) {
            i71Var.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        i71 i71Var = this.r;
        if (i71Var != null) {
            i71Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                y9.f0(getParentActivity(), 2, new m71(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new g71(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.y6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        n71 n71Var = this.a;
        if (n71Var != null) {
            n71Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.W = true;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof o71) {
                ((o71) childAt).b.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
