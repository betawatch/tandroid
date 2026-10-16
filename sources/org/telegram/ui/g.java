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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g implements y9, rv0, org.telegram.ui.web.b1, org.telegram.ui.Components.fp0, org.telegram.ui.Components.f5, org.telegram.ui.Components.nn0, m7, bi.ob, org.telegram.ui.Components.bm0, org.telegram.ui.Cells.l1, td1, sm, oe.a, org.telegram.ui.Components.dm0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.yq, org.telegram.ui.Components.xq0, s4.d0, org.telegram.ui.Components.r8, org.telegram.ui.Components.v20, r0.n, eu, b21, org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.nn0
    public void A() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.rv0
    public void C0(MessageObject messageObject) {
        o3 o3Var = ((k4) this.b).u0[0];
        if (o3Var != null) {
            o3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean C1() {
        return false;
    }

    @Override // s4.d0
    public void D(int i10, int i11) {
        ((s4.g0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int E0(int i10) {
        eq0 eq0Var = (eq0) this.b;
        int indexOfKey = eq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return eq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = eq0Var.s;
        return c6Var != null ? c6Var.E0(i10) : org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override // bi.ob
    public boolean G0(long j10, int i10, int i11, int i12, bi.pb pbVar) {
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
                                l8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) i8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    pbVar.c = imageReceiver;
                                    if (l8Var.i0 == null) {
                                        l8Var.i0 = new b1(this, 10);
                                    }
                                    pbVar.e = l8Var.i0;
                                    pbVar.a = i8Var;
                                    pbVar.g = l8Var.fragmentView;
                                    pbVar.h = AndroidUtilities.dp(36.0f);
                                    pbVar.i = l8Var.fragmentView.getBottom();
                                    pbVar.b = null;
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

    @Override // org.telegram.ui.y9
    public /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ah.g(this, i10, 17), 50L);
    }

    @Override // org.telegram.ui.Components.yq
    public /* synthetic */ int J0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public void J1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.y9
    public void K(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        qw qwVar = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) qwVar.b;
        h hVar2 = (h) qwVar.c;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(launchActivity, 3, null);
        a2Var.g0 = false;
        a2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new to(27, a2Var, hVar2));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle K1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // s4.d0
    public void O0(int i10, int i11) {
        ((s4.g0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        gj0 gj0Var = (gj0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        gj0Var.e = defaultWindowInsets;
        gj0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        gj0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ vv0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.fp0
    public void X(float f7, boolean z10) {
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
                    k4 k4Var = g4Var.f;
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
                    g4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                oc0 oc0Var = (oc0) this.b;
                qc0 qc0Var = oc0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    qc0Var.Y();
                    ArrayList arrayList2 = qc0Var.s;
                    if (arrayList2.isEmpty()) {
                        qc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new kc0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        qc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            oc0Var.performHapticFeedback(3, 1);
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
                ow0Var.M();
                ow0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.r8
    public void X0(int i10, int i11) {
        p70 p70Var = (p70) this.b;
        p70Var.W = i10;
        AndroidUtilities.updateVisibleRows(p70Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ ih.a Y() {
        return null;
    }

    @Override // org.telegram.ui.td1
    public boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.eu
    public void Z0(au auVar) {
        hk0 hk0Var = (hk0) this.b;
        hk0Var.E = true;
        String str = auVar.c;
        hk0Var.O.setText(str);
        hk0Var.w(str, auVar);
        hk0Var.E = false;
        AndroidUtilities.runOnUIThread(new zz(this, 29), 300L);
        hk0Var.Q.requestFocus();
        fk0 fk0Var = hk0Var.Q;
        fk0Var.setSelection(fk0Var.length());
    }

    @Override // org.telegram.ui.td1
    public boolean a() {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.a) {
            case 12:
                gd gdVar = (gd) this.b;
                c6Var = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
                if (c6Var == null) {
                    return org.telegram.ui.ActionBar.g6.I.q();
                }
                c6Var2 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
                return c6Var2.a();
            default:
                return ((eq0) this.b).S;
        }
    }

    @Override // org.telegram.ui.b21
    public void a0() {
        ((pk0) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int b0(int i10) {
        return E0(i10);
    }

    @Override // org.telegram.ui.Components.v20
    public void b1() {
        tj tjVar = (tj) this.b;
        View view = tjVar.a;
        if (view != null) {
            view.setPressed(false);
            tjVar.a.setSelected(false);
        }
        View view2 = tjVar.n;
        if (view2 == null || tjVar.d) {
            return;
        }
        view2.callOnClick();
        tjVar.d = true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.m7
    public void clear() {
        ((b7) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.dm0
    public boolean d(float f7, float f10, int i10, View view) {
        b20 b20Var = (b20) this.b;
        if (view instanceof org.telegram.ui.Cells.j7) {
            b20.a(b20Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            b20.a(b20Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            b20.a(b20Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f2) {
            b20.a(b20Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.s2) {
            if (!b20Var.o0.g()) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (s2Var.S(f7)) {
                    b20Var.i0.f(s2Var);
                    return true;
                }
            }
            b20.a(b20Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.m7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((p70) this.b).w.d(true);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.nn0
    public void f(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                z5 z5Var = ((s5) this.b).d;
                z5Var.b0 = i10;
                z5Var.H0(true);
                break;
            case 11:
                hc hcVar = ((fc) this.b).f;
                hcVar.y = i10;
                hcVar.d(true);
                break;
            default:
                sv svVar = (sv) this.b;
                if (svVar.f[0].f != i10) {
                    svVar.w = i10 == svVar.e.getFirstTabId();
                    rv rvVar = svVar.f[1];
                    rvVar.f = i10;
                    rvVar.setVisibility(0);
                    svVar.m0(true);
                    svVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int f1(int i10) {
        return E0(i10);
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

    @Override // org.telegram.ui.rv0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // org.telegram.ui.Components.fp0
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

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        eq0 eq0Var = (eq0) this.b;
        if (str.equals("drawableMsgIn")) {
            return eq0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return eq0Var.x;
        }
        org.telegram.ui.ActionBar.c6 c6Var = eq0Var.s;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.P0(str);
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
        ((b20) this.b).i0.finish();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.m7
    public void h1() {
        d7 d7Var = ((b7) this.b).e;
        ai.c cVar = d7Var.Y;
        if (cVar == null || cVar.j.size() <= 0) {
            return;
        }
        d7Var.Y.d();
        a7 a7Var = d7Var.N;
        if (a7Var != null) {
            a7Var.e(false);
            d7Var.N.d();
        }
    }

    @Override // oe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void j() {
        ac acVar = ((wb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            pf.d.r(acVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(acVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // s4.d0
    public void j0(int i10, int i11) {
        ((s4.g0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.m7
    public void j1(w6 w6Var, ai.b bVar, boolean z10) {
        HashSet hashSet;
        d7 d7Var = ((b7) this.b).e;
        if (w6Var == null) {
            if (bVar != null) {
                d7Var.Y.i(bVar);
                d7Var.N.d();
                d7.g0(d7Var);
                return;
            }
            return;
        }
        if (d7Var.Y.j.size() > 0 || z10) {
            ai.c cVar = d7Var.Y;
            HashSet hashSet2 = cVar.j;
            HashSet hashSet3 = cVar.l;
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
                        ai.b bVar2 = (ai.b) obj;
                        if (hashSet2.remove(bVar2)) {
                            cVar.k -= bVar2.c;
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
                        ai.b bVar3 = (ai.b) obj2;
                        if (hashSet2.add(bVar3)) {
                            cVar.k += bVar3.c;
                        }
                    }
                }
            }
            cVar.c();
            d7Var.N.d();
            d7.g0(d7Var);
            return;
        }
        if (d7Var.H <= 0 || d7Var.getParentActivity() == null) {
            return;
        }
        w6Var.getClass();
        boolean z11 = true;
        ai.c cVar2 = new ai.c(true);
        SparseArray sparseArray2 = w6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = cVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((x6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((x6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = cVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((x6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = cVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((x6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = cVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((x6) sparseArray2.get(4)).b);
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
        Collections.sort(arrayList3, new a4.d(3));
        Collections.sort(arrayList4, new a4.d(3));
        Collections.sort(arrayList5, new a4.d(3));
        Collections.sort(arrayList6, new a4.d(3));
        Collections.sort(cVar2.h, new a4.d(3));
        ov ovVar = new ov(d7Var, w6Var, cVar2, new n3.b(d7Var, w6Var, false, 5));
        d7Var.T = ovVar;
        d7Var.showDialog(ovVar);
    }

    @Override // org.telegram.ui.Components.yq
    public /* synthetic */ void k(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.fp0
    public int k0() {
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

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean m0() {
        return false;
    }

    @Override // s4.d0
    public void m1(int i10, int i11) {
        ((s4.g0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Components.nn0
    public /* synthetic */ boolean n1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
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
                return ((ry) this.b).E0.isInPreviewMode();
            default:
                lh0 lh0Var = (lh0) this.b;
                View view2 = null;
                lh0Var.O = null;
                int childCount = lh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = lh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || lh0Var.P.contains(view2)) ? false : true;
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override // org.telegram.ui.td1
    public void o1(boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        gd gdVar = (gd) this.b;
        c6Var = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
        if (c6Var instanceof fd) {
            c6Var2 = ((org.telegram.ui.ActionBar.m2) gdVar).resourceProvider;
            gd gdVar2 = ((fd) c6Var2).a;
            gdVar2.J = !gdVar2.J;
            gdVar2.d1();
            gdVar2.Z0(false);
        }
        gdVar.U0(a(), false);
        gdVar.Z0(false);
    }

    @Override // oe.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.m2) ((ry) this.b).E0).parentLayout;
                ((ActionBarLayout) b5Var).r();
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

    @Override // org.telegram.ui.Components.v20
    public boolean onDown(MotionEvent motionEvent) {
        tj tjVar = (tj) this.b;
        View view = tjVar.a;
        if (view != null) {
            view.setPressed(true);
            tjVar.a.setSelected(true);
            tjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.v20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.v20
    public void onLongPress(MotionEvent motionEvent) {
        tj tjVar = (tj) this.b;
        fo foVar = tjVar.w;
        if (tjVar.a != null) {
            foVar.Q8 = org.telegram.ui.Components.r9.b(foVar, tjVar.v, foVar.T5, foVar.d(), foVar.ea);
            org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
            if (m1Var != null) {
                tjVar.b = m1Var;
                m1Var.setOnDismissListener(new f0(tjVar, 2));
                foVar.x0.B0();
                foVar.z0.R = false;
                View view = tjVar.v;
                foVar.sb(view);
                foVar.j8(false, view != foVar.j1, 0.3f);
                foVar.m9(false);
                ol olVar = foVar.z3;
                if (olVar != null) {
                    olVar.e(1, true);
                }
                UndoView undoView = foVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                sk skVar = foVar.Y;
                if (skVar == null || skVar.getEditField() == null) {
                    return;
                }
                foVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // oe.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                lh0 lh0Var = (lh0) this.b;
                lh0.k(lh0Var, view, f7, f10);
                lh0.m(lh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(lh0Var.H, 450L);
                lh0Var.O = null;
                lh0Var.invalidate();
                lh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // oe.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                lh0 lh0Var = (lh0) this.b;
                lh0.k(lh0Var, view, f7, f10);
                lh0.m(lh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(lh0Var.H, 450L);
                View view2 = lh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                lh0Var.O = null;
                lh0Var.invalidate();
                lh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // oe.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                lh0 lh0Var = (lh0) this.b;
                lh0.k(lh0Var, view, f7, f10);
                lh0.m(lh0Var, f7, false, false);
                lh0Var.invalidate();
                break;
        }
    }

    @Override // oe.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                lh0 lh0Var = (lh0) this.b;
                lh0.k(lh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(lh0Var.H);
                lh0Var.setSkipDrawSelector(true);
                lh0.m(lh0Var, f7, true, false);
                lh0Var.invalidate();
                lh0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.v20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.v20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        tj tjVar = (tj) this.b;
        if (tjVar.e || (view = tjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        tjVar.e = true;
        return true;
    }

    @Override // bi.ob
    public void p(long j10, int i10, bi.r4 r4Var) {
        l8 l8Var = (l8) this.b;
        if (l8Var.b == null) {
            r4Var.run();
        }
        l8Var.b.post(r4Var);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.dm0
    public void q(float f7) {
        ((b20) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.sm
    public void r0(String str) {
        ((ok) this.b).b.ia(str, false);
    }

    @Override // org.telegram.ui.Components.xq0
    public void s0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((n60) this.b).l1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.yq
    public void t0(int i10, int i11, boolean z10) {
        tg.o oVar;
        switch (this.a) {
            case 18:
                tg.o oVar2 = ((o20) this.b).c.c;
                if (oVar2 != null) {
                    oVar2.I = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (oVar = ((o20) this.b).c.c) != null) {
                    oVar.H = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.p9 t2() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.Components.nn0
    public void w0(float f7) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                sv svVar = (sv) this.b;
                if (f7 != 1.0f || svVar.f[1].getVisibility() == 0) {
                    if (svVar.r) {
                        svVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        svVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * svVar.f[0].getMeasuredWidth()));
                    } else {
                        svVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        svVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - svVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        rv[] rvVarArr = svVar.f;
                        rv rvVar = rvVarArr[0];
                        rvVarArr[0] = rvVarArr[1];
                        rvVarArr[1] = rvVar;
                        rvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.yq
    public /* synthetic */ void y() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
        switch (this.a) {
            case 5:
                ((m5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        ac acVar = (ac) this.b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (acVar.p0.contains(Long.valueOf(j10))) {
                    acVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    acVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                acVar.W0(true);
                acVar.R0();
                acVar.E.l();
                return;
            }
        }
        acVar.P0(view, f7, f10);
    }

    private final void a2(float f7) {
    }

    private final void b2(float f7) {
    }

    private final void c2() {
    }

    private final void d2() {
    }

    private final /* synthetic */ void g2() {
    }

    private final void h2() {
    }

    private final void i2() {
    }

    private final /* synthetic */ void k2(boolean z10) {
    }

    private final /* synthetic */ void m2(boolean z10) {
    }

    private final /* synthetic */ void p1() {
    }

    private final /* synthetic */ void r1() {
    }

    private final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.rv0
    public /* synthetic */ void H(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
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
    public /* synthetic */ void O1() {
    }

    @Override // org.telegram.ui.sm
    public /* synthetic */ void R0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.xq0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void V0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // bi.ob
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2() {
    }

    @Override // org.telegram.ui.Components.r8
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r2() {
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

    @Override // org.telegram.ui.b21
    public void v(zk0 zk0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void M0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.sm
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    private final /* synthetic */ void D1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void F1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void G1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void I1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void W1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void u1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void v1(View view, float f7, float f10) {
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
    public /* synthetic */ void S0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void Y1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
