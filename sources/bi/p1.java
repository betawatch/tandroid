package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.z60;
import org.telegram.ui.kh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ p1(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z5 U2;
        c6 q6;
        int i10 = this.a;
        int i11 = 5;
        final int i12 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final int i13 = 1;
        final k2 k2Var = this.b;
        switch (i10) {
            case 0:
                k2Var.v0();
                break;
            case 1:
                if (!k2Var.P.I2()) {
                    k2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                o2 o2Var = k2Var.P.Q3;
                if (o2Var != null) {
                    o2Var.k();
                    break;
                }
                break;
            case 3:
                o2 o2Var2 = k2Var.P.Q3;
                if (o2Var2 != null) {
                    o2Var2.i();
                    break;
                }
                break;
            case 4:
                k2.Y(k2Var);
                break;
            case 5:
                k2 k2Var2 = this.b;
                if (!k2Var2.B0) {
                    if (k2Var2.A0 == null) {
                        vy vyVar = new vy(k2Var2, true, false, false, k2Var2.getParentActivity(), true, null, k2Var2.O, true, k2Var2.getResourceProvider(), false, false);
                        k2Var2.A0 = vyVar;
                        vyVar.setVisibility(8);
                        vy vyVar2 = k2Var2.A0;
                        vyVar2.x2 = false;
                        vyVar2.setDelegate(new a2(k2Var2));
                        int indexOfChild = k2Var2.O.indexOfChild(k2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = k2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e = w7.b6.e(-1, k2Var2.n0(), 87);
                        e.bottomMargin = k2Var2.T0;
                        k2Var2.O.addView(k2Var2.A0, indexOfChild, e);
                    }
                    int n02 = k2Var2.n0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = w7.b6.e(-1, n02, 87);
                    } else {
                        layoutParams.height = n02;
                    }
                    layoutParams.bottomMargin = k2Var2.T0;
                    k2Var2.A0.setLayoutParams(layoutParams);
                    k2Var2.A0.setVisibility(0);
                    k2Var2.B0 = true;
                    k2Var2.D0 = n02 + k2Var2.T0;
                    n1 S2 = k2Var2.P.S2();
                    if (S2 != null) {
                        org.telegram.messenger.i0.v1(S2);
                    }
                    k2Var2.l0();
                    k2Var2.b0.j(dg.d, true);
                    break;
                } else {
                    k2Var2.o0(true);
                    n1 S22 = k2Var2.P.S2();
                    if (S22 != null) {
                        S22.N();
                        org.telegram.messenger.i0.J3(S22);
                        break;
                    }
                }
                break;
            case 6:
                z60 z60Var = k2Var.x0;
                if (z60Var != null) {
                    z60Var.u();
                    k2Var.x0 = null;
                }
                final z60 H = z60.H(k2Var, view);
                H.Q = true;
                a T2 = k2Var.P.T2();
                H.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, cd.L0(2131753999, null), new t1(k2Var, T2, 5));
                H.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, cd.L0(2131754005, null), new t1(k2Var, T2, 6));
                H.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, cd.L0(2131754002, null), new t1(k2Var, T2, 7));
                H.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, cd.L0(2131754004, null), new t1(k2Var, T2, 8));
                boolean z10 = T2 != null && (T2.b instanceof TL_iv.pageBlockDetails);
                String L0 = cd.L0(2131753987, null);
                d4 d4Var = k2Var.P;
                Objects.requireNonNull(d4Var);
                H.j(z10, R.drawable.iv_details, null, L0, new b(d4Var, i13));
                boolean p22 = k2Var.P.p2();
                boolean s22 = k2Var.P.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(R.drawable.iv_list_tab, cd.L0(2131754013, null), new Runnable() { // from class: bi.w1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        k2Var.P.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        k2Var.P.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        H.c(R.drawable.iv_list_untab, cd.L0(2131753998, null), new Runnable() { // from class: bi.w1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        k2Var.P.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        k2Var.P.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                k2Var.x0 = H;
                break;
            case 7:
                z60 z60Var2 = k2Var.x0;
                if (z60Var2 != null) {
                    z60Var2.u();
                    k2Var.x0 = null;
                }
                d4 d4Var2 = k2Var.P;
                z5 z5Var = d4Var2.p4;
                if (z5Var == null && (U2 = d4Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = k2Var.P.findFocus();
                    if ((findFocus instanceof n1) && (q6 = U2.q((n1) findFocus)) != null) {
                        pagetablecell = q6.b;
                    }
                    if (pagetablecell != null) {
                        k2Var.P.j2(U2);
                        if (U2.H.add(pagetablecell)) {
                            U2.w.invalidate();
                            U2.v();
                        }
                        z5Var = U2;
                    }
                }
                if (z5Var != null && z5Var.getModel() != null && !z5Var.H.isEmpty()) {
                    k2Var.P.I4(z5Var);
                    break;
                } else {
                    k2Var.P.U1(q6.u(2, 2));
                    break;
                }
            case 8:
                z60 z60Var3 = k2Var.x0;
                if (z60Var3 != null) {
                    z60Var3.u();
                    k2Var.x0 = null;
                }
                a T22 = k2Var.P.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                t.X(k2Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ag.e0(i11, k2Var, pageblockmath), k2Var.getResourceProvider());
                break;
            case 9:
                k2Var.P.i4 = null;
                k2Var.s0(90, 0);
                break;
            case 10:
                k2Var.v0();
                kh0 kh0Var = k2Var.O0;
                if (kh0Var != null) {
                    kh0Var.g(true);
                    k2Var.O0 = null;
                    break;
                }
                break;
            case 11:
                k2Var.P.T4();
                k2Var.C0();
                break;
            case 12:
                k2Var.P.c4(view);
                break;
            case 13:
                k2Var.P.d4();
                break;
            case 14:
                k2Var.P.a4();
                break;
            case 15:
                k2Var.P.e4();
                break;
            default:
                k2Var.r0();
                break;
        }
    }
}
