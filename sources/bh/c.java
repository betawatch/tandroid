package bh;

import ag.v0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import eg.c1;
import eg.s0;
import f2.p0;
import java.util.ArrayList;
import java.util.LinkedList;
import jh.b0;
import jh.e1;
import jh.r5;
import lh.m5;
import nh.c2;
import nh.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.d0;
import org.telegram.ui.m4;
import org.telegram.ui.o0;
import org.telegram.ui.web.w0;
import sf.h0;
import sf.l0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        e1 e1Var;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int length = fVar.a.getText().length();
                vd.a aVar = fVar.D;
                int i13 = fVar.x;
                aVar.a(length > (i13 * 7) / 10, true);
                fVar.E.a(length > i13, true);
                fVar.f.l(Integer.toString(i13 - length), false);
                break;
            case 1:
                eh.f fVar2 = (eh.f) this.b;
                fVar2.I();
                fVar2.Y = editable.toString();
                fVar2.Z.N(true);
                break;
            case 2:
                gg.l lVar = ((gg.m) this.b).c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    c1 c1Var = ((s0) lVar).a;
                    c1Var.r0 = trim;
                    c1Var.a0(false, false);
                    c1Var.a0(true, true);
                    break;
                }
                break;
            case 3:
                jh.q qVar = (jh.q) this.b;
                jh.c cVar = qVar.j0;
                i10 = ((o2) qVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = b0.g(i10).h(qVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                qVar.L = parseLong;
                if (parseLong > j10) {
                    qVar.L = j10;
                    qVar.J = true;
                    qVar.M.setText(Long.toString(j10));
                    jh.m mVar = qVar.M;
                    mVar.setSelection(mVar.getText().length());
                    qVar.J = false;
                }
                qVar.K = qVar.L == j10;
                AndroidUtilities.cancelRunOnUIThread(cVar);
                cVar.run();
                if (!qVar.J) {
                    qVar.K = false;
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                d2 d2Var = (d2) this.b;
                ImageView imageView = d2Var.n;
                ig.f fVar3 = d2Var.d;
                if (!d2Var.r) {
                    d2Var.d(false);
                    String obj = fVar3.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = d2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    c2 c2Var = d2Var.f;
                    if (c2Var != null) {
                        c2Var.F1(null);
                        d2Var.f.G1(TextUtils.isEmpty(obj), true);
                    }
                    if (fVar3 != null) {
                        fVar3.animate().cancel();
                        ViewPropertyAnimator translationX = fVar3.animate().translationX(0.0f);
                        jr jrVar = jr.h;
                        translationX.setInterpolator(jrVar).start();
                        if (imageView != null && d2Var.h != (!TextUtils.isEmpty(fVar3.getText()))) {
                            d2Var.h = !d2Var.h;
                            imageView.animate().cancel();
                            if (d2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(d2Var.h ? 1.0f : 0.7f).scaleY(d2Var.h ? 1.0f : 0.7f).alpha(d2Var.h ? 1.0f : 0.0f).withEndAction(new m5(this, 24)).setInterpolator(jrVar).setDuration(320L).setStartDelay(d2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 6:
                ed edVar = (ed) this.b;
                edVar.F((edVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 7:
                st stVar = (st) this.b;
                i11 = stVar.lineCount;
                if (i11 != stVar.getLineCount()) {
                    z10 = stVar.isInitLineCount;
                    if (!z10 && stVar.getMeasuredWidth() > 0) {
                        i12 = stVar.lineCount;
                        stVar.onLineCountChanged(i12, stVar.getLineCount());
                    }
                    stVar.lineCount = stVar.getLineCount();
                    break;
                }
                break;
            case 8:
                ((eg.j) this.b).run();
                break;
            case 9:
                ry ryVar = (ry) this.b;
                ryVar.g(false);
                cq cqVar = ryVar.d;
                String obj2 = cqVar.getText().toString();
                ryVar.c(obj2, true);
                qy qyVar = ryVar.r;
                if (qyVar != null) {
                    qyVar.F1(null);
                    qyVar.G1(TextUtils.isEmpty(obj2), true);
                }
                ryVar.f(!TextUtils.isEmpty(obj2));
                if (cqVar != null) {
                    cqVar.clearAnimation();
                    cqVar.animate().translationX(0.0f).setInterpolator(jr.h).start();
                }
                ryVar.d(false);
                break;
            case 10:
                x10 x10Var = (x10) this.b;
                if (!x10Var.B.isEmpty() && editable.length() > 0 && x10Var.E >= 0) {
                    x10Var.E = -1;
                    x10Var.f();
                }
                x10Var.a.a(x10Var.n || x10Var.r.length() > 0, true);
                break;
            case 11:
                nd0 nd0Var = (nd0) this.b;
                if (nd0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    nd0Var.k(false);
                    break;
                }
                break;
            case 12:
                um0 um0Var = (um0) this.b;
                ImageView imageView2 = um0Var.c;
                ig.f fVar4 = um0Var.e;
                boolean z11 = fVar4.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                um0Var.a(fVar4.getText().toString());
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new xb0(this, 28));
                break;
            case 14:
                fy0 fy0Var = (fy0) this.b;
                dy0 dy0Var = fy0Var.c;
                if (dy0Var != null && dy0Var.getVisibility() == 0) {
                    fy0Var.e();
                    break;
                }
                break;
            case 15:
                e61 e61Var = (e61) this.b;
                String obj3 = e61Var.F.getText().toString();
                f61 f61Var = e61Var.G;
                int h10 = f61Var.d.getAdapter() == null ? 0 : f61Var.d.getAdapter().h();
                f61Var.F(obj3);
                if (TextUtils.isEmpty(obj3) && (e1Var = f61Var.d) != null) {
                    p0 adapter = e1Var.getAdapter();
                    il0 il0Var = f61Var.f;
                    if (adapter != il0Var) {
                        e1 e1Var2 = f61Var.d;
                        e1Var2.U1 = false;
                        e1Var2.V1 = 0;
                        e1Var2.setAdapter(il0Var);
                        e1 e1Var3 = f61Var.d;
                        e1Var3.U1 = true;
                        e1Var3.V1 = 0;
                        if (h10 == 0) {
                            f61Var.I(0);
                        }
                    }
                }
                f61Var.v.setVisibility(0);
                break;
            case 16:
                o0 o0Var = (o0) this.b;
                AndroidUtilities.updateViewShow(o0Var.F, editable.length() > 0 && o0Var.P, true, true);
                String obj4 = editable.toString();
                m4 m4Var = o0Var.x0;
                String lowerCase = obj4.toLowerCase();
                v0 v0Var = m4Var.R0;
                if (v0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(v0Var);
                    m4Var.R0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i14 = m4Var.S0 + 1;
                    m4Var.S0 = i14;
                    if (!m4Var.q0[0].f()) {
                        v0 v0Var2 = new v0(m4Var, lowerCase, i14, 22);
                        m4Var.R0 = v0Var2;
                        AndroidUtilities.runOnUIThread(v0Var2, 400L);
                        break;
                    } else {
                        m4Var.d0(true);
                        if (m4Var.q0[0].getWebView() != null) {
                            w0 webView = m4Var.q0[0].getWebView();
                            webView.E = new d0(m4Var, 9);
                            webView.findAllAsync(lowerCase);
                            m4Var.h0();
                            break;
                        }
                    }
                } else {
                    m4Var.A.clear();
                    m4Var.B = lowerCase;
                    m4Var.q0[0].c.y.clear();
                    m4Var.d0(false);
                    if (!m4Var.q0[0].f()) {
                        m4Var.q0[0].b.f1();
                        m4Var.W(0);
                    } else if (m4Var.q0[0].getWebView() != null) {
                        w0 webView2 = m4Var.q0[0].getWebView();
                        webView2.E = new d0(m4Var, 9);
                        webView2.findAllAsync("");
                        m4Var.h0();
                    }
                    m4Var.S0 = -1;
                    break;
                }
                break;
            case 17:
                ((qh.n) this.b).Y();
                break;
            case 18:
                l0 l0Var = (l0) this.b;
                l0Var.x = false;
                h0 h0Var = l0Var.B;
                AndroidUtilities.cancelRunOnUIThread(h0Var);
                if (TextUtils.isEmpty(l0Var.f.getText())) {
                    l0Var.y = null;
                    l0Var.d.b();
                } else {
                    l0Var.x = true;
                    AndroidUtilities.runOnUIThread(h0Var, 800L);
                }
                l0Var.c.U2.N(true);
                l0Var.b0();
                break;
            default:
                sf.v0 v0Var3 = (sf.v0) this.b;
                if (!v0Var3.d) {
                    v0Var3.A = false;
                    v0Var3.y = editable.toString();
                    v0Var3.U(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.a) {
            case 11:
                nd0 nd0Var = (nd0) this.b;
                LinkedList linkedList = nd0Var.J;
                LinkedList linkedList2 = nd0Var.I;
                Drawable drawable = nd0Var.a;
                if (drawable instanceof yb0) {
                    yb0 yb0Var = (yb0) drawable;
                    yb0Var.D = null;
                    yb0Var.z();
                    float f9 = yb0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        yb0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        yb0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f9 >= 1.0f) {
                            nd0Var.b(yb0Var);
                            break;
                        } else {
                            linkedList2.offer(new r5(this, z10, yb0Var, 19));
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
                Editable text = searchView.B.getText();
                searchView.k0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.j0 && !searchView.c0 && isEmpty) {
                    searchView.G.setVisibility(8);
                    i13 = 0;
                }
                searchView.I.setVisibility(i13);
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

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void I(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void J(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void K(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void L(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void M(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void b(int i10, int i11, int i12, CharSequence charSequence) {
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

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void u(int i10, int i11, int i12, CharSequence charSequence) {
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
