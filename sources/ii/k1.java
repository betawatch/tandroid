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
import org.telegram.ui.dj0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        o5 S2;
        r5 o9;
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            case 1:
                d2 d2Var = this.b;
                if (!d2Var.P.G2()) {
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
                    i1 Q2 = d2Var2.P.Q2();
                    if (Q2 != null) {
                        AndroidUtilities.hideKeyboard(Q2);
                    }
                    d2Var2.h0();
                    d2Var2.b0.j(xg.d, true);
                    break;
                } else {
                    d2Var2.k0(true);
                    i1 Q22 = d2Var2.P.Q2();
                    if (Q22 != null) {
                        Q22.r();
                        AndroidUtilities.showKeyboard(Q22);
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
                a R2 = d2Var3.P.R2();
                H.j(R2 == null || !R2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(d2Var3, R2, 5));
                H.j((R2 == null || !R2.b() || R2.a() || R2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(d2Var3, R2, 6));
                H.j(R2 != null && R2.b() && !R2.a() && R2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(d2Var3, R2, 7));
                H.j(R2 != null && R2.b() && R2.a() && !R2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(d2Var3, R2, 8));
                boolean z10 = R2 != null && (R2.b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                w3 w3Var = d2Var3.P;
                Objects.requireNonNull(w3Var);
                H.j(z10, i10, null, string, new b(w3Var, 1));
                boolean n22 = d2Var3.P.n2();
                boolean q22 = d2Var3.P.q2();
                if (n22 || q22) {
                    H.k();
                    if (n22) {
                        final int i11 = 0;
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ii.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        d2Var3.P.s3(false);
                                        H.u();
                                        break;
                                    default:
                                        d2Var3.P.s3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (q22) {
                        final int i12 = 1;
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ii.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        d2Var3.P.s3(false);
                                        H.u();
                                        break;
                                    default:
                                        d2Var3.P.s3(true);
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
                if (o5Var == null && (S2 = w3Var2.S2()) != null && S2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = S2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.b;
                    }
                    if (pagetablecell != null) {
                        d2Var4.P.h2(S2);
                        if (S2.H.add(pagetablecell)) {
                            S2.v.invalidate();
                            S2.t();
                        }
                        o5Var = S2;
                    }
                }
                if (o5Var != null && o5Var.getModel() != null && !o5Var.H.isEmpty()) {
                    d2Var4.P.G4(o5Var);
                    break;
                } else {
                    d2Var4.P.S1(d6.u(2, 2));
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
                a R22 = d2Var5.P.R2();
                if (R22 != null) {
                    TL_iv.PageBlock pageBlock = R22.b;
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
                dj0 dj0Var = d2Var7.O0;
                if (dj0Var != null) {
                    dj0Var.h(true);
                    d2Var7.O0 = null;
                    break;
                }
                break;
            case 11:
                d2 d2Var8 = this.b;
                d2Var8.P.R4();
                d2Var8.y0();
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
