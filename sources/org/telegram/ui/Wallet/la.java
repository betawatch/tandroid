package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class la implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ la(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                ma maVar = (ma) this.b;
                if (maVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && maVar.b()) {
                    maVar.setError(false);
                }
                maVar.e();
                maVar.d();
                if (maVar.a.hasFocus()) {
                    maVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable = maVar.f;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                org.telegram.messenger.g0.V3(l0Var.J, editable.length() > 0 && l0Var.T, true);
                String obj = editable.toString();
                org.telegram.ui.g4 g4Var = l0Var.B0;
                String lowerCase = obj.toLowerCase();
                ai.e0 e0Var = g4Var.W0;
                if (e0Var != null) {
                    org.telegram.messenger.g0.r(e0Var);
                    g4Var.W0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i7 = g4Var.X0 + 1;
                    g4Var.X0 = i7;
                    if (!g4Var.u0[0].f()) {
                        ai.e0 e0Var2 = new ai.e0(g4Var, lowerCase, i7, 26);
                        g4Var.W0 = e0Var2;
                        org.telegram.messenger.g0.i3(e0Var2, 400L);
                        break;
                    } else {
                        g4Var.b0(true);
                        if (g4Var.u0[0].getWebView() != null) {
                            org.telegram.ui.web.u0 webView = g4Var.u0[0].getWebView();
                            webView.I = new org.telegram.ui.a0(g4Var, 9);
                            webView.findAllAsync(lowerCase);
                            g4Var.f0();
                            break;
                        }
                    }
                } else {
                    g4Var.E.clear();
                    g4Var.F = lowerCase;
                    g4Var.u0[0].c.D.clear();
                    g4Var.b0(false);
                    if (!g4Var.u0[0].f()) {
                        g4Var.u0[0].b.g1();
                        g4Var.U(0);
                    } else if (g4Var.u0[0].getWebView() != null) {
                        org.telegram.ui.web.u0 webView2 = g4Var.u0[0].getWebView();
                        webView2.I = new org.telegram.ui.a0(g4Var, 9);
                        webView2.findAllAsync("");
                        g4Var.f0();
                    }
                    g4Var.X0 = -1;
                    break;
                }
                break;
            case 2:
                sh.c cVar = (sh.c) this.b;
                int length = cVar.a.getText().length();
                te.a aVar = cVar.H;
                int i10 = cVar.y;
                aVar.a(length > (i10 * 7) / 10, true);
                cVar.I.a(length > i10, true);
                cVar.f.l(Integer.toString(i10 - length), false);
                break;
            case 3:
                vh.g gVar = (vh.g) this.b;
                gVar.X0();
                gVar.U1 = editable.toString();
                gVar.V1.O(true);
                break;
            default:
                yg.k kVar = ((yg.l) this.b).c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    wg.z zVar = ((wg.t) kVar).a;
                    zVar.n2 = trim;
                    zVar.k1(false, false);
                    zVar.k1(true, true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
