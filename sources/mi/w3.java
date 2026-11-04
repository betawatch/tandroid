package mi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w3(y3 y3Var, int i3, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n5 U2;
        q5 q10;
        int i3 = this.a;
        int i10 = this.c;
        y3 y3Var = this.b;
        switch (i3) {
            case 0:
                y3Var.a.a.r.b4(i10);
                break;
            default:
                final p pVar = y3Var.a.a;
                org.telegram.ui.ActionBar.e6 e6Var = pVar.a;
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
                    f60 f60Var = pVar.I;
                    if (f60Var != null) {
                        f60Var.u();
                    }
                    f60 G = f60.G(pVar, e6Var, view, true);
                    G.Q = true;
                    f60 J = G.J();
                    boolean z10 = (hp.s1(i13).s4() || h10.i(i13).q()) ? false : true;
                    J.c(R.drawable.ic_ab_back, bd.M0(2131753756, null), new ai.g4(G, 7), false);
                    J.k();
                    pVar.T(J, T2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, bd.M0(2131754030, null), az.W0 + 2, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, bd.M0(2131754029, null), az.W0 + 1, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, bd.M0(2131754028, null), az.W0, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, bd.M0(2131754027, null), az.W0 - 1, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, bd.M0(2131754026, null), az.W0 - 2, G);
                    pVar.T(J, T2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, bd.M0(2131754025, null), az.W0 - 3, G);
                    boolean z11 = T2 != null && t3.F3(T2.b);
                    a2 a2Var = new a2(pVar.getContext(), R.drawable.iv_h1);
                    a2Var.a(z10);
                    G.j(z11, 0, a2Var, bd.M0(2131754031, null), new ai.y3(G, J, 2));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, bd.M0(2131753988, null), new g(pVar, T2, 5));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, bd.M0(2131753996, null), new g(pVar, T2, 6));
                    boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
                    a2 a2Var2 = new a2(pVar.getContext(), R.drawable.iv_pullquote);
                    a2Var2.a(z10);
                    G.j(z12, 0, a2Var2, bd.M0(2131753997, null), new g(pVar, T2, 7));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, bd.M0(2131754055, null), new g(pVar, T2, 8));
                    boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
                    a2 a2Var3 = new a2(pVar.getContext(), R.drawable.iv_footer);
                    a2Var3.a(z10);
                    G.j(z13, 0, a2Var3, bd.M0(2131754032, null), new g(pVar, T2, 9));
                    G.Z();
                    pVar.I = G;
                    break;
                } else if (i10 == 2) {
                    f60 f60Var2 = pVar.I;
                    if (f60Var2 != null) {
                        f60Var2.u();
                    }
                    final f60 F = f60.F(pVar, e6Var, view);
                    F.Q = true;
                    F.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, bd.M0(2131753999, null), new g(pVar, T2, 1));
                    F.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, bd.M0(2131754006, null), new g(pVar, T2, 2));
                    F.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, bd.M0(2131754003, null), new g(pVar, T2, 3));
                    F.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, bd.M0(2131754001, null), new g(pVar, T2, 4));
                    F.j(T2 != null && (T2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, bd.M0(2131753987, null), new b(t3Var, 1));
                    boolean p22 = t3Var.p2();
                    boolean s22 = t3Var.s2();
                    if (p22 || s22) {
                        F.k();
                        if (p22) {
                            F.c(R.drawable.iv_list_tab, bd.M0(2131754013, null), new Runnable() { // from class: mi.h
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
                            F.c(R.drawable.iv_list_untab, bd.M0(2131753998, null), new Runnable() { // from class: mi.h
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
                    pVar.I = F;
                    break;
                } else if (i10 == 4) {
                    n5 n5Var = t3Var.q4;
                    if (n5Var == null && (U2 = t3Var.U2()) != null && U2.getModel() != null) {
                        View findFocus = t3Var.findFocus();
                        if ((findFocus instanceof h1) && (q10 = U2.q((h1) findFocus)) != null) {
                            pagetablecell = q10.b;
                        }
                        if (pagetablecell != null) {
                            t3Var.j2(U2);
                            if (U2.I.add(pagetablecell)) {
                                U2.w.invalidate();
                                U2.v();
                            }
                            n5Var = U2;
                        }
                    }
                    if (n5Var != null && n5Var.getModel() != null && !n5Var.I.isEmpty()) {
                        t3Var.I4(n5Var);
                        break;
                    } else {
                        t3Var.V1(b6.u(2, 2));
                        break;
                    }
                } else if (i10 == 7) {
                    if (T2 != null) {
                        TL_iv.PageBlock pageBlock = T2.b;
                        if (pageBlock instanceof TL_iv.pageBlockMath) {
                            pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        }
                    }
                    p.Z(pVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new f(i11, pVar, pageblockmath), e6Var);
                    break;
                } else if (i10 == 9) {
                    t3Var.w3();
                    break;
                }
                break;
        }
    }
}
