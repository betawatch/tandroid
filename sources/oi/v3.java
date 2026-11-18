package oi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v3(x3 x3Var, int i7, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l5 U2;
        o5 q10;
        int i7 = this.a;
        int i10 = this.c;
        x3 x3Var = this.b;
        switch (i7) {
            case 0:
                x3Var.a.a.r.b4(i10);
                break;
            default:
                final o oVar = x3Var.a.a;
                i6 i6Var = oVar.a;
                s3 s3Var = oVar.r;
                a T2 = s3Var.T2();
                final int i11 = 0;
                final int i12 = 1;
                TL_iv.pageTableCell pagetablecell = null;
                r9 = null;
                TL_iv.pageBlockMath pageblockmath = null;
                pagetablecell = null;
                if (i10 == 1) {
                    int i13 = oVar.n;
                    y60 y60Var = oVar.I;
                    if (y60Var != null) {
                        y60Var.v();
                    }
                    y60 H = y60.H(oVar, i6Var, view, true);
                    H.T = true;
                    y60 K = H.K();
                    boolean z10 = (mp.u1(i13).B4() || j10.i(i13).q()) ? false : true;
                    K.c(R.drawable.ic_ab_back, gd.M0(2131753754, null), new bi.c6(H, 7), false);
                    K.k();
                    oVar.U(K, T2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, gd.M0(2131754028, null), bz.W0 + 2, H);
                    oVar.U(K, T2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, gd.M0(2131754027, null), bz.W0 + 1, H);
                    oVar.U(K, T2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, gd.M0(2131754026, null), bz.W0, H);
                    oVar.U(K, T2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, gd.M0(2131754025, null), bz.W0 - 1, H);
                    oVar.U(K, T2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, gd.M0(2131754024, null), bz.W0 - 2, H);
                    oVar.U(K, T2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, gd.M0(2131754023, null), bz.W0 - 3, H);
                    boolean z11 = T2 != null && s3.F3(T2.b);
                    x1 x1Var = new x1(oVar.getContext(), R.drawable.iv_h1);
                    x1Var.a(z10);
                    H.j(z11, 0, x1Var, gd.M0(2131754029, null), new bi.v5(H, K, 2));
                    H.j(T2 != null && (T2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, gd.M0(2131753986, null), new f(oVar, T2, 5));
                    H.j(T2 != null && (T2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, gd.M0(2131753994, null), new f(oVar, T2, 6));
                    boolean z12 = T2 != null && (T2.b instanceof TL_iv.pageBlockPullquote);
                    x1 x1Var2 = new x1(oVar.getContext(), R.drawable.iv_pullquote);
                    x1Var2.a(z10);
                    H.j(z12, 0, x1Var2, gd.M0(2131753995, null), new f(oVar, T2, 7));
                    H.j(T2 != null && (T2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, gd.M0(2131754053, null), new f(oVar, T2, 8));
                    boolean z13 = T2 != null && (T2.b instanceof TL_iv.pageBlockFooter);
                    x1 x1Var3 = new x1(oVar.getContext(), R.drawable.iv_footer);
                    x1Var3.a(z10);
                    H.j(z13, 0, x1Var3, gd.M0(2131754030, null), new f(oVar, T2, 9));
                    H.a0();
                    oVar.I = H;
                    break;
                } else if (i10 == 2) {
                    y60 y60Var2 = oVar.I;
                    if (y60Var2 != null) {
                        y60Var2.v();
                    }
                    final y60 G = y60.G(oVar, i6Var, view);
                    G.T = true;
                    G.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, gd.M0(2131753997, null), new f(oVar, T2, 1));
                    G.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, gd.M0(2131754004, null), new f(oVar, T2, 2));
                    G.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, gd.M0(2131754001, null), new f(oVar, T2, 3));
                    G.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, gd.M0(2131753999, null), new f(oVar, T2, 4));
                    G.j(T2 != null && (T2.b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, gd.M0(2131753985, null), new b(s3Var, 1));
                    boolean p22 = s3Var.p2();
                    boolean s22 = s3Var.s2();
                    if (p22 || s22) {
                        G.k();
                        if (p22) {
                            G.c(R.drawable.iv_list_tab, gd.M0(2131754011, null), new Runnable() { // from class: oi.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            oVar.r.u3(false);
                                            G.v();
                                            break;
                                        default:
                                            oVar.r.u3(true);
                                            G.v();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (s22) {
                            G.c(R.drawable.iv_list_untab, gd.M0(2131753996, null), new Runnable() { // from class: oi.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            oVar.r.u3(false);
                                            G.v();
                                            break;
                                        default:
                                            oVar.r.u3(true);
                                            G.v();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    G.X = true;
                    G.a0();
                    oVar.I = G;
                    break;
                } else if (i10 == 4) {
                    l5 l5Var = s3Var.q4;
                    if (l5Var == null && (U2 = s3Var.U2()) != null && U2.getModel() != null) {
                        View findFocus = s3Var.findFocus();
                        if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                            pagetablecell = q10.b;
                        }
                        if (pagetablecell != null) {
                            s3Var.j2(U2);
                            if (U2.I.add(pagetablecell)) {
                                U2.w.invalidate();
                                U2.v();
                            }
                            l5Var = U2;
                        }
                    }
                    if (l5Var != null && l5Var.getModel() != null && !l5Var.I.isEmpty()) {
                        s3Var.I4(l5Var);
                        break;
                    } else {
                        s3Var.V1(z5.u(2, 2));
                        break;
                    }
                } else if (i10 == 7) {
                    if (T2 != null) {
                        TL_iv.PageBlock pageBlock = T2.b;
                        if (pageBlock instanceof TL_iv.pageBlockMath) {
                            pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        }
                    }
                    o.Z(oVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new li.d(3, oVar, pageblockmath), i6Var);
                    break;
                } else if (i10 == 9) {
                    s3Var.w3();
                    break;
                }
                break;
        }
    }
}
