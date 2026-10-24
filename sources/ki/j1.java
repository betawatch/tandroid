package ki;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yg;
import org.telegram.ui.qi0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ j1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o5 X2;
        r5 n10;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                d2 d2Var = this.b;
                if (!d2Var.P.L2()) {
                    d2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                h2 h2Var = this.b.P.K3;
                if (h2Var != null) {
                    h2Var.k();
                    break;
                }
                break;
            case 3:
                h2 h2Var2 = this.b.P.K3;
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
                        tz tzVar = new tz(d2Var2, true, false, false, d2Var2.getParentActivity(), true, null, d2Var2.O, true, d2Var2.getResourceProvider(), false, false);
                        d2Var2.A0 = tzVar;
                        tzVar.setVisibility(8);
                        tz tzVar2 = d2Var2.A0;
                        tzVar2.x2 = false;
                        tzVar2.setDelegate(new u1(d2Var2));
                        int indexOfChild = d2Var2.O.indexOfChild(d2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = d2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e = w7.z5.e(-1, d2Var2.j0(), 87);
                        e.bottomMargin = d2Var2.T0;
                        d2Var2.O.addView(d2Var2.A0, indexOfChild, e);
                    }
                    int j02 = d2Var2.j0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = w7.z5.e(-1, j02, 87);
                    } else {
                        layoutParams.height = j02;
                    }
                    layoutParams.bottomMargin = d2Var2.T0;
                    d2Var2.A0.setLayoutParams(layoutParams);
                    d2Var2.A0.setVisibility(0);
                    d2Var2.B0 = true;
                    d2Var2.D0 = j02 + d2Var2.T0;
                    h1 V2 = d2Var2.P.V2();
                    if (V2 != null) {
                        AndroidUtilities.hideKeyboard(V2);
                    }
                    d2Var2.h0();
                    d2Var2.b0.j(yg.d, true);
                    break;
                } else {
                    d2Var2.k0(true);
                    h1 V22 = d2Var2.P.V2();
                    if (V22 != null) {
                        V22.r();
                        AndroidUtilities.showKeyboard(V22);
                        break;
                    }
                }
                break;
            case 6:
                final d2 d2Var3 = this.b;
                j80 j80Var = d2Var3.x0;
                if (j80Var != null) {
                    j80Var.u();
                    d2Var3.x0 = null;
                }
                final j80 H = j80.H(d2Var3, view);
                H.Q = true;
                a W2 = d2Var3.P.W2();
                H.j(W2 == null || !W2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new m1(d2Var3, W2, 5));
                H.j((W2 == null || !W2.b() || W2.a() || W2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new m1(d2Var3, W2, 6));
                H.j(W2 != null && W2.b() && !W2.a() && W2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new m1(d2Var3, W2, 7));
                H.j(W2 != null && W2.b() && W2.a() && !W2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new m1(d2Var3, W2, 8));
                boolean z10 = W2 != null && (W2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                w3 w3Var = d2Var3.P;
                Objects.requireNonNull(w3Var);
                H.j(z10, i10, null, string, new b(w3Var, 1));
                boolean s22 = d2Var3.P.s2();
                boolean v22 = d2Var3.P.v2();
                if (s22 || v22) {
                    H.k();
                    if (s22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ki.p1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        d2Var3.P.x3(false);
                                        H.u();
                                        break;
                                    default:
                                        d2Var3.P.x3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (v22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ki.p1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        d2Var3.P.x3(false);
                                        H.u();
                                        break;
                                    default:
                                        d2Var3.P.x3(true);
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
                j80 j80Var2 = d2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (j80Var2 != null) {
                    j80Var2.u();
                    d2Var4.x0 = null;
                }
                w3 w3Var2 = d2Var4.P;
                o5 o5Var = w3Var2.j4;
                if (o5Var == null && (X2 = w3Var2.X2()) != null && X2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof h1) && (n10 = X2.n((h1) findFocus)) != null) {
                        pagetablecell = n10.b;
                    }
                    if (pagetablecell != null) {
                        d2Var4.P.m2(X2);
                        if (X2.H.add(pagetablecell)) {
                            X2.v.invalidate();
                            X2.s();
                        }
                        o5Var = X2;
                    }
                }
                if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                    d2Var4.P.L4(o5Var);
                    break;
                } else {
                    d2Var4.P.X1(c6.t(2, 2));
                    break;
                }
                break;
            case 8:
                d2 d2Var5 = this.b;
                j80 j80Var3 = d2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (j80Var3 != null) {
                    j80Var3.u();
                    d2Var5.x0 = null;
                }
                a W22 = d2Var5.P.W2();
                if (W22 != null) {
                    TL_iv.PageBlock pageBlock = W22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                q.X(d2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.o2(27, d2Var5, pageblockmath), d2Var5.getResourceProvider());
                break;
            case 9:
                d2 d2Var6 = this.b;
                d2Var6.P.c4 = null;
                d2Var6.o0(90, 0);
                break;
            case 10:
                d2 d2Var7 = this.b;
                d2Var7.r0();
                qi0 qi0Var = d2Var7.O0;
                if (qi0Var != null) {
                    qi0Var.g(true);
                    d2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                d2 d2Var8 = this.b;
                d2Var8.P.W4();
                d2Var8.y0();
                break;
            case 12:
                this.b.P.f4(view);
                break;
            case 13:
                this.b.P.g4();
                break;
            case 14:
                this.b.P.d4();
                break;
            case 15:
                this.b.P.h4();
                break;
            default:
                this.b.n0();
                break;
        }
    }
}
