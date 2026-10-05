package ci;

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
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zy;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        ai.w0 w0Var;
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
                        k2Var.G1(null);
                        l2Var.f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (h2Var != null) {
                        h2Var.animate().cancel();
                        ViewPropertyAnimator translationX = h2Var.animate().translationX(0.0f);
                        tr trVar = tr.h;
                        translationX.setInterpolator(trVar).start();
                        if (imageView != null && l2Var.h != (!TextUtils.isEmpty(h2Var.getText()))) {
                            l2Var.h = !l2Var.h;
                            imageView.animate().cancel();
                            if (l2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(l2Var.h ? 1.0f : 0.7f).scaleY(l2Var.h ? 1.0f : 0.7f).alpha(l2Var.h ? 1.0f : 0.0f).withEndAction(new androidx.fragment.app.a0(this, 13)).setInterpolator(trVar).setDuration(320L).setStartDelay(l2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((fi.p) this.b).X();
                break;
            case 2:
                hg.u0 u0Var = (hg.u0) this.b;
                u0Var.x = false;
                hg.n0 n0Var = u0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(u0Var.f.getText())) {
                    u0Var.y = null;
                    u0Var.d.b();
                } else {
                    u0Var.x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                u0Var.c.f3.N(true);
                u0Var.b0();
                break;
            case 3:
                hg.e1 e1Var = (hg.e1) this.b;
                if (!e1Var.d) {
                    e1Var.E = false;
                    e1Var.y = editable.toString();
                    e1Var.S(true);
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                md mdVar = (md) this.b;
                mdVar.F((mdVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 6:
                eu euVar = (eu) this.b;
                i10 = euVar.lineCount;
                if (i10 != euVar.getLineCount()) {
                    z10 = euVar.isInitLineCount;
                    if (!z10 && euVar.getMeasuredWidth() > 0) {
                        i11 = euVar.lineCount;
                        euVar.onLineCountChanged(i11, euVar.getLineCount());
                    }
                    euVar.lineCount = euVar.getLineCount();
                    break;
                }
                break;
            case 7:
                ((u1) this.b).run();
                break;
            case 8:
                az azVar = (az) this.b;
                azVar.g(false);
                lq lqVar = azVar.d;
                String obj2 = lqVar.getText().toString();
                azVar.c(obj2, true);
                zy zyVar = azVar.r;
                if (zyVar != null) {
                    zyVar.G1(null);
                    zyVar.H1(TextUtils.isEmpty(obj2), true);
                }
                azVar.f(!TextUtils.isEmpty(obj2));
                if (lqVar != null) {
                    lqVar.clearAnimation();
                    lqVar.animate().translationX(0.0f).setInterpolator(tr.h).start();
                }
                azVar.d(false);
                break;
            case 9:
                f20 f20Var = (f20) this.b;
                if (!f20Var.F.isEmpty() && editable.length() > 0 && f20Var.I >= 0) {
                    f20Var.I = -1;
                    f20Var.f();
                }
                f20Var.a.a(f20Var.n || f20Var.r.length() > 0, true);
                break;
            case 10:
                ee0 ee0Var = (ee0) this.b;
                if (ee0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    ee0Var.k(false);
                    break;
                }
                break;
            case 11:
                pn0 pn0Var = (pn0) this.b;
                ImageView imageView2 = pn0Var.c;
                h2 h2Var2 = pn0Var.e;
                boolean z11 = h2Var2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                pn0Var.a(h2Var2.getText().toString());
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new gq0(this, 0));
                break;
            case 13:
                jz0 jz0Var = (jz0) this.b;
                hz0 hz0Var = jz0Var.c;
                if (hz0Var != null && hz0Var.getVisibility() == 0) {
                    jz0Var.e();
                    break;
                }
                break;
            case 14:
                n71 n71Var = (n71) this.b;
                String obj3 = n71Var.J.getText().toString();
                o71 o71Var = n71Var.K;
                int h = o71Var.d.getAdapter() == null ? 0 : o71Var.d.getAdapter().h();
                o71Var.E(obj3);
                if (TextUtils.isEmpty(obj3) && (w0Var = o71Var.d) != null) {
                    s4.h0 adapter = w0Var.getAdapter();
                    yl0 yl0Var = o71Var.f;
                    if (adapter != yl0Var) {
                        ai.w0 w0Var2 = o71Var.d;
                        w0Var2.Y1 = false;
                        w0Var2.Z1 = 0;
                        w0Var2.setAdapter(yl0Var);
                        ai.w0 w0Var3 = o71Var.d;
                        w0Var3.Y1 = true;
                        w0Var3.Z1 = 0;
                        if (h == 0) {
                            o71Var.H(0);
                        }
                    }
                }
                o71Var.v.setVisibility(0);
                break;
            case 15:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                AndroidUtilities.updateViewShow(l0Var.J, editable.length() > 0 && l0Var.T, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.i4 i4Var = l0Var.B0;
                String lowerCase = obj4.toLowerCase();
                ai.s1 s1Var = i4Var.V0;
                if (s1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    i4Var.V0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i13 = i4Var.W0 + 1;
                    i4Var.W0 = i13;
                    if (!i4Var.u0[0].f()) {
                        ai.s1 s1Var2 = new ai.s1(i4Var, lowerCase, i13, 22);
                        i4Var.V0 = s1Var2;
                        AndroidUtilities.runOnUIThread(s1Var2, 400L);
                        break;
                    } else {
                        i4Var.d0(true);
                        if (i4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.z0 webView = i4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(i4Var, 9);
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
                        i4Var.u0[0].b.g1();
                        i4Var.W(0);
                    } else if (i4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.z0 webView2 = i4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(i4Var, 9);
                        webView2.findAllAsync("");
                        i4Var.h0();
                    }
                    i4Var.W0 = -1;
                    break;
                }
                break;
            case 16:
                qh.c cVar = (qh.c) this.b;
                int length = cVar.a.getText().length();
                le.b bVar = cVar.H;
                int i14 = cVar.x;
                bVar.a(length > (i14 * 7) / 10, true);
                cVar.I.a(length > i14, true);
                cVar.f.l(Integer.toString(i14 - length), false);
                break;
            case 17:
                th.f fVar = (th.f) this.b;
                fVar.H();
                fVar.c0 = editable.toString();
                fVar.d0.N(true);
                break;
            case 18:
                vg.k kVar = ((vg.l) this.b).c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    tg.a0 a0Var = ((tg.u) kVar).a;
                    a0Var.v0 = trim;
                    a0Var.Z(false, false);
                    a0Var.Z(true, true);
                    break;
                }
                break;
            default:
                yh.h hVar = (yh.h) this.b;
                yh.b bVar2 = hVar.s0;
                i12 = ((org.telegram.ui.ActionBar.n2) hVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h10 = yh.p.g(i12).h(hVar.b, false);
                long j3 = h10 == null ? 0L : h10.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                hVar.Y = parseLong;
                if (parseLong > j3) {
                    hVar.Y = j3;
                    hVar.W = true;
                    hVar.Z.setText(Long.toString(j3));
                    fi.o oVar = hVar.Z;
                    oVar.setSelection(oVar.getText().length());
                    hVar.W = false;
                }
                hVar.X = hVar.Y == j3;
                AndroidUtilities.cancelRunOnUIThread(bVar2);
                bVar2.run();
                if (!hVar.W) {
                    hVar.X = false;
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
                ee0 ee0Var = (ee0) this.b;
                LinkedList linkedList = ee0Var.N;
                LinkedList linkedList2 = ee0Var.M;
                Drawable drawable = ee0Var.a;
                if (drawable instanceof pc0) {
                    pc0 pc0Var = (pc0) drawable;
                    pc0Var.D = null;
                    pc0Var.z();
                    float f7 = pc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        pc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        pc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            ee0Var.b(pc0Var);
                            break;
                        } else {
                            linkedList2.offer(new y0(this, z10, pc0Var, 22));
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
