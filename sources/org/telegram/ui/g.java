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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g implements t9, kv0, org.telegram.ui.web.c1, org.telegram.ui.Components.eo0, org.telegram.ui.Components.d5, org.telegram.ui.Components.lm0, i7, bi.lb, org.telegram.ui.Components.al0, org.telegram.ui.Cells.k1, nd1, pm, me.a, org.telegram.ui.Components.cl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.kq, org.telegram.ui.Components.wp0, s4.e0, org.telegram.ui.Components.p8, org.telegram.ui.Components.i20, r0.n, au, x11, org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
        switch (this.a) {
            case 5:
                ((i5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.kq
    public void B0(int i10, int i11, boolean z10) {
        tg.f fVar;
        switch (this.a) {
            case 18:
                tg.f fVar2 = ((k20) this.b).c.c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (fVar = ((k20) this.b).c.c) != null) {
                    fVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public void C() {
        int i10 = this.a;
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Components.lm0
    public void D0(float f7) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                ov ovVar = (ov) this.b;
                if (f7 != 1.0f || ovVar.f[1].getVisibility() == 0) {
                    if (ovVar.r) {
                        ovVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        ovVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * ovVar.f[0].getMeasuredWidth()));
                    } else {
                        ovVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        ovVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - ovVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        nv[] nvVarArr = ovVar.f;
                        nv nvVar = nvVarArr[0];
                        nvVarArr[0] = nvVarArr[1];
                        nvVarArr[1] = nvVar;
                        nvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.kv0
    public void E0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.b).u0[0];
        if (m3Var != null) {
            m3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int G0(int i10) {
        bq0 bq0Var = (bq0) this.b;
        int indexOfKey = bq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bq0Var.s;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        of.f.s(t1Var.getContext(), str);
    }

    @Override // bi.lb
    public boolean H0(long j3, int i10, int i11, int i12, bi.mb mbVar) {
        h8 h8Var = (h8) this.b;
        if (h8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= h8Var.b.getChildCount()) {
                    break;
                }
                View childAt = h8Var.b.getChildAt(i13);
                if (childAt instanceof e8) {
                    e8 e8Var = (e8) childAt;
                    if (e8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < e8Var.n.size(); i14++) {
                            ArrayList arrayList = ((f8) e8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = e8Var.n.keyAt(i14);
                                h8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    mbVar.c = imageReceiver;
                                    if (h8Var.i0 == null) {
                                        h8Var.i0 = new z0(this, 10);
                                    }
                                    mbVar.e = h8Var.i0;
                                    mbVar.a = e8Var;
                                    mbVar.g = h8Var.fragmentView;
                                    mbVar.h = AndroidUtilities.dp(36.0f);
                                    mbVar.i = h8Var.fragmentView.getBottom();
                                    mbVar.b = null;
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
    public /* synthetic */ CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ah.g(this, i10, 17), 50L);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public void K(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        z10 z10Var = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) z10Var.b;
        h hVar2 = (h) z10Var.c;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.g0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new ro(27, b2Var, hVar2));
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String K0() {
        return null;
    }

    @Override // org.telegram.ui.Components.kq
    public /* synthetic */ int M0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // s4.e0
    public void P0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ov0 Q1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean S1(long j3) {
        return false;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        cj0 cj0Var = (cj0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cj0Var.e = defaultWindowInsets;
        cj0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        cj0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
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
                lc0 lc0Var = (lc0) this.b;
                nc0 nc0Var = lc0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    nc0Var.Y();
                    ArrayList arrayList2 = nc0Var.s;
                    if (arrayList2.isEmpty()) {
                        nc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new hc0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        nc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            lc0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                i5.d = f7;
                org.telegram.ui.Components.ov0 ov0Var = ((i5) this.b).b;
                ov0Var.M();
                ov0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean X0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Components.p8
    public void Y0(int i10, int i11) {
        l70 l70Var = (l70) this.b;
        l70Var.W = i10;
        AndroidUtilities.updateVisibleRows(l70Var.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.nd1
    public boolean Z0() {
        return false;
    }

    @Override // org.telegram.ui.nd1
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.a) {
            case 12:
                bd bdVar = (bd) this.b;
                f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.I.q();
                }
                f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
                return f6Var2.a();
            default:
                return ((bq0) this.b).S;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.au
    public void a1(vt vtVar) {
        ek0 ek0Var = (ek0) this.b;
        ek0Var.E = true;
        String str = vtVar.c;
        ek0Var.O.setText(str);
        ek0Var.u(str, vtVar);
        ek0Var.E = false;
        AndroidUtilities.runOnUIThread(new g10(this, 28), 300L);
        ek0Var.Q.requestFocus();
        ck0 ck0Var = ek0Var.Q;
        ck0Var.setSelection(ck0Var.length());
    }

    @Override // org.telegram.ui.Components.lm0
    public void b(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((o5) this.b).d;
                v5Var.b0 = i10;
                v5Var.G0(true);
                break;
            case 11:
                cc ccVar = ((ac) this.b).f;
                ccVar.y = i10;
                ccVar.d(true);
                break;
            default:
                ov ovVar = (ov) this.b;
                if (ovVar.f[0].f != i10) {
                    ovVar.w = i10 == ovVar.e.getFirstTabId();
                    nv nvVar = ovVar.f[1];
                    nvVar.f = i10;
                    nvVar.setVisibility(0);
                    ovVar.m0(true);
                    ovVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.x11
    public void b0() {
        ((nk0) this.b).a();
    }

    @Override // org.telegram.ui.Components.i20
    public void b1() {
        oj ojVar = (oj) this.b;
        View view = ojVar.a;
        if (view != null) {
            view.setPressed(false);
            ojVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ojVar.a.getBackground() != null) {
                ojVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ojVar.n;
        if (view2 == null || ojVar.d) {
            return;
        }
        view2.callOnClick();
        ojVar.d = true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(MessageObject messageObject) {
        return org.telegram.messenger.wl.a(messageObject);
    }

    @Override // org.telegram.ui.i7
    public void clear() {
        ((x6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(float f7, float f10, int i10, View view) {
        x10 x10Var = (x10) this.b;
        if (view instanceof org.telegram.ui.Cells.j7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e2) {
            x10.a(x10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            if (!x10Var.o0.g()) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (r2Var.S(f7)) {
                    x10Var.i0.f(r2Var);
                    return true;
                }
            }
            x10.a(x10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.i7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((l70) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int f0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override // me.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.eo0
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

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        bq0 bq0Var = (bq0) this.b;
        if (str.equals("drawableMsgIn")) {
            return bq0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bq0Var.x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = bq0Var.s;
        return f6Var != null ? f6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
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

    @Override // org.telegram.ui.Components.cl0
    public void h() {
        ((x10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.kv0
    public /* synthetic */ TextureView i0() {
        return null;
    }

    @Override // org.telegram.ui.i7
    public void i1() {
        z6 z6Var = ((x6) this.b).e;
        ai.c cVar = z6Var.Y;
        if (cVar == null || cVar.j.size() <= 0) {
            return;
        }
        z6Var.Y.d();
        w6 w6Var = z6Var.N;
        if (w6Var != null) {
            w6Var.e(false);
            z6Var.N.d();
        }
    }

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void j() {
        ub ubVar = ((qb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            of.f.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            of.f.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Components.kq
    public /* synthetic */ void k(boolean z10) {
        int i10 = this.a;
    }

    @Override // s4.e0
    public void k0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.i7
    public void k1(s6 s6Var, ai.b bVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.b).e;
        if (s6Var == null) {
            if (bVar != null) {
                z6Var.Y.i(bVar);
                z6Var.N.d();
                z6.g0(z6Var);
                return;
            }
            return;
        }
        if (z6Var.Y.j.size() > 0 || z10) {
            ai.c cVar = z6Var.Y;
            HashSet hashSet2 = cVar.j;
            HashSet hashSet3 = cVar.l;
            long j3 = s6Var.a;
            SparseArray sparseArray = s6Var.d;
            if (hashSet3.contains(Long.valueOf(j3))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ai.b bVar2 = (ai.b) obj;
                        if (hashSet2.remove(bVar2)) {
                            cVar.k -= bVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((t6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ai.b bVar3 = (ai.b) obj2;
                        if (hashSet2.add(bVar3)) {
                            cVar.k += bVar3.c;
                        }
                    }
                }
            }
            cVar.c();
            z6Var.N.d();
            z6.g0(z6Var);
            return;
        }
        if (z6Var.H <= 0 || z6Var.getParentActivity() == null) {
            return;
        }
        s6Var.getClass();
        boolean z11 = true;
        ai.c cVar2 = new ai.c(true);
        SparseArray sparseArray2 = s6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = cVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((t6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((t6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = cVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((t6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = cVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((t6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = cVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((t6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = cVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((ai.b) arrayList3.get(i14));
            if (((ai.b) arrayList3.get(i14)).d == 0) {
                cVar2.r += ((ai.b) arrayList3.get(i14)).c;
            } else {
                cVar2.s += ((ai.b) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((ai.b) arrayList4.get(i15));
            cVar2.t += ((ai.b) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((ai.b) arrayList5.get(i16));
            cVar2.u += ((ai.b) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((ai.b) arrayList6.get(i17));
            cVar2.v += ((ai.b) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        cVar2.m = z11;
        cVar2.n = z11;
        cVar2.o = z11;
        cVar2.p = z11;
        cVar2.q = z11;
        Collections.sort(arrayList3, new a4.e(2));
        Collections.sort(arrayList4, new a4.e(2));
        Collections.sort(arrayList5, new a4.e(2));
        Collections.sort(arrayList6, new a4.e(2));
        Collections.sort(cVar2.h, new a4.e(2));
        kv kvVar = new kv(z6Var, s6Var, cVar2, new o0.a(z6Var, s6Var, false, 2));
        z6Var.T = kvVar;
        z6Var.showDialog(kvVar);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Components.eo0
    public int l0() {
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

    @Override // s4.e0
    public void m1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean n0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ boolean n1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
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
                gh0 gh0Var = (gh0) this.b;
                View view2 = null;
                gh0Var.O = null;
                int childCount = gh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = gh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || gh0Var.P.contains(view2)) ? false : true;
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

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean o0() {
        return false;
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        switch (this.a) {
            case 15:
                d5Var = ((org.telegram.ui.ActionBar.n2) ((ny) this.b).E0).parentLayout;
                ((ActionBarLayout) d5Var).r();
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

    @Override // org.telegram.ui.Components.i20
    public boolean onDown(MotionEvent motionEvent) {
        oj ojVar = (oj) this.b;
        View view = ojVar.a;
        if (view != null) {
            view.setPressed(true);
            ojVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ojVar.a.getBackground() != null) {
                ojVar.a.getBackground().setVisible(true, false);
            }
            ojVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.i20
    public void onLongPress(MotionEvent motionEvent) {
        oj ojVar = (oj) this.b;
        co coVar = ojVar.w;
        if (ojVar.a != null) {
            coVar.Q8 = org.telegram.ui.Components.p9.b(coVar, ojVar.v, coVar.T5, coVar.d(), coVar.ea);
            org.telegram.ui.ActionBar.n1 n1Var = coVar.Q8;
            if (n1Var != null) {
                ojVar.b = n1Var;
                n1Var.setOnDismissListener(new e0(ojVar, 2));
                coVar.x0.B0();
                coVar.z0.R = false;
                View view = ojVar.v;
                coVar.ob(view);
                coVar.g8(false, view != coVar.j1, 0.3f);
                coVar.h9(false);
                jl jlVar = coVar.z3;
                if (jlVar != null) {
                    jlVar.e(1, true);
                }
                UndoView undoView = coVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                mk mkVar = coVar.Y;
                if (mkVar == null || mkVar.getEditField() == null) {
                    return;
                }
                coVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // me.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                gh0 gh0Var = (gh0) this.b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(gh0Var.H, 450L);
                gh0Var.O = null;
                gh0Var.invalidate();
                gh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                gh0 gh0Var = (gh0) this.b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(gh0Var.H, 450L);
                View view2 = gh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                gh0Var.O = null;
                gh0Var.invalidate();
                gh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                gh0 gh0Var = (gh0) this.b;
                gh0.k(gh0Var, view, f7, f10);
                gh0.m(gh0Var, f7, false, false);
                gh0Var.invalidate();
                break;
        }
    }

    @Override // me.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                gh0 gh0Var = (gh0) this.b;
                gh0.k(gh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(gh0Var.H);
                gh0Var.setSkipDrawSelector(true);
                gh0.m(gh0Var, f7, true, false);
                gh0Var.invalidate();
                gh0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        oj ojVar = (oj) this.b;
        if (ojVar.e || (view = ojVar.a) == null) {
            return false;
        }
        view.callOnClick();
        ojVar.e = true;
        return true;
    }

    @Override // bi.lb
    public void p(long j3, int i10, bi.p4 p4Var) {
        h8 h8Var = (h8) this.b;
        if (h8Var.b == null) {
            p4Var.run();
        }
        h8Var.b.post(p4Var);
    }

    @Override // org.telegram.ui.nd1
    public void p1(boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        bd bdVar = (bd) this.b;
        f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
        if (f6Var instanceof ad) {
            f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) f6Var2).a;
            bdVar2.J = !bdVar2.J;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override // org.telegram.ui.Components.cl0
    public void q(float f7) {
        ((x10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ org.telegram.ui.Cells.r9 q2() {
        return null;
    }

    @Override // org.telegram.ui.pm
    public void r0(String str) {
        ((jk) this.b).b.da(str, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.Components.kq
    public /* synthetic */ void z() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.wp0
    public void z0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((j60) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.al0
    public void d(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        ub ubVar = (ub) this.b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (ubVar.t0.contains(Long.valueOf(j3))) {
                    ubVar.t0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.t0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ubVar.X0(true);
                ubVar.R0();
                ubVar.I.l();
                return;
            }
        }
        ubVar.P0(view, f7, f10);
    }

    private final void a2(float f7) {
    }

    private final void b2(float f7) {
    }

    private final void c2() {
    }

    private final void f2() {
    }

    private final /* synthetic */ void g2() {
    }

    private final void h2() {
    }

    private final void j2() {
    }

    private final /* synthetic */ void l2(boolean z10) {
    }

    private final /* synthetic */ void n2(boolean z10) {
    }

    private final /* synthetic */ void q1() {
    }

    private final /* synthetic */ void r1() {
    }

    private final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.kv0
    public /* synthetic */ void H(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.wp0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.pm
    public /* synthetic */ void V0(int i10) {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void W0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // bi.lb
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.p8
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.x11
    public void v(wk0 wk0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(org.telegram.ui.Cells.t1 t1Var, ah.u uVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void O0(int i10, int i11) {
    }

    @Override // org.telegram.ui.pm
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Y1(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    private final /* synthetic */ void C1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void E1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void P1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void R1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void V1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void X1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void x1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void y1(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void Z1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
