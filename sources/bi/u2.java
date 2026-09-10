package bi;

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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zy0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u2 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        y1 y1Var;
        int i12;
        switch (this.a) {
            case 0:
                x2 x2Var = (x2) this.b;
                ImageView imageView = x2Var.n;
                t2 t2Var = x2Var.d;
                if (!x2Var.r) {
                    x2Var.d(false);
                    String obj = t2Var.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = x2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    w2 w2Var = x2Var.f;
                    if (w2Var != null) {
                        w2Var.E1(null);
                        x2Var.f.F1(TextUtils.isEmpty(obj), true);
                    }
                    if (t2Var != null) {
                        t2Var.animate().cancel();
                        ViewPropertyAnimator translationX = t2Var.animate().translationX(0.0f);
                        wr wrVar = wr.h;
                        translationX.setInterpolator(wrVar).start();
                        if (imageView != null && x2Var.h != (!TextUtils.isEmpty(t2Var.getText()))) {
                            x2Var.h = !x2Var.h;
                            imageView.animate().cancel();
                            if (x2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(x2Var.h ? 1.0f : 0.7f).scaleY(x2Var.h ? 1.0f : 0.7f).alpha(x2Var.h ? 1.0f : 0.0f).withEndAction(new a3.d(this, 19)).setInterpolator(wrVar).setDuration(320L).setStartDelay(x2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((ei.p) this.b).Y();
                break;
            case 2:
                gg.y0 y0Var = (gg.y0) this.b;
                y0Var.x = false;
                gg.r0 r0Var = y0Var.F;
                AndroidUtilities.cancelRunOnUIThread(r0Var);
                if (TextUtils.isEmpty(y0Var.f.getText())) {
                    y0Var.y = null;
                    y0Var.d.b();
                } else {
                    y0Var.x = true;
                    AndroidUtilities.runOnUIThread(r0Var, 800L);
                }
                y0Var.c.Y2.N(true);
                y0Var.b0();
                break;
            case 3:
                gg.k1 k1Var = (gg.k1) this.b;
                if (!k1Var.d) {
                    k1Var.E = false;
                    k1Var.y = editable.toString();
                    k1Var.U(true);
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) this.b;
                jdVar.F((jdVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 6:
                fu fuVar = (fu) this.b;
                i10 = fuVar.lineCount;
                if (i10 != fuVar.getLineCount()) {
                    z10 = fuVar.isInitLineCount;
                    if (!z10 && fuVar.getMeasuredWidth() > 0) {
                        i11 = fuVar.lineCount;
                        fuVar.onLineCountChanged(i11, fuVar.getLineCount());
                    }
                    fuVar.lineCount = fuVar.getLineCount();
                    break;
                }
                break;
            case 7:
                ((e2) this.b).run();
                break;
            case 8:
                ez ezVar = (ez) this.b;
                ezVar.g(false);
                oq oqVar = ezVar.d;
                String obj2 = oqVar.getText().toString();
                ezVar.c(obj2, true);
                dz dzVar = ezVar.r;
                if (dzVar != null) {
                    dzVar.E1(null);
                    dzVar.F1(TextUtils.isEmpty(obj2), true);
                }
                ezVar.f(!TextUtils.isEmpty(obj2));
                if (oqVar != null) {
                    oqVar.clearAnimation();
                    oqVar.animate().translationX(0.0f).setInterpolator(wr.h).start();
                }
                ezVar.d(false);
                break;
            case 9:
                k20 k20Var = (k20) this.b;
                if (!k20Var.F.isEmpty() && editable.length() > 0 && k20Var.I >= 0) {
                    k20Var.I = -1;
                    k20Var.f();
                }
                k20Var.a.a(k20Var.n || k20Var.r.length() > 0, true);
                break;
            case 10:
                be0 be0Var = (be0) this.b;
                if (be0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    be0Var.k(false);
                    break;
                }
                break;
            case 11:
                gn0 gn0Var = (gn0) this.b;
                ImageView imageView2 = gn0Var.c;
                t2 t2Var2 = gn0Var.e;
                boolean z11 = t2Var2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                gn0Var.a(t2Var2.getText().toString());
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new kc0(this, 28));
                break;
            case 13:
                zy0 zy0Var = (zy0) this.b;
                xy0 xy0Var = zy0Var.c;
                if (xy0Var != null && xy0Var.getVisibility() == 0) {
                    zy0Var.e();
                    break;
                }
                break;
            case 14:
                a71 a71Var = (a71) this.b;
                String obj3 = a71Var.J.getText().toString();
                b71 b71Var = a71Var.K;
                int h = b71Var.d.getAdapter() == null ? 0 : b71Var.d.getAdapter().h();
                b71Var.F(obj3);
                if (TextUtils.isEmpty(obj3) && (y1Var = b71Var.d) != null) {
                    s4.h0 adapter = y1Var.getAdapter();
                    ul0 ul0Var = b71Var.f;
                    if (adapter != ul0Var) {
                        y1 y1Var2 = b71Var.d;
                        y1Var2.Y1 = false;
                        y1Var2.Z1 = 0;
                        y1Var2.setAdapter(ul0Var);
                        y1 y1Var3 = b71Var.d;
                        y1Var3.Y1 = true;
                        y1Var3.Z1 = 0;
                        if (h == 0) {
                            b71Var.J(0);
                        }
                    }
                }
                b71Var.v.setVisibility(0);
                break;
            case 15:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                AndroidUtilities.updateViewShow(l0Var.J, editable.length() > 0 && l0Var.T, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.j4 j4Var = l0Var.B0;
                String lowerCase = obj4.toLowerCase();
                g3 g3Var = j4Var.V0;
                if (g3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(g3Var);
                    j4Var.V0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i13 = j4Var.W0 + 1;
                    j4Var.W0 = i13;
                    if (!j4Var.u0[0].f()) {
                        g3 g3Var2 = new g3(j4Var, lowerCase, i13, 20);
                        j4Var.V0 = g3Var2;
                        AndroidUtilities.runOnUIThread(g3Var2, 400L);
                        break;
                    } else {
                        j4Var.d0(true);
                        if (j4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.y0 webView = j4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(j4Var, 9);
                            webView.findAllAsync(lowerCase);
                            j4Var.h0();
                            break;
                        }
                    }
                } else {
                    j4Var.E.clear();
                    j4Var.F = lowerCase;
                    j4Var.u0[0].c.y.clear();
                    j4Var.d0(false);
                    if (!j4Var.u0[0].f()) {
                        j4Var.u0[0].b.e1();
                        j4Var.W(0);
                    } else if (j4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.y0 webView2 = j4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(j4Var, 9);
                        webView2.findAllAsync("");
                        j4Var.h0();
                    }
                    j4Var.W0 = -1;
                    break;
                }
                break;
            case 16:
                ph.c cVar = (ph.c) this.b;
                int length = cVar.a.getText().length();
                le.b bVar = cVar.H;
                int i14 = cVar.x;
                bVar.a(length > (i14 * 7) / 10, true);
                cVar.I.a(length > i14, true);
                cVar.f.l(Integer.toString(i14 - length), false);
                break;
            case 17:
                sh.f fVar = (sh.f) this.b;
                fVar.J();
                fVar.c0 = editable.toString();
                fVar.d0.N(true);
                break;
            case 18:
                ug.k kVar = ((ug.l) this.b).c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    sg.a0 a0Var = ((sg.u) kVar).a;
                    a0Var.v0 = trim;
                    a0Var.a0(false, false);
                    a0Var.a0(true, true);
                    break;
                }
                break;
            default:
                xh.h hVar = (xh.h) this.b;
                xh.b bVar2 = hVar.n0;
                i12 = ((org.telegram.ui.ActionBar.p2) hVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h10 = xh.p.g(i12).h(hVar.b, false);
                long j3 = h10 == null ? 0L : h10.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                hVar.P = parseLong;
                if (parseLong > j3) {
                    hVar.P = j3;
                    hVar.N = true;
                    hVar.Q.setText(Long.toString(j3));
                    ei.o oVar = hVar.Q;
                    oVar.setSelection(oVar.getText().length());
                    hVar.N = false;
                }
                hVar.O = hVar.P == j3;
                AndroidUtilities.cancelRunOnUIThread(bVar2);
                bVar2.run();
                if (!hVar.N) {
                    hVar.O = false;
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
                be0 be0Var = (be0) this.b;
                LinkedList linkedList = be0Var.N;
                LinkedList linkedList2 = be0Var.M;
                Drawable drawable = be0Var.a;
                if (drawable instanceof lc0) {
                    lc0 lc0Var = (lc0) drawable;
                    lc0Var.D = null;
                    lc0Var.z();
                    float f7 = lc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        lc0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        lc0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            be0Var.b(lc0Var);
                            break;
                        } else {
                            linkedList2.offer(new c1(this, z10, lc0Var, 21));
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
