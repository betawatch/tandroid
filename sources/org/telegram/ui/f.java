package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f implements r9, fr0, org.telegram.ui.web.w0, org.telegram.ui.Components.mm0, org.telegram.ui.Components.t4, org.telegram.ui.Components.vk0, org.telegram.ui.Components.dj0, org.telegram.ui.Cells.l1, o71, org.telegram.ui.Components.gt0, ml, ue.a, org.telegram.ui.Components.fj0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.do0, v4.d0, org.telegram.ui.Components.f8, org.telegram.ui.Components.z00, r0.m, jx0, ym0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ym0
    public void A() {
        om0 om0Var = (om0) this.b;
        if (om0Var.b.size() != 0) {
            om0Var.Q.invalidate();
            om0Var.b0(true);
        } else {
            om0Var.Q.setPivotX(0.0f);
            om0Var.Q.setPivotY(0.0f);
            om0Var.b0(false);
        }
    }

    @Override // org.telegram.ui.ym0
    public void B(Editable editable) {
        om0 om0Var = (om0) this.b;
        org.telegram.ui.Components.lt ltVar = om0Var.M;
        om0Var.a = editable;
        ltVar.setText(editable);
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.do0
    public void C0() {
        if (org.telegram.messenger.g0.I3()) {
            ((e40) this.b).n1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.mm0
    public void D() {
        switch (this.a) {
            case 5:
                ((h5) this.b).i1.M();
                break;
        }
    }

    @Override // v4.d0
    public void E(int i7, int i10) {
        ((v4.g0) this.b).j(i7, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.gt0
    public void F(boolean z9) {
        Runnable runnable = ((zd) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public void F0(float f10) {
        switch (this.a) {
            case 6:
            case 9:
                break;
            default:
                cu cuVar = (cu) this.b;
                if (f10 != 1.0f || cuVar.f[1].getVisibility() == 0) {
                    if (cuVar.r) {
                        cuVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        cuVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * cuVar.f[0].getMeasuredWidth()));
                    } else {
                        cuVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        cuVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - cuVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        bu[] buVarArr = cuVar.f;
                        bu buVar = buVarArr[0];
                        buVarArr[0] = buVarArr[1];
                        buVarArr[1] = buVar;
                        buVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // ue.a
    public /* synthetic */ void H0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.fr0
    public void I0(org.telegram.messenger.ij ijVar) {
        k3 k3Var = ((g4) this.b).u0[0];
        if (k3Var != null) {
            k3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        org.telegram.messenger.g0.i3(new bg.m0(this, i7, 18), 50L);
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        ru ruVar = gVar.y;
        LaunchActivity launchActivity = (LaunchActivity) ruVar.b;
        g gVar2 = (g) ruVar.c;
        String str2 = LaunchActivity.B1;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity, null);
        u1Var.i0 = false;
        u1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new j50(3, u1Var, gVar2));
    }

    @Override // v4.d0
    public void M0(int i7, int i10) {
        ((v4.g0) this.b).p(i7, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hr0 N1() {
        return null;
    }

    @Override // ue.a
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.a) {
            case 14:
                q4Var = ((org.telegram.ui.ActionBar.f2) ((rw) this.b).n0).parentLayout;
                ((ActionBarLayout) q4Var).r();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String R0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        dg0 dg0Var = (dg0) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        dg0Var.d = I0;
        dg0Var.F.setPadding(I0.a, I0.b, I0.c, I0.d);
        dg0Var.E.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // ue.a
    public boolean U0(float f10, float f11) {
        switch (this.a) {
            case 14:
                return ((rw) this.b).n0.isInPreviewMode();
            default:
                ne0 ne0Var = (ne0) this.b;
                View view = null;
                ne0Var.O = null;
                int childCount = ne0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ne0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view == null || ne0Var.P.contains(view)) ? false : true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(org.telegram.messenger.ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Components.f8
    public void X0(int i7, int i10) {
        f50 f50Var = (f50) this.b;
        f50Var.W = i7;
        org.telegram.messenger.g0.b4(f50Var.b);
    }

    public void X1(rd0 rd0Var) {
        boolean z9;
        de0 de0Var = (de0) this.b;
        de0Var.N = true;
        ee0 ee0Var = de0Var.g0;
        ee0Var.J = 0;
        ee0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            boolean z10 = ee0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = ee0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i7 < 28 || ee0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i7 < 26 || ee0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            be0 be0Var = de0Var.a;
            if (be0Var != null && "888".equals(be0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (ee0Var.w) {
                ee0Var.r.clear();
                if (!z10) {
                    ee0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    ee0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    ee0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i7 >= 26) {
                    ee0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ee0Var.r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !ee0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ee0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ee0Var.getParentActivity().requestPermissions((String[]) ee0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ee0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, "Continue"), null);
                    int i10 = R.raw.calls_log;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    if (!z10 && (!z11 || !z12)) {
                        u1Var.T = org.telegram.messenger.id.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z11 && z12) {
                        u1Var.T = org.telegram.messenger.id.M0(2131754275, "AllowReadCall");
                        i10 = R.raw.incoming_calls;
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131754273, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.l6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.l6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    ee0Var.h = ee0Var.showDialog(u1Var);
                    de0Var.N = true;
                    return;
                }
            }
            z9 = true;
        } else {
            z9 = true;
        }
        ce0 ce0Var = new ce0(0, this, rd0Var);
        rd0Var.h.f(z9, z9);
        org.telegram.messenger.g0.i3(ce0Var, 400L);
    }

    @Override // org.telegram.ui.Components.gt0
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(((zd) this.b).U0), 0);
    }

    public void Y1(Exception exc) {
        jl0 jl0Var = (jl0) this.b;
        if (jl0Var.Q0) {
            return;
        }
        jl0Var.N0(true, false);
        jl0Var.J0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131747404, null), jl0Var);
        } else {
            org.telegram.ui.Components.v4.t0(exc.getMessage(), jl0Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.o71
    public boolean a() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        rc rcVar = (rc) this.b;
        g6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (g6Var == null) {
            return org.telegram.ui.ActionBar.l6.I.q();
        }
        g6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        return g6Var2.a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.o71
    public boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vk0
    public void b(int i7, boolean z9) {
        switch (this.a) {
            case 6:
                t5 t5Var = ((n5) this.b).d;
                t5Var.d0 = i7;
                t5Var.J0(true);
                break;
            case 9:
                tb tbVar = ((rb) this.b).f;
                tbVar.D = i7;
                tbVar.d(true);
                break;
            default:
                cu cuVar = (cu) this.b;
                if (cuVar.f[0].f != i7) {
                    cuVar.x = i7 == cuVar.e.getFirstTabId();
                    bu buVar = cuVar.f[1];
                    buVar.f = i7;
                    buVar.setVisibility(0);
                    cuVar.r0(true);
                    cuVar.r = z9;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.vk0
    public void c() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.jx0
    public void c0() {
        ((jh0) this.b).a();
    }

    @Override // ue.a
    public boolean c1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                return false;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.k(ne0Var, view, f10, f11);
                org.telegram.messenger.g0.r(ne0Var.H);
                ne0Var.setSkipDrawSelector(true);
                ne0.m(ne0Var, f10, true, false);
                ne0Var.invalidate();
                ne0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.z00
    public void d1() {
        vi viVar = (vi) this.b;
        View view = viVar.a;
        if (view != null) {
            view.setPressed(false);
            viVar.a.setSelected(false);
        }
        View view2 = viVar.n;
        if (view2 == null || viVar.d) {
            return;
        }
        view2.callOnClick();
        viVar.d = true;
    }

    @Override // org.telegram.ui.Components.f8
    public void dismiss() {
        ((f50) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.ym0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.gt0
    public int e1() {
        zd zdVar = (zd) this.b;
        return zdVar.V0 + zdVar.W0;
    }

    @Override // org.telegram.ui.Components.fj0
    public boolean f(float f10, float f11, int i7, View view) {
        a00 a00Var = (a00) this.b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            a00.a(a00Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            a00.a(a00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            a00.a(a00Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            a00.a(a00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            if (!a00Var.o0.i()) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (t2Var.Z(f10)) {
                    a00Var.i0.O(t2Var);
                    return true;
                }
            }
            a00.a(a00Var, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.mm0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                c4 c4Var = (c4) this.b;
                return String.valueOf(Math.round((c4Var.a.getProgress() * (c4Var.c - r1)) + c4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // ue.a
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.fj0
    public void i() {
        ((a00) this.b).i0.finish();
    }

    @Override // ue.a
    public boolean j0() {
        switch (this.a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void k() {
        org.telegram.messenger.t0.u();
        boolean z9 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(((jb) this.b).n.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k0() {
        return false;
    }

    @Override // v4.d0
    public void k1(int i7, int i10) {
        ((v4.g0) this.b).n(i7, i10, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.j9 k2() {
        return null;
    }

    @Override // org.telegram.ui.Components.mm0
    public void l(boolean z9, float f10) {
        switch (this.a) {
            case 3:
                c4 c4Var = (c4) this.b;
                int round = Math.round(((c4Var.c - r2) * f10) + c4Var.b);
                if (round != org.telegram.messenger.iz.Z0) {
                    org.telegram.messenger.iz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.iz.Z0);
                    edit.commit();
                    c4Var.f.u0[0].getAdapter().D.clear();
                    g4 g4Var = c4Var.f;
                    for (int i7 = 0; i7 < 2; i7++) {
                        g4Var.u0[i7].c.f();
                        e4 e4Var = g4Var.u0[i7].c;
                        ArrayList arrayList = e4Var.d;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.e.a(e4Var.L);
                        Utilities.e.d(e4Var.L, 100L);
                    }
                    c4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                w90 w90Var = (w90) this.b;
                y90 y90Var = w90Var.D;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.sc.c()) {
                    org.telegram.messenger.sc.g = c8.j9.b(round2, 0, 100);
                    org.telegram.messenger.sc.k();
                    org.telegram.messenger.sc.d(false);
                    y90Var.d0();
                    ArrayList arrayList2 = y90Var.s;
                    if (arrayList2.isEmpty()) {
                        y90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new t90(2, 0, org.telegram.messenger.sc.c() <= 0 ? org.telegram.messenger.id.M0(2131748871, null) : org.telegram.messenger.sc.c() >= 100 ? org.telegram.messenger.id.M0(2131748870, null) : org.telegram.messenger.id.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c()))), 0, 0));
                        y90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            w90Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                h5.k1 = f10;
                org.telegram.ui.Components.tt0 tt0Var = ((h5) this.b).i1;
                tt0Var.L();
                tt0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.fr0
    public /* synthetic */ TextureView l0() {
        return null;
    }

    @Override // ue.a
    public void l1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.k(ne0Var, view, f10, f11);
                ne0.m(ne0Var, f10, false, false);
                ne0Var.invalidate();
                break;
        }
    }

    @Override // ue.a
    public void m(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.k(ne0Var, view, f10, f11);
                ne0.m(ne0Var, f10, false, true);
                org.telegram.messenger.g0.i3(ne0Var.H, 450L);
                View view2 = ne0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                ne0Var.O = null;
                ne0Var.invalidate();
                ne0Var.Q.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public /* synthetic */ boolean m1(int i7, View view) {
        switch (this.a) {
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n0(org.telegram.ui.Components.r5 r5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // v4.d0
    public void o0(int i7, int i10) {
        ((v4.g0) this.b).o(i7, i10);
    }

    @Override // ue.a
    public boolean o1() {
        switch (this.a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onDown(MotionEvent motionEvent) {
        vi viVar = (vi) this.b;
        View view = viVar.a;
        if (view != null) {
            view.setPressed(true);
            viVar.a.setSelected(true);
            viVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.z00
    public void onLongPress(MotionEvent motionEvent) {
        vi viVar = (vi) this.b;
        cn cnVar = viVar.x;
        if (viVar.a != null) {
            cnVar.e9 = org.telegram.ui.Components.d9.b(cnVar, viVar.w, cnVar.j6, cnVar.b(), cnVar.za);
            org.telegram.ui.ActionBar.g1 g1Var = cnVar.e9;
            if (g1Var != null) {
                viVar.b = g1Var;
                g1Var.setOnDismissListener(new e0(viVar, 2));
                cnVar.z0.C0();
                cnVar.B0.R = false;
                View view = viVar.w;
                cnVar.Tb(view);
                cnVar.w8(false, view != cnVar.x1, 0.3f);
                cnVar.F9(false);
                ok okVar = cnVar.N3;
                if (okVar != null) {
                    okVar.d(1, true);
                }
                UndoView undoView = cnVar.M3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                sj sjVar = cnVar.Z;
                if (sjVar == null || sjVar.getEditField() == null) {
                    return;
                }
                cnVar.Z.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        vi viVar = (vi) this.b;
        if (viVar.e || (view = viVar.a) == null) {
            return false;
        }
        view.callOnClick();
        viVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.fj0
    public void q(float f10) {
        ((a00) this.b).i0.A(f10);
    }

    @Override // org.telegram.ui.Components.mm0
    public int q0() {
        switch (this.a) {
            case 3:
                c4 c4Var = (c4) this.b;
                return c4Var.c - c4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // ue.a
    public /* synthetic */ void s(float f10, float f11) {
        int i7 = this.a;
    }

    @Override // ue.a
    public /* synthetic */ void t0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.o71
    public void t1(boolean z9) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        rc rcVar = (rc) this.b;
        g6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (g6Var instanceof qc) {
            g6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            rc rcVar2 = ((qc) g6Var2).a;
            rcVar2.J = !rcVar2.J;
            rcVar2.k1();
            rcVar2.g1(false);
        }
        rcVar.b1(a(), false);
        rcVar.g1(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.ym0
    public void v0(int i7, boolean z9, boolean z10) {
        om0 om0Var = (om0) this.b;
        om0Var.removeSelfFromStack();
        if (z9) {
            return;
        }
        om0Var.a0(om0Var.b, om0Var.c, z10, i7);
    }

    @Override // ue.a
    public void w(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.k(ne0Var, view, f10, f11);
                ne0.m(ne0Var, f10, false, true);
                org.telegram.messenger.g0.i3(ne0Var.H, 450L);
                ne0Var.O = null;
                ne0Var.invalidate();
                ne0Var.Q.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.ml
    public void w0(String str) {
        ((cn) ((bi.g5) this.b).c).Fa(str, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(org.telegram.messenger.ij ijVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String y(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.ij messageObject;
        mb mbVar = (mb) this.b;
        if ((view instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            long j3 = messageObject.H0;
            if (j3 != -1) {
                if (mbVar.p0.contains(Long.valueOf(j3))) {
                    mbVar.p0.remove(Long.valueOf(messageObject.H0));
                } else {
                    mbVar.p0.add(Long.valueOf(messageObject.H0));
                }
                mbVar.b1(true);
                mbVar.W0();
                mbVar.E.f();
                return;
            }
        }
        mbVar.U0(view, f10, f11);
    }

    private final void h2(float f10) {
    }

    private final void l2(float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(org.telegram.messenger.ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.fr0
    public /* synthetic */ void I(org.telegram.messenger.ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(org.telegram.messenger.ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.ml
    public /* synthetic */ void T0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.jx0
    public void t(qh0 qh0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final /* synthetic */ void G1() {
    }

    private final /* synthetic */ void L1() {
    }

    private final /* synthetic */ void T1() {
    }

    private final /* synthetic */ void V1() {
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
    public /* synthetic */ void F1() {
    }

    @Override // org.telegram.ui.Components.do0
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.ym0
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.Components.f8
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    private final /* synthetic */ void M1(float f10, float f11) {
    }

    private final /* synthetic */ void O1(float f10, float f11) {
    }

    private final void z1(float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.ml
    public /* synthetic */ void Y(boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    private final /* synthetic */ void Z1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void a2(View view, float f10, float f11) {
    }

    private final /* synthetic */ void d2(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
