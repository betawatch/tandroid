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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g implements s9, ku0, org.telegram.ui.web.y0, org.telegram.ui.Components.pn0, org.telegram.ui.Components.x4, org.telegram.ui.Components.zl0, i7, jh.e9, org.telegram.ui.Components.qk0, org.telegram.ui.Cells.j1, ec1, em, vd.a, org.telegram.ui.Components.sk0, org.telegram.ui.Cells.m7, org.telegram.ui.Components.zp, org.telegram.ui.Components.gp0, f2.m0, org.telegram.ui.Components.f8, org.telegram.ui.Components.w10, r0.o, st, s01, org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.m0
    public void A(int i10, int i11) {
        ((f2.q0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.s9
    public void C(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        zr zrVar = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) zrVar.b;
        h hVar2 = (h) zrVar.c;
        Pattern pattern = LaunchActivity.x1;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity, 3, null);
        b2Var.c0 = false;
        b2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.K).sendRequest(tL_auth_acceptLoginToken, new v80(1, b2Var, hVar2));
    }

    @Override // org.telegram.ui.Components.zp
    public /* synthetic */ int D0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter F() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.s01
    public void G() {
        ((wj0) this.b).a();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new cg.w1(this, i10, 14), 50L);
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ni0 ni0Var = (ni0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ni0Var.e = defaultWindowInsets;
        ni0Var.C.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        ni0Var.B.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.i7
    public void J(s6 s6Var, ih.a aVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.b).e;
        if (s6Var == null) {
            if (aVar != null) {
                z6Var.U.i(aVar);
                z6Var.J.d();
                z6.g0(z6Var);
                return;
            }
            return;
        }
        if (z6Var.U.j.size() > 0 || z10) {
            ih.b bVar = z6Var.U;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j10 = s6Var.a;
            SparseArray sparseArray = s6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ih.a aVar2 = (ih.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
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
                        ih.a aVar3 = (ih.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            z6Var.J.d();
            z6.g0(z6Var);
            return;
        }
        if (z6Var.D <= 0 || z6Var.getParentActivity() == null) {
            return;
        }
        s6Var.getClass();
        boolean z11 = true;
        ih.b bVar2 = new ih.b(true);
        SparseArray sparseArray2 = s6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((t6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((t6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((t6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((t6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((t6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((ih.a) arrayList3.get(i14));
            if (((ih.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((ih.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((ih.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((ih.a) arrayList4.get(i15));
            bVar2.t += ((ih.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((ih.a) arrayList5.get(i16));
            bVar2.u += ((ih.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((ih.a) arrayList6.get(i17));
            bVar2.v += ((ih.a) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        int i18 = 22;
        Collections.sort(arrayList3, new a5.f(i18));
        Collections.sort(arrayList4, new a5.f(i18));
        Collections.sort(arrayList5, new a5.f(i18));
        Collections.sort(arrayList6, new a5.f(i18));
        Collections.sort(bVar2.h, new a5.f(i18));
        av avVar = new av(z6Var, s6Var, bVar2, new i6(0, z6Var, s6Var));
        z6Var.P = avVar;
        z6Var.showDialog(avVar);
    }

    @Override // org.telegram.ui.ku0
    public /* synthetic */ TextureView K() {
        return null;
    }

    @Override // f2.m0
    public void K0(int i10, int i11) {
        ((f2.q0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean L0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint N(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int N0(int i10) {
        ap0 ap0Var = (ap0) this.b;
        int indexOfKey = ap0Var.s.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return ap0Var.s.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = ap0Var.r;
        return c6Var != null ? c6Var.N0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ ou0 O1() {
        return null;
    }

    @Override // org.telegram.ui.Components.pn0
    public void P(float f10, boolean z10) {
        switch (this.a) {
            case 3:
                i4 i4Var = (i4) this.b;
                int round = Math.round(((i4Var.c - r2) * f10) + i4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    i4Var.f.q0[0].getAdapter().y.clear();
                    m4 m4Var = i4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        m4Var.q0[i10].c.l();
                        k4 k4Var = m4Var.q0[i10].c;
                        ArrayList arrayList = k4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(k4Var.G);
                        Utilities.globalQueue.postRunnable(k4Var.G, 100L);
                    }
                    i4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                vb0 vb0Var = (vb0) this.b;
                xb0 xb0Var = vb0Var.y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    xb0Var.Y();
                    ArrayList arrayList2 = xb0Var.s;
                    if (arrayList2.isEmpty()) {
                        xb0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new rb0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        xb0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            vb0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                j5.d = f10;
                org.telegram.ui.Components.zu0 zu0Var = ((j5) this.b).b;
                zu0Var.M();
                zu0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // f2.m0
    public void S(int i10, int i11) {
        ((f2.q0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Components.f8
    public void V0(int i10, int i11) {
        u60 u60Var = (u60) this.b;
        u60Var.S = i10;
        AndroidUtilities.updateVisibleRows(u60Var.b);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean X() {
        return false;
    }

    @Override // org.telegram.ui.ec1
    public boolean X0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.st
    public void Z0(nt ntVar) {
        oj0 oj0Var = (oj0) this.b;
        oj0Var.A = true;
        String str = ntVar.c;
        oj0Var.K.setText(str);
        oj0Var.v(str, ntVar);
        oj0Var.A = false;
        AndroidUtilities.runOnUIThread(new r00(this, 28), 300L);
        oj0Var.M.requestFocus();
        mj0 mj0Var = oj0Var.M;
        mj0Var.setSelection(mj0Var.length());
    }

    @Override // org.telegram.ui.ec1
    public boolean a() {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.a) {
            case 12:
                xc xcVar = (xc) this.b;
                c6Var = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
                if (c6Var == null) {
                    return org.telegram.ui.ActionBar.g6.I.q();
                }
                c6Var2 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
                return c6Var2.a();
            default:
                return ((ap0) this.b).F;
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public int a0() {
        switch (this.a) {
            case 3:
                i4 i4Var = (i4) this.b;
                return i4Var.c - i4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override // org.telegram.ui.Components.zl0
    public void b(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((p5) this.b).d;
                v5Var.X = i10;
                v5Var.G0(true);
                break;
            case 11:
                yb ybVar = ((wb) this.b).f;
                ybVar.y = i10;
                ybVar.d(true);
                break;
            default:
                ev evVar = (ev) this.b;
                if (evVar.f[0].f != i10) {
                    evVar.w = i10 == evVar.e.getFirstTabId();
                    dv dvVar = evVar.f[1];
                    dvVar.f = i10;
                    dvVar.setVisibility(0);
                    evVar.m0(true);
                    evVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int b0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.w10
    public void b1() {
        ej ejVar = (ej) this.b;
        View view = ejVar.a;
        if (view != null) {
            view.setPressed(false);
            ejVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ejVar.a.getBackground() != null) {
                ejVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ejVar.n;
        if (view2 == null || ejVar.d) {
            return;
        }
        view2.callOnClick();
        ejVar.d = true;
    }

    @Override // org.telegram.ui.Components.sk0
    public boolean c(float f10, float f11, int i10, View view) {
        i10 i10Var = (i10) this.b;
        if (view instanceof org.telegram.ui.Cells.f7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e7) {
            i10.a(i10Var, ((org.telegram.ui.Cells.e7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.d2) {
            i10.a(i10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.p2) {
            if (!i10Var.k0.f()) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (p2Var.S(f10)) {
                    i10Var.e0.f(p2Var);
                    return true;
                }
            }
            i10.a(i10Var, ((org.telegram.ui.Cells.p2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.i7
    public void clear() {
        ((x6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ qg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.i7, org.telegram.ui.Components.f8
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((u60) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // vd.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zp
    public /* synthetic */ void g(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.em
    public void g0(String str) {
        ((zj) this.b).b.da(str, false);
    }

    @Override // jh.e9
    public void g1(long j10, int i10, jh.l3 l3Var) {
        h8 h8Var = (h8) this.b;
        if (h8Var.b == null) {
            l3Var.run();
        }
        h8Var.b.post(l3Var);
    }

    @Override // org.telegram.ui.Components.pn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                i4 i4Var = (i4) this.b;
                return String.valueOf(Math.round((i4Var.a.getProgress() * (i4Var.c - r1)) + i4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        ap0 ap0Var = (ap0) this.b;
        if (str.equals("drawableMsgIn")) {
            return ap0Var.v;
        }
        if (str.equals("drawableMsgInSelected")) {
            return ap0Var.w;
        }
        org.telegram.ui.ActionBar.c6 c6Var = ap0Var.r;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override // vd.a
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

    @Override // org.telegram.ui.Components.gp0
    public void h0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((s50) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public void i() {
        ((i10) this.b).e0.finish();
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // vd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public void k() {
        qb qbVar = ((mb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            we.e.s(qbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            we.e.s(qbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // f2.m0
    public void k1(int i10, int i11) {
        ((f2.q0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean k2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.zl0
    public /* synthetic */ boolean l1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.Components.zp
    public /* synthetic */ void n() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.zp
    public void n0(int i10, int i11, boolean z10) {
        bg.j jVar;
        switch (this.a) {
            case 18:
                bg.j jVar2 = ((u10) this.b).c.c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (jVar = ((u10) this.b).c.c) != null) {
                    jVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ec1
    public void n1(boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        xc xcVar = (xc) this.b;
        c6Var = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
        if (c6Var instanceof wc) {
            c6Var2 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            xc xcVar2 = ((wc) c6Var2).a;
            xcVar2.F = !xcVar2.F;
            xcVar2.d1();
            xcVar2.Z0(false);
        }
        xcVar.U0(a(), false);
        xcVar.Z0(false);
    }

    @Override // vd.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // vd.a
    public boolean needClickAt(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                return ((yx) this.b).A0.isInPreviewMode();
            default:
                sg0 sg0Var = (sg0) this.b;
                View view2 = null;
                sg0Var.K = null;
                int childCount = sg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = sg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || sg0Var.L.contains(view2)) ? false : true;
        }
    }

    @Override // vd.a
    public boolean needLongPress(float f10, float f11) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public void o0(float f10) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                ev evVar = (ev) this.b;
                if (f10 != 1.0f || evVar.f[1].getVisibility() == 0) {
                    if (evVar.r) {
                        evVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        evVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * evVar.f[0].getMeasuredWidth()));
                    } else {
                        evVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        evVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - evVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        dv[] dvVarArr = evVar.f;
                        dv dvVar = dvVarArr[0];
                        dvVarArr[0] = dvVarArr[1];
                        dvVarArr[1] = dvVar;
                        dvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int o1(int i10) {
        return N0(i10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override // vd.a
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.n2) ((yx) this.b).A0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                break;
        }
    }

    @Override // vd.a
    public /* synthetic */ void onClickTouchDown(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // vd.a
    public /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // vd.a
    public /* synthetic */ void onClickTouchUp(View view, float f10, float f11) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onDown(MotionEvent motionEvent) {
        ej ejVar = (ej) this.b;
        View view = ejVar.a;
        if (view != null) {
            view.setPressed(true);
            ejVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ejVar.a.getBackground() != null) {
                ejVar.a.getBackground().setVisible(true, false);
            }
            ejVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.w10
    public void onLongPress(MotionEvent motionEvent) {
        ej ejVar = (ej) this.b;
        rn rnVar = ejVar.w;
        if (ejVar.a != null) {
            rnVar.M8 = org.telegram.ui.Components.f9.b(rnVar, ejVar.v, rnVar.P5, rnVar.b(), rnVar.aa);
            org.telegram.ui.ActionBar.n1 n1Var = rnVar.M8;
            if (n1Var != null) {
                ejVar.b = n1Var;
                n1Var.setOnDismissListener(new h0(ejVar, 2));
                rnVar.t0.B0();
                rnVar.v0.R = false;
                View view = ejVar.v;
                rnVar.ob(view);
                rnVar.g8(false, view != rnVar.f1, 0.3f);
                rnVar.h9(false);
                zk zkVar = rnVar.v3;
                if (zkVar != null) {
                    zkVar.e(1, true);
                }
                UndoView undoView = rnVar.u3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ck ckVar = rnVar.U;
                if (ckVar == null || ckVar.getEditField() == null) {
                    return;
                }
                rnVar.U.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // vd.a
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                sg0 sg0Var = (sg0) this.b;
                sg0.k(sg0Var, view, f10, f11);
                sg0.m(sg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(sg0Var.D, 450L);
                sg0Var.K = null;
                sg0Var.invalidate();
                sg0Var.M.a(false, true);
                break;
        }
    }

    @Override // vd.a
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                sg0 sg0Var = (sg0) this.b;
                sg0.k(sg0Var, view, f10, f11);
                sg0.m(sg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(sg0Var.D, 450L);
                View view2 = sg0Var.K;
                if (view2 != null) {
                    view2.performClick();
                }
                sg0Var.K = null;
                sg0Var.invalidate();
                sg0Var.M.a(false, true);
                break;
        }
    }

    @Override // vd.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 15:
                break;
            default:
                sg0 sg0Var = (sg0) this.b;
                sg0.k(sg0Var, view, f10, f11);
                sg0.m(sg0Var, f10, false, false);
                sg0Var.invalidate();
                break;
        }
    }

    @Override // vd.a
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                return false;
            default:
                sg0 sg0Var = (sg0) this.b;
                sg0.k(sg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(sg0Var.D);
                sg0Var.setSkipDrawSelector(true);
                sg0.m(sg0Var, f10, true, false);
                sg0Var.invalidate();
                sg0Var.M.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.w10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        ej ejVar = (ej) this.b;
        if (ejVar.e || (view = ejVar.a) == null) {
            return false;
        }
        view.callOnClick();
        ejVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int q0(int i10) {
        return N0(i10);
    }

    @Override // org.telegram.ui.Components.pn0
    public void r() {
        switch (this.a) {
            case 5:
                ((j5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public void s(float f10) {
        ((i10) this.b).e0.d(f10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean s1() {
        return false;
    }

    @Override // org.telegram.ui.i7
    public void t1() {
        z6 z6Var = ((x6) this.b).e;
        ih.b bVar = z6Var.U;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        z6Var.U.d();
        w6 w6Var = z6Var.J;
        if (w6Var != null) {
            w6Var.e(false);
            z6Var.J.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean u0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zl0
    public void w() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ku0
    public void w0(MessageObject messageObject) {
        q3 q3Var = ((m4) this.b).q0[0];
        if (q3Var != null) {
            q3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // jh.e9
    public boolean y0(long j10, int i10, int i11, int i12, jh.f9 f9Var) {
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
                                h8Var.d0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) e8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.c = imageReceiver;
                                    if (h8Var.e0 == null) {
                                        h8Var.e0 = new c1(this, 10);
                                    }
                                    f9Var.e = h8Var.e0;
                                    f9Var.a = e8Var;
                                    f9Var.g = h8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.i = h8Var.fragmentView.getBottom();
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
    public /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String z0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        MessageObject messageObject;
        qb qbVar = (qb) this.b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (qbVar.p0.contains(Long.valueOf(j10))) {
                    qbVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    qbVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                qbVar.X0(true);
                qbVar.R0();
                qbVar.E.l();
                return;
            }
        }
        qbVar.P0(view, f10, f11);
    }

    private final void X1(float f10) {
    }

    private final void Y1(float f10) {
    }

    private final void e2() {
    }

    private final void f2() {
    }

    private final /* synthetic */ void g2() {
    }

    private final void j2() {
    }

    private final void l2() {
    }

    private final /* synthetic */ void p1() {
    }

    private final /* synthetic */ void p2(boolean z10) {
    }

    private final /* synthetic */ void q1() {
    }

    private final /* synthetic */ void q2(boolean z10) {
    }

    private final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ void B() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void D1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.em
    public /* synthetic */ void P0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // jh.e9
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i0(int i10) {
    }

    @Override // org.telegram.ui.Components.f8
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.s01
    public void l(fk0 fk0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m2() {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.ku0
    public /* synthetic */ void y(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.em
    public /* synthetic */ void E(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void c1(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final /* synthetic */ void A1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void C1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void J1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void N1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void P1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void S1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void T1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void U1(View view, float f10, float f11) {
    }

    private final void w1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final /* synthetic */ void W1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
