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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f implements r9, dr0, org.telegram.ui.web.w0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.t4, org.telegram.ui.Components.uk0, org.telegram.ui.Components.cj0, org.telegram.ui.Cells.l1, n71, org.telegram.ui.Components.et0, kl, ue.a, org.telegram.ui.Components.ej0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.co0, v4.d0, org.telegram.ui.Components.f8, org.telegram.ui.Components.z00, r0.m, fx0, wm0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.wm0
    public void A() {
        mm0 mm0Var = (mm0) this.b;
        if (mm0Var.b.size() != 0) {
            mm0Var.Q.invalidate();
            mm0Var.b0(true);
        } else {
            mm0Var.Q.setPivotX(0.0f);
            mm0Var.Q.setPivotY(0.0f);
            mm0Var.b0(false);
        }
    }

    @Override // org.telegram.ui.wm0
    public void B(Editable editable) {
        mm0 mm0Var = (mm0) this.b;
        org.telegram.ui.Components.lt ltVar = mm0Var.M;
        mm0Var.a = editable;
        ltVar.setText(editable);
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.co0
    public void C0() {
        if (org.telegram.messenger.g0.I3()) {
            ((c40) this.b).n1().k(0L, 33, null, null, null, null);
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

    @Override // org.telegram.ui.Components.et0
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
                au auVar = (au) this.b;
                if (f10 != 1.0f || auVar.f[1].getVisibility() == 0) {
                    if (auVar.r) {
                        auVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        auVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * auVar.f[0].getMeasuredWidth()));
                    } else {
                        auVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        auVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - auVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        zt[] ztVarArr = auVar.f;
                        zt ztVar = ztVarArr[0];
                        ztVarArr[0] = ztVarArr[1];
                        ztVarArr[1] = ztVar;
                        ztVar.setVisibility(8);
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

    @Override // org.telegram.ui.dr0
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
        pu puVar = gVar.y;
        LaunchActivity launchActivity = (LaunchActivity) puVar.b;
        g gVar2 = (g) puVar.c;
        String str2 = LaunchActivity.B1;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity, null);
        u1Var.i0 = false;
        u1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new h50(3, u1Var, gVar2));
    }

    @Override // v4.d0
    public void M0(int i7, int i10) {
        ((v4.g0) this.b).p(i7, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ fr0 N1() {
        return null;
    }

    @Override // ue.a
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.a) {
            case 14:
                q4Var = ((org.telegram.ui.ActionBar.f2) ((pw) this.b).n0).parentLayout;
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
        bg0 bg0Var = (bg0) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        bg0Var.d = I0;
        bg0Var.F.setPadding(I0.a, I0.b, I0.c, I0.d);
        bg0Var.E.requestLayout();
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
                return ((pw) this.b).n0.isInPreviewMode();
            default:
                le0 le0Var = (le0) this.b;
                View view = null;
                le0Var.O = null;
                int childCount = le0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = le0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view == null || le0Var.P.contains(view)) ? false : true;
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
        d50 d50Var = (d50) this.b;
        d50Var.W = i7;
        org.telegram.messenger.g0.b4(d50Var.b);
    }

    public void X1(pd0 pd0Var) {
        boolean z9;
        be0 be0Var = (be0) this.b;
        be0Var.N = true;
        ce0 ce0Var = be0Var.g0;
        ce0Var.J = 0;
        ce0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            boolean z10 = ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z11 = ce0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z12 = i7 < 28 || ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z13 = i7 < 26 || ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            zd0 zd0Var = be0Var.a;
            if (zd0Var != null && "888".equals(zd0Var.getText())) {
                z10 = true;
                z11 = true;
                z12 = true;
                z13 = true;
            }
            if (ce0Var.w) {
                ce0Var.r.clear();
                if (!z10) {
                    ce0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z11) {
                    ce0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z12) {
                    ce0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z13 && i7 >= 26) {
                    ce0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ce0Var.r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            ce0Var.getParentActivity().requestPermissions((String[]) ce0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
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
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    ce0Var.h = ce0Var.showDialog(u1Var);
                    be0Var.N = true;
                    return;
                }
            }
            z9 = true;
        } else {
            z9 = true;
        }
        ae0 ae0Var = new ae0(0, this, pd0Var);
        pd0Var.h.f(z9, z9);
        org.telegram.messenger.g0.i3(ae0Var, 400L);
    }

    @Override // org.telegram.ui.Components.et0
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(((zd) this.b).U0), 0);
    }

    public void Y1(Exception exc) {
        hl0 hl0Var = (hl0) this.b;
        if (hl0Var.Q0) {
            return;
        }
        hl0Var.N0(true, false);
        hl0Var.J0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131747405, null), hl0Var);
        } else {
            org.telegram.ui.Components.v4.t0(exc.getMessage(), hl0Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.n71
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        rc rcVar = (rc) this.b;
        f6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (f6Var == null) {
            return org.telegram.ui.ActionBar.k6.I.q();
        }
        f6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        return f6Var2.a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.n71
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
                au auVar = (au) this.b;
                if (auVar.f[0].f != i7) {
                    auVar.x = i7 == auVar.e.getFirstTabId();
                    zt ztVar = auVar.f[1];
                    ztVar.f = i7;
                    ztVar.setVisibility(0);
                    auVar.r0(true);
                    auVar.r = z9;
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

    @Override // org.telegram.ui.fx0
    public void c0() {
        ((hh0) this.b).a();
    }

    @Override // ue.a
    public boolean c1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                return false;
            default:
                le0 le0Var = (le0) this.b;
                le0.k(le0Var, view, f10, f11);
                org.telegram.messenger.g0.r(le0Var.H);
                le0Var.setSkipDrawSelector(true);
                le0.m(le0Var, f10, true, false);
                le0Var.invalidate();
                le0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.z00
    public void d1() {
        ti tiVar = (ti) this.b;
        View view = tiVar.a;
        if (view != null) {
            view.setPressed(false);
            tiVar.a.setSelected(false);
        }
        View view2 = tiVar.n;
        if (view2 == null || tiVar.d) {
            return;
        }
        view2.callOnClick();
        tiVar.d = true;
    }

    @Override // org.telegram.ui.Components.f8
    public void dismiss() {
        ((d50) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.wm0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.et0
    public int e1() {
        zd zdVar = (zd) this.b;
        return zdVar.V0 + zdVar.W0;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        yz yzVar = (yz) this.b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            yz.a(yzVar, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            yz.a(yzVar, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            yz.a(yzVar, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            yz.a(yzVar, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            if (!yzVar.o0.i()) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (t2Var.Z(f10)) {
                    yzVar.i0.O(t2Var);
                    return true;
                }
            }
            yz.a(yzVar, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
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
        ((yz) this.b).i0.finish();
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
                u90 u90Var = (u90) this.b;
                w90 w90Var = u90Var.D;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.sc.c()) {
                    org.telegram.messenger.sc.g = c8.j9.b(round2, 0, 100);
                    org.telegram.messenger.sc.k();
                    org.telegram.messenger.sc.d(false);
                    w90Var.d0();
                    ArrayList arrayList2 = w90Var.s;
                    if (arrayList2.isEmpty()) {
                        w90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new r90(2, 0, org.telegram.messenger.sc.c() <= 0 ? org.telegram.messenger.id.M0(2131748872, null) : org.telegram.messenger.sc.c() >= 100 ? org.telegram.messenger.id.M0(2131748871, null) : org.telegram.messenger.id.a0(null, null, 2131748873, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c()))), 0, 0));
                        w90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            u90Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                h5.k1 = f10;
                org.telegram.ui.Components.rt0 rt0Var = ((h5) this.b).i1;
                rt0Var.L();
                rt0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView l0() {
        return null;
    }

    @Override // ue.a
    public void l1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                le0 le0Var = (le0) this.b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, false);
                le0Var.invalidate();
                break;
        }
    }

    @Override // ue.a
    public void m(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                le0 le0Var = (le0) this.b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.H, 450L);
                View view2 = le0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                le0Var.O = null;
                le0Var.invalidate();
                le0Var.Q.a(false, true);
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
        ti tiVar = (ti) this.b;
        View view = tiVar.a;
        if (view != null) {
            view.setPressed(true);
            tiVar.a.setSelected(true);
            tiVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.z00
    public void onLongPress(MotionEvent motionEvent) {
        ti tiVar = (ti) this.b;
        an anVar = tiVar.x;
        if (tiVar.a != null) {
            anVar.e9 = org.telegram.ui.Components.d9.b(anVar, tiVar.w, anVar.j6, anVar.b(), anVar.xa);
            org.telegram.ui.ActionBar.g1 g1Var = anVar.e9;
            if (g1Var != null) {
                tiVar.b = g1Var;
                g1Var.setOnDismissListener(new e0(tiVar, 2));
                anVar.z0.C0();
                anVar.B0.R = false;
                View view = tiVar.w;
                anVar.Qb(view);
                anVar.v8(false, view != anVar.x1, 0.3f);
                anVar.E9(false);
                mk mkVar = anVar.N3;
                if (mkVar != null) {
                    mkVar.d(1, true);
                }
                UndoView undoView = anVar.M3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                qj qjVar = anVar.Z;
                if (qjVar == null || qjVar.getEditField() == null) {
                    return;
                }
                anVar.Z.getEditField().setAllowDrawCursor(false);
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
        ti tiVar = (ti) this.b;
        if (tiVar.e || (view = tiVar.a) == null) {
            return false;
        }
        view.callOnClick();
        tiVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.ej0
    public void q(float f10) {
        ((yz) this.b).i0.A(f10);
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

    @Override // org.telegram.ui.n71
    public void t1(boolean z9) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        rc rcVar = (rc) this.b;
        f6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        if (f6Var instanceof qc) {
            f6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            rc rcVar2 = ((qc) f6Var2).a;
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

    @Override // org.telegram.ui.wm0
    public void v0(int i7, boolean z9, boolean z10) {
        mm0 mm0Var = (mm0) this.b;
        mm0Var.removeSelfFromStack();
        if (z9) {
            return;
        }
        mm0Var.a0(mm0Var.b, mm0Var.c, z10, i7);
    }

    @Override // ue.a
    public void w(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                le0 le0Var = (le0) this.b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.H, 450L);
                le0Var.O = null;
                le0Var.invalidate();
                le0Var.Q.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.kl
    public void w0(String str) {
        ((an) ((bi.g5) this.b).c).Da(str, false);
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

    @Override // org.telegram.ui.dr0
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

    @Override // org.telegram.ui.kl
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

    @Override // org.telegram.ui.fx0
    public void t(oh0 oh0Var) {
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

    @Override // org.telegram.ui.wm0
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

    @Override // org.telegram.ui.kl
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
