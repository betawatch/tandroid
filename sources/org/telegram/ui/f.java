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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f implements r9, tq0, org.telegram.ui.web.v0, org.telegram.ui.Components.om0, org.telegram.ui.Components.r4, org.telegram.ui.Components.yk0, org.telegram.ui.Components.gj0, org.telegram.ui.Cells.l1, d71, org.telegram.ui.Components.dt0, gl, re.a, org.telegram.ui.Components.ij0, org.telegram.ui.Cells.m7, org.telegram.ui.Components.eo0, u4.d0, org.telegram.ui.Components.d8, org.telegram.ui.Components.u00, r0.m, xw0, rm0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.yk0
    public void A() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.eo0
    public void C0() {
        if (org.telegram.messenger.g0.I3()) {
            ((x30) this.b).m1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
        switch (this.a) {
            case 5:
                ((j5) this.b).j1.M();
                break;
        }
    }

    @Override // u4.d0
    public void E(int i3, int i10) {
        ((u4.h0) this.b).j(i3, i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public void E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.dt0
    public void F(boolean z10) {
        Runnable runnable = ((xd) this.b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public void F0(float f10) {
        switch (this.a) {
            case 6:
            case 9:
                break;
            default:
                yt ytVar = (yt) this.b;
                if (f10 != 1.0f || ytVar.f[1].getVisibility() == 0) {
                    if (ytVar.r) {
                        ytVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        ytVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * ytVar.f[0].getMeasuredWidth()));
                    } else {
                        ytVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        ytVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - ytVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        xt[] xtVarArr = ytVar.f;
                        xt xtVar = xtVarArr[0];
                        xtVarArr[0] = xtVarArr[1];
                        xtVarArr[1] = xtVar;
                        xtVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle G1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // re.a
    public /* synthetic */ void H0() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.tq0
    public void I0(org.telegram.messenger.zi ziVar) {
        l3 l3Var = ((i4) this.b).v0[0];
        if (l3Var != null) {
            l3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        org.telegram.messenger.g0.i3(new cg.l0(this, i3, 18), 50L);
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        org.telegram.ui.Components.i41 i41Var = gVar.y;
        LaunchActivity launchActivity = (LaunchActivity) i41Var.b;
        g gVar2 = (g) i41Var.c;
        String str2 = LaunchActivity.E1;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, launchActivity, null);
        s1Var.j0 = false;
        s1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new xy(6, s1Var, gVar2));
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String M0() {
        return null;
    }

    @Override // re.a
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.q4 q4Var;
        switch (this.a) {
            case 14:
                q4Var = ((org.telegram.ui.ActionBar.d2) ((mw) this.b).o0).parentLayout;
                ((ActionBarLayout) q4Var).r();
                break;
        }
    }

    @Override // u4.d0
    public void O0(int i3, int i10) {
        ((u4.h0) this.b).p(i3, i10);
    }

    public void O1(md0 md0Var) {
        boolean z10;
        wd0 wd0Var = (wd0) this.b;
        wd0Var.O = true;
        xd0 xd0Var = wd0Var.b0;
        xd0Var.K = 0;
        xd0Var.w1(0, false);
        int i3 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            boolean z11 = xd0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = xd0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i3 < 28 || xd0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i3 < 26 || xd0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ud0 ud0Var = wd0Var.a;
            if (ud0Var != null && "888".equals(ud0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (xd0Var.w) {
                xd0Var.r.clear();
                if (!z11) {
                    xd0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    xd0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    xd0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i3 >= 26) {
                    xd0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!xd0Var.r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    if (!e12.getBoolean("firstlogin", true) && !xd0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !xd0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            xd0Var.getParentActivity().requestPermissions((String[]) xd0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    e12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, "Continue"), null);
                    int i10 = R.raw.calls_log;
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    if (!z11 && (!z12 || !z13)) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754275, "AllowReadCall");
                        i10 = R.raw.incoming_calls;
                    } else {
                        s1Var.U = org.telegram.messenger.bd.M0(2131754273, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.k6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.k6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    xd0Var.h = xd0Var.showDialog(s1Var);
                    wd0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        vd0 vd0Var = new vd0(0, this, md0Var);
        md0Var.h.f(z10, z10);
        org.telegram.messenger.g0.i3(vd0Var, 400L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        vf0 vf0Var = (vf0) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        vf0Var.d = I0;
        vf0Var.G.setPadding(I0.a, I0.b, I0.c, I0.d);
        vf0Var.F.requestLayout();
        return r0.k1.b;
    }

    public void R1(Exception exc) {
        dl0 dl0Var = (dl0) this.b;
        if (dl0Var.R0) {
            return;
        }
        dl0Var.N0(true, false);
        dl0Var.J0(false);
        if ((exc instanceof qc.a) || (exc instanceof qc.b)) {
            org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131747412, null), dl0Var);
        } else {
            org.telegram.ui.Components.t4.v0(exc.getMessage(), dl0Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vq0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // re.a
    public boolean U0(float f10, float f11) {
        switch (this.a) {
            case 14:
                return ((mw) this.b).o0.isInPreviewMode();
            default:
                ge0 ge0Var = (ge0) this.b;
                View view = null;
                ge0Var.P = null;
                int childCount = ge0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ge0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view == null || ge0Var.Q.contains(view)) ? false : true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.d8
    public void W0(int i3, int i10) {
        y40 y40Var = (y40) this.b;
        y40Var.X = i3;
        org.telegram.messenger.g0.b4(y40Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(org.telegram.messenger.zi ziVar) {
        return org.telegram.ui.Cells.f1.a(ziVar);
    }

    @Override // org.telegram.ui.d71
    public boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kh.a Z() {
        return null;
    }

    @Override // re.a
    public boolean Z0(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                return false;
            default:
                ge0 ge0Var = (ge0) this.b;
                ge0.k(ge0Var, view, f10, f11);
                org.telegram.messenger.g0.r(ge0Var.I);
                ge0Var.setSkipDrawSelector(true);
                ge0.m(ge0Var, f10, true, false);
                ge0Var.invalidate();
                ge0Var.R.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.d71
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        pc pcVar = (pc) this.b;
        e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        if (e6Var == null) {
            return org.telegram.ui.ActionBar.k6.I.q();
        }
        e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        return e6Var2.a();
    }

    @Override // org.telegram.ui.xw0
    public void a0() {
        ((dh0) this.b).a();
    }

    @Override // org.telegram.ui.Components.u00
    public void a1() {
        pi piVar = (pi) this.b;
        View view = piVar.a;
        if (view != null) {
            view.setPressed(false);
            piVar.a.setSelected(false);
        }
        View view2 = piVar.n;
        if (view2 == null || piVar.d) {
            return;
        }
        view2.callOnClick();
        piVar.d = true;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        wz wzVar = (wz) this.b;
        if (view instanceof org.telegram.ui.Cells.g7) {
            wz.a(wzVar, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            wz.a(wzVar, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            wz.a(wzVar, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            wz.a(wzVar, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            if (!wzVar.p0.I()) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (t2Var.Z(f10)) {
                    wzVar.j0.Y(t2Var);
                    return true;
                }
            }
            wz.a(wzVar, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.d8
    public void dismiss() {
        ((y40) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.rm0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean e1(String str, i9 i9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.yk0
    public void f(int i3, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((p5) this.b).d;
                v5Var.e0 = i3;
                v5Var.J0(true);
                break;
            case 9:
                rb rbVar = ((pb) this.b).f;
                rbVar.E = i3;
                rbVar.d(true);
                break;
            default:
                yt ytVar = (yt) this.b;
                if (ytVar.f[0].f != i3) {
                    ytVar.x = i3 == ytVar.e.getFirstTabId();
                    xt xtVar = ytVar.f[1];
                    xtVar.f = i3;
                    xtVar.setVisibility(0);
                    ytVar.r0(true);
                    ytVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // re.a
    public boolean g0() {
        switch (this.a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.om0
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

    @Override // re.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 14:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public void h() {
        ((wz) this.b).j0.finish();
    }

    @Override // org.telegram.ui.Components.dt0
    public float h1() {
        return k2.p1.d(9.66f, pi.a.d(((xd) this.b).V0), 0);
    }

    @Override // org.telegram.ui.tq0
    public /* synthetic */ TextureView i0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void j() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        sf.c.t(((hb) this.b).n.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int j0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // u4.d0
    public void j1(int i3, int i10) {
        ((u4.h0) this.b).n(i3, i10, null);
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                int round = Math.round(((d4Var.c - r2) * f10) + d4Var.b);
                if (round != org.telegram.messenger.az.Z0) {
                    org.telegram.messenger.az.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.az.Z0);
                    edit.commit();
                    d4Var.f.v0[0].getAdapter().E.clear();
                    i4 i4Var = d4Var.f;
                    for (int i3 = 0; i3 < 2; i3++) {
                        i4Var.v0[i3].c.f();
                        g4 g4Var = i4Var.v0[i3].c;
                        ArrayList arrayList = g4Var.d;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.e.a(g4Var.M);
                        Utilities.e.e(g4Var.M, 100L);
                    }
                    d4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                r90 r90Var = (r90) this.b;
                t90 t90Var = r90Var.E;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.lc.c()) {
                    org.telegram.messenger.lc.g = b8.be.b(round2, 0, 100);
                    org.telegram.messenger.lc.k();
                    org.telegram.messenger.lc.d(false);
                    t90Var.d0();
                    ArrayList arrayList2 = t90Var.s;
                    if (arrayList2.isEmpty()) {
                        t90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new o90(2, 0, org.telegram.messenger.lc.c() <= 0 ? org.telegram.messenger.bd.M0(2131748879, null) : org.telegram.messenger.lc.c() >= 100 ? org.telegram.messenger.bd.M0(2131748878, null) : org.telegram.messenger.bd.a0(null, null, 2131748880, String.format("%d%%", Integer.valueOf(org.telegram.messenger.lc.c()))), 0, 0));
                        t90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            r90Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                j5.l1 = f10;
                org.telegram.ui.Components.qt0 qt0Var = ((j5) this.b).j1;
                qt0Var.L();
                qt0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public /* synthetic */ boolean k1(int i3, View view) {
        switch (this.a) {
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // u4.d0
    public void l0(int i3, int i10) {
        ((u4.h0) this.b).o(i3, i10);
    }

    @Override // org.telegram.ui.d71
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        pc pcVar = (pc) this.b;
        e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        if (e6Var instanceof oc) {
            e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            pc pcVar2 = ((oc) e6Var2).a;
            pcVar2.K = !pcVar2.K;
            pcVar2.k1();
            pcVar2.g1(false);
        }
        pcVar.b1(a(), false);
        pcVar.g1(false);
    }

    @Override // org.telegram.ui.rm0
    public void m() {
        hm0 hm0Var = (hm0) this.b;
        if (hm0Var.b.size() != 0) {
            hm0Var.R.invalidate();
            hm0Var.b0(true);
        } else {
            hm0Var.R.setPivotX(0.0f);
            hm0Var.R.setPivotY(0.0f);
            hm0Var.b0(false);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.Components.dt0
    public int m1() {
        xd xdVar = (xd) this.b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m2(int i3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // re.a
    public void o(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ge0 ge0Var = (ge0) this.b;
                ge0.k(ge0Var, view, f10, f11);
                ge0.m(ge0Var, f10, false, true);
                org.telegram.messenger.g0.i3(ge0Var.I, 450L);
                View view2 = ge0Var.P;
                if (view2 != null) {
                    view2.performClick();
                }
                ge0Var.P = null;
                ge0Var.invalidate();
                ge0Var.R.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override // re.a
    public void o1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ge0 ge0Var = (ge0) this.b;
                ge0.k(ge0Var, view, f10, f11);
                ge0.m(ge0Var, f10, false, false);
                ge0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onDown(MotionEvent motionEvent) {
        pi piVar = (pi) this.b;
        View view = piVar.a;
        if (view != null) {
            view.setPressed(true);
            piVar.a.setSelected(true);
            piVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.u00
    public void onLongPress(MotionEvent motionEvent) {
        pi piVar = (pi) this.b;
        wm wmVar = piVar.x;
        if (piVar.a != null) {
            wmVar.f9 = org.telegram.ui.Components.b9.b(wmVar, piVar.w, wmVar.k6, wmVar.b(), wmVar.ya);
            org.telegram.ui.ActionBar.f1 f1Var = wmVar.f9;
            if (f1Var != null) {
                piVar.b = f1Var;
                f1Var.setOnDismissListener(new f0(piVar, 2));
                wmVar.A0.C0();
                wmVar.C0.R = false;
                View view = piVar.w;
                wmVar.Qb(view);
                wmVar.v8(false, view != wmVar.y1, 0.3f);
                wmVar.E9(false);
                ik ikVar = wmVar.O3;
                if (ikVar != null) {
                    ikVar.d(1, true);
                }
                UndoView undoView = wmVar.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                mj mjVar = wmVar.a0;
                if (mjVar == null || mjVar.getEditField() == null) {
                    return;
                }
                wmVar.a0.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.u00
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        pi piVar = (pi) this.b;
        if (piVar.e || (view = piVar.a) == null) {
            return false;
        }
        view.callOnClick();
        piVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        return false;
    }

    @Override // org.telegram.ui.Components.om0
    public int q0() {
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
    public /* synthetic */ org.telegram.ui.Cells.i9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Components.ij0
    public void r(float f10) {
        ((wz) this.b).j0.m(f10);
    }

    @Override // re.a
    public boolean s1() {
        switch (this.a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override // re.a
    public /* synthetic */ void t(float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.rm0
    public void u(Editable editable) {
        hm0 hm0Var = (hm0) this.b;
        org.telegram.ui.Components.jt jtVar = hm0Var.N;
        hm0Var.a = editable;
        jtVar.setText(editable);
    }

    @Override // re.a
    public /* synthetic */ void u0() {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.rm0
    public void v0(int i3, boolean z10, boolean z11) {
        hm0 hm0Var = (hm0) this.b;
        hm0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        hm0Var.a0(hm0Var.b, hm0Var.c, z11, i3);
    }

    @Override // org.telegram.ui.gl
    public void w0(String str) {
        ((wm) ((ci.o4) this.b).c).Da(str, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // re.a
    public void x(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ge0 ge0Var = (ge0) this.b;
                ge0.k(ge0Var, view, f10, f11);
                ge0.m(ge0Var, f10, false, true);
                org.telegram.messenger.g0.i3(ge0Var.I, 450L);
                ge0Var.P = null;
                ge0Var.invalidate();
                ge0Var.R.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(org.telegram.messenger.zi ziVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        org.telegram.messenger.zi messageObject;
        kb kbVar = (kb) this.b;
        if ((view instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
            long j10 = messageObject.H0;
            if (j10 != -1) {
                if (kbVar.q0.contains(Long.valueOf(j10))) {
                    kbVar.q0.remove(Long.valueOf(messageObject.H0));
                } else {
                    kbVar.q0.add(Long.valueOf(messageObject.H0));
                }
                kbVar.b1(true);
                kbVar.W0();
                kbVar.F.f();
                return;
            }
        }
        kbVar.U0(view, f10, f11);
    }

    private final void c2(float f10) {
    }

    private final void d2(float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(org.telegram.messenger.zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.tq0
    public /* synthetic */ void G(org.telegram.messenger.zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(org.telegram.messenger.wi wiVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(org.telegram.messenger.zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.gl
    public /* synthetic */ void T0(int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.xw0
    public void l(lh0 lh0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final /* synthetic */ void B1() {
    }

    private final /* synthetic */ void J1() {
    }

    private final /* synthetic */ void L1() {
    }

    private final void g2() {
    }

    private final void j2() {
    }

    private final /* synthetic */ void k2() {
    }

    private final void l2() {
    }

    private final void n2() {
    }

    private final /* synthetic */ void v1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1() {
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.rm0
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c1() {
    }

    @Override // org.telegram.ui.Components.d8
    public /* synthetic */ void g1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    private final /* synthetic */ void D1(float f10, float f11) {
    }

    private final /* synthetic */ void F1(float f10, float f11) {
    }

    private final void q1(float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.g10 g10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(String str, String str2) {
    }

    @Override // org.telegram.ui.gl
    public /* synthetic */ void Y(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    private final /* synthetic */ void T1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void X1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b2(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p2(org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void r1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(org.telegram.ui.Cells.q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(org.telegram.messenger.zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
