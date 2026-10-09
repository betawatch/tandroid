package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g implements u9, mv0, org.telegram.ui.web.a1, org.telegram.ui.Components.jp0, org.telegram.ui.Components.f5, org.telegram.ui.Components.rn0, h7, ai.gc, org.telegram.ui.Components.fm0, org.telegram.ui.Cells.l1, od1, nm, ne.a, org.telegram.ui.Components.hm0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.br, org.telegram.ui.Components.br0, s4.f0, org.telegram.ui.Components.p8, org.telegram.ui.Components.z20, r0.n, yt, u11, org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.br
    public /* synthetic */ int B0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.rn0
    public void C() {
        int i10 = this.a;
    }

    @Override // s4.f0
    public void D(int i10, int i11) {
        ((s4.i0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean D0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.p9 E2() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.i6.T0(str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1() {
        return false;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.p8(this, i10, 16), 50L);
    }

    @Override // org.telegram.ui.u9
    public void K(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        rw rwVar = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) rwVar.b;
        h hVar2 = (h) rwVar.c;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new oo(27, b2Var, hVar2));
    }

    @Override // s4.f0
    public void K0(int i10, int i11) {
        ((s4.i0) this.b).t(i10, i11);
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        dj0 dj0Var = (dj0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        dj0Var.e = defaultWindowInsets;
        dj0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        dj0Var.F.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.p8
    public void Q0(int i10, int i11) {
        j70 j70Var = (j70) this.b;
        j70Var.W = i10;
        AndroidUtilities.updateVisibleRows(j70Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.od1
    public boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.yt
    public void U0(ut utVar) {
        dk0 dk0Var = (dk0) this.b;
        dk0Var.E = true;
        String str = utVar.c;
        dk0Var.O.setText(str);
        dk0Var.w(str, utVar);
        dk0Var.E = false;
        AndroidUtilities.runOnUIThread(new uz(this, 29), 300L);
        dk0Var.Q.requestFocus();
        bk0 bk0Var = dk0Var.Q;
        bk0Var.setSelection(bk0Var.length());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle U1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Components.z20
    public void W0() {
        pj pjVar = (pj) this.b;
        View view = pjVar.a;
        if (view != null) {
            view.setPressed(false);
            pjVar.a.setSelected(false);
        }
        View view2 = pjVar.n;
        if (view2 == null || pjVar.d) {
            return;
        }
        view2.callOnClick();
        pjVar.d = true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.jp0
    public void X(float f7, boolean z10) {
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
                    i4 i4Var = e4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        i4Var.u0[i10].c.l();
                        g4 g4Var = i4Var.u0[i10].c;
                        ArrayList arrayList = g4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(g4Var.K);
                        Utilities.globalQueue.postRunnable(g4Var.K, 100L);
                    }
                    e4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                kc0 kc0Var = (kc0) this.b;
                mc0 mc0Var = kc0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    mc0Var.Y();
                    ArrayList arrayList2 = mc0Var.s;
                    if (arrayList2.isEmpty()) {
                        mc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new gc0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        mc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            kc0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                i5.d = f7;
                org.telegram.ui.Components.sw0 sw0Var = ((i5) this.b).b;
                sw0Var.M();
                sw0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // ai.gc
    public void Z(long j3, int i10, ai.e5 e5Var) {
        g8 g8Var = (g8) this.b;
        if (g8Var.b == null) {
            e5Var.run();
        }
        g8Var.b.post(e5Var);
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.od1
    public boolean a() {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.a) {
            case 12:
                bd bdVar = (bd) this.b;
                e6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                if (e6Var == null) {
                    return org.telegram.ui.ActionBar.i6.I.q();
                }
                e6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                return e6Var2.a();
            default:
                return ((aq0) this.b).S;
        }
    }

    @Override // org.telegram.ui.u11
    public void a0() {
        ((lk0) this.b).a();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int a1(int i10) {
        return x0(i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.hm0
    public boolean c(float f7, float f10, int i10, View view) {
        w10 w10Var = (w10) this.b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            w10.a(w10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f2) {
            w10.a(w10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.s2) {
            if (!w10Var.o0.g()) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (s2Var.S(f7)) {
                    w10Var.i0.f(s2Var);
                    return true;
                }
            }
            w10.a(w10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int c0(int i10) {
        return x0(i10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.h7
    public void clear() {
        ((w6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.rn0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((o5) this.b).d;
                v5Var.b0 = i10;
                v5Var.H0(true);
                break;
            case 11:
                cc ccVar = ((ac) this.b).f;
                ccVar.y = i10;
                ccVar.d(true);
                break;
            default:
                mv mvVar = (mv) this.b;
                if (mvVar.f[0].f != i10) {
                    mvVar.w = i10 == mvVar.e.getFirstTabId();
                    lv lvVar = mvVar.f[1];
                    lvVar.f = i10;
                    lvVar.setVisibility(0);
                    mvVar.m0(true);
                    mvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.mv0
    public /* synthetic */ TextureView d0() {
        return null;
    }

    @Override // org.telegram.ui.h7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((j70) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // ai.gc
    public boolean e1(long j3, int i10, int i11, int i12, ai.hc hcVar) {
        g8 g8Var = (g8) this.b;
        if (g8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= g8Var.b.getChildCount()) {
                    break;
                }
                View childAt = g8Var.b.getChildAt(i13);
                if (childAt instanceof d8) {
                    d8 d8Var = (d8) childAt;
                    if (d8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < d8Var.n.size(); i14++) {
                            ArrayList arrayList = ((e8) d8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = d8Var.n.keyAt(i14);
                                g8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) d8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    hcVar.c = imageReceiver;
                                    if (g8Var.i0 == null) {
                                        g8Var.i0 = new z0(this, 10);
                                    }
                                    hcVar.e = g8Var.i0;
                                    hcVar.a = d8Var;
                                    hcVar.g = g8Var.fragmentView;
                                    hcVar.h = AndroidUtilities.dp(36.0f);
                                    hcVar.i = g8Var.fragmentView.getBottom();
                                    hcVar.b = null;
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
    public /* synthetic */ qv0 e2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // s4.f0
    public void f0(int i10, int i11) {
        ((s4.i0) this.b).s(i10, i11);
    }

    @Override // ne.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.h7
    public void g1() {
        y6 y6Var = ((w6) this.b).e;
        zh.b bVar = y6Var.Y;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        y6Var.Y.d();
        v6 v6Var = y6Var.N;
        if (v6Var != null) {
            v6Var.e(false);
            y6Var.N.d();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.jp0
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

    @Override // org.telegram.ui.ActionBar.e6
    public Drawable getDrawable(String str) {
        aq0 aq0Var = (aq0) this.b;
        if (str.equals("drawableMsgIn")) {
            return aq0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return aq0Var.x;
        }
        org.telegram.ui.ActionBar.e6 e6Var = aq0Var.s;
        return e6Var != null ? e6Var.getDrawable(str) : org.telegram.ui.ActionBar.i6.P0(str);
    }

    @Override // ne.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public void h() {
        ((w10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.jp0
    public int i0() {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // ne.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // s4.f0
    public void j1(int i10, int i11) {
        ((s4.i0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public void k() {
        vb vbVar = ((rb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            of.f.s(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ boolean k0() {
        return false;
    }

    @Override // org.telegram.ui.Components.rn0
    public /* synthetic */ boolean k1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.br
    public /* synthetic */ void l(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int l0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.od1
    public void l1(boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        bd bdVar = (bd) this.b;
        e6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        if (e6Var instanceof ad) {
            e6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) e6Var2).a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // ne.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // ne.a
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return ((my) this.b).E0.isInPreviewMode();
            default:
                hh0 hh0Var = (hh0) this.b;
                View view2 = null;
                hh0Var.O = null;
                int childCount = hh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = hh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || hh0Var.P.contains(view2)) ? false : true;
        }
    }

    @Override // ne.a
    public boolean needLongPress(float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.nm
    public void o0(String str) {
        ((kk) this.b).b.ia(str, false);
    }

    @Override // ne.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((my) this.b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
                break;
        }
    }

    @Override // ne.a
    public /* synthetic */ void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // ne.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // ne.a
    public /* synthetic */ void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.z20
    public boolean onDown(MotionEvent motionEvent) {
        pj pjVar = (pj) this.b;
        View view = pjVar.a;
        if (view != null) {
            view.setPressed(true);
            pjVar.a.setSelected(true);
            pjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.z20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.z20
    public void onLongPress(MotionEvent motionEvent) {
        pj pjVar = (pj) this.b;
        zn znVar = pjVar.w;
        if (pjVar.a != null) {
            znVar.Q8 = org.telegram.ui.Components.q9.b(znVar, pjVar.v, znVar.T5, znVar.d(), znVar.ea);
            org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
            if (n1Var != null) {
                pjVar.b = n1Var;
                n1Var.setOnDismissListener(new f0(pjVar, 2));
                znVar.x0.B0();
                znVar.z0.R = false;
                View view = pjVar.v;
                znVar.sb(view);
                znVar.j8(false, view != znVar.j1, 0.3f);
                znVar.m9(false);
                kl klVar = znVar.z3;
                if (klVar != null) {
                    klVar.e(1, true);
                }
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ok okVar = znVar.Y;
                if (okVar == null || okVar.getEditField() == null) {
                    return;
                }
                znVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // ne.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // ne.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                View view2 = hh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // ne.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, false);
                hh0Var.invalidate();
                break;
        }
    }

    @Override // ne.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(hh0Var.H);
                hh0Var.setSkipDrawSelector(true);
                hh0.m(hh0Var, f7, true, false);
                hh0Var.invalidate();
                hh0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.z20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.z20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        pj pjVar = (pj) this.b;
        if (pjVar.e || (view = pjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        pjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.hm0
    public void q(float f7) {
        ((w10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.Components.br0
    public void q0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((g60) this.b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.br
    public void s0(int i10, int i11, boolean z10) {
        sg.o oVar;
        switch (this.a) {
            case 18:
                sg.o oVar2 = ((i20) this.b).c.c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (oVar = ((i20) this.b).c.c) != null) {
                    oVar.H = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean t0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.rn0
    public void u0(float f7) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                mv mvVar = (mv) this.b;
                if (f7 != 1.0f || mvVar.f[1].getVisibility() == 0) {
                    if (mvVar.r) {
                        mvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        mvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * mvVar.f[0].getMeasuredWidth()));
                    } else {
                        mvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        mvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - mvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        lv[] lvVarArr = mvVar.f;
                        lv lvVar = lvVarArr[0];
                        lvVarArr[0] = lvVarArr[1];
                        lvVarArr[1] = lvVar;
                        lvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.mv0
    public void w0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.b).u0[0];
        if (m3Var != null) {
            m3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public int x0(int i10) {
        aq0 aq0Var = (aq0) this.b;
        int indexOfKey = aq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return aq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = aq0Var.s;
        return e6Var != null ? e6Var.x0(i10) : org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.Components.br
    public /* synthetic */ void y() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.h7
    public void y0(r6 r6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = ((w6) this.b).e;
        if (r6Var == null) {
            if (aVar != null) {
                y6Var.Y.i(aVar);
                y6Var.N.d();
                y6.g0(y6Var);
                return;
            }
            return;
        }
        if (y6Var.Y.j.size() > 0 || z10) {
            zh.b bVar = y6Var.Y;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j3 = r6Var.a;
            SparseArray sparseArray = r6Var.d;
            if (hashSet3.contains(Long.valueOf(j3))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        zh.a aVar2 = (zh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((s6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        zh.a aVar3 = (zh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            y6Var.N.d();
            y6.g0(y6Var);
            return;
        }
        if (y6Var.H <= 0 || y6Var.getParentActivity() == null) {
            return;
        }
        r6Var.getClass();
        boolean z11 = true;
        zh.b bVar2 = new zh.b(true);
        SparseArray sparseArray2 = r6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((s6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((s6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((s6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((s6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((s6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((zh.a) arrayList3.get(i14));
            if (((zh.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((zh.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((zh.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((zh.a) arrayList4.get(i15));
            bVar2.t += ((zh.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((zh.a) arrayList5.get(i16));
            bVar2.u += ((zh.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((zh.a) arrayList6.get(i17));
            bVar2.v += ((zh.a) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        int i18 = 28;
        Collections.sort(arrayList3, new mb1(i18));
        Collections.sort(arrayList4, new mb1(i18));
        Collections.sort(arrayList5, new mb1(i18));
        Collections.sort(arrayList6, new mb1(i18));
        Collections.sort(bVar2.h, new mb1(i18));
        iv ivVar = new iv(y6Var, r6Var, bVar2, new n6.t(y6Var, r6Var, false, 3));
        y6Var.T = ivVar;
        y6Var.showDialog(ivVar);
    }

    @Override // org.telegram.ui.Components.jp0
    public void z() {
        switch (this.a) {
            case 5:
                ((i5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ String z0() {
        return null;
    }

    @Override // org.telegram.ui.Components.fm0
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        vb vbVar = (vb) this.b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (vbVar.p0.contains(Long.valueOf(j3))) {
                    vbVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    vbVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                vbVar.W0(true);
                vbVar.R0();
                vbVar.E.l();
                return;
            }
        }
        vbVar.P0(view, f7, f10);
    }

    private final void E1(float f7) {
    }

    private final void F1(float f7) {
    }

    private final void G1() {
    }

    private final void I1() {
    }

    private final /* synthetic */ void L1() {
    }

    private final void P1() {
    }

    private final void R1() {
    }

    private final /* synthetic */ void Y1(boolean z10) {
    }

    private final /* synthetic */ void c2(boolean z10) {
    }

    private final /* synthetic */ void m1() {
    }

    private final /* synthetic */ void o1() {
    }

    private final /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.mv0
    public /* synthetic */ void H(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void J0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.nm
    public /* synthetic */ void O0(int i10) {
    }

    @Override // org.telegram.ui.Components.br0
    public /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1() {
    }

    @Override // ai.gc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(int i10) {
    }

    @Override // org.telegram.ui.Components.p8
    public /* synthetic */ void h1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.u11
    public void v(vk0 vk0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.ActionBar.e6
    public /* synthetic */ void I0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.nm
    public /* synthetic */ void V(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void B1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void C1(View view, float f7, float f10) {
    }

    private final void r1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void t1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void u1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void w1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void x1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void y1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void z1(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.fm0
    public /* synthetic */ void n0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void D1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
