package ji;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.zg;
import org.telegram.ui.cj0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ j1(c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s5 Q2;
        v5 o9;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                c2 c2Var = this.b;
                if (!c2Var.P.E2()) {
                    c2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                g2 g2Var = this.b.P.J3;
                if (g2Var != null) {
                    g2Var.k();
                    break;
                }
                break;
            case 3:
                g2 g2Var2 = this.b.P.J3;
                if (g2Var2 != null) {
                    g2Var2.i();
                    break;
                }
                break;
            case 4:
                c2.U(this.b);
                break;
            case 5:
                c2 c2Var2 = this.b;
                if (!c2Var2.B0) {
                    if (c2Var2.A0 == null) {
                        kz kzVar = new kz(c2Var2, true, false, false, c2Var2.getParentActivity(), true, null, c2Var2.O, true, c2Var2.getResourceProvider(), false, false);
                        c2Var2.A0 = kzVar;
                        kzVar.setVisibility(8);
                        kz kzVar2 = c2Var2.A0;
                        kzVar2.x2 = false;
                        kzVar2.setDelegate(new t1(c2Var2));
                        int indexOfChild = c2Var2.O.indexOfChild(c2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = c2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e7 = w7.x5.e(-1, c2Var2.j0(), 87);
                        e7.bottomMargin = c2Var2.T0;
                        c2Var2.O.addView(c2Var2.A0, indexOfChild, e7);
                    }
                    int j02 = c2Var2.j0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = w7.x5.e(-1, j02, 87);
                    } else {
                        layoutParams.height = j02;
                    }
                    layoutParams.bottomMargin = c2Var2.T0;
                    c2Var2.A0.setLayoutParams(layoutParams);
                    c2Var2.A0.setVisibility(0);
                    c2Var2.B0 = true;
                    c2Var2.D0 = j02 + c2Var2.T0;
                    h1 O2 = c2Var2.P.O2();
                    if (O2 != null) {
                        AndroidUtilities.hideKeyboard(O2);
                    }
                    c2Var2.h0();
                    c2Var2.b0.j(zg.d, true);
                    break;
                } else {
                    c2Var2.k0(true);
                    h1 O22 = c2Var2.P.O2();
                    if (O22 != null) {
                        O22.r();
                        AndroidUtilities.showKeyboard(O22);
                        break;
                    }
                }
                break;
            case 6:
                final c2 c2Var3 = this.b;
                n70 n70Var = c2Var3.x0;
                if (n70Var != null) {
                    n70Var.u();
                    c2Var3.x0 = null;
                }
                final n70 H = n70.H(c2Var3, view);
                H.Q = true;
                a P2 = c2Var3.P.P2();
                H.j(P2 == null || !P2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new m1(c2Var3, P2, 5));
                H.j((P2 == null || !P2.b() || P2.a() || P2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new m1(c2Var3, P2, 6));
                H.j(P2 != null && P2.b() && !P2.a() && P2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new m1(c2Var3, P2, 7));
                H.j(P2 != null && P2.b() && P2.a() && !P2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new m1(c2Var3, P2, 8));
                boolean z10 = P2 != null && (P2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                v3 v3Var = c2Var3.P;
                Objects.requireNonNull(v3Var);
                H.j(z10, i10, null, string, new b(v3Var, 1));
                boolean l22 = c2Var3.P.l2();
                boolean o22 = c2Var3.P.o2();
                if (l22 || o22) {
                    H.k();
                    if (l22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ji.p1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        c2Var3.P.q3(false);
                                        H.u();
                                        break;
                                    default:
                                        c2Var3.P.q3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (o22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ji.p1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        c2Var3.P.q3(false);
                                        H.u();
                                        break;
                                    default:
                                        c2Var3.P.q3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                c2Var3.x0 = H;
                break;
            case 7:
                c2 c2Var4 = this.b;
                n70 n70Var2 = c2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (n70Var2 != null) {
                    n70Var2.u();
                    c2Var4.x0 = null;
                }
                v3 v3Var2 = c2Var4.P;
                s5 s5Var = v3Var2.i4;
                if (s5Var == null && (Q2 = v3Var2.Q2()) != null && Q2.getModel() != null) {
                    View findFocus = c2Var4.P.findFocus();
                    if ((findFocus instanceof h1) && (o9 = Q2.o((h1) findFocus)) != null) {
                        pagetablecell = o9.b;
                    }
                    if (pagetablecell != null) {
                        c2Var4.P.f2(Q2);
                        if (Q2.H.add(pagetablecell)) {
                            Q2.v.invalidate();
                            Q2.t();
                        }
                        s5Var = Q2;
                    }
                }
                if (s5Var != null && s5Var.getModel() != null && !s5Var.H.isEmpty()) {
                    c2Var4.P.E4(s5Var);
                    break;
                } else {
                    c2Var4.P.Q1(g6.u(2, 2));
                    break;
                }
                break;
            case 8:
                c2 c2Var5 = this.b;
                n70 n70Var3 = c2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (n70Var3 != null) {
                    n70Var3.u();
                    c2Var5.x0 = null;
                }
                a P22 = c2Var5.P.P2();
                if (P22 != null) {
                    TL_iv.PageBlock pageBlock = P22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                r.U(c2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new di.m2(20, c2Var5, pageblockmath), c2Var5.getResourceProvider());
                break;
            case 9:
                c2 c2Var6 = this.b;
                c2Var6.P.b4 = null;
                c2Var6.o0(90, 0);
                break;
            case 10:
                c2 c2Var7 = this.b;
                c2Var7.r0();
                cj0 cj0Var = c2Var7.O0;
                if (cj0Var != null) {
                    cj0Var.h(true);
                    c2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                c2 c2Var8 = this.b;
                c2Var8.P.P4();
                c2Var8.y0();
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
