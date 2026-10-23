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
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                i10 = ((org.telegram.ui.ActionBar.n2) xVar).currentAccount;
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
                ImageView imageView = h2Var.n;
                ei.e2 e2Var = h2Var.d;
                if (!h2Var.r) {
                    h2Var.d(false);
                    String obj = e2Var.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = h2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    ei.g2 g2Var = h2Var.f;
                    if (g2Var != null) {
                        g2Var.G1(null);
                        h2Var.f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (e2Var != null) {
                        e2Var.animate().cancel();
                        ViewPropertyAnimator translationX = e2Var.animate().translationX(0.0f);
                        bs bsVar = bs.h;
                        translationX.setInterpolator(bsVar).start();
                        if (imageView != null && h2Var.h != (!TextUtils.isEmpty(e2Var.getText()))) {
                            h2Var.h = !h2Var.h;
                            imageView.animate().cancel();
                            if (h2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(h2Var.h ? 1.0f : 0.7f).scaleY(h2Var.h ? 1.0f : 0.7f).alpha(h2Var.h ? 1.0f : 0.0f).withEndAction(new com.google.firebase.messaging.s(this, 13)).setInterpolator(bsVar).setDuration(320L).setStartDelay(h2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((hi.o) this.b).Y();
                break;
            case 3:
                ig.t0 t0Var = (ig.t0) this.b;
                t0Var.x = false;
                ig.n0 n0Var = t0Var.F;
                AndroidUtilities.cancelRunOnUIThread(n0Var);
                if (TextUtils.isEmpty(t0Var.f.getText())) {
                    t0Var.y = null;
                    t0Var.d.b();
                } else {
                    t0Var.x = true;
                    AndroidUtilities.runOnUIThread(n0Var, 800L);
                }
                t0Var.c.W2.N(true);
                t0Var.b0();
                break;
            case 4:
                ig.d1 d1Var = (ig.d1) this.b;
                if (!d1Var.d) {
                    d1Var.E = false;
                    d1Var.y = editable.toString();
                    d1Var.U(true);
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
                    fzVar.G1(null);
                    fzVar.H1(TextUtils.isEmpty(obj2), true);
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
                    k20Var.f();
                }
                k20Var.a.a(k20Var.n || k20Var.r.length() > 0, true);
                break;
            case 11:
                me0 me0Var = (me0) this.b;
                if (me0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    me0Var.n(false);
                    break;
                }
                break;
            case 12:
                vn0 vn0Var = (vn0) this.b;
                ImageView imageView2 = vn0Var.c;
                ei.e2 e2Var2 = vn0Var.e;
                boolean z11 = e2Var2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                vn0Var.a(e2Var2.getText().toString());
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new rc0(this, 28));
                break;
            case 14:
                iz0 iz0Var = (iz0) this.b;
                gz0 gz0Var = iz0Var.c;
                if (gz0Var != null && gz0Var.getVisibility() == 0) {
                    iz0Var.e();
                    break;
                }
                break;
            case 15:
                k71 k71Var = (k71) this.b;
                String obj3 = k71Var.J.getText().toString();
                l71 l71Var = k71Var.K;
                int h10 = l71Var.d.getAdapter() == null ? 0 : l71Var.d.getAdapter().h();
                l71Var.G(obj3);
                if (TextUtils.isEmpty(obj3) && (u1Var = l71Var.d) != null) {
                    s4.g0 adapter = u1Var.getAdapter();
                    im0 im0Var = l71Var.f;
                    if (adapter != im0Var) {
                        u1 u1Var2 = l71Var.d;
                        u1Var2.W1 = false;
                        u1Var2.X1 = 0;
                        u1Var2.setAdapter(im0Var);
                        u1 u1Var3 = l71Var.d;
                        u1Var3.W1 = true;
                        u1Var3.X1 = 0;
                        if (h10 == 0) {
                            l71Var.K(0);
                        }
                    }
                }
                l71Var.v.setVisibility(0);
                break;
            case 16:
                ((org.telegram.ui.Wallet.i9) this.b).w0();
                break;
            case 17:
                final org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) this.b;
                ArrayList arrayList = r9Var.s;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = r9Var.J;
                String str2 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    r9Var.J = null;
                }
                if (r9Var.y != 0) {
                    r9Var.getConnectionsManager().cancelRequest(r9Var.y, true);
                    r9Var.y = 0;
                }
                String str3 = WalletEngine2.isValidRecipientAddress(trim) ? trim : null;
                r9Var.w = str3;
                if (str3 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                r9Var.x = str2;
                final int i13 = r9Var.I + 1;
                r9Var.I = i13;
                r9Var.K = !TextUtils.isEmpty(trim) && r9Var.w == null;
                r9Var.v.g(null, true, false, false, false, 0L, false, 0, i13);
                ei.d dVar2 = r9Var.V;
                if (dVar2 != null) {
                    dVar2.setEnabled(r9Var.w != null);
                }
                if (!TextUtils.isEmpty(trim) && r9Var.w == null && r9Var.x == null) {
                    r9Var.e0(trim);
                    final int i14 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.p9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    r9.a0(r9Var, trim, i13);
                                    break;
                                default:
                                    r9 r9Var2 = r9Var;
                                    r9Var2.J = null;
                                    hg.a2 a2Var = r9Var2.v;
                                    int i15 = i13;
                                    a2Var.h(trim, true, false, false, false, false, 0L, false, 0, i15, 0L, new j(r9Var2, i15, 5));
                                    break;
                            }
                        }
                    };
                    r9Var.J = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    r9Var.a.W2.N(true);
                    final String str4 = r9Var.x;
                    if (str4 != null) {
                        final int i15 = 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.p9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        r9.a0(r9Var, str4, i13);
                                        break;
                                    default:
                                        r9 r9Var2 = r9Var;
                                        r9Var2.J = null;
                                        hg.a2 a2Var = r9Var2.v;
                                        int i152 = i13;
                                        a2Var.h(str4, true, false, false, false, false, 0L, false, 0, i152, 0L, new j(r9Var2, i152, 5));
                                        break;
                                }
                            }
                        };
                        r9Var.J = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                r9Var.k0(true);
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
                org.telegram.ui.n0 n0Var2 = (org.telegram.ui.n0) this.b;
                AndroidUtilities.updateViewShow(n0Var2.J, editable.length() > 0 && n0Var2.T, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.l4 l4Var = n0Var2.B0;
                String lowerCase2 = obj4.toLowerCase();
                ah.o oVar = l4Var.V0;
                if (oVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(oVar);
                    l4Var.V0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i16 = l4Var.W0 + 1;
                    l4Var.W0 = i16;
                    if (!l4Var.u0[0].f()) {
                        ah.o oVar2 = new ah.o(l4Var, lowerCase2, i16, 27);
                        l4Var.V0 = oVar2;
                        AndroidUtilities.runOnUIThread(oVar2, 400L);
                        break;
                    } else {
                        l4Var.d0(true);
                        if (l4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.x0 webView = l4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(l4Var, 9);
                            webView.findAllAsync(lowerCase2);
                            l4Var.h0();
                            break;
                        }
                    }
                } else {
                    l4Var.E.clear();
                    l4Var.F = lowerCase2;
                    l4Var.u0[0].c.y.clear();
                    l4Var.d0(false);
                    if (!l4Var.u0[0].f()) {
                        l4Var.u0[0].b.f1();
                        l4Var.W(0);
                    } else if (l4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.x0 webView2 = l4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(l4Var, 9);
                        webView2.findAllAsync("");
                        l4Var.h0();
                    }
                    l4Var.W0 = -1;
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
                fVar.K();
                fVar.c0 = editable.toString();
                fVar.d0.N(true);
                break;
            default:
                wg.k kVar = ((wg.l) this.b).c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    ug.z zVar = ((ug.t) kVar).a;
                    zVar.v0 = trim2;
                    zVar.b0(false, false);
                    zVar.b0(true, true);
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
                if (drawable instanceof wc0) {
                    wc0 wc0Var = (wc0) drawable;
                    wc0Var.D = null;
                    wc0Var.y();
                    float f7 = wc0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        wc0Var.w(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        wc0Var.x();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            me0Var.b(wc0Var);
                            break;
                        } else {
                            linkedList2.offer(new y7(this, z10, wc0Var, 24));
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
