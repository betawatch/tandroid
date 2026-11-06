package li;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                f6 f6Var = pVar.a;
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
                    k60 k60Var = pVar.H;
                    if (k60Var != null) {
                        k60Var.u();
                    }
                    k60 G = k60.G(pVar, f6Var, view, true);
                    G.Q = true;
                    k60 J = G.J();
                    boolean z9 = (qp.s1(i13).s4() || p10.i(i13).q()) ? false : true;
                    J.c(R.drawable.ic_ab_back, hd.M0(2131753756, null), new h(G, 0), false);
                    J.k();
                    pVar.T(J, T2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, hd.M0(2131754030, null), iz.W0 + 2, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, hd.M0(2131754029, null), iz.W0 + 1, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, hd.M0(2131754028, null), iz.W0, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, hd.M0(2131754027, null), iz.W0 - 1, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, hd.M0(2131754026, null), iz.W0 - 2, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, hd.M0(2131754025, null), iz.W0 - 3, G);
                    boolean z10 = T2 != null && t3.F3(T2.b);
                    z1 z1Var = new z1(pVar.getContext(), R.drawable.iv_h1);
                    z1Var.a(z9);
                    G.j(z10, 0, z1Var, hd.M0(2131754031, null), new hi.h2(G, J, 1));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, hd.M0(2131753988, null), new f(pVar, T2, 5));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, hd.M0(2131753996, null), new f(pVar, T2, 6));
                    boolean z11 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
                    z1 z1Var2 = new z1(pVar.getContext(), R.drawable.iv_pullquote);
                    z1Var2.a(z9);
                    G.j(z11, 0, z1Var2, hd.M0(2131753997, null), new f(pVar, T2, 7));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, hd.M0(2131754055, null), new f(pVar, T2, 8));
                    boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
                    z1 z1Var3 = new z1(pVar.getContext(), R.drawable.iv_footer);
                    z1Var3.a(z9);
                    G.j(z12, 0, z1Var3, hd.M0(2131754032, null), new f(pVar, T2, 9));
                    G.Z();
                    pVar.H = G;
                    break;
                } else if (i10 == 2) {
                    k60 k60Var2 = pVar.H;
                    if (k60Var2 != null) {
                        k60Var2.u();
                    }
                    final k60 F = k60.F(pVar, f6Var, view);
                    F.Q = true;
                    F.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, hd.M0(2131753999, null), new f(pVar, T2, 1));
                    F.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, hd.M0(2131754006, null), new f(pVar, T2, 2));
                    F.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, hd.M0(2131754003, null), new f(pVar, T2, 3));
                    F.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, hd.M0(2131754001, null), new f(pVar, T2, 4));
                    F.j(T2 != null && (T2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, hd.M0(2131753987, null), new b(t3Var, 1));
                    boolean p22 = t3Var.p2();
                    boolean s22 = t3Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(R.drawable.iv_list_tab, hd.M0(2131754013, null), new Runnable() { // from class: li.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            pVar.r.u3(false);
                                            F.u();
                                            break;
                                        default:
                                            pVar.r.u3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            F.c(R.drawable.iv_list_untab, hd.M0(2131753998, null), new Runnable() { // from class: li.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            pVar.r.u3(false);
                                            F.u();
                                            break;
                                        default:
                                            pVar.r.u3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    pVar.H = F;
                    break;
                } else if (i10 == 4) {
                    m5 m5Var = t3Var.p4;
                    if (m5Var == null && (U2 = t3Var.U2()) != null && U2.getModel() != null) {
                        View findFocus = t3Var.findFocus();
                        if ((findFocus instanceof g1) && (q10 = U2.q((g1) findFocus)) != null) {
                            pagetablecell = q10.b;
                        }
                        if (pagetablecell != null) {
                            t3Var.j2(U2);
                            if (U2.H.add(pagetablecell)) {
                                U2.w.invalidate();
                                U2.v();
                            }
                            m5Var = U2;
                        }
                    }
                    if (m5Var != null && m5Var.getModel() != null && !m5Var.H.isEmpty()) {
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
                    p.Z(pVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.f1(26, pVar, pageblockmath), f6Var);
                    break;
                } else if (i10 == 9) {
                    t3Var.w3();
                    break;
                }
                break;
        }
    }
}
