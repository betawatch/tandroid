package dh;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import f2.o0;
import gg.b1;
import gg.r0;
import java.util.ArrayList;
import java.util.LinkedList;
import lh.b0;
import lh.e1;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wy;
import org.telegram.ui.c0;
import org.telegram.ui.l4;
import org.telegram.ui.m0;
import org.telegram.ui.web.w0;
import ph.r1;
import ph.s1;
import uf.g0;
import uf.k0;
import uf.u0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        e1 e1Var;
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
                gh.f fVar2 = (gh.f) this.b;
                fVar2.I();
                fVar2.Z = editable.toString();
                fVar2.a0.N(true);
                break;
            case 2:
                ig.l lVar = ((ig.m) this.b).c;
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
                lh.q qVar = (lh.q) this.b;
                lh.d dVar = qVar.k0;
                i10 = ((p2) qVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = b0.g(i10).h(qVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                qVar.M = parseLong;
                if (parseLong > j10) {
                    qVar.M = j10;
                    qVar.K = true;
                    qVar.N.setText(Long.toString(j10));
                    lh.n nVar = qVar.N;
                    nVar.setSelection(nVar.getText().length());
                    qVar.K = false;
                }
                qVar.L = qVar.M == j10;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                dVar.run();
                if (!qVar.K) {
                    qVar.L = false;
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                bd bdVar = (bd) this.b;
                bdVar.F((bdVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 6:
                vt vtVar = (vt) this.b;
                i11 = vtVar.lineCount;
                if (i11 != vtVar.getLineCount()) {
                    z4 = vtVar.isInitLineCount;
                    if (!z4 && vtVar.getMeasuredWidth() > 0) {
                        i12 = vtVar.lineCount;
                        vtVar.onLineCountChanged(i12, vtVar.getLineCount());
                    }
                    vtVar.lineCount = vtVar.getLineCount();
                    break;
                }
                break;
            case 7:
                ((gg.j) this.b).run();
                break;
            case 8:
                wy wyVar = (wy) this.b;
                wyVar.g(false);
                gq gqVar = wyVar.d;
                String obj = gqVar.getText().toString();
                wyVar.c(obj, true);
                vy vyVar = wyVar.r;
                if (vyVar != null) {
                    vyVar.F1(null);
                    vyVar.G1(TextUtils.isEmpty(obj), true);
                }
                wyVar.f(!TextUtils.isEmpty(obj));
                if (gqVar != null) {
                    gqVar.clearAnimation();
                    gqVar.animate().translationX(0.0f).setInterpolator(nr.h).start();
                }
                wyVar.d(false);
                break;
            case 9:
                c20 c20Var = (c20) this.b;
                if (!c20Var.C.isEmpty() && editable.length() > 0 && c20Var.F >= 0) {
                    c20Var.F = -1;
                    c20Var.f();
                }
                c20Var.a.a(c20Var.n || c20Var.r.length() > 0, true);
                break;
            case 10:
                vd0 vd0Var = (vd0) this.b;
                if (vd0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    vd0Var.k(false);
                    break;
                }
                break;
            case 11:
                en0 en0Var = (en0) this.b;
                ImageView imageView = en0Var.c;
                kg.f fVar3 = en0Var.e;
                boolean z10 = fVar3.length() > 0;
                if (z10 != (imageView.getAlpha() != 0.0f)) {
                    imageView.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).scaleX(z10 ? 1.0f : 0.1f).scaleY(z10 ? 1.0f : 0.1f).start();
                }
                en0Var.a(fVar3.getText().toString());
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new cc0(this, 28));
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
                p61 p61Var = (p61) this.b;
                String obj2 = p61Var.G.getText().toString();
                q61 q61Var = p61Var.H;
                int h9 = q61Var.d.getAdapter() == null ? 0 : q61Var.d.getAdapter().h();
                q61Var.F(obj2);
                if (TextUtils.isEmpty(obj2) && (e1Var = q61Var.d) != null) {
                    o0 adapter = e1Var.getAdapter();
                    rl0 rl0Var = q61Var.f;
                    if (adapter != rl0Var) {
                        e1 e1Var2 = q61Var.d;
                        e1Var2.V1 = false;
                        e1Var2.W1 = 0;
                        e1Var2.setAdapter(rl0Var);
                        e1 e1Var3 = q61Var.d;
                        e1Var3.V1 = true;
                        e1Var3.W1 = 0;
                        if (h9 == 0) {
                            q61Var.I(0);
                        }
                    }
                }
                q61Var.v.setVisibility(0);
                break;
            case 15:
                m0 m0Var = (m0) this.b;
                AndroidUtilities.updateViewShow(m0Var.G, editable.length() > 0 && m0Var.Q, true, true);
                String obj3 = editable.toString();
                l4 l4Var = m0Var.y0;
                String lowerCase = obj3.toLowerCase();
                ah.a aVar2 = l4Var.S0;
                if (aVar2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(aVar2);
                    l4Var.S0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i14 = l4Var.T0 + 1;
                    l4Var.T0 = i14;
                    if (!l4Var.r0[0].f()) {
                        ah.a aVar3 = new ah.a(l4Var, lowerCase, i14, 20);
                        l4Var.S0 = aVar3;
                        AndroidUtilities.runOnUIThread(aVar3, 400L);
                        break;
                    } else {
                        l4Var.d0(true);
                        if (l4Var.r0[0].getWebView() != null) {
                            w0 webView = l4Var.r0[0].getWebView();
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
                        l4Var.r0[0].b.f1();
                        l4Var.W(0);
                    } else if (l4Var.r0[0].getWebView() != null) {
                        w0 webView2 = l4Var.r0[0].getWebView();
                        webView2.F = new c0(l4Var, 9);
                        webView2.findAllAsync("");
                        l4Var.h0();
                    }
                    l4Var.T0 = -1;
                    break;
                }
                break;
            case 16:
                s1 s1Var = (s1) this.b;
                ImageView imageView2 = s1Var.n;
                kg.f fVar4 = s1Var.d;
                if (!s1Var.r) {
                    s1Var.d(false);
                    String obj4 = fVar4.getText().toString();
                    String str = TextUtils.isEmpty(obj4) ? null : obj4;
                    Utilities.Callback2 callback2 = s1Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    r1 r1Var = s1Var.f;
                    if (r1Var != null) {
                        r1Var.F1(null);
                        s1Var.f.G1(TextUtils.isEmpty(obj4), true);
                    }
                    if (fVar4 != null) {
                        fVar4.animate().cancel();
                        ViewPropertyAnimator translationX = fVar4.animate().translationX(0.0f);
                        nr nrVar = nr.h;
                        translationX.setInterpolator(nrVar).start();
                        if (imageView2 != null && s1Var.h != (!TextUtils.isEmpty(fVar4.getText()))) {
                            s1Var.h = !s1Var.h;
                            imageView2.animate().cancel();
                            if (s1Var.h) {
                                imageView2.setVisibility(0);
                            }
                            imageView2.animate().scaleX(s1Var.h ? 1.0f : 0.7f).scaleY(s1Var.h ? 1.0f : 0.7f).alpha(s1Var.h ? 1.0f : 0.0f).withEndAction(new org.telegram.ui.web.o0(this, 15)).setInterpolator(nrVar).setDuration(320L).setStartDelay(s1Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 17:
                ((sh.n) this.b).Y();
                break;
            case 18:
                k0 k0Var = (k0) this.b;
                k0Var.x = false;
                g0 g0Var = k0Var.C;
                AndroidUtilities.cancelRunOnUIThread(g0Var);
                if (TextUtils.isEmpty(k0Var.f.getText())) {
                    k0Var.y = null;
                    k0Var.d.b();
                } else {
                    k0Var.x = true;
                    AndroidUtilities.runOnUIThread(g0Var, 800L);
                }
                k0Var.c.V2.N(true);
                k0Var.b0();
                break;
            default:
                u0 u0Var = (u0) this.b;
                if (!u0Var.d) {
                    u0Var.B = false;
                    u0Var.y = editable.toString();
                    u0Var.U(true);
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
                vd0 vd0Var = (vd0) this.b;
                LinkedList linkedList = vd0Var.K;
                LinkedList linkedList2 = vd0Var.J;
                Drawable drawable = vd0Var.a;
                if (drawable instanceof dc0) {
                    dc0 dc0Var = (dc0) drawable;
                    dc0Var.D = null;
                    dc0Var.z();
                    float f10 = dc0Var.h;
                    int i13 = 0;
                    boolean z10 = true;
                    if (i11 == 0 && i12 == 1) {
                        dc0Var.x(true);
                        z4 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        dc0Var.y();
                        z4 = false;
                    } else {
                        z4 = false;
                        z10 = false;
                    }
                    if (z10) {
                        if (f10 >= 1.0f) {
                            vd0Var.b(dc0Var);
                            break;
                        } else {
                            linkedList2.offer(new r5(this, z4, dc0Var, 17));
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
            case 4:
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
