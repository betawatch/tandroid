package ii;

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
import org.telegram.ui.Components.xg;
import org.telegram.ui.bj0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ k1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o5 R2;
        r5 o9;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                d2 d2Var = this.b;
                if (!d2Var.P.F2()) {
                    d2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                h2 h2Var = this.b.P.J3;
                if (h2Var != null) {
                    h2Var.k();
                    break;
                }
                break;
            case 3:
                h2 h2Var2 = this.b.P.J3;
                if (h2Var2 != null) {
                    h2Var2.i();
                    break;
                }
                break;
            case 4:
                d2.U(this.b);
                break;
            case 5:
                d2 d2Var2 = this.b;
                if (!d2Var2.B0) {
                    if (d2Var2.A0 == null) {
                        kz kzVar = new kz(d2Var2, true, false, false, d2Var2.getParentActivity(), true, null, d2Var2.O, true, d2Var2.getResourceProvider(), false, false);
                        d2Var2.A0 = kzVar;
                        kzVar.setVisibility(8);
                        kz kzVar2 = d2Var2.A0;
                        kzVar2.w2 = false;
                        kzVar2.setDelegate(new u1(d2Var2));
                        int indexOfChild = d2Var2.O.indexOfChild(d2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = d2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e = w7.x5.e(-1, d2Var2.j0(), 87);
                        e.bottomMargin = d2Var2.T0;
                        d2Var2.O.addView(d2Var2.A0, indexOfChild, e);
                    }
                    int j02 = d2Var2.j0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = w7.x5.e(-1, j02, 87);
                    } else {
                        layoutParams.height = j02;
                    }
                    layoutParams.bottomMargin = d2Var2.T0;
                    d2Var2.A0.setLayoutParams(layoutParams);
                    d2Var2.A0.setVisibility(0);
                    d2Var2.B0 = true;
                    d2Var2.D0 = j02 + d2Var2.T0;
                    i1 P2 = d2Var2.P.P2();
                    if (P2 != null) {
                        AndroidUtilities.hideKeyboard(P2);
                    }
                    d2Var2.h0();
                    d2Var2.b0.j(xg.d, true);
                    break;
                } else {
                    d2Var2.k0(true);
                    i1 P22 = d2Var2.P.P2();
                    if (P22 != null) {
                        P22.r();
                        AndroidUtilities.showKeyboard(P22);
                        break;
                    }
                }
                break;
            case 6:
                final d2 d2Var3 = this.b;
                n70 n70Var = d2Var3.x0;
                if (n70Var != null) {
                    n70Var.u();
                    d2Var3.x0 = null;
                }
                final n70 H = n70.H(d2Var3, view);
                H.Q = true;
                a Q2 = d2Var3.P.Q2();
                H.j(Q2 == null || !Q2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(d2Var3, Q2, 5));
                H.j((Q2 == null || !Q2.b() || Q2.a() || Q2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(d2Var3, Q2, 6));
                H.j(Q2 != null && Q2.b() && !Q2.a() && Q2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(d2Var3, Q2, 7));
                H.j(Q2 != null && Q2.b() && Q2.a() && !Q2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(d2Var3, Q2, 8));
                boolean z10 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                w3 w3Var = d2Var3.P;
                Objects.requireNonNull(w3Var);
                H.j(z10, i10, null, string, new b(w3Var, 1));
                boolean m22 = d2Var3.P.m2();
                boolean p22 = d2Var3.P.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ii.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        d2Var3.P.r3(false);
                                        H.u();
                                        break;
                                    default:
                                        d2Var3.P.r3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (p22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ii.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        d2Var3.P.r3(false);
                                        H.u();
                                        break;
                                    default:
                                        d2Var3.P.r3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                d2Var3.x0 = H;
                break;
            case 7:
                d2 d2Var4 = this.b;
                n70 n70Var2 = d2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (n70Var2 != null) {
                    n70Var2.u();
                    d2Var4.x0 = null;
                }
                w3 w3Var2 = d2Var4.P;
                o5 o5Var = w3Var2.i4;
                if (o5Var == null && (R2 = w3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = R2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.b;
                    }
                    if (pagetablecell != null) {
                        d2Var4.P.g2(R2);
                        if (R2.H.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        o5Var = R2;
                    }
                }
                if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                    d2Var4.P.F4(o5Var);
                    break;
                } else {
                    d2Var4.P.R1(d6.u(2, 2));
                    break;
                }
                break;
            case 8:
                d2 d2Var5 = this.b;
                n70 n70Var3 = d2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (n70Var3 != null) {
                    n70Var3.u();
                    d2Var5.x0 = null;
                }
                a Q22 = d2Var5.P.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                r.U(d2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ci.m2(20, d2Var5, pageblockmath), d2Var5.getResourceProvider());
                break;
            case 9:
                d2 d2Var6 = this.b;
                d2Var6.P.b4 = null;
                d2Var6.o0(90, 0);
                break;
            case 10:
                d2 d2Var7 = this.b;
                d2Var7.r0();
                bj0 bj0Var = d2Var7.O0;
                if (bj0Var != null) {
                    bj0Var.h(true);
                    d2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                d2 d2Var8 = this.b;
                d2Var8.P.Q4();
                d2Var8.y0();
                break;
            case 12:
                this.b.P.Z3(view);
                break;
            case 13:
                this.b.P.a4();
                break;
            case 14:
                this.b.P.X3();
                break;
            case 15:
                this.b.P.b4();
                break;
            default:
                this.b.n0();
                break;
        }
    }
}
