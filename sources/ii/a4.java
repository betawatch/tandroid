package ii;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        q5 T2;
        t5 o9;
        switch (this.a) {
            case 0:
                this.b.a.a.r.a4(this.c);
                break;
            default:
                final r rVar = this.b.a.a;
                org.telegram.ui.ActionBar.d6 d6Var = rVar.a;
                x3 x3Var = rVar.r;
                a S2 = x3Var.S2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = rVar.n;
                    b80 b80Var = rVar.H;
                    if (b80Var != null) {
                        b80Var.u();
                    }
                    b80 G = b80.G(rVar, d6Var, view, true);
                    G.Q = true;
                    b80 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                    J.k();
                    rVar.N(J, S2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    rVar.N(J, S2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    rVar.N(J, S2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    rVar.N(J, S2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    rVar.N(J, S2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    rVar.N(J, S2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = S2 != null && x3.E3(S2.b);
                    c2 c2Var = new c2(rVar.getContext(), R.drawable.iv_h1);
                    c2Var.a(z10);
                    G.j(z11, 0, c2Var, LocaleController.getString(R.string.ArticleHeading), new ei.n2(G, J, 1));
                    G.j(S2 != null && (S2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(rVar, S2, 5));
                    G.j(S2 != null && (S2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(rVar, S2, 6));
                    boolean z12 = S2 != null && (S2.b instanceof TL_iv.pageBlockPullquote);
                    c2 c2Var2 = new c2(rVar.getContext(), R.drawable.iv_pullquote);
                    c2Var2.a(z10);
                    G.j(z12, 0, c2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(rVar, S2, 7));
                    G.j(S2 != null && (S2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(rVar, S2, 8));
                    boolean z13 = S2 != null && (S2.b instanceof TL_iv.pageBlockFooter);
                    c2 c2Var3 = new c2(rVar.getContext(), R.drawable.iv_footer);
                    c2Var3.a(z10);
                    G.j(z13, 0, c2Var3, LocaleController.getString(R.string.ArticleFooter), new f(rVar, S2, 9));
                    G.Z();
                    rVar.H = G;
                    break;
                } else if (i10 == 2) {
                    b80 b80Var2 = rVar.H;
                    if (b80Var2 != null) {
                        b80Var2.u();
                    }
                    final b80 F = b80.F(rVar, d6Var, view);
                    F.Q = true;
                    F.j(S2 == null || !S2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(rVar, S2, 1));
                    F.j((S2 == null || !S2.b() || S2.a() || S2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(rVar, S2, 2));
                    F.j(S2 != null && S2.b() && !S2.a() && S2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(rVar, S2, 3));
                    F.j(S2 != null && S2.b() && S2.a() && !S2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(rVar, S2, 4));
                    F.j(S2 != null && (S2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(x3Var, 1));
                    boolean o22 = x3Var.o2();
                    boolean r22 = x3Var.r2();
                    if (o22 || r22) {
                        F.k();
                        if (o22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ii.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            rVar.r.t3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.t3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (r22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ii.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            rVar.r.t3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.t3(true);
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
                        q5 q5Var = x3Var.p4;
                        if (q5Var == null && (T2 = x3Var.T2()) != null && T2.getModel() != null) {
                            View findFocus = x3Var.findFocus();
                            if ((findFocus instanceof i1) && (o9 = T2.o((i1) findFocus)) != null) {
                                pagetablecell = o9.b;
                            }
                            if (pagetablecell != null) {
                                x3Var.i2(T2);
                                if (T2.H.add(pagetablecell)) {
                                    T2.v.invalidate();
                                    T2.t();
                                }
                                q5Var = T2;
                            }
                        }
                        if (q5Var != null && q5Var.getModel() != null && !q5Var.H.isEmpty()) {
                            x3Var.H4(q5Var);
                            break;
                        } else {
                            x3Var.T1(f6.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (S2 != null) {
                            TL_iv.PageBlock pageBlock = S2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        r.S(rVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.g3(19, rVar, pageblockmath), d6Var);
                        break;
                    } else if (i10 == 9) {
                        x3Var.v3();
                        break;
                    }
                }
                break;
        }
    }
}
