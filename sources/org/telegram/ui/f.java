package org.telegram.ui;

import android.content.SharedPreferences;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f implements x9, av0, org.telegram.ui.web.z0, org.telegram.ui.Components.lp0, org.telegram.ui.Components.e5, org.telegram.ui.Components.tn0, di.u9, org.telegram.ui.Components.bm0, org.telegram.ui.Cells.j1, mc1, org.telegram.ui.Components.jw0, im, pe.a, org.telegram.ui.Components.dm0, org.telegram.ui.Cells.u7, org.telegram.ui.Components.xq, org.telegram.ui.Components.cr0, s4.e0, org.telegram.ui.Components.q8, org.telegram.ui.Components.t20, r0.n, pt, i11 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.e0
    public void A(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Components.jw0
    public void B(boolean z10) {
        Runnable runnable = ((ke) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.av0
    public void B0(MessageObject messageObject) {
        m3 m3Var = ((j4) this.b).u0[0];
        if (m3Var != null) {
            m3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ev0 E1() {
        return null;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ag.r0(this, i10, 19), 50L);
    }

    @Override // di.u9
    public void G0(long j10, int i10, di.s3 s3Var) {
        n8 n8Var = (n8) this.b;
        if (n8Var.b == null) {
            s3Var.run();
        }
        n8Var.b.post(s3Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean G1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public void H(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        org.telegram.ui.Components.voip.k1 k1Var = gVar.x;
        LaunchActivity launchActivity = (LaunchActivity) k1Var.c;
        g gVar2 = (g) k1Var.b;
        Pattern pattern = LaunchActivity.D1;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(launchActivity, 3, null);
        e2Var.i0 = false;
        e2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new l10(5, e2Var, gVar2));
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ String H0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M() {
        return false;
    }

    @Override // org.telegram.ui.Components.xq
    public /* synthetic */ int M0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // s4.e0
    public void N0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        pi0 pi0Var = (pi0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        pi0Var.d = defaultWindowInsets;
        pi0Var.F.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        pi0Var.E.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int S() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override // org.telegram.ui.Components.q8
    public void T0(int i10, int i11) {
        z60 z60Var = (z60) this.b;
        z60Var.W = i10;
        AndroidUtilities.updateVisibleRows(z60Var.b);
    }

    @Override // org.telegram.ui.Components.lp0
    public void U(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                e4 e4Var = (e4) this.b;
                int round = Math.round(((e4Var.c - r2) * f7) + e4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    e4Var.f.u0[0].getAdapter().y.clear();
                    j4 j4Var = e4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        j4Var.u0[i10].c.l();
                        h4 h4Var = j4Var.u0[i10].c;
                        ArrayList arrayList = h4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(h4Var.K);
                        Utilities.globalQueue.postRunnable(h4Var.K, 100L);
                    }
                    e4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                ub0 ub0Var = (ub0) this.b;
                wb0 wb0Var = ub0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    wb0Var.Z();
                    ArrayList arrayList2 = wb0Var.s;
                    if (arrayList2.isEmpty()) {
                        wb0Var.Y();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new qb0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        wb0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ub0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                l5.d = f7;
                org.telegram.ui.Components.ww0 ww0Var = ((l5) this.b).b;
                ww0Var.L();
                ww0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ jh.a V() {
        return null;
    }

    @Override // org.telegram.ui.Components.jw0
    public float V0() {
        return org.telegram.messenger.t.c(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((ke) this.b).U0, 0);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.mc1
    public boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X1(int i10) {
        return false;
    }

    @Override // org.telegram.ui.i11
    public void Y() {
        ((hk0) this.b).a();
    }

    @Override // org.telegram.ui.pt
    public void Y0(lt ltVar) {
        qj0 qj0Var = (qj0) this.b;
        qj0Var.y = true;
        String str = ltVar.c;
        qj0Var.N.setText(str);
        qj0Var.v(str, ltVar);
        qj0Var.y = false;
        AndroidUtilities.runOnUIThread(new nj0(this, 0), 300L);
        qj0Var.P.requestFocus();
        oj0 oj0Var = qj0Var.P;
        oj0Var.setSelection(oj0Var.length());
    }

    @Override // org.telegram.ui.mc1
    public boolean a() {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        bd bdVar = (bd) this.b;
        u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        if (u6Var == null) {
            return org.telegram.ui.ActionBar.y6.I.q();
        }
        u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        return u6Var2.a();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.t20
    public void a1() {
        kj kjVar = (kj) this.b;
        View view = kjVar.a;
        if (view != null) {
            view.setPressed(false);
            kjVar.a.setSelected(false);
        }
        View view2 = kjVar.n;
        if (view2 == null || kjVar.d) {
            return;
        }
        view2.callOnClick();
        kjVar.d = true;
    }

    @Override // org.telegram.ui.Components.jw0
    public int b1() {
        ke keVar = (ke) this.b;
        return keVar.V0 + keVar.W0;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ org.telegram.ui.Cells.t9 b2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.q8
    public void dismiss() {
        ((z60) this.b).w.d(true);
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean e(float f7, float f10, int i10, View view) {
        j10 j10Var = (j10) this.b;
        if (view instanceof org.telegram.ui.Cells.o7) {
            j10.a(j10Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.r7) {
            j10.a(j10Var, ((org.telegram.ui.Cells.r7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            j10.a(j10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.d2) {
            j10.a(j10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.p2) {
            if (!j10Var.o0.g()) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (p2Var.R(f7)) {
                    j10Var.i0.d(p2Var);
                    return true;
                }
            }
            j10.a(j10Var, ((org.telegram.ui.Cells.p2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.tn0
    public void f(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                x5 x5Var = ((r5) this.b).d;
                x5Var.d0 = i10;
                x5Var.F0(true);
                break;
            case 10:
                dc dcVar = ((bc) this.b).f;
                dcVar.y = i10;
                dcVar.d(true);
                break;
            default:
                bv bvVar = (bv) this.b;
                if (bvVar.f[0].f != i10) {
                    bvVar.w = i10 == bvVar.e.getFirstTabId();
                    av avVar = bvVar.f[1];
                    avVar.f = i10;
                    avVar.setVisibility(0);
                    bvVar.n0(true);
                    bvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.av0
    public /* synthetic */ TextureView f0() {
        return null;
    }

    @Override // pe.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public void g() {
        ((j10) this.b).i0.finish();
    }

    @Override // s4.e0
    public void g1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Components.lp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                e4 e4Var = (e4) this.b;
                return String.valueOf(Math.round((e4Var.a.getProgress() * (e4Var.c - r1)) + e4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // pe.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h0(org.telegram.ui.Components.c6 c6Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.tn0
    public /* synthetic */ boolean h1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 10:
                break;
        }
        return false;
    }

    @Override // s4.e0
    public void i0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // di.u9
    public boolean i1(long j10, int i10, int i11, int i12, di.v9 v9Var) {
        n8 n8Var = (n8) this.b;
        if (n8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= n8Var.b.getChildCount()) {
                    break;
                }
                View childAt = n8Var.b.getChildAt(i13);
                if (childAt instanceof k8) {
                    k8 k8Var = (k8) childAt;
                    if (k8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < k8Var.n.size(); i14++) {
                            ArrayList arrayList = ((l8) k8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = k8Var.n.keyAt(i14);
                                n8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) k8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    v9Var.c = imageReceiver;
                                    if (n8Var.i0 == null) {
                                        n8Var.i0 = new y0(this, 11);
                                    }
                                    v9Var.e = n8Var.i0;
                                    v9Var.a = k8Var;
                                    v9Var.g = n8Var.fragmentView;
                                    v9Var.h = AndroidUtilities.dp(36.0f);
                                    v9Var.i = n8Var.fragmentView.getBottom();
                                    v9Var.b = null;
                                    return true;
                                }
                            }
                        }
                    }
                }
                i13++;
            }
        }
        return false;
    }

    @Override // pe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void j() {
        wb wbVar = ((sb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            qf.d.r(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.mc1
    public void j1(boolean z10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        bd bdVar = (bd) this.b;
        u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
        if (u6Var instanceof ad) {
            u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) u6Var2).a;
            bdVar2.J = !bdVar2.J;
            bdVar2.g1();
            bdVar2.c1(false);
        }
        bdVar.X0(a(), false);
        bdVar.c1(false);
    }

    @Override // org.telegram.ui.Components.xq
    public /* synthetic */ void k(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.lp0
    public int k0() {
        switch (this.a) {
            case 3:
                e4 e4Var = (e4) this.b;
                return e4Var.c - e4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k1() {
        return false;
    }

    @Override // pe.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // pe.a
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return ((wx) this.b).t0.isInPreviewMode();
            default:
                tg0 tg0Var = (tg0) this.b;
                View view2 = null;
                tg0Var.O = null;
                int childCount = tg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = tg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || tg0Var.P.contains(view2)) ? false : true;
        }
    }

    @Override // pe.a
    public boolean needLongPress(float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.dm0
    public void o(float f7) {
        ((j10) this.b).i0.a(f7);
    }

    @Override // pe.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        switch (this.a) {
            case 15:
                j5Var = ((org.telegram.ui.ActionBar.r2) ((wx) this.b).t0).parentLayout;
                ((ActionBarLayout) j5Var).r();
                break;
        }
    }

    @Override // pe.a
    public /* synthetic */ void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // pe.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // pe.a
    public /* synthetic */ void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onDown(MotionEvent motionEvent) {
        kj kjVar = (kj) this.b;
        View view = kjVar.a;
        if (view != null) {
            view.setPressed(true);
            kjVar.a.setSelected(true);
            kjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.t20
    public void onLongPress(MotionEvent motionEvent) {
        kj kjVar = (kj) this.b;
        wn wnVar = kjVar.w;
        if (kjVar.a != null) {
            wnVar.g9 = org.telegram.ui.Components.q9.b(wnVar, kjVar.v, wnVar.j6, wnVar.b(), wnVar.ua);
            org.telegram.ui.ActionBar.o1 o1Var = wnVar.g9;
            if (o1Var != null) {
                kjVar.b = o1Var;
                o1Var.setOnDismissListener(new e0(kjVar, 2));
                wnVar.x0.C0();
                wnVar.z0.R = false;
                View view = kjVar.v;
                wnVar.Db(view);
                wnVar.p8(false, view != wnVar.v1, 0.3f);
                wnVar.u9(false);
                fl flVar = wnVar.L3;
                if (flVar != null) {
                    flVar.d(1, true);
                }
                UndoView undoView = wnVar.K3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                jk jkVar = wnVar.Y;
                if (jkVar == null || jkVar.getEditField() == null) {
                    return;
                }
                wnVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // pe.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                tg0 tg0Var = (tg0) this.b;
                tg0.k(tg0Var, view, f7, f10);
                tg0.m(tg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(tg0Var.H, 450L);
                tg0Var.O = null;
                tg0Var.invalidate();
                tg0Var.Q.a(false, true);
                break;
        }
    }

    @Override // pe.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                tg0 tg0Var = (tg0) this.b;
                tg0.k(tg0Var, view, f7, f10);
                tg0.m(tg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(tg0Var.H, 450L);
                View view2 = tg0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                tg0Var.O = null;
                tg0Var.invalidate();
                tg0Var.Q.a(false, true);
                break;
        }
    }

    @Override // pe.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                tg0 tg0Var = (tg0) this.b;
                tg0.k(tg0Var, view, f7, f10);
                tg0.m(tg0Var, f7, false, false);
                tg0Var.invalidate();
                break;
        }
    }

    @Override // pe.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                tg0 tg0Var = (tg0) this.b;
                tg0.k(tg0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(tg0Var.H);
                tg0Var.setSkipDrawSelector(true);
                tg0.m(tg0Var, f7, true, false);
                tg0Var.invalidate();
                tg0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        kj kjVar = (kj) this.b;
        if (kjVar.e || (view = kjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        kjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.im
    public void p0(String str) {
        ((fk) this.b).b.qa(str, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String u(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Components.cr0
    public void v0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((x50) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.xq
    public /* synthetic */ void w() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.xq
    public void x0(int i10, int i11, boolean z10) {
        ug.o oVar;
        switch (this.a) {
            case 18:
                ug.o oVar2 = ((x10) this.b).c.c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (oVar = ((x10) this.b).c.c) != null) {
                    oVar.H = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.lp0
    public void y() {
        switch (this.a) {
            case 5:
                ((l5) this.b).b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.tn0
    public void z() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.tn0
    public void z0(float f7) {
        switch (this.a) {
            case 6:
            case 10:
                break;
            default:
                bv bvVar = (bv) this.b;
                if (f7 != 1.0f || bvVar.f[1].getVisibility() == 0) {
                    if (bvVar.r) {
                        bvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        bvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * bvVar.f[0].getMeasuredWidth()));
                    } else {
                        bvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        bvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - bvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        av[] avVarArr = bvVar.f;
                        av avVar = avVarArr[0];
                        avVarArr[0] = avVarArr[1];
                        avVarArr[1] = avVar;
                        avVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (wbVar.p0.contains(Long.valueOf(j10))) {
                    wbVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                wbVar.X0(true);
                wbVar.S0();
                wbVar.E.l();
                return;
            }
        }
        wbVar.Q0(view, f7, f10);
    }

    private final void d2() {
    }

    private final void e2() {
    }

    private final /* synthetic */ void f2() {
    }

    private final void g2() {
    }

    private final void h2() {
    }

    private final /* synthetic */ void o1() {
    }

    private final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.cr0
    public /* synthetic */ void R() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Components.q8
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1() {
    }

    private final void Y1(float f7) {
    }

    private final void c2(float f7) {
    }

    private final /* synthetic */ void i2(boolean z10) {
    }

    private final /* synthetic */ void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.av0
    public /* synthetic */ void E(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.im
    public /* synthetic */ void Q0(int i10) {
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void R0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(int i10) {
    }

    @Override // di.u9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.i11
    public void t(qk0 qk0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.im
    public /* synthetic */ void T(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void D1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void F1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void J1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void L1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void N1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void O1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void P1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void S1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void T1(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void U1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
