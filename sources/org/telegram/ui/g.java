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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g implements v9, nv0, org.telegram.ui.web.c1, org.telegram.ui.Components.fo0, org.telegram.ui.Components.b5, org.telegram.ui.Components.mm0, k7, ai.fc, org.telegram.ui.Components.bl0, org.telegram.ui.Cells.k1, od1, om, me.a, org.telegram.ui.Components.dl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.lq, org.telegram.ui.Components.xp0, s4.e0, org.telegram.ui.Components.l8, org.telegram.ui.Components.i20, r0.n, bu, x11, org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Components.fo0
    public void B() {
        switch (this.a) {
            case 5:
                ((i5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public void C() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.mm0
    public void C0(float f7) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                pv pvVar = (pv) this.b;
                if (f7 != 1.0f || pvVar.f[1].getVisibility() == 0) {
                    if (pvVar.r) {
                        pvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        pvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * pvVar.f[0].getMeasuredWidth()));
                    } else {
                        pvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        pvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - pvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        ov[] ovVarArr = pvVar.f;
                        ov ovVar = ovVarArr[0];
                        ovVarArr[0] = ovVarArr[1];
                        ovVarArr[1] = ovVar;
                        ovVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.nv0
    public void E0(MessageObject messageObject) {
        l3 l3Var = ((h4) this.b).u0[0];
        if (l3Var != null) {
            l3Var.b.J0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int G0(int i10) {
        cq0 cq0Var = (cq0) this.b;
        int indexOfKey = cq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cq0Var.s;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.k7
    public void H0(t6 t6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        a7 a7Var = ((y6) this.b).e;
        if (t6Var == null) {
            if (aVar != null) {
                a7Var.c0.i(aVar);
                a7Var.M.e();
                a7.h0(a7Var);
                return;
            }
            return;
        }
        if (a7Var.c0.j.size() > 0 || z10) {
            zh.b bVar = a7Var.c0;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j3 = t6Var.a;
            SparseArray sparseArray = t6Var.d;
            if (hashSet3.contains(Long.valueOf(j3))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((u6) sparseArray.valueAt(i10)).b;
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
                    ArrayList arrayList2 = ((u6) sparseArray.valueAt(i12)).b;
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
            a7Var.M.e();
            a7.h0(a7Var);
            return;
        }
        if (a7Var.G <= 0 || a7Var.getParentActivity() == null) {
            return;
        }
        t6Var.getClass();
        boolean z11 = true;
        zh.b bVar2 = new zh.b(true);
        SparseArray sparseArray2 = t6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((u6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((u6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((u6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((u6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((u6) sparseArray2.get(4)).b);
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
        int i18 = 26;
        Collections.sort(arrayList3, new lb1(i18));
        Collections.sort(arrayList4, new lb1(i18));
        Collections.sort(arrayList5, new lb1(i18));
        Collections.sort(arrayList6, new lb1(i18));
        Collections.sort(bVar2.h, new lb1(i18));
        lv lvVar = new lv(a7Var, t6Var, bVar2, new o0.a(a7Var, t6Var, false, 2));
        a7Var.X = lvVar;
        a7Var.showDialog(lvVar);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.n8(this, i10, 16), 50L);
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.v9
    public void K(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        f20 f20Var = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) f20Var.b;
        h hVar2 = (h) f20Var.c;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.g0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new qo(27, c2Var, hVar2));
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ int K0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // s4.e0
    public void O0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle O1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        dj0 dj0Var = (dj0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        dj0Var.e = defaultWindowInsets;
        dj0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        dj0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Components.l8
    public void U0(int i10, int i11) {
        n70 n70Var = (n70) this.b;
        n70Var.W = i10;
        AndroidUtilities.updateVisibleRows(n70Var.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.fo0
    public void X(float f7, boolean z10) {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                int round = Math.round(((d4Var.c - r2) * f7) + d4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    d4Var.f.u0[0].getAdapter().y.clear();
                    h4 h4Var = d4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        h4Var.u0[i10].c.l();
                        f4 f4Var = h4Var.u0[i10].c;
                        ArrayList arrayList = f4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(f4Var.K);
                        Utilities.globalQueue.postRunnable(f4Var.K, 100L);
                    }
                    d4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                nc0 nc0Var = (nc0) this.b;
                pc0 pc0Var = nc0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    pc0Var.Y();
                    ArrayList arrayList2 = pc0Var.s;
                    if (arrayList2.isEmpty()) {
                        pc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new jc0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        pc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            nc0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                i5.d = f7;
                org.telegram.ui.Components.qv0 qv0Var = ((i5) this.b).b;
                qv0Var.M();
                qv0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.od1
    public boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ rv0 Y1() {
        return null;
    }

    @Override // ai.fc
    public void Z(long j3, int i10, ai.e5 e5Var) {
        j8 j8Var = (j8) this.b;
        if (j8Var.b == null) {
            e5Var.run();
        }
        j8Var.b.post(e5Var);
    }

    @Override // org.telegram.ui.od1
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.a) {
            case 12:
                cd cdVar = (cd) this.b;
                f6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.I.q();
                }
                f6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
                return f6Var2.a();
            default:
                return ((cq0) this.b).S;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.bu
    public void a1(xt xtVar) {
        ek0 ek0Var = (ek0) this.b;
        ek0Var.E = true;
        String str = xtVar.c;
        ek0Var.O.setText(str);
        ek0Var.u(str, xtVar);
        ek0Var.E = false;
        AndroidUtilities.runOnUIThread(new i10(this, 28), 300L);
        ek0Var.Q.requestFocus();
        ck0 ck0Var = ek0Var.Q;
        ck0Var.setSelection(ck0Var.length());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.i20
    public void b1() {
        pj pjVar = (pj) this.b;
        View view = pjVar.a;
        if (view != null) {
            view.setPressed(false);
            pjVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && pjVar.a.getBackground() != null) {
                pjVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = pjVar.n;
        if (view2 == null || pjVar.d) {
            return;
        }
        view2.callOnClick();
        pjVar.d = true;
    }

    @Override // org.telegram.ui.Components.dl0
    public boolean c(float f7, float f10, int i10, View view) {
        z10 z10Var = (z10) this.b;
        if (view instanceof org.telegram.ui.Cells.j7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e2) {
            z10.a(z10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            if (!z10Var.o0.g()) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (r2Var.S(f7)) {
                    z10Var.i0.f(r2Var);
                    return true;
                }
            }
            z10.a(z10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.x11
    public void c0() {
        ((mk0) this.b).a();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.k7
    public void clear() {
        ((y6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.mm0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((o5) this.b).d;
                v5Var.b0 = i10;
                v5Var.G0(true);
                break;
            case 11:
                ec ecVar = ((cc) this.b).f;
                ecVar.y = i10;
                ecVar.d(true);
                break;
            default:
                pv pvVar = (pv) this.b;
                if (pvVar.f[0].f != i10) {
                    pvVar.w = i10 == pvVar.e.getFirstTabId();
                    ov ovVar = pvVar.f[1];
                    ovVar.f = i10;
                    ovVar.setVisibility(0);
                    pvVar.m0(true);
                    pvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.k7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((n70) this.b).w.dismiss();
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

    @Override // org.telegram.ui.v9
    public /* synthetic */ boolean e1(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // ai.fc
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        j8 j8Var = (j8) this.b;
        if (j8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= j8Var.b.getChildCount()) {
                    break;
                }
                View childAt = j8Var.b.getChildAt(i13);
                if (childAt instanceof g8) {
                    g8 g8Var = (g8) childAt;
                    if (g8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < g8Var.n.size(); i14++) {
                            ArrayList arrayList = ((h8) g8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = g8Var.n.keyAt(i14);
                                j8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.c = imageReceiver;
                                    if (j8Var.i0 == null) {
                                        j8Var.i0 = new y0(this, 11);
                                    }
                                    gcVar.e = j8Var.i0;
                                    gcVar.a = g8Var;
                                    gcVar.g = j8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.i = j8Var.fragmentView.getBottom();
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
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public void g() {
        ((z10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.Components.fo0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                return String.valueOf(Math.round((d4Var.a.getProgress() * (d4Var.c - r1)) + d4Var.b));
            case 4:
            default:
                return " ";
            case 5:
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        cq0 cq0Var = (cq0) this.b;
        if (str.equals("drawableMsgIn")) {
            return cq0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return cq0Var.x;
        }
        org.telegram.ui.ActionBar.f6 f6Var = cq0Var.s;
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String h(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.messenger.wl.a(messageObject);
    }

    @Override // org.telegram.ui.k7
    public void i1() {
        a7 a7Var = ((y6) this.b).e;
        zh.b bVar = a7Var.c0;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        a7Var.c0.d();
        x6 x6Var = a7Var.M;
        if (x6Var != null) {
            x6Var.f(false);
            a7Var.M.e();
        }
    }

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.nv0
    public /* synthetic */ TextureView j0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public void k() {
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

    @Override // s4.e0
    public void k0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void l(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return false;
    }

    @Override // s4.e0
    public void l1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Components.fo0
    public int m0() {
        switch (this.a) {
            case 3:
                d4 d4Var = (d4) this.b;
                return d4Var.c - d4Var.b;
            case 4:
            default:
                return 0;
            case 5:
                return 0;
        }
    }

    @Override // org.telegram.ui.Components.mm0
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
                return ((py) this.b).E0.isInPreviewMode();
            default:
                ih0 ih0Var = (ih0) this.b;
                View view2 = null;
                ih0Var.O = null;
                int childCount = ih0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ih0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || ih0Var.P.contains(view2)) ? false : true;
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.od1
    public void o1(boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        cd cdVar = (cd) this.b;
        f6Var = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
        if (f6Var instanceof bd) {
            f6Var2 = ((org.telegram.ui.ActionBar.o2) cdVar).resourceProvider;
            cd cdVar2 = ((bd) f6Var2).a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        }
        cdVar.U0(a(), false);
        cdVar.Z0(false);
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        switch (this.a) {
            case 15:
                e5Var = ((org.telegram.ui.ActionBar.o2) ((py) this.b).E0).parentLayout;
                ((ActionBarLayout) e5Var).r();
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
        pj pjVar = (pj) this.b;
        View view = pjVar.a;
        if (view != null) {
            view.setPressed(true);
            pjVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && pjVar.a.getBackground() != null) {
                pjVar.a.getBackground().setVisible(true, false);
            }
            pjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.i20
    public void onLongPress(MotionEvent motionEvent) {
        pj pjVar = (pj) this.b;
        bo boVar = pjVar.w;
        if (pjVar.a != null) {
            boVar.Q8 = org.telegram.ui.Components.m9.b(boVar, pjVar.v, boVar.T5, boVar.d(), boVar.ea);
            org.telegram.ui.ActionBar.o1 o1Var = boVar.Q8;
            if (o1Var != null) {
                pjVar.b = o1Var;
                o1Var.setOnDismissListener(new e0(pjVar, 2));
                boVar.x0.C0();
                boVar.z0.R = false;
                View view = pjVar.v;
                boVar.ob(view);
                boVar.g8(false, view != boVar.j1, 0.3f);
                boVar.h9(false);
                jl jlVar = boVar.z3;
                if (jlVar != null) {
                    jlVar.e(1, true);
                }
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                nk nkVar = boVar.Y;
                if (nkVar == null || nkVar.getEditField() == null) {
                    return;
                }
                boVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // me.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                ih0 ih0Var = (ih0) this.b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ih0Var.H, 450L);
                ih0Var.O = null;
                ih0Var.invalidate();
                ih0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                ih0 ih0Var = (ih0) this.b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ih0Var.H, 450L);
                View view2 = ih0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                ih0Var.O = null;
                ih0Var.invalidate();
                ih0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                ih0 ih0Var = (ih0) this.b;
                ih0.k(ih0Var, view, f7, f10);
                ih0.m(ih0Var, f7, false, false);
                ih0Var.invalidate();
                break;
        }
    }

    @Override // me.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                ih0 ih0Var = (ih0) this.b;
                ih0.k(ih0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(ih0Var.H);
                ih0Var.setSkipDrawSelector(true);
                ih0.m(ih0Var, f7, true, false);
                ih0Var.invalidate();
                ih0Var.Q.a(true, true);
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
        pj pjVar = (pj) this.b;
        if (pjVar.e || (view = pjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        pjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public void q(float f7) {
        ((z10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.om
    public void s0(String str) {
        ((kk) this.b).b.da(str, false);
    }

    @Override // org.telegram.ui.Components.xp0
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((k60) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.Components.lq
    public void x0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.a) {
            case 18:
                sg.f fVar2 = ((m20) this.b).c.c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (fVar = ((m20) this.b).c.c) != null) {
                    fVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void y() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.bl0
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
    public /* synthetic */ void C1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void D0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.nv0
    public /* synthetic */ void H(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.om
    public /* synthetic */ void S0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.xp0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // ai.fc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.l8
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.v9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2() {
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
    public void v(vk0 vk0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.om
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void g2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void b2(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
