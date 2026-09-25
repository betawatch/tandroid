package ii;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zg;
import org.telegram.ui.vi0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ k1(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p5 R2;
        s5 o9;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                e2 e2Var = this.b;
                if (!e2Var.P.F2()) {
                    e2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                i2 i2Var = this.b.P.J3;
                if (i2Var != null) {
                    i2Var.k();
                    break;
                }
                break;
            case 3:
                i2 i2Var2 = this.b.P.J3;
                if (i2Var2 != null) {
                    i2Var2.i();
                    break;
                }
                break;
            case 4:
                e2.U(this.b);
                break;
            case 5:
                e2 e2Var2 = this.b;
                if (!e2Var2.B0) {
                    if (e2Var2.A0 == null) {
                        lz lzVar = new lz(e2Var2, true, false, false, e2Var2.getParentActivity(), true, null, e2Var2.O, true, e2Var2.getResourceProvider(), false, false);
                        e2Var2.A0 = lzVar;
                        lzVar.setVisibility(8);
                        lz lzVar2 = e2Var2.A0;
                        lzVar2.w2 = false;
                        lzVar2.setDelegate(new v1(e2Var2));
                        int indexOfChild = e2Var2.O.indexOfChild(e2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = e2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e = w7.y5.e(-1, e2Var2.j0(), 87);
                        e.bottomMargin = e2Var2.T0;
                        e2Var2.O.addView(e2Var2.A0, indexOfChild, e);
                    }
                    int j02 = e2Var2.j0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = w7.y5.e(-1, j02, 87);
                    } else {
                        layoutParams.height = j02;
                    }
                    layoutParams.bottomMargin = e2Var2.T0;
                    e2Var2.A0.setLayoutParams(layoutParams);
                    e2Var2.A0.setVisibility(0);
                    e2Var2.B0 = true;
                    e2Var2.D0 = j02 + e2Var2.T0;
                    i1 P2 = e2Var2.P.P2();
                    if (P2 != null) {
                        AndroidUtilities.hideKeyboard(P2);
                    }
                    e2Var2.h0();
                    e2Var2.b0.j(zg.d, true);
                    break;
                } else {
                    e2Var2.k0(true);
                    i1 P22 = e2Var2.P.P2();
                    if (P22 != null) {
                        P22.r();
                        AndroidUtilities.showKeyboard(P22);
                        break;
                    }
                }
                break;
            case 6:
                final e2 e2Var3 = this.b;
                y70 y70Var = e2Var3.x0;
                if (y70Var != null) {
                    y70Var.u();
                    e2Var3.x0 = null;
                }
                final y70 H = y70.H(e2Var3, view);
                H.Q = true;
                a Q2 = e2Var3.P.Q2();
                H.j(Q2 == null || !Q2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(e2Var3, Q2, 5));
                H.j((Q2 == null || !Q2.b() || Q2.a() || Q2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(e2Var3, Q2, 6));
                H.j(Q2 != null && Q2.b() && !Q2.a() && Q2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(e2Var3, Q2, 7));
                H.j(Q2 != null && Q2.b() && Q2.a() && !Q2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(e2Var3, Q2, 8));
                boolean z10 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                x3 x3Var = e2Var3.P;
                Objects.requireNonNull(x3Var);
                H.j(z10, i10, null, string, new b(x3Var, 1));
                boolean m22 = e2Var3.P.m2();
                boolean p22 = e2Var3.P.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ii.r1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        e2Var3.P.r3(false);
                                        H.u();
                                        break;
                                    default:
                                        e2Var3.P.r3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (p22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ii.r1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        e2Var3.P.r3(false);
                                        H.u();
                                        break;
                                    default:
                                        e2Var3.P.r3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                e2Var3.x0 = H;
                break;
            case 7:
                e2 e2Var4 = this.b;
                y70 y70Var2 = e2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (y70Var2 != null) {
                    y70Var2.u();
                    e2Var4.x0 = null;
                }
                x3 x3Var2 = e2Var4.P;
                p5 p5Var = x3Var2.i4;
                if (p5Var == null && (R2 = x3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = e2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = R2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.b;
                    }
                    if (pagetablecell != null) {
                        e2Var4.P.g2(R2);
                        if (R2.H.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        p5Var = R2;
                    }
                }
                if (p5Var != null && p5Var.getModel() != null && !p5Var.H.isEmpty()) {
                    e2Var4.P.F4(p5Var);
                    break;
                } else {
                    e2Var4.P.R1(e6.u(2, 2));
                    break;
                }
                break;
            case 8:
                e2 e2Var5 = this.b;
                y70 y70Var3 = e2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (y70Var3 != null) {
                    y70Var3.u();
                    e2Var5.x0 = null;
                }
                a Q22 = e2Var5.P.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                r.U(e2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.g3(21, e2Var5, pageblockmath), e2Var5.getResourceProvider());
                break;
            case 9:
                e2 e2Var6 = this.b;
                e2Var6.P.b4 = null;
                e2Var6.o0(90, 0);
                break;
            case 10:
                e2 e2Var7 = this.b;
                e2Var7.r0();
                vi0 vi0Var = e2Var7.O0;
                if (vi0Var != null) {
                    vi0Var.h(true);
                    e2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                e2 e2Var8 = this.b;
                e2Var8.P.Q4();
                e2Var8.y0();
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
