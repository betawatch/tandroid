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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g implements t9, dv0, org.telegram.ui.web.a1, org.telegram.ui.Components.ro0, org.telegram.ui.Components.d5, org.telegram.ui.Components.xm0, i7, ai.fc, org.telegram.ui.Components.ll0, org.telegram.ui.Cells.l1, fd1, km, me.a, org.telegram.ui.Components.nl0, org.telegram.ui.Cells.r7, org.telegram.ui.Components.mq, org.telegram.ui.Components.jq0, s4.e0, org.telegram.ui.Components.n8, org.telegram.ui.Components.j20, r0.n, vt, m11, org.telegram.ui.ActionBar.d6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ro0
    public void B() {
        switch (this.a) {
            case 5:
                ((i5) this.b).b.N();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xm0
    public void C() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.xm0
    public void C0(float f7) {
        switch (this.a) {
            case 6:
            case 11:
                break;
            default:
                jv jvVar = (jv) this.b;
                if (f7 != 1.0f || jvVar.f[1].getVisibility() == 0) {
                    if (jvVar.r) {
                        jvVar.f[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                        jvVar.f[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * jvVar.f[0].getMeasuredWidth()));
                    } else {
                        jvVar.f[0].setTranslationX(r3.getMeasuredWidth() * f7);
                        jvVar.f[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - jvVar.f[0].getMeasuredWidth());
                    }
                    if (f7 == 1.0f) {
                        iv[] ivVarArr = jvVar.f;
                        iv ivVar = ivVarArr[0];
                        ivVarArr[0] = ivVarArr[1];
                        ivVarArr[1] = ivVar;
                        ivVar.setVisibility(8);
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

    @Override // org.telegram.ui.dv0
    public void E0(MessageObject messageObject) {
        m3 m3Var = ((i4) this.b).u0[0];
        if (m3Var != null) {
            m3Var.b.I0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint G(String str) {
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int G0(int i10) {
        tp0 tp0Var = (tp0) this.b;
        int indexOfKey = tp0Var.v.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return tp0Var.v.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = tp0Var.s;
        return d6Var != null ? d6Var.G0(i10) : org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.i7
    public void H0(r6 r6Var, zh.a aVar, boolean z10) {
        HashSet hashSet;
        z6 z6Var = ((x6) this.b).e;
        if (r6Var == null) {
            if (aVar != null) {
                z6Var.Y.i(aVar);
                z6Var.N.d();
                z6.g0(z6Var);
                return;
            }
            return;
        }
        if (z6Var.Y.j.size() > 0 || z10) {
            zh.b bVar = z6Var.Y;
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
                        zh.a aVar2 = (zh.a) obj;
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
                        zh.a aVar3 = (zh.a) obj2;
                        if (hashSet2.add(aVar3)) {
                            bVar.k += aVar3.c;
                        }
                    }
                }
            }
            bVar.c();
            z6Var.N.d();
            z6.g0(z6Var);
            return;
        }
        if (z6Var.H <= 0 || z6Var.getParentActivity() == null) {
            return;
        }
        r6Var.getClass();
        boolean z11 = true;
        zh.b bVar2 = new zh.b(true);
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
        Collections.sort(arrayList3, new db1(i18));
        Collections.sort(arrayList4, new db1(i18));
        Collections.sort(arrayList5, new db1(i18));
        Collections.sort(arrayList6, new db1(i18));
        Collections.sort(bVar2.h, new db1(i18));
        fv fvVar = new fv(z6Var, r6Var, bVar2, new o0.a(z6Var, r6Var, false, 2));
        z6Var.T = fvVar;
        z6Var.showDialog(fvVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 16), 50L);
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public void K(String str) {
        h hVar = (h) this.b;
        hVar.finishFragment(false);
        ow owVar = hVar.x;
        LaunchActivity launchActivity = (LaunchActivity) owVar.b;
        h hVar2 = (h) owVar.c;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(launchActivity, 3, null);
        a2Var.g0 = false;
        a2Var.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.O).sendRequest(tL_auth_acceptLoginToken, new lo(27, a2Var, hVar2));
    }

    @Override // org.telegram.ui.Components.mq
    public /* synthetic */ int K0(int i10) {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(long j3) {
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

    @Override // s4.e0
    public void O0(int i10, int i11) {
        ((s4.h0) this.b).t(i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
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
        vi0 vi0Var = (vi0) this.b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        vi0Var.e = defaultWindowInsets;
        vi0Var.G.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        vi0Var.F.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Components.n8
    public void U0(int i10, int i11) {
        g70 g70Var = (g70) this.b;
        g70Var.W = i10;
        AndroidUtilities.updateVisibleRows(g70Var.b);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ro0
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
                fc0 fc0Var = (fc0) this.b;
                hc0 hc0Var = fc0Var.y;
                int round2 = Math.round(f7 * 100.0f);
                if (round2 != LiteMode.getPowerSaverLevel()) {
                    LiteMode.setPowerSaverLevel(round2);
                    hc0Var.Y();
                    ArrayList arrayList2 = hc0Var.s;
                    if (arrayList2.isEmpty()) {
                        hc0Var.X();
                    } else if (arrayList2.size() >= 2) {
                        arrayList2.set(1, new bc0(2, 0, LiteMode.getPowerSaverLevel() <= 0 ? LocaleController.getString(R.string.LiteBatteryInfoDisabled) : LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel()))), 0, 0));
                        hc0Var.d.m(1);
                    }
                    if (round2 <= 0 || round2 >= 100) {
                        try {
                            fc0Var.performHapticFeedback(3, 1);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.fd1
    public boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ hv0 Y1() {
        return null;
    }

    @Override // ai.fc
    public void Z(long j3, int i10, ai.d5 d5Var) {
        h8 h8Var = (h8) this.b;
        if (h8Var.b == null) {
            d5Var.run();
        }
        h8Var.b.post(d5Var);
    }

    @Override // org.telegram.ui.fd1
    public boolean a() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        switch (this.a) {
            case 12:
                ad adVar = (ad) this.b;
                d6Var = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
                if (d6Var == null) {
                    return org.telegram.ui.ActionBar.h6.I.q();
                }
                d6Var2 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
                return d6Var2.a();
            default:
                return ((tp0) this.b).S;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.vt
    public void a1(qt qtVar) {
        wj0 wj0Var = (wj0) this.b;
        wj0Var.E = true;
        String str = qtVar.c;
        wj0Var.O.setText(str);
        wj0Var.u(str, qtVar);
        wj0Var.E = false;
        AndroidUtilities.runOnUIThread(new c10(this, 28), 300L);
        wj0Var.Q.requestFocus();
        uj0 uj0Var = wj0Var.Q;
        uj0Var.setSelection(uj0Var.length());
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Components.j20
    public void b1() {
        lj ljVar = (lj) this.b;
        View view = ljVar.a;
        if (view != null) {
            view.setPressed(false);
            ljVar.a.setSelected(false);
            if (Build.VERSION.SDK_INT == 21 && ljVar.a.getBackground() != null) {
                ljVar.a.getBackground().setVisible(false, false);
            }
        }
        View view2 = ljVar.n;
        if (view2 == null || ljVar.d) {
            return;
        }
        view2.callOnClick();
        ljVar.d = true;
    }

    @Override // org.telegram.ui.Components.nl0
    public boolean c(float f7, float f10, int i10, View view) {
        t10 t10Var = (t10) this.b;
        if (view instanceof org.telegram.ui.Cells.k7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.k7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.n7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            t10.a(t10Var, ((org.telegram.ui.Cells.j7) view).getMessage(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.f2) {
            t10.a(t10Var, ((org.telegram.ui.Cells.f2) view).getMessageObject(), view, 0);
            return true;
        }
        if (view instanceof org.telegram.ui.Cells.s2) {
            if (!t10Var.o0.g()) {
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
                if (s2Var.S(f7)) {
                    t10Var.i0.f(s2Var);
                    return true;
                }
            }
            t10.a(t10Var, ((org.telegram.ui.Cells.s2) view).getMessage(), view, 0);
        }
        return true;
    }

    @Override // org.telegram.ui.m11
    public void c0() {
        ((ek0) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.i7
    public void clear() {
        ((x6) this.b).e.m0();
    }

    @Override // org.telegram.ui.Components.xm0
    public void d(int i10, boolean z10) {
        switch (this.a) {
            case 6:
                v5 v5Var = ((o5) this.b).d;
                v5Var.b0 = i10;
                v5Var.G0(true);
                break;
            case 11:
                bc bcVar = ((zb) this.b).f;
                bcVar.y = i10;
                bcVar.d(true);
                break;
            default:
                jv jvVar = (jv) this.b;
                if (jvVar.f[0].f != i10) {
                    jvVar.w = i10 == jvVar.e.getFirstTabId();
                    iv ivVar = jvVar.f[1];
                    ivVar.f = i10;
                    ivVar.setVisibility(0);
                    jvVar.m0(true);
                    jvVar.r = z10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.i7
    public void dismiss() {
        switch (this.a) {
            case 7:
                break;
            default:
                ((g70) this.b).w.d(true);
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

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // ai.fc
    public boolean f1(long j3, int i10, int i11, int i12, ai.gc gcVar) {
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
                                    gcVar.c = imageReceiver;
                                    if (h8Var.i0 == null) {
                                        h8Var.i0 = new z0(this, 10);
                                    }
                                    gcVar.e = h8Var.i0;
                                    gcVar.a = e8Var;
                                    gcVar.g = h8Var.fragmentView;
                                    gcVar.h = AndroidUtilities.dp(36.0f);
                                    gcVar.i = h8Var.fragmentView.getBottom();
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

    @Override // org.telegram.ui.Components.nl0
    public void g() {
        ((t10) this.b).i0.finish();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int g1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.Components.ro0
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

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        tp0 tp0Var = (tp0) this.b;
        if (str.equals("drawableMsgIn")) {
            return tp0Var.w;
        }
        if (str.equals("drawableMsgInSelected")) {
            return tp0Var.x;
        }
        org.telegram.ui.ActionBar.d6 d6Var = tp0Var.s;
        return d6Var != null ? d6Var.getDrawable(str) : org.telegram.ui.ActionBar.h6.O0(str);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // org.telegram.ui.i7
    public void i1() {
        z6 z6Var = ((x6) this.b).e;
        zh.b bVar = z6Var.Y;
        if (bVar == null || bVar.j.size() <= 0) {
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

    @Override // org.telegram.ui.dv0
    public /* synthetic */ TextureView j0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void k() {
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
            nf.f.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // s4.e0
    public void k0(int i10, int i11) {
        ((s4.h0) this.b).s(i10, i11);
    }

    @Override // org.telegram.ui.Components.mq
    public /* synthetic */ void l(boolean z10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return false;
    }

    @Override // s4.e0
    public void l1(int i10, int i11) {
        ((s4.h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.Components.ro0
    public int m0() {
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

    @Override // org.telegram.ui.Components.xm0
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
                return ((jy) this.b).E0.isInPreviewMode();
            default:
                ah0 ah0Var = (ah0) this.b;
                View view2 = null;
                ah0Var.O = null;
                int childCount = ah0Var.getChildCount() - 1;
                while (true) {
                    if (childCount >= 0) {
                        View childAt = ah0Var.getChildAt(childCount);
                        if (childAt.getVisibility() == 0 && f7 >= childAt.getLeft() && f7 <= childAt.getRight() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                            view2 = childAt;
                        } else {
                            childCount--;
                        }
                    }
                }
                return (view2 == null || ah0Var.P.contains(view2)) ? false : true;
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.fd1
    public void o1(boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        ad adVar = (ad) this.b;
        d6Var = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
        if (d6Var instanceof zc) {
            d6Var2 = ((org.telegram.ui.ActionBar.m2) adVar).resourceProvider;
            ad adVar2 = ((zc) d6Var2).a;
            adVar2.J = !adVar2.J;
            adVar2.d1();
            adVar2.Z0(false);
        }
        adVar.U0(a(), false);
        adVar.Z0(false);
    }

    @Override // me.a
    public void onClickAt(View view, float f7, float f10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        switch (this.a) {
            case 15:
                b5Var = ((org.telegram.ui.ActionBar.m2) ((jy) this.b).E0).parentLayout;
                ((ActionBarLayout) b5Var).r();
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

    @Override // org.telegram.ui.Components.j20
    public boolean onDown(MotionEvent motionEvent) {
        lj ljVar = (lj) this.b;
        View view = ljVar.a;
        if (view != null) {
            view.setPressed(true);
            ljVar.a.setSelected(true);
            if (Build.VERSION.SDK_INT == 21 && ljVar.a.getBackground() != null) {
                ljVar.a.getBackground().setVisible(true, false);
            }
            ljVar.a.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.j20
    public void onLongPress(MotionEvent motionEvent) {
        lj ljVar = (lj) this.b;
        wn wnVar = ljVar.w;
        if (ljVar.a != null) {
            wnVar.Q8 = org.telegram.ui.Components.o9.b(wnVar, ljVar.v, wnVar.T5, wnVar.d(), wnVar.ea);
            org.telegram.ui.ActionBar.m1 m1Var = wnVar.Q8;
            if (m1Var != null) {
                ljVar.b = m1Var;
                m1Var.setOnDismissListener(new f0(ljVar, 2));
                wnVar.x0.B0();
                wnVar.z0.R = false;
                View view = ljVar.v;
                wnVar.ob(view);
                wnVar.g8(false, view != wnVar.j1, 0.3f);
                wnVar.h9(false);
                fl flVar = wnVar.z3;
                if (flVar != null) {
                    flVar.e(1, true);
                }
                UndoView undoView = wnVar.y3;
                if (undoView != null) {
                    undoView.e(1, true);
                }
                jk jkVar = wnVar.Y;
                if (jkVar == null || jkVar.getEditField() == null) {
                    return;
                }
                wnVar.Y.getEditField().setAllowDrawCursor(false);
            }
        }
    }

    @Override // me.a
    public void onLongPressCancelled(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                ah0 ah0Var = (ah0) this.b;
                ah0.k(ah0Var, view, f7, f10);
                ah0.m(ah0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ah0Var.H, 450L);
                ah0Var.O = null;
                ah0Var.invalidate();
                ah0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressFinish(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                break;
            default:
                ah0 ah0Var = (ah0) this.b;
                ah0.k(ah0Var, view, f7, f10);
                ah0.m(ah0Var, f7, false, true);
                AndroidUtilities.runOnUIThread(ah0Var.H, 450L);
                View view2 = ah0Var.O;
                if (view2 != null) {
                    view2.performClick();
                }
                ah0Var.O = null;
                ah0Var.invalidate();
                ah0Var.Q.a(false, true);
                break;
        }
    }

    @Override // me.a
    public void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
        switch (this.a) {
            case 15:
                break;
            default:
                ah0 ah0Var = (ah0) this.b;
                ah0.k(ah0Var, view, f7, f10);
                ah0.m(ah0Var, f7, false, false);
                ah0Var.invalidate();
                break;
        }
    }

    @Override // me.a
    public boolean onLongPressRequestedAt(View view, float f7, float f10) {
        switch (this.a) {
            case 15:
                return false;
            default:
                ah0 ah0Var = (ah0) this.b;
                ah0.k(ah0Var, view, f7, f10);
                AndroidUtilities.cancelRunOnUIThread(ah0Var.H);
                ah0Var.setSkipDrawSelector(true);
                ah0.m(ah0Var, f7, true, false);
                ah0Var.invalidate();
                ah0Var.Q.a(true, true);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.j20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        lj ljVar = (lj) this.b;
        if (ljVar.e || (view = ljVar.a) == null) {
            return false;
        }
        view.callOnClick();
        ljVar.e = true;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.nl0
    public void q(float f7) {
        ((t10) this.b).i0.e(f7);
    }

    @Override // org.telegram.ui.km
    public void s0(String str) {
        ((gk) this.b).b.da(str, false);
    }

    @Override // org.telegram.ui.Components.jq0
    public void u0() {
        if (AndroidUtilities.shouldShowClipboardToast()) {
            ((d60) this.b).k1().k(0L, 33, null, null, null, null);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.v3;
    }

    @Override // org.telegram.ui.Components.mq
    public void x0(int i10, int i11, boolean z10) {
        sg.f fVar;
        switch (this.a) {
            case 18:
                sg.f fVar2 = ((f20) this.b).c.c;
                if (fVar2 != null) {
                    fVar2.C = i10;
                    break;
                }
                break;
            default:
                if (i11 == 0 && (fVar = ((f20) this.b).c.c) != null) {
                    fVar.B = i10;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.mq
    public /* synthetic */ void y() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        MessageObject messageObject;
        ub ubVar = (ub) this.b;
        if ((view instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject()) != null) {
            long j3 = messageObject.actionDeleteGroupEventId;
            if (j3 != -1) {
                if (ubVar.p0.contains(Long.valueOf(j3))) {
                    ubVar.p0.remove(Long.valueOf(messageObject.actionDeleteGroupEventId));
                } else {
                    ubVar.p0.add(Long.valueOf(messageObject.actionDeleteGroupEventId));
                }
                ubVar.W0(true);
                ubVar.R0();
                ubVar.E.l();
                return;
            }
        }
        ubVar.P0(view, f7, f10);
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.dv0
    public /* synthetic */ void H(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(org.telegram.ui.Cells.u1 u1Var) {
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
    public /* synthetic */ void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void S0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.jq0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(org.telegram.ui.Cells.u1 u1Var) {
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
    public /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Components.n8
    public /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.t9
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

    @Override // org.telegram.ui.m11
    public void v(nk0 nk0Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void L0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.km
    public /* synthetic */ void W(boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
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
    public /* synthetic */ void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
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
