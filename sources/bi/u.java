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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.yg1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        r1 r1Var;
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                d dVar = yVar.s0;
                i10 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h = m0.g(i10).h(yVar.b, false);
                long j10 = h == null ? 0L : h.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                yVar.Y = parseLong;
                if (parseLong > j10) {
                    yVar.Y = j10;
                    yVar.W = true;
                    yVar.Z.setText(Long.toString(j10));
                    t tVar = yVar.Z;
                    tVar.setSelection(tVar.getText().length());
                    yVar.W = false;
                }
                yVar.X = yVar.Y == j10;
                AndroidUtilities.cancelRunOnUIThread(dVar);
                dVar.run();
                if (!yVar.W) {
                    yVar.X = false;
                    break;
                }
                break;
            case 1:
                fi.f2 f2Var = (fi.f2) this.b;
                ImageView imageView = f2Var.r;
                fi.c2 c2Var = f2Var.e;
                if (!f2Var.s) {
                    f2Var.d(false);
                    String obj = c2Var.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = f2Var.w;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    fi.e2 e2Var = f2Var.h;
                    if (e2Var != null) {
                        e2Var.L1(null);
                        f2Var.h.M1(TextUtils.isEmpty(obj), true);
                    }
                    if (c2Var != null) {
                        c2Var.animate().cancel();
                        ViewPropertyAnimator translationX = c2Var.animate().translationX(0.0f);
                        ds dsVar = ds.h;
                        translationX.setInterpolator(dsVar).start();
                        if (imageView != null && f2Var.n != (!TextUtils.isEmpty(c2Var.getText()))) {
                            f2Var.n = !f2Var.n;
                            imageView.animate().cancel();
                            if (f2Var.n) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(f2Var.n ? 1.0f : 0.7f).scaleY(f2Var.n ? 1.0f : 0.7f).alpha(f2Var.n ? 1.0f : 0.0f).withEndAction(new di.s8(this, 17)).setInterpolator(dsVar).setDuration(320L).setStartDelay(f2Var.n ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((ii.o) this.b).Z();
                break;
            case 3:
                jg.t0 t0Var = (jg.t0) this.b;
                t0Var.x = false;
                jg.m0 m0Var = t0Var.F;
                AndroidUtilities.cancelRunOnUIThread(m0Var);
                if (TextUtils.isEmpty(t0Var.f.getText())) {
                    t0Var.y = null;
                    t0Var.d.b();
                } else {
                    t0Var.x = true;
                    AndroidUtilities.runOnUIThread(m0Var, 800L);
                }
                t0Var.c.g3.O(true);
                t0Var.c0();
                break;
            case 4:
                jg.d1 d1Var = (jg.d1) this.b;
                if (!d1Var.c) {
                    d1Var.y = false;
                    d1Var.x = editable.toString();
                    d1Var.V(true);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                org.telegram.ui.Components.jd jdVar = (org.telegram.ui.Components.jd) this.b;
                jdVar.F((jdVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 7:
                ju juVar = (ju) this.b;
                i11 = juVar.lineCount;
                if (i11 != juVar.getLineCount()) {
                    z10 = juVar.isInitLineCount;
                    if (!z10 && juVar.getMeasuredWidth() > 0) {
                        i12 = juVar.lineCount;
                        juVar.onLineCountChanged(i12, juVar.getLineCount());
                    }
                    juVar.lineCount = juVar.getLineCount();
                    break;
                }
                break;
            case 8:
                ((fi.r1) this.b).run();
                break;
            case 9:
                fz fzVar = (fz) this.b;
                fzVar.g(false);
                uq uqVar = fzVar.d;
                String obj2 = uqVar.getText().toString();
                fzVar.c(obj2, true);
                ez ezVar = fzVar.r;
                if (ezVar != null) {
                    ezVar.L1(null);
                    ezVar.M1(TextUtils.isEmpty(obj2), true);
                }
                fzVar.f(!TextUtils.isEmpty(obj2));
                if (uqVar != null) {
                    uqVar.clearAnimation();
                    uqVar.animate().translationX(0.0f).setInterpolator(ds.h).start();
                }
                fzVar.d(false);
                break;
            case 10:
                m20 m20Var = (m20) this.b;
                if (!m20Var.F.isEmpty() && editable.length() > 0 && m20Var.I >= 0) {
                    m20Var.I = -1;
                    m20Var.e();
                }
                m20Var.a.a(m20Var.n || m20Var.r.length() > 0, true);
                break;
            case 11:
                me0 me0Var = (me0) this.b;
                if (me0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    me0Var.n(false);
                    break;
                }
                break;
            case 12:
                eo0 eo0Var = (eo0) this.b;
                ImageView imageView2 = eo0Var.b;
                fi.c2 c2Var2 = eo0Var.d;
                boolean z11 = c2Var2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                eo0Var.a(c2Var2.getText().toString());
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new np0(this, 2));
                break;
            case 14:
                uz0 uz0Var = (uz0) this.b;
                sz0 sz0Var = uz0Var.c;
                if (sz0Var != null && sz0Var.getVisibility() == 0) {
                    uz0Var.e();
                    break;
                }
                break;
            case 15:
                b81 b81Var = (b81) this.b;
                String obj3 = b81Var.J.getText().toString();
                c81 c81Var = b81Var.K;
                int h10 = c81Var.d.getAdapter() == null ? 0 : c81Var.d.getAdapter().h();
                c81Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (r1Var = c81Var.d) != null) {
                    s4.h0 adapter = r1Var.getAdapter();
                    mm0 mm0Var = c81Var.f;
                    if (adapter != mm0Var) {
                        r1 r1Var2 = c81Var.d;
                        r1Var2.W1 = false;
                        r1Var2.X1 = 0;
                        r1Var2.setAdapter(mm0Var);
                        r1 r1Var3 = c81Var.d;
                        r1Var3.W1 = true;
                        r1Var3.X1 = 0;
                        if (h10 == 0) {
                            c81Var.J(0);
                        }
                    }
                }
                c81Var.v.setVisibility(0);
                break;
            case 16:
                ((org.telegram.ui.Wallet.i9) this.b).y0();
                break;
            case 17:
                final org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.b;
                ArrayList arrayList = r9Var.v;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = r9Var.K;
                String str2 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    r9Var.K = null;
                }
                if (r9Var.E != 0) {
                    r9Var.getConnectionsManager().cancelRequest(r9Var.E, true);
                    r9Var.E = 0;
                }
                String str3 = WalletEngine2.isValidRecipientAddress(trim) ? trim : null;
                r9Var.x = str3;
                if (str3 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                r9Var.y = str2;
                final int i13 = r9Var.J + 1;
                r9Var.J = i13;
                r9Var.L = !TextUtils.isEmpty(trim) && r9Var.x == null;
                r9Var.w.g(null, true, false, false, false, 0L, false, 0, i13);
                fi.d dVar2 = r9Var.Z;
                if (dVar2 != null) {
                    dVar2.setEnabled(r9Var.x != null);
                }
                if (!TextUtils.isEmpty(trim) && r9Var.x == null && r9Var.y == null) {
                    r9Var.f0(trim);
                    final int i14 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.p9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    r9.b0(r9Var, trim, i13);
                                    break;
                                default:
                                    r9 r9Var2 = r9Var;
                                    r9Var2.K = null;
                                    ig.a2 a2Var = r9Var2.w;
                                    int i15 = i13;
                                    a2Var.h(trim, true, false, false, false, false, 0L, false, 0, i15, 0L, new yg1(r9Var2, i15, 6));
                                    break;
                            }
                        }
                    };
                    r9Var.K = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    r9Var.a.g3.O(true);
                    final String str4 = r9Var.y;
                    if (str4 != null) {
                        final int i15 = 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.p9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        r9.b0(r9Var, str4, i13);
                                        break;
                                    default:
                                        r9 r9Var2 = r9Var;
                                        r9Var2.K = null;
                                        ig.a2 a2Var = r9Var2.w;
                                        int i152 = i13;
                                        a2Var.h(str4, true, false, false, false, false, 0L, false, 0, i152, 0L, new yg1(r9Var2, i152, 6));
                                        break;
                                }
                            }
                        };
                        r9Var.K = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                r9Var.l0(true);
                break;
            case 18:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) this.b;
                if (haVar.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && haVar.b()) {
                    haVar.setError(false);
                }
                haVar.e();
                haVar.d();
                if (haVar.a.hasFocus()) {
                    haVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = haVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                AndroidUtilities.updateViewShow(l0Var.J, editable.length() > 0 && l0Var.T, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.j4 j4Var = l0Var.B0;
                String lowerCase2 = obj4.toLowerCase();
                ai.h0 h0Var = j4Var.W0;
                if (h0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    j4Var.W0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i16 = j4Var.X0 + 1;
                    j4Var.X0 = i16;
                    if (!j4Var.u0[0].f()) {
                        ai.h0 h0Var2 = new ai.h0(j4Var, lowerCase2, i16, 27);
                        j4Var.W0 = h0Var2;
                        AndroidUtilities.runOnUIThread(h0Var2, 400L);
                        break;
                    } else {
                        j4Var.d0(true);
                        if (j4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.x0 webView = j4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(j4Var, 9);
                            webView.findAllAsync(lowerCase2);
                            j4Var.h0();
                            break;
                        }
                    }
                } else {
                    j4Var.E.clear();
                    j4Var.F = lowerCase2;
                    j4Var.u0[0].c.y.clear();
                    j4Var.d0(false);
                    if (!j4Var.u0[0].f()) {
                        j4Var.u0[0].b.g1();
                        j4Var.W(0);
                    } else if (j4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.x0 webView2 = j4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(j4Var, 9);
                        webView2.findAllAsync("");
                        j4Var.h0();
                    }
                    j4Var.X0 = -1;
                    break;
                }
                break;
            case 20:
                sh.c cVar = (sh.c) this.b;
                int length = cVar.a.getText().length();
                oe.b bVar = cVar.H;
                int i17 = cVar.x;
                bVar.a(length > (i17 * 7) / 10, true);
                cVar.I.a(length > i17, true);
                cVar.f.l(Integer.toString(i17 - length), false);
                break;
            case 21:
                vh.f fVar = (vh.f) this.b;
                fVar.J();
                fVar.c0 = editable.toString();
                fVar.d0.O(true);
                break;
            default:
                xg.k kVar = ((xg.l) this.b).c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    vg.a0 a0Var = ((vg.u) kVar).a;
                    a0Var.v0 = trim2;
                    a0Var.a0(false, false);
                    a0Var.a0(true, true);
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
                me0 me0Var = (me0) this.b;
                LinkedList linkedList = me0Var.V;
                LinkedList linkedList2 = me0Var.U;
                Drawable drawable = me0Var.a;
                if (drawable instanceof vc0) {
                    vc0 vc0Var = (vc0) drawable;
                    vc0Var.D = null;
                    vc0Var.y();
                    float f7 = vc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        vc0Var.w(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        vc0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            me0Var.b(vc0Var);
                            break;
                        } else {
                            linkedList2.offer(new u7(this, z10, vc0Var, 23));
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
