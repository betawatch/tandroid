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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ z3(b4 b4Var, int i10, int i11) {
        this.a = i11;
        this.b = b4Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o5 S2;
        r5 o9;
        switch (this.a) {
            case 0:
                this.b.a.a.r.Z3(this.c);
                break;
            default:
                final r rVar = this.b.a.a;
                org.telegram.ui.ActionBar.f6 f6Var = rVar.a;
                w3 w3Var = rVar.r;
                a R2 = w3Var.R2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = rVar.n;
                    y70 y70Var = rVar.H;
                    if (y70Var != null) {
                        y70Var.u();
                    }
                    y70 G = y70.G(rVar, f6Var, view, true);
                    G.Q = true;
                    y70 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                    J.k();
                    rVar.P(J, R2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    rVar.P(J, R2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    rVar.P(J, R2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    rVar.P(J, R2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    rVar.P(J, R2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    rVar.P(J, R2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = R2 != null && w3.D3(R2.b);
                    b2 b2Var = new b2(rVar.getContext(), R.drawable.iv_h1);
                    b2Var.a(z10);
                    G.j(z11, 0, b2Var, LocaleController.getString(R.string.ArticleHeading), new ei.m2(G, J, 1));
                    G.j(R2 != null && (R2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(rVar, R2, 5));
                    G.j(R2 != null && (R2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(rVar, R2, 6));
                    boolean z12 = R2 != null && (R2.b instanceof TL_iv.pageBlockPullquote);
                    b2 b2Var2 = new b2(rVar.getContext(), R.drawable.iv_pullquote);
                    b2Var2.a(z10);
                    G.j(z12, 0, b2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(rVar, R2, 7));
                    G.j(R2 != null && (R2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(rVar, R2, 8));
                    boolean z13 = R2 != null && (R2.b instanceof TL_iv.pageBlockFooter);
                    b2 b2Var3 = new b2(rVar.getContext(), R.drawable.iv_footer);
                    b2Var3.a(z10);
                    G.j(z13, 0, b2Var3, LocaleController.getString(R.string.ArticleFooter), new f(rVar, R2, 9));
                    G.Z();
                    rVar.H = G;
                    break;
                } else if (i10 == 2) {
                    y70 y70Var2 = rVar.H;
                    if (y70Var2 != null) {
                        y70Var2.u();
                    }
                    final y70 F = y70.F(rVar, f6Var, view);
                    F.Q = true;
                    F.j(R2 == null || !R2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(rVar, R2, 1));
                    F.j((R2 == null || !R2.b() || R2.a() || R2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(rVar, R2, 2));
                    F.j(R2 != null && R2.b() && !R2.a() && R2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(rVar, R2, 3));
                    F.j(R2 != null && R2.b() && R2.a() && !R2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(rVar, R2, 4));
                    F.j(R2 != null && (R2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(w3Var, 1));
                    boolean n22 = w3Var.n2();
                    boolean q22 = w3Var.q2();
                    if (n22 || q22) {
                        F.k();
                        if (n22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ii.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            rVar.r.s3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.s3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (q22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ii.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            rVar.r.s3(false);
                                            F.u();
                                            break;
                                        default:
                                            rVar.r.s3(true);
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
                        o5 o5Var = w3Var.i4;
                        if (o5Var == null && (S2 = w3Var.S2()) != null && S2.getModel() != null) {
                            View findFocus = w3Var.findFocus();
                            if ((findFocus instanceof i1) && (o9 = S2.o((i1) findFocus)) != null) {
                                pagetablecell = o9.b;
                            }
                            if (pagetablecell != null) {
                                w3Var.h2(S2);
                                if (S2.H.add(pagetablecell)) {
                                    S2.v.invalidate();
                                    S2.t();
                                }
                                o5Var = S2;
                            }
                        }
                        if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                            w3Var.G4(o5Var);
                            break;
                        } else {
                            w3Var.S1(d6.u(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (R2 != null) {
                            TL_iv.PageBlock pageBlock = R2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        r.U(rVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ci.m2(18, rVar, pageblockmath), f6Var);
                        break;
                    } else if (i10 == 9) {
                        w3Var.u3();
                        break;
                    }
                }
                break;
        }
    }
}
