package li;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.yg;
import org.telegram.ui.ni0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ i1(b2 b2Var, int i10) {
        this.a = i10;
        this.b = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p5 X2;
        s5 n10;
        switch (this.a) {
            case 0:
                this.b.s0();
                break;
            case 1:
                b2 b2Var = this.b;
                if (!b2Var.P.L2()) {
                    b2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                f2 f2Var = this.b.P.R3;
                if (f2Var != null) {
                    f2Var.k();
                    break;
                }
                break;
            case 3:
                f2 f2Var2 = this.b.P.R3;
                if (f2Var2 != null) {
                    f2Var2.i();
                    break;
                }
                break;
            case 4:
                b2.V(this.b);
                break;
            case 5:
                b2 b2Var2 = this.b;
                if (!b2Var2.B0) {
                    if (b2Var2.A0 == null) {
                        sz szVar = new sz(b2Var2, true, false, false, b2Var2.getParentActivity(), true, null, b2Var2.O, true, b2Var2.getResourceProvider(), false, false);
                        b2Var2.A0 = szVar;
                        szVar.setVisibility(8);
                        sz szVar2 = b2Var2.A0;
                        szVar2.x2 = false;
                        szVar2.setDelegate(new s1(b2Var2));
                        int indexOfChild = b2Var2.O.indexOfChild(b2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = b2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams i10 = gb1.i(-1, b2Var2.k0(), 87);
                        i10.bottomMargin = b2Var2.T0;
                        b2Var2.O.addView(b2Var2.A0, indexOfChild, i10);
                    }
                    int k02 = b2Var2.k0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = gb1.i(-1, k02, 87);
                    } else {
                        layoutParams.height = k02;
                    }
                    layoutParams.bottomMargin = b2Var2.T0;
                    b2Var2.A0.setLayoutParams(layoutParams);
                    b2Var2.A0.setVisibility(0);
                    b2Var2.B0 = true;
                    b2Var2.D0 = k02 + b2Var2.T0;
                    g1 V2 = b2Var2.P.V2();
                    if (V2 != null) {
                        AndroidUtilities.hideKeyboard(V2);
                    }
                    b2Var2.i0();
                    b2Var2.b0.j(yg.d, true);
                    break;
                } else {
                    b2Var2.l0(true);
                    g1 V22 = b2Var2.P.V2();
                    if (V22 != null) {
                        V22.r();
                        AndroidUtilities.showKeyboard(V22);
                        break;
                    }
                }
                break;
            case 6:
                final b2 b2Var3 = this.b;
                k80 k80Var = b2Var3.x0;
                if (k80Var != null) {
                    k80Var.u();
                    b2Var3.x0 = null;
                }
                final k80 H = k80.H(b2Var3, view);
                H.Q = true;
                a W2 = b2Var3.P.W2();
                H.j(W2 == null || !W2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new l1(b2Var3, W2, 5));
                H.j((W2 == null || !W2.b() || W2.a() || W2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new l1(b2Var3, W2, 6));
                H.j(W2 != null && W2.b() && !W2.a() && W2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new l1(b2Var3, W2, 7));
                H.j(W2 != null && W2.b() && W2.a() && !W2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new l1(b2Var3, W2, 8));
                boolean z10 = W2 != null && (W2.b instanceof TL_iv.pageBlockDetails);
                int i11 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                v3 v3Var = b2Var3.P;
                Objects.requireNonNull(v3Var);
                H.j(z10, i11, null, string, new b(v3Var, 1));
                boolean s22 = b2Var3.P.s2();
                boolean v22 = b2Var3.P.v2();
                if (s22 || v22) {
                    H.k();
                    if (s22) {
                        final int i12 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: li.o1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        b2Var3.P.x3(false);
                                        H.u();
                                        break;
                                    default:
                                        b2Var3.P.x3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (v22) {
                        final int i13 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: li.o1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        b2Var3.P.x3(false);
                                        H.u();
                                        break;
                                    default:
                                        b2Var3.P.x3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                b2Var3.x0 = H;
                break;
            case 7:
                b2 b2Var4 = this.b;
                k80 k80Var2 = b2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (k80Var2 != null) {
                    k80Var2.u();
                    b2Var4.x0 = null;
                }
                v3 v3Var2 = b2Var4.P;
                p5 p5Var = v3Var2.q4;
                if (p5Var == null && (X2 = v3Var2.X2()) != null && X2.getModel() != null) {
                    View findFocus = b2Var4.P.findFocus();
                    if ((findFocus instanceof g1) && (n10 = X2.n((g1) findFocus)) != null) {
                        pagetablecell = n10.b;
                    }
                    if (pagetablecell != null) {
                        b2Var4.P.m2(X2);
                        if (X2.H.add(pagetablecell)) {
                            X2.v.invalidate();
                            X2.s();
                        }
                        p5Var = X2;
                    }
                }
                if (p5Var != null && p5Var.getModel() != null && !p5Var.H.isEmpty()) {
                    b2Var4.P.L4(p5Var);
                    break;
                } else {
                    b2Var4.P.X1(d6.t(2, 2));
                    break;
                }
                break;
            case 8:
                b2 b2Var5 = this.b;
                k80 k80Var3 = b2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (k80Var3 != null) {
                    k80Var3.u();
                    b2Var5.x0 = null;
                }
                a W22 = b2Var5.P.W2();
                if (W22 != null) {
                    TL_iv.PageBlock pageBlock = W22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                q.X(b2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.n1(29, b2Var5, pageblockmath), b2Var5.getResourceProvider());
                break;
            case 9:
                b2 b2Var6 = this.b;
                b2Var6.P.j4 = null;
                b2Var6.p0(90, 0);
                break;
            case 10:
                b2 b2Var7 = this.b;
                b2Var7.s0();
                ni0 ni0Var = b2Var7.O0;
                if (ni0Var != null) {
                    ni0Var.g(true);
                    b2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                b2 b2Var8 = this.b;
                b2Var8.P.W4();
                b2Var8.z0();
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
                this.b.o0();
                break;
        }
    }
}
