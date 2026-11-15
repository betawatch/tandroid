package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class i9 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                ((p9) this.b).C0();
                break;
            case 1:
                final z9 z9Var = (z9) this.b;
                ArrayList arrayList = z9Var.w;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = z9Var.L;
                String str = null;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    z9Var.L = null;
                }
                if (z9Var.F != 0) {
                    z9Var.getConnectionsManager().cancelRequest(z9Var.F, true);
                    z9Var.F = 0;
                }
                String str2 = WalletEngine2.isValidRecipientAddress(trim) ? trim : null;
                z9Var.y = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str = lowerCase;
                    }
                }
                z9Var.E = str;
                final int i7 = z9Var.K + 1;
                z9Var.K = i7;
                z9Var.M = !TextUtils.isEmpty(trim) && z9Var.y == null;
                z9Var.x.g(null, true, false, false, false, 0L, false, 0, i7);
                hi.d dVar = z9Var.a0;
                if (dVar != null) {
                    dVar.setEnabled(z9Var.y != null);
                }
                if (!TextUtils.isEmpty(trim) && z9Var.y == null && z9Var.E == null) {
                    z9Var.j0(trim);
                    final int i10 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.w9
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    z9.f0(z9Var, trim, i7);
                                    break;
                                default:
                                    z9 z9Var2 = z9Var;
                                    z9Var2.L = null;
                                    jg.z1 z1Var = z9Var2.x;
                                    int i11 = i7;
                                    z1Var.h(trim, true, false, false, false, false, 0L, false, 0, i11, 0L, new nb1(z9Var2, i11, 7));
                                    break;
                            }
                        }
                    };
                    z9Var.L = runnable2;
                    org.telegram.messenger.g0.i3(runnable2, 300L);
                } else {
                    arrayList.clear();
                    z9Var.a.g3.O(true);
                    final String str3 = z9Var.E;
                    if (str3 != null) {
                        final int i11 = 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.w9
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        z9.f0(z9Var, str3, i7);
                                        break;
                                    default:
                                        z9 z9Var2 = z9Var;
                                        z9Var2.L = null;
                                        jg.z1 z1Var = z9Var2.x;
                                        int i112 = i7;
                                        z1Var.h(str3, true, false, false, false, false, 0L, false, 0, i112, 0L, new nb1(z9Var2, i112, 7));
                                        break;
                                }
                            }
                        };
                        z9Var.L = runnable3;
                        org.telegram.messenger.g0.i3(runnable3, 300L);
                    }
                }
                z9Var.p0(true);
                break;
            case 2:
                pa paVar = (pa) this.b;
                if (paVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && paVar.b()) {
                    paVar.setError(false);
                }
                paVar.e();
                paVar.d();
                if (paVar.a.hasFocus()) {
                    paVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = paVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                org.telegram.messenger.g0.U3(l0Var.K, editable.length() > 0 && l0Var.U, true);
                String obj = editable.toString();
                org.telegram.ui.g4 g4Var = l0Var.C0;
                String lowerCase2 = obj.toLowerCase();
                ai.z0 z0Var = g4Var.X0;
                if (z0Var != null) {
                    org.telegram.messenger.g0.r(z0Var);
                    g4Var.X0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i12 = g4Var.Y0 + 1;
                    g4Var.Y0 = i12;
                    if (!g4Var.v0[0].f()) {
                        ai.z0 z0Var2 = new ai.z0(g4Var, lowerCase2, i12, 29);
                        g4Var.X0 = z0Var2;
                        org.telegram.messenger.g0.i3(z0Var2, 400L);
                        break;
                    } else {
                        g4Var.b0(true);
                        if (g4Var.v0[0].getWebView() != null) {
                            org.telegram.ui.web.s0 webView = g4Var.v0[0].getWebView();
                            webView.J = new org.telegram.ui.z(g4Var, 9);
                            webView.findAllAsync(lowerCase2);
                            g4Var.f0();
                            break;
                        }
                    }
                } else {
                    g4Var.F.clear();
                    g4Var.G = lowerCase2;
                    g4Var.v0[0].c.E.clear();
                    g4Var.b0(false);
                    if (!g4Var.v0[0].f()) {
                        g4Var.v0[0].b.g1();
                        g4Var.U(0);
                    } else if (g4Var.v0[0].getWebView() != null) {
                        org.telegram.ui.web.s0 webView2 = g4Var.v0[0].getWebView();
                        webView2.J = new org.telegram.ui.z(g4Var, 9);
                        webView2.findAllAsync("");
                        g4Var.f0();
                    }
                    g4Var.Y0 = -1;
                    break;
                }
                break;
            case 4:
                sh.b bVar = (sh.b) this.b;
                int length = bVar.a.getText().length();
                te.a aVar = bVar.I;
                int i13 = bVar.y;
                aVar.a(length > (i13 * 7) / 10, true);
                bVar.J.a(length > i13, true);
                bVar.f.l(Integer.toString(i13 - length), false);
                break;
            case 5:
                vh.h hVar = (vh.h) this.b;
                hVar.X0();
                hVar.Y1 = editable.toString();
                hVar.Z1.O(true);
                break;
            default:
                yg.k kVar = ((yg.l) this.b).c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    wg.y yVar = ((wg.s) kVar).a;
                    yVar.r2 = trim2;
                    yVar.k1(false, false);
                    yVar.k1(true, true);
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

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
