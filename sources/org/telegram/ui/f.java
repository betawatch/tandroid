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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f implements s9, dr0, org.telegram.ui.web.u0, org.telegram.ui.Components.xm0, org.telegram.ui.Components.z4, org.telegram.ui.Components.hl0, org.telegram.ui.Components.pj0, org.telegram.ui.Cells.l1, p71, org.telegram.ui.Components.nt0, ll, ue.a, org.telegram.ui.Components.rj0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.oo0, v4.e0, org.telegram.ui.Components.k8, org.telegram.ui.Components.j10, r0.m, ix0, bn0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.bn0
    public void A(Editable editable) {
        qm0 qm0Var = (qm0) this.b;
        org.telegram.ui.Components.wt wtVar = qm0Var.N;
        qm0Var.a = editable;
        wtVar.setText(editable);
    }

    @Override // org.telegram.ui.Components.xm0
    public void C() {
        switch (this.a) {
            case 5:
                ((h5) this.b).m1.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hl0
    public void D() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.oo0
    public void D0() {
        if (org.telegram.messenger.g0.G3()) {
            ((f40) this.b).o1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // ue.a
    public /* synthetic */ void E0() {
        int i7 = this.a;
    }

    @Override // v4.e0
    public void F(int i7, int i10) {
        ((v4.i0) this.b).j(i7, i10);
    }

    @Override // org.telegram.ui.Components.nt0
    public void G(boolean z10) {
        Runnable runnable = ((xd) this.b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.dr0
    public void G0(org.telegram.messenger.fj fjVar) {
        k3 k3Var = ((g4) this.b).v0[0];
        if (k3Var != null) {
            k3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public void J(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        at atVar = gVar.y;
        LaunchActivity launchActivity = (LaunchActivity) atVar.b;
        g gVar2 = (g) atVar.c;
        String str2 = LaunchActivity.C1;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, launchActivity, null);
        u1Var.j0 = false;
        u1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new e00(5, u1Var, gVar2));
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // ue.a
    public void M(float f10, float f11) {
        org.telegram.ui.ActionBar.s4 s4Var;
        switch (this.a) {
            case 14:
                s4Var = ((org.telegram.ui.ActionBar.h2) ((vw) this.b).o0).parentLayout;
                ((ActionBarLayout) s4Var).r();
                break;
        }
    }

    @Override // v4.e0
    public void M0(int i7, int i10) {
        ((v4.i0) this.b).p(i7, i10);
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        org.telegram.messenger.g0.h3(new ai.w0(this, i7, 22), 50L);
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        eg0 eg0Var = (eg0) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        eg0Var.d = I0;
        eg0Var.G.setPadding(I0.a, I0.b, I0.c, I0.d);
        eg0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // ue.a
    public boolean Q0(float f10, float f11) {
        switch (this.a) {
            case 14:
                return ((vw) this.b).o0.isInPreviewMode();
            default:
                ne0 ne0Var = (ne0) this.b;
                View view = null;
                ne0Var.P = null;
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
                return (view == null || ne0Var.Q.contains(view)) ? false : true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.k8
    public void R0(int i7, int i10) {
        f50 f50Var = (f50) this.b;
        f50Var.X = i7;
        org.telegram.messenger.g0.Z3(f50Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.fj fjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean U(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.nt0
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((xd) this.b).V0), 0);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.p71
    public boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int Z() {
        return 0;
    }

    @Override // ue.a
    public boolean Z0(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                return false;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.l(ne0Var, view, f10, f11);
                org.telegram.messenger.g0.r(ne0Var.I);
                ne0Var.setSkipDrawSelector(true);
                ne0.n(ne0Var, f10, true, false);
                ne0Var.invalidate();
                ne0Var.R.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.hl0
    public void a(int i7, boolean z10) {
        switch (this.a) {
            case 6:
                t5 t5Var = ((n5) this.b).d;
                t5Var.e0 = i7;
                t5Var.J0(true);
                break;
            case 9:
                sb sbVar = ((qb) this.b).f;
                sbVar.E = i7;
                sbVar.d(true);
                break;
            default:
                eu euVar = (eu) this.b;
                if (euVar.f[0].f != i7) {
                    euVar.x = i7 == euVar.e.getFirstTabId();
                    du duVar = euVar.f[1];
                    duVar.f = i7;
                    duVar.setVisibility(0);
                    euVar.r0(true);
                    euVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ix0
    public void a0() {
        ((mh0) this.b).a();
    }

    @Override // org.telegram.ui.Components.j10
    public void a1() {
        ui uiVar = (ui) this.b;
        View view = uiVar.a;
        if (view != null) {
            view.setPressed(false);
            uiVar.a.setSelected(false);
        }
        View view2 = uiVar.n;
        if (view2 == null || uiVar.d) {
            return;
        }
        view2.callOnClick();
        uiVar.d = true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a c0() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean c1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.p71
    public boolean d() {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.b;
        i6Var = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
        if (i6Var == null) {
            return org.telegram.ui.ActionBar.n6.I.q();
        }
        i6Var2 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
        return i6Var2.d();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.k8
    public void dismiss() {
        ((f50) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.bn0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // ue.a
    public void e1(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.l(ne0Var, view, f10, f11);
                ne0.n(ne0Var, f10, false, false);
                ne0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public boolean f(float f10, float f11, int i7, View view) {
        c00 c00Var = (c00) this.b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            c00.a(c00Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            c00.a(c00Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            c00.a(c00Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            c00.a(c00Var, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            if (!c00Var.p0.V1()) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (t2Var.Z(f10)) {
                    c00Var.j0.F(t2Var);
                    return true;
                }
            }
            c00.a(c00Var, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.hl0
    public void g(float f10) {
        switch (this.a) {
            case 6:
            case 9:
                break;
            default:
                eu euVar = (eu) this.b;
                if (f10 != 1.0f || euVar.f[1].getVisibility() == 0) {
                    if (euVar.r) {
                        euVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        euVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * euVar.f[0].getMeasuredWidth()));
                    } else {
                        euVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        euVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - euVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        du[] duVarArr = euVar.f;
                        du duVar = duVarArr[0];
                        duVarArr[0] = duVarArr[1];
                        duVarArr[1] = duVar;
                        duVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // v4.e0
    public void g0(int i7, int i10) {
        ((v4.i0) this.b).o(i7, i10);
    }

    @Override // v4.e0
    public void g1(int i7, int i10) {
        ((v4.i0) this.b).n(i7, i10, null);
    }

    @Override // org.telegram.ui.Components.xm0
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
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.hl0
    public /* synthetic */ boolean h1(int i7, View view) {
        switch (this.a) {
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String i(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void j() {
        ((c00) this.b).j0.finish();
    }

    @Override // org.telegram.ui.Components.nt0
    public int j1() {
        xd xdVar = (xd) this.b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int k0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.p71
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.b;
        i6Var = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
        if (i6Var instanceof pc) {
            i6Var2 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            qc qcVar2 = ((pc) i6Var2).a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        }
        qcVar.b1(d(), false);
        qcVar.g1(false);
    }

    @Override // org.telegram.ui.Cells.l1
    public void m() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(((ib) this.b).n.getParentActivity(), org.telegram.messenger.s2.g);
    }

    @Override // ue.a
    public boolean m0() {
        switch (this.a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override // ue.a
    public boolean m1() {
        switch (this.a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.xm0
    public void n(boolean z10, float f10) {
        switch (this.a) {
            case 3:
                c4 c4Var = (c4) this.b;
                int round = Math.round(((c4Var.c - r2) * f10) + c4Var.b);
                if (round != org.telegram.messenger.bz.Z0) {
                    org.telegram.messenger.bz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.bz.Z0);
                    edit.commit();
                    c4Var.f.v0[0].getAdapter().E.clear();
                    g4 g4Var = c4Var.f;
                    for (int i7 = 0; i7 < 2; i7++) {
                        g4Var.v0[i7].c.f();
                        e4 e4Var = g4Var.v0[i7].c;
                        ArrayList arrayList = e4Var.d;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.e.a(e4Var.M);
                        Utilities.e.d(e4Var.M, 100L);
                    }
                    c4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                w90 w90Var = (w90) this.b;
                y90 y90Var = w90Var.E;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.pc.c()) {
                    org.telegram.messenger.pc.g = c8.l9.b(round2, 0, 100);
                    org.telegram.messenger.pc.k();
                    org.telegram.messenger.pc.d(false);
                    y90Var.d0();
                    ArrayList arrayList2 = y90Var.s;
                    if (arrayList2.isEmpty()) {
                        y90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new t90(2, 0, org.telegram.messenger.pc.c() <= 0 ? org.telegram.messenger.gd.M0(2131748679, null) : org.telegram.messenger.pc.c() >= 100 ? org.telegram.messenger.gd.M0(2131748678, null) : org.telegram.messenger.gd.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(org.telegram.messenger.pc.c()))), 0, 0));
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
                h5.o1 = f10;
                org.telegram.ui.Components.au0 au0Var = ((h5) this.b).m1;
                au0Var.K();
                au0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean n0() {
        return false;
    }

    @Override // ue.a
    public void o(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.l(ne0Var, view, f10, f11);
                ne0.n(ne0Var, f10, false, true);
                org.telegram.messenger.g0.h3(ne0Var.I, 450L);
                View view2 = ne0Var.P;
                if (view2 != null) {
                    view2.performClick();
                }
                ne0Var.P = null;
                ne0Var.invalidate();
                ne0Var.R.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onDown(MotionEvent motionEvent) {
        ui uiVar = (ui) this.b;
        View view = uiVar.a;
        if (view != null) {
            view.setPressed(true);
            uiVar.a.setSelected(true);
            uiVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.j10
    public void onLongPress(MotionEvent motionEvent) {
        ui uiVar = (ui) this.b;
        bn bnVar = uiVar.x;
        if (uiVar.a != null) {
            bnVar.g9 = org.telegram.ui.Components.i9.b(bnVar, uiVar.w, bnVar.l6, bnVar.d(), bnVar.Ba);
            org.telegram.ui.ActionBar.h1 h1Var = bnVar.g9;
            if (h1Var != null) {
                uiVar.b = h1Var;
                h1Var.setOnDismissListener(new e0(uiVar, 2));
                bnVar.A0.C0();
                bnVar.C0.R = false;
                View view = uiVar.w;
                bnVar.Ub(view);
                bnVar.x8(false, view != bnVar.y1, 0.3f);
                bnVar.G9(false);
                nk nkVar = bnVar.O3;
                if (nkVar != null) {
                    nkVar.d(1, true);
                }
                UndoView undoView = bnVar.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                rj rjVar = bnVar.a0;
                if (rjVar == null || rjVar.getEditField() == null) {
                    return;
                }
                bnVar.a0.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        ui uiVar = (ui) this.b;
        if (uiVar.e || (view = uiVar.a) == null) {
            return false;
        }
        view.callOnClick();
        uiVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void r(float f10) {
        ((c00) this.b).j0.o(f10);
    }

    @Override // org.telegram.ui.Components.xm0
    public int r0() {
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
    public /* synthetic */ void t(float f10, float f11) {
        int i7 = this.a;
    }

    @Override // ue.a
    public /* synthetic */ void t0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.bn0
    public void u() {
        qm0 qm0Var = (qm0) this.b;
        if (qm0Var.b.size() != 0) {
            qm0Var.R.invalidate();
            qm0Var.b0(true);
        } else {
            qm0Var.R.setPivotX(0.0f);
            qm0Var.R.setPivotY(0.0f);
            qm0Var.b0(false);
        }
    }

    @Override // org.telegram.ui.bn0
    public void v0(int i7, boolean z10, boolean z11) {
        qm0 qm0Var = (qm0) this.b;
        qm0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        qm0Var.a0(qm0Var.b, qm0Var.c, z11, i7);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    public void w1(qd0 qd0Var) {
        boolean z10;
        ce0 ce0Var = (ce0) this.b;
        ce0Var.O = true;
        de0 de0Var = ce0Var.h0;
        de0Var.K = 0;
        de0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            boolean z11 = de0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = de0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i7 < 28 || de0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i7 < 26 || de0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            ae0 ae0Var = ce0Var.a;
            if (ae0Var != null && "888".equals(ae0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (de0Var.w) {
                de0Var.r.clear();
                if (!z11) {
                    de0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    de0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    de0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i7 >= 26) {
                    de0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!de0Var.r.isEmpty()) {
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    if (!g12.getBoolean("firstlogin", true) && !de0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !de0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            de0Var.getParentActivity().requestPermissions((String[]) de0Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    g12.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, "Continue"), null);
                    int i10 = R.raw.calls_log;
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    if (!z11 && (!z12 || !z13)) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754272, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754273, "AllowReadCall");
                        i10 = R.raw.incoming_calls;
                    } else {
                        u1Var.U = org.telegram.messenger.gd.M0(2131754271, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    de0Var.h = de0Var.showDialog(u1Var);
                    ce0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        be0 be0Var = new be0(0, this, qd0Var);
        qd0Var.h.f(z10, z10);
        org.telegram.messenger.g0.h3(be0Var, 400L);
    }

    @Override // ue.a
    public void x(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                ne0 ne0Var = (ne0) this.b;
                ne0.l(ne0Var, view, f10, f11);
                ne0.n(ne0Var, f10, false, true);
                org.telegram.messenger.g0.h3(ne0Var.I, 450L);
                ne0Var.P = null;
                ne0Var.invalidate();
                ne0Var.R.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.ll
    public void x0(String str) {
        ((bn) ((di.i4) this.b).c).Ga(str, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    public void y1(Exception exc) {
        ml0 ml0Var = (ml0) this.b;
        if (ml0Var.R0) {
            return;
        }
        ml0Var.N0(true, false);
        ml0Var.J0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131747211, null), ml0Var);
        } else {
            org.telegram.ui.Components.b5.t0(exc.getMessage(), ml0Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String z(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.j9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.fj messageObject;
        lb lbVar = (lb) this.b;
        if ((view instanceof org.telegram.ui.Cells.u0) && (messageObject = ((org.telegram.ui.Cells.u0) view).getMessageObject()) != null) {
            long j3 = messageObject.J0;
            if (j3 != -1) {
                if (lbVar.q0.contains(Long.valueOf(j3))) {
                    lbVar.q0.remove(Long.valueOf(messageObject.J0));
                } else {
                    lbVar.q0.add(Long.valueOf(messageObject.J0));
                }
                lbVar.b1(true);
                lbVar.W0();
                lbVar.F.f();
                return;
            }
        }
        lbVar.U0(view, f10, f11);
    }

    private final void G1(float f10) {
    }

    private final void M1(float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ void H(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.ll
    public /* synthetic */ void K0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(org.telegram.messenger.cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void S0(org.telegram.messenger.ur urVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.ix0
    public void k(th0 th0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final void N1() {
    }

    private final void P1() {
    }

    private final /* synthetic */ void V1() {
    }

    private final void W1() {
    }

    private final void b2() {
    }

    private final /* synthetic */ void o1() {
    }

    private final /* synthetic */ void q1() {
    }

    private final /* synthetic */ void u1() {
    }

    private final /* synthetic */ void v1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.oo0
    public /* synthetic */ void Q() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.bn0
    public /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.k8
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    private final void n1(float f10, float f11) {
    }

    private final /* synthetic */ void r1(float f10, float f11) {
    }

    private final /* synthetic */ void s1(float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.ll
    public /* synthetic */ void V(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.i10 i10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    private final /* synthetic */ void A1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void D1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void E1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
