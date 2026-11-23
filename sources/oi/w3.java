package oi;

import android.text.TextUtils;
import android.view.View;
import bi.h6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w3(y3 y3Var, int i7, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m5 U2;
        p5 q10;
        int i7 = this.a;
        int i10 = this.c;
        y3 y3Var = this.b;
        switch (i7) {
            case 0:
                y3Var.a.a.r.b4(i10);
                break;
            default:
                final p pVar = y3Var.a.a;
                i6 i6Var = pVar.a;
                t3 t3Var = pVar.r;
                a T2 = t3Var.T2();
                final int i11 = 0;
                final int i12 = 1;
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i10 == 1) {
                    int i13 = pVar.n;
                    x60 x60Var = pVar.I;
                    if (x60Var != null) {
                        x60Var.v();
                    }
                    x60 H = x60.H(pVar, i6Var, view, true);
                    H.T = true;
                    x60 K = H.K();
                    boolean z10 = (mp.u1(i13).B4() || i10.i(i13).q()) ? false : true;
                    K.c(R.drawable.ic_ab_back, gd.N0(2131753753, null), new h6(H, 7), false);
                    K.k();
                    pVar.U(K, T2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, gd.N0(2131754027, null), bz.W0 + 2, H);
                    pVar.U(K, T2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, gd.N0(2131754026, null), bz.W0 + 1, H);
                    pVar.U(K, T2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, gd.N0(2131754025, null), bz.W0, H);
                    pVar.U(K, T2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, gd.N0(2131754024, null), bz.W0 - 1, H);
                    pVar.U(K, T2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, gd.N0(2131754023, null), bz.W0 - 2, H);
                    pVar.U(K, T2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, gd.N0(2131754022, null), bz.W0 - 3, H);
                    boolean z11 = T2 != null && t3.F3(T2.b);
                    z1 z1Var = new z1(pVar.getContext(), R.drawable.iv_h1);
                    z1Var.a(z10);
                    H.j(z11, 0, z1Var, gd.N0(2131754028, null), new bi.a6(H, K, 2));
                    H.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, gd.N0(2131753985, null), new f(pVar, T2, 5));
                    H.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, gd.N0(2131753993, null), new f(pVar, T2, 6));
                    boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
                    z1 z1Var2 = new z1(pVar.getContext(), R.drawable.iv_pullquote);
                    z1Var2.a(z10);
                    H.j(z12, 0, z1Var2, gd.N0(2131753994, null), new f(pVar, T2, 7));
                    H.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, gd.N0(2131754052, null), new f(pVar, T2, 8));
                    boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
                    z1 z1Var3 = new z1(pVar.getContext(), R.drawable.iv_footer);
                    z1Var3.a(z10);
                    H.j(z13, 0, z1Var3, gd.N0(2131754029, null), new f(pVar, T2, 9));
                    H.a0();
                    pVar.I = H;
                    break;
                } else if (i10 == 2) {
                    x60 x60Var2 = pVar.I;
                    if (x60Var2 != null) {
                        x60Var2.v();
                    }
                    final x60 G = x60.G(pVar, i6Var, view);
                    G.T = true;
                    G.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, gd.N0(2131753996, null), new f(pVar, T2, 1));
                    G.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, gd.N0(2131754003, null), new f(pVar, T2, 2));
                    G.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, gd.N0(2131754000, null), new f(pVar, T2, 3));
                    G.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, gd.N0(2131753998, null), new f(pVar, T2, 4));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, gd.N0(2131753984, null), new b(t3Var, 1));
                    boolean p22 = t3Var.p2();
                    boolean s22 = t3Var.s2();
                    if (p22 || s22) {
                        G.k();
                        if (p22) {
                            G.c(R.drawable.iv_list_tab, gd.N0(2131754010, null), new Runnable() { // from class: oi.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            pVar.r.u3(false);
                                            G.v();
                                            break;
                                        default:
                                            pVar.r.u3(true);
                                            G.v();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            G.c(R.drawable.iv_list_untab, gd.N0(2131753995, null), new Runnable() { // from class: oi.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            pVar.r.u3(false);
                                            G.v();
                                            break;
                                        default:
                                            pVar.r.u3(true);
                                            G.v();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    G.X = true;
                    G.a0();
                    pVar.I = G;
                    break;
                } else if (i10 == 4) {
                    m5 m5Var = t3Var.q4;
                    if (m5Var == null && (U2 = t3Var.U2()) != null && U2.getModel() != null) {
                        View findFocus = t3Var.findFocus();
                        if ((findFocus instanceof f1) && (q10 = U2.q((f1) findFocus)) != null) {
                            pagetablecell = q10.b;
                        }
                        if (pagetablecell != null) {
                            t3Var.j2(U2);
                            if (U2.I.add(pagetablecell)) {
                                U2.w.invalidate();
                                U2.v();
                            }
                            m5Var = U2;
                        }
                    }
                    if (m5Var != null && m5Var.getModel() != null && !m5Var.I.isEmpty()) {
                        t3Var.I4(m5Var);
                        break;
                    } else {
                        t3Var.V1(a6.u(2, 2));
                        break;
                    }
                } else if (i10 == 7) {
                    if (T2 != null) {
                        TL_iv.PageBlock pageBlock = T2.b;
                        if (pageBlock instanceof TL_iv.pageBlockMath) {
                            pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        }
                    }
                    p.Z(pVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ki.n2(4, pVar, pageblockmath), i6Var);
                    break;
                } else if (i10 == 9) {
                    t3Var.w3();
                    break;
                }
                break;
        }
    }
}
