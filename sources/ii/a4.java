package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ a4(c4 c4Var, int i10, int i11) {
        this.a = i11;
        this.b = c4Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p5 R2;
        s5 o9;
        switch (this.a) {
            case 0:
                this.b.a.a.r.Y3(this.c);
                break;
            default:
                final r rVar = this.b.a.a;
                org.telegram.ui.ActionBar.d6 d6Var = rVar.a;
                x3 x3Var = rVar.r;
                a Q2 = x3Var.Q2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = rVar.n;
                    y70 y70Var = rVar.H;
                    if (y70Var != null) {
                        y70Var.u();
                    }
                    y70 G = y70.G(rVar, d6Var, view, true);
                    G.Q = true;
                    y70 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                    J.k();
                    rVar.P(J, Q2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    rVar.P(J, Q2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    rVar.P(J, Q2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    rVar.P(J, Q2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    rVar.P(J, Q2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    rVar.P(J, Q2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = Q2 != null && x3.C3(Q2.b);
                    c2 c2Var = new c2(rVar.getContext(), R.drawable.iv_h1);
                    c2Var.a(z10);
                    G.j(z11, 0, c2Var, LocaleController.getString(R.string.ArticleHeading), new ei.m2(G, J, 1));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(rVar, Q2, 5));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(rVar, Q2, 6));
                    boolean z12 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockPullquote);
                    c2 c2Var2 = new c2(rVar.getContext(), R.drawable.iv_pullquote);
                    c2Var2.a(z10);
                    G.j(z12, 0, c2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(rVar, Q2, 7));
                    G.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(rVar, Q2, 8));
                    boolean z13 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockFooter);
                    c2 c2Var3 = new c2(rVar.getContext(), R.drawable.iv_footer);
                    c2Var3.a(z10);
                    G.j(z13, 0, c2Var3, LocaleController.getString(R.string.ArticleFooter), new f(rVar, Q2, 9));
                    G.Z();
                    rVar.H = G;
                    break;
                } else if (i10 == 2) {
                    y70 y70Var2 = rVar.H;
                    if (y70Var2 != null) {
                        y70Var2.u();
                    }
                    final y70 F = y70.F(rVar, d6Var, view);
                    F.Q = true;
                    F.j(Q2 == null || !Q2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(rVar, Q2, 1));
                    F.j((Q2 == null || !Q2.b() || Q2.a() || Q2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(rVar, Q2, 2));
                    F.j(Q2 != null && Q2.b() && !Q2.a() && Q2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(rVar, Q2, 3));
                    F.j(Q2 != null && Q2.b() && Q2.a() && !Q2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(rVar, Q2, 4));
                    F.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(x3Var, 1));
                    boolean m22 = x3Var.m2();
                    boolean p22 = x3Var.p2();
                    if (m22 || p22) {
                        F.k();
                        if (m22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ii.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            rVar.r.r3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.r3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (p22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ii.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            rVar.r.r3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.r3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    rVar.H = F;
                    break;
                } else {
                    TL_iv.pageTableCell pagetablecell = null;
                    r7 = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    if (i10 == 4) {
                        p5 p5Var = x3Var.i4;
                        if (p5Var == null && (R2 = x3Var.R2()) != null && R2.getModel() != null) {
                            View findFocus = x3Var.findFocus();
                            if ((findFocus instanceof i1) && (o9 = R2.o((i1) findFocus)) != null) {
                                pagetablecell = o9.b;
                            }
                            if (pagetablecell != null) {
                                x3Var.g2(R2);
                                if (R2.H.add(pagetablecell)) {
                                    R2.v.invalidate();
                                    R2.t();
                                }
                                p5Var = R2;
                            }
                        }
                        if (p5Var != null && p5Var.getModel() != null && !p5Var.H.isEmpty()) {
                            x3Var.F4(p5Var);
                            break;
                        } else {
                            x3Var.R1(e6.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (Q2 != null) {
                            TL_iv.PageBlock pageBlock = Q2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        r.U(rVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.g3(19, rVar, pageblockmath), d6Var);
                        break;
                    } else if (i10 == 9) {
                        x3Var.t3();
                        break;
                    }
                }
                break;
        }
    }
}
