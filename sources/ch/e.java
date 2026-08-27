package ch;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import cg.d1;
import cg.j;
import cg.s0;
import eg.l;
import eg.m;
import f2.q0;
import hh.c0;
import hh.f1;
import hh.o;
import hh.r;
import hh.t5;
import java.util.ArrayList;
import java.util.LinkedList;
import lh.d2;
import lh.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.d0;
import org.telegram.ui.m4;
import org.telegram.ui.o0;
import org.telegram.ui.web.w0;
import qf.i0;
import qf.m0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        f1 f1Var;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                hVar.J();
                hVar.Y = editable.toString();
                hVar.Z.N(true);
                break;
            case 1:
                l lVar = ((m) this.b).c;
                if (lVar != null) {
                    String trim = editable.toString().trim();
                    d1 d1Var = ((s0) lVar).a;
                    d1Var.r0 = trim;
                    d1Var.a0(false, false);
                    d1Var.a0(true, true);
                    break;
                }
                break;
            case 2:
                r rVar = (r) this.b;
                hh.c cVar = rVar.j0;
                i10 = ((n2) rVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = c0.g(i10).h(rVar.b, false);
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
                e2 e2Var = (e2) this.b;
                ImageView imageView = e2Var.n;
                gg.g gVar = e2Var.d;
                if (!e2Var.r) {
                    e2Var.d(false);
                    String obj = gVar.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = e2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    d2 d2Var = e2Var.f;
                    if (d2Var != null) {
                        d2Var.F1(null);
                        e2Var.f.G1(TextUtils.isEmpty(obj), true);
                    }
                    if (gVar != null) {
                        gVar.animate().cancel();
                        ViewPropertyAnimator translationX = gVar.animate().translationX(0.0f);
                        er erVar = er.h;
                        translationX.setInterpolator(erVar).start();
                        if (imageView != null && e2Var.h != (!TextUtils.isEmpty(gVar.getText()))) {
                            e2Var.h = !e2Var.h;
                            imageView.animate().cancel();
                            if (e2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(e2Var.h ? 1.0f : 0.7f).scaleY(e2Var.h ? 1.0f : 0.7f).alpha(e2Var.h ? 1.0f : 0.0f).withEndAction(new kh.c(this, 10)).setInterpolator(erVar).setDuration(320L).setStartDelay(e2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 4:
                break;
            case 5:
                ((oh.o) this.b).Y();
                break;
            case 6:
                xc xcVar = (xc) this.b;
                xcVar.F((xcVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 7:
                lt ltVar = (lt) this.b;
                i11 = ltVar.lineCount;
                if (i11 != ltVar.getLineCount()) {
                    z10 = ltVar.isInitLineCount;
                    if (!z10 && ltVar.getMeasuredWidth() > 0) {
                        i12 = ltVar.lineCount;
                        ltVar.onLineCountChanged(i12, ltVar.getLineCount());
                    }
                    ltVar.lineCount = ltVar.getLineCount();
                    break;
                }
                break;
            case 8:
                ((j) this.b).run();
                break;
            case 9:
                ky kyVar = (ky) this.b;
                kyVar.g(false);
                wp wpVar = kyVar.d;
                String obj2 = wpVar.getText().toString();
                kyVar.c(obj2, true);
                jy jyVar = kyVar.r;
                if (jyVar != null) {
                    jyVar.F1(null);
                    jyVar.G1(TextUtils.isEmpty(obj2), true);
                }
                kyVar.f(!TextUtils.isEmpty(obj2));
                if (wpVar != null) {
                    wpVar.clearAnimation();
                    wpVar.animate().translationX(0.0f).setInterpolator(er.h).start();
                }
                kyVar.d(false);
                break;
            case 10:
                p10 p10Var = (p10) this.b;
                if (!p10Var.B.isEmpty() && editable.length() > 0 && p10Var.E >= 0) {
                    p10Var.E = -1;
                    p10Var.f();
                }
                p10Var.a.a(p10Var.n || p10Var.r.length() > 0, true);
                break;
            case 11:
                dd0 dd0Var = (dd0) this.b;
                if (dd0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    dd0Var.k(false);
                    break;
                }
                break;
            case 12:
                km0 km0Var = (km0) this.b;
                ImageView imageView2 = km0Var.c;
                gg.g gVar2 = km0Var.e;
                boolean z11 = gVar2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                km0Var.a(gVar2.getText().toString());
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new mb0(this, 28));
                break;
            case 14:
                wx0 wx0Var = (wx0) this.b;
                ux0 ux0Var = wx0Var.c;
                if (ux0Var != null && ux0Var.getVisibility() == 0) {
                    wx0Var.e();
                    break;
                }
                break;
            case 15:
                t51 t51Var = (t51) this.b;
                String obj3 = t51Var.F.getText().toString();
                u51 u51Var = t51Var.G;
                int h10 = u51Var.d.getAdapter() == null ? 0 : u51Var.d.getAdapter().h();
                u51Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (f1Var = u51Var.d) != null) {
                    q0 adapter = f1Var.getAdapter();
                    yk0 yk0Var = u51Var.f;
                    if (adapter != yk0Var) {
                        f1 f1Var2 = u51Var.d;
                        f1Var2.U1 = false;
                        f1Var2.V1 = 0;
                        f1Var2.setAdapter(yk0Var);
                        f1 f1Var3 = u51Var.d;
                        f1Var3.U1 = true;
                        f1Var3.V1 = 0;
                        if (h10 == 0) {
                            u51Var.J(0);
                        }
                    }
                }
                u51Var.v.setVisibility(0);
                break;
            case 16:
                o0 o0Var = (o0) this.b;
                AndroidUtilities.updateViewShow(o0Var.F, editable.length() > 0 && o0Var.P, true, true);
                String obj4 = editable.toString();
                m4 m4Var = o0Var.x0;
                String lowerCase = obj4.toLowerCase();
                d5.i iVar = m4Var.R0;
                if (iVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    m4Var.R0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i13 = m4Var.S0 + 1;
                    m4Var.S0 = i13;
                    if (!m4Var.q0[0].f()) {
                        d5.i iVar2 = new d5.i(m4Var, lowerCase, i13, 22);
                        m4Var.R0 = iVar2;
                        AndroidUtilities.runOnUIThread(iVar2, 400L);
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
                m0Var.b0();
                break;
            case 18:
                qf.w0 w0Var = (qf.w0) this.b;
                if (!w0Var.d) {
                    w0Var.A = false;
                    w0Var.y = editable.toString();
                    w0Var.U(true);
                    break;
                }
                break;
            default:
                zg.c cVar2 = (zg.c) this.b;
                int length = cVar2.a.getText().length();
                ud.a aVar = cVar2.D;
                int i14 = cVar2.x;
                aVar.a(length > (i14 * 7) / 10, true);
                cVar2.E.a(length > i14, true);
                cVar2.f.l(Integer.toString(i14 - length), false);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        switch (this.a) {
            case 11:
                dd0 dd0Var = (dd0) this.b;
                LinkedList linkedList = dd0Var.J;
                LinkedList linkedList2 = dd0Var.I;
                Drawable drawable = dd0Var.a;
                if (drawable instanceof nb0) {
                    nb0 nb0Var = (nb0) drawable;
                    nb0Var.D = null;
                    nb0Var.z();
                    float f10 = nb0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        nb0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        nb0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f10 >= 1.0f) {
                            dd0Var.b(nb0Var);
                            break;
                        } else {
                            linkedList2.offer(new t5(this, z10, nb0Var, 19));
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

    private final void K(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void L(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void M(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void g(int i10, int i11, int i12, CharSequence charSequence) {
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

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void u(int i10, int i11, int i12, CharSequence charSequence) {
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
