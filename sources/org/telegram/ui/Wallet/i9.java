package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                break;
            case 1:
                ((da) this.b).C0();
                break;
            case 2:
                final na naVar = (na) this.b;
                ArrayList arrayList = naVar.w;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = naVar.L;
                String str = null;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    naVar.L = null;
                }
                if (naVar.F != 0) {
                    naVar.getConnectionsManager().cancelRequest(naVar.F, true);
                    naVar.F = 0;
                }
                String str2 = WalletEngine2.isValidRecipientAddress(trim) ? trim : null;
                naVar.y = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str = lowerCase;
                    }
                }
                naVar.E = str;
                final int i7 = naVar.K + 1;
                naVar.K = i7;
                naVar.M = !TextUtils.isEmpty(trim) && naVar.y == null;
                naVar.x.g(null, true, false, false, false, 0L, false, 0, i7);
                hi.d dVar = naVar.a0;
                if (dVar != null) {
                    dVar.setEnabled(naVar.y != null);
                }
                if (!TextUtils.isEmpty(trim) && naVar.y == null && naVar.E == null) {
                    naVar.j0(trim);
                    final int i10 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.ka
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    na.f0(naVar, trim, i7);
                                    break;
                                default:
                                    na naVar2 = naVar;
                                    naVar2.L = null;
                                    jg.z1 z1Var = naVar2.x;
                                    int i11 = i7;
                                    z1Var.h(trim, true, false, false, false, false, 0L, false, 0, i11, 0L, new jw0(naVar2, i11, 10));
                                    break;
                            }
                        }
                    };
                    naVar.L = runnable2;
                    org.telegram.messenger.g0.h3(runnable2, 300L);
                } else {
                    arrayList.clear();
                    naVar.a.g3.O(true);
                    final String str3 = naVar.E;
                    if (str3 != null) {
                        final int i11 = 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.ka
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        na.f0(naVar, str3, i7);
                                        break;
                                    default:
                                        na naVar2 = naVar;
                                        naVar2.L = null;
                                        jg.z1 z1Var = naVar2.x;
                                        int i112 = i7;
                                        z1Var.h(str3, true, false, false, false, false, 0L, false, 0, i112, 0L, new jw0(naVar2, i112, 10));
                                        break;
                                }
                            }
                        };
                        naVar.L = runnable3;
                        org.telegram.messenger.g0.h3(runnable3, 300L);
                    }
                }
                naVar.p0(true);
                break;
            case 3:
                db dbVar = (db) this.b;
                if (dbVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && dbVar.b()) {
                    dbVar.setError(false);
                }
                dbVar.e();
                dbVar.d();
                if (dbVar.a.hasFocus()) {
                    dbVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = dbVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.b;
                org.telegram.messenger.g0.T3(l0Var.K, editable.length() > 0 && l0Var.U, true);
                String obj = editable.toString();
                org.telegram.ui.g4 g4Var = l0Var.C0;
                String lowerCase2 = obj.toLowerCase();
                org.telegram.ui.b0 b0Var = g4Var.X0;
                if (b0Var != null) {
                    org.telegram.messenger.g0.r(b0Var);
                    g4Var.X0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i12 = g4Var.Y0 + 1;
                    g4Var.Y0 = i12;
                    if (!g4Var.v0[0].f()) {
                        org.telegram.ui.b0 b0Var2 = new org.telegram.ui.b0(g4Var, lowerCase2, i12, 0);
                        g4Var.X0 = b0Var2;
                        org.telegram.messenger.g0.h3(b0Var2, 400L);
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
            case 5:
                sh.c cVar = (sh.c) this.b;
                int length = cVar.a.getText().length();
                te.a aVar = cVar.I;
                int i13 = cVar.y;
                aVar.a(length > (i13 * 7) / 10, true);
                cVar.J.a(length > i13, true);
                cVar.f.l(Integer.toString(i13 - length), false);
                break;
            case 6:
                vh.g gVar = (vh.g) this.b;
                gVar.Y0();
                gVar.Y1 = editable.toString();
                gVar.Z1.O(true);
                break;
            default:
                yg.k kVar = ((yg.l) this.b).c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    wg.a0 a0Var = ((wg.u) kVar).a;
                    a0Var.r2 = trim2;
                    a0Var.l1(false, false);
                    a0Var.l1(true, true);
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
        switch (this.a) {
            case 0:
                ((v4) this.b).a(charSequence.toString());
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
