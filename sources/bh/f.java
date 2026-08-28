package bh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import bg.h1;
import bg.w0;
import dg.l;
import dg.m;
import f2.r0;
import gh.c0;
import gh.f1;
import gh.o;
import gh.r;
import gh.u5;
import java.util.ArrayList;
import java.util.LinkedList;
import kh.f2;
import kh.g2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.l4;
import org.telegram.ui.n0;
import org.telegram.ui.web.v0;
import pf.i0;
import pf.m0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i9;
        int i10;
        boolean z10;
        int i11;
        f1 f1Var;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                jVar.I();
                jVar.Y = editable.toString();
                jVar.Z.N(true);
                break;
            case 1:
                l lVar = ((m) this.b).c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    h1 h1Var = ((w0) lVar).a;
                    h1Var.r0 = trim;
                    h1Var.Z(false, false);
                    h1Var.Z(true, true);
                    break;
                }
                break;
            case 2:
                r rVar = (r) this.b;
                gh.c cVar = rVar.j0;
                i9 = ((o2) rVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = c0.g(i9).h(rVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                rVar.L = parseLong;
                if (parseLong > j10) {
                    rVar.L = j10;
                    rVar.J = true;
                    rVar.M.setText(Long.toString(j10));
                    o oVar = rVar.M;
                    oVar.setSelection(oVar.getText().length());
                    rVar.J = false;
                }
                rVar.K = rVar.L == j10;
                AndroidUtilities.cancelRunOnUIThread(cVar);
                cVar.run();
                if (!rVar.J) {
                    rVar.K = false;
                    break;
                }
                break;
            case 3:
                g2 g2Var = (g2) this.b;
                ImageView imageView = g2Var.n;
                fg.g gVar = g2Var.d;
                if (!g2Var.r) {
                    g2Var.d(false);
                    String obj = gVar.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = g2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    f2 f2Var = g2Var.f;
                    if (f2Var != null) {
                        f2Var.F1(null);
                        g2Var.f.G1(TextUtils.isEmpty(obj), true);
                    }
                    if (gVar != null) {
                        gVar.animate().cancel();
                        ViewPropertyAnimator translationX = gVar.animate().translationX(0.0f);
                        gr grVar = gr.h;
                        translationX.setInterpolator(grVar).start();
                        if (imageView != null && g2Var.h != (!TextUtils.isEmpty(gVar.getText()))) {
                            g2Var.h = !g2Var.h;
                            imageView.animate().cancel();
                            if (g2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(g2Var.h ? 1.0f : 0.7f).scaleY(g2Var.h ? 1.0f : 0.7f).alpha(g2Var.h ? 1.0f : 0.0f).withEndAction(new kh.f1(this, 3)).setInterpolator(grVar).setDuration(320L).setStartDelay(g2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 4:
                break;
            case 5:
                ((nh.o) this.b).X();
                break;
            case 6:
                ad adVar = (ad) this.b;
                adVar.F((adVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 7:
                mt mtVar = (mt) this.b;
                i10 = mtVar.lineCount;
                if (i10 != mtVar.getLineCount()) {
                    z10 = mtVar.isInitLineCount;
                    if (!z10 && mtVar.getMeasuredWidth() > 0) {
                        i11 = mtVar.lineCount;
                        mtVar.onLineCountChanged(i11, mtVar.getLineCount());
                    }
                    mtVar.lineCount = mtVar.getLineCount();
                    break;
                }
                break;
            case 8:
                ((bg.m) this.b).run();
                break;
            case 9:
                jy jyVar = (jy) this.b;
                jyVar.g(false);
                yp ypVar = jyVar.d;
                String obj2 = ypVar.getText().toString();
                jyVar.c(obj2, true);
                iy iyVar = jyVar.r;
                if (iyVar != null) {
                    iyVar.F1(null);
                    iyVar.G1(TextUtils.isEmpty(obj2), true);
                }
                jyVar.f(!TextUtils.isEmpty(obj2));
                if (ypVar != null) {
                    ypVar.clearAnimation();
                    ypVar.animate().translationX(0.0f).setInterpolator(gr.h).start();
                }
                jyVar.d(false);
                break;
            case 10:
                m10 m10Var = (m10) this.b;
                if (!m10Var.B.isEmpty() && editable.length() > 0 && m10Var.E >= 0) {
                    m10Var.E = -1;
                    m10Var.f();
                }
                m10Var.a.a(m10Var.n || m10Var.r.length() > 0, true);
                break;
            case 11:
                yc0 yc0Var = (yc0) this.b;
                if (yc0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    yc0Var.k(false);
                    break;
                }
                break;
            case 12:
                hm0 hm0Var = (hm0) this.b;
                ImageView imageView2 = hm0Var.c;
                fg.g gVar2 = hm0Var.e;
                boolean z11 = gVar2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                hm0Var.a(gVar2.getText().toString());
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ib0(this, 28));
                break;
            case 14:
                ux0 ux0Var = (ux0) this.b;
                sx0 sx0Var = ux0Var.c;
                if (sx0Var != null && sx0Var.getVisibility() == 0) {
                    ux0Var.e();
                    break;
                }
                break;
            case 15:
                r51 r51Var = (r51) this.b;
                String obj3 = r51Var.F.getText().toString();
                s51 s51Var = r51Var.G;
                int h10 = s51Var.d.getAdapter() == null ? 0 : s51Var.d.getAdapter().h();
                s51Var.F(obj3);
                if (TextUtils.isEmpty(obj3) && (f1Var = s51Var.d) != null) {
                    r0 adapter = f1Var.getAdapter();
                    vk0 vk0Var = s51Var.f;
                    if (adapter != vk0Var) {
                        f1 f1Var2 = s51Var.d;
                        f1Var2.U1 = false;
                        f1Var2.V1 = 0;
                        f1Var2.setAdapter(vk0Var);
                        f1 f1Var3 = s51Var.d;
                        f1Var3.U1 = true;
                        f1Var3.V1 = 0;
                        if (h10 == 0) {
                            s51Var.I(0);
                        }
                    }
                }
                s51Var.v.setVisibility(0);
                break;
            case 16:
                n0 n0Var = (n0) this.b;
                AndroidUtilities.updateViewShow(n0Var.F, editable.length() > 0 && n0Var.P, true, true);
                String obj4 = editable.toString();
                l4 l4Var = n0Var.x0;
                String lowerCase = obj4.toLowerCase();
                d5.i iVar = l4Var.R0;
                if (iVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    l4Var.R0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i12 = l4Var.S0 + 1;
                    l4Var.S0 = i12;
                    if (!l4Var.q0[0].f()) {
                        d5.i iVar2 = new d5.i(l4Var, lowerCase, i12, 23);
                        l4Var.R0 = iVar2;
                        AndroidUtilities.runOnUIThread(iVar2, 400L);
                        break;
                    } else {
                        l4Var.d0(true);
                        if (l4Var.q0[0].getWebView() != null) {
                            v0 webView = l4Var.q0[0].getWebView();
                            webView.E = new org.telegram.ui.c0(l4Var, 9);
                            webView.findAllAsync(lowerCase);
                            l4Var.h0();
                            break;
                        }
                    }
                } else {
                    l4Var.A.clear();
                    l4Var.B = lowerCase;
                    l4Var.q0[0].c.y.clear();
                    l4Var.d0(false);
                    if (!l4Var.q0[0].f()) {
                        l4Var.q0[0].b.f1();
                        l4Var.W(0);
                    } else if (l4Var.q0[0].getWebView() != null) {
                        v0 webView2 = l4Var.q0[0].getWebView();
                        webView2.E = new org.telegram.ui.c0(l4Var, 9);
                        webView2.findAllAsync("");
                        l4Var.h0();
                    }
                    l4Var.S0 = -1;
                    break;
                }
                break;
            case 17:
                m0 m0Var = (m0) this.b;
                m0Var.x = false;
                i0 i0Var = m0Var.B;
                AndroidUtilities.cancelRunOnUIThread(i0Var);
                if (TextUtils.isEmpty(m0Var.f.getText())) {
                    m0Var.y = null;
                    m0Var.d.b();
                } else {
                    m0Var.x = true;
                    AndroidUtilities.runOnUIThread(i0Var, 800L);
                }
                m0Var.c.U2.N(true);
                m0Var.a0();
                break;
            case 18:
                pf.w0 w0Var = (pf.w0) this.b;
                if (!w0Var.d) {
                    w0Var.A = false;
                    w0Var.y = editable.toString();
                    w0Var.T(true);
                    break;
                }
                break;
            default:
                yg.c cVar2 = (yg.c) this.b;
                int length = cVar2.a.getText().length();
                td.a aVar = cVar2.D;
                int i13 = cVar2.x;
                aVar.a(length > (i13 * 7) / 10, true);
                cVar2.E.a(length > i13, true);
                cVar2.f.l(Integer.toString(i13 - length), false);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        boolean z10;
        switch (this.a) {
            case 11:
                yc0 yc0Var = (yc0) this.b;
                LinkedList linkedList = yc0Var.J;
                LinkedList linkedList2 = yc0Var.I;
                Drawable drawable = yc0Var.a;
                if (drawable instanceof jb0) {
                    jb0 jb0Var = (jb0) drawable;
                    jb0Var.D = null;
                    jb0Var.z();
                    float f10 = jb0Var.h;
                    int i12 = 0;
                    boolean z11 = true;
                    if (i10 == 0 && i11 == 1) {
                        jb0Var.x(true);
                        z10 = true;
                    } else if (i10 == 1 && i11 == 0) {
                        jb0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            yc0Var.b(jb0Var);
                            break;
                        } else {
                            linkedList2.offer(new u5(this, z10, jb0Var, 19));
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
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 4:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.B.getText();
                searchView.k0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i12 = 8;
                if (searchView.j0 && !searchView.c0 && isEmpty) {
                    searchView.G.setVisibility(8);
                    i12 = 0;
                }
                searchView.I.setVisibility(i12);
                searchView.q();
                searchView.t();
                charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void A(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void I(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void J(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void K(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void L(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void M(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void g(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void p(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void t(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void u(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void y(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
