package hi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.w70;
import org.telegram.ui.cj0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ m1(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r5 Q2;
        u5 o9;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                g2 g2Var = this.b;
                if (!g2Var.P.E2()) {
                    g2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                k2 k2Var = this.b.P.J3;
                if (k2Var != null) {
                    k2Var.k();
                    break;
                }
                break;
            case 3:
                k2 k2Var2 = this.b.P.J3;
                if (k2Var2 != null) {
                    k2Var2.i();
                    break;
                }
                break;
            case 4:
                g2.U(this.b);
                break;
            case 5:
                g2 g2Var2 = this.b;
                if (!g2Var2.B0) {
                    if (g2Var2.A0 == null) {
                        rz rzVar = new rz(g2Var2, true, false, false, g2Var2.getParentActivity(), true, null, g2Var2.O, true, g2Var2.getResourceProvider(), false, false);
                        g2Var2.A0 = rzVar;
                        rzVar.setVisibility(8);
                        rz rzVar2 = g2Var2.A0;
                        rzVar2.x2 = false;
                        rzVar2.setDelegate(new w1(g2Var2));
                        int indexOfChild = g2Var2.O.indexOfChild(g2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = g2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e = w7.a6.e(-1, g2Var2.j0(), 87);
                        e.bottomMargin = g2Var2.T0;
                        g2Var2.O.addView(g2Var2.A0, indexOfChild, e);
                    }
                    int j02 = g2Var2.j0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = w7.a6.e(-1, j02, 87);
                    } else {
                        layoutParams.height = j02;
                    }
                    layoutParams.bottomMargin = g2Var2.T0;
                    g2Var2.A0.setLayoutParams(layoutParams);
                    g2Var2.A0.setVisibility(0);
                    g2Var2.B0 = true;
                    g2Var2.D0 = j02 + g2Var2.T0;
                    k1 O2 = g2Var2.P.O2();
                    if (O2 != null) {
                        AndroidUtilities.hideKeyboard(O2);
                    }
                    g2Var2.h0();
                    g2Var2.b0.j(bh.d, true);
                    break;
                } else {
                    g2Var2.k0(true);
                    k1 O22 = g2Var2.P.O2();
                    if (O22 != null) {
                        O22.r();
                        AndroidUtilities.showKeyboard(O22);
                        break;
                    }
                }
                break;
            case 6:
                final g2 g2Var3 = this.b;
                w70 w70Var = g2Var3.x0;
                if (w70Var != null) {
                    w70Var.u();
                    g2Var3.x0 = null;
                }
                final w70 H = w70.H(g2Var3, view);
                H.Q = true;
                a P2 = g2Var3.P.P2();
                H.j(P2 == null || !P2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new p1(g2Var3, P2, 5));
                H.j((P2 == null || !P2.b() || P2.a() || P2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new p1(g2Var3, P2, 6));
                H.j(P2 != null && P2.b() && !P2.a() && P2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new p1(g2Var3, P2, 7));
                H.j(P2 != null && P2.b() && P2.a() && !P2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new p1(g2Var3, P2, 8));
                boolean z10 = P2 != null && (P2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                z3 z3Var = g2Var3.P;
                Objects.requireNonNull(z3Var);
                H.j(z10, i10, null, string, new b(z3Var, 1));
                boolean l22 = g2Var3.P.l2();
                boolean o22 = g2Var3.P.o2();
                if (l22 || o22) {
                    H.k();
                    if (l22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: hi.s1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        g2Var3.P.q3(false);
                                        H.u();
                                        break;
                                    default:
                                        g2Var3.P.q3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (o22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: hi.s1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        g2Var3.P.q3(false);
                                        H.u();
                                        break;
                                    default:
                                        g2Var3.P.q3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                g2Var3.x0 = H;
                break;
            case 7:
                g2 g2Var4 = this.b;
                w70 w70Var2 = g2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (w70Var2 != null) {
                    w70Var2.u();
                    g2Var4.x0 = null;
                }
                z3 z3Var2 = g2Var4.P;
                r5 r5Var = z3Var2.i4;
                if (r5Var == null && (Q2 = z3Var2.Q2()) != null && Q2.getModel() != null) {
                    View findFocus = g2Var4.P.findFocus();
                    if ((findFocus instanceof k1) && (o9 = Q2.o((k1) findFocus)) != null) {
                        pagetablecell = o9.b;
                    }
                    if (pagetablecell != null) {
                        g2Var4.P.f2(Q2);
                        if (Q2.H.add(pagetablecell)) {
                            Q2.v.invalidate();
                            Q2.t();
                        }
                        r5Var = Q2;
                    }
                }
                if (r5Var != null && r5Var.getModel() != null && !r5Var.H.isEmpty()) {
                    g2Var4.P.E4(r5Var);
                    break;
                } else {
                    g2Var4.P.Q1(g6.u(2, 2));
                    break;
                }
                break;
            case 8:
                g2 g2Var5 = this.b;
                w70 w70Var3 = g2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (w70Var3 != null) {
                    w70Var3.u();
                    g2Var5.x0 = null;
                }
                a P22 = g2Var5.P.P2();
                if (P22 != null) {
                    TL_iv.PageBlock pageBlock = P22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                s.U(g2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new bi.y2(20, g2Var5, pageblockmath), g2Var5.getResourceProvider());
                break;
            case 9:
                g2 g2Var6 = this.b;
                g2Var6.P.b4 = null;
                g2Var6.o0(90, 0);
                break;
            case 10:
                g2 g2Var7 = this.b;
                g2Var7.r0();
                cj0 cj0Var = g2Var7.O0;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    g2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                g2 g2Var8 = this.b;
                g2Var8.P.P4();
                g2Var8.y0();
                break;
            case 12:
                this.b.P.Y3(view);
                break;
            case 13:
                this.b.P.Z3();
                break;
            case 14:
                this.b.P.W3();
                break;
            case 15:
                this.b.P.a4();
                break;
            default:
                this.b.n0();
                break;
        }
    }
}
