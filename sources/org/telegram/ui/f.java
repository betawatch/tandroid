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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f implements s9, dr0, org.telegram.ui.web.u0, org.telegram.ui.Components.zm0, org.telegram.ui.Components.z4, org.telegram.ui.Components.jl0, org.telegram.ui.Components.rj0, org.telegram.ui.Cells.m1, n71, org.telegram.ui.Components.pt0, ll, ue.a, org.telegram.ui.Components.tj0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.po0, v4.e0, org.telegram.ui.Components.i8, org.telegram.ui.Components.k10, r0.m, gx0, zm0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // ue.a
    public void B(View view, float f10, float f11) {
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

    @Override // org.telegram.ui.Components.i8
    public void B0(int i7, int i10) {
        e50 e50Var = (e50) this.b;
        e50Var.X = i7;
        org.telegram.messenger.g0.Z3(e50Var.b);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ org.telegram.ui.Cells.j9 B2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String D(long j3) {
        return null;
    }

    @Override // ue.a
    public /* synthetic */ void D0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.pt0
    public void E(boolean z10) {
        Runnable runnable = ((xd) this.b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean F0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    @Override // org.telegram.ui.s9
    public void H(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        zs zsVar = gVar.y;
        LaunchActivity launchActivity = (LaunchActivity) zsVar.b;
        g gVar2 = (g) zsVar.c;
        String str2 = LaunchActivity.C1;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, launchActivity, null);
        t1Var.j0 = false;
        t1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new d00(5, t1Var, gVar2));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        org.telegram.messenger.g0.h3(new ai.u0(this, i7, 24), 50L);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pt0
    public float K0() {
        return i5.c.d(9.66f, ri.a.d(((xd) this.b).V0), 0);
    }

    @Override // org.telegram.ui.n71
    public boolean O0() {
        return false;
    }

    @Override // ue.a
    public /* synthetic */ void P0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.gx0
    public void Q() {
        ((lh0) this.b).a();
    }

    @Override // org.telegram.ui.Components.k10
    public void Q0() {
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

    @Override // org.telegram.ui.Cells.m1
    public void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ TextureView T() {
        return null;
    }

    @Override // org.telegram.ui.Components.pt0
    public int T0() {
        xd xdVar = (xd) this.b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        return false;
    }

    @Override // ue.a
    public void U(float f10, float f11) {
        org.telegram.ui.ActionBar.r4 r4Var;
        switch (this.a) {
            case 14:
                r4Var = ((org.telegram.ui.ActionBar.g2) ((uw) this.b).o0).parentLayout;
                ((ActionBarLayout) r4Var).r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // v4.e0
    public void V(int i7, int i10) {
        ((v4.i0) this.b).o(i7, i10);
    }

    @Override // v4.e0
    public void V0(int i7, int i10) {
        ((v4.i0) this.b).n(i7, i10, null);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean X(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // ue.a
    public void X1(View view, float f10, float f11) {
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

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(int i7, View view) {
        switch (this.a) {
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
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
                du duVar = (du) this.b;
                if (duVar.f[0].f != i7) {
                    duVar.x = i7 == duVar.e.getFirstTabId();
                    cu cuVar = duVar.f[1];
                    cuVar.f = i7;
                    cuVar.setVisibility(0);
                    duVar.r0(true);
                    duVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public int a0() {
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

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean a2(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.n71
    public boolean b() {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.b;
        i6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        if (i6Var == null) {
            return org.telegram.ui.ActionBar.n6.I.q();
        }
        i6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        return i6Var2.b();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b0() {
        return false;
    }

    @Override // org.telegram.ui.n71
    public void b1(boolean z10) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        qc qcVar = (qc) this.b;
        i6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        if (i6Var instanceof pc) {
            i6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
            qc qcVar2 = ((pc) i6Var2).a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        }
        qcVar.b1(b(), false);
        qcVar.g1(false);
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10) {
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

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean c1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.i8
    public void dismiss() {
        ((e50) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int e0() {
        return 0;
    }

    @Override // org.telegram.ui.zm0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean g(float f10, float f11, int i7, View view) {
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
        if (view instanceof org.telegram.ui.Cells.i2) {
            b00.a(b00Var, ((org.telegram.ui.Cells.i2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.u2) {
            if (!b00Var.p0.i0()) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                if (u2Var.b0(f10)) {
                    b00Var.j0.y(u2Var);
                    return true;
                }
            }
            b00.a(b00Var, ((org.telegram.ui.Cells.u2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.zm0
    public void g0(int i7, boolean z10, boolean z11) {
        om0 om0Var = (om0) this.b;
        om0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        om0Var.a0(om0Var.b, om0Var.c, z11, i7);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean g1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override // org.telegram.ui.Components.zm0
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

    @Override // org.telegram.ui.Components.tj0
    public void h() {
        ((b00) this.b).j0.finish();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a h0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.ll
    public void i0(String str) {
        ((bn) ((di.i4) this.b).c).Ga(str, false);
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
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
                    org.telegram.messenger.pc.g = c8.m9.b(round2, 0, 100);
                    org.telegram.messenger.pc.k();
                    org.telegram.messenger.pc.d(false);
                    y90Var.d0();
                    ArrayList arrayList2 = y90Var.s;
                    if (arrayList2.isEmpty()) {
                        y90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new t90(2, 0, org.telegram.messenger.pc.c() <= 0 ? org.telegram.messenger.gd.N0(2131748678, null) : org.telegram.messenger.pc.c() >= 100 ? org.telegram.messenger.gd.N0(2131748677, null) : org.telegram.messenger.gd.a0(null, null, 2131748679, String.format("%d%%", Integer.valueOf(org.telegram.messenger.pc.c()))), 0, 0));
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
                org.telegram.ui.Components.cu0 cu0Var = ((h5) this.b).m1;
                cu0Var.K();
                cu0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String k(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean k0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public void l(float f10) {
        ((b00) this.b).j0.v(f10);
    }

    @Override // org.telegram.ui.Components.po0
    public void l0() {
        if (org.telegram.messenger.g0.G3()) {
            ((e40) this.b).o1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        dg0 dg0Var = (dg0) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        dg0Var.d = I0;
        dg0Var.G.setPadding(I0.a, I0.b, I0.c, I0.d);
        dg0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.zm0
    public void o() {
        om0 om0Var = (om0) this.b;
        if (om0Var.b.size() != 0) {
            om0Var.R.invalidate();
            om0Var.b0(true);
        } else {
            om0Var.R.setPivotX(0.0f);
            om0Var.R.setPivotY(0.0f);
            om0Var.b0(false);
        }
    }

    @Override // org.telegram.ui.Components.k10
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

    @Override // org.telegram.ui.Components.k10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.k10
    public void onLongPress(MotionEvent motionEvent) {
        ui uiVar = (ui) this.b;
        bn bnVar = uiVar.x;
        if (uiVar.a != null) {
            bnVar.g9 = org.telegram.ui.Components.h9.b(bnVar, uiVar.w, bnVar.l6, bnVar.b(), bnVar.Ba);
            org.telegram.ui.ActionBar.g1 g1Var = bnVar.g9;
            if (g1Var != null) {
                uiVar.b = g1Var;
                g1Var.setOnDismissListener(new d0(uiVar, 2));
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

    @Override // org.telegram.ui.Components.k10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.k10
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

    @Override // org.telegram.ui.Cells.m1
    public void p() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(((ib) this.b).n.getParentActivity(), org.telegram.messenger.s2.g);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int p0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // ue.a
    public boolean q1(float f10, float f11) {
        switch (this.a) {
            case 14:
                return ((uw) this.b).o0.isInPreviewMode();
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

    @Override // ue.a
    public void r(View view, float f10, float f11) {
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

    @Override // org.telegram.ui.Cells.m1
    public boolean r0() {
        return false;
    }

    @Override // ue.a
    public boolean r1(View view, float f10, float f11) {
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

    @Override // ue.a
    public boolean r2() {
        switch (this.a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override // ue.a
    public boolean s0() {
        switch (this.a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override // ue.a
    public /* synthetic */ void u(float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.dr0
    public void u0(org.telegram.messenger.fj fjVar) {
        k3 k3Var = ((g4) this.b).v0[0];
        if (k3Var != null) {
            k3Var.b.I0(true);
        }
    }

    public void u1(pd0 pd0Var) {
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
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, "Continue"), null);
                    int i10 = R.raw.calls_log;
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    if (!z11 && (!z12 || !z13)) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754271, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754272, "AllowReadCall");
                        i10 = R.raw.incoming_calls;
                    } else {
                        t1Var.U = org.telegram.messenger.gd.N0(2131754270, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.n6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    de0Var.h = de0Var.showDialog(t1Var);
                    ce0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        be0 be0Var = new be0(0, this, pd0Var);
        pd0Var.h.f(z10, z10);
        org.telegram.messenger.g0.h3(be0Var, 400L);
    }

    @Override // org.telegram.ui.zm0
    public void v(Editable editable) {
        om0 om0Var = (om0) this.b;
        org.telegram.ui.Components.wt wtVar = om0Var.N;
        om0Var.a = editable;
        wtVar.setText(editable);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    public void v1(Exception exc) {
        kl0 kl0Var = (kl0) this.b;
        if (kl0Var.R0) {
            return;
        }
        kl0Var.N0(true, false);
        kl0Var.J0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.N0(2131747210, null), kl0Var);
        } else {
            org.telegram.ui.Components.b5.t0(exc.getMessage(), kl0Var);
        }
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
        switch (this.a) {
            case 5:
                ((h5) this.b).m1.M();
                break;
        }
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String w0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public void y() {
        int i7 = this.a;
    }

    @Override // v4.e0
    public void y0(int i7, int i10) {
        ((v4.i0) this.b).p(i7, i10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y2(int i7) {
        return false;
    }

    @Override // v4.e0
    public void z(int i7, int i10) {
        ((v4.i0) this.b).j(i7, i10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        org.telegram.messenger.fj messageObject;
        lb lbVar = (lb) this.b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
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

    private final void D1(float f10) {
    }

    private final void E1(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void E0(org.telegram.messenger.ur urVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.dr0
    public /* synthetic */ void G(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void G0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void M(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O(org.telegram.messenger.cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void d0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void f1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m0(int i7) {
    }

    @Override // org.telegram.ui.gx0
    public void n(sh0 sh0Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t0(String str) {
    }

    @Override // org.telegram.ui.ll
    public /* synthetic */ void z0(int i7) {
    }

    private final void G1() {
    }

    private final void M1() {
    }

    private final /* synthetic */ void N1() {
    }

    private final void P1() {
    }

    private final void V1() {
    }

    private final /* synthetic */ void h1() {
    }

    private final /* synthetic */ void i1() {
    }

    private final /* synthetic */ void o1() {
    }

    private final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.po0
    public /* synthetic */ void K() {
    }

    @Override // org.telegram.ui.zm0
    public /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Components.i8
    public /* synthetic */ void X0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z2() {
    }

    private final void d1(float f10, float f11) {
    }

    private final /* synthetic */ void j1(float f10, float f11) {
    }

    private final /* synthetic */ void n1(float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override // org.telegram.ui.ll
    public /* synthetic */ void N(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void b2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.h10 h10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    private final /* synthetic */ void A1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void w1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void y1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void M0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a1(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c0(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
