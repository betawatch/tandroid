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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f implements r9, gr0, org.telegram.ui.web.w0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.s4, org.telegram.ui.Components.uk0, org.telegram.ui.Components.cj0, org.telegram.ui.Cells.l1, p71, org.telegram.ui.Components.ft0, ml, ue.a, org.telegram.ui.Components.ej0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.co0, v4.d0, org.telegram.ui.Components.e8, org.telegram.ui.Components.y00, r0.m, kx0, zm0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.zm0
    public void A() {
        pm0 pm0Var = (pm0) this.b;
        if (pm0Var.b.size() != 0) {
            pm0Var.Q.invalidate();
            pm0Var.b0(true);
        } else {
            pm0Var.Q.setPivotX(0.0f);
            pm0Var.Q.setPivotY(0.0f);
            pm0Var.b0(false);
        }
    }

    @Override // org.telegram.ui.zm0
    public void B(Editable editable) {
        pm0 pm0Var = (pm0) this.b;
        org.telegram.ui.Components.kt ktVar = pm0Var.M;
        pm0Var.a = editable;
        ktVar.setText(editable);
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.co0
    public void C0() {
        if (org.telegram.messenger.g0.I3()) {
            ((f40) this.b).n1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.lm0
    public void D() {
        switch (this.a) {
            case 5:
                ((h5) this.b).l1.M();
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

    @Override // org.telegram.ui.Components.ft0
    public void F(boolean z9) {
        Runnable runnable = ((zd) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public void F0(float f10) {
        switch (this.a) {
            case 6:
            case 9:
                break;
            default:
                du duVar = (du) this.b;
                if (f10 != 1.0f || duVar.f[1].getVisibility() == 0) {
                    if (duVar.r) {
                        duVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        duVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * duVar.f[0].getMeasuredWidth()));
                    } else {
                        duVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        duVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - duVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        cu[] cuVarArr = duVar.f;
                        cu cuVar = cuVarArr[0];
                        cuVarArr[0] = cuVarArr[1];
                        cuVarArr[1] = cuVar;
                        cuVar.setVisibility(8);
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

    @Override // org.telegram.ui.gr0
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

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        org.telegram.messenger.g0.i3(new bg.m0(this, i7, 18), 50L);
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        su suVar = gVar.y;
        LaunchActivity launchActivity = (LaunchActivity) suVar.b;
        g gVar2 = (g) suVar.c;
        String str2 = LaunchActivity.B1;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity, null);
        u1Var.i0 = false;
        u1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new k50(3, u1Var, gVar2));
    }

    @Override // v4.d0
    public void M0(int i7, int i10) {
        ((v4.g0) this.b).p(i7, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ir0 N1() {
        return null;
    }

    @Override // ue.a
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.r4 r4Var;
        switch (this.a) {
            case 14:
                r4Var = ((org.telegram.ui.ActionBar.f2) ((sw) this.b).n0).parentLayout;
                ((ActionBarLayout) r4Var).r();
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
        eg0 eg0Var = (eg0) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        eg0Var.d = I0;
        eg0Var.F.setPadding(I0.a, I0.b, I0.c, I0.d);
        eg0Var.E.requestLayout();
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
                return ((sw) this.b).n0.isInPreviewMode();
            default:
                oe0 oe0Var = (oe0) this.b;
                View view = null;
                oe0Var.O = null;
                int childCount = oe0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = oe0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view == null || oe0Var.P.contains(view)) ? false : true;
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

    @Override // org.telegram.ui.Components.e8
    public void X0(int i7, int i10) {
        g50 g50Var = (g50) this.b;
        g50Var.W = i7;
        org.telegram.messenger.g0.b4(g50Var.b);
    }

    public void X1(sd0 sd0Var) {
        boolean z9;
        ee0 ee0Var = (ee0) this.b;
        ee0Var.N = true;
        fe0 fe0Var = ee0Var.g0;
        fe0Var.J = 0;
        fe0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            boolean z10 = fe0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = fe0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i7 < 28 || fe0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i7 < 26 || fe0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ce0 ce0Var = ee0Var.a;
            if (ce0Var != null && "888".equals(ce0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (fe0Var.w) {
                fe0Var.r.clear();
                if (!z10) {
                    fe0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    fe0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    fe0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i7 >= 26) {
                    fe0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!fe0Var.r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !fe0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !fe0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            fe0Var.getParentActivity().requestPermissions((String[]) fe0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
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
                    int i11 = org.telegram.ui.ActionBar.m6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.m6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    fe0Var.h = fe0Var.showDialog(u1Var);
                    ee0Var.N = true;
                    return;
                }
            }
            z9 = true;
        } else {
            z9 = true;
        }
        de0 de0Var = new de0(0, this, sd0Var);
        sd0Var.h.f(z9, z9);
        org.telegram.messenger.g0.i3(de0Var, 400L);
    }

    @Override // org.telegram.ui.Components.ft0
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(((zd) this.b).U0), 0);
    }

    public void Y1(Exception exc) {
        kl0 kl0Var = (kl0) this.b;
        if (kl0Var.Q0) {
            return;
        }
        kl0Var.N0(true, false);
        kl0Var.J0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.u4.t0(org.telegram.messenger.id.M0(2131747404, null), kl0Var);
        } else {
            org.telegram.ui.Components.u4.t0(exc.getMessage(), kl0Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.p71
    public boolean a() {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        rc rcVar = (rc) this.b;
        h6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (h6Var == null) {
            return org.telegram.ui.ActionBar.m6.I.q();
        }
        h6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        return h6Var2.a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.p71
    public boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.uk0
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
                du duVar = (du) this.b;
                if (duVar.f[0].f != i7) {
                    duVar.x = i7 == duVar.e.getFirstTabId();
                    cu cuVar = duVar.f[1];
                    cuVar.f = i7;
                    cuVar.setVisibility(0);
                    duVar.r0(true);
                    duVar.r = z9;
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

    @Override // org.telegram.ui.Components.uk0
    public void c() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.kx0
    public void c0() {
        ((kh0) this.b).a();
    }

    @Override // ue.a
    public boolean c1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                return false;
            default:
                oe0 oe0Var = (oe0) this.b;
                oe0.k(oe0Var, view, f10, f11);
                org.telegram.messenger.g0.r(oe0Var.H);
                oe0Var.setSkipDrawSelector(true);
                oe0.m(oe0Var, f10, true, false);
                oe0Var.invalidate();
                oe0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.y00
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

    @Override // org.telegram.ui.Components.e8
    public void dismiss() {
        ((g50) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.zm0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ft0
    public int e1() {
        zd zdVar = (zd) this.b;
        return zdVar.V0 + zdVar.W0;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        b00 b00Var = (b00) this.b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            b00.a(b00Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            b00.a(b00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            if (!b00Var.o0.i()) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (t2Var.Z(f10)) {
                    b00Var.i0.O(t2Var);
                    return true;
                }
            }
            b00.a(b00Var, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cj0
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

    @Override // org.telegram.ui.Components.lm0
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

    @Override // org.telegram.ui.Components.ej0
    public void i() {
        ((b00) this.b).i0.finish();
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

    @Override // org.telegram.ui.Components.lm0
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
                x90 x90Var = (x90) this.b;
                z90 z90Var = x90Var.D;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.sc.c()) {
                    org.telegram.messenger.sc.g = c8.j9.b(round2, 0, 100);
                    org.telegram.messenger.sc.k();
                    org.telegram.messenger.sc.d(false);
                    z90Var.d0();
                    ArrayList arrayList2 = z90Var.s;
                    if (arrayList2.isEmpty()) {
                        z90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new u90(2, 0, org.telegram.messenger.sc.c() <= 0 ? org.telegram.messenger.id.M0(2131748871, null) : org.telegram.messenger.sc.c() >= 100 ? org.telegram.messenger.id.M0(2131748870, null) : org.telegram.messenger.id.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c()))), 0, 0));
                        z90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            x90Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                h5.n1 = f10;
                org.telegram.ui.Components.st0 st0Var = ((h5) this.b).l1;
                st0Var.L();
                st0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.gr0
    public /* synthetic */ TextureView l0() {
        return null;
    }

    @Override // ue.a
    public void l1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                oe0 oe0Var = (oe0) this.b;
                oe0.k(oe0Var, view, f10, f11);
                oe0.m(oe0Var, f10, false, false);
                oe0Var.invalidate();
                break;
        }
    }

    @Override // ue.a
    public void m(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                oe0 oe0Var = (oe0) this.b;
                oe0.k(oe0Var, view, f10, f11);
                oe0.m(oe0Var, f10, false, true);
                org.telegram.messenger.g0.i3(oe0Var.H, 450L);
                View view2 = oe0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                oe0Var.O = null;
                oe0Var.invalidate();
                oe0Var.Q.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0
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
    public /* synthetic */ boolean n0(org.telegram.ui.Components.q5 q5Var) {
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

    @Override // org.telegram.ui.Components.y00
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

    @Override // org.telegram.ui.Components.y00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.y00
    public void onLongPress(MotionEvent motionEvent) {
        vi viVar = (vi) this.b;
        cn cnVar = viVar.x;
        if (viVar.a != null) {
            cnVar.e9 = org.telegram.ui.Components.c9.b(cnVar, viVar.w, cnVar.j6, cnVar.b(), cnVar.za);
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

    @Override // org.telegram.ui.Components.y00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.y00
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

    @Override // org.telegram.ui.Components.ej0
    public void q(float f10) {
        ((b00) this.b).i0.A(f10);
    }

    @Override // org.telegram.ui.Components.lm0
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

    @Override // org.telegram.ui.p71
    public void t1(boolean z9) {
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        rc rcVar = (rc) this.b;
        h6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (h6Var instanceof qc) {
            h6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            rc rcVar2 = ((qc) h6Var2).a;
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

    @Override // org.telegram.ui.zm0
    public void v0(int i7, boolean z9, boolean z10) {
        pm0 pm0Var = (pm0) this.b;
        pm0Var.removeSelfFromStack();
        if (z9) {
            return;
        }
        pm0Var.a0(pm0Var.b, pm0Var.c, z10, i7);
    }

    @Override // ue.a
    public void w(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                oe0 oe0Var = (oe0) this.b;
                oe0.k(oe0Var, view, f10, f11);
                oe0.m(oe0Var, f10, false, true);
                org.telegram.messenger.g0.i3(oe0Var.H, 450L);
                oe0Var.O = null;
                oe0Var.invalidate();
                oe0Var.Q.a(false, true);
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

    @Override // org.telegram.ui.Components.cj0
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

    @Override // org.telegram.ui.gr0
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

    @Override // org.telegram.ui.kx0
    public void t(rh0 rh0Var) {
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

    @Override // org.telegram.ui.Components.co0
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.zm0
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.Components.e8
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

    @Override // org.telegram.ui.Components.cj0
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
