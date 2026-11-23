package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.ao0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j9 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        hi.o7 o7Var;
        long j3;
        int i7;
        int i10;
        int[] iArr;
        int i11;
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((ea) this.b).C0();
                break;
            case 2:
                final oa oaVar = (oa) this.b;
                ArrayList arrayList = oaVar.w;
                arrayList.clear();
                final String trim = editable.toString().trim();
                Runnable runnable = oaVar.L;
                String str = null;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    oaVar.L = null;
                }
                if (oaVar.F != 0) {
                    oaVar.getConnectionsManager().cancelRequest(oaVar.F, true);
                    oaVar.F = 0;
                }
                String str2 = WalletEngine2.isValidRecipientAddress(trim) ? trim : null;
                oaVar.y = str2;
                if (str2 == null && trim != null && trim.length() <= 126) {
                    String lowerCase = trim.toLowerCase(Locale.ROOT);
                    if (lowerCase.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str = lowerCase;
                    }
                }
                oaVar.E = str;
                final int i12 = oaVar.K + 1;
                oaVar.K = i12;
                oaVar.M = !TextUtils.isEmpty(trim) && oaVar.y == null;
                oaVar.x.g(null, true, false, false, false, 0L, false, 0, i12);
                hi.e eVar = oaVar.a0;
                if (eVar != null) {
                    eVar.setEnabled(oaVar.y != null);
                }
                if (!TextUtils.isEmpty(trim) && oaVar.y == null && oaVar.E == null) {
                    oaVar.j0(trim);
                    final int i13 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Wallet.la
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    oa.f0(oaVar, trim, i12);
                                    break;
                                default:
                                    oa oaVar2 = oaVar;
                                    oaVar2.L = null;
                                    jg.z1 z1Var = oaVar2.x;
                                    int i14 = i12;
                                    z1Var.h(trim, true, false, false, false, false, 0L, false, 0, i14, 0L, new ao0(oaVar2, i14, 12));
                                    break;
                            }
                        }
                    };
                    oaVar.L = runnable2;
                    org.telegram.messenger.g0.h3(runnable2, 300L);
                } else {
                    arrayList.clear();
                    oaVar.a.g3.O(true);
                    final String str3 = oaVar.E;
                    if (str3 != null) {
                        final int i14 = 0;
                        Runnable runnable3 = new Runnable() { // from class: org.telegram.ui.Wallet.la
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        oa.f0(oaVar, str3, i12);
                                        break;
                                    default:
                                        oa oaVar2 = oaVar;
                                        oaVar2.L = null;
                                        jg.z1 z1Var = oaVar2.x;
                                        int i142 = i12;
                                        z1Var.h(str3, true, false, false, false, false, 0L, false, 0, i142, 0L, new ao0(oaVar2, i142, 12));
                                        break;
                                }
                            }
                        };
                        oaVar.L = runnable3;
                        org.telegram.messenger.g0.h3(runnable3, 300L);
                    }
                }
                oaVar.p0(true);
                break;
            case 3:
                eb ebVar = (eb) this.b;
                if (ebVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && ebVar.b()) {
                    ebVar.setError(false);
                }
                ebVar.e();
                ebVar.d();
                if (ebVar.a.hasFocus()) {
                    ebVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = ebVar.f;
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
                ai.e1 e1Var = g4Var.X0;
                if (e1Var != null) {
                    org.telegram.messenger.g0.r(e1Var);
                    g4Var.X0 = null;
                }
                if (!TextUtils.isEmpty(lowerCase2)) {
                    int i15 = g4Var.Y0 + 1;
                    g4Var.Y0 = i15;
                    if (!g4Var.v0[0].f()) {
                        ai.e1 e1Var2 = new ai.e1(g4Var, lowerCase2, i15, 29);
                        g4Var.X0 = e1Var2;
                        org.telegram.messenger.g0.h3(e1Var2, 400L);
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
                sh.b bVar = (sh.b) this.b;
                int length = bVar.a.getText().length();
                te.a aVar = bVar.I;
                int i16 = bVar.y;
                aVar.a(length > (i16 * 7) / 10, true);
                bVar.J.a(length > i16, true);
                bVar.f.l(Integer.toString(i16 - length), false);
                break;
            case 6:
                tg.d dVar = (tg.d) this.b;
                if (!dVar.H0 && dVar.G0 && (o7Var = dVar.E0) != null) {
                    o7Var.c = new SpannableStringBuilder(editable);
                    hi.o7 o7Var2 = dVar.E0;
                    ArrayList arrayList2 = new ArrayList();
                    int i17 = 0;
                    int i18 = -1;
                    int i19 = 0;
                    while (true) {
                        int i20 = 1;
                        if (i19 > editable.length()) {
                            int size = arrayList2.size() / 2;
                            int[] iArr2 = o7Var2.d;
                            boolean z10 = iArr2 != null && iArr2.length == size * 4;
                            long j10 = (iArr2 == null || iArr2.length < 4) ? o7Var2.a : iArr2[2];
                            long max = Math.max(j10, (iArr2 == null || iArr2.length < 4) ? o7Var2.b : iArr2[iArr2.length - 1]);
                            int[] iArr3 = new int[size * 4];
                            while (i17 < size) {
                                int i21 = i17 * 4;
                                int i22 = i17 * 2;
                                iArr3[i21] = ((Integer) arrayList2.get(i22)).intValue();
                                iArr3[i21 + 1] = ((Integer) arrayList2.get(i22 + i20)).intValue();
                                int i23 = i21 + 2;
                                if (z10) {
                                    i7 = iArr2[i23];
                                    j3 = j10;
                                } else {
                                    j3 = j10;
                                    i7 = (int) ((((max - j10) * i17) / size) + j3);
                                }
                                iArr3[i23] = i7;
                                int i24 = i21 + 3;
                                if (z10) {
                                    i11 = iArr2[i24];
                                    i10 = i17;
                                    iArr = iArr2;
                                } else {
                                    i10 = i17;
                                    iArr = iArr2;
                                    i11 = (int) ((((max - j3) * (i17 + 1)) / size) + j3);
                                }
                                iArr3[i24] = i11;
                                i17 = i10 + 1;
                                iArr2 = iArr;
                                j10 = j3;
                                i20 = 1;
                            }
                            o7Var2.d = iArr3;
                            dVar.E0.e = true;
                            break;
                        } else {
                            if (i19 != editable.length() && !Character.isWhitespace(editable.charAt(i19))) {
                                i20 = 0;
                            }
                            if (i20 == 0 && i18 < 0) {
                                i18 = i19;
                            } else if (i20 != 0 && i18 >= 0) {
                                arrayList2.add(Integer.valueOf(i18));
                                arrayList2.add(Integer.valueOf(i19));
                                i18 = -1;
                            }
                            i19++;
                        }
                    }
                }
                break;
            case 7:
                vh.g gVar = (vh.g) this.b;
                gVar.Y0();
                gVar.Y1 = editable.toString();
                gVar.Z1.O(true);
                break;
            default:
                yg.k kVar = ((yg.l) this.b).c;
                if (kVar != null) {
                    String trim2 = editable.toString().trim();
                    wg.z zVar = ((wg.t) kVar).a;
                    zVar.r2 = trim2;
                    zVar.l1(false, false);
                    zVar.l1(true, true);
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
                ((w4) this.b).a(charSequence.toString());
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

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final /* synthetic */ void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
