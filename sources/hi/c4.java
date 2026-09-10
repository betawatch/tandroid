package hi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c4(e4 e4Var, int i10, int i11) {
        this.a = i11;
        this.b = e4Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r5 Q2;
        u5 o9;
        switch (this.a) {
            case 0:
                this.b.a.a.r.X3(this.c);
                break;
            default:
                final s sVar = this.b.a.a;
                org.telegram.ui.ActionBar.f6 f6Var = sVar.a;
                z3 z3Var = sVar.r;
                a P2 = z3Var.P2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = sVar.n;
                    w70 w70Var = sVar.H;
                    if (w70Var != null) {
                        w70Var.u();
                    }
                    w70 G = w70.G(sVar, f6Var, view, true);
                    G.Q = true;
                    w70 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new i(G, 0), false);
                    J.k();
                    sVar.P(J, P2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    sVar.P(J, P2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    sVar.P(J, P2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    sVar.P(J, P2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    sVar.P(J, P2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    sVar.P(J, P2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = P2 != null && z3.B3(P2.b);
                    e2 e2Var = new e2(sVar.getContext(), R.drawable.iv_h1);
                    e2Var.a(z10);
                    G.j(z11, 0, e2Var, LocaleController.getString(R.string.ArticleHeading), new di.p2(G, J, 1));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new g(sVar, P2, 5));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new g(sVar, P2, 6));
                    boolean z12 = P2 != null && (P2.b instanceof TL_iv.pageBlockPullquote);
                    e2 e2Var2 = new e2(sVar.getContext(), R.drawable.iv_pullquote);
                    e2Var2.a(z10);
                    G.j(z12, 0, e2Var2, LocaleController.getString(R.string.ArticlePullquote), new g(sVar, P2, 7));
                    G.j(P2 != null && (P2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new g(sVar, P2, 8));
                    boolean z13 = P2 != null && (P2.b instanceof TL_iv.pageBlockFooter);
                    e2 e2Var3 = new e2(sVar.getContext(), R.drawable.iv_footer);
                    e2Var3.a(z10);
                    G.j(z13, 0, e2Var3, LocaleController.getString(R.string.ArticleFooter), new g(sVar, P2, 9));
                    G.Z();
                    sVar.H = G;
                    break;
                } else if (i10 == 2) {
                    w70 w70Var2 = sVar.H;
                    if (w70Var2 != null) {
                        w70Var2.u();
                    }
                    final w70 F = w70.F(sVar, f6Var, view);
                    F.Q = true;
                    F.j(P2 == null || !P2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new g(sVar, P2, 1));
                    F.j((P2 == null || !P2.b() || P2.a() || P2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new g(sVar, P2, 2));
                    F.j(P2 != null && P2.b() && !P2.a() && P2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new g(sVar, P2, 3));
                    F.j(P2 != null && P2.b() && P2.a() && !P2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new g(sVar, P2, 4));
                    F.j(P2 != null && (P2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(z3Var, 1));
                    boolean l22 = z3Var.l2();
                    boolean o22 = z3Var.o2();
                    if (l22 || o22) {
                        F.k();
                        if (l22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: hi.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            sVar.r.q3(false);
                                            F.u();
                                            break;
                                        default:
                                            sVar.r.q3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (o22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: hi.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            sVar.r.q3(false);
                                            F.u();
                                            break;
                                        default:
                                            sVar.r.q3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    sVar.H = F;
                    break;
                } else {
                    TL_iv.pageTableCell pagetablecell = null;
                    r7 = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    if (i10 == 4) {
                        r5 r5Var = z3Var.i4;
                        if (r5Var == null && (Q2 = z3Var.Q2()) != null && Q2.getModel() != null) {
                            View findFocus = z3Var.findFocus();
                            if ((findFocus instanceof k1) && (o9 = Q2.o((k1) findFocus)) != null) {
                                pagetablecell = o9.b;
                            }
                            if (pagetablecell != null) {
                                z3Var.f2(Q2);
                                if (Q2.H.add(pagetablecell)) {
                                    Q2.v.invalidate();
                                    Q2.t();
                                }
                                r5Var = Q2;
                            }
                        }
                        if (r5Var != null && r5Var.getModel() != null && !r5Var.H.isEmpty()) {
                            z3Var.E4(r5Var);
                            break;
                        } else {
                            z3Var.Q1(g6.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (P2 != null) {
                            TL_iv.PageBlock pageBlock = P2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        s.U(sVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new bi.y2(18, sVar, pageblockmath), f6Var);
                        break;
                    } else if (i10 == 9) {
                        z3Var.s3();
                        break;
                    }
                }
                break;
        }
    }
}
