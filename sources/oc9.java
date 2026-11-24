// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd9 b;

    public /* synthetic */ oc9(hd9 hd9Var, byte b) {
        this.a = b;
        this.b = hd9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ii9 N2;
        li9 q;
        byte b = this.a;
        final byte b2 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final byte b3 = 1;
        final hd9 hd9Var = this.b;
        switch (b) {
            case 0:
                hd9Var.u0();
                break;
            case 1:
                if (!hd9Var.Q.B2()) {
                    hd9Var.finishFragment();
                    break;
                }
                break;
            case 2:
                ld9 ld9Var = hd9Var.Q.R3;
                if (ld9Var != null) {
                    ld9Var.k();
                    break;
                }
                break;
            case 3:
                ld9 ld9Var2 = hd9Var.Q.R3;
                if (ld9Var2 != null) {
                    ld9Var2.i();
                    break;
                }
                break;
            case 4:
                hd9Var.k0();
                break;
            case 5:
                hd9 hd9Var2 = this.b;
                if (!hd9Var2.C0) {
                    if (hd9Var2.B0 == null) {
                        t14 t14Var = new t14(hd9Var2, true, false, false, hd9Var2.getParentActivity(), true, null, hd9Var2.P, true, hd9Var2.getResourceProvider(), false, false);
                        hd9Var2.B0 = t14Var;
                        t14Var.setVisibility(8);
                        t14 t14Var2 = hd9Var2.B0;
                        t14Var2.x2 = false;
                        t14Var2.setDelegate(new zc9(hd9Var2));
                        int indexOfChild = hd9Var2.P.indexOfChild(hd9Var2.b0);
                        if (indexOfChild < 0) {
                            indexOfChild = hd9Var2.P.getChildCount();
                        }
                        FrameLayout.LayoutParams e = nme.e(-1, hd9Var2.f0(), 87);
                        e.bottomMargin = hd9Var2.U0;
                        hd9Var2.P.addView(hd9Var2.B0, indexOfChild, e);
                    }
                    int f0 = hd9Var2.f0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hd9Var2.B0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = nme.e(-1, f0, 87);
                    } else {
                        layoutParams.height = f0;
                    }
                    layoutParams.bottomMargin = hd9Var2.U0;
                    hd9Var2.B0.setLayoutParams(layoutParams);
                    hd9Var2.B0.setVisibility(0);
                    hd9Var2.C0 = true;
                    hd9Var2.E0 = f0 + hd9Var2.U0;
                    mc9 L2 = hd9Var2.Q.L2();
                    if (L2 != null) {
                        gl.t1(L2);
                    }
                    hd9Var2.d0();
                    hd9Var2.c0.j(oy1.d, true);
                    break;
                } else {
                    hd9Var2.g0(true);
                    mc9 L22 = hd9Var2.Q.L2();
                    if (L22 != null) {
                        L22.O();
                        gl.E3(L22);
                        break;
                    }
                }
                break;
            case 6:
                cs5 cs5Var = hd9Var.y0;
                if (cs5Var != null) {
                    cs5Var.u();
                    hd9Var.y0 = null;
                }
                final cs5 I = cs5.I(hd9Var, view);
                I.T = true;
                lk0 M2 = hd9Var.Q.M2();
                I.i(M2 == null || !M2.b(), R.drawable.field_carret_empty, null, k96.M0(2131753996, null), new sc9(hd9Var, M2, (byte) 5));
                I.i((M2 == null || !M2.b() || M2.a() || M2.c()) ? false : true, R.drawable.iv_list, null, k96.M0(2131754002, null), new sc9(hd9Var, M2, (byte) 6));
                I.i(M2 != null && M2.b() && !M2.a() && M2.c(), R.drawable.iv_ordered_list, null, k96.M0(2131753999, null), new sc9(hd9Var, M2, (byte) 7));
                I.i(M2 != null && M2.b() && M2.a() && !M2.c(), R.drawable.iv_todo, null, k96.M0(2131754001, null), new sc9(hd9Var, M2, (byte) 8));
                boolean z = M2 != null && (M2.b instanceof TL_iv.pageBlockDetails);
                String M0 = k96.M0(2131753984, null);
                ye9 ye9Var = hd9Var.Q;
                Objects.requireNonNull(ye9Var);
                I.i(z, R.drawable.iv_details, null, M0, new q62(ye9Var, (byte) 1));
                boolean h2 = hd9Var.Q.h2();
                boolean k2 = hd9Var.Q.k2();
                if (h2 || k2) {
                    I.j();
                    if (h2) {
                        I.b(R.drawable.iv_list_tab, k96.M0(2131754010, null), new Runnable() { // from class: vc9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b2;
                                cs5 cs5Var2 = I;
                                hd9 hd9Var3 = hd9Var;
                                switch (b4) {
                                    case 0:
                                        hd9Var3.Q.n3(false);
                                        cs5Var2.u();
                                        break;
                                    default:
                                        hd9Var3.Q.n3(true);
                                        cs5Var2.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (k2) {
                        I.b(R.drawable.iv_list_untab, k96.M0(2131753995, null), new Runnable() { // from class: vc9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b4 = b3;
                                cs5 cs5Var2 = I;
                                hd9 hd9Var3 = hd9Var;
                                switch (b4) {
                                    case 0:
                                        hd9Var3.Q.n3(false);
                                        cs5Var2.u();
                                        break;
                                    default:
                                        hd9Var3.Q.n3(true);
                                        cs5Var2.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                hd9Var.y0 = I;
                break;
            case 7:
                cs5 cs5Var2 = hd9Var.y0;
                if (cs5Var2 != null) {
                    cs5Var2.u();
                    hd9Var.y0 = null;
                }
                ye9 ye9Var2 = hd9Var.Q;
                ii9 ii9Var = ye9Var2.q4;
                if (ii9Var == null && (N2 = ye9Var2.N2()) != null && N2.getModel() != null) {
                    View findFocus = hd9Var.Q.findFocus();
                    if ((findFocus instanceof mc9) && (q = N2.q((mc9) findFocus)) != null) {
                        pagetablecell = q.b;
                    }
                    if (pagetablecell != null) {
                        hd9Var.Q.b2(N2);
                        if (N2.I.add(pagetablecell)) {
                            N2.w.invalidate();
                            N2.v();
                        }
                        ii9Var = N2;
                    }
                }
                if (ii9Var != null && ii9Var.getModel() != null && !ii9Var.I.isEmpty()) {
                    hd9Var.Q.H4(ii9Var);
                    break;
                } else {
                    hd9Var.Q.N1(wi9.t(2, 2));
                    break;
                }
                break;
            case 8:
                cs5 cs5Var3 = hd9Var.y0;
                if (cs5Var3 != null) {
                    cs5Var3.u();
                    hd9Var.y0 = null;
                }
                lk0 M22 = hd9Var.Q.M2();
                if (M22 != null) {
                    TL_iv.PageBlock pageBlock = M22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                e72.X(hd9Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new x15(hd9Var, pageblockmath, (byte) 26), hd9Var.getResourceProvider());
                break;
            case 9:
                hd9Var.Q.j4 = null;
                hd9Var.p0(90, 0);
                break;
            case 10:
                hd9Var.u0();
                j47 j47Var = hd9Var.P0;
                if (j47Var != null) {
                    j47Var.f(true);
                    hd9Var.P0 = null;
                    break;
                }
                break;
            case 11:
                hd9Var.Q.T4();
                hd9Var.C0();
                break;
            case 12:
                hd9Var.Q.Z3(view);
                break;
            case 13:
                hd9Var.Q.a4();
                break;
            case 14:
                hd9Var.Q.X3();
                break;
            case 15:
                hd9Var.Q.b4();
                break;
            default:
                hd9Var.n0();
                break;
        }
    }
}
