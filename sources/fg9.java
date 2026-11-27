// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg9 b;

    public /* synthetic */ fg9(yg9 yg9Var, byte b) {
        this.a = b;
        this.b = yg9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xl9 O2;
        am9 q;
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final yg9 yg9Var = this.b;
        switch (b) {
            case 0:
                yg9Var.n0();
                break;
            case 1:
                yg9Var.u0();
                break;
            case 2:
                if (!yg9Var.Q.C2()) {
                    yg9Var.finishFragment();
                    break;
                }
                break;
            case 3:
                ch9 ch9Var = yg9Var.Q.R3;
                if (ch9Var != null) {
                    ch9Var.k();
                    break;
                }
                break;
            case 4:
                ch9 ch9Var2 = yg9Var.Q.R3;
                if (ch9Var2 != null) {
                    ch9Var2.i();
                    break;
                }
                break;
            case 5:
                yg9Var.k0();
                break;
            case 6:
                yg9 yg9Var2 = this.b;
                if (!yg9Var2.C0) {
                    if (yg9Var2.B0 == null) {
                        o24 o24Var = new o24(yg9Var2, true, false, false, yg9Var2.getParentActivity(), true, null, yg9Var2.P, true, yg9Var2.getResourceProvider(), false, false);
                        yg9Var2.B0 = o24Var;
                        o24Var.setVisibility(8);
                        o24 o24Var2 = yg9Var2.B0;
                        o24Var2.x2 = false;
                        o24Var2.setDelegate(new qg9(yg9Var2));
                        int indexOfChild = yg9Var2.P.indexOfChild(yg9Var2.b0);
                        if (indexOfChild < 0) {
                            indexOfChild = yg9Var2.P.getChildCount();
                        }
                        FrameLayout.LayoutParams e = tre.e(-1, yg9Var2.f0(), 87);
                        e.bottomMargin = yg9Var2.U0;
                        yg9Var2.P.addView(yg9Var2.B0, indexOfChild, e);
                    }
                    int f0 = yg9Var2.f0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yg9Var2.B0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = tre.e(-1, f0, 87);
                    } else {
                        layoutParams.height = f0;
                    }
                    layoutParams.bottomMargin = yg9Var2.U0;
                    yg9Var2.B0.setLayoutParams(layoutParams);
                    yg9Var2.B0.setVisibility(0);
                    yg9Var2.C0 = true;
                    yg9Var2.E0 = f0 + yg9Var2.U0;
                    dg9 M2 = yg9Var2.Q.M2();
                    if (M2 != null) {
                        hl.t1(M2);
                    }
                    yg9Var2.d0();
                    yg9Var2.c0.j(gz1.d, true);
                    break;
                } else {
                    yg9Var2.g0(true);
                    dg9 M22 = yg9Var2.Q.M2();
                    if (M22 != null) {
                        M22.O();
                        hl.E3(M22);
                        break;
                    }
                }
                break;
            case 7:
                fu5 fu5Var = yg9Var.y0;
                if (fu5Var != null) {
                    fu5Var.u();
                    yg9Var.y0 = null;
                }
                final fu5 I = fu5.I(yg9Var, view);
                I.W = true;
                mk0 N2 = yg9Var.Q.N2();
                I.i(N2 == null || !N2.b(), R.drawable.field_carret_empty, null, ob6.M0(2131753992, null), new eg9(yg9Var, N2, (byte) 6));
                I.i((N2 == null || !N2.b() || N2.a() || N2.c()) ? false : true, R.drawable.iv_list, null, ob6.M0(2131753998, null), new eg9(yg9Var, N2, (byte) 7));
                I.i(N2 != null && N2.b() && !N2.a() && N2.c(), R.drawable.iv_ordered_list, null, ob6.M0(2131753995, null), new eg9(yg9Var, N2, (byte) 8));
                I.i(N2 != null && N2.b() && N2.a() && !N2.c(), R.drawable.iv_todo, null, ob6.M0(2131753997, null), new eg9(yg9Var, N2, (byte) 9));
                boolean z = N2 != null && (N2.b instanceof TL_iv.pageBlockDetails);
                String M0 = ob6.M0(2131753980, null);
                pi9 pi9Var = yg9Var.Q;
                Objects.requireNonNull(pi9Var);
                I.i(z, R.drawable.iv_details, null, M0, new m72(pi9Var, (byte) 1));
                boolean i2 = yg9Var.Q.i2();
                boolean l2 = yg9Var.Q.l2();
                if (i2 || l2) {
                    I.j();
                    if (i2) {
                        I.b(R.drawable.iv_list_tab, ob6.M0(2131754006, null), new Runnable() { // from class: mg9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b2;
                                fu5 fu5Var2 = I;
                                yg9 yg9Var3 = yg9Var;
                                switch (b4) {
                                    case 0:
                                        yg9Var3.Q.o3(false);
                                        fu5Var2.u();
                                        break;
                                    default:
                                        yg9Var3.Q.o3(true);
                                        fu5Var2.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (l2) {
                        I.b(R.drawable.iv_list_untab, ob6.M0(2131753991, null), new Runnable() { // from class: mg9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b3;
                                fu5 fu5Var2 = I;
                                yg9 yg9Var3 = yg9Var;
                                switch (b4) {
                                    case 0:
                                        yg9Var3.Q.o3(false);
                                        fu5Var2.u();
                                        break;
                                    default:
                                        yg9Var3.Q.o3(true);
                                        fu5Var2.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                I.a0 = true;
                I.a0();
                yg9Var.y0 = I;
                break;
            case 8:
                fu5 fu5Var2 = yg9Var.y0;
                if (fu5Var2 != null) {
                    fu5Var2.u();
                    yg9Var.y0 = null;
                }
                pi9 pi9Var2 = yg9Var.Q;
                xl9 xl9Var = pi9Var2.q4;
                if (xl9Var == null && (O2 = pi9Var2.O2()) != null && O2.getModel() != null) {
                    View findFocus = yg9Var.Q.findFocus();
                    if ((findFocus instanceof dg9) && (q = O2.q((dg9) findFocus)) != null) {
                        pagetablecell = q.b;
                    }
                    if (pagetablecell != null) {
                        yg9Var.Q.c2(O2);
                        if (O2.I.add(pagetablecell)) {
                            O2.w.invalidate();
                            O2.v();
                        }
                        xl9Var = O2;
                    }
                }
                if (xl9Var != null && xl9Var.getModel() != null && !xl9Var.I.isEmpty()) {
                    yg9Var.Q.I4(xl9Var);
                    break;
                } else {
                    yg9Var.Q.O1(km9.t(2, 2));
                    break;
                }
                break;
            case 9:
                fu5 fu5Var3 = yg9Var.y0;
                if (fu5Var3 != null) {
                    fu5Var3.u();
                    yg9Var.y0 = null;
                }
                mk0 N22 = yg9Var.Q.N2();
                if (N22 != null) {
                    TL_iv.PageBlock pageBlock = N22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                v72.W(yg9Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new v35(yg9Var, pageblockmath, (byte) 27), yg9Var.getResourceProvider());
                break;
            case 10:
                yg9Var.u0();
                q67 q67Var = yg9Var.P0;
                if (q67Var != null) {
                    q67Var.f(true);
                    yg9Var.P0 = null;
                    break;
                }
                break;
            case 11:
                yg9Var.Q.j4 = null;
                yg9Var.p0(90, 0);
                break;
            case 12:
                yg9Var.Q.U4();
                yg9Var.D0();
                break;
            case 13:
                yg9Var.Q.a4(view);
                break;
            case 14:
                yg9Var.Q.b4();
                break;
            case 15:
                yg9Var.Q.Y3();
                break;
            default:
                yg9Var.Q.c4();
                break;
        }
    }
}
