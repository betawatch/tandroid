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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f implements s9, br0, org.telegram.ui.web.u0, org.telegram.ui.Components.pm0, org.telegram.ui.Components.r4, org.telegram.ui.Components.zk0, org.telegram.ui.Components.hj0, org.telegram.ui.Cells.l1, l71, org.telegram.ui.Components.ft0, kl, ue.a, org.telegram.ui.Components.jj0, org.telegram.ui.Cells.m7, org.telegram.ui.Components.fo0, v4.d0, org.telegram.ui.Components.c8, org.telegram.ui.Components.c10, r0.m, ex0, ym0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ym0
    public void A(Editable editable) {
        om0 om0Var = (om0) this.b;
        org.telegram.ui.Components.rt rtVar = om0Var.N;
        om0Var.a = editable;
        rtVar.setText(editable);
    }

    @Override // org.telegram.ui.Components.pm0
    public void C() {
        switch (this.a) {
            case 5:
                ((h5) this.b).m1.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zk0
    public void D() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.zk0
    public void D0(float f10) {
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

    @Override // v4.d0
    public void E(int i7, int i10) {
        ((v4.h0) this.b).j(i7, i10);
    }

    @Override // ue.a
    public /* synthetic */ void E0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.ft0
    public void F(boolean z10) {
        Runnable runnable = ((xd) this.b).T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.br0
    public void G0(org.telegram.messenger.gj gjVar) {
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
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // v4.d0
    public void K0(int i7, int i10) {
        ((v4.h0) this.b).p(i7, i10);
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        org.telegram.messenger.g0.i3(new ai.w0(this, i7, 19), 50L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public void M(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        tr trVar = gVar.y;
        LaunchActivity launchActivity = (LaunchActivity) trVar.b;
        g gVar2 = (g) trVar.c;
        String str2 = LaunchActivity.C1;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, launchActivity, null);
        t1Var.j0 = false;
        t1Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new b00(5, t1Var, gVar2));
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        bg0 bg0Var = (bg0) this.b;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        bg0Var.d = I0;
        bg0Var.G.setPadding(I0.a, I0.b, I0.c, I0.d);
        bg0Var.F.requestLayout();
        return r0.k1.b;
    }

    @Override // ue.a
    public void O(float f10, float f11) {
        org.telegram.ui.ActionBar.o4 o4Var;
        switch (this.a) {
            case 14:
                o4Var = ((org.telegram.ui.ActionBar.e2) ((rw) this.b).o0).parentLayout;
                ((ActionBarLayout) o4Var).r();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // ue.a
    public boolean Q0(float f10, float f11) {
        switch (this.a) {
            case 14:
                return ((rw) this.b).o0.isInPreviewMode();
            default:
                le0 le0Var = (le0) this.b;
                View view = null;
                le0Var.P = null;
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
                return (view == null || le0Var.Q.contains(view)) ? false : true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Components.c8
    public void R0(int i7, int i10) {
        c50 c50Var = (c50) this.b;
        c50Var.X = i7;
        org.telegram.messenger.g0.a4(c50Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        return false;
    }

    @Override // org.telegram.ui.Components.ft0
    public float U0() {
        return i5.c.d(9.66f, ri.a.d(((xd) this.b).V0), 0);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.l71
    public boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // ue.a
    public boolean Z0(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                return false;
            default:
                le0 le0Var = (le0) this.b;
                le0.k(le0Var, view, f10, f11);
                org.telegram.messenger.g0.r(le0Var.I);
                le0Var.setSkipDrawSelector(true);
                le0.m(le0Var, f10, true, false);
                le0Var.invalidate();
                le0Var.R.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.l71
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        qc qcVar = (qc) this.b;
        e6Var = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
        if (e6Var == null) {
            return org.telegram.ui.ActionBar.j6.I.q();
        }
        e6Var2 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
        return e6Var2.a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.c10
    public void a1() {
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

    @Override // org.telegram.ui.Components.zk0
    public void b(int i7, boolean z10) {
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
                cu cuVar = (cu) this.b;
                if (cuVar.f[0].f != i7) {
                    cuVar.x = i7 == cuVar.e.getFirstTabId();
                    bu buVar = cuVar.f[1];
                    buVar.f = i7;
                    buVar.setVisibility(0);
                    cuVar.r0(true);
                    cuVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ex0
    public void b0() {
        ((jh0) this.b).a();
    }

    @Override // org.telegram.ui.Components.ft0
    public int b1() {
        xd xdVar = (xd) this.b;
        return xdVar.W0 + xdVar.X0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ dr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean d1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.c8
    public void dismiss() {
        ((c50) this.b).x.dismiss();
    }

    @Override // org.telegram.ui.ym0
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // ue.a
    public void e1(View view, float f10, float f11) {
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

    @Override // org.telegram.ui.Components.jj0
    public boolean f(float f10, float f11, int i7, View view) {
        zz zzVar = (zz) this.b;
        if (view instanceof org.telegram.ui.Cells.g7) {
            zz.a(zzVar, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            zz.a(zzVar, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            zz.a(zzVar, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h2) {
            zz.a(zzVar, ((org.telegram.ui.Cells.h2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.t2) {
            if (!zzVar.p0.g0()) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (t2Var.b0(f10)) {
                    zzVar.j0.D(t2Var);
                    return true;
                }
            }
            zz.a(zzVar, ((org.telegram.ui.Cells.t2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.br0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // org.telegram.ui.Components.pm0
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

    @Override // v4.d0
    public void h1(int i7, int i10) {
        ((v4.h0) this.b).n(i7, i10, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public void i() {
        ((zz) this.b).j0.finish();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.zk0
    public /* synthetic */ boolean j1(int i7, View view) {
        switch (this.a) {
            case 6:
                break;
            case 9:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void k() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(((ib) this.b).n.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // ue.a
    public boolean k0() {
        switch (this.a) {
            case 14:
                return true;
            default:
                return false;
        }
    }

    @Override // org.telegram.ui.Components.pm0
    public void l(boolean z10, float f10) {
        switch (this.a) {
            case 3:
                c4 c4Var = (c4) this.b;
                int round = Math.round(((c4Var.c - r2) * f10) + c4Var.b);
                if (round != org.telegram.messenger.gz.Z0) {
                    org.telegram.messenger.gz.Z0 = round;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putInt("iv_font_size", org.telegram.messenger.gz.Z0);
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
                v90 v90Var = (v90) this.b;
                x90 x90Var = v90Var.E;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != org.telegram.messenger.qc.c()) {
                    org.telegram.messenger.qc.g = c8.i9.b(round2, 0, 100);
                    org.telegram.messenger.qc.k();
                    org.telegram.messenger.qc.d(false);
                    x90Var.d0();
                    ArrayList arrayList2 = x90Var.s;
                    if (arrayList2.isEmpty()) {
                        x90Var.c0();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new s90(2, 0, org.telegram.messenger.qc.c() <= 0 ? org.telegram.messenger.hd.M0(2131748871, null) : org.telegram.messenger.qc.c() >= 100 ? org.telegram.messenger.hd.M0(2131748870, null) : org.telegram.messenger.hd.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.qc.c()))), 0, 0));
                        x90Var.d.g(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            v90Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                h5.o1 = f10;
                org.telegram.ui.Components.st0 st0Var = ((h5) this.b).m1;
                st0Var.K();
                st0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // ue.a
    public boolean l1() {
        switch (this.a) {
            case 14:
                return false;
            default:
                return true;
        }
    }

    @Override // v4.d0
    public void m0(int i7, int i10) {
        ((v4.h0) this.b).o(i7, i10);
    }

    @Override // org.telegram.ui.l71
    public void m1(boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        qc qcVar = (qc) this.b;
        e6Var = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
        if (e6Var instanceof pc) {
            e6Var2 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            qc qcVar2 = ((pc) e6Var2).a;
            qcVar2.K = !qcVar2.K;
            qcVar2.k1();
            qcVar2.g1(false);
        }
        qcVar.b1(a(), false);
        qcVar.g1(false);
    }

    @Override // ue.a
    public void n(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                le0 le0Var = (le0) this.b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.I, 450L);
                View view2 = le0Var.P;
                if (view2 != null) {
                    view2.performClick();
                }
                le0Var.P = null;
                le0Var.invalidate();
                le0Var.R.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.c10
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

    @Override // org.telegram.ui.Components.c10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.c10
    public void onLongPress(MotionEvent motionEvent) {
        ti tiVar = (ti) this.b;
        an anVar = tiVar.x;
        if (tiVar.a != null) {
            anVar.f9 = org.telegram.ui.Components.a9.b(anVar, tiVar.w, anVar.k6, anVar.b(), anVar.Aa);
            org.telegram.ui.ActionBar.g1 g1Var = anVar.f9;
            if (g1Var != null) {
                tiVar.b = g1Var;
                g1Var.setOnDismissListener(new d0(tiVar, 2));
                anVar.A0.C0();
                anVar.C0.R = false;
                View view = tiVar.w;
                anVar.Ub(view);
                anVar.x8(false, view != anVar.y1, 0.3f);
                anVar.G9(false);
                mk mkVar = anVar.O3;
                if (mkVar != null) {
                    mkVar.d(1, true);
                }
                UndoView undoView = anVar.N3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                qj qjVar = anVar.a0;
                if (qjVar == null || qjVar.getEditField() == null) {
                    return;
                }
                anVar.a0.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // org.telegram.ui.Components.c10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.c10
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

    @Override // org.telegram.ui.Components.pm0
    public int p0() {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.jj0
    public void q(float f10) {
        ((zz) this.b).j0.A(f10);
    }

    @Override // ue.a
    public /* synthetic */ void s(float f10, float f11) {
        int i7 = this.a;
    }

    @Override // ue.a
    public /* synthetic */ void s0() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ym0
    public void t0(int i7, boolean z10, boolean z11) {
        om0 om0Var = (om0) this.b;
        om0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        om0Var.a0(om0Var.b, om0Var.c, z11, i7);
    }

    @Override // ue.a
    public void v(View view, float f10, float f11) {
        switch (this.a) {
            case 14:
                break;
            default:
                le0 le0Var = (le0) this.b;
                le0.k(le0Var, view, f10, f11);
                le0.m(le0Var, f10, false, true);
                org.telegram.messenger.g0.i3(le0Var.I, 450L);
                le0Var.P = null;
                le0Var.invalidate();
                le0Var.R.a(false, true);
                break;
        }
    }

    @Override // org.telegram.ui.kl
    public void v0(String str) {
        ((an) ((di.f4) this.b).c).Ga(str, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    public void w1(pd0 pd0Var) {
        boolean z10;
        be0 be0Var = (be0) this.b;
        be0Var.O = true;
        ce0 ce0Var = be0Var.h0;
        ce0Var.K = 0;
        ce0Var.F1(0, false);
        int i7 = Build.VERSION.SDK_INT;
        if (org.telegram.messenger.g0.N1()) {
            boolean z11 = ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            boolean z12 = ce0Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
            boolean z13 = i7 < 28 || ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
            boolean z14 = i7 < 26 || ce0Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
            zd0 zd0Var = be0Var.a;
            if (zd0Var != null && "888".equals(zd0Var.getText())) {
                z11 = true;
                z12 = true;
                z13 = true;
                z14 = true;
            }
            if (ce0Var.w) {
                ce0Var.r.clear();
                if (!z11) {
                    ce0Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z12) {
                    ce0Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z13) {
                    ce0Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z14 && i7 >= 26) {
                    ce0Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!ce0Var.r.isEmpty()) {
                    SharedPreferences e12 = org.telegram.messenger.np.e1();
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
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, "Continue"), null);
                    int i10 = R.raw.calls_log;
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    if (!z11 && (!z12 || !z13)) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754274, "AllowReadCallAndLog");
                    } else if (z12 && z13) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754275, "AllowReadCall");
                        i10 = R.raw.incoming_calls;
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131754273, "AllowReadCallLog");
                    }
                    int i11 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.x0(null, i11, false), null);
                    alertDialog$Builder.n(i11, null);
                    ce0Var.h = ce0Var.showDialog(t1Var);
                    be0Var.O = true;
                    return;
                }
            }
            z10 = true;
        } else {
            z10 = true;
        }
        ae0 ae0Var = new ae0(0, this, pd0Var);
        pd0Var.h.f(z10, z10);
        org.telegram.messenger.g0.i3(ae0Var, 400L);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Components.fo0
    public void x0() {
        if (org.telegram.messenger.g0.H3()) {
            ((c40) this.b).n1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.ym0
    public void y() {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    public void y1(Exception exc) {
        kl0 kl0Var = (kl0) this.b;
        if (kl0Var.R0) {
            return;
        }
        kl0Var.N0(true, false);
        kl0Var.J0(false);
        if ((exc instanceof tc.a) || (exc instanceof tc.b)) {
            org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131747404, null), kl0Var);
        } else {
            org.telegram.ui.Components.t4.t0(exc.getMessage(), kl0Var);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.messenger.gj messageObject;
        lb lbVar = (lb) this.b;
        if ((view instanceof org.telegram.ui.Cells.t0) && (messageObject = ((org.telegram.ui.Cells.t0) view).getMessageObject()) != null) {
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
    public /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.br0
    public /* synthetic */ void I(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(org.telegram.messenger.dj djVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.kl
    public /* synthetic */ void P0(int i7) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.ex0
    public void d(qh0 qh0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Components.fo0
    public /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.ym0
    public /* synthetic */ void d0() {
    }

    @Override // org.telegram.ui.Components.c8
    public /* synthetic */ void g1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t() {
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
    public /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.kl
    public /* synthetic */ void Y(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
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
    public /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
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
    public /* synthetic */ void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
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
    public /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
