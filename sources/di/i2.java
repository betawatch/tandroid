package di;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class i2 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        bi.o0 o0Var;
        int i12;
        switch (this.a) {
            case 0:
                l2 l2Var = (l2) this.b;
                ImageView imageView = l2Var.n;
                h2 h2Var = l2Var.d;
                if (!l2Var.r) {
                    l2Var.d(false);
                    String obj = h2Var.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = l2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    k2 k2Var = l2Var.f;
                    if (k2Var != null) {
                        k2Var.E1(null);
                        l2Var.f.F1(TextUtils.isEmpty(obj), true);
                    }
                    if (h2Var != null) {
                        h2Var.animate().cancel();
                        ViewPropertyAnimator translationX = h2Var.animate().translationX(0.0f);
                        pr prVar = pr.h;
                        translationX.setInterpolator(prVar).start();
                        if (imageView != null && l2Var.h != (!TextUtils.isEmpty(h2Var.getText()))) {
                            l2Var.h = !l2Var.h;
                            imageView.animate().cancel();
                            if (l2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(l2Var.h ? 1.0f : 0.7f).scaleY(l2Var.h ? 1.0f : 0.7f).alpha(l2Var.h ? 1.0f : 0.0f).withEndAction(new bi.oa(this, 19)).setInterpolator(prVar).setDuration(320L).setStartDelay(l2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((gi.p) this.b).Y();
                break;
            case 2:
                ig.u0 u0Var = (ig.u0) this.b;
                u0Var.x = false;
                ig.m0 m0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                if (TextUtils.isEmpty(u0Var.f.getText())) {
                    u0Var.y = null;
                    u0Var.d.b();
                } else {
                    u0Var.x = true;
                    AndroidUtilities.runOnUIThread(m0Var, 800L);
                }
                u0Var.c.Y2.N(true);
                u0Var.b0();
                break;
            case 3:
                ig.e1 e1Var = (ig.e1) this.b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.y = editable.toString();
                    e1Var.U(true);
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.ld ldVar = (org.telegram.ui.Components.ld) this.b;
                ldVar.F((ldVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 6:
                zt ztVar = (zt) this.b;
                i10 = ztVar.lineCount;
                if (i10 != ztVar.getLineCount()) {
                    z10 = ztVar.isInitLineCount;
                    if (!z10 && ztVar.getMeasuredWidth() > 0) {
                        i11 = ztVar.lineCount;
                        ztVar.onLineCountChanged(i11, ztVar.getLineCount());
                    }
                    ztVar.lineCount = ztVar.getLineCount();
                    break;
                }
                break;
            case 7:
                ((u1) this.b).run();
                break;
            case 8:
                xy xyVar = (xy) this.b;
                xyVar.g(false);
                hq hqVar = xyVar.d;
                String obj2 = hqVar.getText().toString();
                xyVar.c(obj2, true);
                wy wyVar = xyVar.r;
                if (wyVar != null) {
                    wyVar.E1(null);
                    wyVar.F1(TextUtils.isEmpty(obj2), true);
                }
                xyVar.f(!TextUtils.isEmpty(obj2));
                if (hqVar != null) {
                    hqVar.clearAnimation();
                    hqVar.animate().translationX(0.0f).setInterpolator(pr.h).start();
                }
                xyVar.d(false);
                break;
            case 9:
                b20 b20Var = (b20) this.b;
                if (!b20Var.F.isEmpty() && editable.length() > 0 && b20Var.I >= 0) {
                    b20Var.I = -1;
                    b20Var.f();
                }
                b20Var.a.a(b20Var.n || b20Var.r.length() > 0, true);
                break;
            case 10:
                sd0 sd0Var = (sd0) this.b;
                if (sd0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    sd0Var.k(false);
                    break;
                }
                break;
            case 11:
                wm0 wm0Var = (wm0) this.b;
                ImageView imageView2 = wm0Var.c;
                h2 h2Var2 = wm0Var.e;
                boolean z11 = h2Var2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                wm0Var.a(h2Var2.getText().toString());
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new cc0(this, 28));
                break;
            case 13:
                my0 my0Var = (my0) this.b;
                ky0 ky0Var = my0Var.c;
                if (ky0Var != null && ky0Var.getVisibility() == 0) {
                    my0Var.e();
                    break;
                }
                break;
            case 14:
                n61 n61Var = (n61) this.b;
                String obj3 = n61Var.J.getText().toString();
                o61 o61Var = n61Var.K;
                int h = o61Var.d.getAdapter() == null ? 0 : o61Var.d.getAdapter().h();
                o61Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (o0Var = o61Var.d) != null) {
                    s4.h0 adapter = o0Var.getAdapter();
                    kl0 kl0Var = o61Var.f;
                    if (adapter != kl0Var) {
                        bi.o0 o0Var2 = o61Var.d;
                        o0Var2.Y1 = false;
                        o0Var2.Z1 = 0;
                        o0Var2.setAdapter(kl0Var);
                        bi.o0 o0Var3 = o61Var.d;
                        o0Var3.Y1 = true;
                        o0Var3.Z1 = 0;
                        if (h == 0) {
                            o61Var.J(0);
                        }
                    }
                }
                o61Var.v.setVisibility(0);
                break;
            case 15:
                org.telegram.ui.k0 k0Var = (org.telegram.ui.k0) this.b;
                AndroidUtilities.updateViewShow(k0Var.J, editable.length() > 0 && k0Var.T, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.i4 i4Var = k0Var.B0;
                String lowerCase = obj4.toLowerCase();
                ah.p pVar = i4Var.V0;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    i4Var.V0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i13 = i4Var.W0 + 1;
                    i4Var.W0 = i13;
                    if (!i4Var.u0[0].f()) {
                        ah.p pVar2 = new ah.p(i4Var, lowerCase, i13, 23);
                        i4Var.V0 = pVar2;
                        AndroidUtilities.runOnUIThread(pVar2, 400L);
                        break;
                    } else {
                        i4Var.d0(true);
                        if (i4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.z0 webView = i4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(i4Var, 9);
                            webView.findAllAsync(lowerCase);
                            i4Var.h0();
                            break;
                        }
                    }
                } else {
                    i4Var.E.clear();
                    i4Var.F = lowerCase;
                    i4Var.u0[0].c.y.clear();
                    i4Var.d0(false);
                    if (!i4Var.u0[0].f()) {
                        i4Var.u0[0].b.e1();
                        i4Var.W(0);
                    } else if (i4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.z0 webView2 = i4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(i4Var, 9);
                        webView2.findAllAsync("");
                        i4Var.h0();
                    }
                    i4Var.W0 = -1;
                    break;
                }
                break;
            case 16:
                rh.c cVar = (rh.c) this.b;
                int length = cVar.a.getText().length();
                le.b bVar = cVar.H;
                int i14 = cVar.x;
                bVar.a(length > (i14 * 7) / 10, true);
                cVar.I.a(length > i14, true);
                cVar.f.l(Integer.toString(i14 - length), false);
                break;
            case 17:
                uh.f fVar = (uh.f) this.b;
                fVar.J();
                fVar.c0 = editable.toString();
                fVar.d0.N(true);
                break;
            case 18:
                wg.k kVar = ((wg.l) this.b).c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    ug.b0 b0Var = ((ug.v) kVar).a;
                    b0Var.v0 = trim;
                    b0Var.a0(false, false);
                    b0Var.a0(true, true);
                    break;
                }
                break;
            default:
                zh.g gVar = (zh.g) this.b;
                zh.b bVar2 = gVar.n0;
                i12 = ((org.telegram.ui.ActionBar.n2) gVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h10 = zh.o.g(i12).h(gVar.b, false);
                long j3 = h10 == null ? 0L : h10.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                gVar.P = parseLong;
                if (parseLong > j3) {
                    gVar.P = j3;
                    gVar.N = true;
                    gVar.Q.setText(Long.toString(j3));
                    gi.o oVar = gVar.Q;
                    oVar.setSelection(oVar.getText().length());
                    gVar.N = false;
                }
                gVar.O = gVar.P == j3;
                AndroidUtilities.cancelRunOnUIThread(bVar2);
                bVar2.run();
                if (!gVar.N) {
                    gVar.O = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.a) {
            case 10:
                sd0 sd0Var = (sd0) this.b;
                LinkedList linkedList = sd0Var.N;
                LinkedList linkedList2 = sd0Var.M;
                Drawable drawable = sd0Var.a;
                if (drawable instanceof dc0) {
                    dc0 dc0Var = (dc0) drawable;
                    dc0Var.D = null;
                    dc0Var.z();
                    float f7 = dc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        dc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        dc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            sd0Var.b(dc0Var);
                            break;
                        } else {
                            linkedList2.offer(new y0(this, z10, dc0Var, 21));
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
        switch (this.a) {
            case 4:
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
        }
    }

    private final void a(Editable editable) {
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

    private final /* synthetic */ void J(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void K(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void L(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void M(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
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

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
