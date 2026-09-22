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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g implements u9, lv0, org.telegram.ui.web.c1, org.telegram.ui.Components.to0, org.telegram.ui.Components.c5, org.telegram.ui.Components.zm0, j7, ai.fc, org.telegram.ui.Components.nl0, org.telegram.ui.Cells.l1, od1, mm, me.a, org.telegram.ui.Components.pl0, org.telegram.ui.Cells.s7, org.telegram.ui.Components.lq, org.telegram.ui.Components.lq0, s4.e0, org.telegram.ui.Components.m8, org.telegram.ui.Components.i20, r0.n, au, v11, org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.to0
    public void B() {
        switch (this.a) {
            case 5:
                ((i5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Components.zm0
    public void C() {
        int i10 = this.a;
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.lv0
    public void D0(MessageObject messageObject) {
        l3 l3Var = ((h4) this.b).u0[0];
        if (l3Var != null) {
            l3Var.b.J0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        cq0 cq0Var = (cq0) this.b;
        int indexOfKey = cq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return cq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = cq0Var.s;
        return f6Var != null ? f6Var.F0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.j7
    public void H0(s6 s6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.b).e;
        if (s6Var == null) {
            if (aVar != null) {
                z6Var.c0.i(aVar);
                z6Var.M.e();
                z6.h0(z6Var);
                return;
            }
            return;
        }
        if (z6Var.c0.j.size() > 0 || z10) {
            zh.b bVar = z6Var.c0;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
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
                        zh.a aVar2 = (zh.a) obj;
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
                        zh.a aVar3 = (zh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            z6Var.M.e();
            z6.h0(z6Var);
            return;
        }
        if (z6Var.G <= 0 || z6Var.getParentActivity() == null) {
            return;
        }
        s6Var.getClass();
        boolean z11 = true;
        zh.b bVar2 = new zh.b(true);
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
        Collections.sort(arrayList3, new mb1(i18));
        Collections.sort(arrayList4, new mb1(i18));
        Collections.sort(arrayList5, new mb1(i18));
        Collections.sort(arrayList6, new mb1(i18));
        Collections.sort(bVar2.h, new mb1(i18));
        kv kvVar = new kv(z6Var, s6Var, bVar2, new m5.e(z6Var, s6Var, false, 6));
        z6Var.X = kvVar;
        z6Var.showDialog(kvVar);
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.n8(this, i10, 16), 50L);
    }

    @Override // org.telegram.ui.u9
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
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new oo(27, b2Var, hVar2));
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ int K0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // s4.e0
    public void M0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        dj0 dj0Var = (dj0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        dj0Var.e = defaultWindowInsets;
        dj0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        dj0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Components.m8
    public void U0(int i10, int i11) {
        l70 l70Var = (l70) this.b;
        l70Var.W = i10;
        AndroidUtilities.updateVisibleRows(l70Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.od1
    public boolean V0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.to0
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
                org.telegram.ui.Components.cw0 cw0Var = ((i5) this.b).b;
                cw0Var.M();
                cw0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean X0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ pv0 Y1() {
        return null;
    }

    @Override // ai.fc
    public void Z(long j3, int i10, ai.e5 e5Var) {
        i8 i8Var = (i8) this.b;
        if (i8Var.b == null) {
            e5Var.run();
        }
        i8Var.b.post(e5Var);
    }

    @Override // org.telegram.ui.au
    public void Z0(vt vtVar) {
        fk0 fk0Var = (fk0) this.b;
        fk0Var.E = true;
        String str = vtVar.c;
        fk0Var.O.setText(str);
        fk0Var.u(str, vtVar);
        fk0Var.E = false;
        AndroidUtilities.runOnUIThread(new g10(this, 28), 300L);
        fk0Var.Q.requestFocus();
        dk0 dk0Var = fk0Var.Q;
        dk0Var.setSelection(dk0Var.length());
    }

    @Override // org.telegram.ui.od1
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
                return ((cq0) this.b).S;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
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

    @Override // org.telegram.ui.Components.pl0
    public boolean c(float f7, float f10, int i10, View view) {
        x10 x10Var = (x10) this.b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            x10.a(x10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f2) {
            x10.a(x10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.s2) {
            if (!x10Var.o0.g()) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (s2Var.S(f7)) {
                    x10Var.i0.f(s2Var);
                    return true;
                }
            }
            x10.a(x10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.v11
    public void c0() {
        ((nk0) this.b).a();
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.j7
    public void clear() {
        ((x6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.zm0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((o5) this.b).d;
                v5Var.b0 = i10;
                v5Var.G0(true);
                break;
            case 11:
                dc dcVar = ((bc) this.b).f;
                dcVar.y = i10;
                dcVar.d(true);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.j7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((l70) this.b).w.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f0(int i10) {
        return F0(i10);
    }

    @Override // ai.fc
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
        i8 i8Var = (i8) this.b;
        if (i8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= i8Var.b.getChildCount()) {
                    break;
                }
                View childAt = i8Var.b.getChildAt(i13);
                if (childAt instanceof f8) {
                    f8 f8Var = (f8) childAt;
                    if (f8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < f8Var.n.size(); i14++) {
                            ArrayList arrayList = ((g8) f8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = f8Var.n.keyAt(i14);
                                i8Var.h0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) f8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    gcVar.c = imageReceiver;
                                    if (i8Var.i0 == null) {
                                        i8Var.i0 = new y0(this, 11);
                                    }
                                    gcVar.e = i8Var.i0;
                                    gcVar.a = f8Var;
                                    gcVar.g = i8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.i = i8Var.fragmentView.getBottom();
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

    @Override // org.telegram.ui.Components.pl0
    public void g() {
        ((x10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int g1(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.Components.to0
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.lv0
    public /* synthetic */ TextureView h0() {
        return null;
    }

    @Override // org.telegram.ui.j7
    public void h1() {
        z6 z6Var = ((x6) this.b).e;
        zh.b bVar = z6Var.c0;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        z6Var.c0.d();
        w6 w6Var = z6Var.M;
        if (w6Var != null) {
            w6Var.f(false);
            z6Var.M.e();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int i0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean i1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // me.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        switch (this.a) {
        }
        return false;
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
            nf.f.s(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // s4.e0
    public void k0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // s4.e0
    public void k1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void l(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.to0
    public int l0() {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ boolean m1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean n0() {
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

    @Override // org.telegram.ui.od1
    public void o1(boolean z10) {
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
        zn znVar = ojVar.w;
        if (ojVar.a != null) {
            znVar.Q8 = org.telegram.ui.Components.n9.b(znVar, ojVar.v, znVar.T5, znVar.d(), znVar.ea);
            org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
            if (n1Var != null) {
                ojVar.b = n1Var;
                n1Var.setOnDismissListener(new e0(ojVar, 2));
                znVar.x0.C0();
                znVar.z0.R = false;
                View view = ojVar.v;
                znVar.ob(view);
                znVar.g8(false, view != znVar.j1, 0.3f);
                znVar.h9(false);
                hl hlVar = znVar.z3;
                if (hlVar != null) {
                    hlVar.e(1, true);
                }
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                mk mkVar = znVar.Y;
                if (mkVar == null || mkVar.getEditField() == null) {
                    return;
                }
                znVar.Y.getEditField().setAllowDrawCursor(false);
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
        oj ojVar = (oj) this.b;
        if (ojVar.e || (view = ojVar.a) == null) {
            return false;
        }
        view.callOnClick();
        ojVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.pl0
    public void q(float f7) {
        ((x10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.mm
    public void s0(String str) {
        ((jk) this.b).b.da(str, false);
    }

    @Override // org.telegram.ui.Components.lq0
    public void t0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((i60) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.lq
    public void v0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.a) {
            case 18:
                sg.f fVar2 = ((k20) this.b).c.c;
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void y() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.zm0
    public void y0(float f7) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.s9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.nl0
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

    private final /* synthetic */ void p1() {
    }

    private final /* synthetic */ void r1() {
    }

    private final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.lv0
    public /* synthetic */ void H(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.mm
    public /* synthetic */ void R0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.lq0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // ai.fc
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.m8
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(String str) {
    }

    @Override // org.telegram.ui.u9
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

    @Override // org.telegram.ui.v11
    public void v(wk0 wk0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.mm
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void A1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void C1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void F1(View view, float f7, float f10) {
    }

    private final void t1(View view, float f7, float f10) {
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
    public /* synthetic */ void B0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
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
    public /* synthetic */ void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
