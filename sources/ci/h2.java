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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.od;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h2 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h2(Object obj, int i10) {
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
                k2 k2Var = (k2) this.b;
                ImageView imageView = k2Var.n;
                g2 g2Var = k2Var.d;
                if (!k2Var.r) {
                    k2Var.d(false);
                    String obj = g2Var.getText().toString();
                    String str = TextUtils.isEmpty(obj) ? null : obj;
                    Utilities.Callback2 callback2 = k2Var.v;
                    if (callback2 != null) {
                        callback2.run(str, -1);
                    }
                    j2 j2Var = k2Var.f;
                    if (j2Var != null) {
                        j2Var.G1(null);
                        k2Var.f.H1(TextUtils.isEmpty(obj), true);
                    }
                    if (g2Var != null) {
                        g2Var.animate().cancel();
                        ViewPropertyAnimator translationX = g2Var.animate().translationX(0.0f);
                        hs hsVar = hs.h;
                        translationX.setInterpolator(hsVar).start();
                        if (imageView != null && k2Var.h != (!TextUtils.isEmpty(g2Var.getText()))) {
                            k2Var.h = !k2Var.h;
                            imageView.animate().cancel();
                            if (k2Var.h) {
                                imageView.setVisibility(0);
                            }
                            imageView.animate().scaleX(k2Var.h ? 1.0f : 0.7f).scaleY(k2Var.h ? 1.0f : 0.7f).alpha(k2Var.h ? 1.0f : 0.0f).withEndAction(new androidx.fragment.app.a0(this, 13)).setInterpolator(hsVar).setDuration(320L).setStartDelay(k2Var.h ? 240L : 0L).start();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((fi.p) this.b).Y();
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
                u0Var.c.W2.N(true);
                u0Var.b0();
                break;
            case 3:
                hg.e1 e1Var = (hg.e1) this.b;
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
                od odVar = (od) this.b;
                odVar.F((odVar.f.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
                break;
            case 6:
                ru ruVar = (ru) this.b;
                i10 = ruVar.lineCount;
                if (i10 != ruVar.getLineCount()) {
                    z10 = ruVar.isInitLineCount;
                    if (!z10 && ruVar.getMeasuredWidth() > 0) {
                        i11 = ruVar.lineCount;
                        ruVar.onLineCountChanged(i11, ruVar.getLineCount());
                    }
                    ruVar.lineCount = ruVar.getLineCount();
                    break;
                }
                break;
            case 7:
                ((t1) this.b).run();
                break;
            case 8:
                mz mzVar = (mz) this.b;
                mzVar.g(false);
                yq yqVar = mzVar.d;
                String obj2 = yqVar.getText().toString();
                mzVar.c(obj2, true);
                lz lzVar = mzVar.r;
                if (lzVar != null) {
                    lzVar.G1(null);
                    lzVar.H1(TextUtils.isEmpty(obj2), true);
                }
                mzVar.f(!TextUtils.isEmpty(obj2));
                if (yqVar != null) {
                    yqVar.clearAnimation();
                    yqVar.animate().translationX(0.0f).setInterpolator(hs.h).start();
                }
                mzVar.d(false);
                break;
            case 9:
                s20 s20Var = (s20) this.b;
                if (!s20Var.F.isEmpty() && editable.length() > 0 && s20Var.I >= 0) {
                    s20Var.I = -1;
                    s20Var.f();
                }
                s20Var.a.a(s20Var.n || s20Var.r.length() > 0, true);
                break;
            case 10:
                te0 te0Var = (te0) this.b;
                if (te0Var.r.length() == 4 && SharedConfig.passcodeType == 0) {
                    te0Var.m(false);
                    break;
                }
                break;
            case 11:
                co0 co0Var = (co0) this.b;
                ImageView imageView2 = co0Var.c;
                g2 g2Var2 = co0Var.e;
                boolean z11 = g2Var2.length() > 0;
                if (z11 != (imageView2.getAlpha() != 0.0f)) {
                    imageView2.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).scaleX(z11 ? 1.0f : 0.1f).scaleY(z11 ? 1.0f : 0.1f).start();
                }
                co0Var.a(g2Var2.getText().toString());
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bd0(this, 28));
                break;
            case 13:
                oz0 oz0Var = (oz0) this.b;
                mz0 mz0Var = oz0Var.c;
                if (mz0Var != null && mz0Var.getVisibility() == 0) {
                    oz0Var.e();
                    break;
                }
                break;
            case 14:
                s71 s71Var = (s71) this.b;
                String obj3 = s71Var.J.getText().toString();
                t71 t71Var = s71Var.K;
                int h = t71Var.d.getAdapter() == null ? 0 : t71Var.d.getAdapter().h();
                t71Var.H(obj3);
                if (TextUtils.isEmpty(obj3) && (w0Var = t71Var.d) != null) {
                    s4.i0 adapter = w0Var.getAdapter();
                    pm0 pm0Var = t71Var.f;
                    if (adapter != pm0Var) {
                        ai.w0 w0Var2 = t71Var.d;
                        w0Var2.W1 = false;
                        w0Var2.X1 = 0;
                        w0Var2.setAdapter(pm0Var);
                        ai.w0 w0Var3 = t71Var.d;
                        w0Var3.W1 = true;
                        w0Var3.X1 = 0;
                        if (h == 0) {
                            t71Var.K(0);
                        }
                    }
                }
                t71Var.v.setVisibility(0);
                break;
            case 15:
                ((org.telegram.ui.Wallet.j8) this.b).w0();
                break;
            case 16:
                final org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) this.b;
                ArrayList arrayList = s8Var.s;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = s8Var.J;
                String str2 = null;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    s8Var.J = null;
                }
                if (s8Var.y != 0) {
                    s8Var.getConnectionsManager().cancelRequest(s8Var.y, true);
                    s8Var.y = 0;
                }
                String str3 = WalletEngine2.isValidRecipientAddress(trim) ? trim : null;
                s8Var.w = str3;
                if (str3 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str2 = lowerCase;
                    }
                }
                s8Var.x = str2;
                final int i13 = s8Var.I + 1;
                s8Var.I = i13;
                s8Var.K = !TextUtils.isEmpty(trim) && s8Var.w == null;
                s8Var.v.g(null, true, false, false, false, 0L, false, 0, i13);
                d dVar = s8Var.V;
                if (dVar != null) {
                    dVar.setEnabled(s8Var.w != null);
                }
                if (!TextUtils.isEmpty(trim) && s8Var.w == null && s8Var.x == null) {
                    s8Var.d0(trim);
                    final int i14 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.o8
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    s8.Y(s8Var, trim, i13);
                                    break;
                                default:
                                    s8 s8Var2 = s8Var;
                                    s8Var2.J = null;
                                    gg.b2 b2Var = s8Var2.v;
                                    int i15 = i13;
                                    b2Var.h(trim, true, false, false, false, false, 0L, false, 0, i15, 0L, new r(s8Var2, i15, 3));
                                    break;
                            }
                        }
                    };
                    s8Var.J = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, 300L);
                } else {
                    arrayList.clear();
                    s8Var.a.W2.N(true);
                    final String str4 = s8Var.x;
                    if (str4 != null) {
                        final int i15 = 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.o8
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i15) {
                                    case 0:
                                        s8.Y(s8Var, str4, i13);
                                        break;
                                    default:
                                        s8 s8Var2 = s8Var;
                                        s8Var2.J = null;
                                        gg.b2 b2Var = s8Var2.v;
                                        int i152 = i13;
                                        b2Var.h(str4, true, false, false, false, false, 0L, false, 0, i152, 0L, new r(s8Var2, i152, 3));
                                        break;
                                }
                            }
                        };
                        s8Var.J = runnable3;
                        AndroidUtilities.runOnUIThread(runnable3, 300L);
                    }
                }
                s8Var.i0(true);
                break;
            case 17:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) this.b;
                if (h9Var.v && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && h9Var.b()) {
                    h9Var.setError(false);
                }
                h9Var.e();
                h9Var.d();
                if (h9Var.a.hasFocus()) {
                    h9Var.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = h9Var.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                AndroidUtilities.updateViewShow(l0Var.J, editable.length() > 0 && l0Var.T, true, true);
                String obj4 = editable.toString();
                org.telegram.ui.i4 i4Var = l0Var.B0;
                String lowerCase2 = obj4.toLowerCase();
                ai.s1 s1Var = i4Var.V0;
                if (s1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(s1Var);
                    i4Var.V0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i16 = i4Var.W0 + 1;
                    i4Var.W0 = i16;
                    if (!i4Var.u0[0].f()) {
                        ai.s1 s1Var2 = new ai.s1(i4Var, lowerCase2, i16, 22);
                        i4Var.V0 = s1Var2;
                        AndroidUtilities.runOnUIThread(s1Var2, 400L);
                        break;
                    } else {
                        i4Var.d0(true);
                        if (i4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.y0 webView = i4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.b0(i4Var, 9);
                            webView.findAllAsync(lowerCase2);
                            i4Var.h0();
                            break;
                        }
                    }
                } else {
                    i4Var.E.clear();
                    i4Var.F = lowerCase2;
                    i4Var.u0[0].c.y.clear();
                    i4Var.d0(false);
                    if (!i4Var.u0[0].f()) {
                        i4Var.u0[0].b.f1();
                        i4Var.W(0);
                    } else if (i4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.y0 webView2 = i4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.b0(i4Var, 9);
                        webView2.findAllAsync("");
                        i4Var.h0();
                    }
                    i4Var.W0 = -1;
                    break;
                }
                break;
            case 19:
                qh.c cVar = (qh.c) this.b;
                int length = cVar.a.getText().length();
                me.b bVar = cVar.H;
                int i17 = cVar.x;
                bVar.a(length > (i17 * 7) / 10, true);
                cVar.I.a(length > i17, true);
                cVar.f.l(Integer.toString(i17 - length), false);
                break;
            case 20:
                th.f fVar = (th.f) this.b;
                fVar.K();
                fVar.c0 = editable.toString();
                fVar.d0.N(true);
                break;
            case 21:
                vg.k kVar = ((vg.l) this.b).c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    tg.a0 a0Var = ((tg.u) kVar).a;
                    a0Var.v0 = trim2;
                    a0Var.b0(false, false);
                    a0Var.b0(true, true);
                    break;
                }
                break;
            default:
                yh.g gVar = (yh.g) this.b;
                yh.b bVar2 = gVar.n0;
                i12 = ((org.telegram.ui.ActionBar.n2) gVar).currentAccount;
                TLRPC.TL_payments_starsRevenueStats h10 = yh.o.g(i12).h(gVar.b, false);
                long j3 = h10 == null ? 0L : h10.status.available_balance.amount;
                long parseLong = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                gVar.P = parseLong;
                if (parseLong > j3) {
                    gVar.P = j3;
                    gVar.N = true;
                    gVar.Q.setText(Long.toString(j3));
                    fi.o oVar = gVar.Q;
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
                te0 te0Var = (te0) this.b;
                LinkedList linkedList = te0Var.R;
                LinkedList linkedList2 = te0Var.Q;
                Drawable drawable = te0Var.a;
                if (drawable instanceof cd0) {
                    cd0 cd0Var = (cd0) drawable;
                    cd0Var.D = null;
                    cd0Var.z();
                    float f7 = cd0Var.h;
                    int i13 = 0;
                    boolean z11 = true;
                    if (i11 == 0 && i12 == 1) {
                        cd0Var.x(true);
                        z10 = true;
                    } else if (i11 == 1 && i12 == 0) {
                        cd0Var.y();
                        z10 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    if (z11) {
                        if (f7 >= 1.0f) {
                            te0Var.b(cd0Var);
                            break;
                        } else {
                            linkedList2.offer(new x0(this, z10, cd0Var, 22));
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

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
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

    private final void N(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void O(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void P(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void Q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void R(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void S(int i10, int i11, int i12, CharSequence charSequence) {
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
