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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g implements t9, nv0, org.telegram.ui.web.b1, org.telegram.ui.Components.no0, org.telegram.ui.Components.c5, org.telegram.ui.Components.vm0, h7, zh.q7, org.telegram.ui.Components.kl0, org.telegram.ui.Cells.k1, rd1, qm, me.a, org.telegram.ui.Components.ml0, org.telegram.ui.Cells.s7, org.telegram.ui.Components.rq, org.telegram.ui.Components.hq0, s4.e0, org.telegram.ui.Components.n8, org.telegram.ui.Components.r20, r0.n, au, b21, org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.vm0
    public void B() {
        int i10 = this.a;
    }

    @Override // s4.e0
    public void C(int i10, int i11) {
        ((s4.h0) this.b).p(i10, i11);
    }

    @Override // org.telegram.ui.nv0
    public void D0(MessageObject messageObject) {
        n3 n3Var = ((j4) this.b).u0[0];
        if (n3Var != null) {
            n3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean E1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint F(String str) {
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        bq0 bq0Var = (bq0) this.b;
        int indexOfKey = bq0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bq0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bq0Var.s;
        return f6Var != null ? f6Var.F0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean G1() {
        return false;
    }

    @Override // zh.q7
    public void H0(long j3, int i10, zh.j2 j2Var) {
        h8 h8Var = (h8) this.b;
        if (h8Var.b == null) {
            j2Var.run();
        }
        h8Var.b.post(j2Var);
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new bi.s(this, i10, 15), 50L);
    }

    @Override // org.telegram.ui.t9
    public void J(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        l80 l80Var = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) l80Var.b;
        h hVar2 = (h) l80Var.c;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(launchActivity, 3, null);
        d2Var.g0 = false;
        d2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new org.telegram.ui.Components.th(22, d2Var, hVar2));
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.Components.rq
    public /* synthetic */ int K0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ CharacterStyle M1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // s4.e0
    public void O0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        cj0 cj0Var = (cj0) this.b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cj0Var.e = defaultWindowInsets;
        cj0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        cj0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int U() {
        return 0;
    }

    @Override // org.telegram.ui.Components.n8
    public void U0(int i10, int i11) {
        k70 k70Var = (k70) this.b;
        k70Var.W = i10;
        AndroidUtilities.updateVisibleRows(k70Var.b);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Components.no0
    public void W(float f7, boolean z10) {
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
                    j4 j4Var = f4Var.f;
                    for (int i10 = 0; i10 < 2; i10++) {
                        j4Var.u0[i10].c.l();
                        h4 h4Var = j4Var.u0[i10].c;
                        ArrayList arrayList = h4Var.d;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i11);
                            if (pageBlock != null) {
                                pageBlock.cachedWidth = 0;
                                pageBlock.cachedHeight = 0;
                            }
                        }
                        Utilities.globalQueue.cancelRunnable(h4Var.K);
                        Utilities.globalQueue.postRunnable(h4Var.K, 100L);
                    }
                    f4Var.invalidate();
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
                org.telegram.ui.Components.aw0 aw0Var = ((i5) this.b).b;
                aw0Var.M();
                aw0Var.N();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ gh.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ rv0 X1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.rd1
    public boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean Y1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.b21
    public void Z() {
        ((mk0) this.b).a();
    }

    @Override // org.telegram.ui.rd1
    public boolean a() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        switch (this.a) {
            case 12:
                cd cdVar = (cd) this.b;
                f6Var = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
                if (f6Var == null) {
                    return org.telegram.ui.ActionBar.j6.I.q();
                }
                f6Var2 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
                return f6Var2.a();
            default:
                return ((bq0) this.b).S;
        }
    }

    @Override // org.telegram.ui.h7
    public void a0(r6 r6Var, yh.a aVar, boolean z10) {
        HashSet hashSet;
        y6 y6Var = ((w6) this.b).e;
        if (r6Var == null) {
            if (aVar != null) {
                y6Var.Y.i(aVar);
                y6Var.N.d();
                y6.g0(y6Var);
                return;
            }
            return;
        }
        if (y6Var.Y.j.size() > 0 || z10) {
            yh.b bVar = y6Var.Y;
            HashSet hashSet2 = bVar.j;
            HashSet hashSet3 = bVar.l;
            long j3 = r6Var.a;
            SparseArray sparseArray = r6Var.d;
            if (hashSet3.contains(Long.valueOf(j3))) {
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    ArrayList arrayList = ((s6) sparseArray.valueAt(i10)).b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        yh.a aVar2 = (yh.a) obj;
                        if (hashSet2.remove(aVar2)) {
                            bVar.k -= aVar2.c;
                        }
                    }
                }
            } else {
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ArrayList arrayList2 = ((s6) sparseArray.valueAt(i12)).b;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        yh.a aVar3 = (yh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            y6Var.N.d();
            y6.g0(y6Var);
            return;
        }
        if (y6Var.H <= 0 || y6Var.getParentActivity() == null) {
            return;
        }
        r6Var.getClass();
        boolean z11 = true;
        yh.b bVar2 = new yh.b(true);
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
        int i14 = 0;
        while (true) {
            int size3 = arrayList3.size();
            hashSet = bVar2.j;
            if (i14 >= size3) {
                break;
            }
            hashSet.add((yh.a) arrayList3.get(i14));
            if (((yh.a) arrayList3.get(i14)).d == 0) {
                bVar2.r += ((yh.a) arrayList3.get(i14)).c;
            } else {
                bVar2.s += ((yh.a) arrayList3.get(i14)).c;
            }
            i14++;
        }
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            hashSet.add((yh.a) arrayList4.get(i15));
            bVar2.t += ((yh.a) arrayList4.get(i15)).c;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            hashSet.add((yh.a) arrayList5.get(i16));
            bVar2.u += ((yh.a) arrayList5.get(i16)).c;
        }
        int i17 = 0;
        while (i17 < arrayList6.size()) {
            hashSet.add((yh.a) arrayList6.get(i17));
            bVar2.v += ((yh.a) arrayList6.get(i17)).c;
            i17++;
            z11 = true;
        }
        bVar2.m = z11;
        bVar2.n = z11;
        bVar2.o = z11;
        bVar2.p = z11;
        bVar2.q = z11;
        int i18 = 19;
        Collections.sort(arrayList3, new sg.p(i18));
        Collections.sort(arrayList4, new sg.p(i18));
        Collections.sort(arrayList5, new sg.p(i18));
        Collections.sort(arrayList6, new sg.p(i18));
        Collections.sort(bVar2.h, new sg.p(i18));
        lv lvVar = new lv(y6Var, r6Var, bVar2, new n7.a1(y6Var, r6Var, false, 4));
        y6Var.T = lvVar;
        y6Var.showDialog(lvVar);
    }

    @Override // org.telegram.ui.au
    public void a1(wt wtVar) {
        ek0 ek0Var = (ek0) this.b;
        ek0Var.E = true;
        String str = wtVar.c;
        ek0Var.O.setText(str);
        ek0Var.u(str, wtVar);
        ek0Var.E = false;
        AndroidUtilities.runOnUIThread(new i10(this, 28), 300L);
        ek0Var.Q.requestFocus();
        ck0 ck0Var = ek0Var.Q;
        ck0Var.setSelection(ck0Var.length());
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void b1() {
        qj qjVar = (qj) this.b;
        View view = qjVar.a;
        if (view != null) {
            view.setPressed(false);
            qjVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && qjVar.a.getBackground() != null) {
                qjVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = qjVar.n;
        if (view2 == null || qjVar.d) {
            return;
        }
        view2.callOnClick();
        qjVar.d = true;
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean c(float f7, float f10, int i10, View view) {
        z10 z10Var = (z10) this.b;
        if (view instanceof org.telegram.ui.Cells.l7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.l7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.o7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            z10.a(z10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.e2) {
            z10.a(z10Var, ((org.telegram.ui.Cells.e2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.r2) {
            if (!z10Var.o0.f()) {
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.h7
    public void clear() {
        ((w6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.vm0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                w5 w5Var = ((o5) this.b).d;
                w5Var.b0 = i10;
                w5Var.G0(true);
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

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.h7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((k70) this.b).w.d(true);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int e0(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f1(int i10) {
        return F0(i10);
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

    @Override // org.telegram.ui.nv0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean g1(MessageObject messageObject) {
        return org.telegram.messenger.em.a(messageObject);
    }

    @Override // org.telegram.ui.Components.no0
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

    @Override // org.telegram.ui.Components.ml0
    public void h() {
        ((z10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.h7
    public void h1() {
        y6 y6Var = ((w6) this.b).e;
        yh.b bVar = y6Var.Y;
        if (bVar == null || bVar.j.size() <= 0) {
            return;
        }
        y6Var.Y.d();
        v6 v6Var = y6Var.N;
        if (v6Var != null) {
            v6Var.e(false);
            y6Var.N.d();
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
    public void j0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean j2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Components.rq
    public /* synthetic */ void k(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.no0
    public int k0() {
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

    @Override // s4.e0
    public void k1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Cells.k1
    public boolean l0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean m0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vm0
    public /* synthetic */ boolean m1(int i10, View view) {
        switch (this.a) {
            case 6:
                break;
            case 11:
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.rd1
    public void n1(boolean z10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        cd cdVar = (cd) this.b;
        f6Var = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
        if (f6Var instanceof bd) {
            f6Var2 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            cd cdVar2 = ((bd) f6Var2).a;
            cdVar2.J = !cdVar2.J;
            cdVar2.d1();
            cdVar2.Z0(false);
        }
        cdVar.U0(a(), false);
        cdVar.Z0(false);
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
                hh0 hh0Var = (hh0) this.b;
                View view2 = null;
                hh0Var.O = null;
                int childCount = hh0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = hh0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || hh0Var.P.contains(view2)) ? false : true;
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
    public /* synthetic */ boolean o0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        switch (this.a) {
            case 15:
                f5Var = ((org.telegram.ui.ActionBar.p2) ((py) this.b).E0).parentLayout;
                ((ActionBarLayout) f5Var).r();
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

    @Override // org.telegram.ui.Components.r20
    public boolean onDown(MotionEvent motionEvent) {
        qj qjVar = (qj) this.b;
        View view = qjVar.a;
        if (view != null) {
            view.setPressed(true);
            qjVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && qjVar.a.getBackground() != null) {
                qjVar.a.getBackground().setVisible(true, false);
            }
            qjVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void onLongPress(MotionEvent motionEvent) {
        qj qjVar = (qj) this.b;
        eo eoVar = qjVar.w;
        if (qjVar.a != null) {
            eoVar.Q8 = org.telegram.ui.Components.o9.b(eoVar, qjVar.v, eoVar.T5, eoVar.d(), eoVar.ea);
            org.telegram.ui.ActionBar.p1 p1Var = eoVar.Q8;
            if (p1Var != null) {
                qjVar.b = p1Var;
                p1Var.setOnDismissListener(new f0(qjVar, 2));
                eoVar.x0.B0();
                eoVar.z0.R = false;
                View view = qjVar.v;
                eoVar.ob(view);
                eoVar.g8(false, view != eoVar.j1, 0.3f);
                eoVar.h9(false);
                ll llVar = eoVar.z3;
                if (llVar != null) {
                    llVar.e(1, true);
                }
                UndoView undoView = eoVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                ok okVar = eoVar.Y;
                if (okVar == null || okVar.getEditField() == null) {
                    return;
                }
                eoVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // me.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(hh0Var.H, 450L);
                View view2 = hh0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                hh0Var.O = null;
                hh0Var.invalidate();
                hh0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                hh0.m(hh0Var, f7, false, false);
                hh0Var.invalidate();
                break;
        }
    }

    @Override // me.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                hh0 hh0Var = (hh0) this.b;
                hh0.k(hh0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(hh0Var.H);
                hh0Var.setSkipDrawSelector(true);
                hh0.m(hh0Var, f7, true, false);
                hh0Var.invalidate();
                hh0Var.Q.a(true, true);
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
        qj qjVar = (qj) this.b;
        if (qjVar.e || (view = qjVar.a) == null) {
            return false;
        }
        view.callOnClick();
        qjVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.Components.ml0
    public void p(float f7) {
        ((z10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.qm
    public void r0(String str) {
        ((lk) this.b).b.da(str, false);
    }

    @Override // org.telegram.ui.Components.hq0
    public void s0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((j60) this.b).k1().k(0L, 33, null, null, null, null);
        }
    }

    @Override // org.telegram.ui.Components.rq
    public void t0(int i10, int i11, boolean z10) {
        rg.g gVar;
        switch (this.a) {
            case 18:
                rg.g gVar2 = ((l20) this.b).c.c;
                if (gVar2 != null) {
                    gVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (gVar = ((l20) this.b).c.c) != null) {
                    gVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean t2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ String v(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Components.vm0
    public void v0(float f7) {
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

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.Components.rq
    public /* synthetic */ void x() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ org.telegram.ui.Cells.t9 x2() {
        return null;
    }

    @Override // org.telegram.ui.Components.no0
    public void y() {
        switch (this.a) {
            case 5:
                ((i5) this.b).b.N();
                break;
        }
    }

    @Override // zh.q7
    public boolean y0(long j3, int i10, int i11, int i12, zh.r7 r7Var) {
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
                                    r7Var.c = imageReceiver;
                                    if (h8Var.i0 == null) {
                                        h8Var.i0 = new a1(this, 10);
                                    }
                                    r7Var.e = h8Var.i0;
                                    r7Var.a = e8Var;
                                    r7Var.g = h8Var.fragmentView;
                                    r7Var.h = AndroidUtilities.dp(36.0f);
                                    r7Var.i = h8Var.fragmentView.getBottom();
                                    r7Var.b = null;
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
    public /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        wb wbVar = (wb) this.b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (wbVar.t0.contains(Long.valueOf(j3))) {
                    wbVar.t0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    wbVar.t0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                wbVar.X0(true);
                wbVar.R0();
                wbVar.I.l();
                return;
            }
        }
        wbVar.P0(view, f7, f10);
    }

    private final void P1(float f7) {
    }

    private final void R1(float f7) {
    }

    private final void W1() {
    }

    private final void b2() {
    }

    private final /* synthetic */ void d2() {
    }

    private final void f2() {
    }

    private final void g2() {
    }

    private final /* synthetic */ void h2(boolean z10) {
    }

    private final /* synthetic */ void i2(boolean z10) {
    }

    private final /* synthetic */ void p1() {
    }

    private final /* synthetic */ void q1() {
    }

    private final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.nv0
    public /* synthetic */ void G(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void I1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void K1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Q1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.qm
    public /* synthetic */ void S0(int i10) {
    }

    @Override // org.telegram.ui.Components.hq0
    public /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // zh.q7
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void c2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Components.n8
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void k2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void n0(String str) {
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

    @Override // org.telegram.ui.b21
    public void u(vk0 vk0Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void F1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void S1(org.telegram.ui.Cells.t1 t1Var, ai.j jVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.qm
    public /* synthetic */ void V(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void l1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void o1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    private final /* synthetic */ void A1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void D1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void H1(View view, float f7, float f10) {
    }

    private final void s1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void u1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void v1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void w1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void x1(View view, float f7, float f10) {
    }

    private final /* synthetic */ void y1(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void B0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void C0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void t1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void w0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void Z1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final /* synthetic */ void J1(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void R(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public /* synthetic */ void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
