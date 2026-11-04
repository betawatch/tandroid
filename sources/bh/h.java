package bh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import ci.a1;
import ci.i0;
import ci.j1;
import ci.s;
import ci.v;
import ci.v6;
import ci.x0;
import ei.z5;
import gi.c2;
import gi.q1;
import gi.q8;
import gi.t6;
import gi.x6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import k2.p1;
import lg.b1;
import lg.e0;
import lg.f0;
import lg.h0;
import lg.l0;
import lg.r0;
import lg.t1;
import lg.u1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n0;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.k4;
import org.telegram.ui.Wallet.m9;
import org.telegram.ui.Wallet.w9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v41, types: [org.telegram.messenger.p5] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        u10 u10Var;
        int i3;
        String obj;
        int indexOf;
        String obj2;
        int indexOf2;
        u10 u10Var2;
        int currentTop;
        int currentTop2;
        j1 j1Var;
        String str = null;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        switch (this.a) {
            case 0:
                m mVar = (m) this.b;
                if (!mVar.h && (u10Var = mVar.n) != null && editable != null) {
                    u10Var.a(editable.toString());
                    break;
                }
                break;
            case 1:
                v vVar = (v) this.b;
                ci.d dVar = vVar.t0;
                i3 = ((d2) vVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = i0.g(i3).h(vVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                vVar.Z = parseLong;
                if (parseLong > j10) {
                    vVar.Z = j10;
                    vVar.X = true;
                    vVar.a0.setText(Long.toString(j10));
                    s sVar = vVar.a0;
                    sVar.setSelection(sVar.getText().length());
                    vVar.X = false;
                }
                vVar.Y = vVar.Z == j10;
                g0.r(dVar);
                dVar.run();
                if (!vVar.X) {
                    vVar.Y = false;
                    break;
                }
                break;
            case 2:
                x0 x0Var = (x0) this.b;
                ?? r42 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (r42 == false && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                x0Var.M0(r42 == false ? dg.a.h(editable.toString(), x0Var.z1.a) : dg.a.i(0L, x0Var.z1.a), false, false, true);
                x0Var.n1.c(x0Var.o1.isFocused(), !TextUtils.isEmpty(x0Var.o1.getText()));
                break;
            case 3:
                a1 a1Var = (a1) this.b;
                ?? r43 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (r43 == false && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                a1Var.J0(r43 == false ? dg.a.h(editable.toString(), a1Var.w1.a) : dg.a.i(0L, a1Var.w1.a), false, false, true);
                a1Var.j1.c(a1Var.k1.isFocused(), !TextUtils.isEmpty(a1Var.k1.getText()));
                break;
            case 4:
                gi.d2 d2Var = (gi.d2) this.b;
                ImageView imageView = d2Var.r;
                g gVar = d2Var.e;
                if (!d2Var.s) {
                    d2Var.d(false);
                    String obj3 = gVar.getText().toString();
                    String str2 = TextUtils.isEmpty(obj3) ? null : obj3;
                    n10 n10Var = d2Var.x;
                    if (n10Var != null) {
                        n10Var.a(str2, -1);
                    }
                    c2 c2Var = d2Var.h;
                    if (c2Var != null) {
                        c2Var.I1(null);
                        d2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (gVar != null) {
                        gVar.animate().cancel();
                        ViewPropertyAnimator translationX = gVar.animate().translationX(0.0f);
                        xq xqVar = xq.h;
                        translationX.setInterpolator(xqVar).start();
                        if (imageView != null && d2Var.n != (!TextUtils.isEmpty(gVar.getText()))) {
                            d2Var.n = !d2Var.n;
                            imageView.animate().cancel();
                            if (d2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(d2Var.n ? 1.0f : 0.7f).scaleY(d2Var.n ? 1.0f : 0.7f).alpha(d2Var.n ? 1.0f : 0.0f).withEndAction(new z5(this, 24)).setInterpolator(xqVar).setDuration(320L).setStartDelay(d2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 5:
                x6 x6Var = (x6) this.b;
                String obj4 = editable.toString();
                x6Var.k2 = obj4;
                if (!x6Var.S1) {
                    String str3 = x6Var.p2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str3, obj4)) {
                        x6Var.f1();
                        String str4 = x6Var.k2;
                        x6Var.o2 = str4 != null && str4.length() > 0;
                    }
                    String str5 = x6Var.A2;
                    String str6 = x6Var.k2;
                    if (!TextUtils.equals(str5, str6 != null ? str6 : "")) {
                        x6Var.e1();
                        String str7 = x6Var.k2;
                        if (str7 != null && str7.length() > 3 && !TextUtils.isEmpty(((n0) hp.s1(x6Var.a).x7.F.b).c)) {
                            z10 = true;
                        }
                        x6Var.v2 = z10;
                    }
                    t6 t6Var = x6Var.r2;
                    g0.r(t6Var);
                    g0.i3(t6Var, 400L);
                    t6 t6Var2 = x6Var.C2;
                    g0.r(t6Var2);
                    g0.i3(t6Var2, 400L);
                }
                x6Var.i2.O(true);
                break;
            case 6:
                q8 q8Var = (q8) this.b;
                if (!q8Var.n && (u10Var2 = q8Var.r) != null && editable != null) {
                    u10Var2.a(editable.toString());
                    break;
                }
                break;
            case 7:
                ((ji.n) this.b).d0();
                break;
            case 8:
                h0 h0Var = (h0) this.b;
                j1 j1Var2 = h0Var.s;
                gy gyVar = h0Var.F;
                e0 e0Var = h0Var.y;
                String obj5 = editable.toString();
                if (obj5.isEmpty()) {
                    if (j1Var2.getAdapter() != e0Var) {
                        currentTop = h0Var.getCurrentTop();
                        gyVar.c();
                        j1Var2.setAdapter(e0Var);
                        e0Var.f();
                        if (currentTop > 0) {
                            h0Var.w.h1(0, -currentTop);
                        }
                    }
                } else if (gyVar != null) {
                    gyVar.setText(bd.M0(2131748175, null));
                }
                f0 f0Var = h0Var.E;
                if (f0Var != null) {
                    h0 h0Var2 = f0Var.f;
                    j1 j1Var3 = h0Var2.s;
                    ArrayList arrayList = f0Var.d;
                    arrayList.clear();
                    f0Var.e = obj5;
                    String O3 = g0.O3(obj5);
                    if (O3.startsWith("/")) {
                        O3 = O3.substring(1);
                    }
                    ArrayList arrayList2 = u1.f(h10.t0).b;
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        t1 t1Var = (t1) arrayList2.get(i10);
                        if (!u1.g(t1Var.b)) {
                            String O32 = g0.O3(t1Var.b);
                            if (O32.startsWith(O3) || p1.z(" ", O3, O32)) {
                                arrayList.add(t1Var);
                            }
                        }
                    }
                    u4.h0 adapter = j1Var3.getAdapter();
                    f0 f0Var2 = h0Var2.E;
                    if (adapter != f0Var2) {
                        j1Var3.setAdapter(f0Var2);
                    }
                    f0Var.f();
                    break;
                }
                break;
            case 9:
                r0 r0Var = (r0) this.b;
                r0Var.y = false;
                l0 l0Var = r0Var.G;
                g0.r(l0Var);
                if (TextUtils.isEmpty(r0Var.f.getText())) {
                    r0Var.E = null;
                    r0Var.d.b();
                } else {
                    r0Var.y = true;
                    g0.i3(l0Var, 800L);
                }
                r0Var.c.g3.O(true);
                r0Var.g0();
                break;
            case 10:
                b1 b1Var = (b1) this.b;
                if (!b1Var.c) {
                    b1Var.E = false;
                    b1Var.y = editable.toString();
                    b1Var.Z(true);
                    break;
                }
                break;
            case 11:
            case 12:
            case 13:
                break;
            case 14:
                sc scVar = (sc) this.b;
                scVar.F((scVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 15:
                ni niVar = (ni) this.b;
                ci ciVar = niVar.g0;
                TextUtils.isEmpty(niVar.E);
                niVar.E = editable.toString().trim();
                ci ciVar2 = niVar.b0;
                g0.r(ciVar2);
                if (!TextUtils.isEmpty(niVar.E)) {
                    String str8 = niVar.E;
                    niVar.a0 = str8 != null && str8.length() >= 0;
                    if (!TextUtils.equals(niVar.W, niVar.E)) {
                        niVar.M.clear();
                        niVar.c0 = 0;
                        niVar.d0 = false;
                    }
                    g0.i3(ciVar2, 1500L);
                }
                g0.r(ciVar);
                if (!TextUtils.isEmpty(niVar.E)) {
                    String str9 = niVar.E;
                    niVar.n0 = (str9 == null || str9.length() < 3 || TextUtils.isEmpty(((n0) hp.s1(niVar.b.E3).x7.F.b).c)) ? false : true;
                    if (!TextUtils.equals(niVar.f0, niVar.E)) {
                        niVar.N.clear();
                        niVar.h0 = false;
                    }
                    g0.i3(ciVar, 1500L);
                }
                niVar.T();
                break;
            case 16:
                String obj6 = editable.toString();
                if (obj6.isEmpty()) {
                    u4.h0 adapter2 = ((ej) this.b).s.getAdapter();
                    ej ejVar = (ej) this.b;
                    if (adapter2 != ejVar.F) {
                        currentTop2 = ejVar.getCurrentTop();
                        ((ej) this.b).H.setText(bd.M0(2131748231, null));
                        ((ej) this.b).H.c();
                        ej ejVar2 = (ej) this.b;
                        ejVar2.s.setAdapter(ejVar2.F);
                        ((ej) this.b).F.f();
                        if (currentTop2 > 0) {
                            ((ej) this.b).w.h1(0, -currentTop2);
                        }
                    }
                } else {
                    gy gyVar2 = ((ej) this.b).H;
                    if (gyVar2 != null) {
                        gyVar2.setText(bd.M0(2131748175, null));
                    }
                }
                aj ajVar = ((ej) this.b).G;
                if (ajVar != null) {
                    if (ajVar.f != null) {
                        Utilities.g.a(ajVar.f);
                        ajVar.f = null;
                    }
                    int i11 = ajVar.h + 1;
                    ajVar.h = i11;
                    ?? r44 = Utilities.g;
                    zi ziVar = new zi(ajVar, obj6, i11, false ? 1 : 0);
                    ajVar.f = ziVar;
                    r44.e(ziVar, 300L);
                    break;
                }
                break;
            case 17:
                xs xsVar = (xs) this.b;
                if (xsVar.S1 != xsVar.getLineCount()) {
                    if (!xsVar.T1 && xsVar.getMeasuredWidth() > 0) {
                        xsVar.F(xsVar.S1, xsVar.getLineCount());
                    }
                    xsVar.S1 = xsVar.getLineCount();
                    break;
                }
                break;
            case 18:
                ((q1) this.b).run();
                break;
            case 19:
                rx rxVar = (rx) this.b;
                rxVar.g(false);
                rp rpVar = rxVar.d;
                String obj7 = rpVar.getText().toString();
                rxVar.c(obj7, true);
                qx qxVar = rxVar.r;
                if (qxVar != null) {
                    qxVar.I1(null);
                    qxVar.J1(TextUtils.isEmpty(obj7), true);
                }
                rxVar.f(!TextUtils.isEmpty(obj7));
                if (rpVar != null) {
                    rpVar.clearAnimation();
                    rpVar.animate().translationX(0.0f).setInterpolator(xq.h).start();
                }
                rxVar.d(false);
                break;
            case 20:
                n00 n00Var = (n00) this.b;
                if (!n00Var.G.isEmpty() && editable.length() > 0 && n00Var.J >= 0) {
                    n00Var.J = -1;
                    n00Var.e();
                }
                n00Var.a.a(n00Var.n || n00Var.r.length() > 0, true);
                break;
            case 21:
                zb0 zb0Var = (zb0) this.b;
                if (zb0Var.r.length() == 4 && az.r == 0) {
                    zb0Var.n(false);
                    break;
                }
                break;
            case 22:
                il0 il0Var = (il0) this.b;
                ImageView imageView2 = il0Var.b;
                g gVar2 = il0Var.d;
                ?? r45 = gVar2.length() > 0;
                if (r45 != (imageView2.getAlpha() == 0.0f ? 0 : 1)) {
                    imageView2.animate().alpha(r45 == true ? 1.0f : 0.0f).setDuration(150L).scaleX(r45 != false ? 1.0f : 0.1f).scaleY(r45 != false ? 1.0f : 0.1f).start();
                }
                il0Var.a(gVar2.getText().toString());
                break;
            case 23:
                ow0 ow0Var = (ow0) this.b;
                mw0 mw0Var = ow0Var.c;
                if (mw0Var != null && mw0Var.getVisibility() == 0) {
                    ow0Var.e();
                    break;
                }
                break;
            case 24:
                dy0 dy0Var = (dy0) this.b;
                h6 h6Var = dy0Var.n;
                if (!dy0Var.y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        h6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        h6Var.setText("");
                    }
                    u10 u10Var3 = dy0Var.x;
                    if (u10Var3 != null) {
                        u10Var3.a(trim);
                    }
                    org.telegram.messenger.zi ziVar2 = dy0Var.r;
                    if (ziVar2 != null) {
                        ziVar2.K1 = true;
                        dy0Var.d.u3(ziVar2, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 25:
                n01 n01Var = (n01) this.b;
                String lowerCase = editable.toString().trim().toLowerCase();
                n01Var.M = lowerCase;
                if (lowerCase.startsWith("@")) {
                    n01Var.M = n01Var.M.substring(1);
                }
                n01Var.b();
                n01Var.N.clear();
                if (!n01Var.d && !n01Var.c && !TextUtils.isEmpty(n01Var.M)) {
                    j50 j50Var = new j50(26, n01Var, n01Var.M);
                    n01Var.P = j50Var;
                    g0.i3(j50Var, 350L);
                }
                n01Var.g();
                break;
            case 26:
                u41 u41Var = (u41) this.b;
                String obj8 = u41Var.K.getText().toString();
                v41 v41Var = u41Var.L;
                int b10 = v41Var.l1.getAdapter() == null ? 0 : v41Var.l1.getAdapter().b();
                v41Var.L0(obj8);
                if (TextUtils.isEmpty(obj8) && (j1Var = v41Var.l1) != null) {
                    u4.h0 adapter3 = j1Var.getAdapter();
                    sj0 sj0Var = v41Var.n1;
                    if (adapter3 != sj0Var) {
                        j1 j1Var4 = v41Var.l1;
                        j1Var4.X1 = false;
                        j1Var4.Y1 = 0;
                        j1Var4.setAdapter(sj0Var);
                        j1 j1Var5 = v41Var.l1;
                        j1Var5.X1 = true;
                        j1Var5.Y1 = 0;
                        if (b10 == 0) {
                            v41Var.O0(0);
                        }
                    }
                }
                v41Var.s1.setVisibility(0);
                break;
            case 27:
                break;
            case 28:
                ((m9) this.b).C0();
                break;
            default:
                final w9 w9Var = (w9) this.b;
                ArrayList arrayList3 = w9Var.w;
                arrayList3.clear();
                final String trim2 = editable.toString().trim();
                Runnable runnable = w9Var.L;
                if (runnable != null) {
                    g0.r(runnable);
                    w9Var.L = null;
                }
                if (w9Var.F != 0) {
                    w9Var.getConnectionsManager().cancelRequest(w9Var.F, true);
                    w9Var.F = 0;
                }
                String str10 = WalletEngine2.isValidRecipientAddress(trim2) ? trim2 : null;
                w9Var.y = str10;
                if (str10 == null && trim2 != null && trim2.length() <= 126) {
                    String lowerCase2 = trim2.toLowerCase(Locale.ROOT);
                    if (lowerCase2.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str = lowerCase2;
                    }
                }
                w9Var.E = str;
                final int i12 = w9Var.K + 1;
                w9Var.K = i12;
                w9Var.M = !TextUtils.isEmpty(trim2) && w9Var.y == null;
                w9Var.x.g(null, true, false, false, false, 0L, false, 0, i12);
                gi.d dVar2 = w9Var.a0;
                if (dVar2 != null) {
                    dVar2.setEnabled(w9Var.y != null);
                }
                if (!TextUtils.isEmpty(trim2) && w9Var.y == null && w9Var.E == null) {
                    w9Var.j0(trim2);
                    final int i13 = true ? 1 : 0;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.t9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    w9.f0(w9Var, trim2, i12);
                                    break;
                                default:
                                    w9 w9Var2 = w9Var;
                                    w9Var2.L = null;
                                    kg.v1 v1Var = w9Var2.x;
                                    int i14 = i12;
                                    v1Var.h(trim2, true, false, false, false, false, 0L, false, 0, i14, 0L, new f2(w9Var2, i14, 4));
                                    break;
                            }
                        }
                    };
                    w9Var.L = runnable2;
                    g0.i3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    w9Var.a.g3.O(true);
                    final String str11 = w9Var.E;
                    if (str11 != null) {
                        final int i14 = false ? 1 : 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.t9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        w9.f0(w9Var, str11, i12);
                                        break;
                                    default:
                                        w9 w9Var2 = w9Var;
                                        w9Var2.L = null;
                                        kg.v1 v1Var = w9Var2.x;
                                        int i142 = i12;
                                        v1Var.h(str11, true, false, false, false, false, 0L, false, 0, i142, 0L, new f2(w9Var2, i142, 4));
                                        break;
                                }
                            }
                        };
                        w9Var.L = runnable3;
                        g0.i3(runnable3, 300L);
                    }
                }
                w9Var.p0(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        boolean z10;
        switch (this.a) {
            case 21:
                zb0 zb0Var = (zb0) this.b;
                LinkedList linkedList = zb0Var.W;
                LinkedList linkedList2 = zb0Var.V;
                Drawable drawable = zb0Var.a;
                if (drawable instanceof la0) {
                    la0 la0Var = (la0) drawable;
                    la0Var.D = null;
                    la0Var.y();
                    float f10 = la0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        la0Var.w(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        la0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            zb0Var.b(la0Var);
                            break;
                        } else {
                            linkedList2.offer(new v6(this, z10, la0Var, 23));
                            linkedList.offer(Boolean.valueOf(z10));
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i13 = 0; i13 < linkedList2.size(); i13++) {
                                Runnable runnable = (Runnable) linkedList2.get(i13);
                                if (((Boolean) linkedList.get(i13)).booleanValue() != z10) {
                                    arrayList.add(runnable);
                                    arrayList2.add(Integer.valueOf(i13));
                                }
                            }
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                linkedList2.remove((Runnable) obj);
                            }
                            int size2 = arrayList2.size();
                            while (i12 < size2) {
                                Object obj2 = arrayList2.get(i12);
                                i12++;
                                int intValue = ((Integer) obj2).intValue();
                                if (intValue < linkedList.size()) {
                                    linkedList.remove(intValue);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        m0 searchListener;
        switch (this.a) {
            case 11:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.G.getText();
                searchView.p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.o0 && !searchView.h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                    i12 = 0;
                }
                searchView.N.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
            case 12:
                q0 q0Var = (q0) this.b;
                m0 m0Var = q0Var.I;
                if (m0Var != null) {
                    m0Var.l(q0Var.e);
                }
                q0Var.j();
                if (!q0Var.h0.isEmpty() && !TextUtils.isEmpty(q0Var.e.getText()) && q0Var.i0 >= 0) {
                    q0Var.i0 = -1;
                    q0Var.D();
                    break;
                }
                break;
            case 13:
                y4 y4Var = (y4) this.b;
                y4Var.h();
                searchListener = y4Var.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(y4Var.s);
                    break;
                }
                break;
            case 27:
                ((k4) this.b).a(charSequence.toString());
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void A(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void D(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void K(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void L(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void M(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void N(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void O(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void P(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void Q(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void R(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void S(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void T(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void U(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void V(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void W(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void X(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void Y(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void Z(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void a0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void e0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g0(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void j(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void l(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void m(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void t(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void u(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
