package oi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ t3(v3 v3Var, int i7, int i10) {
        this.a = i10;
        this.b = v3Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k5 U2;
        n5 q10;
        int i7 = this.a;
        int i10 = this.c;
        v3 v3Var = this.b;
        switch (i7) {
            case 0:
                v3Var.a.a.r.b4(i10);
                break;
            default:
                final o oVar = v3Var.a.a;
                e6 e6Var = oVar.a;
                q3 q3Var = oVar.r;
                a T2 = q3Var.T2();
                final int i11 = 0;
                final int i12 = 1;
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i10 == 1) {
                    int i13 = oVar.n;
                    m60 m60Var = oVar.I;
                    if (m60Var != null) {
                        m60Var.u();
                    }
                    m60 G = m60.G(oVar, e6Var, view, true);
                    G.Q = true;
                    m60 J = G.J();
                    boolean z10 = (np.s1(i13).s4() || m10.i(i13).q()) ? false : true;
                    J.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new bi.u3(G, 7), false);
                    J.k();
                    oVar.U(J, T2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, hd.M0(2131754030, null), gz.W0 + 2, G);
                    oVar.U(J, T2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, hd.M0(2131754029, null), gz.W0 + 1, G);
                    oVar.U(J, T2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, hd.M0(2131754028, null), gz.W0, G);
                    oVar.U(J, T2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, hd.M0(2131754027, null), gz.W0 - 1, G);
                    oVar.U(J, T2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, hd.M0(2131754026, null), gz.W0 - 2, G);
                    oVar.U(J, T2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, hd.M0(2131754025, null), gz.W0 - 3, G);
                    boolean z11 = T2 != null && q3.F3(T2.b);
                    x1 x1Var = new x1(oVar.getContext(), R.drawable.iv_h1);
                    x1Var.a(z10);
                    G.j(z11, 0, x1Var, hd.M0(2131754031, null), new bi.n3(G, J, 2));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, hd.M0(2131753988, null), new f(oVar, T2, 5));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, hd.M0(2131753996, null), new f(oVar, T2, 6));
                    boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
                    x1 x1Var2 = new x1(oVar.getContext(), R.drawable.iv_pullquote);
                    x1Var2.a(z10);
                    G.j(z12, 0, x1Var2, hd.M0(2131753997, null), new f(oVar, T2, 7));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, hd.M0(2131754055, null), new f(oVar, T2, 8));
                    boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
                    x1 x1Var3 = new x1(oVar.getContext(), R.drawable.iv_footer);
                    x1Var3.a(z10);
                    G.j(z13, 0, x1Var3, hd.M0(2131754032, null), new f(oVar, T2, 9));
                    G.Z();
                    oVar.I = G;
                    break;
                } else if (i10 == 2) {
                    m60 m60Var2 = oVar.I;
                    if (m60Var2 != null) {
                        m60Var2.u();
                    }
                    final m60 F = m60.F(oVar, e6Var, view);
                    F.Q = true;
                    F.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, hd.M0(2131753999, null), new f(oVar, T2, 1));
                    F.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, hd.M0(2131754006, null), new f(oVar, T2, 2));
                    F.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, hd.M0(2131754003, null), new f(oVar, T2, 3));
                    F.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, hd.M0(2131754001, null), new f(oVar, T2, 4));
                    F.j(T2 != null && (T2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, hd.M0(2131753987, null), new b(q3Var, 1));
                    boolean p22 = q3Var.p2();
                    boolean s22 = q3Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(R.drawable.iv_list_tab, hd.M0(2131754013, null), new Runnable() { // from class: oi.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            oVar.r.u3(false);
                                            F.u();
                                            break;
                                        default:
                                            oVar.r.u3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            F.c(R.drawable.iv_list_untab, hd.M0(2131753998, null), new Runnable() { // from class: oi.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            oVar.r.u3(false);
                                            F.u();
                                            break;
                                        default:
                                            oVar.r.u3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    oVar.I = F;
                    break;
                } else if (i10 == 4) {
                    k5 k5Var = q3Var.q4;
                    if (k5Var == null && (U2 = q3Var.U2()) != null && U2.getModel() != null) {
                        View findFocus = q3Var.findFocus();
                        if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                            pagetablecell = q10.b;
                        }
                        if (pagetablecell != null) {
                            q3Var.j2(U2);
                            if (U2.I.add(pagetablecell)) {
                                U2.w.invalidate();
                                U2.v();
                            }
                            k5Var = U2;
                        }
                    }
                    if (k5Var != null && k5Var.getModel() != null && !k5Var.I.isEmpty()) {
                        q3Var.I4(k5Var);
                        break;
                    } else {
                        q3Var.V1(y5.u(2, 2));
                        break;
                    }
                } else if (i10 == 7) {
                    if (T2 != null) {
                        TL_iv.PageBlock pageBlock = T2.b;
                        if (pageBlock instanceof TL_iv.pageBlockMath) {
                            pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        }
                    }
                    o.Z(oVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new li.v(i12, oVar, pageblockmath), e6Var);
                    break;
                } else if (i10 == 9) {
                    q3Var.w3();
                    break;
                }
                break;
        }
    }
}
