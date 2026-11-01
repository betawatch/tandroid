package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e implements t9, ns0, org.telegram.ui.web.y0, org.telegram.ui.Components.nn0, org.telegram.ui.Components.q4, org.telegram.ui.Components.yl0, org.telegram.ui.Components.ik0, org.telegram.ui.Cells.l1, c91, org.telegram.ui.Components.iu0, gm, ge.a, org.telegram.ui.Components.kk0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.fp0, s4.c0, org.telegram.ui.Components.a8, org.telegram.ui.Components.o10, r0.m, sy0, io0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.kj kjVar) {
        return false;
    }

    @Override // org.telegram.ui.io0
    public void B(Editable editable) {
        wn0 wn0Var = (wn0) this.b;
        org.telegram.ui.Components.wt wtVar = wn0Var.M;
        wn0Var.a = editable;
        wtVar.setText(editable);
    }

    @Override // org.telegram.ui.Components.fp0
    public void B0() {
        if (org.telegram.messenger.i0.H3()) {
            ((a50) this.b).m1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public void C() {
        switch (this.a) {
            case 5:
                ((g5) this.b).i1.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public void D() {
        int i10 = this.a;
    }

    @Override // s4.c0
    public void E(int i10, int i11) {
        ((s4.g0) this.b).j(i10, i11);
    }

    @Override // org.telegram.ui.Components.yl0
    public void E0(float f7) {
        switch (this.a) {
            case 6:
            case 9:
                break;
            default:
                cv cvVar = (cv) this.b;
                if (f7 != 1.0f || cvVar.f[1].getVisibility() == 0) {
                    if (cvVar.r) {
                        cvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        cvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * cvVar.f[0].getMeasuredWidth()));
                    } else {
                        cvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        cvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - cvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        bv[] bvVarArr = cvVar.f;
                        bv bvVar = bvVarArr[0];
                        bvVarArr[0] = bvVarArr[1];
                        bvVarArr[1] = bvVar;
                        bvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.iu0
    public void F(boolean z10) {
        Runnable runnable = ((le) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ge.a
    public /* synthetic */ void G0() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.yl0
    public /* synthetic */ boolean G1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ns0
    public void H0(org.telegram.messenger.kj kjVar) {
        l3 l3Var = ((h4) this.b).u0[0];
        if (l3Var != null) {
            l3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ps0 H1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // ge.a
    public boolean I1() {
        switch (this.a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        org.telegram.messenger.i0.h3(new ag.d3(this, i10, 13), 50L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public void L(String str) {
        f fVar = (f) this.b;
        fVar.finishFragment(false);
        qv qvVar = fVar.y;
        LaunchActivity launchActivity = (LaunchActivity) qvVar.b;
        f fVar2 = (f) qvVar.c;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, launchActivity, null);
        x1Var.i0 = false;
        x1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new org.telegram.ui.Components.t20(17, x1Var, fVar2));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.c91
    public void M1(boolean z10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zc zcVar = (zc) this.b;
        p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        if (p6Var instanceof yc) {
            p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            zc zcVar2 = ((yc) p6Var2).a;
            zcVar2.J = !zcVar2.J;
            zcVar2.k1();
            zcVar2.g1(false);
        }
        zcVar.b1(a(), false);
        zcVar.g1(false);
    }

    @Override // ge.a
    public void N(float f7, float f10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        switch (this.a) {
            case 14:
                z4Var = ((org.telegram.ui.ActionBar.k2) ((sx) this.b).n0).parentLayout;
                ((ActionBarLayout) z4Var).r();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String P0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // s4.c0
    public void Q0(int i10, int i11) {
        ((s4.g0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        ih0 ih0Var = (ih0) this.b;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        ih0Var.d = I0;
        ih0Var.F.setPadding(I0.a, I0.b, I0.c, I0.d);
        ih0Var.E.requestLayout();
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(org.telegram.messenger.kj kjVar) {
        return org.telegram.ui.Cells.f1.a(kjVar);
    }

    @Override // ge.a
    public boolean V0(float f7, float f10) {
        switch (this.a) {
            case 14:
                return ((sx) this.b).n0.isInPreviewMode();
            default:
                qf0 qf0Var = (qf0) this.b;
                View view = null;
                qf0Var.O = null;
                int childCount = qf0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = qf0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view == null || qf0Var.P.contains(view)) ? false : true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Components.a8
    public void Y0(int i10, int i11) {
        b60 b60Var = (b60) this.b;
        b60Var.W = i10;
        org.telegram.messenger.i0.a4(b60Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.c91
    public boolean a() {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zc zcVar = (zc) this.b;
        p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        if (p6Var == null) {
            return org.telegram.ui.ActionBar.t6.I.q();
        }
        p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        return p6Var2.a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.iu0
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(((le) this.b).U0), 0);
    }

    public void a2(ve0 ve0Var) {
        boolean z10;
        ff0 ff0Var = (ff0) this.b;
        ff0Var.N = true;
        gf0 gf0Var = ff0Var.a0;
        gf0Var.J = 0;
        gf0Var.w1(0, false);
        int i10 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.i0.N1()) {
            boolean z11 = gf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = gf0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i10 < 28 || gf0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i10 < 26 || gf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            df0 df0Var = ff0Var.a;
            if (df0Var != null && "888".equals(df0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (gf0Var.w) {
                gf0Var.r.clear();
                if (!z11) {
                    gf0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    gf0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    gf0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i10 >= 26) {
                    gf0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!gf0Var.r.isEmpty()) {
                    SharedPreferences d12 = org.telegram.messenger.wp.d1();
                    if (!d12.getBoolean("firstlogin", true) && !gf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !gf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            gf0Var.getParentActivity().requestPermissions((String[]) gf0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    d12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, "Continue"), null);
                    int i11 = R.raw.calls_log;
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    if (!z11 && (!z12 || !z13)) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        x1Var.T = org.telegram.messenger.dd.L0(2131754275, "AllowReadCall");
                        i11 = R.raw.incoming_calls;
                    } else {
                        x1Var.T = org.telegram.messenger.dd.L0(2131754273, "AllowReadCallLog");
                    }
                    int i12 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(i11, 46, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
                    alertDialog$Builder.n(i12, null);
                    gf0Var.h = gf0Var.showDialog(x1Var);
                    ff0Var.N = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ef0 ef0Var = new ef0(0, this, ve0Var);
        ve0Var.h.f(z10, z10);
        org.telegram.messenger.i0.h3(ef0Var, 400L);
    }

    @Override // org.telegram.ui.Components.kk0
    public boolean b(float f7, float f10, int i10, View view) {
        y00 y00Var = (y00) this.b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            y00.a(y00Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            y00.a(y00Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            y00.a(y00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            y00.a(y00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.v2) {
            if (!y00Var.o0.f()) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (v2Var.Z(f7)) {
                    y00Var.i0.L(v2Var);
                    return true;
                }
            }
            y00.a(y00Var, ((org.telegram.ui.Cells.v2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.sy0
    public void b0() {
        ((li0) this.b).a();
    }

    @Override // org.telegram.ui.c91
    public boolean b1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                t5 t5Var = ((m5) this.b).d;
                t5Var.d0 = i10;
                t5Var.J0(true);
                break;
            case 9:
                zb zbVar = ((xb) this.b).f;
                zbVar.D = i10;
                zbVar.d(true);
                break;
            default:
                cv cvVar = (cv) this.b;
                if (cvVar.f[0].f != i10) {
                    cvVar.x = i10 == cvVar.e.getFirstTabId();
                    bv bvVar = cvVar.f[1];
                    bvVar.f = i10;
                    bvVar.setVisibility(0);
                    cvVar.r0(true);
                    cvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // ge.a
    public boolean d1(View view, float f7, float f10) {
        switch (this.a) {
            case 14:
                return false;
            default:
                qf0 qf0Var = (qf0) this.b;
                qf0.k(qf0Var, view, f7, f10);
                org.telegram.messenger.i0.r(qf0Var.H);
                qf0Var.setSkipDrawSelector(true);
                qf0.m(qf0Var, f7, true, false);
                qf0Var.invalidate();
                qf0Var.Q.a(true, true);
                return true;
        }
    }

    public void d2(Exception exc) {
        qm0 qm0Var = (qm0) this.b;
        if (qm0Var.Q0) {
            return;
        }
        qm0Var.N0(true, false);
        qm0Var.J0(false);
        if ((exc instanceof nc.a) || (exc instanceof nc.b)) {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.dd.L0(2131747420, null), qm0Var);
        } else {
            org.telegram.ui.Components.s4.v0(exc.getMessage(), qm0Var);
        }
    }

    @Override // org.telegram.ui.Components.a8
    public void dismiss() {
        ((b60) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.io0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.o10
    public void e1() {
        oj ojVar = (oj) this.b;
        View view = ojVar.a;
        if (view != null) {
            view.setPressed(false);
            ojVar.a.setSelected(false);
        }
        View view2 = ojVar.n;
        if (view2 == null || ojVar.d) {
            return;
        }
        view2.callOnClick();
        ojVar.d = true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.kk0
    public void g() {
        ((y00) this.b).i0.finish();
    }

    @Override // org.telegram.ui.Components.iu0
    public int g1() {
        le leVar = (le) this.b;
        return leVar.V0 + leVar.W0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override // org.telegram.ui.Components.nn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                return String.valueOf(Math.round((d4Var.a.getProgress() * (d4Var.c - r1)) + d4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // ge.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 14:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void j() {
        org.telegram.messenger.w0.u();
        boolean z10 = org.telegram.messenger.v2.a;
        org.telegram.messenger.w0.r();
        gf.f.r(((pb) this.b).n.getParentActivity(), org.telegram.messenger.v2.g);
    }

    @Override // ge.a
    public boolean j0() {
        switch (this.a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.nn0
    public void k(boolean z10, float f7) {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                int round = Math.round(((d4Var.c - r2) * f7) + d4Var.b);
                if (round != org.telegram.messenger.uz.Z0) {
                    org.telegram.messenger.uz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.uz.Z0);
                    edit.commit();
                    d4Var.f.u0[0].getAdapter().D.clear();
                    h4 h4Var = d4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        h4Var.u0[i10].c.f();
                        f4 f4Var = h4Var.u0[i10].c;
                        ArrayList arrayList = f4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.e.a(f4Var.L);
                        Utilities.e.d(f4Var.L, 100L);
                    }
                    d4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                ya0 ya0Var = (ya0) this.b;
                ab0 ab0Var = ya0Var.D;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != org.telegram.messenger.tc.c()) {
                    org.telegram.messenger.tc.g = w7.u.b(round2, 0, 100);
                    org.telegram.messenger.tc.k();
                    org.telegram.messenger.tc.d(false);
                    ab0Var.d0();
                    ArrayList arrayList2 = ab0Var.s;
                    if (arrayList2.isEmpty()) {
                        ab0Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new va0(2, 0, org.telegram.messenger.tc.c() <= 0 ? org.telegram.messenger.dd.L0(2131748881, null) : org.telegram.messenger.tc.c() >= 100 ? org.telegram.messenger.dd.L0(2131748880, null) : org.telegram.messenger.dd.a0(null, null, 2131748882, String.format("%d%%", Integer.valueOf(org.telegram.messenger.tc.c()))), 0, 0));
                        ab0Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ya0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                g5.k1 = f7;
                org.telegram.ui.Components.vu0 vu0Var = ((g5) this.b).i1;
                vu0Var.K();
                vu0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.ns0
    public /* synthetic */ TextureView k0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override // ge.a
    public void m(View view, float f7, float f10) {
        switch (this.a) {
            case 14:
                break;
            default:
                qf0 qf0Var = (qf0) this.b;
                qf0.k(qf0Var, view, f7, f10);
                qf0.m(qf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(qf0Var.H, 450L);
                View view2 = qf0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                qf0Var.O = null;
                qf0Var.invalidate();
                qf0Var.Q.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(org.telegram.ui.Components.o5 o5Var) {
        return false;
    }

    @Override // s4.c0
    public void n0(int i10, int i11) {
        ((s4.g0) this.b).o(i10, i11);
    }

    @Override // ge.a
    public void o1(View view, float f7, float f10) {
        switch (this.a) {
            case 14:
                break;
            default:
                qf0 qf0Var = (qf0) this.b;
                qf0.k(qf0Var, view, f7, f10);
                qf0.m(qf0Var, f7, false, false);
                qf0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onDown(MotionEvent motionEvent) {
        oj ojVar = (oj) this.b;
        View view = ojVar.a;
        if (view != null) {
            view.setPressed(true);
            ojVar.a.setSelected(true);
            ojVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.o10
    public void onLongPress(MotionEvent motionEvent) {
        oj ojVar = (oj) this.b;
        un unVar = ojVar.x;
        if (ojVar.a != null) {
            unVar.e9 = org.telegram.ui.Components.y8.b(unVar, ojVar.w, unVar.j6, unVar.b(), unVar.xa);
            org.telegram.ui.ActionBar.k1 k1Var = unVar.e9;
            if (k1Var != null) {
                ojVar.b = k1Var;
                k1Var.setOnDismissListener(new e0(ojVar, 2));
                unVar.z0.C0();
                unVar.B0.R = false;
                View view = ojVar.w;
                unVar.Lb(view);
                unVar.s8(false, view != unVar.x1, 0.3f);
                unVar.z9(false);
                il ilVar = unVar.N3;
                if (ilVar != null) {
                    ilVar.d(1, true);
                }
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                mk mkVar = unVar.Z;
                if (mkVar == null || mkVar.getEditField() == null) {
                    return;
                }
                unVar.Z.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.o10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        oj ojVar = (oj) this.b;
        if (ojVar.e || (view = ojVar.a) == null) {
            return false;
        }
        view.callOnClick();
        ojVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Components.kk0
    public void p(float f7) {
        ((y00) this.b).i0.a(f7);
    }

    @Override // org.telegram.ui.Components.nn0
    public int p0() {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                return d4Var.c - d4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // ge.a
    public /* synthetic */ void r(float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // ge.a
    public /* synthetic */ void t0() {
        int i10 = this.a;
    }

    @Override // ge.a
    public void u(View view, float f7, float f10) {
        switch (this.a) {
            case 14:
                break;
            default:
                qf0 qf0Var = (qf0) this.b;
                qf0.k(qf0Var, view, f7, f10);
                qf0.m(qf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(qf0Var.H, 450L);
                qf0Var.O = null;
                qf0Var.invalidate();
                qf0Var.Q.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.io0
    public void u0(int i10, boolean z10, boolean z11) {
        wn0 wn0Var = (wn0) this.b;
        wn0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        wn0Var.a0(wn0Var.b, wn0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.gm
    public void v0(String str) {
        ((un) ((mg.s) this.b).c).ya(str, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(org.telegram.messenger.kj kjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // s4.c0
    public void x1(int i10, int i11) {
        ((s4.g0) this.b).n(i10, i11, null);
    }

    @Override // org.telegram.ui.io0
    public void y() {
        wn0 wn0Var = (wn0) this.b;
        if (wn0Var.b.size() != 0) {
            wn0Var.Q.invalidate();
            wn0Var.b0(true);
        } else {
            wn0Var.Q.setPivotX(0.0f);
            wn0Var.Q.setPivotY(0.0f);
            wn0Var.b0(false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        org.telegram.messenger.kj messageObject;
        sb sbVar = (sb) this.b;
        if ((view instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject()) != null) {
            long j10 = messageObject.H0;
            if (j10 != -1) {
                if (sbVar.p0.contains(Long.valueOf(j10))) {
                    sbVar.p0.remove(Long.valueOf(messageObject.H0));
                } else {
                    sbVar.p0.add(Long.valueOf(messageObject.H0));
                }
                sbVar.b1(true);
                sbVar.W0();
                sbVar.E.f();
                return;
            }
        }
        sbVar.U0(view, f7, f10);
    }

    private final void k2(float f7) {
    }

    private final void l2(float f7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.ns0
    public /* synthetic */ void I(org.telegram.messenger.kj kjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(org.telegram.messenger.hj hjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(org.telegram.messenger.kj kjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.gm
    public /* synthetic */ void T0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void X0(org.telegram.messenger.js jsVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(org.telegram.messenger.kj kjVar) {
    }

    @Override // org.telegram.ui.sy0
    public void w(si0 si0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final /* synthetic */ void Q1() {
    }

    private final /* synthetic */ void R1() {
    }

    private final /* synthetic */ void V1() {
    }

    private final /* synthetic */ void Y1() {
    }

    private final void m2() {
    }

    private final void n2() {
    }

    private final /* synthetic */ void o2() {
    }

    private final void p2() {
    }

    private final void q2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.io0
    public /* synthetic */ void h0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.a8
    public /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    private final void O1(float f7, float f10) {
    }

    private final /* synthetic */ void T1(float f7, float f10) {
    }

    private final /* synthetic */ void U1(float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.d20 d20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.gm
    public /* synthetic */ void X(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    private final /* synthetic */ void h2(View view, float f7, float f10) {
    }

    private final /* synthetic */ void i2(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j2(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(org.telegram.messenger.kj kjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
