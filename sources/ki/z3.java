package ki;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        o5 X2;
        r5 n10;
        switch (this.a) {
            case 0:
                this.b.a.a.r.e4(this.c);
                break;
            default:
                final q qVar = this.b.a.a;
                org.telegram.ui.ActionBar.g6 g6Var = qVar.a;
                w3 w3Var = qVar.r;
                a W2 = w3Var.W2();
                int i10 = this.c;
                if (i10 == 1) {
                    int i11 = qVar.n;
                    j80 j80Var = qVar.H;
                    if (j80Var != null) {
                        j80Var.u();
                    }
                    j80 G = j80.G(qVar, g6Var, view, true);
                    G.Q = true;
                    j80 J = G.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new h(G, 0), false);
                    J.k();
                    qVar.S(J, W2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                    qVar.S(J, W2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                    qVar.S(J, W2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                    qVar.S(J, W2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                    qVar.S(J, W2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                    qVar.S(J, W2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                    boolean z11 = W2 != null && w3.I3(W2.b);
                    b2 b2Var = new b2(qVar.getContext(), R.drawable.iv_h1);
                    b2Var.a(z10);
                    G.j(z11, 0, b2Var, LocaleController.getString(R.string.ArticleHeading), new gi.g2(G, J, 1));
                    G.j(W2 != null && (W2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(qVar, W2, 5));
                    G.j(W2 != null && (W2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(qVar, W2, 6));
                    boolean z12 = W2 != null && (W2.b instanceof TL_iv.pageBlockPullquote);
                    b2 b2Var2 = new b2(qVar.getContext(), R.drawable.iv_pullquote);
                    b2Var2.a(z10);
                    G.j(z12, 0, b2Var2, LocaleController.getString(R.string.ArticlePullquote), new f(qVar, W2, 7));
                    G.j(W2 != null && (W2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(qVar, W2, 8));
                    boolean z13 = W2 != null && (W2.b instanceof TL_iv.pageBlockFooter);
                    b2 b2Var3 = new b2(qVar.getContext(), R.drawable.iv_footer);
                    b2Var3.a(z10);
                    G.j(z13, 0, b2Var3, LocaleController.getString(R.string.ArticleFooter), new f(qVar, W2, 9));
                    G.Z();
                    qVar.H = G;
                    break;
                } else if (i10 == 2) {
                    j80 j80Var2 = qVar.H;
                    if (j80Var2 != null) {
                        j80Var2.u();
                    }
                    final j80 F = j80.F(qVar, g6Var, view);
                    F.Q = true;
                    F.j(W2 == null || !W2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(qVar, W2, 1));
                    F.j((W2 == null || !W2.b() || W2.a() || W2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(qVar, W2, 2));
                    F.j(W2 != null && W2.b() && !W2.a() && W2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(qVar, W2, 3));
                    F.j(W2 != null && W2.b() && W2.a() && !W2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(qVar, W2, 4));
                    F.j(W2 != null && (W2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(w3Var, 1));
                    boolean s22 = w3Var.s2();
                    boolean v22 = w3Var.v2();
                    if (s22 || v22) {
                        F.k();
                        if (s22) {
                            final int i12 = 0;
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ki.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            qVar.r.x3(false);
                                            F.u();
                                            break;
                                        default:
                                            qVar.r.x3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (v22) {
                            final int i13 = 1;
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ki.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            qVar.r.x3(false);
                                            F.u();
                                            break;
                                        default:
                                            qVar.r.x3(true);
                                            F.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    qVar.H = F;
                    break;
                } else {
                    TL_iv.pageTableCell pagetablecell = null;
                    r7 = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    if (i10 == 4) {
                        o5 o5Var = w3Var.j4;
                        if (o5Var == null && (X2 = w3Var.X2()) != null && X2.getModel() != null) {
                            View findFocus = w3Var.findFocus();
                            if ((findFocus instanceof h1) && (n10 = X2.n((h1) findFocus)) != null) {
                                pagetablecell = n10.b;
                            }
                            if (pagetablecell != null) {
                                w3Var.m2(X2);
                                if (X2.H.add(pagetablecell)) {
                                    X2.v.invalidate();
                                    X2.s();
                                }
                                o5Var = X2;
                            }
                        }
                        if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                            w3Var.L4(o5Var);
                            break;
                        } else {
                            w3Var.X1(c6.t(2, 2));
                            break;
                        }
                    } else if (i10 == 7) {
                        if (W2 != null) {
                            TL_iv.PageBlock pageBlock = W2.b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        q.X(qVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.o2(25, qVar, pageblockmath), g6Var);
                        break;
                    } else if (i10 == 9) {
                        w3Var.z3();
                        break;
                    }
                }
                break;
        }
    }
}
