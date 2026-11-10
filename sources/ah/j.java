package ah;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bi.e1;
import bi.h1;
import bi.n0;
import bi.q1;
import bi.u7;
import bi.v;
import bi.z;
import di.f8;
import fi.d2;
import fi.e2;
import fi.p8;
import fi.s6;
import fi.w6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import kg.a1;
import kg.d0;
import kg.e0;
import kg.k0;
import kg.q0;
import kg.s1;
import kg.t1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.sx;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.Wallet.o9;
import org.telegram.ui.Wallet.y9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i7) {
        this.a = i7;
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
        c20 c20Var;
        int i7;
        String obj;
        int indexOf;
        String obj2;
        int indexOf2;
        c20 c20Var2;
        int currentTop;
        int currentTop2;
        q1 q1Var;
        String str = null;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                if (!oVar.h && (c20Var = oVar.n) != null && editable != null) {
                    c20Var.a(editable.toString());
                    break;
                }
                break;
            case 1:
                z zVar = (z) this.b;
                bi.d dVar = zVar.s0;
                i7 = ((f2) zVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = n0.g(i7).h(zVar.b, false);
                long j3 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                zVar.Y = parseLong;
                if (parseLong > j3) {
                    zVar.Y = j3;
                    zVar.W = true;
                    zVar.Z.setText(Long.toString(j3));
                    v vVar = zVar.Z;
                    vVar.setSelection(vVar.getText().length());
                    zVar.W = false;
                }
                zVar.X = zVar.Y == j3;
                g0.r(dVar);
                dVar.run();
                if (!zVar.W) {
                    zVar.X = false;
                    break;
                }
                break;
            case 2:
                e1 e1Var = (e1) this.b;
                ?? r42 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (r42 == false && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                e1Var.M0(r42 == false ? cg.a.h(editable.toString(), e1Var.B1.a) : cg.a.i(0L, e1Var.B1.a), false, false, true);
                e1Var.p1.c(e1Var.q1.isFocused(), !TextUtils.isEmpty(e1Var.q1.getText()));
                break;
            case 3:
                h1 h1Var = (h1) this.b;
                ?? r43 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (r43 == false && (indexOf2 = (obj2 = editable.toString()).indexOf(46)) >= 0 && (obj2.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, obj2.length());
                }
                h1Var.J0(r43 == false ? cg.a.h(editable.toString(), h1Var.y1.a) : cg.a.i(0L, h1Var.y1.a), false, false, true);
                h1Var.l1.c(h1Var.m1.isFocused(), !TextUtils.isEmpty(h1Var.m1.getText()));
                break;
            case 4:
                e2 e2Var = (e2) this.b;
                ImageView imageView = e2Var.r;
                i iVar = e2Var.e;
                if (!e2Var.s) {
                    e2Var.d(false);
                    String obj3 = iVar.getText().toString();
                    String str2 = TextUtils.isEmpty(obj3) ? null : obj3;
                    v10 v10Var = e2Var.x;
                    if (v10Var != null) {
                        v10Var.a(str2, -1);
                    }
                    d2 d2Var = e2Var.h;
                    if (d2Var != null) {
                        d2Var.I1(null);
                        e2Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (iVar != null) {
                        iVar.animate().cancel();
                        ViewPropertyAnimator translationX = iVar.animate().translationX(0.0f);
                        wq wqVar = wq.h;
                        translationX.setInterpolator(wqVar).start();
                        if (imageView != null && e2Var.n != (!TextUtils.isEmpty(iVar.getText()))) {
                            e2Var.n = !e2Var.n;
                            imageView.animate().cancel();
                            if (e2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(e2Var.n ? 1.0f : 0.7f).scaleY(e2Var.n ? 1.0f : 0.7f).alpha(e2Var.n ? 1.0f : 0.0f).withEndAction(new f8(this, 19)).setInterpolator(wqVar).setDuration(320L).setStartDelay(e2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 5:
                w6 w6Var = (w6) this.b;
                String obj4 = editable.toString();
                w6Var.m2 = obj4;
                if (!w6Var.U1) {
                    String str3 = w6Var.r2;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    if (!TextUtils.equals(str3, obj4)) {
                        w6Var.f1();
                        String str4 = w6Var.m2;
                        w6Var.q2 = str4 != null && str4.length() > 0;
                    }
                    String str5 = w6Var.C2;
                    String str6 = w6Var.m2;
                    if (!TextUtils.equals(str5, str6 != null ? str6 : "")) {
                        w6Var.e1();
                        String str7 = w6Var.m2;
                        if (str7 != null && str7.length() > 3 && !TextUtils.isEmpty(((org.telegram.messenger.n0) qp.s1(w6Var.a).x7.F.b).c)) {
                            z9 = true;
                        }
                        w6Var.x2 = z9;
                    }
                    s6 s6Var = w6Var.t2;
                    g0.r(s6Var);
                    g0.i3(s6Var, 400L);
                    s6 s6Var2 = w6Var.E2;
                    g0.r(s6Var2);
                    g0.i3(s6Var2, 400L);
                }
                w6Var.k2.O(true);
                break;
            case 6:
                p8 p8Var = (p8) this.b;
                if (!p8Var.n && (c20Var2 = p8Var.r) != null && editable != null) {
                    c20Var2.a(editable.toString());
                    break;
                }
                break;
            case 7:
                ((ii.p) this.b).d0();
                break;
            case 8:
                kg.g0 g0Var = (kg.g0) this.b;
                q1 q1Var2 = g0Var.s;
                iy iyVar = g0Var.E;
                d0 d0Var = g0Var.y;
                String obj5 = editable.toString();
                if (obj5.isEmpty()) {
                    if (q1Var2.getAdapter() != d0Var) {
                        currentTop = g0Var.getCurrentTop();
                        iyVar.c();
                        q1Var2.setAdapter(d0Var);
                        d0Var.f();
                        if (currentTop > 0) {
                            g0Var.w.h1(0, -currentTop);
                        }
                    }
                } else if (iyVar != null) {
                    iyVar.setText(id.M0(2131748167, null));
                }
                e0 e0Var = g0Var.D;
                if (e0Var != null) {
                    kg.g0 g0Var2 = e0Var.f;
                    q1 q1Var3 = g0Var2.s;
                    ArrayList arrayList = e0Var.d;
                    arrayList.clear();
                    e0Var.e = obj5;
                    String O3 = g0.O3(obj5);
                    if (O3.startsWith("/")) {
                        O3 = O3.substring(1);
                    }
                    ArrayList arrayList2 = t1.f(p10.s0).b;
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        s1 s1Var = (s1) arrayList2.get(i10);
                        if (!t1.g(s1Var.b)) {
                            String O32 = g0.O3(s1Var.b);
                            if (O32.startsWith(O3) || jg.g.A(" ", O3, O32)) {
                                arrayList.add(s1Var);
                            }
                        }
                    }
                    v4.g0 adapter = q1Var3.getAdapter();
                    e0 e0Var2 = g0Var2.D;
                    if (adapter != e0Var2) {
                        q1Var3.setAdapter(e0Var2);
                    }
                    e0Var.f();
                    break;
                }
                break;
            case 9:
                q0 q0Var = (q0) this.b;
                q0Var.y = false;
                k0 k0Var = q0Var.F;
                g0.r(k0Var);
                if (TextUtils.isEmpty(q0Var.f.getText())) {
                    q0Var.D = null;
                    q0Var.d.b();
                } else {
                    q0Var.y = true;
                    g0.i3(k0Var, 800L);
                }
                q0Var.c.f3.O(true);
                q0Var.g0();
                break;
            case 10:
                a1 a1Var = (a1) this.b;
                if (!a1Var.c) {
                    a1Var.D = false;
                    a1Var.y = editable.toString();
                    a1Var.Z(true);
                    break;
                }
                break;
            case 11:
            case 12:
            case 13:
                break;
            case 14:
                tc tcVar = (tc) this.b;
                tcVar.F((tcVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 15:
                mi miVar = (mi) this.b;
                di diVar = miVar.f0;
                TextUtils.isEmpty(miVar.D);
                miVar.D = editable.toString().trim();
                di diVar2 = miVar.a0;
                g0.r(diVar2);
                if (!TextUtils.isEmpty(miVar.D)) {
                    String str8 = miVar.D;
                    miVar.W = str8 != null && str8.length() >= 0;
                    if (!TextUtils.equals(miVar.V, miVar.D)) {
                        miVar.L.clear();
                        miVar.b0 = 0;
                        miVar.c0 = false;
                    }
                    g0.i3(diVar2, 1500L);
                }
                g0.r(diVar);
                if (!TextUtils.isEmpty(miVar.D)) {
                    String str9 = miVar.D;
                    miVar.m0 = (str9 == null || str9.length() < 3 || TextUtils.isEmpty(((org.telegram.messenger.n0) qp.s1(miVar.b.G3).x7.F.b).c)) ? false : true;
                    if (!TextUtils.equals(miVar.e0, miVar.D)) {
                        miVar.M.clear();
                        miVar.g0 = false;
                    }
                    g0.i3(diVar, 1500L);
                }
                miVar.T();
                break;
            case 16:
                String obj6 = editable.toString();
                if (obj6.isEmpty()) {
                    v4.g0 adapter2 = ((ej) this.b).s.getAdapter();
                    ej ejVar = (ej) this.b;
                    if (adapter2 != ejVar.E) {
                        currentTop2 = ejVar.getCurrentTop();
                        ((ej) this.b).G.setText(id.M0(2131748223, null));
                        ((ej) this.b).G.c();
                        ej ejVar2 = (ej) this.b;
                        ejVar2.s.setAdapter(ejVar2.E);
                        ((ej) this.b).E.f();
                        if (currentTop2 > 0) {
                            ((ej) this.b).w.h1(0, -currentTop2);
                        }
                    }
                } else {
                    iy iyVar2 = ((ej) this.b).G;
                    if (iyVar2 != null) {
                        iyVar2.setText(id.M0(2131748167, null));
                    }
                }
                aj ajVar = ((ej) this.b).F;
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
                    r44.d(ziVar, 300L);
                    break;
                }
                break;
            case 17:
                ys ysVar = (ys) this.b;
                if (ysVar.R1 != ysVar.getLineCount()) {
                    if (!ysVar.S1 && ysVar.getMeasuredWidth() > 0) {
                        ysVar.F(ysVar.R1, ysVar.getLineCount());
                    }
                    ysVar.R1 = ysVar.getLineCount();
                    break;
                }
                break;
            case 18:
                ((fi.q1) this.b).run();
                break;
            case 19:
                tx txVar = (tx) this.b;
                txVar.g(false);
                rp rpVar = txVar.d;
                String obj7 = rpVar.getText().toString();
                txVar.c(obj7, true);
                sx sxVar = txVar.r;
                if (sxVar != null) {
                    sxVar.I1(null);
                    sxVar.J1(TextUtils.isEmpty(obj7), true);
                }
                txVar.f(!TextUtils.isEmpty(obj7));
                if (rpVar != null) {
                    rpVar.clearAnimation();
                    rpVar.animate().translationX(0.0f).setInterpolator(wq.h).start();
                }
                txVar.d(false);
                break;
            case 20:
                r00 r00Var = (r00) this.b;
                if (!r00Var.F.isEmpty() && editable.length() > 0 && r00Var.I >= 0) {
                    r00Var.I = -1;
                    r00Var.e();
                }
                r00Var.a.a(r00Var.n || r00Var.r.length() > 0, true);
                break;
            case 21:
                ec0 ec0Var = (ec0) this.b;
                if (ec0Var.r.length() == 4 && iz.r == 0) {
                    ec0Var.n(false);
                    break;
                }
                break;
            case 22:
                el0 el0Var = (el0) this.b;
                ImageView imageView2 = el0Var.b;
                i iVar2 = el0Var.d;
                ?? r45 = iVar2.length() > 0;
                if (r45 != (imageView2.getAlpha() == 0.0f ? 0 : 1)) {
                    imageView2.animate().alpha(r45 == true ? 1.0f : 0.0f).setDuration(150L).scaleX(r45 != false ? 1.0f : 0.1f).scaleY(r45 != false ? 1.0f : 0.1f).start();
                }
                el0Var.a(iVar2.getText().toString());
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
                ey0 ey0Var = (ey0) this.b;
                i6 i6Var = ey0Var.n;
                if (!ey0Var.y) {
                    String trim = editable.toString().trim();
                    if (trim.length() > 16) {
                        i6Var.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        i6Var.setText("");
                    }
                    c20 c20Var3 = ey0Var.x;
                    if (c20Var3 != null) {
                        c20Var3.a(trim);
                    }
                    ij ijVar = ey0Var.r;
                    if (ijVar != null) {
                        ijVar.K1 = true;
                        ey0Var.d.w3(ijVar, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 25:
                s01 s01Var = (s01) this.b;
                String lowerCase = editable.toString().trim().toLowerCase();
                s01Var.L = lowerCase;
                if (lowerCase.startsWith("@")) {
                    s01Var.L = s01Var.L.substring(1);
                }
                s01Var.c();
                s01Var.M.clear();
                if (!s01Var.d && !s01Var.c && !TextUtils.isEmpty(s01Var.L)) {
                    r80 r80Var = new r80(22, s01Var, s01Var.L);
                    s01Var.O = r80Var;
                    g0.i3(r80Var, 350L);
                }
                s01Var.h();
                break;
            case 26:
                b51 b51Var = (b51) this.b;
                String obj8 = b51Var.J.getText().toString();
                c51 c51Var = b51Var.K;
                int b10 = c51Var.n1.getAdapter() == null ? 0 : c51Var.n1.getAdapter().b();
                c51Var.L0(obj8);
                if (TextUtils.isEmpty(obj8) && (q1Var = c51Var.n1) != null) {
                    v4.g0 adapter3 = q1Var.getAdapter();
                    oj0 oj0Var = c51Var.p1;
                    if (adapter3 != oj0Var) {
                        q1 q1Var4 = c51Var.n1;
                        q1Var4.W1 = false;
                        q1Var4.X1 = 0;
                        q1Var4.setAdapter(oj0Var);
                        q1 q1Var5 = c51Var.n1;
                        q1Var5.W1 = true;
                        q1Var5.X1 = 0;
                        if (b10 == 0) {
                            c51Var.O0(0);
                        }
                    }
                }
                c51Var.u1.setVisibility(0);
                break;
            case 27:
                break;
            case 28:
                ((o9) this.b).C0();
                break;
            default:
                final y9 y9Var = (y9) this.b;
                ArrayList arrayList3 = y9Var.w;
                arrayList3.clear();
                final String trim2 = editable.toString().trim();
                Runnable runnable = y9Var.K;
                if (runnable != null) {
                    g0.r(runnable);
                    y9Var.K = null;
                }
                if (y9Var.E != 0) {
                    y9Var.getConnectionsManager().cancelRequest(y9Var.E, true);
                    y9Var.E = 0;
                }
                String str10 = WalletEngine2.isValidRecipientAddress(trim2) ? trim2 : null;
                y9Var.y = str10;
                if (str10 == null && trim2 != null && trim2.length() <= 126) {
                    String lowerCase2 = trim2.toLowerCase(Locale.ROOT);
                    if (lowerCase2.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str = lowerCase2;
                    }
                }
                y9Var.D = str;
                final int i12 = y9Var.J + 1;
                y9Var.J = i12;
                y9Var.L = !TextUtils.isEmpty(trim2) && y9Var.y == null;
                y9Var.x.g(null, true, false, false, false, 0L, false, 0, i12);
                fi.d dVar2 = y9Var.Z;
                if (dVar2 != null) {
                    dVar2.setEnabled(y9Var.y != null);
                }
                if (!TextUtils.isEmpty(trim2) && y9Var.y == null && y9Var.D == null) {
                    y9Var.j0(trim2);
                    final int i13 = true ? 1 : 0;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.v9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    y9.f0(y9Var, trim2, i12);
                                    break;
                                default:
                                    y9 y9Var2 = y9Var;
                                    y9Var2.K = null;
                                    jg.z1 z1Var = y9Var2.x;
                                    int i14 = i12;
                                    z1Var.h(trim2, true, false, false, false, false, 0L, false, 0, i14, 0L, new f2(y9Var2, i14, 4));
                                    break;
                            }
                        }
                    };
                    y9Var.K = runnable2;
                    g0.i3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    y9Var.a.f3.O(true);
                    final String str11 = y9Var.D;
                    if (str11 != null) {
                        final int i14 = false ? 1 : 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.v9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        y9.f0(y9Var, str11, i12);
                                        break;
                                    default:
                                        y9 y9Var2 = y9Var;
                                        y9Var2.K = null;
                                        jg.z1 z1Var = y9Var2.x;
                                        int i142 = i12;
                                        z1Var.h(str11, true, false, false, false, false, 0L, false, 0, i142, 0L, new f2(y9Var2, i142, 4));
                                        break;
                                }
                            }
                        };
                        y9Var.K = runnable3;
                        g0.i3(runnable3, 300L);
                    }
                }
                y9Var.p0(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z9;
        switch (this.a) {
            case 21:
                ec0 ec0Var = (ec0) this.b;
                LinkedList linkedList = ec0Var.V;
                LinkedList linkedList2 = ec0Var.U;
                Drawable drawable = ec0Var.a;
                if (drawable instanceof qa0) {
                    qa0 qa0Var = (qa0) drawable;
                    qa0Var.D = null;
                    qa0Var.y();
                    float f10 = qa0Var.h;
                    int i12 = 0;
                    boolean z10 = true;
                    if (i10 == 0 && i11 == 1) {
                        qa0Var.w(true);
                        z9 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        qa0Var.x();
                        z9 = false;
                    } else {
                        z9 = false;
                        z10 = false;
                    }
                    if (z10) {
                        if (f10 >= 1.0f) {
                            ec0Var.b(qa0Var);
                            break;
                        } else {
                            linkedList2.offer(new u7(this, z9, qa0Var, 23));
                            linkedList.offer(Boolean.valueOf(z9));
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i13 = 0; i13 < linkedList2.size(); i13++) {
                                Runnable runnable = (Runnable) linkedList2.get(i13);
                                if (((Boolean) linkedList.get(i13)).booleanValue() != z9) {
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
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        org.telegram.ui.ActionBar.n0 searchListener;
        switch (this.a) {
            case 11:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.F.getText();
                searchView.o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.n0 && !searchView.g0 && isEmpty) {
                    searchView.K.setVisibility(8);
                    i12 = 0;
                }
                searchView.M.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
            case 12:
                r0 r0Var = (r0) this.b;
                org.telegram.ui.ActionBar.n0 n0Var = r0Var.H;
                if (n0Var != null) {
                    n0Var.l(r0Var.e);
                }
                r0Var.j();
                if (!r0Var.g0.isEmpty() && !TextUtils.isEmpty(r0Var.e.getText()) && r0Var.h0 >= 0) {
                    r0Var.h0 = -1;
                    r0Var.D();
                    break;
                }
                break;
            case 13:
                z4 z4Var = (z4) this.b;
                z4Var.j();
                searchListener = z4Var.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(z4Var.s);
                    break;
                }
                break;
            case 27:
                ((m4) this.b).a(charSequence.toString());
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

    private final void A(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void D(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void I(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void K(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void L(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void M(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void N(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void O(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void P(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void R(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void S(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void T(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void U(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void V(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void W(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void X(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void Z(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void a0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void e0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g0(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void t(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void u(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
