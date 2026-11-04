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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class SessionsActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public dt0 Y;
    public o21 a;
    public xs b;
    public org.telegram.ui.Components.gy c;
    public final ArrayList d;
    public final ArrayList e;
    public ArrayList f;
    public TLRPC.TL_authorization h;
    public boolean n;
    public j21 r;
    public int s;
    private int terminateAllSessionsRow;
    private int ttlRow;
    public final int w;
    public int x;
    public int y;

    public SessionsActivity(int i3) {
        super(null);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.V = 0;
        this.w = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(SessionsActivity sessionsActivity, int i3) {
        int i10;
        String str;
        CharSequence charSequence;
        TLRPC.TL_authorization tL_authorization;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        org.telegram.ui.Components.cg cgVar;
        int i13;
        PorterDuff.Mode mode;
        boolean z12;
        int i14;
        ArrayList arrayList;
        String M0;
        ArrayList arrayList2 = sessionsActivity.d;
        int i15 = sessionsActivity.w;
        int i16 = 6;
        int i17 = 16;
        if (i3 == sessionsActivity.ttlRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            int i18 = sessionsActivity.s;
            int i19 = i18 <= 7 ? 0 : i18 <= 93 ? 1 : i18 <= 183 ? 2 : 3;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            String M02 = org.telegram.messenger.bd.M0(2131745563, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M02;
            String[] strArr = {org.telegram.messenger.bd.G(1, "Weeks", new Object[0]), org.telegram.messenger.bd.G(3, "Months", new Object[0]), org.telegram.messenger.bd.G(6, "Months", new Object[0]), org.telegram.messenger.bd.G(1, "Years", new Object[0])};
            LinearLayout linearLayout = new LinearLayout(sessionsActivity.getParentActivity());
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            int i20 = 0;
            while (i20 < 4) {
                org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(sessionsActivity.getParentActivity(), null);
                i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                i6Var.setTag(Integer.valueOf(i20));
                i6Var.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.g7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E5, false));
                i6Var.b(strArr[i20], i19 == i20);
                linearLayout.addView(i6Var);
                i6Var.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), 2, -1));
                i6Var.setOnClickListener(new hb0(i17, sessionsActivity, alertDialog$Builder));
                i20++;
            }
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            sessionsActivity.showDialog(s1Var);
            return;
        }
        if (i3 == sessionsActivity.terminateAllSessionsRow) {
            if (sessionsActivity.getParentActivity() == null) {
                return;
            }
            ArrayList arrayList3 = sessionsActivity.f;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                if (i15 == 0) {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131754072, null);
                    s1Var2.S = org.telegram.messenger.bd.M0(2131754071, null);
                    M0 = org.telegram.messenger.bd.M0(2131744219, null);
                } else {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131754062, null);
                    s1Var2.S = org.telegram.messenger.bd.M0(2131744209, null);
                    M0 = org.telegram.messenger.bd.M0(2131751392, null);
                }
                alertDialog$Builder2.k(M0, new i21(sessionsActivity, 1));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                sessionsActivity.showDialog(s1Var2);
                TextView textView = (TextView) s1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList4 = sessionsActivity.f;
            int size = arrayList4.size();
            int i21 = 0;
            while (i21 < size) {
                Object obj = arrayList4.get(i21);
                i21++;
                TLRPC.User a22 = org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).a2(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (a22 != null) {
                    String n4 = org.telegram.messenger.l10.n(a22);
                    if (TextUtils.isEmpty(n4)) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.l10.p(a22));
                    } else {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder("@").append((CharSequence) n4);
                        append.setSpan(new org.telegram.ui.Components.v31(t4.c.f("https://t.me/", n4), (org.telegram.ui.Components.ty0) null), 0, append.length(), 33);
                        spannableStringBuilder.append((CharSequence) append);
                    }
                }
            }
            org.telegram.ui.Components.t4.h0(sessionsActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131754071, null), org.telegram.messenger.bd.M0(2131754072, null), org.telegram.messenger.bd.V(null, null, 2131754271, spannableStringBuilder), org.telegram.messenger.bd.M0(2131744219, null), new h21(sessionsActivity, 1), sessionsActivity.resourceProvider, false);
            return;
        }
        if (i3 >= sessionsActivity.M && i3 < sessionsActivity.N) {
            if (sessionsActivity.getParentActivity() == null || (arrayList = sessionsActivity.f) == null || arrayList.isEmpty()) {
                return;
            }
            int i22 = i3 - sessionsActivity.M;
            new lg.j0(sessionsActivity.getParentActivity(), (TL_account.TL_connectedBot) sessionsActivity.f.get(i22), new org.telegram.ui.Components.o2(sessionsActivity, i22, 26), sessionsActivity.resourceProvider).show();
            return;
        }
        if (((i3 < sessionsActivity.K || i3 >= sessionsActivity.L) && ((i3 < sessionsActivity.G || i3 >= sessionsActivity.H) && i3 != sessionsActivity.y)) || sessionsActivity.getParentActivity() == null) {
            return;
        }
        if (i15 != 0) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(sessionsActivity.getParentActivity());
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
            if (i15 == 0) {
                s1Var3.U = org.telegram.messenger.bd.M0(2131744214, null);
                s1Var3.S = org.telegram.messenger.bd.M0(2131754073, null);
                charSequence = org.telegram.messenger.bd.M0(2131744219, null);
            } else {
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList2.get(i3 - sessionsActivity.K);
                s1Var3.U = org.telegram.messenger.bd.a0("TerminateWebSessionText", null, 2131744211, tL_webAuthorization.domain);
                s1Var3.S = org.telegram.messenger.bd.M0(2131744210, null);
                CharSequence M03 = org.telegram.messenger.bd.M0(2131751392, null);
                FrameLayout frameLayout = new FrameLayout(sessionsActivity.getParentActivity());
                TLRPC.User a23 = org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).a2(Long.valueOf(tL_webAuthorization.bot_id));
                if (a23 != null) {
                    i10 = 1;
                    str = org.telegram.messenger.l10.j(a23, true);
                } else {
                    i10 = 1;
                    str = "";
                }
                org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(sessionsActivity.getParentActivity(), i10);
                c2Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                Object[] objArr = new Object[i10];
                objArr[0] = str;
                c2Var.e(org.telegram.messenger.bd.a0("TerminateWebSessionStop", null, 2131744212, objArr), "", false, false, false);
                c2Var.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                frameLayout.addView(c2Var, b8.mf.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                c2Var.setOnClickListener(new k8(i16, zArr));
                s1Var3.H = 16;
                alertDialog$Builder3.o(frameLayout);
                charSequence = M03;
            }
            alertDialog$Builder3.k(charSequence, new k2.y(sessionsActivity, i3, zArr, i17));
            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            sessionsActivity.showDialog(s1Var3);
            TextView textView2 = (TextView) s1Var3.d(-1);
            if (textView2 != null) {
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i3 == sessionsActivity.y) {
            tL_authorization = sessionsActivity.h;
            z10 = true;
        } else {
            int i23 = sessionsActivity.K;
            tL_authorization = (i3 < i23 || i3 >= sessionsActivity.L) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i3 - sessionsActivity.G) : (TLRPC.TL_authorization) arrayList2.get(i3 - i23);
            z10 = false;
        }
        if (tL_authorization == null) {
            return;
        }
        k21 k21Var = new k21(sessionsActivity);
        b21 b21Var = new b21(sessionsActivity.getParentActivity(), false);
        b21Var.S0 = true;
        Activity parentActivity = sessionsActivity.getParentActivity();
        b21Var.j1 = tL_authorization;
        b21Var.k1 = sessionsActivity;
        b21Var.N();
        LinearLayout linearLayout2 = new LinearLayout(parentActivity);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(parentActivity);
        b21Var.l1 = fh0Var;
        fh0Var.setOnClickListener(new t11(b21Var));
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout2.addView(fh0Var, b8.mf.t(70, 70, 1, 0, 16, 0, 0));
        TextView textView3 = new TextView(parentActivity);
        k2.p1.t(textView3, 2, 20.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.G6, null);
        textView3.setGravity(17);
        linearLayout2.addView(textView3, b8.mf.t(-1, -2, 1, 21, 12, 21, 0));
        TextView textView4 = new TextView(parentActivity);
        org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.y6, null);
        textView4.setTextSize(2, 13.0f);
        textView4.setGravity(17);
        linearLayout2.addView(textView4, b8.mf.t(-1, -2, 1, 21, 4, 21, 21));
        textView4.setText((tL_authorization.flags & 1) != 0 ? org.telegram.messenger.bd.M0(2131747834, null) : org.telegram.messenger.bd.x(tL_authorization.date_active, true));
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
        } else {
            if (lowerCase2.contains("chrome")) {
                i12 = org.telegram.ui.ActionBar.k6.U7;
            } else if (lowerCase2.contains("firefox")) {
                i12 = org.telegram.ui.ActionBar.k6.O7;
                i11 = R.raw.firefox_30;
            } else {
                if (lowerCase2.contains("opera") || lowerCase2.contains("firefox") || lowerCase2.contains("vivaldi")) {
                    i11 = lowerCase2.contains("opera") ? R.drawable.device_web_opera : lowerCase2.contains("firefox") ? R.drawable.device_web_firefox : R.drawable.device_web_other;
                    i12 = org.telegram.ui.ActionBar.k6.U7;
                    z11 = false;
                    ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                    fh0Var.setBackground(L);
                    org.telegram.ui.ActionBar.r6.k(fh0Var, L, N, null, null);
                    if (z11) {
                        fh0Var.setImageDrawable(b21Var.getContext().getDrawable(i11));
                    } else {
                        fh0Var.f(i11, 50, 50, new int[]{0, org.telegram.ui.ActionBar.k6.x0(null, i12, false)});
                    }
                    cgVar = new org.telegram.ui.Components.cg(parentActivity, false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(tL_authorization.app_name);
                    sb3.append(" ");
                    sb3.append(tL_authorization.app_version);
                    ((TextView) cgVar.d).setText(sb3);
                    Drawable mutate = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
                    View view = cgVar.c;
                    i13 = org.telegram.ui.ActionBar.k6.m6;
                    mode = PorterDuff.Mode.SRC_IN;
                    org.telegram.ui.ActionBar.r6.y((ImageView) view, mutate, i13, null, mode);
                    ((ImageView) view).setImageDrawable(mutate);
                    ((TextView) cgVar.e).setText(org.telegram.messenger.bd.M0(2131754222, null));
                    linearLayout2.addView(cgVar);
                    if (tL_authorization.country.length() != 0) {
                        org.telegram.ui.Components.cg cgVar2 = new org.telegram.ui.Components.cg(parentActivity, false);
                        ((TextView) cgVar2.d).setText(tL_authorization.country);
                        Drawable mutate2 = parentActivity.getDrawable(R.drawable.msg_location).mutate();
                        View view2 = cgVar2.c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view2, mutate2, i13, null, mode);
                        ((ImageView) view2).setImageDrawable(mutate2);
                        ((TextView) cgVar2.e).setText(org.telegram.messenger.bd.M0(2131748765, null));
                        cgVar2.setOnClickListener(new u11(b21Var, tL_authorization));
                        cgVar2.setOnLongClickListener(new v11(b21Var, tL_authorization));
                        int i24 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i24, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i24);
                        cgVar2.setBackground(h02);
                        org.telegram.ui.ActionBar.r6.k(cgVar2, h02, null, N2, null);
                        linearLayout2.addView(cgVar2);
                        cgVar.b = true;
                        cgVar = cgVar2;
                    }
                    if (tL_authorization.ip.length() == 0) {
                        org.telegram.ui.Components.cg cgVar3 = new org.telegram.ui.Components.cg(parentActivity, false);
                        ((TextView) cgVar3.d).setText(tL_authorization.ip);
                        Drawable mutate3 = parentActivity.getDrawable(R.drawable.msg_language).mutate();
                        View view3 = cgVar3.c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view3, mutate3, i13, null, mode);
                        ((ImageView) view3).setImageDrawable(mutate3);
                        ((TextView) cgVar3.e).setText(org.telegram.messenger.bd.M0(2131749110, null));
                        cgVar3.setOnClickListener(new w11(b21Var, tL_authorization));
                        cgVar3.setOnLongClickListener(new x11(b21Var, tL_authorization));
                        int i25 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i25, false), 2, -1);
                        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i25);
                        cgVar3.setBackground(h03);
                        org.telegram.ui.ActionBar.r6.k(cgVar3, h03, null, N3, null);
                        linearLayout2.addView(cgVar3);
                        z12 = true;
                        cgVar.b = true;
                        cgVar = cgVar3;
                    } else {
                        z12 = true;
                    }
                    i14 = tL_authorization.api_id;
                    if (i14 != 2040 && i14 != 2496) {
                        org.telegram.ui.Components.cg cgVar4 = new org.telegram.ui.Components.cg(parentActivity, z12);
                        ((TextView) cgVar4.d).setText(org.telegram.messenger.bd.M0(2131754713, null));
                        Drawable mutate4 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
                        View view4 = cgVar4.c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view4, mutate4, i13, null, mode);
                        ((ImageView) view4).setImageDrawable(mutate4);
                        ((Switch) cgVar4.f).c(!tL_authorization.encrypted_requests_disabled, false);
                        int i26 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i26, false), 7, -1);
                        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i26);
                        cgVar4.setBackground(h04);
                        org.telegram.ui.ActionBar.r6.k(cgVar4, h04, null, N4, null);
                        cgVar4.setOnClickListener(new y11(b21Var, cgVar4, tL_authorization));
                        cgVar.b = true;
                        ((TextView) cgVar4.e).setText(org.telegram.messenger.bd.M0(2131754712, null));
                        linearLayout2.addView(cgVar4);
                        cgVar = cgVar4;
                    }
                    if (tL_authorization.api_id != 22) {
                        org.telegram.ui.Components.cg cgVar5 = new org.telegram.ui.Components.cg(parentActivity, true);
                        ((TextView) cgVar5.d).setText(org.telegram.messenger.bd.M0(2131754715, null));
                        Drawable mutate5 = parentActivity.getDrawable(R.drawable.msg_calls).mutate();
                        View view5 = cgVar5.c;
                        org.telegram.ui.ActionBar.r6.y((ImageView) view5, mutate5, i13, null, mode);
                        ((ImageView) view5).setImageDrawable(mutate5);
                        ((Switch) cgVar5.f).c(!tL_authorization.call_requests_disabled, false);
                        int i27 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i27, false), 7, -1);
                        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i27);
                        cgVar5.setBackground(h05);
                        org.telegram.ui.ActionBar.r6.k(cgVar5, h05, null, N5, null);
                        cgVar5.setOnClickListener(new z11(b21Var, cgVar5, tL_authorization));
                        cgVar.b = true;
                        ((TextView) cgVar5.e).setText(org.telegram.messenger.bd.M0(2131754714, null));
                        linearLayout2.addView(cgVar5);
                    }
                    if (!z10) {
                        TextView textView5 = new TextView(parentActivity);
                        textView5.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                        textView5.setGravity(17);
                        textView5.setTextSize(1, 14.0f);
                        textView5.setTypeface(org.telegram.messenger.g0.o());
                        textView5.setText(org.telegram.messenger.bd.M0(2131744215, null));
                        org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.Gi, null);
                        int L2 = org.telegram.messenger.g0.L(24.0f);
                        int i28 = org.telegram.ui.ActionBar.k6.ka;
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i28, false);
                        int i29 = org.telegram.ui.ActionBar.k6.d6;
                        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i29, false), 120);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, x02, o10, o10);
                        org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i28);
                        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i29, 120);
                        textView5.setBackground(k02);
                        org.telegram.ui.ActionBar.r6.k(textView5, k02, N6, h, null);
                        linearLayout2.addView(textView5, b8.mf.d(-1, 48.0f, 0, 16.0f, 15.0f, 16.0f, 16.0f));
                        textView5.setOnClickListener(new a21(b21Var, k21Var, tL_authorization, sessionsActivity));
                    }
                    ScrollView scrollView = new ScrollView(parentActivity);
                    scrollView.addView(linearLayout2);
                    b21Var.O = scrollView;
                    b21Var.show();
                }
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
                    }
                    i11 = R.raw.windows_30;
                }
            }
            i11 = R.raw.chrome_30;
        }
        z11 = true;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(42.0f), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        org.telegram.ui.ActionBar.n6 N7 = org.telegram.ui.ActionBar.r6.N(i12);
        fh0Var.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(fh0Var, L3, N7, null, null);
        if (z11) {
        }
        cgVar = new org.telegram.ui.Components.cg(parentActivity, false);
        StringBuilder sb32 = new StringBuilder();
        sb32.append(tL_authorization.app_name);
        sb32.append(" ");
        sb32.append(tL_authorization.app_version);
        ((TextView) cgVar.d).setText(sb32);
        Drawable mutate6 = parentActivity.getDrawable(R.drawable.menu_devices).mutate();
        View view6 = cgVar.c;
        i13 = org.telegram.ui.ActionBar.k6.m6;
        mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.y((ImageView) view6, mutate6, i13, null, mode);
        ((ImageView) view6).setImageDrawable(mutate6);
        ((TextView) cgVar.e).setText(org.telegram.messenger.bd.M0(2131754222, null));
        linearLayout2.addView(cgVar);
        if (tL_authorization.country.length() != 0) {
        }
        if (tL_authorization.ip.length() == 0) {
        }
        i14 = tL_authorization.api_id;
        if (i14 != 2040) {
            org.telegram.ui.Components.cg cgVar42 = new org.telegram.ui.Components.cg(parentActivity, z12);
            ((TextView) cgVar42.d).setText(org.telegram.messenger.bd.M0(2131754713, null));
            Drawable mutate42 = parentActivity.getDrawable(R.drawable.msg_secret).mutate();
            View view42 = cgVar42.c;
            org.telegram.ui.ActionBar.r6.y((ImageView) view42, mutate42, i13, null, mode);
            ((ImageView) view42).setImageDrawable(mutate42);
            ((Switch) cgVar42.f).c(!tL_authorization.encrypted_requests_disabled, false);
            int i262 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h042 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i262, false), 7, -1);
            org.telegram.ui.ActionBar.n6 N42 = org.telegram.ui.ActionBar.r6.N(i262);
            cgVar42.setBackground(h042);
            org.telegram.ui.ActionBar.r6.k(cgVar42, h042, null, N42, null);
            cgVar42.setOnClickListener(new y11(b21Var, cgVar42, tL_authorization));
            cgVar.b = true;
            ((TextView) cgVar42.e).setText(org.telegram.messenger.bd.M0(2131754712, null));
            linearLayout2.addView(cgVar42);
            cgVar = cgVar42;
        }
        if (tL_authorization.api_id != 22) {
        }
        if (!z10) {
        }
        ScrollView scrollView2 = new ScrollView(parentActivity);
        scrollView2.addView(linearLayout2);
        b21Var.O = scrollView2;
        b21Var.show();
    }

    public static /* synthetic */ void a0(SessionsActivity sessionsActivity, Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = sessionsActivity.f) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).o1(((TL_account.TL_connectedBot) sessionsActivity.f.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(updateconnectedbot, new e21(sessionsActivity, 0));
        }
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new e21(sessionsActivity, 1));
    }

    public static /* synthetic */ void b0(SessionsActivity sessionsActivity) {
        if (sessionsActivity.w == 0) {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new e21(sessionsActivity, 2));
        } else {
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new e21(sessionsActivity, 3));
        }
    }

    public static void c0(SessionsActivity sessionsActivity, int i3, boolean[] zArr) {
        ArrayList arrayList = sessionsActivity.d;
        if (sessionsActivity.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, sessionsActivity.getParentActivity(), null);
        s1Var.j0 = false;
        s1Var.show();
        if (sessionsActivity.w == 0) {
            int i10 = sessionsActivity.K;
            TLRPC.TL_authorization tL_authorization = (i3 < i10 || i3 >= sessionsActivity.L) ? (TLRPC.TL_authorization) sessionsActivity.e.get(i3 - sessionsActivity.G) : (TLRPC.TL_authorization) arrayList.get(i3 - i10);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetauthorization, new co0(sessionsActivity, s1Var, tL_authorization, 8));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i3 - sessionsActivity.K);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(sessionsActivity.currentAccount).sendRequest(resetwebauthorization, new co0(sessionsActivity, s1Var, tL_webAuthorization, 9));
        if (zArr[0]) {
            org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).w(tL_webAuthorization.bot_id);
        }
    }

    public static /* synthetic */ void d0(SessionsActivity sessionsActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        ArrayList arrayList = sessionsActivity.d;
        sessionsActivity.n = false;
        if (tL_error == null) {
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            org.telegram.messenger.hp.s1(sessionsActivity.currentAccount).Y3(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            sessionsActivity.r0();
        }
        o21 o21Var = sessionsActivity.a;
        if (o21Var != null) {
            o21Var.f();
        }
        dt0 dt0Var = sessionsActivity.Y;
        if (dt0Var != null) {
            dt0Var.a();
        }
        int i3 = sessionsActivity.V;
        if (i3 > 0) {
            int i10 = i3 - 1;
            sessionsActivity.V = i10;
            if (i10 > 0) {
                org.telegram.messenger.g0.i3(new f21(sessionsActivity, z10, 0), 2500L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        new org.telegram.ui.Components.iz(context, null).setIsSingleCell(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.w;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751456, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131742921, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 11));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new o21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.c = gyVar;
        gyVar.b();
        xs xsVar = new xs(7, context, this);
        this.b = xsVar;
        xsVar.r1();
        this.b.setLayoutManager(new kg.y(i3, false, 18));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setEmptyView(this.c);
        xs xsVar2 = this.b;
        xsVar2.X1 = true;
        xsVar2.Y1 = 0;
        frameLayout.addView(xsVar2, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.c, b8.mf.e(-1, -1, 17));
        this.b.setAdapter(this.a);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        this.b.setItemAnimator(kVar);
        this.b.setOnItemClickListener(new nx0(this, 5));
        if (i10 == 0) {
            j21 j21Var = new j21(this, context);
            this.r = j21Var;
            frameLayout.addView(j21Var, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        r0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.u0) {
            p0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.r6.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        int i3 = org.telegram.ui.ActionBar.k6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262148, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262148, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"onlineTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.r, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyHidden() {
        j21 j21Var = this.r;
        if (j21Var != null) {
            j21Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        p0(false);
        if (this.w == 0) {
            lg.f.a(this.currentAccount).c(new h21(this, 0));
        }
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.u0);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.u0);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        j21 j21Var = this.r;
        if (j21Var != null) {
            j21Var.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        j21 j21Var = this.r;
        if (j21Var != null) {
            j21Var.d(0, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i3 == 34) {
            int i10 = 0;
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.j0(getParentActivity(), 2, new n21(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131746511, null));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new i21(this, i10));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
            int i11 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
            alertDialog$Builder.n(i11, null);
            alertDialog$Builder.p();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        o21 o21Var = this.a;
        if (o21Var != null) {
            o21Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.X = true;
        for (int i3 = 0; i3 < this.b.getChildCount(); i3++) {
            View childAt = this.b.getChildAt(i3);
            if (childAt instanceof p21) {
                ((p21) childAt).b.invalidate();
            }
        }
    }

    public final void p0(final boolean z10) {
        if (this.n) {
            return;
        }
        if (!z10) {
            this.n = true;
        }
        if (this.w == 0) {
            final int i3 = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.c21
                public final /* synthetic */ SessionsActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i3) {
                        case 0:
                            final int i10 = 0;
                            final SessionsActivity sessionsActivity = this.b;
                            final boolean z11 = z10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.d21
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
                                                dt0 dt0Var = sessionsActivity2.Y;
                                                if (dt0Var != null) {
                                                    dt0Var.a();
                                                }
                                            }
                                            o21 o21Var = sessionsActivity2.a;
                                            if (o21Var != null) {
                                                o21Var.f();
                                            }
                                            dt0 dt0Var2 = sessionsActivity2.Y;
                                            if (dt0Var2 != null) {
                                                dt0Var2.a();
                                            }
                                            int i12 = sessionsActivity2.V;
                                            if (i12 > 0) {
                                                int i13 = i12 - 1;
                                                sessionsActivity2.V = i13;
                                                if (i13 > 0) {
                                                    org.telegram.messenger.g0.i3(new f21(sessionsActivity2, z11, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z11);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i11 = 1;
                            final SessionsActivity sessionsActivity2 = this.b;
                            final boolean z12 = z10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.d21
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
                                                dt0 dt0Var = sessionsActivity22.Y;
                                                if (dt0Var != null) {
                                                    dt0Var.a();
                                                }
                                            }
                                            o21 o21Var = sessionsActivity22.a;
                                            if (o21Var != null) {
                                                o21Var.f();
                                            }
                                            dt0 dt0Var2 = sessionsActivity22.Y;
                                            if (dt0Var2 != null) {
                                                dt0Var2.a();
                                            }
                                            int i12 = sessionsActivity22.V;
                                            if (i12 > 0) {
                                                int i13 = i12 - 1;
                                                sessionsActivity22.V = i13;
                                                if (i13 > 0) {
                                                    org.telegram.messenger.g0.i3(new f21(sessionsActivity22, z12, 1), 2500L);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z12);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) { // from class: org.telegram.ui.c21
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
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.d21
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
                                            dt0 dt0Var = sessionsActivity22.Y;
                                            if (dt0Var != null) {
                                                dt0Var.a();
                                            }
                                        }
                                        o21 o21Var = sessionsActivity22.a;
                                        if (o21Var != null) {
                                            o21Var.f();
                                        }
                                        dt0 dt0Var2 = sessionsActivity22.Y;
                                        if (dt0Var2 != null) {
                                            dt0Var2.a();
                                        }
                                        int i12 = sessionsActivity22.V;
                                        if (i12 > 0) {
                                            int i13 = i12 - 1;
                                            sessionsActivity22.V = i13;
                                            if (i13 > 0) {
                                                org.telegram.messenger.g0.i3(new f21(sessionsActivity22, z11, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.d0(sessionsActivity, tL_error, tLObject, z11);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i11 = 1;
                        final SessionsActivity sessionsActivity2 = this.b;
                        final boolean z12 = z10;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.d21
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
                                            dt0 dt0Var = sessionsActivity22.Y;
                                            if (dt0Var != null) {
                                                dt0Var.a();
                                            }
                                        }
                                        o21 o21Var = sessionsActivity22.a;
                                        if (o21Var != null) {
                                            o21Var.f();
                                        }
                                        dt0 dt0Var2 = sessionsActivity22.Y;
                                        if (dt0Var2 != null) {
                                            dt0Var2.a();
                                        }
                                        int i12 = sessionsActivity22.V;
                                        if (i12 > 0) {
                                            int i13 = i12 - 1;
                                            sessionsActivity22.V = i13;
                                            if (i13 > 0) {
                                                org.telegram.messenger.g0.i3(new f21(sessionsActivity22, z12, 1), 2500L);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        SessionsActivity.d0(sessionsActivity2, tL_error, tLObject, z12);
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
        this.W = true;
    }

    public final void r0() {
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
        int i3 = this.w;
        if (i3 == 0 && getMessagesController().Q3) {
            int i10 = this.S;
            this.Q = i10;
            this.S = i10 + 2;
            this.R = i10 + 1;
        }
        if (this.n) {
            if (i3 == 0) {
                int i11 = this.S;
                this.x = i11;
                this.S = i11 + 2;
                this.y = i11 + 1;
                return;
            }
            return;
        }
        if (this.h != null) {
            int i12 = this.S;
            this.x = i12;
            this.S = i12 + 2;
            this.y = i12 + 1;
        }
        ArrayList arrayList = this.e;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (isEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.E = -1;
            if (i3 == 1 || this.h != null) {
                int i13 = this.S;
                this.S = i13 + 1;
                this.P = i13;
            } else {
                this.P = -1;
            }
        } else {
            int i14 = this.S;
            this.terminateAllSessionsRow = i14;
            this.S = i14 + 2;
            this.E = i14 + 1;
            this.P = -1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.S;
            int i16 = i15 + 1;
            this.S = i16;
            this.F = i15;
            this.G = i16;
            int size = arrayList.size() + i16;
            this.H = size;
            this.S = size + 1;
            this.I = size;
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i17 = this.S;
                int i18 = i17 + 1;
                this.S = i18;
                this.J = i17;
                this.M = i18;
                int size2 = this.f.size() + i18;
                this.N = size2;
                this.S = size2 + 1;
                this.O = size2;
            }
        } else {
            int i19 = this.S;
            this.S = i19 + 1;
            this.J = i19;
            ArrayList arrayList4 = this.f;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i20 = this.S;
                this.M = i20;
                int size3 = this.f.size() + i20;
                this.S = size3;
                this.N = size3;
            }
            int i21 = this.S;
            this.K = i21;
            this.L = arrayList2.size() + i21;
            int size4 = arrayList2.size() + this.S;
            this.S = size4 + 1;
            this.O = size4;
        }
        if (this.s > 0) {
            int i22 = this.S;
            this.T = i22;
            this.ttlRow = i22 + 1;
            this.S = i22 + 3;
            this.U = i22 + 2;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
