package ag;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.r5;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.Wallet.ra;
import org.telegram.ui.h4;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a1 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        int currentTop2;
        b1 b1Var;
        q20 q20Var;
        int i10;
        String obj;
        int indexOf;
        String str = null;
        final int i11 = 0;
        switch (this.a) {
            case 0:
                h1 h1Var = (h1) this.b;
                b1 b1Var2 = h1Var.s;
                xy xyVar = h1Var.E;
                e1 e1Var = h1Var.y;
                String obj2 = editable.toString();
                if (obj2.isEmpty()) {
                    if (b1Var2.getAdapter() != e1Var) {
                        currentTop = h1Var.getCurrentTop();
                        xyVar.c();
                        b1Var2.setAdapter(e1Var);
                        e1Var.f();
                        if (currentTop > 0) {
                            h1Var.w.h1(0, -currentTop);
                        }
                    }
                } else if (xyVar != null) {
                    xyVar.setText(cd.L0(2131748183, null));
                }
                f1 f1Var = h1Var.D;
                if (f1Var != null) {
                    h1 h1Var2 = f1Var.f;
                    b1 b1Var3 = h1Var2.s;
                    ArrayList arrayList = f1Var.d;
                    arrayList.clear();
                    f1Var.e = obj2;
                    String N3 = org.telegram.messenger.i0.N3(obj2);
                    if (N3.startsWith("/")) {
                        N3 = N3.substring(1);
                    }
                    ArrayList arrayList2 = i3.f(d20.s0).b;
                    while (i11 < arrayList2.size()) {
                        h3 h3Var = (h3) arrayList2.get(i11);
                        if (!i3.g(h3Var.b)) {
                            String N32 = org.telegram.messenger.i0.N3(h3Var.b);
                            if (N32.startsWith(N3) || sc.e.y(" ", N3, N32)) {
                                arrayList.add(h3Var);
                            }
                        }
                        i11++;
                    }
                    s4.g0 adapter = b1Var3.getAdapter();
                    f1 f1Var2 = h1Var2.D;
                    if (adapter != f1Var2) {
                        b1Var3.setAdapter(f1Var2);
                    }
                    f1Var.f();
                    break;
                }
                break;
            case 1:
                t1 t1Var = (t1) this.b;
                t1Var.y = false;
                l1 l1Var = t1Var.F;
                org.telegram.messenger.i0.r(l1Var);
                if (TextUtils.isEmpty(t1Var.f.getText())) {
                    t1Var.D = null;
                    t1Var.d.b();
                } else {
                    t1Var.y = true;
                    org.telegram.messenger.i0.h3(l1Var, 800L);
                }
                t1Var.c.f3.O(true);
                t1Var.f0();
                break;
            case 2:
                f2 f2Var = (f2) this.b;
                if (!f2Var.c) {
                    f2Var.D = false;
                    f2Var.y = editable.toString();
                    f2Var.Y(true);
                    break;
                }
                break;
            case 3:
                ih.d dVar = (ih.d) this.b;
                int length = dVar.a.getText().length();
                fe.b bVar = dVar.H;
                int i12 = dVar.y;
                bVar.a(length > (i12 * 7) / 10, true);
                dVar.I.a(length > i12, true);
                dVar.f.l(Integer.toString(i12 - length), false);
                break;
            case 4:
                lh.g gVar = (lh.g) this.b;
                gVar.X0();
                gVar.U1 = editable.toString();
                gVar.V1.O(true);
                break;
            case 5:
                break;
            case 6:
                og.l lVar = ((og.m) this.b).c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    mg.w0 w0Var = ((mg.m0) lVar).a;
                    w0Var.n2 = trim;
                    w0Var.k1(false, false);
                    w0Var.k1(true, true);
                    break;
                }
                break;
            case 7:
            case 8:
                break;
            case 9:
                nc ncVar = (nc) this.b;
                ncVar.F((ncVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 10:
                mi miVar = (mi) this.b;
                ci ciVar = miVar.f0;
                TextUtils.isEmpty(miVar.D);
                miVar.D = editable.toString().trim();
                ci ciVar2 = miVar.a0;
                org.telegram.messenger.i0.r(ciVar2);
                if (!TextUtils.isEmpty(miVar.D)) {
                    String str2 = miVar.D;
                    miVar.W = str2 != null && str2.length() >= 0;
                    if (!TextUtils.equals(miVar.V, miVar.D)) {
                        miVar.L.clear();
                        miVar.b0 = 0;
                        miVar.c0 = false;
                    }
                    org.telegram.messenger.i0.h3(ciVar2, 1500L);
                }
                org.telegram.messenger.i0.r(ciVar);
                if (!TextUtils.isEmpty(miVar.D)) {
                    String str3 = miVar.D;
                    miVar.m0 = (str3 == null || str3.length() < 3 || TextUtils.isEmpty(((org.telegram.messenger.q0) vp.r1(miVar.b.D3).y7.F.b).c)) ? false : true;
                    if (!TextUtils.equals(miVar.e0, miVar.D)) {
                        miVar.M.clear();
                        miVar.g0 = false;
                    }
                    org.telegram.messenger.i0.h3(ciVar, 1500L);
                }
                miVar.S();
                break;
            case 11:
                String obj3 = editable.toString();
                if (obj3.isEmpty()) {
                    s4.g0 adapter2 = ((ej) this.b).s.getAdapter();
                    ej ejVar = (ej) this.b;
                    if (adapter2 != ejVar.E) {
                        currentTop2 = ejVar.getCurrentTop();
                        ((ej) this.b).G.setText(cd.L0(2131748240, null));
                        ((ej) this.b).G.c();
                        ej ejVar2 = (ej) this.b;
                        ejVar2.s.setAdapter(ejVar2.E);
                        ((ej) this.b).E.f();
                        if (currentTop2 > 0) {
                            ((ej) this.b).w.h1(0, -currentTop2);
                        }
                    }
                } else {
                    xy xyVar2 = ((ej) this.b).G;
                    if (xyVar2 != null) {
                        xyVar2.setText(cd.L0(2131748183, null));
                    }
                }
                aj ajVar = ((ej) this.b).F;
                if (ajVar != null) {
                    if (ajVar.f != null) {
                        Utilities.g.a(ajVar.f);
                        ajVar.f = null;
                    }
                    int i13 = ajVar.h + 1;
                    ajVar.h = i13;
                    r5 r5Var = Utilities.g;
                    zi ziVar = new zi(ajVar, obj3, i13, i11);
                    ajVar.f = ziVar;
                    r5Var.d(ziVar, 300L);
                    break;
                }
                break;
            case 12:
                mt mtVar = (mt) this.b;
                if (mtVar.R1 != mtVar.getLineCount()) {
                    if (!mtVar.S1 && mtVar.getMeasuredWidth() > 0) {
                        mtVar.F(mtVar.R1, mtVar.getLineCount());
                    }
                    mtVar.R1 = mtVar.getLineCount();
                    break;
                }
                break;
            case 13:
                ((n0) this.b).run();
                break;
            case 14:
                iy iyVar = (iy) this.b;
                iyVar.g(false);
                yp ypVar = iyVar.d;
                String obj4 = ypVar.getText().toString();
                iyVar.c(obj4, true);
                hy hyVar = iyVar.r;
                if (hyVar != null) {
                    hyVar.I1(null);
                    hyVar.J1(TextUtils.isEmpty(obj4), true);
                }
                iyVar.f(!TextUtils.isEmpty(obj4));
                if (ypVar != null) {
                    ypVar.clearAnimation();
                    ypVar.animate().translationX(0.0f).setInterpolator(gr.h).start();
                }
                iyVar.d(false);
                break;
            case 15:
                h10 h10Var = (h10) this.b;
                if (!h10Var.F.isEmpty() && editable.length() > 0 && h10Var.I >= 0) {
                    h10Var.I = -1;
                    h10Var.e();
                }
                h10Var.a.a(h10Var.n || h10Var.r.length() > 0, true);
                break;
            case 16:
                zc0 zc0Var = (zc0) this.b;
                if (zc0Var.r.length() == 4 && tz.r == 0) {
                    zc0Var.n(false);
                    break;
                }
                break;
            case 17:
                hm0 hm0Var = (hm0) this.b;
                ImageView imageView = hm0Var.b;
                org.telegram.ui.ActionBar.n0 n0Var = hm0Var.d;
                Object[] objArr = n0Var.length() > 0;
                if (objArr != (imageView.getAlpha() == 0.0f ? (char) 0 : (char) 1)) {
                    imageView.animate().alpha(objArr == true ? 1.0f : 0.0f).setDuration(150L).scaleX(objArr != false ? 1.0f : 0.1f).scaleY(objArr == true ? 1.0f : 0.1f).start();
                }
                hm0Var.a(n0Var.getText().toString());
                break;
            case 18:
                sx0 sx0Var = (sx0) this.b;
                qx0 qx0Var = sx0Var.c;
                if (qx0Var != null && qx0Var.getVisibility() == 0) {
                    sx0Var.e();
                    break;
                }
                break;
            case 19:
                iz0 iz0Var = (iz0) this.b;
                f6 f6Var = iz0Var.n;
                if (!iz0Var.y) {
                    String trim2 = editable.toString().trim();
                    if (trim2.length() > 16) {
                        f6Var.setText("-" + (trim2.length() - 16));
                        trim2 = trim2.substring(0, 16);
                    } else {
                        f6Var.setText("");
                    }
                    q20 q20Var2 = iz0Var.x;
                    if (q20Var2 != null) {
                        q20Var2.a(trim2);
                    }
                    jj jjVar = iz0Var.r;
                    if (jjVar != null) {
                        jjVar.K1 = true;
                        iz0Var.d.s3(jjVar, null, false, false, false, false);
                        break;
                    }
                }
                break;
            case 20:
                t11 t11Var = (t11) this.b;
                t11Var.K = editable.toString().trim().toLowerCase();
                if (t11Var.K.startsWith("@")) {
                    t11Var.K = t11Var.K.substring(1);
                }
                t11Var.f();
                break;
            case 21:
                d61 d61Var = (d61) this.b;
                String obj5 = d61Var.J.getText().toString();
                e61 e61Var = d61Var.K;
                int b10 = e61Var.k1.getAdapter() == null ? 0 : e61Var.k1.getAdapter().b();
                e61Var.L0(obj5);
                if (TextUtils.isEmpty(obj5) && (b1Var = e61Var.k1) != null) {
                    s4.g0 adapter3 = b1Var.getAdapter();
                    sk0 sk0Var = e61Var.m1;
                    if (adapter3 != sk0Var) {
                        b1 b1Var4 = e61Var.k1;
                        b1Var4.W1 = false;
                        b1Var4.X1 = 0;
                        b1Var4.setAdapter(sk0Var);
                        b1 b1Var5 = e61Var.k1;
                        b1Var5.W1 = true;
                        b1Var5.X1 = 0;
                        if (b10 == 0) {
                            e61Var.O0(0);
                        }
                    }
                }
                e61Var.r1.setVisibility(0);
                break;
            case 22:
                break;
            case 23:
                ((r9) this.b).B0();
                break;
            case 24:
                final ba baVar = (ba) this.b;
                ArrayList arrayList3 = baVar.w;
                arrayList3.clear();
                final String trim3 = editable.toString().trim();
                Runnable runnable = baVar.K;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                    baVar.K = null;
                }
                if (baVar.E != 0) {
                    baVar.getConnectionsManager().cancelRequest(baVar.E, true);
                    baVar.E = 0;
                }
                String str4 = WalletEngine2.isValidRecipientAddress(trim3) ? trim3 : null;
                baVar.y = str4;
                if (str4 == null && trim3 != null && trim3.length() <= 126) {
                    String lowerCase = trim3.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str = lowerCase;
                    }
                }
                baVar.D = str;
                final int i14 = baVar.J + 1;
                baVar.J = i14;
                baVar.L = !TextUtils.isEmpty(trim3) && baVar.y == null;
                baVar.x.g(null, true, false, false, false, 0L, false, 0, i14);
                vh.d dVar2 = baVar.Z;
                if (dVar2 != null) {
                    dVar2.setEnabled(baVar.y != null);
                }
                if (!TextUtils.isEmpty(trim3) && baVar.y == null && baVar.D == null) {
                    baVar.i0(trim3);
                    final int i15 = r14 ? 1 : 0;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.y9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ba.e0(baVar, trim3, i14);
                                    break;
                                default:
                                    ba baVar2 = baVar;
                                    baVar2.K = null;
                                    zf.m1 m1Var = baVar2.x;
                                    int i16 = i14;
                                    m1Var.h(trim3, true, false, false, false, false, 0L, false, 0, i16, 0L, new qq(baVar2, i16, 29));
                                    break;
                            }
                        }
                    };
                    baVar.K = runnable2;
                    org.telegram.messenger.i0.h3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    baVar.a.f3.O(true);
                    final String str5 = baVar.D;
                    if (str5 != null) {
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.y9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        ba.e0(baVar, str5, i14);
                                        break;
                                    default:
                                        ba baVar2 = baVar;
                                        baVar2.K = null;
                                        zf.m1 m1Var = baVar2.x;
                                        int i16 = i14;
                                        m1Var.h(str5, true, false, false, false, false, 0L, false, 0, i16, 0L, new qq(baVar2, i16, 29));
                                        break;
                                }
                            }
                        };
                        baVar.K = runnable3;
                        org.telegram.messenger.i0.h3(runnable3, 300L);
                    }
                }
                baVar.o0(true);
                break;
            case 25:
                ra raVar = (ra) this.b;
                if (raVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && raVar.b()) {
                    raVar.setError(false);
                }
                raVar.e();
                raVar.d();
                if (raVar.a.hasFocus()) {
                    raVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = raVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.b;
                org.telegram.messenger.i0.U3(m0Var.J, editable.length() > 0 && m0Var.T, true);
                String obj6 = editable.toString();
                h4 h4Var = m0Var.B0;
                String lowerCase2 = obj6.toLowerCase();
                o0 o0Var = h4Var.W0;
                if (o0Var != null) {
                    org.telegram.messenger.i0.r(o0Var);
                    h4Var.W0 = null;
                }
                int i16 = 9;
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i17 = h4Var.X0 + 1;
                    h4Var.X0 = i17;
                    if (!h4Var.u0[0].f()) {
                        o0 o0Var2 = new o0(h4Var, lowerCase2, i17, 13);
                        h4Var.W0 = o0Var2;
                        org.telegram.messenger.i0.h3(o0Var2, 400L);
                        break;
                    } else {
                        h4Var.b0(true);
                        if (h4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.v0 webView = h4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.y(h4Var, i16);
                            webView.findAllAsync(lowerCase2);
                            h4Var.f0();
                            break;
                        }
                    }
                } else {
                    h4Var.E.clear();
                    h4Var.F = lowerCase2;
                    h4Var.u0[0].c.D.clear();
                    h4Var.b0(false);
                    if (!h4Var.u0[0].f()) {
                        h4Var.u0[0].b.g1();
                        h4Var.U(0);
                    } else if (h4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.v0 webView2 = h4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.y(h4Var, i16);
                        webView2.findAllAsync("");
                        h4Var.f0();
                    }
                    h4Var.X0 = -1;
                    break;
                }
                break;
            case 27:
                qg.h hVar = (qg.h) this.b;
                if (!hVar.h && (q20Var = hVar.n) != null && editable != null) {
                    q20Var.a(editable.toString());
                    break;
                }
                break;
            case 28:
                rh.i iVar = (rh.i) this.b;
                rh.b bVar2 = iVar.s0;
                i10 = ((org.telegram.ui.ActionBar.k2) iVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = rh.r.g(i10).h(iVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                iVar.Y = parseLong;
                if (parseLong > j10) {
                    iVar.Y = j10;
                    iVar.W = true;
                    iVar.Z.setText(Long.toString(j10));
                    zd zdVar = iVar.Z;
                    zdVar.setSelection(zdVar.getText().length());
                    iVar.W = false;
                }
                iVar.X = iVar.Y == j10;
                org.telegram.messenger.i0.r(bVar2);
                bVar2.run();
                if (!iVar.W) {
                    iVar.X = false;
                    break;
                }
                break;
            default:
                rh.e0 e0Var = (rh.e0) this.b;
                Object[] objArr2 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
                if (objArr2 == false && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                e0Var.M0(objArr2 == false ? sf.a.h(editable.toString(), e0Var.y1.a) : sf.a.i(0L, e0Var.y1.a), false, false, true);
                e0Var.m1.c(e0Var.n1.isFocused(), !TextUtils.isEmpty(e0Var.n1.getText()));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.a) {
            case 16:
                zc0 zc0Var = (zc0) this.b;
                LinkedList linkedList = zc0Var.V;
                LinkedList linkedList2 = zc0Var.U;
                Drawable drawable = zc0Var.a;
                if (drawable instanceof jb0) {
                    jb0 jb0Var = (jb0) drawable;
                    jb0Var.D = null;
                    jb0Var.y();
                    float f7 = jb0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        jb0Var.w(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        jb0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            zc0Var.b(jb0Var);
                            break;
                        } else {
                            linkedList2.offer(new j0(this, z10, jb0Var, 20));
                            linkedList.offer(Boolean.valueOf(z10));
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i14 = 0; i14 < linkedList2.size(); i14++) {
                                Runnable runnable = (Runnable) linkedList2.get(i14);
                                if (((Boolean) linkedList.get(i14)).booleanValue() != z10) {
                                    arrayList.add(runnable);
                                    arrayList2.add(Integer.valueOf(i14));
                                }
                            }
                            int size = arrayList.size();
                            int i15 = 0;
                            while (i15 < size) {
                                Object obj = arrayList.get(i15);
                                i15++;
                                linkedList2.remove((Runnable) obj);
                            }
                            int size2 = arrayList2.size();
                            while (i13 < size2) {
                                Object obj2 = arrayList2.get(i13);
                                i13++;
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
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.p0 searchListener;
        switch (this.a) {
            case 5:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.F.getText();
                searchView.o0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.n0 && !searchView.g0 && isEmpty) {
                    searchView.K.setVisibility(8);
                    i13 = 0;
                }
                searchView.M.setVisibility(i13);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
            case 7:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.b;
                org.telegram.ui.ActionBar.p0 p0Var = t0Var.H;
                if (p0Var != null) {
                    p0Var.l(t0Var.e);
                }
                t0Var.j();
                if (!t0Var.g0.isEmpty() && !TextUtils.isEmpty(t0Var.e.getText()) && t0Var.h0 >= 0) {
                    t0Var.h0 = -1;
                    t0Var.D();
                    break;
                }
                break;
            case 8:
                i5 i5Var = (i5) this.b;
                i5Var.h();
                searchListener = i5Var.getSearchListener();
                if (searchListener != null) {
                    searchListener.l(i5Var.s);
                    break;
                }
                break;
            case 22:
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

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void B(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void C(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void D(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void E(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void F(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void G(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void H(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void I(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void J(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void K(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void L(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void M(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void N(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void O(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void P(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void Q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void R(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void S(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void T(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void U(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void V(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void W(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void X(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void Y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void Z(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void a0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g0(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
