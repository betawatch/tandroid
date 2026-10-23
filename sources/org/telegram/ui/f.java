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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class f implements v9, uu0, org.telegram.ui.web.a1, org.telegram.ui.Components.gp0, org.telegram.ui.Components.d5, org.telegram.ui.Components.nn0, l7, ci.v9, org.telegram.ui.Components.bm0, org.telegram.ui.Cells.k1, hc1, fm, oe.a, org.telegram.ui.Components.dm0, org.telegram.ui.Cells.q7, org.telegram.ui.Components.vq, org.telegram.ui.Components.xq0, s4.d0, org.telegram.ui.Components.o8, org.telegram.ui.Components.r20, r0.n, qt, c11 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        qi0 qi0Var = (qi0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        qi0Var.d = defaultWindowInsets;
        qi0Var.F.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        qi0Var.E.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ah.g(this, i10, 19), 50L);
    }

    @Override // org.telegram.ui.v9
    public void E(String str) {
        g gVar = (g) this.b;
        gVar.finishFragment(false);
        ks ksVar = gVar.x;
        LaunchActivity launchActivity = (LaunchActivity) ksVar.b;
        g gVar2 = (g) ksVar.c;
        Pattern pattern = LaunchActivity.E1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.i0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new a50(4, c2Var, gVar2));
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Components.o8
    public void H0(int i10, int i11) {
        w60 w60Var = (w60) this.b;
        w60Var.W = i10;
        AndroidUtilities.updateVisibleRows(w60Var.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.hc1
    public boolean I0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.gp0
    public void L(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                f4 f4Var = (f4) this.b;
                int round = Math.round(((f4Var.c - r2) * f7) + f4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    f4Var.f.u0[0].getAdapter().y.clear();
                    k4 k4Var = f4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        k4Var.u0[i10].c.l();
                        i4 i4Var = k4Var.u0[i10].c;
                        ArrayList arrayList = i4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(i4Var.K);
                        Utilities.globalQueue.postRunnable(i4Var.K, 100L);
                    }
                    f4Var.invalidate();
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
                    wb0Var.Y();
                    ArrayList arrayList2 = wb0Var.s;
                    if (arrayList2.isEmpty()) {
                        wb0Var.X();
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
                m5.d = f7;
                org.telegram.ui.Components.ow0 ow0Var = ((m5) this.b).b;
                ow0Var.L();
                ow0Var.M();
                break;
        }
    }

    @Override // org.telegram.ui.qt
    public void L0(lt ltVar) {
        rj0 rj0Var = (rj0) this.b;
        rj0Var.y = true;
        String str = ltVar.c;
        rj0Var.N.setText(str);
        rj0Var.w(str, ltVar);
        rj0Var.y = false;
        AndroidUtilities.runOnUIThread(new oj0(this, 0), 300L);
        rj0Var.P.requestFocus();
        pj0 pj0Var = rj0Var.P;
        pj0Var.setSelection(pj0Var.length());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void N0() {
        gj gjVar = (gj) this.b;
        View view = gjVar.a;
        if (view != null) {
            view.setPressed(false);
            gjVar.a.setSelected(false);
        }
        View view2 = gjVar.n;
        if (view2 == null || gjVar.d) {
            return;
        }
        view2.callOnClick();
        gjVar.d = true;
    }

    @Override // org.telegram.ui.c11
    public void O() {
        ((zj0) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ yu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // ci.v9
    public boolean Q0(long j10, int i10, int i11, int i12, ci.w9 w9Var) {
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
                                    w9Var.c = imageReceiver;
                                    if (k8Var.i0 == null) {
                                        k8Var.i0 = new a1(this, 10);
                                    }
                                    w9Var.e = k8Var.i0;
                                    w9Var.a = h8Var;
                                    w9Var.g = k8Var.fragmentView;
                                    w9Var.h = AndroidUtilities.dp(36.0f);
                                    w9Var.i = k8Var.fragmentView.getBottom();
                                    w9Var.b = null;
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.uu0
    public /* synthetic */ TextureView U() {
        return null;
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
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

    @Override // ci.v9
    public void X0(long j10, int i10, ci.s3 s3Var) {
        k8 k8Var = (k8) this.b;
        if (k8Var.b == null) {
            s3Var.run();
        }
        k8Var.b.post(s3Var);
    }

    @Override // org.telegram.ui.Components.gp0
    public int Y() {
        switch (this.a) {
            case 3:
                f4 f4Var = (f4) this.b;
                return f4Var.c - f4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.hc1
    public boolean a() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        bd bdVar = (bd) this.b;
        g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        if (g6Var == null) {
            return org.telegram.ui.ActionBar.k6.I.q();
        }
        g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        return g6Var2.a();
    }

    @Override // s4.d0
    public void a1(int i10, int i11) {
        ((s4.g0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.fm
    public void b0(String str) {
        ((ck) this.b).b.ia(str, false);
    }

    @Override // org.telegram.ui.Components.nn0
    public /* synthetic */ boolean b1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean c(float f7, float f10, int i10, View view) {
        i10 i10Var = (i10) this.b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e2) {
            i10.a(i10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.q2) {
            if (!i10Var.o0.g()) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                if (q2Var.R(f7)) {
                    i10Var.i0.e(q2Var);
                    return true;
                }
            }
            i10.a(i10Var, ((org.telegram.ui.Cells.q2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.hc1
    public void c1(boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        bd bdVar = (bd) this.b;
        g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
        if (g6Var instanceof ad) {
            g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) g6Var2).a;
            bdVar2.J = !bdVar2.J;
            bdVar2.f1();
            bdVar2.b1(false);
        }
        bdVar.W0(a(), false);
        bdVar.b1(false);
    }

    @Override // org.telegram.ui.l7
    public void clear() {
        ((a7) this.b).e.n0();
    }

    @Override // org.telegram.ui.Components.nn0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                y5 y5Var = ((s5) this.b).d;
                y5Var.d0 = i10;
                y5Var.H0(true);
                break;
            case 11:
                cc ccVar = ((ac) this.b).f;
                ccVar.y = i10;
                ccVar.d(true);
                break;
            default:
                cv cvVar = (cv) this.b;
                if (cvVar.f[0].f != i10) {
                    cvVar.w = i10 == cvVar.e.getFirstTabId();
                    bv bvVar = cvVar.f[1];
                    bvVar.f = i10;
                    bvVar.setVisibility(0);
                    cvVar.m0(true);
                    cvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.b1.a(messageObject);
    }

    @Override // org.telegram.ui.l7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((w60) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // oe.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.xq0
    public void g0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((u50) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.gp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                f4 f4Var = (f4) this.b;
                return String.valueOf(Math.round((f4Var.a.getProgress() * (f4Var.c - r1)) + f4Var.b));
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

    @Override // org.telegram.ui.Components.dm0
    public void h() {
        ((i10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // oe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void j() {
        vb vbVar = ((rb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            pf.d.r(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Components.vq
    public void j0(int i10, int i11, boolean z10) {
        tg.o oVar;
        switch (this.a) {
            case 18:
                tg.o oVar2 = ((v10) this.b).c.c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (oVar = ((v10) this.b).c.c) != null) {
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

    @Override // org.telegram.ui.Components.nn0
    public void k0(float f7) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                cv cvVar = (cv) this.b;
                if (f7 != 1.0f || cvVar.f[1].getVisibility() == 0) {
                    if (cvVar.r) {
                        cvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        cvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * cvVar.f[0].getMeasuredWidth()));
                    } else {
                        cvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        cvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - cvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        bv[] bvVarArr = cvVar.f;
                        bv bvVar = bvVarArr[0];
                        bvVarArr[0] = bvVarArr[1];
                        bvVarArr[1] = bvVar;
                        bvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.uu0
    public void m0(MessageObject messageObject) {
        n3 n3Var = ((k4) this.b).u0[0];
        if (n3Var != null) {
            n3Var.b.I0(true);
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

    @Override // oe.a
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
        ((i10) this.b).i0.d(f7);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.a6 a6Var) {
        return false;
    }

    @Override // oe.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        switch (this.a) {
            case 15:
                h5Var = ((org.telegram.ui.ActionBar.o2) ((wx) this.b).E0).parentLayout;
                ((ActionBarLayout) h5Var).r();
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
        gj gjVar = (gj) this.b;
        View view = gjVar.a;
        if (view != null) {
            view.setPressed(true);
            gjVar.a.setSelected(true);
            gjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void onLongPress(MotionEvent motionEvent) {
        gj gjVar = (gj) this.b;
        sn snVar = gjVar.w;
        if (gjVar.a != null) {
            snVar.c9 = org.telegram.ui.Components.o9.b(snVar, gjVar.v, snVar.f6, snVar.d(), snVar.qa);
            org.telegram.ui.ActionBar.m1 m1Var = snVar.c9;
            if (m1Var != null) {
                gjVar.b = m1Var;
                m1Var.setOnDismissListener(new e0(gjVar, 2));
                snVar.x0.B0();
                snVar.z0.R = false;
                View view = gjVar.v;
                snVar.ub(view);
                snVar.j8(false, view != snVar.v1, 0.3f);
                snVar.m9(false);
                cl clVar = snVar.L3;
                if (clVar != null) {
                    clVar.d(1, true);
                }
                UndoView undoView = snVar.K3;
                if (undoView != null) {
                    undoView.d(1, true);
                }
                gk gkVar = snVar.Y;
                if (gkVar == null || gkVar.getEditField() == null) {
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

    @Override // oe.a
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

    @Override // oe.a
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

    @Override // oe.a
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

    @Override // org.telegram.ui.Components.r20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        gj gjVar = (gj) this.b;
        if (gjVar.e || (view = gjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        gjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ String p0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ org.telegram.ui.Cells.p9 p2() {
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
        yu yuVar = new yu(c7Var, v6Var, cVar2, new mi.q(c7Var, v6Var, false, 8));
        c7Var.T = yuVar;
        c7Var.showDialog(yuVar);
    }

    @Override // s4.d0
    public void t0(int i10, int i11) {
        ((s4.g0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Components.vq
    public /* synthetic */ void u() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.gp0
    public void v() {
        switch (this.a) {
            case 5:
                ((m5) this.b).b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.nn0
    public void x() {
        int i10 = this.a;
    }

    @Override // s4.d0
    public void y(int i10, int i11) {
        ((s4.g0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        vb vbVar = (vb) this.b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (vbVar.p0.contains(Long.valueOf(j10))) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.fm
    public /* synthetic */ void D0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.xq0
    public /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.o8
    public /* synthetic */ void Y0() {
    }

    @Override // ci.v9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.c11
    public void r(ik0 ik0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.uu0
    public /* synthetic */ void z(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.fm
    public /* synthetic */ void J(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(org.telegram.ui.Cells.t1 t1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void h1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void u1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
