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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public vu0 X;
    public p41 a;
    public nb0 b;
    public org.telegram.ui.Components.xy c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public l41 r;
    public int s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int w;
    public int x;
    public int y;

    public SessionsActivity(int i10) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.U = 0;
        this.w = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0488  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(SessionsActivity sessionsActivity, int i10) {
        int i11;
        String str;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        org.telegram.ui.Components.ag agVar;
        int i14;
        PorterDuff.Mode mode;
        boolean z12;
        int i15;
        ArrayList arrayList;
        String L0;
        ArrayList arrayList2 = sessionsActivity.d;
        int i16 = sessionsActivity.w;
        int i17 = 6;
        if (i10 != sessionsActivity.ttlRow) {
            if (i10 == sessionsActivity.terminateAllSessionsRow) {
                if (sessionsActivity.getParentActivity() == null) {
                    return;
                }
                ArrayList arrayList3 = sessionsActivity.f;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    if (i16 == 0) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754072, null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131754071, null);
                        L0 = org.telegram.messenger.cd.L0(2131744234, null);
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754062, null);
                        x1Var.R = org.telegram.messenger.cd.L0(2131744224, null);
                        L0 = org.telegram.messenger.cd.L0(2131751392, null);
                    }
                    alertDialog$Builder.k(L0, new j41(sessionsActivity, 1));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    sessionsActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                        return;
                    }
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = sessionsActivity.f;
                int size = arrayList4.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList4.get(i18);
                    i18++;
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).Z1(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                    if (Z1 != null) {
                        String n10 = org.telegram.messenger.h20.n(Z1);
                        if (TextUtils.isEmpty(n10)) {
                            spannableStringBuilder.append((CharSequence) org.telegram.messenger.h20.p(Z1));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) n10);
                            append.setSpan(new org.telegram.ui.Components.e51(sc.e.h("https://t.me/", n10), (org.telegram.ui.Components.yz0) null), 0, append.length(), 33);
                            spannableStringBuilder.append((CharSequence) append);
                        }
                    }
                }
                org.telegram.ui.Components.s4.h0(sessionsActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131754071, null), org.telegram.messenger.cd.L0(2131754072, null), org.telegram.messenger.cd.V(null, null, 2131754271, spannableStringBuilder), org.telegram.messenger.cd.L0(2131744234, null), new i41(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
                return;
            }
            if (i10 >= sessionsActivity.L && i10 < sessionsActivity.M) {
                if (sessionsActivity.getParentActivity() == null || (arrayList = sessionsActivity.f) == null || arrayList.isEmpty()) {
                    return;
                }
                int i19 = i10 - sessionsActivity.L;
                new ag.j1(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f.get(i19), new org.telegram.ui.Components.qq(sessionsActivity, i19, 21), sessionsActivity.resourceProvider).show();
                return;
            }
            if (((i10 < sessionsActivity.J || i10 >= sessionsActivity.K) && ((i10 < sessionsActivity.F || i10 >= sessionsActivity.G) && i10 != sessionsActivity.y)) || sessionsActivity.getParentActivity() == null) {
                return;
            }
            if (i16 != 0) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                boolean[] zArr = new boolean[1];
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                if (i16 == 0) {
                    x1Var2.T = org.telegram.messenger.cd.L0(2131744229, null);
                    x1Var2.R = org.telegram.messenger.cd.L0(2131754073, null);
                    charSequence = org.telegram.messenger.cd.L0(2131744234, null);
                } else {
                    TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i10 - sessionsActivity.J);
                    x1Var2.T = org.telegram.messenger.cd.a0("TerminateWebSessionText", null, 2131744226, tL_webAuthorization.domain);
                    x1Var2.R = org.telegram.messenger.cd.L0(2131744225, null);
                    CharSequence L02 = org.telegram.messenger.cd.L0(2131751392, null);
                    FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                    TLRPC.User Z12 = org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).Z1(Long.valueOf(tL_webAuthorization.bot_id));
                    if (Z12 != null) {
                        i11 = 1;
                        str = org.telegram.messenger.h20.j(Z12, true);
                    } else {
                        i11 = 1;
                        str = "";
                    }
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(sessionsActivity.getParentActivity(), i11);
                    c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                    Object[] objArr = new Object[i11];
                    objArr[0] = str;
                    c2Var.e(org.telegram.messenger.cd.a0("TerminateWebSessionStop", null, 2131744227, objArr), "", false, false, false);
                    c2Var.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                    frameLayout.addView(c2Var, w7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    c2Var.setOnClickListener(new j8(i17, zArr));
                    x1Var2.G = 16;
                    alertDialog$Builder2.o(frameLayout);
                    charSequence = L02;
                }
                alertDialog$Builder2.k(charSequence, new ag.b0(sessionsActivity, i10, zArr, 15));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                sessionsActivity.showDialog(x1Var2);
                TextView textView2 = (TextView) x1Var2.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                    return;
                }
                return;
            }
            if (i10 == sessionsActivity.y) {
                tL_authorization = sessionsActivity.h;
                z10 = true;
            } else {
                int i20 = sessionsActivity.J;
                tL_authorization = (i10 < i20 || i10 >= sessionsActivity.K) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F) : (TLRPC.TL_authorization) arrayList2.get(i10 - i20);
                z10 = false;
            }
            if (tL_authorization == null) {
                return;
            }
            m41 m41Var = new m41(sessionsActivity);
            c41 c41Var = new c41(sessionsActivity.getParentActivity(), false);
            c41Var.R0 = true;
            Activity parentActivity = sessionsActivity.getParentActivity();
            c41Var.i1 = tL_authorization;
            c41Var.j1 = sessionsActivity;
            c41Var.O();
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(parentActivity);
            c41Var.k1 = ei0Var;
            ei0Var.setOnClickListener(new u31(c41Var));
            ei0Var.setScaleType(ImageView.ScaleType.CENTER);
            linearLayout.addView(ei0Var, w7.b6.t(70, 70, 1, 0, 16, 0, 0));
            TextView textView3 = new TextView(parentActivity);
            sc.e.t(textView3, 2, 20.0f);
            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.G6, null);
            textView3.setGravity(17);
            linearLayout.addView(textView3, w7.b6.t(-1, -2, 1, 21, 12, 21, 0));
            TextView textView4 = new TextView(parentActivity);
            org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.y6, null);
            textView4.setTextSize(2, 13.0f);
            textView4.setGravity(17);
            linearLayout.addView(textView4, w7.b6.t(-1, -2, 1, 21, 4, 21, 21));
            textView4.setText((tL_authorization.flags & 1) != 0 ? org.telegram.messenger.cd.L0(2131747842, null) : org.telegram.messenger.cd.x(tL_authorization.date_active, true));
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
                i13 = org.telegram.ui.ActionBar.t6.U7;
                i12 = R.raw.safari_30;
            } else if (lowerCase2.contains("edge")) {
                i13 = org.telegram.ui.ActionBar.t6.U7;
                i12 = R.raw.edge_30;
            } else {
                if (lowerCase2.contains("chrome")) {
                    i13 = org.telegram.ui.ActionBar.t6.U7;
                } else if (lowerCase2.contains("firefox")) {
                    i13 = org.telegram.ui.ActionBar.t6.O7;
                    i12 = R.raw.firefox_30;
                } else {
                    if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
                        i12 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
                        i13 = org.telegram.ui.ActionBar.t6.U7;
                        z11 = false;
                        ShapeDrawable L = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(42.0f), org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                        ei0Var.setBackground(L);
                        org.telegram.ui.ActionBar.a7.k(ei0Var, L, N, null, null);
                        if (z11) {
                            ei0Var.setImageDrawable(c41Var.getContext().getDrawable(i12));
                        } else {
                            ei0Var.f(i12, 50, 50, new int[]{0, org.telegram.ui.ActionBar.t6.x0(null, i13, false)});
                        }
                        agVar = new org.telegram.ui.Components.ag(parentActivity, false);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(tL_authorization.app_name);
                        sb3.append(" ");
                        sb3.append(tL_authorization.app_version);
                        ((TextView) agVar.d).setText(sb3);
                        Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                        View view = agVar.c;
                        i14 = org.telegram.ui.ActionBar.t6.m6;
                        mode = PorterDuff.Mode.SRC_IN;
                        org.telegram.ui.ActionBar.a7.y((ImageView) view, mutate, i14, null, mode);
                        ((ImageView) view).setImageDrawable(mutate);
                        ((TextView) agVar.e).setText(org.telegram.messenger.cd.L0(2131754222, null));
                        linearLayout.addView(agVar);
                        if (tL_authorization.country.length() != 0) {
                            org.telegram.ui.Components.ag agVar2 = new org.telegram.ui.Components.ag(parentActivity, false);
                            ((TextView) agVar2.d).setText(tL_authorization.country);
                            Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                            View view2 = agVar2.c;
                            org.telegram.ui.ActionBar.a7.y((ImageView) view2, mutate2, i14, null, mode);
                            ((ImageView) view2).setImageDrawable(mutate2);
                            ((TextView) agVar2.e).setText(org.telegram.messenger.cd.L0(2131748767, null));
                            agVar2.setOnClickListener(new v31(c41Var, tL_authorization));
                            agVar2.setOnLongClickListener(new w31(c41Var, tL_authorization));
                            int i21 = org.telegram.ui.ActionBar.t6.i6;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i21, false), 2, -1);
                            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i21);
                            agVar2.setBackground(h02);
                            org.telegram.ui.ActionBar.a7.k(agVar2, h02, null, N2, null);
                            linearLayout.addView(agVar2);
                            agVar.b = true;
                            agVar = agVar2;
                        }
                        if (tL_authorization.ip.length() == 0) {
                            org.telegram.ui.Components.ag agVar3 = new org.telegram.ui.Components.ag(parentActivity, false);
                            ((TextView) agVar3.d).setText(tL_authorization.ip);
                            Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                            View view3 = agVar3.c;
                            org.telegram.ui.ActionBar.a7.y((ImageView) view3, mutate3, i14, null, mode);
                            ((ImageView) view3).setImageDrawable(mutate3);
                            ((TextView) agVar3.e).setText(org.telegram.messenger.cd.L0(2131749112, null));
                            agVar3.setOnClickListener(new x31(c41Var, tL_authorization));
                            agVar3.setOnLongClickListener(new y31(c41Var, tL_authorization));
                            int i22 = org.telegram.ui.ActionBar.t6.i6;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i22, false), 2, -1);
                            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i22);
                            agVar3.setBackground(h03);
                            org.telegram.ui.ActionBar.a7.k(agVar3, h03, null, N3, null);
                            linearLayout.addView(agVar3);
                            z12 = true;
                            agVar.b = true;
                            agVar = agVar3;
                        } else {
                            z12 = true;
                        }
                        i15 = tL_authorization.api_id;
                        if (i15 != 2040 && i15 != 2496) {
                            org.telegram.ui.Components.ag agVar4 = new org.telegram.ui.Components.ag(parentActivity, z12);
                            ((TextView) agVar4.d).setText(org.telegram.messenger.cd.L0(2131754713, null));
                            Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                            View view4 = agVar4.c;
                            org.telegram.ui.ActionBar.a7.y((ImageView) view4, mutate4, i14, null, mode);
                            ((ImageView) view4).setImageDrawable(mutate4);
                            ((Switch) agVar4.f).c(!tL_authorization.encrypted_requests_disabled, false);
                            int i23 = org.telegram.ui.ActionBar.t6.i6;
                            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i23, false), 7, -1);
                            org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i23);
                            agVar4.setBackground(h04);
                            org.telegram.ui.ActionBar.a7.k(agVar4, h04, null, N4, null);
                            agVar4.setOnClickListener(new z31(c41Var, agVar4, tL_authorization));
                            agVar.b = true;
                            ((TextView) agVar4.e).setText(org.telegram.messenger.cd.L0(2131754712, null));
                            linearLayout.addView(agVar4);
                            agVar = agVar4;
                        }
                        if (tL_authorization.api_id != 22) {
                            org.telegram.ui.Components.ag agVar5 = new org.telegram.ui.Components.ag(parentActivity, true);
                            ((TextView) agVar5.d).setText(org.telegram.messenger.cd.L0(2131754715, null));
                            Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                            View view5 = agVar5.c;
                            org.telegram.ui.ActionBar.a7.y((ImageView) view5, mutate5, i14, null, mode);
                            ((ImageView) view5).setImageDrawable(mutate5);
                            ((Switch) agVar5.f).c(!tL_authorization.call_requests_disabled, false);
                            int i24 = org.telegram.ui.ActionBar.t6.i6;
                            org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i24, false), 7, -1);
                            org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i24);
                            agVar5.setBackground(h05);
                            org.telegram.ui.ActionBar.a7.k(agVar5, h05, null, N5, null);
                            agVar5.setOnClickListener(new a41(c41Var, agVar5, tL_authorization));
                            agVar.b = true;
                            ((TextView) agVar5.e).setText(org.telegram.messenger.cd.L0(2131754714, null));
                            linearLayout.addView(agVar5);
                        }
                        if (!z10) {
                            TextView textView5 = new TextView(parentActivity);
                            textView5.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                            textView5.setGravity(17);
                            textView5.setTextSize(1, 14.0f);
                            textView5.setTypeface(org.telegram.messenger.i0.o());
                            textView5.setText(org.telegram.messenger.cd.L0(2131744230, null));
                            org.telegram.ui.ActionBar.a7.V(textView5, org.telegram.ui.ActionBar.t6.Gi, null);
                            int L2 = org.telegram.messenger.i0.L(24.0f);
                            int i25 = org.telegram.ui.ActionBar.t6.ka;
                            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i25, false);
                            int i26 = org.telegram.ui.ActionBar.t6.d6;
                            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i26, false), 120);
                            org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, x02, o10, o10);
                            org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i25);
                            org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i26, 120);
                            textView5.setBackground(k02);
                            org.telegram.ui.ActionBar.a7.k(textView5, k02, N6, h, null);
                            linearLayout.addView(textView5, w7.b6.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                            textView5.setOnClickListener(new b41(c41Var, m41Var, tL_authorization, sessionsActivity));
                        }
                        ScrollView scrollView = new ScrollView(parentActivity);
                        scrollView.addView(linearLayout);
                        c41Var.N = scrollView;
                        c41Var.show();
                        return;
                    }
                    if (lowerCase.contains("ubuntu")) {
                        i13 = org.telegram.ui.ActionBar.t6.T7;
                        i12 = R.raw.ubuntu_30;
                    } else if (lowerCase.contains("linux")) {
                        i13 = org.telegram.ui.ActionBar.t6.T7;
                        i12 = R.raw.linux_30;
                    } else if (lowerCase.contains("ios")) {
                        i12 = lowerCase2.contains("ipad") ? R.raw.ipad_30 : R.raw.iphone_30;
                        i13 = org.telegram.ui.ActionBar.t6.T7;
                    } else {
                        if (lowerCase.contains("windows")) {
                            i13 = org.telegram.ui.ActionBar.t6.S7;
                        } else if (lowerCase.contains("macos")) {
                            i13 = org.telegram.ui.ActionBar.t6.S7;
                            i12 = R.raw.mac_30;
                        } else if (lowerCase.contains("android")) {
                            i13 = org.telegram.ui.ActionBar.t6.R7;
                            i12 = R.raw.android_30;
                        } else if (tL_authorization.app_name.toLowerCase().contains("desktop")) {
                            i13 = org.telegram.ui.ActionBar.t6.S7;
                        } else {
                            i13 = org.telegram.ui.ActionBar.t6.U7;
                        }
                        i12 = R.raw.windows_30;
                    }
                }
                i12 = R.raw.chrome_30;
            }
            z11 = true;
            ShapeDrawable L3 = org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(42.0f), org.telegram.ui.ActionBar.t6.x0(null, i13, false));
            org.telegram.ui.ActionBar.w6 N7 = org.telegram.ui.ActionBar.a7.N(i13);
            ei0Var.setBackground(L3);
            org.telegram.ui.ActionBar.a7.k(ei0Var, L3, N7, null, null);
            if (z11) {
            }
            agVar = new org.telegram.ui.Components.ag(parentActivity, false);
            StringBuilder sb32 = new StringBuilder();
            sb32.append(tL_authorization.app_name);
            sb32.append(" ");
            sb32.append(tL_authorization.app_version);
            ((TextView) agVar.d).setText(sb32);
            Drawable mutate6 = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
            View view6 = agVar.c;
            i14 = org.telegram.ui.ActionBar.t6.m6;
            mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.a7.y((ImageView) view6, mutate6, i14, null, mode);
            ((ImageView) view6).setImageDrawable(mutate6);
            ((TextView) agVar.e).setText(org.telegram.messenger.cd.L0(2131754222, null));
            linearLayout.addView(agVar);
            if (tL_authorization.country.length() != 0) {
            }
            if (tL_authorization.ip.length() == 0) {
            }
            i15 = tL_authorization.api_id;
            if (i15 != 2040) {
                org.telegram.ui.Components.ag agVar42 = new org.telegram.ui.Components.ag(parentActivity, z12);
                ((TextView) agVar42.d).setText(org.telegram.messenger.cd.L0(2131754713, null));
                Drawable mutate42 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                View view42 = agVar42.c;
                org.telegram.ui.ActionBar.a7.y((ImageView) view42, mutate42, i14, null, mode);
                ((ImageView) view42).setImageDrawable(mutate42);
                ((Switch) agVar42.f).c(!tL_authorization.encrypted_requests_disabled, false);
                int i232 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y h042 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i232, false), 7, -1);
                org.telegram.ui.ActionBar.w6 N42 = org.telegram.ui.ActionBar.a7.N(i232);
                agVar42.setBackground(h042);
                org.telegram.ui.ActionBar.a7.k(agVar42, h042, null, N42, null);
                agVar42.setOnClickListener(new z31(c41Var, agVar42, tL_authorization));
                agVar.b = true;
                ((TextView) agVar42.e).setText(org.telegram.messenger.cd.L0(2131754712, null));
                linearLayout.addView(agVar42);
                agVar = agVar42;
            }
            if (tL_authorization.api_id != 22) {
            }
            if (!z10) {
            }
            ScrollView scrollView2 = new ScrollView(parentActivity);
            scrollView2.addView(linearLayout);
            c41Var.N = scrollView2;
            c41Var.show();
            return;
        }
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        int i27 = sessionsActivity.s;
        int i28 = i27 <= 7 ? 0 : i27 <= 93 ? 1 : i27 <= 183 ? 2 : 3;
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
        String L03 = org.telegram.messenger.cd.L0(2131745570, null);
        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
        x1Var3.R = L03;
        String[] strArr = {org.telegram.messenger.cd.G(1, "Weeks", new Object[0]), org.telegram.messenger.cd.G(3, "Months", new Object[0]), org.telegram.messenger.cd.G(6, "Months", new Object[0]), org.telegram.messenger.cd.G(1, "Years", new Object[0])};
        LinearLayout linearLayout2 = new LinearLayout(sessionsActivity.getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder3.o(linearLayout2);
        int i29 = 0;
        while (true) {
            int i30 = 4;
            if (i29 >= 4) {
                alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                sessionsActivity.showDialog(x1Var3);
                return;
            }
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(sessionsActivity.getParentActivity(), null);
            n6Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            n6Var.setTag(Integer.valueOf(i29));
            n6Var.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E5, false));
            n6Var.b(strArr[i29], i28 == i29);
            linearLayout2.addView(n6Var);
            n6Var.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false), 2, -1));
            n6Var.setOnClickListener(new rv0(i30, sessionsActivity, alertDialog$Builder3));
            i29++;
        }
    }

    public static /* synthetic */ void Z(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).n1(((TL_account.TL_connectedBot) sessionsActivity.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new f41(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new f41(sessionsActivity, 1));
    }

    public static /* synthetic */ void a0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new f41(sessionsActivity, 2));
        } else {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new f41(sessionsActivity, 3));
        }
    }

    public static void b0(SessionsActivity sessionsActivity, int i10, boolean[] zArr) {
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, sessionsActivity.getParentActivity(), null);
        x1Var.i0 = false;
        x1Var.show();
        if (sessionsActivity.w == 0) {
            int i11 = sessionsActivity.J;
            TLRPC.TL_authorization tL_authorization = (i10 < i11 || i10 >= sessionsActivity.K) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i10 - sessionsActivity.F) : (TLRPC.TL_authorization) arrayList.get(i10 - i11);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new vp0(sessionsActivity, x1Var, tL_authorization, 8));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i10 - sessionsActivity.J);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new vp0(sessionsActivity, x1Var, tL_webAuthorization, 9));
        if (zArr[0]) {
            org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
        }
    }

    public static /* synthetic */ void c0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.vp.r1(sessionsActivity.currentAccount).V3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.q0();
        }
        p41 p41Var = sessionsActivity.a;
        if (p41Var != null) {
            p41Var.f();
        }
        vu0 vu0Var = sessionsActivity.X;
        if (vu0Var != null) {
            vu0Var.a();
        }
        int i10 = sessionsActivity.U;
        if (i10 > 0) {
            int i11 = i10 - 1;
            sessionsActivity.U = i11;
            if (i11 > 0) {
                org.telegram.messenger.i0.h3(new g41(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        new org.telegram.ui.Components.zz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.w;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751456, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131742937, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, i10));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new p41(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.c = xyVar;
        xyVar.b();
        nb0 nb0Var = new nb0(this, context, 2);
        this.b = nb0Var;
        nb0Var.r1();
        this.b.setLayoutManager(new dh.f(i10, false, 17));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        nb0 nb0Var2 = this.b;
        nb0Var2.W1 = true;
        nb0Var2.X1 = 0;
        frameLayout.addView(nb0Var2, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.c, w7.b6.e(-1, -1, 17));
        this.b.setAdapter(this.a);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        this.b.setItemAnimator(jVar);
        this.b.setOnItemClickListener(new kz0(this, 5));
        if (i11 == 0) {
            l41 l41Var = new l41(this, context);
            this.r = l41Var;
            frameLayout.addView(l41Var, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        q0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.u0) {
            o0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.w6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        int i10 = org.telegram.ui.ActionBar.t6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262148, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262148, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262144, new Class[]{org.telegram.ui.Cells.w6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int n0() {
        ArrayList arrayList = this.d;
        if (arrayList.size() == 0 && this.n) {
            return 0;
        }
        return arrayList.size() + (this.w == 0 ? 1 : 0);
    }

    public final void o0(final boolean z10) {
        if (this.n) {
            return;
        }
        if (!z10) {
            this.n = true;
        }
        if (this.w == 0) {
            final int i10 = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.d41
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
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.e41
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
                                                sessionsActivity2.q0();
                                                vu0 vu0Var = sessionsActivity2.X;
                                                if (vu0Var != null) {
                                                    vu0Var.a();
                                                }
                                            }
                                            p41 p41Var = sessionsActivity2.a;
                                            if (p41Var != null) {
                                                p41Var.f();
                                            }
                                            vu0 vu0Var2 = sessionsActivity2.X;
                                            if (vu0Var2 != null) {
                                                vu0Var2.a();
                                            }
                                            int i13 = sessionsActivity2.U;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity2.U = i14;
                                                if (i14 > 0) {
                                                    org.telegram.messenger.i0.h3(new g41(sessionsActivity2, z11, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.c0(sessionsActivity, tL_error, tLObject, z11);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i12 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z12 = z10;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.e41
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
                                                sessionsActivity22.q0();
                                                vu0 vu0Var = sessionsActivity22.X;
                                                if (vu0Var != null) {
                                                    vu0Var.a();
                                                }
                                            }
                                            p41 p41Var = sessionsActivity22.a;
                                            if (p41Var != null) {
                                                p41Var.f();
                                            }
                                            vu0 vu0Var2 = sessionsActivity22.X;
                                            if (vu0Var2 != null) {
                                                vu0Var2.a();
                                            }
                                            int i13 = sessionsActivity22.U;
                                            if (i13 > 0) {
                                                int i14 = i13 - 1;
                                                sessionsActivity22.U = i14;
                                                if (i14 > 0) {
                                                    org.telegram.messenger.i0.h3(new g41(sessionsActivity22, z12, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.c0(sessionsActivity2, tL_error, tLObject, z12);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.d41
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
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.e41
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
                                            sessionsActivity22.q0();
                                            vu0 vu0Var = sessionsActivity22.X;
                                            if (vu0Var != null) {
                                                vu0Var.a();
                                            }
                                        }
                                        p41 p41Var = sessionsActivity22.a;
                                        if (p41Var != null) {
                                            p41Var.f();
                                        }
                                        vu0 vu0Var2 = sessionsActivity22.X;
                                        if (vu0Var2 != null) {
                                            vu0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.U;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.U = i14;
                                            if (i14 > 0) {
                                                org.telegram.messenger.i0.h3(new g41(sessionsActivity22, z11, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.c0(sessionsActivity, tL_error, tLObject, z11);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i12 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z12 = z10;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.e41
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
                                            sessionsActivity22.q0();
                                            vu0 vu0Var = sessionsActivity22.X;
                                            if (vu0Var != null) {
                                                vu0Var.a();
                                            }
                                        }
                                        p41 p41Var = sessionsActivity22.a;
                                        if (p41Var != null) {
                                            p41Var.f();
                                        }
                                        vu0 vu0Var2 = sessionsActivity22.X;
                                        if (vu0Var2 != null) {
                                            vu0Var2.a();
                                        }
                                        int i13 = sessionsActivity22.U;
                                        if (i13 > 0) {
                                            int i14 = i13 - 1;
                                            sessionsActivity22.U = i14;
                                            if (i14 > 0) {
                                                org.telegram.messenger.i0.h3(new g41(sessionsActivity22, z12, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.c0(sessionsActivity2, tL_error, tLObject, z12);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        l41 l41Var = this.r;
        if (l41Var != null) {
            l41Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        q0();
        o0(false);
        if (this.w == 0) {
            ag.k.a(this.currentAccount).c(new i41(this, 0));
        }
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.u0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.u0);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        l41 l41Var = this.r;
        if (l41Var != null) {
            l41Var.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        l41 l41Var = this.r;
        if (l41Var != null) {
            l41Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            int i11 = 0;
            if (iArr.length > 0 && iArr[0] == 0) {
                u9.i0(getParentActivity(), 2, new o41(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131746518, null));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747316, null), new j41(this, i11));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751772, null), null);
            int i12 = org.telegram.ui.ActionBar.t6.L5;
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        p41 p41Var = this.a;
        if (p41Var != null) {
            p41Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.W = true;
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            View childAt = this.b.getChildAt(i10);
            if (childAt instanceof q41) {
                ((q41) childAt).b.invalidate();
            }
        }
    }

    public final void p0() {
        this.V = true;
    }

    public final void q0() {
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
        int i10 = this.w;
        if (i10 == 0 && getMessagesController().R3) {
            int i11 = this.R;
            this.P = i11;
            this.R = i11 + 2;
            this.Q = i11 + 1;
        }
        if (this.n) {
            if (i10 == 0) {
                int i12 = this.R;
                this.x = i12;
                this.R = i12 + 2;
                this.y = i12 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i13 = this.R;
            this.x = i13;
            this.R = i13 + 2;
            this.y = i13 + 1;
        }
        ArrayList arrayList = this.e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.D = -1;
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
            this.D = i15 + 1;
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

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
