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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public mt0 X;
    public y21 a;
    public zs b;
    public org.telegram.ui.Components.jy c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public u21 r;
    public int s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int w;
    public int x;
    public int y;

    public SessionsActivity(int i7) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.U = 0;
        this.w = i7;
    }

    public static void Z(SessionsActivity sessionsActivity, int i7) {
        int i10;
        String str;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z9;
        int i11;
        int i12;
        boolean z10;
        ArrayList arrayList;
        String M0;
        ArrayList arrayList2 = sessionsActivity.d;
        int i13 = sessionsActivity.w;
        int i14 = 6;
        float f10 = 4.0f;
        int i15 = 1;
        if (i7 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            int i16 = sessionsActivity.s;
            int i17 = i16 <= 7 ? 0 : i16 <= 93 ? 1 : i16 <= 183 ? 2 : 3;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            String M02 = org.telegram.messenger.id.M0(2131745556, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M02;
            String[] strArr = {org.telegram.messenger.id.G(1, "Weeks", new Object[0]), org.telegram.messenger.id.G(3, "Months", new Object[0]), org.telegram.messenger.id.G(6, "Months", new Object[0]), org.telegram.messenger.id.G(1, "Years", new Object[0])};
            LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            int i18 = 0;
            while (i18 < 4) {
                org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(sessionsActivity.getParentActivity(), null);
                float f11 = f10;
                j6Var.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f11), 0);
                j6Var.setTag(Integer.valueOf(i18));
                j6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                j6Var.b(strArr[i18], i17 == i18);
                linearLayout.addView(j6Var);
                j6Var.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), 2, -1));
                j6Var.setOnClickListener(new fk0(10, sessionsActivity, alertDialog$Builder));
                i18++;
                f10 = f11;
            }
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            sessionsActivity.showDialog(u1Var);
            return;
        }
        if (i7 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            ArrayList arrayList3 = sessionsActivity.f;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                if (i13 == 0) {
                    u1Var2.T = org.telegram.messenger.id.M0(2131754072, null);
                    u1Var2.R = org.telegram.messenger.id.M0(2131754071, null);
                    M0 = org.telegram.messenger.id.M0(2131744212, null);
                } else {
                    u1Var2.T = org.telegram.messenger.id.M0(2131754062, null);
                    u1Var2.R = org.telegram.messenger.id.M0(2131744202, null);
                    M0 = org.telegram.messenger.id.M0(2131751392, null);
                }
                alertDialog$Builder2.k(M0, new s21(sessionsActivity, i15));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                sessionsActivity.showDialog(u1Var2);
                TextView textView = (TextView) u1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
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
                TLRPC.User a22 = org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (a22 != null) {
                    String n10 = org.telegram.messenger.t10.n(a22);
                    if (TextUtils.isEmpty(n10)) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.t10.p(a22));
                    } else {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) n10);
                        append.setSpan(new org.telegram.ui.Components.b41(rf.b.i("https://t.me/", n10), (org.telegram.ui.Components.uy0) null), 0, append.length(), 33);
                        spannableStringBuilder.append((CharSequence) append);
                    }
                }
            }
            org.telegram.ui.Components.v4.f0(sessionsActivity.getParentActivity(), org.telegram.messenger.id.M0(2131754071, null), org.telegram.messenger.id.M0(2131754072, null), org.telegram.messenger.id.V(null, null, 2131754271, spannableStringBuilder), org.telegram.messenger.id.M0(2131744212, null), new r21(sessionsActivity, i15), sessionsActivity.resourceProvider, false);
            return;
        }
        if (i7 >= sessionsActivity.L && i7 < sessionsActivity.M) {
            if (sessionsActivity.getParentActivity() == null || (arrayList = sessionsActivity.f) == null || arrayList.isEmpty()) {
                return;
            }
            int i20 = i7 - sessionsActivity.L;
            new kg.i0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f.get(i20), new org.telegram.ui.Components.r2(sessionsActivity, i20, 26), sessionsActivity.resourceProvider).show();
            return;
        }
        if (((i7 < sessionsActivity.J || i7 >= sessionsActivity.K) && ((i7 < sessionsActivity.F || i7 >= sessionsActivity.G) && i7 != sessionsActivity.y)) || sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (i13 != 0) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
            if (i13 == 0) {
                u1Var3.T = org.telegram.messenger.id.M0(2131744207, null);
                u1Var3.R = org.telegram.messenger.id.M0(2131754073, null);
                charSequence = org.telegram.messenger.id.M0(2131744212, null);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i7 - sessionsActivity.J);
                u1Var3.T = org.telegram.messenger.id.a0("TerminateWebSessionText", null, 2131744204, tL_webAuthorization.domain);
                u1Var3.R = org.telegram.messenger.id.M0(2131744203, null);
                CharSequence M03 = org.telegram.messenger.id.M0(2131751392, null);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User a23 = org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).a2(Long.valueOf(tL_webAuthorization.bot_id));
                if (a23 != null) {
                    i10 = 1;
                    str = org.telegram.messenger.t10.j(a23, true);
                } else {
                    i10 = 1;
                    str = "";
                }
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(sessionsActivity.getParentActivity(), i10);
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                Object[] objArr = new Object[i10];
                objArr[0] = str;
                c2Var.e(org.telegram.messenger.id.a0("TerminateWebSessionStop", null, 2131744205, objArr), "", false, false, false);
                c2Var.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                frameLayout.addView(c2Var, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                c2Var.setOnClickListener(new j8(i14, zArr));
                u1Var3.G = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = M03;
            }
            alertDialog$Builder3.k(charSequence, new jg.a2(sessionsActivity, i7, zArr, 14));
            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
            sessionsActivity.showDialog(u1Var3);
            TextView textView2 = (TextView) u1Var3.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i7 == sessionsActivity.y) {
            tL_authorization = sessionsActivity.h;
            z9 = true;
        } else {
            int i21 = sessionsActivity.J;
            tL_authorization = (i7 < i21 || i7 >= sessionsActivity.K) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i7 - sessionsActivity.F) : (TLRPC.TL_authorization) arrayList2.get(i7 - i21);
            z9 = false;
        }
        if (tL_authorization == null) {
            return;
        }
        v21 v21Var = new v21(sessionsActivity);
        l21 l21Var = new l21(sessionsActivity.getParentActivity(), false);
        l21Var.R0 = true;
        Activity parentActivity = sessionsActivity.getParentActivity();
        l21Var.i1 = tL_authorization;
        l21Var.j1 = sessionsActivity;
        l21Var.N();
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(parentActivity);
        l21Var.k1 = ch0Var;
        ch0Var.setOnClickListener(new d21(l21Var));
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout2.addView(ch0Var, c8.ha.t(70, 70, 1, 0, 16, 0, 0));
        TextView textView3 = new TextView(parentActivity);
        com.google.android.recaptcha.internal.a.q(textView3, 2, 20.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.G6, null);
        textView3.setGravity(17);
        linearLayout2.addView(textView3, c8.ha.t(-1, -2, 1, 21, 12, 21, 0));
        TextView textView4 = new TextView(parentActivity);
        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.y6, null);
        textView4.setTextSize(2, 13.0f);
        textView4.setGravity(17);
        linearLayout2.addView(textView4, c8.ha.t(-1, -2, 1, 21, 4, 21, 21));
        textView4.setText((tL_authorization.flags & 1) != 0 ? org.telegram.messenger.id.M0(2131747827, null) : org.telegram.messenger.id.x(tL_authorization.date_active, true));
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
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i11 = R.raw.safari_30;
        } else if (lowerCase2.contains("edge")) {
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i11 = R.raw.edge_30;
        } else if (lowerCase2.contains("chrome")) {
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i11 = R.raw.chrome_30;
        } else if (lowerCase2.contains("firefox")) {
            i12 = org.telegram.ui.ActionBar.k6.O7;
            i11 = R.raw.firefox_30;
        } else if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
            i11 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
            i12 = org.telegram.ui.ActionBar.k6.U7;
            i15 = 0;
        } else {
            if (lowerCase.contains("ubuntu")) {
                i12 = org.telegram.ui.ActionBar.k6.T7;
                i11 = R.raw.ubuntu_30;
            } else if (lowerCase.contains("linux")) {
                i12 = org.telegram.ui.ActionBar.k6.T7;
                i11 = R.raw.linux_30;
            } else if (lowerCase.contains("ios")) {
                i11 = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                i12 = org.telegram.ui.ActionBar.k6.T7;
            } else {
                if (lowerCase.contains("windows")) {
                    i12 = org.telegram.ui.ActionBar.k6.S7;
                } else if (lowerCase.contains("macos")) {
                    i12 = org.telegram.ui.ActionBar.k6.S7;
                    i11 = R.raw.mac_30;
                } else if (lowerCase.contains("android")) {
                    i12 = org.telegram.ui.ActionBar.k6.R7;
                    i11 = R.raw.android_30;
                } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                    i12 = org.telegram.ui.ActionBar.k6.S7;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.U7;
                    i11 = R.raw.chrome_30;
                }
                i11 = R.raw.windows_30;
            }
            i15 = 1;
        }
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        ch0Var.setBackground(L);
        org.telegram.ui.ActionBar.r6.k(ch0Var, L, N, null, null);
        if (i15 != 0) {
            ch0Var.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.k6.x0(null, i12, false)});
        } else {
            ch0Var.setImageDrawable(l21Var.getContext().getDrawable(i11));
        }
        org.telegram.ui.Components.eg egVar = new org.telegram.ui.Components.eg(parentActivity, false);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(tL_authorization.app_name);
        sb3.append(" ");
        sb3.append(tL_authorization.app_version);
        ((TextView) egVar.d).setText(sb3);
        Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
        View view = egVar.c;
        int i22 = org.telegram.ui.ActionBar.k6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.y((ImageView) view, mutate, i22, null, mode);
        ((ImageView) view).setImageDrawable(mutate);
        ((TextView) egVar.e).setText(org.telegram.messenger.id.M0(2131754222, null));
        linearLayout2.addView(egVar);
        if (tL_authorization.country.length() != 0) {
            org.telegram.ui.Components.eg egVar2 = new org.telegram.ui.Components.eg(parentActivity, false);
            ((TextView) egVar2.d).setText(tL_authorization.country);
            Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
            View view2 = egVar2.c;
            org.telegram.ui.ActionBar.r6.y((ImageView) view2, mutate2, i22, null, mode);
            ((ImageView) view2).setImageDrawable(mutate2);
            ((TextView) egVar2.e).setText(org.telegram.messenger.id.M0(2131748758, null));
            egVar2.setOnClickListener(new e21(l21Var, tL_authorization));
            egVar2.setOnLongClickListener(new f21(l21Var, tL_authorization));
            int i23 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i23, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i23);
            egVar2.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(egVar2, h02, null, N2, null);
            linearLayout2.addView(egVar2);
            egVar.b = true;
            egVar = egVar2;
        }
        if (tL_authorization.ip.length() != 0) {
            org.telegram.ui.Components.eg egVar3 = new org.telegram.ui.Components.eg(parentActivity, false);
            ((TextView) egVar3.d).setText(tL_authorization.ip);
            Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
            View view3 = egVar3.c;
            org.telegram.ui.ActionBar.r6.y((ImageView) view3, mutate3, i22, null, mode);
            ((ImageView) view3).setImageDrawable(mutate3);
            ((TextView) egVar3.e).setText(org.telegram.messenger.id.M0(2131749103, null));
            egVar3.setOnClickListener(new g21(l21Var, tL_authorization));
            egVar3.setOnLongClickListener(new h21(l21Var, tL_authorization));
            int i24 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i24, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i24);
            egVar3.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(egVar3, h03, null, N3, null);
            linearLayout2.addView(egVar3);
            z10 = true;
            egVar.b = true;
            egVar = egVar3;
        } else {
            z10 = true;
        }
        int i25 = tL_authorization.api_id;
        if (i25 != 2040 && i25 != 2496) {
            org.telegram.ui.Components.eg egVar4 = new org.telegram.ui.Components.eg(parentActivity, z10);
            ((TextView) egVar4.d).setText(org.telegram.messenger.id.M0(2131754713, null));
            Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
            View view4 = egVar4.c;
            org.telegram.ui.ActionBar.r6.y((ImageView) view4, mutate4, i22, null, mode);
            ((ImageView) view4).setImageDrawable(mutate4);
            ((Switch) egVar4.f).c(!tL_authorization.encrypted_requests_disabled, false);
            int i26 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i26, false), 7, -1);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i26);
            egVar4.setBackground(h04);
            org.telegram.ui.ActionBar.r6.k(egVar4, h04, null, N4, null);
            egVar4.setOnClickListener(new i21(l21Var, egVar4, tL_authorization));
            egVar.b = true;
            ((TextView) egVar4.e).setText(org.telegram.messenger.id.M0(2131754712, null));
            linearLayout2.addView(egVar4);
            egVar = egVar4;
        }
        if (tL_authorization.api_id != 22) {
            org.telegram.ui.Components.eg egVar5 = new org.telegram.ui.Components.eg(parentActivity, true);
            ((TextView) egVar5.d).setText(org.telegram.messenger.id.M0(2131754715, null));
            Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
            View view5 = egVar5.c;
            org.telegram.ui.ActionBar.r6.y((ImageView) view5, mutate5, i22, null, mode);
            ((ImageView) view5).setImageDrawable(mutate5);
            ((Switch) egVar5.f).c(!tL_authorization.call_requests_disabled, false);
            int i27 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i27, false), 7, -1);
            org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i27);
            egVar5.setBackground(h05);
            org.telegram.ui.ActionBar.r6.k(egVar5, h05, null, N5, null);
            egVar5.setOnClickListener(new j21(l21Var, egVar5, tL_authorization));
            egVar.b = true;
            ((TextView) egVar5.e).setText(org.telegram.messenger.id.M0(2131754714, null));
            linearLayout2.addView(egVar5);
        }
        if (!z9) {
            TextView textView5 = new TextView(parentActivity);
            textView5.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            textView5.setGravity(17);
            textView5.setTextSize(1, 14.0f);
            textView5.setTypeface(org.telegram.messenger.g0.o());
            textView5.setText(org.telegram.messenger.id.M0(2131744208, null));
            org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.Gi, null);
            int L2 = org.telegram.messenger.g0.L(24.0f);
            int i28 = org.telegram.ui.ActionBar.k6.ka;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i28, false);
            int i29 = org.telegram.ui.ActionBar.k6.d6;
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i29, false), 120);
            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, x02, o4, o4);
            org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i28);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i29, 120);
            textView5.setBackground(k02);
            org.telegram.ui.ActionBar.r6.k(textView5, k02, N6, h, null);
            linearLayout2.addView(textView5, c8.ha.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
            textView5.setOnClickListener(new k21(l21Var, v21Var, tL_authorization, sessionsActivity));
        }
        ScrollView scrollView = new ScrollView(parentActivity);
        scrollView.addView(linearLayout2);
        l21Var.N = scrollView;
        l21Var.show();
    }

    public static /* synthetic */ void a0(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).o1(((TL_account.TL_connectedBot) sessionsActivity.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new o21(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new o21(sessionsActivity, 1));
    }

    public static /* synthetic */ void b0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new o21(sessionsActivity, 2));
        } else {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new o21(sessionsActivity, 3));
        }
    }

    public static void c0(SessionsActivity sessionsActivity, int i7, boolean[] zArr) {
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, sessionsActivity.getParentActivity(), null);
        u1Var.i0 = false;
        u1Var.show();
        if (sessionsActivity.w == 0) {
            int i10 = sessionsActivity.J;
            TLRPC.TL_authorization tL_authorization = (i7 < i10 || i7 >= sessionsActivity.K) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i7 - sessionsActivity.F) : (TLRPC.TL_authorization) arrayList.get(i7 - i10);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new lo0(sessionsActivity, u1Var, tL_authorization, 8));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i7 - sessionsActivity.J);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new lo0(sessionsActivity, u1Var, tL_webAuthorization, 9));
        if (zArr[0]) {
            org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
        }
    }

    public static /* synthetic */ void d0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.qp.s1(sessionsActivity.currentAccount).Y3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.r0();
        }
        y21 y21Var = sessionsActivity.a;
        if (y21Var != null) {
            y21Var.f();
        }
        mt0 mt0Var = sessionsActivity.X;
        if (mt0Var != null) {
            mt0Var.a();
        }
        int i7 = sessionsActivity.U;
        if (i7 > 0) {
            int i10 = i7 - 1;
            sessionsActivity.U = i10;
            if (i10 > 0) {
                org.telegram.messenger.g0.i3(new p21(sessionsActivity, z9, 0), 2500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        new org.telegram.ui.Components.mz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.w;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751456, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131742914, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 10));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new y21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.c = jyVar;
        jyVar.b();
        zs zsVar = new zs(7, context, this);
        this.b = zsVar;
        zsVar.r1();
        this.b.setLayoutManager(new jg.b0(i7, false, 18));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        zs zsVar2 = this.b;
        zsVar2.W1 = true;
        zsVar2.X1 = 0;
        frameLayout.addView(zsVar2, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.c, c8.ha.e(-1, -1, 17));
        this.b.setAdapter(this.a);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        this.b.setItemAnimator(kVar);
        this.b.setOnItemClickListener(new vx0(this, 5));
        if (i10 == 0) {
            u21 u21Var = new u21(this, context);
            this.r = u21Var;
            frameLayout.addView(u21Var, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.u0) {
            p0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.s6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        int i7 = org.telegram.ui.ActionBar.k6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262148, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262148, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int o0() {
        ArrayList arrayList = this.d;
        if (arrayList.size() == 0 && this.n) {
            return 0;
        }
        return arrayList.size() + (this.w == 0 ? 1 : 0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        u21 u21Var = this.r;
        if (u21Var != null) {
            u21Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (this.w == 0) {
            kg.f.a(this.currentAccount).c(new r21(this, 0));
        }
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.u0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.u0);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        u21 u21Var = this.r;
        if (u21Var != null) {
            u21Var.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        u21 u21Var = this.r;
        if (u21Var != null) {
            u21Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i7 == 34) {
            int i10 = 0;
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.j0(getParentActivity(), 2, new x21(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131746504, null));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747301, null), new s21(this, i10));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        y21 y21Var = this.a;
        if (y21Var != null) {
            y21Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 || z10) {
            return;
        }
        this.W = true;
        for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
            View childAt = this.b.getChildAt(i7);
            if (childAt instanceof z21) {
                ((z21) childAt).b.invalidate();
            }
        }
    }

    public final void p0(final boolean z9) {
        if (this.n) {
            return;
        }
        if (!z9) {
            this.n = true;
        }
        if (this.w == 0) {
            final int i7 = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.m21
                public final /* synthetic */ SessionsActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i7) {
                        case 0:
                            final int i10 = 0;
                            final SessionsActivity sessionsActivity = this.b;
                            final boolean z10 = z9;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.n21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
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
                                                for (int i11 = 0; i11 < size; i11++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i11);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.r0();
                                                mt0 mt0Var = sessionsActivity2.X;
                                                if (mt0Var != null) {
                                                    mt0Var.a();
                                                }
                                            }
                                            y21 y21Var = sessionsActivity2.a;
                                            if (y21Var != null) {
                                                y21Var.f();
                                            }
                                            mt0 mt0Var2 = sessionsActivity2.X;
                                            if (mt0Var2 != null) {
                                                mt0Var2.a();
                                            }
                                            int i12 = sessionsActivity2.U;
                                            if (i12 > 0) {
                                                int i13 = i12 - 1;
                                                sessionsActivity2.U = i13;
                                                if (i13 > 0) {
                                                    org.telegram.messenger.g0.i3(new p21(sessionsActivity2, z10, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z10);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i11 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z11 = z9;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.n21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
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
                                                for (int i112 = 0; i112 < size; i112++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i112);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity22.h = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList.add(tL_authorization);
                                                    } else {
                                                        arrayList2.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity22.r0();
                                                mt0 mt0Var = sessionsActivity22.X;
                                                if (mt0Var != null) {
                                                    mt0Var.a();
                                                }
                                            }
                                            y21 y21Var = sessionsActivity22.a;
                                            if (y21Var != null) {
                                                y21Var.f();
                                            }
                                            mt0 mt0Var2 = sessionsActivity22.X;
                                            if (mt0Var2 != null) {
                                                mt0Var2.a();
                                            }
                                            int i12 = sessionsActivity22.U;
                                            if (i12 > 0) {
                                                int i13 = i12 - 1;
                                                sessionsActivity22.U = i13;
                                                if (i13 > 0) {
                                                    org.telegram.messenger.g0.i3(new p21(sessionsActivity22, z11, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z11);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.m21
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
                        final boolean z10 = z9;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.n21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i102) {
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
                                            for (int i112 = 0; i112 < size; i112++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i112);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            mt0 mt0Var = sessionsActivity22.X;
                                            if (mt0Var != null) {
                                                mt0Var.a();
                                            }
                                        }
                                        y21 y21Var = sessionsActivity22.a;
                                        if (y21Var != null) {
                                            y21Var.f();
                                        }
                                        mt0 mt0Var2 = sessionsActivity22.X;
                                        if (mt0Var2 != null) {
                                            mt0Var2.a();
                                        }
                                        int i12 = sessionsActivity22.U;
                                        if (i12 > 0) {
                                            int i13 = i12 - 1;
                                            sessionsActivity22.U = i13;
                                            if (i13 > 0) {
                                                org.telegram.messenger.g0.i3(new p21(sessionsActivity22, z10, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z10);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i11 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z11 = z9;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.n21
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
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
                                            for (int i112 = 0; i112 < size; i112++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i112);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity22.h = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList.add(tL_authorization);
                                                } else {
                                                    arrayList2.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity22.s = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity22.r0();
                                            mt0 mt0Var = sessionsActivity22.X;
                                            if (mt0Var != null) {
                                                mt0Var.a();
                                            }
                                        }
                                        y21 y21Var = sessionsActivity22.a;
                                        if (y21Var != null) {
                                            y21Var.f();
                                        }
                                        mt0 mt0Var2 = sessionsActivity22.X;
                                        if (mt0Var2 != null) {
                                            mt0Var2.a();
                                        }
                                        int i12 = sessionsActivity22.U;
                                        if (i12 > 0) {
                                            int i13 = i12 - 1;
                                            sessionsActivity22.U = i13;
                                            if (i13 > 0) {
                                                org.telegram.messenger.g0.i3(new p21(sessionsActivity22, z11, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z11);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }), this.classGuid);
    }

    public final void q0() {
        this.V = true;
    }

    public final void r0() {
        this.R = 0;
        this.x = -1;
        this.y = -1;
        this.terminateAllSessionsRow = -1;
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
        this.P = -1;
        this.Q = -1;
        this.S = -1;
        this.ttlRow = -1;
        this.T = -1;
        int i7 = this.w;
        if (i7 == 0 && getMessagesController().P3) {
            int i10 = this.R;
            this.P = i10;
            this.R = i10 + 2;
            this.Q = i10 + 1;
        }
        if (this.n) {
            if (i7 == 0) {
                int i11 = this.R;
                this.x = i11;
                this.R = i11 + 2;
                this.y = i11 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i12 = this.R;
            this.x = i12;
            this.R = i12 + 2;
            this.y = i12 + 1;
        }
        ArrayList arrayList = this.e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.D = -1;
            if (i7 == 1 || this.h != null) {
                int i13 = this.R;
                this.R = i13 + 1;
                this.O = i13;
            } else {
                this.O = -1;
            }
        } else {
            int i14 = this.R;
            this.terminateAllSessionsRow = i14;
            this.R = i14 + 2;
            this.D = i14 + 1;
            this.O = -1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.R;
            int i16 = i15 + 1;
            this.R = i16;
            this.E = i15;
            this.F = i16;
            int size = arrayList.size() + i16;
            this.G = size;
            this.R = size + 1;
            this.H = size;
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i17 = this.R;
                int i18 = i17 + 1;
                this.R = i18;
                this.I = i17;
                this.L = i18;
                int size2 = this.f.size() + i18;
                this.M = size2;
                this.R = size2 + 1;
                this.N = size2;
            }
        } else {
            int i19 = this.R;
            this.R = i19 + 1;
            this.I = i19;
            ArrayList arrayList4 = this.f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.R;
                this.L = i20;
                int size3 = this.f.size() + i20;
                this.R = size3;
                this.M = size3;
            }
            int i21 = this.R;
            this.J = i21;
            this.K = arrayList2.size() + i21;
            int size4 = arrayList2.size() + this.R;
            this.R = size4 + 1;
            this.N = size4;
        }
        if (this.s > 0) {
            int i22 = this.R;
            this.S = i22;
            this.ttlRow = i22 + 1;
            this.R = i22 + 3;
            this.T = i22 + 2;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
