package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g implements r9, ju0, org.telegram.ui.web.x0, org.telegram.ui.Components.on0, org.telegram.ui.Components.x4, org.telegram.ui.Components.wl0, h7, ih.i9, org.telegram.ui.Components.nk0, org.telegram.ui.Cells.k1, fc1, cm, ud.a, org.telegram.ui.Components.pk0, org.telegram.ui.Cells.p7, org.telegram.ui.Components.bq, org.telegram.ui.Components.gp0, f2.o0, org.telegram.ui.Components.g8, org.telegram.ui.Components.t10, r0.o, pt, r01, org.telegram.ui.ActionBar.b6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        AndroidUtilities.runOnUIThread(new bg.c2(this, i9, 15), 50L);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String C(long j10) {
        return null;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.r01
    public void E() {
        ((vj0) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.ju0
    public /* synthetic */ TextureView G() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public ColorFilter H() {
        return org.telegram.ui.ActionBar.f6.v3;
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ int H0(int i9) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.h7
    public void H1() {
        y6 y6Var = ((w6) this.b).e;
        hh.b bVar = y6Var.U;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        y6Var.U.d();
        v6 v6Var = y6Var.J;
        if (v6Var != null) {
            v6Var.e(false);
            y6Var.J.d();
        }
    }

    @Override // f2.o0
    public void I(int i9, int i10) {
        ((f2.r0) this.b).s(i9, i10);
    }

    @Override // f2.o0
    public void J0(int i9, int i10) {
        ((f2.r0) this.b).t(i9, i10);
    }

    @Override // org.telegram.ui.r9
    public void K(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        yr yrVar = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) yrVar.b;
        h hVar2 = (h) yrVar.c;
        Pattern pattern = LaunchActivity.x1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.c0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.K).sendRequest(tL_auth_acceptLoginToken, new v40(4, c2Var, hVar2));
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.cm
    public void L(String str) {
        ((xj) this.b).b.da(str, false);
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        li0 li0Var = (li0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        li0Var.e = defaultWindowInsets;
        li0Var.C.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        li0Var.B.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int N0(int i9) {
        zo0 zo0Var = (zo0) this.b;
        int indexOfKey = zo0Var.s.indexOfKey(i9);
        if (indexOfKey >= 0) {
            return zo0Var.s.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.b6 b6Var = zo0Var.r;
        return b6Var != null ? b6Var.N0(i9) : org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Paint O(String str) {
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ nu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Components.on0
    public void Q(float f10, boolean z10) {
        switch (this.a) {
            case 3:
                h4 h4Var = (h4) this.b;
                int round = Math.round(((h4Var.c - r2) * f10) + h4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    h4Var.f.q0[0].getAdapter().y.clear();
                    l4 l4Var = h4Var.f;
                    for (int i9 = 0; i9 < 2; i9++) {
                        l4Var.q0[i9].c.l();
                        j4 j4Var = l4Var.q0[i9].c;
                        ArrayList arrayList = j4Var.d;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(j4Var.G);
                        Utilities.globalQueue.postRunnable(j4Var.G, 100L);
                    }
                    h4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                qb0 qb0Var = (qb0) this.b;
                sb0 sb0Var = qb0Var.y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    sb0Var.X();
                    ArrayList arrayList2 = sb0Var.s;
                    if (arrayList2.isEmpty()) {
                        sb0Var.W();
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
                i5.d = f10;
                org.telegram.ui.Components.xu0 xu0Var = ((i5) this.b).b;
                xu0Var.M();
                xu0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // ih.i9
    public void T(long j10, int i9, ih.n3 n3Var) {
        g8 g8Var = (g8) this.b;
        if (g8Var.b == null) {
            n3Var.run();
        }
        g8Var.b.post(n3Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.g8
    public void V0(int i9, int i10) {
        r60 r60Var = (r60) this.b;
        r60Var.S = i9;
        AndroidUtilities.updateVisibleRows(r60Var.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.fc1
    public boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z0(MessageObject messageObject) {
        return org.telegram.messenger.ll.a(messageObject);
    }

    @Override // org.telegram.ui.fc1
    public boolean a() {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        switch (this.a) {
            case 12:
                xc xcVar = (xc) this.b;
                b6Var = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
                if (b6Var == null) {
                    return org.telegram.ui.ActionBar.f6.I.q();
                }
                b6Var2 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
                return b6Var2.a();
            default:
                return ((zo0) this.b).F;
        }
    }

    @Override // org.telegram.ui.pt
    public void a1(lt ltVar) {
        nj0 nj0Var = (nj0) this.b;
        nj0Var.A = true;
        String str = ltVar.c;
        nj0Var.K.setText(str);
        nj0Var.u(str, ltVar);
        nj0Var.A = false;
        AndroidUtilities.runOnUIThread(new o00(this, 28), 300L);
        nj0Var.M.requestFocus();
        kj0 kj0Var = nj0Var.M;
        kj0Var.setSelection(kj0Var.length());
    }

    @Override // org.telegram.ui.Components.wl0
    public void b(int i9, boolean z10) {
        switch (this.a) {
            case 6:
                u5 u5Var = ((o5) this.b).d;
                u5Var.X = i9;
                u5Var.F0(true);
                break;
            case 11:
                xb xbVar = ((vb) this.b).f;
                xbVar.y = i9;
                xbVar.d(true);
                break;
            default:
                bv bvVar = (bv) this.b;
                if (bvVar.f[0].f != i9) {
                    bvVar.w = i9 == bvVar.e.getFirstTabId();
                    av avVar = bvVar.f[1];
                    avVar.f = i9;
                    avVar.setVisibility(0);
                    bvVar.l0(true);
                    bvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.t10
    public void b1() {
        cj cjVar = (cj) this.b;
        View view = cjVar.a;
        if (view != null) {
            view.setPressed(false);
            cjVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && cjVar.a.getBackground() != null) {
                cjVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = cjVar.n;
        if (view2 == null || cjVar.d) {
            return;
        }
        view2.callOnClick();
        cjVar.d = true;
    }

    @Override // org.telegram.ui.Components.pk0
    public boolean c(float f10, float f11, int i9, View view) {
        f10 f10Var = (f10) this.b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            f10.a(f10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            f10.a(f10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            f10.a(f10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e2) {
            f10.a(f10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            if (!f10Var.k0.f()) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (r2Var.R(f10)) {
                    f10Var.e0.f(r2Var);
                    return true;
                }
            }
            f10.a(f10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.on0
    public int c0() {
        switch (this.a) {
            case 3:
                h4 h4Var = (h4) this.b;
                return h4Var.c - h4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // org.telegram.ui.h7
    public void clear() {
        ((w6) this.b).e.l0();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ pg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.h7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((r60) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ void e(boolean z10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // ud.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.on0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                h4 h4Var = (h4) this.b;
                return String.valueOf(Math.round((h4Var.a.getProgress() * (h4Var.c - r1)) + h4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Drawable getDrawable(String str) {
        zo0 zo0Var = (zo0) this.b;
        if (str.equals("drawableMsgIn")) {
            return zo0Var.v;
        }
        if (str.equals("drawableMsgInSelected")) {
            return zo0Var.w;
        }
        org.telegram.ui.ActionBar.b6 b6Var = zo0Var.r;
        return b6Var != null ? b6Var.getDrawable(str) : org.telegram.ui.ActionBar.f6.O0(str);
    }

    @Override // ud.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public /* synthetic */ boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Components.gp0
    public void h0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((o50) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String i(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean i1(String str, j9 j9Var) {
        return false;
    }

    @Override // ud.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public void j() {
        ((f10) this.b).e0.finish();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // f2.o0
    public void j1(int i9, int i10) {
        ((f2.r0) this.b).r(i9, i10, null);
    }

    @Override // org.telegram.ui.Components.bq
    public /* synthetic */ void k() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Components.wl0
    public /* synthetic */ boolean k1(int i9, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int l0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public void m() {
        pb pbVar = ((lb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            ve.e.s(pbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ve.e.s(pbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.fc1
    public void m1(boolean z10) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        xc xcVar = (xc) this.b;
        b6Var = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
        if (b6Var instanceof wc) {
            b6Var2 = ((org.telegram.ui.ActionBar.o2) xcVar).resourceProvider;
            xc xcVar2 = ((wc) b6Var2).a;
            xcVar2.F = !xcVar2.F;
            xcVar2.d1();
            xcVar2.Z0(false);
        }
        xcVar.U0(a(), false);
        xcVar.Z0(false);
    }

    @Override // org.telegram.ui.Components.on0
    public void n() {
        switch (this.a) {
            case 5:
                ((i5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bq
    public void n0(int i9, int i10, boolean z10) {
        ag.k kVar;
        switch (this.a) {
            case 18:
                ag.k kVar2 = ((r10) this.b).c.c;
                if (kVar2 != null) {
                    kVar2.C = i9;
                    break;
                }
                break;
            default:
                if (i10 == 0 && (kVar = ((r10) this.b).c.c) != null) {
                    kVar.B = i9;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n2(int i9) {
        return false;
    }

    @Override // ud.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // ud.a
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                return ((vx) this.b).A0.isInPreviewMode();
            default:
                pg0 pg0Var = (pg0) this.b;
                View view2 = null;
                pg0Var.K = null;
                int childCount = pg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = pg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || pg0Var.L.contains(view2)) ? false : true;
        }
    }

    @Override // ud.a
    public boolean needLongPress(float f10, float f11) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.h7
    public void o1(r6 r6Var, hh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = ((w6) this.b).e;
        if (r6Var == null) {
            if (aVar != null) {
                y6Var.U.i(aVar);
                y6Var.J.d();
                y6.f0(y6Var);
                return;
            }
            return;
        }
        if (y6Var.U.j.size() > 0 || z10) {
            hh.b bVar = y6Var.U;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j10 = r6Var.a;
            SparseArray sparseArray = r6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                    ArrayList arrayList = ((s6) sparseArray.valueAt(i9)).b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        hh.a aVar2 = (hh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    ArrayList arrayList2 = ((s6) sparseArray.valueAt(i11)).b;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        hh.a aVar3 = (hh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            y6Var.J.d();
            y6.f0(y6Var);
            return;
        }
        if (y6Var.D <= 0 || y6Var.getParentActivity() == null) {
            return;
        }
        r6Var.getClass();
        boolean z11 = true;
        hh.b bVar2 = new hh.b(true);
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
        int i13 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i13 >= size3) {
                break;
            }
            hashSet.add((hh.a) arrayList3.get(i13));
            if (((hh.a) arrayList3.get(i13)).d == 0) {
                bVar2.r += ((hh.a) arrayList3.get(i13)).c;
            } else {
                bVar2.s += ((hh.a) arrayList3.get(i13)).c;
            }
            i13++;
        }
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            hashSet.add((hh.a) arrayList4.get(i14));
            bVar2.t += ((hh.a) arrayList4.get(i14)).c;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            hashSet.add((hh.a) arrayList5.get(i15));
            bVar2.u += ((hh.a) arrayList5.get(i15)).c;
        }
        int i16 = 0;
        while (i16 < arrayList6.size()) {
            hashSet.add((hh.a) arrayList6.get(i16));
            bVar2.v += ((hh.a) arrayList6.get(i16)).c;
            i16++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        int i17 = 21;
        Collections.sort(arrayList3, new a5.e(i17));
        Collections.sort(arrayList4, new a5.e(i17));
        Collections.sort(arrayList5, new a5.e(i17));
        Collections.sort(arrayList6, new a5.e(i17));
        Collections.sort(bVar2.h, new a5.e(i17));
        xu xuVar = new xu(y6Var, r6Var, bVar2, new g5.b(y6Var, r6Var, false, 29));
        y6Var.P = xuVar;
        y6Var.showDialog(xuVar);
    }

    @Override // ud.a
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.o2) ((vx) this.b).A0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                break;
        }
    }

    @Override // ud.a
    public /* synthetic */ void onClickTouchDown(View view, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // ud.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // ud.a
    public /* synthetic */ void onClickTouchUp(View view, float f10, float f11) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onDown(MotionEvent motionEvent) {
        cj cjVar = (cj) this.b;
        View view = cjVar.a;
        if (view != null) {
            view.setPressed(true);
            cjVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && cjVar.a.getBackground() != null) {
                cjVar.a.getBackground().setVisible(true, false);
            }
            cjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.t10
    public void onLongPress(MotionEvent motionEvent) {
        cj cjVar = (cj) this.b;
        qn qnVar = cjVar.w;
        if (cjVar.a != null) {
            qnVar.M8 = org.telegram.ui.Components.g9.b(qnVar, cjVar.v, qnVar.P5, qnVar.b(), qnVar.aa);
            org.telegram.ui.ActionBar.o1 o1Var = qnVar.M8;
            if (o1Var != null) {
                cjVar.b = o1Var;
                o1Var.setOnDismissListener(new g0(cjVar, 2));
                qnVar.t0.B0();
                qnVar.v0.R = false;
                View view = cjVar.v;
                qnVar.ob(view);
                qnVar.g8(false, view != qnVar.f1, 0.3f);
                qnVar.h9(false);
                xk xkVar = qnVar.v3;
                if (xkVar != null) {
                    xkVar.e(1, true);
                }
                UndoView undoView = qnVar.u3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ak akVar = qnVar.U;
                if (akVar == null || akVar.getEditField() == null) {
                    return;
                }
                qnVar.U.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // ud.a
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f10, f11);
                pg0.m(pg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.D, 450L);
                pg0Var.K = null;
                pg0Var.invalidate();
                pg0Var.M.a(false, true);
                break;
        }
    }

    @Override // ud.a
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f10, f11);
                pg0.m(pg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.D, 450L);
                View view2 = pg0Var.K;
                if (view2 != null) {
                    view2.performClick();
                }
                pg0Var.K = null;
                pg0Var.invalidate();
                pg0Var.M.a(false, true);
                break;
        }
    }

    @Override // ud.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 15:
                break;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f10, f11);
                pg0.m(pg0Var, f10, false, false);
                pg0Var.invalidate();
                break;
        }
    }

    @Override // ud.a
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                return false;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(pg0Var.D);
                pg0Var.setSkipDrawSelector(true);
                pg0.m(pg0Var, f10, true, false);
                pg0Var.invalidate();
                pg0Var.M.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.t10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        cj cjVar = (cj) this.b;
        if (cjVar.e || (view = cjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        cjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Components.wl0
    public void p() {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int p0(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int q1(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ org.telegram.ui.Cells.o9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean r1() {
        return false;
    }

    @Override // f2.o0
    public void t(int i9, int i10) {
        ((f2.r0) this.b).p(i9, i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public void u(float f10) {
        ((f10) this.b).e0.d(f10);
    }

    @Override // org.telegram.ui.Components.wl0
    public void v0(float f10) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                bv bvVar = (bv) this.b;
                if (f10 != 1.0f || bvVar.f[1].getVisibility() == 0) {
                    if (bvVar.r) {
                        bvVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        bvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * bvVar.f[0].getMeasuredWidth()));
                    } else {
                        bvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        bvVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - bvVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
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

    @Override // org.telegram.ui.ju0
    public void x0(MessageObject messageObject) {
        p3 p3Var = ((l4) this.b).q0[0];
        if (p3Var != null) {
            p3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // ih.i9
    public boolean y0(long j10, int i9, int i10, int i11, ih.j9 j9Var) {
        g8 g8Var = (g8) this.b;
        if (g8Var.b != null) {
            int i12 = 0;
            while (true) {
                if (i12 >= g8Var.b.getChildCount()) {
                    break;
                }
                View childAt = g8Var.b.getChildAt(i12);
                if (childAt instanceof d8) {
                    d8 d8Var = (d8) childAt;
                    if (d8Var.n == null) {
                        continue;
                    } else {
                        for (int i13 = 0; i13 < d8Var.n.size(); i13++) {
                            ArrayList arrayList = ((e8) d8Var.n.valueAt(i13)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i10))) {
                                int keyAt = d8Var.n.keyAt(i13);
                                g8Var.d0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) d8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    j9Var.c = imageReceiver;
                                    if (g8Var.e0 == null) {
                                        g8Var.e0 = new b1(this, 10);
                                    }
                                    j9Var.e = g8Var.e0;
                                    j9Var.a = d8Var;
                                    j9Var.g = g8Var.fragmentView;
                                    j9Var.h = AndroidUtilities.dp(36.0f);
                                    j9Var.i = g8Var.fragmentView.getBottom();
                                    j9Var.b = null;
                                    return true;
                                }
                            }
                        }
                    }
                }
                i12++;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        MessageObject messageObject;
        pb pbVar = (pb) this.b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (pbVar.p0.contains(Long.valueOf(j10))) {
                    pbVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    pbVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                pbVar.X0(true);
                pbVar.R0();
                pbVar.E.l();
                return;
            }
        }
        pbVar.P0(view, f10, f11);
    }

    private final void Y1(float f10) {
    }

    private final void Z1(float f10) {
    }

    private final void a2() {
    }

    private final void c2() {
    }

    private final /* synthetic */ void d2() {
    }

    private final void h2() {
    }

    private final void i2() {
    }

    private final /* synthetic */ void j2(boolean z10) {
    }

    private final /* synthetic */ void m2(boolean z10) {
    }

    private final /* synthetic */ void n1() {
    }

    private final /* synthetic */ void p1() {
    }

    private final /* synthetic */ void u1() {
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ void A() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.cm
    public /* synthetic */ void P0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // ih.i9
    public /* synthetic */ void d(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.r01
    public void g(ek0 ek0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.g8
    public /* synthetic */ void h1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.ju0
    public /* synthetic */ void y(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.cm
    public /* synthetic */ void D(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ void c1(int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void B1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void J1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void K1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void N1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void Q1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void T1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void U1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void V1(View view, float f10, float f11) {
    }

    private final void v1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final /* synthetic */ void X1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
    }
}
