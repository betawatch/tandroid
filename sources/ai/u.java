package ai;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        u1 u1Var;
        switch (this.a) {
            case 0:
                x xVar = (x) this.b;
                d dVar = xVar.n0;
                i10 = ((org.telegram.ui.ActionBar.o2) xVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = k0.g(i10).h(xVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                xVar.P = parseLong;
                if (parseLong > j10) {
                    xVar.P = j10;
                    xVar.N = true;
                    xVar.Q.setText(Long.toString(j10));
                    t tVar = xVar.Q;
                    tVar.setSelection(tVar.getText().length());
                    xVar.N = false;
                }
                xVar.O = xVar.P == j10;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                dVar.run();
                if (!xVar.N) {
                    xVar.O = false;
                    break;
                }
                break;
            case 1:
                ei.h2 h2Var = (ei.h2) this.b;
                ImageView imageView = h2Var.r;
                ei.e2 e2Var = h2Var.e;
                if (!h2Var.s) {
                    h2Var.d(false);
                    String obj = e2Var.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = h2Var.w;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    ei.g2 g2Var = h2Var.h;
                    if (g2Var != null) {
                        g2Var.L1(null);
                        h2Var.h.M1(TextUtils.isEmpty(obj), true);
                    }
                    if (e2Var != null) {
                        e2Var.animate().cancel();
                        ViewPropertyAnimator translationX = e2Var.animate().translationX(0.0f);
                        bs bsVar = bs.h;
                        translationX.setInterpolator(bsVar).start();
                        if (imageView != null && h2Var.n != (!TextUtils.isEmpty(e2Var.getText()))) {
                            h2Var.n = !h2Var.n;
                            imageView.animate().cancel();
                            if (h2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(h2Var.n ? 1.0f : 0.7f).scaleY(h2Var.n ? 1.0f : 0.7f).alpha(h2Var.n ? 1.0f : 0.0f).withEndAction(new com.google.firebase.messaging.s(this, 13)).setInterpolator(bsVar).setDuration(320L).setStartDelay(h2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((hi.o) this.b).Y();
                break;
            case 3:
                ig.s0 s0Var = (ig.s0) this.b;
                s0Var.E = false;
                ig.m0 m0Var = s0Var.H;
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                if (TextUtils.isEmpty(s0Var.n.getText())) {
                    s0Var.F = null;
                    s0Var.f.b();
                } else {
                    s0Var.E = true;
                    AndroidUtilities.runOnUIThread(m0Var, 800L);
                }
                s0Var.e.Z2.N(true);
                s0Var.b0();
                break;
            case 4:
                ig.c1 c1Var = (ig.c1) this.b;
                if (!c1Var.e) {
                    c1Var.F = false;
                    c1Var.E = editable.toString();
                    c1Var.U(true);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                org.telegram.ui.Components.kd kdVar = (org.telegram.ui.Components.kd) this.b;
                kdVar.F((kdVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 7:
                iu iuVar = (iu) this.b;
                i11 = iuVar.lineCount;
                if (i11 != iuVar.getLineCount()) {
                    z10 = iuVar.isInitLineCount;
                    if (!z10 && iuVar.getMeasuredWidth() > 0) {
                        i12 = iuVar.lineCount;
                        iuVar.onLineCountChanged(i12, iuVar.getLineCount());
                    }
                    iuVar.lineCount = iuVar.getLineCount();
                    break;
                }
                break;
            case 8:
                ((ei.s1) this.b).run();
                break;
            case 9:
                gz gzVar = (gz) this.b;
                gzVar.g(false);
                sq sqVar = gzVar.d;
                String obj2 = sqVar.getText().toString();
                gzVar.c(obj2, true);
                fz fzVar = gzVar.r;
                if (fzVar != null) {
                    fzVar.L1(null);
                    fzVar.M1(TextUtils.isEmpty(obj2), true);
                }
                gzVar.f(!TextUtils.isEmpty(obj2));
                if (sqVar != null) {
                    sqVar.clearAnimation();
                    sqVar.animate().translationX(0.0f).setInterpolator(bs.h).start();
                }
                gzVar.d(false);
                break;
            case 10:
                k20 k20Var = (k20) this.b;
                if (!k20Var.F.isEmpty() && editable.length() > 0 && k20Var.I >= 0) {
                    k20Var.I = -1;
                    k20Var.e();
                }
                k20Var.a.a(k20Var.n || k20Var.r.length() > 0, true);
                break;
            case 11:
                pe0 pe0Var = (pe0) this.b;
                if (pe0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    pe0Var.n(false);
                    break;
                }
                break;
            case 12:
                yn0 yn0Var = (yn0) this.b;
                ImageView imageView2 = yn0Var.b;
                ei.e2 e2Var2 = yn0Var.d;
                boolean z11 = e2Var2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                yn0Var.a(e2Var2.getText().toString());
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new yb0(this, 29));
                break;
            case 14:
                lz0 lz0Var = (lz0) this.b;
                jz0 jz0Var = lz0Var.c;
                if (jz0Var != null && jz0Var.getVisibility() == 0) {
                    lz0Var.e();
                    break;
                }
                break;
            case 15:
                r71 r71Var = (r71) this.b;
                String obj3 = r71Var.J.getText().toString();
                s71 s71Var = r71Var.K;
                int h10 = s71Var.d.getAdapter() == null ? 0 : s71Var.d.getAdapter().h();
                s71Var.F(obj3);
                if (TextUtils.isEmpty(obj3) && (u1Var = s71Var.d) != null) {
                    s4.g0 adapter = u1Var.getAdapter();
                    lm0 lm0Var = s71Var.f;
                    if (adapter != lm0Var) {
                        u1 u1Var2 = s71Var.d;
                        u1Var2.W1 = false;
                        u1Var2.X1 = 0;
                        u1Var2.setAdapter(lm0Var);
                        u1 u1Var3 = s71Var.d;
                        u1Var3.W1 = true;
                        u1Var3.X1 = 0;
                        if (h10 == 0) {
                            s71Var.J(0);
                        }
                    }
                }
                s71Var.v.setVisibility(0);
                break;
            case 16:
                ((org.telegram.ui.Wallet.j9) this.b).x0();
                break;
            case 17:
                final org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) this.b;
                ArrayList arrayList = s9Var.s;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = s9Var.J;
                String str2 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    s9Var.J = null;
                }
                if (s9Var.y != 0) {
                    s9Var.getConnectionsManager().cancelRequest(s9Var.y, true);
                    s9Var.y = 0;
                }
                String str3 = WalletEngine2.isValidRecipientAddress(trim) ? trim : null;
                s9Var.w = str3;
                if (str3 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                s9Var.x = str2;
                final int i13 = s9Var.I + 1;
                s9Var.I = i13;
                s9Var.K = !TextUtils.isEmpty(trim) && s9Var.w == null;
                s9Var.v.g(null, true, false, false, false, 0L, false, 0, i13);
                ei.d dVar2 = s9Var.Y;
                if (dVar2 != null) {
                    dVar2.setEnabled(s9Var.w != null);
                }
                if (!TextUtils.isEmpty(trim) && s9Var.w == null && s9Var.x == null) {
                    s9Var.e0(trim);
                    final int i14 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.q9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    s9.a0(s9Var, trim, i13);
                                    break;
                                default:
                                    s9 s9Var2 = s9Var;
                                    s9Var2.J = null;
                                    hg.a2 a2Var = s9Var2.v;
                                    int i15 = i13;
                                    a2Var.h(trim, true, false, false, false, false, 0L, false, 0, i15, 0L, new wg1(s9Var2, i15, 6));
                                    break;
                            }
                        }
                    };
                    s9Var.J = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    s9Var.a.Z2.N(true);
                    final String str4 = s9Var.x;
                    if (str4 != null) {
                        final int i15 = 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.q9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        s9.a0(s9Var, str4, i13);
                                        break;
                                    default:
                                        s9 s9Var2 = s9Var;
                                        s9Var2.J = null;
                                        hg.a2 a2Var = s9Var2.v;
                                        int i152 = i13;
                                        a2Var.h(str4, true, false, false, false, false, 0L, false, 0, i152, 0L, new wg1(s9Var2, i152, 6));
                                        break;
                                }
                            }
                        };
                        s9Var.J = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                s9Var.k0(true);
                break;
            case 18:
                org.telegram.ui.Wallet.ia iaVar = (org.telegram.ui.Wallet.ia) this.b;
                if (iaVar.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && iaVar.b()) {
                    iaVar.setError(false);
                }
                iaVar.e();
                iaVar.d();
                if (iaVar.a.hasFocus()) {
                    iaVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = iaVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.m0 m0Var2 = (org.telegram.ui.m0) this.b;
                AndroidUtilities.updateViewShow(m0Var2.J, editable.length() > 0 && m0Var2.T, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.k4 k4Var = m0Var2.B0;
                String lowerCase2 = obj4.toLowerCase();
                ah.o oVar = k4Var.W0;
                if (oVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(oVar);
                    k4Var.W0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i16 = k4Var.X0 + 1;
                    k4Var.X0 = i16;
                    if (!k4Var.u0[0].f()) {
                        ah.o oVar2 = new ah.o(k4Var, lowerCase2, i16, 27);
                        k4Var.W0 = oVar2;
                        AndroidUtilities.runOnUIThread(oVar2, 400L);
                        break;
                    } else {
                        k4Var.d0(true);
                        if (k4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.y0 webView = k4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(k4Var, 9);
                            webView.findAllAsync(lowerCase2);
                            k4Var.h0();
                            break;
                        }
                    }
                } else {
                    k4Var.E.clear();
                    k4Var.F = lowerCase2;
                    k4Var.u0[0].c.y.clear();
                    k4Var.d0(false);
                    if (!k4Var.u0[0].f()) {
                        k4Var.u0[0].b.g1();
                        k4Var.W(0);
                    } else if (k4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.y0 webView2 = k4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(k4Var, 9);
                        webView2.findAllAsync("");
                        k4Var.h0();
                    }
                    k4Var.X0 = -1;
                    break;
                }
                break;
            case 20:
                rh.c cVar = (rh.c) this.b;
                int length = cVar.a.getText().length();
                ne.b bVar = cVar.H;
                int i17 = cVar.x;
                bVar.a(length > (i17 * 7) / 10, true);
                cVar.I.a(length > i17, true);
                cVar.f.l(Integer.toString(i17 - length), false);
                break;
            case 21:
                uh.f fVar = (uh.f) this.b;
                fVar.J();
                fVar.c0 = editable.toString();
                fVar.d0.N(true);
                break;
            default:
                wg.k kVar = ((wg.l) this.b).c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    ug.y yVar = ((ug.s) kVar).a;
                    yVar.v0 = trim2;
                    yVar.a0(false, false);
                    yVar.a0(true, true);
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
                pe0 pe0Var = (pe0) this.b;
                LinkedList linkedList = pe0Var.V;
                LinkedList linkedList2 = pe0Var.U;
                Drawable drawable = pe0Var.a;
                if (drawable instanceof yc0) {
                    yc0 yc0Var = (yc0) drawable;
                    yc0Var.D = null;
                    yc0Var.y();
                    float f7 = yc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        yc0Var.w(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        yc0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            pe0Var.b(yc0Var);
                            break;
                        } else {
                            linkedList2.offer(new y7(this, z10, yc0Var, 23));
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

    private final void I(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void J(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void K(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void L(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void M(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void N(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void O(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void P(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void Q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void R(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void S(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void d(int i10, int i11, int i12, CharSequence charSequence) {
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

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
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

    private final /* synthetic */ void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
