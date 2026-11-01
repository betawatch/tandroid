package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g4(i4 i4Var, int i10, int i11) {
        this.a = i11;
        this.b = i4Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z5 U2;
        c6 q6;
        int i10 = this.a;
        int i11 = this.c;
        i4 i4Var = this.b;
        switch (i10) {
            case 0:
                i4Var.a.a.r.b4(i11);
                break;
            default:
                final t tVar = i4Var.a.a;
                org.telegram.ui.ActionBar.p6 p6Var = tVar.a;
                d4 d4Var = tVar.r;
                a T2 = d4Var.T2();
                int i12 = 3;
                final int i13 = 1;
                final int i14 = 0;
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i11 == 1) {
                    int i15 = tVar.n;
                    z60 z60Var = tVar.H;
                    if (z60Var != null) {
                        z60Var.u();
                    }
                    z60 G = z60.G(tVar, p6Var, view, true);
                    G.Q = true;
                    z60 J = G.J();
                    boolean z10 = (wp.r1(i15).p4() || e20.i(i15).q()) ? false : true;
                    J.c(R.drawable.ic_ab_back, dd.L0(2131753756, null), new j(G, 0), false);
                    J.k();
                    tVar.S(J, T2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, dd.L0(2131754030, null), uz.W0 + 2, G);
                    tVar.S(J, T2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, dd.L0(2131754029, null), uz.W0 + 1, G);
                    tVar.S(J, T2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, dd.L0(2131754028, null), uz.W0, G);
                    tVar.S(J, T2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, dd.L0(2131754027, null), uz.W0 - 1, G);
                    tVar.S(J, T2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, dd.L0(2131754026, null), uz.W0 - 2, G);
                    tVar.S(J, T2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, dd.L0(2131754025, null), uz.W0 - 3, G);
                    boolean z11 = T2 != null && d4.F3(T2.b);
                    i2 i2Var = new i2(tVar.getContext(), R.drawable.iv_h1);
                    i2Var.a(z10);
                    G.j(z11, 0, i2Var, dd.L0(2131754031, null), new k(G, J, 0));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, dd.L0(2131753988, null), new h(tVar, T2, 5));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, dd.L0(2131753996, null), new h(tVar, T2, 6));
                    boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
                    i2 i2Var2 = new i2(tVar.getContext(), R.drawable.iv_pullquote);
                    i2Var2.a(z10);
                    G.j(z12, 0, i2Var2, dd.L0(2131753997, null), new h(tVar, T2, 7));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, dd.L0(2131754055, null), new h(tVar, T2, 8));
                    boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
                    i2 i2Var3 = new i2(tVar.getContext(), R.drawable.iv_footer);
                    i2Var3.a(z10);
                    G.j(z13, 0, i2Var3, dd.L0(2131754032, null), new h(tVar, T2, 9));
                    G.Z();
                    tVar.H = G;
                    break;
                } else if (i11 == 2) {
                    z60 z60Var2 = tVar.H;
                    if (z60Var2 != null) {
                        z60Var2.u();
                    }
                    final z60 F = z60.F(tVar, p6Var, view);
                    F.Q = true;
                    F.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, dd.L0(2131753999, null), new h(tVar, T2, 1));
                    F.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, dd.L0(2131754006, null), new h(tVar, T2, 2));
                    F.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, dd.L0(2131754003, null), new h(tVar, T2, 3));
                    F.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, dd.L0(2131754001, null), new h(tVar, T2, 4));
                    F.j(T2 != null && (T2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, dd.L0(2131753987, null), new b(d4Var, 1));
                    boolean p22 = d4Var.p2();
                    boolean s22 = d4Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(R.drawable.iv_list_tab, dd.L0(2131754013, null), new Runnable() { // from class: bi.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            tVar.r.u3(false);
                                            F.u();
                                            break;
                                        default:
                                            tVar.r.u3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            F.c(R.drawable.iv_list_untab, dd.L0(2131753998, null), new Runnable() { // from class: bi.i
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            tVar.r.u3(false);
                                            F.u();
                                            break;
                                        default:
                                            tVar.r.u3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    tVar.H = F;
                    break;
                } else if (i11 == 4) {
                    z5 z5Var = d4Var.p4;
                    if (z5Var == null && (U2 = d4Var.U2()) != null && U2.getModel() != null) {
                        View findFocus = d4Var.findFocus();
                        if ((findFocus instanceof n1) && (q6 = U2.q((n1) findFocus)) != null) {
                            pagetablecell = q6.b;
                        }
                        if (pagetablecell != null) {
                            d4Var.j2(U2);
                            if (U2.H.add(pagetablecell)) {
                                U2.w.invalidate();
                                U2.v();
                            }
                            z5Var = U2;
                        }
                    }
                    if (z5Var != null && z5Var.getModel() != null && !z5Var.H.isEmpty()) {
                        d4Var.I4(z5Var);
                        break;
                    } else {
                        d4Var.U1(q6.u(2, 2));
                        break;
                    }
                } else if (i11 == 7) {
                    if (T2 != null) {
                        TL_iv.PageBlock pageBlock = T2.b;
                        if (pageBlock instanceof TL_iv.pageBlockMath) {
                            pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        }
                    }
                    t.X(tVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ag.e0(i12, tVar, pageblockmath), p6Var);
                    break;
                } else if (i11 == 9) {
                    d4Var.w3();
                    break;
                }
                break;
        }
    }
}
