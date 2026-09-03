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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h implements u9, yu0, org.telegram.ui.web.z0, org.telegram.ui.Components.jo0, org.telegram.ui.Components.y4, org.telegram.ui.Components.tm0, k7, oh.e9, org.telegram.ui.Components.jl0, org.telegram.ui.Cells.k1, ad1, km, yd.a, org.telegram.ui.Components.ll0, org.telegram.ui.Cells.p7, org.telegram.ui.Components.lq, org.telegram.ui.Components.aq0, f2.l0, org.telegram.ui.Components.g8, org.telegram.ui.Components.k20, r0.o, yt, j11, org.telegram.ui.ActionBar.g6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jo0
    public void A() {
        switch (this.a) {
            case 5:
                ((l5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.tm0
    public void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int B0(int i10) {
        np0 np0Var = (np0) this.b;
        int indexOfKey = np0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return np0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.g6 g6Var = np0Var.s;
        return g6Var != null ? g6Var.B0(i10) : org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override // f2.l0
    public void C(int i10, int i11) {
        ((f2.p0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ String E0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.k6.S0(str);
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ int H0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean H1() {
        return false;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        AndroidUtilities.runOnUIThread(new af.b(this, i10, 14), 50L);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ org.telegram.ui.Cells.n9 I2() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public void J(String str) {
        i iVar = (i) this.b;
        iVar.finishFragment(false);
        rs rsVar = iVar.x;
        LaunchActivity launchActivity = (LaunchActivity) rsVar.b;
        i iVar2 = (i) rsVar.c;
        Pattern pattern = LaunchActivity.y1;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(launchActivity, 3, null);
        d2Var.d0 = false;
        d2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.L).sendRequest(tL_auth_acceptLoginToken, new lo(27, d2Var, iVar2));
    }

    @Override // f2.l0
    public void L0(int i10, int i11) {
        ((f2.p0) this.b).t(i10, i11);
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        ti0 ti0Var = (ti0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ti0Var.e = defaultWindowInsets;
        ti0Var.D.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        ti0Var.C.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P1() {
        return false;
    }

    @Override // org.telegram.ui.Components.g8
    public void Q0(int i10, int i11) {
        f70 f70Var = (f70) this.b;
        f70Var.T = i10;
        AndroidUtilities.updateVisibleRows(f70Var.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.ad1
    public boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.yt
    public void V0(tt ttVar) {
        uj0 uj0Var = (uj0) this.b;
        uj0Var.B = true;
        String str = ttVar.c;
        uj0Var.L.setText(str);
        uj0Var.u(str, ttVar);
        uj0Var.B = false;
        AndroidUtilities.runOnUIThread(new c10(this, 28), 300L);
        uj0Var.N.requestFocus();
        rj0 rj0Var = uj0Var.N;
        rj0Var.setSelection(rj0Var.length());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle W1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
    public void X(float f10, boolean z4) {
        switch (this.a) {
            case 3:
                h4 h4Var = (h4) this.b;
                int round = Math.round(((h4Var.c - r2) * f10) + h4Var.b);
                if (round != SharedConfig.ivFontSize) {
                    SharedConfig.ivFontSize = round;
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                    edit.commit();
                    h4Var.f.r0[0].getAdapter().y.clear();
                    l4 l4Var = h4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        l4Var.r0[i10].c.l();
                        j4 j4Var = l4Var.r0[i10].c;
                        ArrayList arrayList = j4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(j4Var.H);
                        Utilities.globalQueue.postRunnable(j4Var.H, 100L);
                    }
                    h4Var.invalidate();
                    break;
                }
                break;
            case 4:
            default:
                dc0 dc0Var = (dc0) this.b;
                fc0 fc0Var = dc0Var.y;
                int round2 = Math.round(f10 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    fc0Var.Y();
                    ArrayList arrayList2 = fc0Var.s;
                    if (arrayList2.isEmpty()) {
                        fc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new zb0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        fc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            dc0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                l5.d = f10;
                org.telegram.ui.Components.pv0 pv0Var = ((l5) this.b).b;
                pv0Var.M();
                pv0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.k20
    public void X0() {
        kj kjVar = (kj) this.b;
        View view = kjVar.a;
        if (view != null) {
            view.setPressed(false);
            kjVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && kjVar.a.getBackground() != null) {
                kjVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = kjVar.n;
        if (view2 == null || kjVar.d) {
            return;
        }
        view2.callOnClick();
        kjVar.d = true;
    }

    @Override // org.telegram.ui.k7
    public void Y(u6 u6Var, nh.a aVar, boolean z4) {
        HashSet hashSet;
        b7 b7Var = ((z6) this.b).e;
        if (u6Var == null) {
            if (aVar != null) {
                b7Var.V.i(aVar);
                b7Var.K.d();
                b7.g0(b7Var);
                return;
            }
            return;
        }
        if (b7Var.V.j.size() > 0 || z4) {
            nh.b bVar = b7Var.V;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j10 = u6Var.a;
            SparseArray sparseArray = u6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        nh.a aVar2 = (nh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((v6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        nh.a aVar3 = (nh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            b7Var.K.d();
            b7.g0(b7Var);
            return;
        }
        if (b7Var.E <= 0 || b7Var.getParentActivity() == null) {
            return;
        }
        u6Var.getClass();
        boolean z10 = true;
        nh.b bVar2 = new nh.b(true);
        SparseArray sparseArray2 = u6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((v6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((v6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((v6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((v6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((v6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((nh.a) arrayList3.get(i14));
            if (((nh.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((nh.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((nh.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((nh.a) arrayList4.get(i15));
            bVar2.t += ((nh.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((nh.a) arrayList5.get(i16));
            bVar2.u += ((nh.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((nh.a) arrayList6.get(i17));
            bVar2.v += ((nh.a) arrayList6.get(i17)).c;
            i17++;
            z10 = true;
        }
        bVar2.m = z10;
        bVar2.n = z10;
        bVar2.o = z10;
        bVar2.p = z10;
        bVar2.q = z10;
        int i18 = 24;
        Collections.sort(arrayList3, new e5.f(i18));
        Collections.sort(arrayList4, new e5.f(i18));
        Collections.sort(arrayList5, new e5.f(i18));
        Collections.sort(arrayList6, new e5.f(i18));
        Collections.sort(bVar2.h, new e5.f(i18));
        hv hvVar = new hv(b7Var, u6Var, bVar2, new n7.qa(b7Var, u6Var, false, 9));
        b7Var.Q = hvVar;
        b7Var.showDialog(hvVar);
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ vg.a Z() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ad1
    public boolean a() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        switch (this.a) {
            case 12:
                bd bdVar = (bd) this.b;
                g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
                if (g6Var == null) {
                    return org.telegram.ui.ActionBar.k6.I.q();
                }
                g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
                return g6Var2.a();
            default:
                return ((np0) this.b).P;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // oh.e9
    public void b0(long j10, int i10, oh.l3 l3Var) {
        j8 j8Var = (j8) this.b;
        if (j8Var.b == null) {
            l3Var.run();
        }
        j8Var.b.post(l3Var);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean c(float f10, float f11, int i10, View view) {
        t10 t10Var = (t10) this.b;
        if (view instanceof org.telegram.ui.Cells.i7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.i7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.h7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e2) {
            t10.a(t10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            if (!t10Var.l0.f()) {
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                if (r2Var.S(f10)) {
                    t10Var.f0.f(r2Var);
                    return true;
                }
            }
            t10.a(t10Var, ((org.telegram.ui.Cells.r2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.k7
    public void clear() {
        ((z6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // org.telegram.ui.j11
    public void d0() {
        ((ck0) this.b).a();
    }

    @Override // org.telegram.ui.k7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((f70) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int e0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e2(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.tm0
    public void f(int i10, boolean z4) {
        switch (this.a) {
            case 6:
                y5 y5Var = ((r5) this.b).d;
                y5Var.Y = i10;
                y5Var.G0(true);
                break;
            case 11:
                ac acVar = ((yb) this.b).f;
                acVar.y = i10;
                acVar.d(true);
                break;
            default:
                lv lvVar = (lv) this.b;
                if (lvVar.f[0].f != i10) {
                    lvVar.w = i10 == lvVar.e.getFirstTabId();
                    kv kvVar = lvVar.f[1];
                    kvVar.f = i10;
                    kvVar.setVisibility(0);
                    lvVar.m0(true);
                    lvVar.r = z4;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.k7
    public void f1() {
        b7 b7Var = ((z6) this.b).e;
        nh.b bVar = b7Var.V;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        b7Var.V.d();
        y6 y6Var = b7Var.K;
        if (y6Var != null) {
            y6Var.e(false);
            b7Var.K.d();
        }
    }

    @Override // yd.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ cv0 g2() {
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
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

    @Override // org.telegram.ui.ActionBar.g6
    public Drawable getDrawable(String str) {
        np0 np0Var = (np0) this.b;
        if (str.equals("drawableMsgIn")) {
            return np0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return np0Var.x;
        }
        org.telegram.ui.ActionBar.g6 g6Var = np0Var.s;
        return g6Var != null ? g6Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.O0(str);
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

    @Override // org.telegram.ui.Components.ll0
    public void h() {
        ((t10) this.b).f0.finish();
    }

    @Override // org.telegram.ui.yu0
    public /* synthetic */ TextureView h0() {
        return null;
    }

    @Override // f2.l0
    public void i1(int i10, int i11) {
        ((f2.p0) this.b).r(i10, i11, null);
    }

    @Override // yd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public void j() {
        sb sbVar = ((ob) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            af.g.s(sbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            af.g.s(sbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // f2.l0
    public void j0(int i10, int i11) {
        ((f2.p0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Components.tm0
    public /* synthetic */ boolean j1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void k(boolean z4) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int k0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // oh.e9
    public boolean k1(long j10, int i10, int i11, int i12, oh.f9 f9Var) {
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
                                j8Var.e0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) g8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.c = imageReceiver;
                                    if (j8Var.f0 == null) {
                                        j8Var.f0 = new a1(this, 10);
                                    }
                                    f9Var.e = j8Var.f0;
                                    f9Var.a = g8Var;
                                    f9Var.g = j8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.i = j8Var.fragmentView.getBottom();
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

    @Override // org.telegram.ui.ActionBar.g6
    public void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ad1
    public void l1(boolean z4) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        bd bdVar = (bd) this.b;
        g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
        if (g6Var instanceof ad) {
            g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            bd bdVar2 = ((ad) g6Var2).a;
            bdVar2.G = !bdVar2.G;
            bdVar2.d1();
            bdVar2.Z0(false);
        }
        bdVar.U0(a(), false);
        bdVar.Z0(false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Components.jo0
    public int m0() {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean m1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean n0() {
        return false;
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
                return ((iy) this.b).B0.isInPreviewMode();
            default:
                yg0 yg0Var = (yg0) this.b;
                View view2 = null;
                yg0Var.L = null;
                int childCount = yg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = yg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f10 >= childAt.getLeft() && f10 <= childAt.getRight() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || yg0Var.M.contains(view2)) ? false : true;
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

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ boolean o0() {
        return false;
    }

    @Override // yd.a
    public void onClickAt(View view, float f10, float f11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.a) {
            case 15:
                f5Var = ((org.telegram.ui.ActionBar.p2) ((iy) this.b).B0).parentLayout;
                ((ActionBarLayout) f5Var).r();
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
        kj kjVar = (kj) this.b;
        View view = kjVar.a;
        if (view != null) {
            view.setPressed(true);
            kjVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && kjVar.a.getBackground() != null) {
                kjVar.a.getBackground().setVisible(true, false);
            }
            kjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.k20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.ui.Components.k20
    public void onLongPress(MotionEvent motionEvent) {
        kj kjVar = (kj) this.b;
        xn xnVar = kjVar.w;
        if (kjVar.a != null) {
            xnVar.N8 = org.telegram.ui.Components.h9.b(xnVar, kjVar.v, xnVar.Q5, xnVar.b(), xnVar.ba);
            org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
            if (p1Var != null) {
                kjVar.b = p1Var;
                p1Var.setOnDismissListener(new g0(kjVar, 2));
                xnVar.u0.B0();
                xnVar.w0.R = false;
                View view = kjVar.v;
                xnVar.ob(view);
                xnVar.g8(false, view != xnVar.g1, 0.3f);
                xnVar.h9(false);
                gl glVar = xnVar.w3;
                if (glVar != null) {
                    glVar.e(1, true);
                }
                UndoView undoView = xnVar.v3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                jk jkVar = xnVar.V;
                if (jkVar == null || jkVar.getEditField() == null) {
                    return;
                }
                xnVar.V.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // yd.a
    public void onLongPressCancelled(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                yg0 yg0Var = (yg0) this.b;
                yg0.k(yg0Var, view, f10, f11);
                yg0.m(yg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(yg0Var.E, 450L);
                yg0Var.L = null;
                yg0Var.invalidate();
                yg0Var.N.a(false, true);
                break;
        }
    }

    @Override // yd.a
    public void onLongPressFinish(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                break;
            default:
                yg0 yg0Var = (yg0) this.b;
                yg0.k(yg0Var, view, f10, f11);
                yg0.m(yg0Var, f10, false, true);
                AndroidUtilities.runOnUIThread(yg0Var.E, 450L);
                View view2 = yg0Var.L;
                if (view2 != null) {
                    view2.performClick();
                }
                yg0Var.L = null;
                yg0Var.invalidate();
                yg0Var.N.a(false, true);
                break;
        }
    }

    @Override // yd.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        switch (this.a) {
            case 15:
                break;
            default:
                yg0 yg0Var = (yg0) this.b;
                yg0.k(yg0Var, view, f10, f11);
                yg0.m(yg0Var, f10, false, false);
                yg0Var.invalidate();
                break;
        }
    }

    @Override // yd.a
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        switch (this.a) {
            case 15:
                return false;
            default:
                yg0 yg0Var = (yg0) this.b;
                yg0.k(yg0Var, view, f10, f11);
                AndroidUtilities.cancelRunOnUIThread(yg0Var.E);
                yg0Var.setSkipDrawSelector(true);
                yg0.m(yg0Var, f10, true, false);
                yg0Var.invalidate();
                yg0Var.N.a(true, true);
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
        kj kjVar = (kj) this.b;
        if (kjVar.e || (view = kjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        kjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Components.ll0
    public void p(float f10) {
        ((t10) this.b).f0.e(f10);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean q0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override // org.telegram.ui.km
    public void t0(String str) {
        ((gk) this.b).b.da(str, false);
    }

    @Override // org.telegram.ui.Components.aq0
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((d60) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Components.lq
    public void v0(int i10, int i11, boolean z4) {
        gg.j jVar;
        switch (this.a) {
            case 18:
                gg.j jVar2 = ((g20) this.b).c.c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (jVar = ((g20) this.b).c.c) != null) {
                    jVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean v2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.Components.tm0
    public void w0(float f10) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                lv lvVar = (lv) this.b;
                if (f10 != 1.0f || lvVar.f[1].getVisibility() == 0) {
                    if (lvVar.r) {
                        lvVar.f[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                        lvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * lvVar.f[0].getMeasuredWidth()));
                    } else {
                        lvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f10);
                        lvVar.f[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - lvVar.f[0].getMeasuredWidth());
                    }
                    if (f10 == 1.0f) {
                        kv[] kvVarArr = lvVar.f;
                        kv kvVar = kvVarArr[0];
                        kvVarArr[0] = kvVarArr[1];
                        kvVarArr[1] = kvVar;
                        kvVar.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.lq
    public /* synthetic */ void x() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.yu0
    public void y0(MessageObject messageObject) {
        p3 p3Var = ((l4) this.b).r0[0];
        if (p3Var != null) {
            p3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        MessageObject messageObject;
        sb sbVar = (sb) this.b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (sbVar.q0.contains(Long.valueOf(j10))) {
                    sbVar.q0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    sbVar.q0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                sbVar.X0(true);
                sbVar.R0();
                sbVar.F.l();
                return;
            }
        }
        sbVar.P0(view, f10, f11);
    }

    private final void E1(float f10) {
    }

    private final void F1(float f10) {
    }

    private final void G1() {
    }

    private final void I1() {
    }

    private final /* synthetic */ void K1() {
    }

    private final void M1() {
    }

    private final void Q1() {
    }

    private final /* synthetic */ void S1(boolean z4) {
    }

    private final /* synthetic */ void V1(boolean z4) {
    }

    private final /* synthetic */ void n1() {
    }

    private final /* synthetic */ void o1() {
    }

    private final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.yu0
    public /* synthetic */ void G(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void J1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void O0(int i10) {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Components.aq0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a2() {
    }

    @Override // oh.e9
    public /* synthetic */ void b(boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Components.g8
    public /* synthetic */ void h1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.j11
    public void u(lk0 lk0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void y(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L1(org.telegram.ui.Cells.t1 t1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void O1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q(org.telegram.ui.Cells.t1 t1Var, kh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void W(boolean z4, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void W0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void A1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void C1(View view, float f10, float f11) {
    }

    private final void r1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void t1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void u1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void w1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void x1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void y1(View view, float f10, float f11) {
    }

    private final /* synthetic */ void z1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void a1(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void d2(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void x0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final /* synthetic */ void D1(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
