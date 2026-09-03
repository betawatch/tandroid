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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h implements w9, yu0, org.telegram.ui.web.b1, org.telegram.ui.Components.io0, org.telegram.ui.Components.y4, org.telegram.ui.Components.sm0, m7, nh.e9, org.telegram.ui.Components.il0, org.telegram.ui.Cells.j1, ad1, mm, yd.a, org.telegram.ui.Components.kl0, org.telegram.ui.Cells.o7, org.telegram.ui.Components.iq, org.telegram.ui.Components.aq0, f2.k0, org.telegram.ui.Components.g8, org.telegram.ui.Components.k20, r0.o, zt, k11, org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.io0
    public void B() {
        switch (this.a) {
            case 5:
                ((n5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.sm0
    public void C() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.w9
    public /* synthetic */ String C0() {
        return null;
    }

    @Override // f2.k0
    public void D(int i10, int i11) {
        ((f2.o0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ org.telegram.ui.Cells.m9 D2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean F1() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.Components.iq
    public /* synthetic */ int H0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        AndroidUtilities.runOnUIThread(new ah.b(this, i10, 13), 50L);
    }

    @Override // org.telegram.ui.w9
    public void K(String str) {
        i iVar = (i) this.b;
        iVar.finishFragment(false);
        ss ssVar = iVar.x;
        LaunchActivity launchActivity = (LaunchActivity) ssVar.b;
        i iVar2 = (i) ssVar.c;
        Pattern pattern = LaunchActivity.y1;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(launchActivity, 3, null);
        d2Var.d0 = false;
        d2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.L).sendRequest(tL_auth_acceptLoginToken, new no(27, d2Var, iVar2));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // f2.k0
    public void L0(int i10, int i11) {
        ((f2.o0) this.b).t(i10, i11);
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        ui0 ui0Var = (ui0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ui0Var.e = defaultWindowInsets;
        ui0Var.D.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        ui0Var.C.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.g8
    public void Q0(int i10, int i11) {
        g70 g70Var = (g70) this.b;
        g70Var.T = i10;
        AndroidUtilities.updateVisibleRows(g70Var.b);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.ad1
    public boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // nh.e9
    public boolean V0(long j10, int i10, int i11, int i12, nh.f9 f9Var) {
        l8 l8Var = (l8) this.b;
        if (l8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= l8Var.b.getChildCount()) {
                    break;
                }
                View childAt = l8Var.b.getChildAt(i13);
                if (childAt instanceof i8) {
                    i8 i8Var = (i8) childAt;
                    if (i8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < i8Var.n.size(); i14++) {
                            ArrayList arrayList = ((j8) i8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = i8Var.n.keyAt(i14);
                                l8Var.e0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) i8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.c = imageReceiver;
                                    if (l8Var.f0 == null) {
                                        l8Var.f0 = new c1(this, 10);
                                    }
                                    f9Var.e = l8Var.f0;
                                    f9Var.a = i8Var;
                                    f9Var.g = l8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.i = l8Var.fragmentView.getBottom();
                                    f9Var.b = null;
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Components.k20
    public void X0() {
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

    @Override // org.telegram.ui.Components.io0
    public void Y(float f10, boolean z4) {
        switch (this.a) {
            case 3:
                j4 j4Var = (j4) this.b;
                int round = Math.round(((j4Var.c - r2) * f10) + j4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    j4Var.f.r0[0].getAdapter().y.clear();
                    n4 n4Var = j4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        n4Var.r0[i10].c.l();
                        l4 l4Var = n4Var.r0[i10].c;
                        ArrayList arrayList = l4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(l4Var.H);
                        Utilities.globalQueue.postRunnable(l4Var.H, 100L);
                    }
                    j4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                ec0 ec0Var = (ec0) this.b;
                gc0 gc0Var = ec0Var.y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    gc0Var.Y();
                    ArrayList arrayList2 = gc0Var.s;
                    if (arrayList2.isEmpty()) {
                        gc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new ac0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        gc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            ec0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                n5.d = f10;
                org.telegram.ui.Components.qv0 qv0Var = ((n5) this.b).b;
                qv0Var.M();
                qv0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.zt
    public void Y0(ut utVar) {
        uj0 uj0Var = (uj0) this.b;
        uj0Var.B = true;
        String str = utVar.c;
        uj0Var.L.setText(str);
        uj0Var.u(str, utVar);
        uj0Var.B = false;
        AndroidUtilities.runOnUIThread(new d10(this, 28), 300L);
        uj0Var.N.requestFocus();
        sj0 sj0Var = uj0Var.N;
        sj0Var.setSelection(sj0Var.length());
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ug.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ boolean Z0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ad1
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.a) {
            case 12:
                dd ddVar = (dd) this.b;
                f6Var = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.I.q();
                }
                f6Var2 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
                return f6Var2.a();
            default:
                return ((np0) this.b).P;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.w9
    public /* synthetic */ boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.k11
    public void b0() {
        ((ck0) this.b).a();
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean c(float f10, float f11, int i10, View view) {
        u10 u10Var = (u10) this.b;
        if (view instanceof org.telegram.ui.Cells.h7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            u10.a(u10Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.d2) {
            u10.a(u10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.q2) {
            if (!u10Var.l0.f()) {
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                if (q2Var.S(f10)) {
                    u10Var.f0.f(q2Var);
                    return true;
                }
            }
            u10.a(u10Var, ((org.telegram.ui.Cells.q2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ cv0 c2() {
        return null;
    }

    @Override // org.telegram.ui.m7
    public void clear() {
        ((b7) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.sm0
    public void d(int i10, boolean z4) {
        switch (this.a) {
            case 6:
                a6 a6Var = ((t5) this.b).d;
                a6Var.Y = i10;
                a6Var.G0(true);
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
                    mvVar.r = z4;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int d0(int i10) {
        return x0(i10);
    }

    @Override // org.telegram.ui.m7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((g70) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // org.telegram.ui.yu0
    public /* synthetic */ TextureView e0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f1(int i10) {
        return x0(i10);
    }

    @Override // yd.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.m7
    public void g1() {
        d7 d7Var = ((b7) this.b).e;
        mh.b bVar = d7Var.V;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        d7Var.V.d();
        a7 a7Var = d7Var.K;
        if (a7Var != null) {
            a7Var.e(false);
            d7Var.K.d();
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.io0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                j4 j4Var = (j4) this.b;
                return String.valueOf(Math.round((j4Var.a.getProgress() * (j4Var.c - r1)) + j4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        np0 np0Var = (np0) this.b;
        if (str.equals("drawableMsgIn")) {
            return np0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return np0Var.x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = np0Var.s;
        return f6Var != null ? f6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // yd.a
    public long getLongPressDuration() {
        switch (this.a) {
            case 15:
                return ViewConfiguration.getLongPressTimeout();
            default:
                return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void h() {
        ((u10) this.b).f0.finish();
    }

    @Override // f2.k0
    public void h0(int i10, int i11) {
        ((f2.o0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // yd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void j() {
        ub ubVar = ((qb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            ze.d.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ze.d.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Components.io0
    public int j0() {
        switch (this.a) {
            case 3:
                j4 j4Var = (j4) this.b;
                return j4Var.c - j4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // f2.k0
    public void j1(int i10, int i11) {
        ((f2.o0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Components.iq
    public /* synthetic */ void k(boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.sm0
    public /* synthetic */ boolean k1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ad1
    public void l1(boolean z4) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        dd ddVar = (dd) this.b;
        f6Var = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
        if (f6Var instanceof cd) {
            f6Var2 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            dd ddVar2 = ((cd) f6Var2).a;
            ddVar2.G = !ddVar2.G;
            ddVar2.d1();
            ddVar2.Z0(false);
        }
        ddVar.U0(a(), false);
        ddVar.Z0(false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override // yd.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // yd.a
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                return ((jy) this.b).B0.isInPreviewMode();
            default:
                zg0 zg0Var = (zg0) this.b;
                View view2 = null;
                zg0Var.L = null;
                int childCount = zg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = zg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || zg0Var.M.contains(view2)) ? false : true;
        }
    }

    @Override // yd.a
    public boolean needLongPress(float f10, float f11) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.mm
    public void o0(String str) {
        ((ik) this.b).b.da(str, false);
    }

    @Override // yd.a
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.a) {
            case 15:
                e5Var = ((org.telegram.ui.ActionBar.p2) ((jy) this.b).B0).parentLayout;
                ((ActionBarLayout) e5Var).r();
                break;
        }
    }

    @Override // yd.a
    public /* synthetic */ void onClickTouchDown(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // yd.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // yd.a
    public /* synthetic */ void onClickTouchUp(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.k20
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

    @Override // org.telegram.ui.Components.k20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.k20
    public void onLongPress(MotionEvent motionEvent) {
        mj mjVar = (mj) this.b;
        zn znVar = mjVar.w;
        if (mjVar.a != null) {
            znVar.N8 = org.telegram.ui.Components.h9.b(znVar, mjVar.v, znVar.Q5, znVar.d(), znVar.ba);
            org.telegram.ui.ActionBar.p1 p1Var = znVar.N8;
            if (p1Var != null) {
                mjVar.b = p1Var;
                p1Var.setOnDismissListener(new h0(mjVar, 2));
                znVar.u0.B0();
                znVar.w0.R = false;
                View view = mjVar.v;
                znVar.ob(view);
                znVar.g8(false, view != znVar.g1, 0.3f);
                znVar.h9(false);
                il ilVar = znVar.w3;
                if (ilVar != null) {
                    ilVar.e(1, true);
                }
                UndoView undoView = znVar.v3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                lk lkVar = znVar.V;
                if (lkVar == null || lkVar.getEditField() == null) {
                    return;
                }
                znVar.V.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // yd.a
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                zg0 zg0Var = (zg0) this.b;
                zg0.k(zg0Var, view, f10, f11);
                zg0.m(zg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(zg0Var.E, 450L);
                zg0Var.L = null;
                zg0Var.invalidate();
                zg0Var.N.a(false, true);
                break;
        }
    }

    @Override // yd.a
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                zg0 zg0Var = (zg0) this.b;
                zg0.k(zg0Var, view, f10, f11);
                zg0.m(zg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(zg0Var.E, 450L);
                View view2 = zg0Var.L;
                if (view2 != null) {
                    view2.performClick();
                }
                zg0Var.L = null;
                zg0Var.invalidate();
                zg0Var.N.a(false, true);
                break;
        }
    }

    @Override // yd.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 15:
                break;
            default:
                zg0 zg0Var = (zg0) this.b;
                zg0.k(zg0Var, view, f10, f11);
                zg0.m(zg0Var, f10, false, false);
                zg0Var.invalidate();
                break;
        }
    }

    @Override // yd.a
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                return false;
            default:
                zg0 zg0Var = (zg0) this.b;
                zg0.k(zg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(zg0Var.E);
                zg0Var.setSkipDrawSelector(true);
                zg0.m(zg0Var, f10, true, false);
                zg0Var.invalidate();
                zg0Var.N.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.k20
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

    @Override // org.telegram.ui.Components.kl0
    public void p(float f10) {
        ((u10) this.b).f0.e(f10);
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.aq0
    public void q0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((e60) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.m7
    public void r(w6 w6Var, mh.a aVar, boolean z4) {
        HashSet hashSet;
        d7 d7Var = ((b7) this.b).e;
        if (w6Var == null) {
            if (aVar != null) {
                d7Var.V.i(aVar);
                d7Var.K.d();
                d7.g0(d7Var);
                return;
            }
            return;
        }
        if (d7Var.V.j.size() > 0 || z4) {
            mh.b bVar = d7Var.V;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j10 = w6Var.a;
            SparseArray sparseArray = w6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((x6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        mh.a aVar2 = (mh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((x6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        mh.a aVar3 = (mh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            d7Var.K.d();
            d7.g0(d7Var);
            return;
        }
        if (d7Var.E <= 0 || d7Var.getParentActivity() == null) {
            return;
        }
        w6Var.getClass();
        boolean z10 = true;
        mh.b bVar2 = new mh.b(true);
        SparseArray sparseArray2 = w6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((x6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((x6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((x6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((x6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((x6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((mh.a) arrayList3.get(i14));
            if (((mh.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((mh.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((mh.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((mh.a) arrayList4.get(i15));
            bVar2.t += ((mh.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((mh.a) arrayList5.get(i16));
            bVar2.u += ((mh.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((mh.a) arrayList6.get(i17));
            bVar2.v += ((mh.a) arrayList6.get(i17)).c;
            i17++;
            z10 = true;
        }
        bVar2.m = z10;
        bVar2.n = z10;
        bVar2.o = z10;
        bVar2.p = z10;
        bVar2.q = z10;
        int i18 = 22;
        Collections.sort(arrayList3, new e5.e(i18));
        Collections.sort(arrayList4, new e5.e(i18));
        Collections.sort(arrayList5, new e5.e(i18));
        Collections.sort(arrayList6, new e5.e(i18));
        Collections.sort(bVar2.h, new e5.e(i18));
        iv ivVar = new iv(d7Var, w6Var, bVar2, new n7.qa(9, d7Var, w6Var));
        d7Var.Q = ivVar;
        d7Var.showDialog(ivVar);
    }

    @Override // org.telegram.ui.Components.iq
    public void r0(int i10, int i11, boolean z4) {
        fg.j jVar;
        switch (this.a) {
            case 18:
                fg.j jVar2 = ((h20) this.b).c.c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (jVar = ((h20) this.b).c.c) != null) {
                    jVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean t0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.sm0
    public void u0(float f10) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                mv mvVar = (mv) this.b;
                if (f10 != 1.0f || mvVar.f[1].getVisibility() == 0) {
                    if (mvVar.r) {
                        mvVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        mvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * mvVar.f[0].getMeasuredWidth()));
                    } else {
                        mvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        mvVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - mvVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.yu0
    public void w0(MessageObject messageObject) {
        r3 r3Var = ((n4) this.b).r0[0];
        if (r3Var != null) {
            r3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int x0(int i10) {
        np0 np0Var = (np0) this.b;
        int indexOfKey = np0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return np0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = np0Var.s;
        return f6Var != null ? f6Var.x0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.Components.iq
    public /* synthetic */ void z() {
        int i10 = this.a;
    }

    @Override // nh.e9
    public void z0(long j10, int i10, nh.k3 k3Var) {
        l8 l8Var = (l8) this.b;
        if (l8Var.b == null) {
            k3Var.run();
        }
        l8Var.b.post(k3Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.il0
    public void c(float f10, float f11, int i10, View view) {
        MessageObject messageObject;
        ub ubVar = (ub) this.b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (ubVar.q0.contains(Long.valueOf(j10))) {
                    ubVar.q0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.q0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ubVar.X0(true);
                ubVar.R0();
                ubVar.F.l();
                return;
            }
        }
        ubVar.P0(view, f10, f11);
    }

    private final void E1(float f10) {
    }

    private final void G1(float f10) {
    }

    private final void J1() {
    }

    private final void N1() {
    }

    private final /* synthetic */ void P1() {
    }

    private final void W1() {
    }

    private final void X1() {
    }

    private final /* synthetic */ void b2(boolean z4) {
    }

    private final /* synthetic */ void d2(boolean z4) {
    }

    private final /* synthetic */ void n1() {
    }

    private final /* synthetic */ void o1() {
    }

    private final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.yu0
    public /* synthetic */ void H(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.mm
    public /* synthetic */ void O0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.w9
    public /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.aq0
    public /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1() {
    }

    @Override // nh.e9
    public /* synthetic */ void b(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Components.g8
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.w9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.k11
    public void v(lk0 lk0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.mm
    public /* synthetic */ void X(boolean z4, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void A1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void B1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void C1(View view, float f10, float f11) {
    }

    private final void s1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void t1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void v1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void w1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void x1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void y1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.il0
    public /* synthetic */ void n0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final /* synthetic */ void D1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
