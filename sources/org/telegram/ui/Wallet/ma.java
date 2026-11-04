package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ma implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ma(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.b = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                na naVar = (na) this.b;
                if (naVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && naVar.b()) {
                    naVar.setError(false);
                }
                naVar.e();
                naVar.d();
                if (naVar.a.hasFocus()) {
                    naVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable = naVar.f;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.b;
                org.telegram.messenger.g0.V3(m0Var.K, editable.length() > 0 && m0Var.U, true);
                String obj = editable.toString();
                org.telegram.ui.i4 i4Var = m0Var.C0;
                String lowerCase = obj.toLowerCase();
                ai.e3 e3Var = i4Var.X0;
                if (e3Var != null) {
                    org.telegram.messenger.g0.r(e3Var);
                    i4Var.X0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase)) {
                    int i3 = i4Var.Y0 + 1;
                    i4Var.Y0 = i3;
                    if (!i4Var.v0[0].f()) {
                        ai.e3 e3Var2 = new ai.e3(i4Var, lowerCase, i3, 27);
                        i4Var.X0 = e3Var2;
                        org.telegram.messenger.g0.i3(e3Var2, 400L);
                        break;
                    } else {
                        i4Var.b0(true);
                        if (i4Var.v0[0].getWebView() != null) {
                            org.telegram.ui.web.t0 webView = i4Var.v0[0].getWebView();
                            webView.J = new org.telegram.ui.b0(i4Var, 9);
                            webView.findAllAsync(lowerCase);
                            i4Var.f0();
                            break;
                        }
                    }
                } else {
                    i4Var.F.clear();
                    i4Var.G = lowerCase;
                    i4Var.v0[0].c.E.clear();
                    i4Var.b0(false);
                    if (!i4Var.v0[0].f()) {
                        i4Var.v0[0].b.g1();
                        i4Var.U(0);
                    } else if (i4Var.v0[0].getWebView() != null) {
                        org.telegram.ui.web.t0 webView2 = i4Var.v0[0].getWebView();
                        webView2.J = new org.telegram.ui.b0(i4Var, 9);
                        webView2.findAllAsync("");
                        i4Var.f0();
                    }
                    i4Var.Y0 = -1;
                    break;
                }
                break;
            case 2:
                th.b bVar = (th.b) this.b;
                int length = bVar.a.getText().length();
                qe.a aVar = bVar.I;
                int i10 = bVar.y;
                aVar.a(length > (i10 * 7) / 10, true);
                bVar.J.a(length > i10, true);
                bVar.f.l(Integer.toString(i10 - length), false);
                break;
            case 3:
                wh.h hVar = (wh.h) this.b;
                hVar.X0();
                hVar.V1 = editable.toString();
                hVar.W1.O(true);
                break;
            default:
                zg.k kVar = ((zg.l) this.b).c;
                if (kVar != null) {
                    String trim = editable.toString().trim();
                    xg.a0 a0Var = ((xg.u) kVar).a;
                    a0Var.o2 = trim;
                    a0Var.k1(false, false);
                    a0Var.k1(true, true);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void i(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
