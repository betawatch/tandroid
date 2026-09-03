package eh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import f2.p0;
import hg.b1;
import hg.r0;
import java.util.ArrayList;
import java.util.LinkedList;
import mh.a0;
import mh.d1;
import mh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.yy;
import org.telegram.ui.c0;
import org.telegram.ui.l4;
import org.telegram.ui.m0;
import org.telegram.ui.web.s0;
import org.telegram.ui.web.x0;
import qh.q1;
import qh.r1;
import vf.g0;
import vf.l0;
import vf.v0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        boolean z4;
        int i12;
        d1 d1Var;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                int length = fVar.a.getText().length();
                xd.a aVar = fVar.E;
                int i13 = fVar.x;
                aVar.a(length > (i13 * 7) / 10, true);
                fVar.F.a(length > i13, true);
                fVar.f.l(Integer.toString(i13 - length), false);
                break;
            case 1:
                hh.f fVar2 = (hh.f) this.b;
                fVar2.I();
                fVar2.Z = editable.toString();
                fVar2.a0.N(true);
                break;
            case 2:
                jg.l lVar = ((jg.m) this.b).c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    b1 b1Var = ((r0) lVar).a;
                    b1Var.s0 = trim;
                    b1Var.a0(false, false);
                    b1Var.a0(true, true);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                mh.p pVar = (mh.p) this.b;
                mh.c cVar = pVar.k0;
                i10 = ((p2) pVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = a0.g(i10).h(pVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                pVar.M = parseLong;
                if (parseLong > j10) {
                    pVar.M = j10;
                    pVar.K = true;
                    pVar.N.setText(Long.toString(j10));
                    mh.m mVar = pVar.N;
                    mVar.setSelection(mVar.getText().length());
                    pVar.K = false;
                }
                pVar.L = pVar.M == j10;
                AndroidUtilities.cancelRunOnUIThread(cVar);
                cVar.run();
                if (!pVar.K) {
                    pVar.L = false;
                    break;
                }
                break;
            case 5:
                bd bdVar = (bd) this.b;
                bdVar.F((bdVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 6:
                xt xtVar = (xt) this.b;
                i11 = xtVar.lineCount;
                if (i11 != xtVar.getLineCount()) {
                    z4 = xtVar.isInitLineCount;
                    if (!z4 && xtVar.getMeasuredWidth() > 0) {
                        i12 = xtVar.lineCount;
                        xtVar.onLineCountChanged(i12, xtVar.getLineCount());
                    }
                    xtVar.lineCount = xtVar.getLineCount();
                    break;
                }
                break;
            case 7:
                ((hg.j) this.b).run();
                break;
            case 8:
                yy yyVar = (yy) this.b;
                yyVar.g(false);
                iq iqVar = yyVar.d;
                String obj = iqVar.getText().toString();
                yyVar.c(obj, true);
                xy xyVar = yyVar.r;
                if (xyVar != null) {
                    xyVar.E1(null);
                    xyVar.F1(TextUtils.isEmpty(obj), true);
                }
                yyVar.f(!TextUtils.isEmpty(obj));
                if (iqVar != null) {
                    iqVar.clearAnimation();
                    iqVar.animate().translationX(0.0f).setInterpolator(pr.h).start();
                }
                yyVar.d(false);
                break;
            case 9:
                d20 d20Var = (d20) this.b;
                if (!d20Var.C.isEmpty() && editable.length() > 0 && d20Var.F >= 0) {
                    d20Var.F = -1;
                    d20Var.f();
                }
                d20Var.a.a(d20Var.n || d20Var.r.length() > 0, true);
                break;
            case 10:
                xd0 xd0Var = (xd0) this.b;
                if (xd0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    xd0Var.k(false);
                    break;
                }
                break;
            case 11:
                en0 en0Var = (en0) this.b;
                ImageView imageView = en0Var.c;
                lg.f fVar3 = en0Var.e;
                boolean z10 = fVar3.length() > 0;
                if (z10 != (imageView.getAlpha() != 0.0f)) {
                    imageView.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
                }
                en0Var.a(fVar3.getText().toString());
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ec0(this, 28));
                break;
            case 13:
                qy0 qy0Var = (qy0) this.b;
                oy0 oy0Var = qy0Var.c;
                if (oy0Var != null && oy0Var.getVisibility() == 0) {
                    qy0Var.e();
                    break;
                }
                break;
            case 14:
                q61 q61Var = (q61) this.b;
                String obj2 = q61Var.G.getText().toString();
                r61 r61Var = q61Var.H;
                int h9 = r61Var.d.getAdapter() == null ? 0 : r61Var.d.getAdapter().h();
                r61Var.F(obj2);
                if (TextUtils.isEmpty(obj2) && (d1Var = r61Var.d) != null) {
                    p0 adapter = d1Var.getAdapter();
                    rl0 rl0Var = r61Var.f;
                    if (adapter != rl0Var) {
                        d1 d1Var2 = r61Var.d;
                        d1Var2.V1 = false;
                        d1Var2.W1 = 0;
                        d1Var2.setAdapter(rl0Var);
                        d1 d1Var3 = r61Var.d;
                        d1Var3.V1 = true;
                        d1Var3.W1 = 0;
                        if (h9 == 0) {
                            r61Var.I(0);
                        }
                    }
                }
                r61Var.v.setVisibility(0);
                break;
            case 15:
                m0 m0Var = (m0) this.b;
                AndroidUtilities.updateViewShow(m0Var.G, editable.length() > 0 && m0Var.Q, true, true);
                String obj3 = editable.toString();
                l4 l4Var = m0Var.y0;
                String lowerCase = obj3.toLowerCase();
                bh.a aVar2 = l4Var.S0;
                if (aVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(aVar2);
                    l4Var.S0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i14 = l4Var.T0 + 1;
                    l4Var.T0 = i14;
                    if (!l4Var.r0[0].f()) {
                        bh.a aVar3 = new bh.a(l4Var, lowerCase, i14, 20);
                        l4Var.S0 = aVar3;
                        AndroidUtilities.runOnUIThread(aVar3, 400L);
                        break;
                    } else {
                        l4Var.d0(true);
                        if (l4Var.r0[0].getWebView() != null) {
                            x0 webView = l4Var.r0[0].getWebView();
                            webView.F = new c0(l4Var, 9);
                            webView.findAllAsync(lowerCase);
                            l4Var.h0();
                            break;
                        }
                    }
                } else {
                    l4Var.B.clear();
                    l4Var.C = lowerCase;
                    l4Var.r0[0].c.y.clear();
                    l4Var.d0(false);
                    if (!l4Var.r0[0].f()) {
                        l4Var.r0[0].b.e1();
                        l4Var.W(0);
                    } else if (l4Var.r0[0].getWebView() != null) {
                        x0 webView2 = l4Var.r0[0].getWebView();
                        webView2.F = new c0(l4Var, 9);
                        webView2.findAllAsync("");
                        l4Var.h0();
                    }
                    l4Var.T0 = -1;
                    break;
                }
                break;
            case 16:
                r1 r1Var = (r1) this.b;
                ImageView imageView2 = r1Var.n;
                lg.f fVar4 = r1Var.d;
                if (!r1Var.r) {
                    r1Var.d(false);
                    String obj4 = fVar4.getText().toString();
                    String str = TextUtils.isEmpty(obj4) ? null : obj4;
                    Utilities.Callback2 callback2 = r1Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    q1 q1Var = r1Var.f;
                    if (q1Var != null) {
                        q1Var.E1(null);
                        r1Var.f.F1(TextUtils.isEmpty(obj4), true);
                    }
                    if (fVar4 != null) {
                        fVar4.animate().cancel();
                        ViewPropertyAnimator translationX = fVar4.animate().translationX(0.0f);
                        pr prVar = pr.h;
                        translationX.setInterpolator(prVar).start();
                        if (imageView2 != null && r1Var.h != (!TextUtils.isEmpty(fVar4.getText()))) {
                            r1Var.h = !r1Var.h;
                            imageView2.animate().cancel();
                            if (r1Var.h) {
                                imageView2.setVisibility(0);
                            }
                            imageView2.animate().scaleX(r1Var.h ? 1.0f : 0.7f).scaleY(r1Var.h ? 1.0f : 0.7f).alpha(r1Var.h ? 1.0f : 0.0f).withEndAction(new s0(this, 16)).setInterpolator(prVar).setDuration(320L).setStartDelay(r1Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 17:
                ((th.n) this.b).Y();
                break;
            case 18:
                l0 l0Var = (l0) this.b;
                l0Var.x = false;
                g0 g0Var = l0Var.C;
                AndroidUtilities.cancelRunOnUIThread(g0Var);
                if (TextUtils.isEmpty(l0Var.f.getText())) {
                    l0Var.y = null;
                    l0Var.d.b();
                } else {
                    l0Var.x = true;
                    AndroidUtilities.runOnUIThread(g0Var, 800L);
                }
                l0Var.c.V2.N(true);
                l0Var.b0();
                break;
            default:
                v0 v0Var = (v0) this.b;
                if (!v0Var.d) {
                    v0Var.B = false;
                    v0Var.y = editable.toString();
                    v0Var.U(true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z4;
        switch (this.a) {
            case 10:
                xd0 xd0Var = (xd0) this.b;
                LinkedList linkedList = xd0Var.K;
                LinkedList linkedList2 = xd0Var.J;
                Drawable drawable = xd0Var.a;
                if (drawable instanceof fc0) {
                    fc0 fc0Var = (fc0) drawable;
                    fc0Var.D = null;
                    fc0Var.z();
                    float f10 = fc0Var.h;
                    int i13 = 0;
                    boolean z10 = true;
                    if (i11 == 0 && i12 == 1) {
                        fc0Var.x(true);
                        z4 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        fc0Var.y();
                        z4 = false;
                    } else {
                        z4 = false;
                        z10 = false;
                    }
                    if (z10) {
                        if (f10 >= 1.0f) {
                            xd0Var.b(fc0Var);
                            break;
                        } else {
                            linkedList2.offer(new r5(this, z4, fc0Var, 17));
                            linkedList.offer(Boolean.valueOf(z4));
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i14 = 0; i14 < linkedList2.size(); i14++) {
                                Runnable runnable = (Runnable) linkedList2.get(i14);
                                if (((Boolean) linkedList.get(i14)).booleanValue() != z4) {
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
            case 3:
                SearchView searchView = (SearchView) this.b;
                Editable text = searchView.C.getText();
                searchView.l0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                int i13 = 8;
                if (searchView.k0 && !searchView.d0 && isEmpty) {
                    searchView.H.setVisibility(8);
                    i13 = 0;
                }
                searchView.J.setVisibility(i13);
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

    private final /* synthetic */ void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
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
