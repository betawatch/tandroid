package ki;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yg;
import org.telegram.ui.oi0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        o5 S2;
        r5 o10;
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
                h2 h2Var = this.b.P.H3;
                if (h2Var != null) {
                    h2Var.k();
                    break;
                }
                break;
            case 3:
                h2 h2Var2 = this.b.P.H3;
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
                        tzVar2.w2 = false;
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
                    h1 Q2 = d2Var2.P.Q2();
                    if (Q2 != null) {
                        AndroidUtilities.hideKeyboard(Q2);
                    }
                    d2Var2.h0();
                    d2Var2.b0.j(yg.d, true);
                    break;
                } else {
                    d2Var2.k0(true);
                    h1 Q22 = d2Var2.P.Q2();
                    if (Q22 != null) {
                        Q22.r();
                        AndroidUtilities.showKeyboard(Q22);
                        break;
                    }
                }
                break;
            case 6:
                final d2 d2Var3 = this.b;
                i80 i80Var = d2Var3.x0;
                if (i80Var != null) {
                    i80Var.u();
                    d2Var3.x0 = null;
                }
                final i80 H = i80.H(d2Var3, view);
                H.Q = true;
                a R2 = d2Var3.P.R2();
                H.j(R2 == null || !R2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new m1(d2Var3, R2, 5));
                H.j((R2 == null || !R2.b() || R2.a() || R2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new m1(d2Var3, R2, 6));
                H.j(R2 != null && R2.b() && !R2.a() && R2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new m1(d2Var3, R2, 7));
                H.j(R2 != null && R2.b() && R2.a() && !R2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new m1(d2Var3, R2, 8));
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
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() { // from class: ki.p1
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
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() { // from class: ki.p1
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
                i80 i80Var2 = d2Var4.x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (i80Var2 != null) {
                    i80Var2.u();
                    d2Var4.x0 = null;
                }
                w3 w3Var2 = d2Var4.P;
                o5 o5Var = w3Var2.g4;
                if (o5Var == null && (S2 = w3Var2.S2()) != null && S2.getModel() != null) {
                    View findFocus = d2Var4.P.findFocus();
                    if ((findFocus instanceof h1) && (o10 = S2.o((h1) findFocus)) != null) {
                        pagetablecell = o10.b;
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
                    d2Var4.P.S1(c6.u(2, 2));
                    break;
                }
                break;
            case 8:
                d2 d2Var5 = this.b;
                i80 i80Var3 = d2Var5.x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (i80Var3 != null) {
                    i80Var3.u();
                    d2Var5.x0 = null;
                }
                a R22 = d2Var5.P.R2();
                if (R22 != null) {
                    TL_iv.PageBlock pageBlock = R22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                q.X(d2Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.n2(27, d2Var5, pageblockmath), d2Var5.getResourceProvider());
                break;
            case 9:
                d2 d2Var6 = this.b;
                d2Var6.P.Z3 = null;
                d2Var6.o0(90, 0);
                break;
            case 10:
                d2 d2Var7 = this.b;
                d2Var7.r0();
                oi0 oi0Var = d2Var7.O0;
                if (oi0Var != null) {
                    oi0Var.h(true);
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
