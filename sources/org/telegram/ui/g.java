package org.telegram.ui;

import android.content.SharedPreferences;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class g implements x9, tu0, org.telegram.ui.web.z0, org.telegram.ui.Components.bp0, org.telegram.ui.Components.e5, org.telegram.ui.Components.jn0, l7, ci.w9, org.telegram.ui.Components.xl0, org.telegram.ui.Cells.l1, dc1, gm, oe.a, org.telegram.ui.Components.zl0, org.telegram.ui.Cells.q7, org.telegram.ui.Components.vq, org.telegram.ui.Components.sq0, s4.d0, org.telegram.ui.Components.o8, org.telegram.ui.Components.r20, r0.n, pt, a11 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        oi0 oi0Var = (oi0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        oi0Var.e = defaultWindowInsets;
        oi0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        oi0Var.F.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ah.g(this, i10, 19), 50L);
    }

    @Override // org.telegram.ui.x9
    public void E(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        ov ovVar = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) ovVar.b;
        h hVar2 = (h) ovVar.c;
        Pattern pattern = LaunchActivity.C1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new z40(4, b2Var, hVar2));
    }

    @Override // org.telegram.ui.Cells.l1
    public void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.o8
    public void H0(int i10, int i11) {
        u60 u60Var = (u60) this.b;
        u60Var.W = i10;
        AndroidUtilities.updateVisibleRows(u60Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.dc1
    public boolean I0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                g4 g4Var = (g4) this.b;
                int round = Math.round(((g4Var.c - r2) * f7) + g4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    g4Var.f.u0[0].getAdapter().y.clear();
                    l4 l4Var = g4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        l4Var.u0[i10].c.l();
                        j4 j4Var = l4Var.u0[i10].c;
                        ArrayList arrayList = j4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(j4Var.K);
                        Utilities.globalQueue.postRunnable(j4Var.K, 100L);
                    }
                    g4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                qb0 qb0Var = (qb0) this.b;
                sb0 sb0Var = qb0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    sb0Var.Y();
                    ArrayList arrayList2 = sb0Var.s;
                    if (arrayList2.isEmpty()) {
                        sb0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new mb0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        sb0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            qb0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                n5.d = f7;
                org.telegram.ui.Components.jw0 jw0Var = ((n5) this.b).b;
                jw0Var.M();
                jw0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.pt
    public void L0(kt ktVar) {
        oj0 oj0Var = (oj0) this.b;
        oj0Var.E = true;
        String str = ktVar.c;
        oj0Var.O.setText(str);
        oj0Var.w(str, ktVar);
        oj0Var.E = false;
        AndroidUtilities.runOnUIThread(new fz(this, 29), 300L);
        oj0Var.Q.requestFocus();
        mj0 mj0Var = oj0Var.Q;
        mj0Var.setSelection(mj0Var.length());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void N0() {
        ij ijVar = (ij) this.b;
        View view = ijVar.a;
        if (view != null) {
            view.setPressed(false);
            ijVar.a.setSelected(false);
        }
        View view2 = ijVar.n;
        if (view2 == null || ijVar.d) {
            return;
        }
        view2.callOnClick();
        ijVar.d = true;
    }

    @Override // org.telegram.ui.a11
    public void O() {
        ((wj0) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ xu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // ci.w9
    public boolean Q0(long j10, int i10, int i11, int i12, ci.x9 x9Var) {
        k8 k8Var = (k8) this.b;
        if (k8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= k8Var.b.getChildCount()) {
                    break;
                }
                View childAt = k8Var.b.getChildAt(i13);
                if (childAt instanceof h8) {
                    h8 h8Var = (h8) childAt;
                    if (h8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < h8Var.n.size(); i14++) {
                            ArrayList arrayList = ((i8) h8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = h8Var.n.keyAt(i14);
                                k8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) h8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    x9Var.c = imageReceiver;
                                    if (k8Var.i0 == null) {
                                        k8Var.i0 = new b1(this, 10);
                                    }
                                    x9Var.e = k8Var.i0;
                                    x9Var.a = h8Var;
                                    x9Var.g = k8Var.fragmentView;
                                    x9Var.h = AndroidUtilities.dp(36.0f);
                                    x9Var.i = k8Var.fragmentView.getBottom();
                                    x9Var.b = null;
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.tu0
    public /* synthetic */ TextureView U() {
        return null;
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a W() {
        return null;
    }

    @Override // org.telegram.ui.l7
    public void W0() {
        c7 c7Var = ((a7) this.b).e;
        bi.c cVar = c7Var.Y;
        if (cVar == null || cVar.j.size() <= 0) {
            return;
        }
        c7Var.Y.d();
        z6 z6Var = c7Var.N;
        if (z6Var != null) {
            z6Var.e(false);
            c7Var.N.d();
        }
    }

    @Override // s4.d0
    public void X(int i10, int i11) {
        ((s4.g0) this.b).s(i10, i11);
    }

    @Override // ci.w9
    public void X0(long j10, int i10, ci.t3 t3Var) {
        k8 k8Var = (k8) this.b;
        if (k8Var.b == null) {
            t3Var.run();
        }
        k8Var.b.post(t3Var);
    }

    @Override // org.telegram.ui.Components.bp0
    public int Y() {
        switch (this.a) {
            case 3:
                g4 g4Var = (g4) this.b;
                return g4Var.c - g4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.dc1
    public boolean a() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        dd ddVar = (dd) this.b;
        d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        if (d6Var == null) {
            return org.telegram.ui.ActionBar.h6.I.q();
        }
        d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        return d6Var2.a();
    }

    @Override // s4.d0
    public void a1(int i10, int i11) {
        ((s4.g0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.gm
    public void b0(String str) {
        ((dk) this.b).b.ia(str, false);
    }

    @Override // org.telegram.ui.Components.jn0
    public /* synthetic */ boolean b1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.dc1
    public void c1(boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        dd ddVar = (dd) this.b;
        d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
        if (d6Var instanceof cd) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            dd ddVar2 = ((cd) d6Var2).a;
            ddVar2.J = !ddVar2.J;
            ddVar2.d1();
            ddVar2.Z0(false);
        }
        ddVar.U0(a(), false);
        ddVar.Z0(false);
    }

    @Override // org.telegram.ui.l7
    public void clear() {
        ((a7) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean d(float f7, float f10, int i10, View view) {
        g10 g10Var = (g10) this.b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            g10.a(g10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.m7) {
            g10.a(g10Var, ((org.telegram.ui.Cells.m7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            g10.a(g10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f2) {
            g10.a(g10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            if (!g10Var.o0.g()) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (r2Var.S(f7)) {
                    g10Var.i0.f(r2Var);
                    return true;
                }
            }
            g10.a(g10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.t0.a(messageObject);
    }

    @Override // org.telegram.ui.l7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((u60) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.jn0
    public void f(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                z5 z5Var = ((t5) this.b).d;
                z5Var.b0 = i10;
                z5Var.H0(true);
                break;
            case 11:
                ec ecVar = ((cc) this.b).f;
                ecVar.y = i10;
                ecVar.d(true);
                break;
            default:
                bv bvVar = (bv) this.b;
                if (bvVar.f[0].f != i10) {
                    bvVar.w = i10 == bvVar.e.getFirstTabId();
                    av avVar = bvVar.f[1];
                    avVar.f = i10;
                    avVar.setVisibility(0);
                    bvVar.m0(true);
                    bvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // oe.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.sq0
    public void g0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((s50) this.b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                g4 g4Var = (g4) this.b;
                return String.valueOf(Math.round((g4Var.a.getProgress() * (g4Var.c - r1)) + g4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // oe.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public void h() {
        ((g10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // oe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void j() {
        xb xbVar = ((tb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            pf.d.r(xbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(xbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Components.vq
    public void j0(int i10, int i11, boolean z10) {
        tg.o oVar;
        switch (this.a) {
            case 18:
                tg.o oVar2 = ((t10) this.b).c.c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (oVar = ((t10) this.b).c.c) != null) {
                    oVar.H = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.vq
    public /* synthetic */ void k(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.jn0
    public void k0(float f7) {
        switch (this.a) {
            case 6:
            case 11:
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

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.tu0
    public void m0(MessageObject messageObject) {
        o3 o3Var = ((l4) this.b).u0[0];
        if (o3Var != null) {
            o3Var.b.I0(true);
        }
    }

    @Override // oe.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // oe.a
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return ((wx) this.b).E0.isInPreviewMode();
            default:
                rg0 rg0Var = (rg0) this.b;
                View view2 = null;
                rg0Var.O = null;
                int childCount = rg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = rg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || rg0Var.P.contains(view2)) ? false : true;
        }
    }

    @Override // oe.a
    public boolean needLongPress(float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public void o(float f7) {
        ((g10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.a6 a6Var) {
        return false;
    }

    @Override // oe.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((wx) this.b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                break;
        }
    }

    @Override // oe.a
    public /* synthetic */ void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // oe.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // oe.a
    public /* synthetic */ void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onDown(MotionEvent motionEvent) {
        ij ijVar = (ij) this.b;
        View view = ijVar.a;
        if (view != null) {
            view.setPressed(true);
            ijVar.a.setSelected(true);
            ijVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void onLongPress(MotionEvent motionEvent) {
        ij ijVar = (ij) this.b;
        sn snVar = ijVar.w;
        if (ijVar.a != null) {
            snVar.Q8 = org.telegram.ui.Components.o9.b(snVar, ijVar.v, snVar.T5, snVar.d(), snVar.ea);
            org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
            if (m1Var != null) {
                ijVar.b = m1Var;
                m1Var.setOnDismissListener(new f0(ijVar, 2));
                snVar.x0.B0();
                snVar.z0.R = false;
                View view = ijVar.v;
                snVar.sb(view);
                snVar.j8(false, view != snVar.j1, 0.3f);
                snVar.m9(false);
                dl dlVar = snVar.z3;
                if (dlVar != null) {
                    dlVar.e(1, true);
                }
                UndoView undoView = snVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                hk hkVar = snVar.Y;
                if (hkVar == null || hkVar.getEditField() == null) {
                    return;
                }
                snVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // oe.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                rg0 rg0Var = (rg0) this.b;
                rg0.k(rg0Var, view, f7, f10);
                rg0.m(rg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(rg0Var.H, 450L);
                rg0Var.O = null;
                rg0Var.invalidate();
                rg0Var.Q.a(false, true);
                break;
        }
    }

    @Override // oe.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                rg0 rg0Var = (rg0) this.b;
                rg0.k(rg0Var, view, f7, f10);
                rg0.m(rg0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(rg0Var.H, 450L);
                View view2 = rg0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                rg0Var.O = null;
                rg0Var.invalidate();
                rg0Var.Q.a(false, true);
                break;
        }
    }

    @Override // oe.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                rg0 rg0Var = (rg0) this.b;
                rg0.k(rg0Var, view, f7, f10);
                rg0.m(rg0Var, f7, false, false);
                rg0Var.invalidate();
                break;
        }
    }

    @Override // oe.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                rg0 rg0Var = (rg0) this.b;
                rg0.k(rg0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(rg0Var.H);
                rg0Var.setSkipDrawSelector(true);
                rg0.m(rg0Var, f7, true, false);
                rg0Var.invalidate();
                rg0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        ij ijVar = (ij) this.b;
        if (ijVar.e || (view = ijVar.a) == null) {
            return false;
        }
        view.callOnClick();
        ijVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ String p0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.o9 p2() {
        return null;
    }

    @Override // org.telegram.ui.Components.vq
    public /* synthetic */ int r0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.l7
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        HashSet hashSet;
        c7 c7Var = ((a7) this.b).e;
        if (v6Var == null) {
            if (bVar != null) {
                c7Var.Y.i(bVar);
                c7Var.N.d();
                c7.g0(c7Var);
                return;
            }
            return;
        }
        if (c7Var.Y.j.size() > 0 || z10) {
            bi.c cVar = c7Var.Y;
            HashSet hashSet2 = cVar.j;
            HashSet hashSet3 = cVar.l;
            long j10 = v6Var.a;
            SparseArray sparseArray = v6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((w6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        bi.b bVar2 = (bi.b) obj;
                        if (hashSet2.remove(bVar2)) {
                            cVar.k -= bVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((w6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        bi.b bVar3 = (bi.b) obj2;
                        if (hashSet2.add(bVar3)) {
                            cVar.k += bVar3.c;
                        }
                    }
                }
            }
            cVar.c();
            c7Var.N.d();
            c7.g0(c7Var);
            return;
        }
        if (c7Var.H <= 0 || c7Var.getParentActivity() == null) {
            return;
        }
        v6Var.getClass();
        boolean z11 = true;
        bi.c cVar2 = new bi.c(true);
        SparseArray sparseArray2 = v6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = cVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((w6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((w6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = cVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((w6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = cVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((w6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = cVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((w6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = cVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((bi.b) arrayList3.get(i14));
            if (((bi.b) arrayList3.get(i14)).d == 0) {
                cVar2.r += ((bi.b) arrayList3.get(i14)).c;
            } else {
                cVar2.s += ((bi.b) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((bi.b) arrayList4.get(i15));
            cVar2.t += ((bi.b) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((bi.b) arrayList5.get(i16));
            cVar2.u += ((bi.b) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((bi.b) arrayList6.get(i17));
            cVar2.v += ((bi.b) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        cVar2.m = z11;
        cVar2.n = z11;
        cVar2.o = z11;
        cVar2.p = z11;
        cVar2.q = z11;
        Collections.sort(arrayList3, new a4.d(6));
        Collections.sort(arrayList4, new a4.d(6));
        Collections.sort(arrayList5, new a4.d(6));
        Collections.sort(arrayList6, new a4.d(6));
        Collections.sort(cVar2.h, new a4.d(6));
        xu xuVar = new xu(c7Var, v6Var, cVar2, new n2.e(c7Var, v6Var, false, 6));
        c7Var.T = xuVar;
        c7Var.showDialog(xuVar);
    }

    @Override // s4.d0
    public void t0(int i10, int i11) {
        ((s4.g0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Components.vq
    public /* synthetic */ void u() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.bp0
    public void v() {
        switch (this.a) {
            case 5:
                ((n5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.jn0
    public void x() {
        int i10 = this.a;
    }

    @Override // s4.d0
    public void y(int i10, int i11) {
        ((s4.g0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        xb xbVar = (xb) this.b;
        if ((view instanceof org.telegram.ui.Cells.x0) && (messageObject = ((org.telegram.ui.Cells.x0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (xbVar.p0.contains(Long.valueOf(j10))) {
                    xbVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    xbVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                xbVar.W0(true);
                xbVar.R0();
                xbVar.E.l();
                return;
            }
        }
        xbVar.P0(view, f7, f10);
    }

    private final void C1(float f7) {
    }

    private final void E1() {
    }

    private final void T1() {
    }

    private final /* synthetic */ void V1() {
    }

    private final void X1() {
    }

    private final void Y1() {
    }

    private final /* synthetic */ void Z1(boolean z10) {
    }

    private final /* synthetic */ void a2(boolean z10) {
    }

    private final /* synthetic */ void e1() {
    }

    private final /* synthetic */ void g1() {
    }

    private final /* synthetic */ void i1() {
    }

    private final void y1(float f7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.gm
    public /* synthetic */ void D0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.sq0
    public /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.o8
    public /* synthetic */ void Y0() {
    }

    @Override // ci.w9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.a11
    public void r(gk0 gk0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.tu0
    public /* synthetic */ void z(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.gm
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    private final void j1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void l1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void m1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void n1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void o1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void q1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void r1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void s1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void t1(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void u1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
