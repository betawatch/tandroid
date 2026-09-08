package ji;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y3(a4 a4Var, int i10, int i11) {
        this.a = i11;
        this.b = a4Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s5 Q2;
        v5 o9;
        switch (this.a) {
            case 0:
                this.b.a.a.r.X3(this.c);
                break;
            default:
                final r rVar = this.b.a.a;
                org.telegram.ui.ActionBar.f6 f6Var = rVar.a;
                v3 v3Var = rVar.r;
                a P2 = v3Var.P2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = rVar.n;
                    n70 n70Var = rVar.H;
                    if (n70Var != null) {
                        n70Var.u();
                    }
                    n70 G = n70.G(rVar, f6Var, view, true);
                    G.Q = true;
                    n70 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                    J.k();
                    rVar.P(J, P2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    rVar.P(J, P2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    rVar.P(J, P2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    rVar.P(J, P2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    rVar.P(J, P2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    rVar.P(J, P2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = P2 != null && v3.B3(P2.b);
                    a2 a2Var = new a2(rVar.getContext(), R.drawable.iv_h1);
                    a2Var.a(z10);
                    G.j(z11, 0, a2Var, LocaleController.getString(R.string.ArticleHeading), new fi.m2(G, J, 1));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(rVar, P2, 5));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(rVar, P2, 6));
                    boolean z12 = P2 != null && (P2.b instanceof TL_iv.pageBlockPullquote);
                    a2 a2Var2 = new a2(rVar.getContext(), R.drawable.iv_pullquote);
                    a2Var2.a(z10);
                    G.j(z12, 0, a2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(rVar, P2, 7));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(rVar, P2, 8));
                    boolean z13 = P2 != null && (P2.b instanceof TL_iv.pageBlockFooter);
                    a2 a2Var3 = new a2(rVar.getContext(), R.drawable.iv_footer);
                    a2Var3.a(z10);
                    G.j(z13, 0, a2Var3, LocaleController.getString(R.string.ArticleFooter), new f(rVar, P2, 9));
                    G.Z();
                    rVar.H = G;
                    break;
                } else if (i10 == 2) {
                    n70 n70Var2 = rVar.H;
                    if (n70Var2 != null) {
                        n70Var2.u();
                    }
                    final n70 F = n70.F(rVar, f6Var, view);
                    F.Q = true;
                    F.j(P2 == null || !P2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(rVar, P2, 1));
                    F.j((P2 == null || !P2.b() || P2.a() || P2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(rVar, P2, 2));
                    F.j(P2 != null && P2.b() && !P2.a() && P2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(rVar, P2, 3));
                    F.j(P2 != null && P2.b() && P2.a() && !P2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(rVar, P2, 4));
                    F.j(P2 != null && (P2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(v3Var, 1));
                    boolean l22 = v3Var.l2();
                    boolean o22 = v3Var.o2();
                    if (l22 || o22) {
                        F.k();
                        if (l22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ji.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            rVar.r.q3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.q3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (o22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ji.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            rVar.r.q3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.q3(true);
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
                        s5 s5Var = v3Var.i4;
                        if (s5Var == null && (Q2 = v3Var.Q2()) != null && Q2.getModel() != null) {
                            View findFocus = v3Var.findFocus();
                            if ((findFocus instanceof h1) && (o9 = Q2.o((h1) findFocus)) != null) {
                                pagetablecell = o9.b;
                            }
                            if (pagetablecell != null) {
                                v3Var.f2(Q2);
                                if (Q2.H.add(pagetablecell)) {
                                    Q2.v.invalidate();
                                    Q2.t();
                                }
                                s5Var = Q2;
                            }
                        }
                        if (s5Var != null && s5Var.getModel() != null && !s5Var.H.isEmpty()) {
                            v3Var.E4(s5Var);
                            break;
                        } else {
                            v3Var.Q1(g6.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (P2 != null) {
                            TL_iv.PageBlock pageBlock = P2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        r.U(rVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new di.m2(18, rVar, pageblockmath), f6Var);
                        break;
                    } else if (i10 == 9) {
                        v3Var.s3();
                        break;
                    }
                }
                break;
        }
    }
}
