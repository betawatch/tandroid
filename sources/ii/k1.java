package ii;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.nz;
import org.telegram.ui.zi0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        q5 S2;
        t5 o9;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                e2 e2Var = this.b;
                if (!e2Var.P.G2()) {
                    e2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                i2 i2Var = this.b.P.Q3;
                if (i2Var != null) {
                    i2Var.k();
                    break;
                }
                break;
            case 3:
                i2 i2Var2 = this.b.P.Q3;
                if (i2Var2 != null) {
                    i2Var2.i();
                    break;
                }
                break;
            case 4:
                e2.S(this.b);
                break;
            case 5:
                e2 e2Var2 = this.b;
                if (!e2Var2.B0) {
                    if (e2Var2.A0 == null) {
                        nz nzVar = new nz(e2Var2, true, false, false, e2Var2.getParentActivity(), true, null, e2Var2.O, true, e2Var2.getResourceProvider(), false, false);
                        e2Var2.A0 = nzVar;
                        nzVar.setVisibility(8);
                        nz nzVar2 = e2Var2.A0;
                        nzVar2.w2 = false;
                        nzVar2.setDelegate(new v1(e2Var2));
                        int indexOfChild = e2Var2.O.indexOfChild(e2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = e2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e7 = w7.z5.e(-1, e2Var2.j0(), 87);
                        e7.bottomMargin = e2Var2.T0;
                        e2Var2.O.addView(e2Var2.A0, indexOfChild, e7);
                    }
                    int j02 = e2Var2.j0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = w7.z5.e(-1, j02, 87);
                    } else {
                        layoutParams.height = j02;
                    }
                    layoutParams.bottomMargin = e2Var2.T0;
                    e2Var2.A0.setLayoutParams(layoutParams);
                    e2Var2.A0.setVisibility(0);
                    e2Var2.B0 = true;
                    e2Var2.D0 = j02 + e2Var2.T0;
                    i1 Q2 = e2Var2.P.Q2();
                    if (Q2 != null) {
                        AndroidUtilities.hideKeyboard(Q2);
                    }
                    e2Var2.h0();
                    e2Var2.b0.j(ah.d, true);
                    break;
                } else {
                    e2Var2.k0(true);
                    i1 Q22 = e2Var2.P.Q2();
                    if (Q22 != null) {
                        Q22.r();
                        AndroidUtilities.showKeyboard(Q22);
                        break;
                    }
                }
                break;
            case 6:
                final e2 e2Var3 = this.b;
                b80 b80Var = e2Var3.x0;
                if (b80Var != null) {
                    b80Var.u();
                    e2Var3.x0 = null;
                }
                final b80 H = b80.H(e2Var3, view);
                H.Q = true;
                a R2 = e2Var3.P.R2();
                H.j(R2 == null || !R2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(e2Var3, R2, 5));
                H.j((R2 == null || !R2.b() || R2.a() || R2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(e2Var3, R2, 6));
                H.j(R2 != null && R2.b() && !R2.a() && R2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(e2Var3, R2, 7));
                H.j(R2 != null && R2.b() && R2.a() && !R2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(e2Var3, R2, 8));
                boolean z10 = R2 != null && (R2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                x3 x3Var = e2Var3.P;
                Objects.requireNonNull(x3Var);
                H.j(z10, i10, null, string, new b(x3Var, 1));
                boolean n22 = e2Var3.P.n2();
                boolean q22 = e2Var3.P.q2();
                if (n22 || q22) {
                    H.k();
                    if (n22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ii.r1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        e2Var3.P.s3(false);
                                        H.u();
                                        break;
                                    default:
                                        e2Var3.P.s3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (q22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ii.r1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        e2Var3.P.s3(false);
                                        H.u();
                                        break;
                                    default:
                                        e2Var3.P.s3(true);
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
                b80 b80Var2 = e2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (b80Var2 != null) {
                    b80Var2.u();
                    e2Var4.x0 = null;
                }
                x3 x3Var2 = e2Var4.P;
                q5 q5Var = x3Var2.p4;
                if (q5Var == null && (S2 = x3Var2.S2()) != null && S2.getModel() != null) {
                    View findFocus = e2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = S2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.b;
                    }
                    if (pagetablecell != null) {
                        e2Var4.P.h2(S2);
                        if (S2.H.add(pagetablecell)) {
                            S2.v.invalidate();
                            S2.t();
                        }
                        q5Var = S2;
                    }
                }
                if (q5Var != null && q5Var.getModel() != null && !q5Var.H.isEmpty()) {
                    e2Var4.P.G4(q5Var);
                    break;
                } else {
                    e2Var4.P.S1(f6.u(2, 2));
                    break;
                }
                break;
            case 8:
                e2 e2Var5 = this.b;
                b80 b80Var3 = e2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (b80Var3 != null) {
                    b80Var3.u();
                    e2Var5.x0 = null;
                }
                a R22 = e2Var5.P.R2();
                if (R22 != null) {
                    TL_iv.PageBlock pageBlock = R22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                r.S(e2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.g3(21, e2Var5, pageblockmath), e2Var5.getResourceProvider());
                break;
            case 9:
                e2 e2Var6 = this.b;
                e2Var6.P.i4 = null;
                e2Var6.o0(90, 0);
                break;
            case 10:
                e2 e2Var7 = this.b;
                e2Var7.r0();
                zi0 zi0Var = e2Var7.O0;
                if (zi0Var != null) {
                    zi0Var.h(true);
                    e2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                e2 e2Var8 = this.b;
                e2Var8.P.R4();
                e2Var8.y0();
                break;
            case 12:
                this.b.P.a4(view);
                break;
            case 13:
                this.b.P.b4();
                break;
            case 14:
                this.b.P.Y3();
                break;
            case 15:
                this.b.P.c4();
                break;
            default:
                this.b.n0();
                break;
        }
    }
}
