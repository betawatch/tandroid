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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e implements t9, os0, org.telegram.ui.web.y0, org.telegram.ui.Components.mn0, org.telegram.ui.Components.q4, org.telegram.ui.Components.xl0, org.telegram.ui.Components.hk0, org.telegram.ui.Cells.l1, e91, org.telegram.ui.Components.hu0, gm, ge.a, org.telegram.ui.Components.jk0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.ep0, s4.c0, org.telegram.ui.Components.a8, org.telegram.ui.Components.o10, r0.m, ty0, ko0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        return false;
    }

    @Override // org.telegram.ui.ko0
    public void B(Editable editable) {
        yn0 yn0Var = (yn0) this.b;
        org.telegram.ui.Components.wt wtVar = yn0Var.M;
        yn0Var.a = editable;
        wtVar.setText(editable);
    }

    @Override // org.telegram.ui.Components.ep0
    public void B0() {
        if (org.telegram.messenger.i0.H3()) {
            ((b50) this.b).m1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
        switch (this.a) {
            case 5:
                ((g5) this.b).i1.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public void D() {
        int i10 = this.a;
    }

    @Override // s4.c0
    public void E(int i10, int i11) {
        ((s4.g0) this.b).j(i10, i11);
    }

    @Override // org.telegram.ui.Components.xl0
    public void E0(float f7) {
        switch (this.a) {
            case 6:
            case 9:
                break;
            default:
                dv dvVar = (dv) this.b;
                if (f7 != 1.0f || dvVar.f[1].getVisibility() == 0) {
                    if (dvVar.r) {
                        dvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        dvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * dvVar.f[0].getMeasuredWidth()));
                    } else {
                        dvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        dvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - dvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        cv[] cvVarArr = dvVar.f;
                        cv cvVar = cvVarArr[0];
                        cvVarArr[0] = cvVarArr[1];
                        cvVarArr[1] = cvVar;
                        cvVar.setVisibility(8);
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

    @Override // org.telegram.ui.Components.hu0
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

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean G1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.os0
    public void H0(org.telegram.messenger.jj jjVar) {
        l3 l3Var = ((h4) this.b).u0[0];
        if (l3Var != null) {
            l3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
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
        rv rvVar = fVar.y;
        LaunchActivity launchActivity = (LaunchActivity) rvVar.b;
        f fVar2 = (f) rvVar.c;
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

    @Override // org.telegram.ui.e91
    public void M1(boolean z10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        zc zcVar = (zc) this.b;
        p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
        if (p6Var instanceof yc) {
            p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            zc zcVar2 = ((yc) p6Var2).a;
            zcVar2.J = !zcVar2.J;
            zcVar2.j1();
            zcVar2.f1(false);
        }
        zcVar.a1(a(), false);
        zcVar.f1(false);
    }

    @Override // ge.a
    public void N(float f7, float f10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        switch (this.a) {
            case 14:
                z4Var = ((org.telegram.ui.ActionBar.k2) ((tx) this.b).n0).parentLayout;
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
        switch (this.a) {
            case 24:
                kh0 kh0Var = (kh0) this.b;
                i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
                kh0Var.d = I0;
                kh0Var.F.setPadding(I0.a, I0.b, I0.c, I0.d);
                kh0Var.E.requestLayout();
                break;
            default:
                kt0 kt0Var = (kt0) this.b;
                i0.c g10 = j1Var.a.g(519);
                kt0Var.r = g10;
                kt0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                kt0Var.c.requestLayout();
                break;
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(org.telegram.messenger.jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override // ge.a
    public boolean V0(float f7, float f10) {
        switch (this.a) {
            case 14:
                return ((tx) this.b).n0.isInPreviewMode();
            default:
                rf0 rf0Var = (rf0) this.b;
                View view = null;
                rf0Var.O = null;
                int childCount = rf0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = rf0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view == null || rf0Var.P.contains(view)) ? false : true;
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
        c60 c60Var = (c60) this.b;
        c60Var.W = i10;
        org.telegram.messenger.i0.a4(c60Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.e91
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

    @Override // org.telegram.ui.Components.hu0
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(((le) this.b).U0), 0);
    }

    public void a2(we0 we0Var) {
        boolean z10;
        gf0 gf0Var = (gf0) this.b;
        gf0Var.N = true;
        hf0 hf0Var = gf0Var.a0;
        hf0Var.J = 0;
        hf0Var.v1(0, false);
        int i10 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.i0.N1()) {
            boolean z11 = hf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = hf0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i10 < 28 || hf0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i10 < 26 || hf0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ef0 ef0Var = gf0Var.a;
            if (ef0Var != null && "888".equals(ef0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (hf0Var.w) {
                hf0Var.r.clear();
                if (!z11) {
                    hf0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    hf0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    hf0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i10 >= 26) {
                    hf0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!hf0Var.r.isEmpty()) {
                    SharedPreferences d12 = org.telegram.messenger.vp.d1();
                    if (!d12.getBoolean("firstlogin", true) && !hf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !hf0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            hf0Var.getParentActivity().requestPermissions((String[]) hf0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                    d12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, "Continue"), null);
                    int i11 = R.raw.calls_log;
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    if (!z11 && (!z12 || !z13)) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754275, "AllowReadCall");
                        i11 = R.raw.incoming_calls;
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131754273, "AllowReadCallLog");
                    }
                    int i12 = org.telegram.ui.ActionBar.t6.L5;
                    alertDialog$Builder.m(i11, 46, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
                    alertDialog$Builder.n(i12, null);
                    hf0Var.h = hf0Var.showDialog(x1Var);
                    gf0Var.N = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ff0 ff0Var = new ff0(0, this, we0Var);
        we0Var.h.f(z10, z10);
        org.telegram.messenger.i0.h3(ff0Var, 400L);
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean b(float f7, float f10, int i10, View view) {
        z00 z00Var = (z00) this.b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            z00.a(z00Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            z00.a(z00Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            z00.a(z00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            z00.a(z00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.v2) {
            if (!z00Var.o0.f()) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (v2Var.Z(f7)) {
                    z00Var.i0.L(v2Var);
                    return true;
                }
            }
            z00.a(z00Var, ((org.telegram.ui.Cells.v2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.ty0
    public void b0() {
        ((ni0) this.b).a();
    }

    @Override // org.telegram.ui.e91
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

    @Override // org.telegram.ui.Components.xl0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                t5 t5Var = ((m5) this.b).d;
                t5Var.d0 = i10;
                t5Var.I0(true);
                break;
            case 9:
                zb zbVar = ((xb) this.b).f;
                zbVar.D = i10;
                zbVar.d(true);
                break;
            default:
                dv dvVar = (dv) this.b;
                if (dvVar.f[0].f != i10) {
                    dvVar.x = i10 == dvVar.e.getFirstTabId();
                    cv cvVar = dvVar.f[1];
                    cvVar.f = i10;
                    cvVar.setVisibility(0);
                    dvVar.q0(true);
                    dvVar.r = z10;
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
                rf0 rf0Var = (rf0) this.b;
                rf0.k(rf0Var, view, f7, f10);
                org.telegram.messenger.i0.r(rf0Var.H);
                rf0Var.setSkipDrawSelector(true);
                rf0.m(rf0Var, f7, true, false);
                rf0Var.invalidate();
                rf0Var.Q.a(true, true);
                return true;
        }
    }

    public void d2(Exception exc) {
        sm0 sm0Var = (sm0) this.b;
        if (sm0Var.Q0) {
            return;
        }
        sm0Var.M0(true, false);
        sm0Var.I0(false);
        if ((exc instanceof nc.a) || (exc instanceof nc.b)) {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.cd.L0(2131747420, null), sm0Var);
        } else {
            org.telegram.ui.Components.s4.v0(exc.getMessage(), sm0Var);
        }
    }

    @Override // org.telegram.ui.Components.a8
    public void dismiss() {
        ((c60) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.ko0
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

    @Override // org.telegram.ui.Components.jk0
    public void g() {
        ((z00) this.b).i0.finish();
    }

    @Override // org.telegram.ui.Components.hu0
    public int g1() {
        le leVar = (le) this.b;
        return leVar.V0 + leVar.W0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override // org.telegram.ui.Components.mn0
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

    @Override // org.telegram.ui.Components.hk0
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

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                int round = Math.round(((d4Var.c - r2) * f7) + d4Var.b);
                if (round != org.telegram.messenger.tz.Z0) {
                    org.telegram.messenger.tz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.tz.Z0);
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
                za0 za0Var = (za0) this.b;
                bb0 bb0Var = za0Var.D;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != org.telegram.messenger.sc.c()) {
                    org.telegram.messenger.sc.g = w7.u.b(round2, 0, 100);
                    org.telegram.messenger.sc.k();
                    org.telegram.messenger.sc.d(false);
                    bb0Var.c0();
                    ArrayList arrayList2 = bb0Var.s;
                    if (arrayList2.isEmpty()) {
                        bb0Var.b0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new wa0(2, 0, org.telegram.messenger.sc.c() <= 0 ? org.telegram.messenger.cd.L0(2131748881, null) : org.telegram.messenger.sc.c() >= 100 ? org.telegram.messenger.cd.L0(2131748880, null) : org.telegram.messenger.cd.a0(null, null, 2131748882, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c()))), 0, 0));
                        bb0Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            za0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                g5.k1 = f7;
                org.telegram.ui.Components.uu0 uu0Var = ((g5) this.b).i1;
                uu0Var.L();
                uu0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.os0
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
                rf0 rf0Var = (rf0) this.b;
                rf0.k(rf0Var, view, f7, f10);
                rf0.m(rf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(rf0Var.H, 450L);
                View view2 = rf0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                rf0Var.O = null;
                rf0Var.invalidate();
                rf0Var.Q.a(false, true);
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
                rf0 rf0Var = (rf0) this.b;
                rf0.k(rf0Var, view, f7, f10);
                rf0.m(rf0Var, f7, false, false);
                rf0Var.invalidate();
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
                unVar.Gb(view);
                unVar.o8(false, view != unVar.x1, 0.3f);
                unVar.u9(false);
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

    @Override // org.telegram.ui.Components.jk0
    public void p(float f7) {
        ((z00) this.b).i0.a(f7);
    }

    @Override // org.telegram.ui.Components.mn0
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
                rf0 rf0Var = (rf0) this.b;
                rf0.k(rf0Var, view, f7, f10);
                rf0.m(rf0Var, f7, false, true);
                org.telegram.messenger.i0.h3(rf0Var.H, 450L);
                rf0Var.O = null;
                rf0Var.invalidate();
                rf0Var.Q.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.ko0
    public void u0(int i10, boolean z10, boolean z11) {
        yn0 yn0Var = (yn0) this.b;
        yn0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        yn0Var.Z(yn0Var.b, yn0Var.c, z11, i10);
    }

    @Override // org.telegram.ui.gm
    public void v0(String str) {
        ((un) ((mg.s) this.b).c).ta(str, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(org.telegram.messenger.jj jjVar) {
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

    @Override // org.telegram.ui.ko0
    public void y() {
        yn0 yn0Var = (yn0) this.b;
        if (yn0Var.b.size() != 0) {
            yn0Var.Q.invalidate();
            yn0Var.a0(true);
        } else {
            yn0Var.Q.setPivotX(0.0f);
            yn0Var.Q.setPivotY(0.0f);
            yn0Var.a0(false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        org.telegram.messenger.jj messageObject;
        sb sbVar = (sb) this.b;
        if ((view instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) view).getMessageObject()) != null) {
            long j10 = messageObject.H0;
            if (j10 != -1) {
                if (sbVar.p0.contains(Long.valueOf(j10))) {
                    sbVar.p0.remove(Long.valueOf(messageObject.H0));
                } else {
                    sbVar.p0.add(Long.valueOf(messageObject.H0));
                }
                sbVar.a1(true);
                sbVar.V0();
                sbVar.E.f();
                return;
            }
        }
        sbVar.T0(view, f7, f10);
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

    @Override // org.telegram.ui.os0
    public /* synthetic */ void I(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(org.telegram.messenger.gj gjVar) {
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
    public /* synthetic */ void O(org.telegram.messenger.jj jjVar) {
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
    public /* synthetic */ void X0(org.telegram.messenger.is isVar) {
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
    public /* synthetic */ void v1(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.ty0
    public void w(ui0 ui0Var) {
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

    @Override // org.telegram.ui.Components.ep0
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.ko0
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
    public /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
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

    @Override // org.telegram.ui.Components.hk0
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
    public /* synthetic */ void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
