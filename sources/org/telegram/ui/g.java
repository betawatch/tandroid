package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class g implements v9, gv0, org.telegram.ui.web.b1, org.telegram.ui.Components.yo0, org.telegram.ui.Components.d5, org.telegram.ui.Components.dn0, ai.fc, org.telegram.ui.Components.nl0, org.telegram.ui.Cells.l1, gd1, org.telegram.ui.Components.yv0, km, me.a, org.telegram.ui.Components.pl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.oq, org.telegram.ui.Components.qq0, s4.e0, org.telegram.ui.Components.n8, org.telegram.ui.Components.m20, r0.n, yt, o11, org.telegram.ui.ActionBar.d6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Components.yo0
    public void B() {
        switch (this.a) {
            case 5:
                ((j5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public void C() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.oq
    public void C0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.a) {
            case 18:
                sg.f fVar2 = ((j20) this.b).c.c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (fVar = ((j20) this.b).c.c) != null) {
                    fVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Components.yv0
    public void E(boolean z10) {
        Runnable runnable = ((me) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public void E0(float f7) {
        switch (this.a) {
            case 6:
            case 10:
                break;
            default:
                nv nvVar = (nv) this.b;
                if (f7 != 1.0f || nvVar.f[1].getVisibility() == 0) {
                    if (nvVar.r) {
                        nvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        nvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * nvVar.f[0].getMeasuredWidth()));
                    } else {
                        nvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        nvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - nvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        mv[] mvVarArr = nvVar.f;
                        mv mvVar = mvVarArr[0];
                        mvVarArr[0] = mvVarArr[1];
                        mvVarArr[1] = mvVar;
                        mvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.gv0
    public void G0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.b).u0[0];
        if (m3Var != null) {
            m3Var.b.J0(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint H(String str) {
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int H0(int i10) {
        wp0 wp0Var = (wp0) this.b;
        int indexOfKey = wp0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return wp0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = wp0Var.s;
        return d6Var != null ? d6Var.H0(i10) : org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 16), 50L);
    }

    @Override // org.telegram.ui.Components.oq
    public /* synthetic */ int K0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.v9
    public void L(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        pw pwVar = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) pwVar.b;
        h hVar2 = (h) pwVar.c;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new no(27, b2Var, hVar2));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override // s4.e0
    public void O0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        zi0 zi0Var = (zi0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        zi0Var.e = defaultWindowInsets;
        zi0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        zi0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.n8
    public void U0(int i10, int i11) {
        k70 k70Var = (k70) this.b;
        k70Var.W = i10;
        AndroidUtilities.updateVisibleRows(k70Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.yo0
    public void Y(float f7, boolean z10) {
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
                jc0 jc0Var = (jc0) this.b;
                lc0 lc0Var = jc0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    lc0Var.X();
                    ArrayList arrayList2 = lc0Var.s;
                    if (arrayList2.isEmpty()) {
                        lc0Var.W();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new fc0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        lc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            jc0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                j5.d = f7;
                org.telegram.ui.Components.mw0 mw0Var = ((j5) this.b).b;
                mw0Var.M();
                mw0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yv0
    public float Y0() {
        return org.telegram.messenger.q.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((me) this.b).U0, 0);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ kv0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.gd1
    public boolean a() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.a) {
            case 11:
                cd cdVar = (cd) this.b;
                d6Var = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
                if (d6Var == null) {
                    return org.telegram.ui.ActionBar.i6.I.q();
                }
                d6Var2 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
                return d6Var2.a();
            default:
                return ((wp0) this.b).S;
        }
    }

    @Override // ai.fc
    public void a0(long j3, int i10, ai.d5 d5Var) {
        k8 k8Var = (k8) this.b;
        if (k8Var.b == null) {
            d5Var.run();
        }
        k8Var.b.post(d5Var);
    }

    @Override // org.telegram.ui.gd1
    public boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.dn0
    public void b(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                w5 w5Var = ((p5) this.b).d;
                w5Var.b0 = i10;
                w5Var.L0(true);
                break;
            case 10:
                dc dcVar = ((bc) this.b).f;
                dcVar.y = i10;
                dcVar.d(true);
                break;
            default:
                nv nvVar = (nv) this.b;
                if (nvVar.f[0].f != i10) {
                    nvVar.w = i10 == nvVar.e.getFirstTabId();
                    mv mvVar = nvVar.f[1];
                    mvVar.f = i10;
                    mvVar.setVisibility(0);
                    nvVar.m0(true);
                    nvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.yt
    public void b1(ut utVar) {
        ak0 ak0Var = (ak0) this.b;
        ak0Var.E = true;
        String str = utVar.c;
        ak0Var.O.setText(str);
        ak0Var.u(str, utVar);
        ak0Var.E = false;
        AndroidUtilities.runOnUIThread(new g10(this, 28), 300L);
        ak0Var.Q.requestFocus();
        yj0 yj0Var = ak0Var.Q;
        yj0Var.setSelection(yj0Var.length());
    }

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        x10 x10Var = (x10) this.b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f2) {
            x10.a(x10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.s2) {
            if (!x10Var.o0.g()) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (s2Var.Q(f7)) {
                    x10Var.i0.f(s2Var);
                    return true;
                }
            }
            x10.a(x10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.oq
    public /* synthetic */ void d(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.o11
    public void d0() {
        ((ik0) this.b).a();
    }

    @Override // org.telegram.ui.Components.m20
    public void d1() {
        mj mjVar = (mj) this.b;
        View view = mjVar.a;
        if (view != null) {
            view.setPressed(false);
            mjVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && mjVar.a.getBackground() != null) {
                mjVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = mjVar.n;
        if (view2 == null || mjVar.d) {
            return;
        }
        view2.callOnClick();
        mjVar.d = true;
    }

    @Override // org.telegram.ui.Components.n8
    public void dismiss() {
        ((k70) this.b).w.d(true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Components.yv0
    public int e1() {
        me meVar = (me) this.b;
        return meVar.V0 + meVar.W0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // me.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ boolean g1(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.yo0
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

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        wp0 wp0Var = (wp0) this.b;
        if (str.equals("drawableMsgIn")) {
            return wp0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return wp0Var.x;
        }
        org.telegram.ui.ActionBar.d6 d6Var = wp0Var.s;
        return d6Var != null ? d6Var.getDrawable(str) : org.telegram.ui.ActionBar.i6.O0(str);
    }

    @Override // me.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // org.telegram.ui.Components.pl0
    public void i() {
        ((x10) this.b).i0.finish();
    }

    @Override // ai.fc
    public boolean i1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
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
                                    gcVar.c = imageReceiver;
                                    if (k8Var.i0 == null) {
                                        k8Var.i0 = new z0(this, 11);
                                    }
                                    gcVar.e = k8Var.i0;
                                    gcVar.a = h8Var;
                                    gcVar.g = k8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.i = k8Var.fragmentView.getBottom();
                                    gcVar.b = null;
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

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j0(int i10) {
        return H0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int j1(int i10) {
        return H0(i10);
    }

    @Override // org.telegram.ui.gv0
    public /* synthetic */ TextureView k0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void l() {
        wb wbVar = ((sb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override // s4.e0
    public void m0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // s4.e0
    public void n1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // me.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // me.a
    public boolean needClickAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return ((ny) this.b).E0.isInPreviewMode();
            default:
                eh0 eh0Var = (eh0) this.b;
                View view2 = null;
                eh0Var.O = null;
                int childCount = eh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = eh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || eh0Var.P.contains(view2)) ? false : true;
        }
    }

    @Override // me.a
    public boolean needLongPress(float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.dn0
    public /* synthetic */ boolean o1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 10:
                break;
        }
        return false;
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        switch (this.a) {
            case 15:
                c5Var = ((org.telegram.ui.ActionBar.n2) ((ny) this.b).E0).parentLayout;
                ((ActionBarLayout) c5Var).r();
                break;
        }
    }

    @Override // me.a
    public /* synthetic */ void onClickTouchDown(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // me.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // me.a
    public /* synthetic */ void onClickTouchUp(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onDown(MotionEvent motionEvent) {
        mj mjVar = (mj) this.b;
        View view = mjVar.a;
        if (view != null) {
            view.setPressed(true);
            mjVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && mjVar.a.getBackground() != null) {
                mjVar.a.getBackground().setVisible(true, false);
            }
            mjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.m20
    public void onLongPress(MotionEvent motionEvent) {
        mj mjVar = (mj) this.b;
        yn ynVar = mjVar.w;
        if (mjVar.a != null) {
            ynVar.O8 = org.telegram.ui.Components.o9.b(ynVar, mjVar.v, ynVar.R5, ynVar.d(), ynVar.ca);
            org.telegram.ui.ActionBar.n1 n1Var = ynVar.O8;
            if (n1Var != null) {
                mjVar.b = n1Var;
                n1Var.setOnDismissListener(new f0(mjVar, 2));
                ynVar.v0.C0();
                ynVar.x0.R = false;
                View view = mjVar.v;
                ynVar.nb(view);
                ynVar.g8(false, view != ynVar.h1, 0.3f);
                ynVar.i9(false);
                fl flVar = ynVar.x3;
                if (flVar != null) {
                    flVar.e(1, true);
                }
                UndoView undoView = ynVar.w3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                jk jkVar = ynVar.W;
                if (jkVar == null || jkVar.getEditField() == null) {
                    return;
                }
                ynVar.W.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // me.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                eh0 eh0Var = (eh0) this.b;
                eh0.k(eh0Var, view, f7, f10);
                eh0.m(eh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(eh0Var.H, 450L);
                eh0Var.O = null;
                eh0Var.invalidate();
                eh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                eh0 eh0Var = (eh0) this.b;
                eh0.k(eh0Var, view, f7, f10);
                eh0.m(eh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(eh0Var.H, 450L);
                View view2 = eh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                eh0Var.O = null;
                eh0Var.invalidate();
                eh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                eh0 eh0Var = (eh0) this.b;
                eh0.k(eh0Var, view, f7, f10);
                eh0.m(eh0Var, f7, false, false);
                eh0Var.invalidate();
                break;
        }
    }

    @Override // me.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                eh0 eh0Var = (eh0) this.b;
                eh0.k(eh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(eh0Var.H);
                eh0Var.setSkipDrawSelector(true);
                eh0.m(eh0Var, f7, true, false);
                eh0Var.invalidate();
                eh0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        mj mjVar = (mj) this.b;
        if (mjVar.e || (view = mjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        mjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Components.yo0
    public int p0() {
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

    @Override // org.telegram.ui.Components.pl0
    public void q(float f7) {
        ((x10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.gd1
    public void q1(boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        cd cdVar = (cd) this.b;
        d6Var = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
        if (d6Var instanceof bd) {
            d6Var2 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            cd cdVar2 = ((bd) d6Var2).a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        }
        cdVar.U0(a(), false);
        cdVar.Z0(false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean r0() {
        return false;
    }

    @Override // org.telegram.ui.km
    public void u0(String str) {
        ((gk) this.b).b.ca(str, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.v3;
    }

    @Override // org.telegram.ui.Components.qq0
    public void x0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((h60) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.oq
    public /* synthetic */ void y() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (wbVar.p0.contains(Long.valueOf(j3))) {
                    wbVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                wbVar.W0(true);
                wbVar.R0();
                wbVar.E.l();
                return;
            }
        }
        wbVar.P0(view, f7, f10);
    }

    private final void L1(float f7) {
    }

    private final void S1(float f7) {
    }

    private final void W1() {
    }

    private final void X1() {
    }

    private final /* synthetic */ void Z1() {
    }

    private final void d2() {
    }

    private final void f2() {
    }

    private final /* synthetic */ void h2(boolean z10) {
    }

    private final /* synthetic */ void i2(boolean z10) {
    }

    private final /* synthetic */ void r1() {
    }

    private final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.gv0
    public /* synthetic */ void I(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void S0(int i10) {
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.qq0
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // ai.fc
    public /* synthetic */ void f(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.n8
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.o11
    public void v(rk0 rk0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void X(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void B1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void E1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void F1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void v1(View view, float f7, float f10) {
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
    public /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
