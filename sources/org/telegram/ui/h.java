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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h implements q9, hu0, org.telegram.ui.web.y0, org.telegram.ui.Components.zn0, org.telegram.ui.Components.b5, org.telegram.ui.Components.jm0, g7, lh.e9, org.telegram.ui.Components.al0, org.telegram.ui.Cells.j1, hc1, fm, wd.a, org.telegram.ui.Components.cl0, org.telegram.ui.Cells.n7, org.telegram.ui.Components.fq, org.telegram.ui.Components.rp0, f2.l0, org.telegram.ui.Components.l8, org.telegram.ui.Components.e20, r0.o, qt, s01, org.telegram.ui.ActionBar.c6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int C0(int i10) {
        yo0 yo0Var = (yo0) this.b;
        int indexOfKey = yo0Var.s.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return yo0Var.s.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.c6 c6Var = yo0Var.r;
        return c6Var != null ? c6Var.C0(i10) : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.q9
    public /* synthetic */ String E0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    @Override // org.telegram.ui.Components.fq
    public /* synthetic */ int G0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // f2.l0
    public void H0(int i10, int i11) {
        ((f2.p0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new bg.f(this, i10, 17), 50L);
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ki0 ki0Var = (ki0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        ki0Var.e = defaultWindowInsets;
        ki0Var.C.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        ki0Var.B.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.q9
    public void J(String str) {
        i iVar = (i) this.b;
        iVar.finishFragment(false);
        xr xrVar = iVar.x;
        LaunchActivity launchActivity = (LaunchActivity) xrVar.b;
        i iVar2 = (i) xrVar.c;
        Pattern pattern = LaunchActivity.x1;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(launchActivity, 3, null);
        c2Var.c0 = false;
        c2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.K).sendRequest(tL_auth_acceptLoginToken, new u80(0, c2Var, iVar2));
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // lh.e9
    public boolean K0(long j10, int i10, int i11, int i12, lh.f9 f9Var) {
        f8 f8Var = (f8) this.b;
        if (f8Var.b != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= f8Var.b.getChildCount()) {
                    break;
                }
                View childAt = f8Var.b.getChildAt(i13);
                if (childAt instanceof c8) {
                    c8 c8Var = (c8) childAt;
                    if (c8Var.n == null) {
                        continue;
                    } else {
                        for (int i14 = 0; i14 < c8Var.n.size(); i14++) {
                            ArrayList arrayList = ((d8) c8Var.n.valueAt(i14)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i11))) {
                                int keyAt = c8Var.n.keyAt(i14);
                                f8Var.d0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) c8Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    f9Var.c = imageReceiver;
                                    if (f8Var.e0 == null) {
                                        f8Var.e0 = new c1(this, 10);
                                    }
                                    f9Var.e = f8Var.e0;
                                    f9Var.a = c8Var;
                                    f9Var.g = f8Var.fragmentView;
                                    f9Var.h = AndroidUtilities.dp(36.0f);
                                    f9Var.i = f8Var.fragmentView.getBottom();
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
    public /* synthetic */ boolean M0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.g7
    public void O0(q6 q6Var, kh.a aVar, boolean z10) {
        HashSet hashSet;
        x6 x6Var = ((v6) this.b).e;
        if (q6Var == null) {
            if (aVar != null) {
                x6Var.U.i(aVar);
                x6Var.J.d();
                x6.g0(x6Var);
                return;
            }
            return;
        }
        if (x6Var.U.j.size() > 0 || z10) {
            kh.b bVar = x6Var.U;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j10 = q6Var.a;
            SparseArray sparseArray = q6Var.d;
            if (hashSet3.contains(Long.valueOf(j10))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((r6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        kh.a aVar2 = (kh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((r6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        kh.a aVar3 = (kh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            x6Var.J.d();
            x6.g0(x6Var);
            return;
        }
        if (x6Var.D <= 0 || x6Var.getParentActivity() == null) {
            return;
        }
        q6Var.getClass();
        boolean z11 = true;
        kh.b bVar2 = new kh.b(true);
        SparseArray sparseArray2 = q6Var.d;
        Object obj3 = sparseArray2.get(0);
        ArrayList arrayList3 = bVar2.d;
        if (obj3 != null) {
            arrayList3.addAll(((r6) sparseArray2.get(0)).b);
        }
        if (sparseArray2.get(1) != null) {
            arrayList3.addAll(((r6) sparseArray2.get(1)).b);
        }
        Object obj4 = sparseArray2.get(2);
        ArrayList arrayList4 = bVar2.e;
        if (obj4 != null) {
            arrayList4.addAll(((r6) sparseArray2.get(2)).b);
        }
        Object obj5 = sparseArray2.get(3);
        ArrayList arrayList5 = bVar2.f;
        if (obj5 != null) {
            arrayList5.addAll(((r6) sparseArray2.get(3)).b);
        }
        Object obj6 = sparseArray2.get(4);
        ArrayList arrayList6 = bVar2.g;
        if (obj6 != null) {
            arrayList6.addAll(((r6) sparseArray2.get(4)).b);
        }
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((kh.a) arrayList3.get(i14));
            if (((kh.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((kh.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((kh.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((kh.a) arrayList4.get(i15));
            bVar2.t += ((kh.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((kh.a) arrayList5.get(i16));
            bVar2.u += ((kh.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((kh.a) arrayList6.get(i17));
            bVar2.v += ((kh.a) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        int i18 = 22;
        Collections.sort(arrayList3, new c5.e(i18));
        Collections.sort(arrayList4, new c5.e(i18));
        Collections.sort(arrayList5, new c5.e(i18));
        Collections.sort(arrayList6, new c5.e(i18));
        Collections.sort(bVar2.h, new c5.e(i18));
        yu yuVar = new yu(x6Var, q6Var, bVar2, new oc.i(x6Var, q6Var, false, 2));
        x6Var.P = yuVar;
        x6Var.showDialog(yuVar);
    }

    @Override // org.telegram.ui.Cells.j1
    public void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Components.l8
    public void T0(int i10, int i11) {
        t60 t60Var = (t60) this.b;
        t60Var.S = i10;
        AndroidUtilities.updateVisibleRows(t60Var.b);
    }

    @Override // org.telegram.ui.hc1
    public boolean U0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Components.zn0
    public void W(float f9, boolean z10) {
        switch (this.a) {
            case 3:
                i4 i4Var = (i4) this.b;
                int round = Math.round(((i4Var.c - r2) * f9) + i4Var.b);
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
                sb0 sb0Var = (sb0) this.b;
                ub0 ub0Var = sb0Var.y;
                int round2 = Math.round(f9 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    ub0Var.Y();
                    ArrayList arrayList2 = ub0Var.s;
                    if (arrayList2.isEmpty()) {
                        ub0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new ob0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        ub0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            sb0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 5:
                j5.d = f9;
                org.telegram.ui.Components.hv0 hv0Var = ((j5) this.b).b;
                hv0Var.M();
                hv0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ sg.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ lu0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean Z(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.qt
    public void Z0(lt ltVar) {
        kj0 kj0Var = (kj0) this.b;
        kj0Var.A = true;
        String str = ltVar.c;
        kj0Var.K.setText(str);
        kj0Var.u(str, ltVar);
        kj0Var.A = false;
        AndroidUtilities.runOnUIThread(new q00(this, 28), 300L);
        kj0Var.M.requestFocus();
        ij0 ij0Var = kj0Var.M;
        ij0Var.setSelection(ij0Var.length());
    }

    @Override // org.telegram.ui.hc1
    public boolean a() {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        switch (this.a) {
            case 12:
                vc vcVar = (vc) this.b;
                c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
                if (c6Var == null) {
                    return org.telegram.ui.ActionBar.g6.I.q();
                }
                c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
                return c6Var2.a();
            default:
                return ((yo0) this.b).F;
        }
    }

    @Override // org.telegram.ui.s01
    public void a0() {
        ((sj0) this.b).a();
    }

    @Override // org.telegram.ui.Components.e20
    public void a1() {
        fj fjVar = (fj) this.b;
        View view = fjVar.a;
        if (view != null) {
            view.setPressed(false);
            fjVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && fjVar.a.getBackground() != null) {
                fjVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = fjVar.n;
        if (view2 == null || fjVar.d) {
            return;
        }
        view2.callOnClick();
        fjVar.d = true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean a2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean b(float f9, float f10, int i10, View view) {
        h10 h10Var = (h10) this.b;
        if (view instanceof org.telegram.ui.Cells.g7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.g7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            h10.a(h10Var, ((org.telegram.ui.Cells.f7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.d2) {
            h10.a(h10Var, ((org.telegram.ui.Cells.d2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.p2) {
            if (!h10Var.k0.f()) {
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                if (p2Var.S(f9)) {
                    h10Var.e0.f(p2Var);
                    return true;
                }
            }
            h10.a(h10Var, ((org.telegram.ui.Cells.p2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.hu0
    public /* synthetic */ TextureView b0() {
        return null;
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.g7
    public void clear() {
        ((v6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.q9
    public /* synthetic */ boolean d1(String str, i9 i9Var) {
        return false;
    }

    @Override // org.telegram.ui.g7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((t60) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.jm0
    public void e(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((p5) this.b).d;
                v5Var.X = i10;
                v5Var.G0(true);
                break;
            case 11:
                wb wbVar = ((ub) this.b).f;
                wbVar.y = i10;
                wbVar.d(true);
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ int f0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // f2.l0
    public void f1(int i10, int i11) {
        ((f2.p0) this.b).r(i10, i11, null);
    }

    @Override // wd.a
    public /* synthetic */ boolean forceEnableVibration() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.Components.zn0
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
        yo0 yo0Var = (yo0) this.b;
        if (str.equals("drawableMsgIn")) {
            return yo0Var.v;
        }
        if (str.equals("drawableMsgInSelected")) {
            return yo0Var.w;
        }
        org.telegram.ui.ActionBar.c6 c6Var = yo0Var.r;
        return c6Var != null ? c6Var.getDrawable(str) : org.telegram.ui.ActionBar.g6.O0(str);
    }

    @Override // wd.a
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
        ((h10) this.b).e0.finish();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int h0(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override // org.telegram.ui.Components.fq
    public /* synthetic */ void i(boolean z10) {
        int i10 = this.a;
    }

    @Override // f2.l0
    public void i0(int i10, int i11) {
        ((f2.p0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Components.jm0
    public /* synthetic */ boolean i1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // wd.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f9, float f10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.hc1
    public void j1(boolean z10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        vc vcVar = (vc) this.b;
        c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
        if (c6Var instanceof uc) {
            c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            vc vcVar2 = ((uc) c6Var2).a;
            vcVar2.F = !vcVar2.F;
            vcVar2.d1();
            vcVar2.Z0(false);
        }
        vcVar.U0(a(), false);
        vcVar.Z0(false);
    }

    @Override // org.telegram.ui.Cells.j1
    public void k() {
        ob obVar = ((kb) this.b).n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            ye.d.s(obVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ye.d.s(obVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public int k0() {
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

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f9, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean l0() {
        return false;
    }

    @Override // lh.e9
    public void l1(long j10, int i10, lh.j3 j3Var) {
        f8 f8Var = (f8) this.b;
        if (f8Var.b == null) {
            j3Var.run();
        }
        f8Var.b.post(j3Var);
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean n0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override // wd.a
    public boolean needCancelTouchBySlopMove() {
        switch (this.a) {
            case 15:
                return true;
            default:
                return false;
        }
    }

    @Override // wd.a
    public boolean needClickAt(View view, float f9, float f10) {
        switch (this.a) {
            case 15:
                return ((xx) this.b).A0.isInPreviewMode();
            default:
                pg0 pg0Var = (pg0) this.b;
                View view2 = null;
                pg0Var.K = null;
                int childCount = pg0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = pg0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f9 >= childAt.getLeft() && f9 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || pg0Var.L.contains(view2)) ? false : true;
        }
    }

    @Override // wd.a
    public boolean needLongPress(float f9, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.g7
    public void o1() {
        x6 x6Var = ((v6) this.b).e;
        kh.b bVar = x6Var.U;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        x6Var.U.d();
        u6 u6Var = x6Var.J;
        if (u6Var != null) {
            u6Var.e(false);
            x6Var.J.d();
        }
    }

    @Override // wd.a
    public void onClickAt(View view, float f9, float f10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.o2) ((xx) this.b).A0).parentLayout;
                ((ActionBarLayout) b5Var).r();
                break;
        }
    }

    @Override // wd.a
    public /* synthetic */ void onClickTouchDown(View view, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // wd.a
    public /* synthetic */ void onClickTouchMove(View view, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // wd.a
    public /* synthetic */ void onClickTouchUp(View view, float f9, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onDown(MotionEvent motionEvent) {
        fj fjVar = (fj) this.b;
        View view = fjVar.a;
        if (view != null) {
            view.setPressed(true);
            fjVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && fjVar.a.getBackground() != null) {
                fjVar.a.getBackground().setVisible(true, false);
            }
            fjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.e20
    public void onLongPress(MotionEvent motionEvent) {
        fj fjVar = (fj) this.b;
        tn tnVar = fjVar.w;
        if (fjVar.a != null) {
            tnVar.M8 = org.telegram.ui.Components.l9.b(tnVar, fjVar.v, tnVar.P5, tnVar.b(), tnVar.aa);
            org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
            if (o1Var != null) {
                fjVar.b = o1Var;
                o1Var.setOnDismissListener(new h0(fjVar, 2));
                tnVar.t0.B0();
                tnVar.v0.R = false;
                View view = fjVar.v;
                tnVar.ob(view);
                tnVar.g8(false, view != tnVar.f1, 0.3f);
                tnVar.h9(false);
                al alVar = tnVar.v3;
                if (alVar != null) {
                    alVar.e(1, true);
                }
                UndoView undoView = tnVar.u3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                dk dkVar = tnVar.U;
                if (dkVar == null || dkVar.getEditField() == null) {
                    return;
                }
                tnVar.U.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // wd.a
    public void onLongPressCancelled(View view, float f9, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f9, f10);
                pg0.m(pg0Var, f9, false, true);
                AndroidUtilities.runOnUIThread(pg0Var.D, 450L);
                pg0Var.K = null;
                pg0Var.invalidate();
                pg0Var.M.a(false, true);
                break;
        }
    }

    @Override // wd.a
    public void onLongPressFinish(View view, float f9, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f9, f10);
                pg0.m(pg0Var, f9, false, true);
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

    @Override // wd.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f9, f10);
                pg0.m(pg0Var, f9, false, false);
                pg0Var.invalidate();
                break;
        }
    }

    @Override // wd.a
    public boolean onLongPressRequestedAt(View view, float f9, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                pg0 pg0Var = (pg0) this.b;
                pg0.k(pg0Var, view, f9, f10);
                AndroidUtilities.cancelRunOnUIThread(pg0Var.D);
                pg0Var.setSkipDrawSelector(true);
                pg0.m(pg0Var, f9, true, false);
                pg0Var.invalidate();
                pg0Var.M.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        fj fjVar = (fj) this.b;
        if (fjVar.e || (view = fjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        fjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Components.fq
    public /* synthetic */ void q() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.fm
    public void q0(String str) {
        ((ak) this.b).b.da(str, false);
    }

    @Override // org.telegram.ui.Components.cl0
    public void r(float f9) {
        ((h10) this.b).e0.e(f9);
    }

    @Override // org.telegram.ui.Components.rp0
    public void r0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((r50) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.fq
    public void s0(int i10, int i11, boolean z10) {
        dg.j jVar;
        switch (this.a) {
            case 18:
                dg.j jVar2 = ((t10) this.b).c.c;
                if (jVar2 != null) {
                    jVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (jVar = ((t10) this.b).c.c) != null) {
                    jVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jm0
    public void u0(float f9) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                cv cvVar = (cv) this.b;
                if (f9 != 1.0f || cvVar.f[1].getVisibility() == 0) {
                    if (cvVar.r) {
                        cvVar.f[0].setTranslationX((-f9) * r3.getMeasuredWidth());
                        cvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f9 * cvVar.f[0].getMeasuredWidth()));
                    } else {
                        cvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f9);
                        cvVar.f[1].setTranslationX((f9 * r3[0].getMeasuredWidth()) - cvVar.f[0].getMeasuredWidth());
                    }
                    if (f9 == 1.0f) {
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

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean u2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.zn0
    public void v() {
        switch (this.a) {
            case 5:
                ((j5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Components.jm0
    public void x() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.hu0
    public void x0(MessageObject messageObject) {
        q3 q3Var = ((m4) this.b).q0[0];
        if (q3Var != null) {
            q3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ String y(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ org.telegram.ui.Cells.l9 y2() {
        return null;
    }

    @Override // f2.l0
    public void z(int i10, int i11) {
        ((f2.p0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        MessageObject messageObject;
        ob obVar = (ob) this.b;
        if ((view instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject()) != null) {
            long j10 = messageObject.actionDeleteGroupEventId;
            if (j10 != -1) {
                if (obVar.p0.contains(Long.valueOf(j10))) {
                    obVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    obVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                obVar.X0(true);
                obVar.R0();
                obVar.E.l();
                return;
            }
        }
        obVar.P0(view, f9, f10);
    }

    private final void G1(float f9) {
    }

    private final void K1(float f9) {
    }

    private final void M1() {
    }

    private final void T1() {
    }

    private final /* synthetic */ void X1() {
    }

    private final void Z1() {
    }

    private final void d2() {
    }

    private final /* synthetic */ void f2(boolean z10) {
    }

    private final /* synthetic */ void h2(boolean z10) {
    }

    private final /* synthetic */ void n1() {
    }

    private final /* synthetic */ void q1() {
    }

    private final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void C1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.hu0
    public /* synthetic */ void D(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void K(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Components.rp0
    public /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void N1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.fm
    public /* synthetic */ void Q0(int i10) {
    }

    @Override // org.telegram.ui.q9
    public /* synthetic */ void S0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void T(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void X0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // lh.e9
    public /* synthetic */ void d(boolean z10) {
    }

    @Override // org.telegram.ui.Components.l8
    public /* synthetic */ void e1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.s01
    public void m(bk0 bk0Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void o(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.q9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void w2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.fm
    public /* synthetic */ void U(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void B1(View view, float f9, float f10) {
    }

    private final /* synthetic */ void D1(View view, float f9, float f10) {
    }

    private final void s1(View view, float f9, float f10) {
    }

    private final /* synthetic */ void t1(View view, float f9, float f10) {
    }

    private final /* synthetic */ void v1(View view, float f9, float f10) {
    }

    private final /* synthetic */ void w1(View view, float f9, float f10) {
    }

    private final /* synthetic */ void x1(View view, float f9, float f10) {
    }

    private final /* synthetic */ void y1(View view, float f9, float f10) {
    }

    private final /* synthetic */ void z1(View view, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void v0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final /* synthetic */ void E1(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public /* synthetic */ void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
