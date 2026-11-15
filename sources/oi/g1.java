package oi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ng;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ g1(z1 z1Var, int i7) {
        this.a = i7;
        this.b = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k5 U2;
        n5 q10;
        int i7 = this.a;
        final int i10 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final int i11 = 1;
        final z1 z1Var = this.b;
        switch (i7) {
            case 0:
                z1Var.w0();
                break;
            case 1:
                if (!z1Var.Q.I2()) {
                    z1Var.finishFragment();
                    break;
                }
                break;
            case 2:
                d2 d2Var = z1Var.Q.R3;
                if (d2Var != null) {
                    d2Var.k();
                    break;
                }
                break;
            case 3:
                d2 d2Var2 = z1Var.Q.R3;
                if (d2Var2 != null) {
                    d2Var2.i();
                    break;
                }
                break;
            case 4:
                z1.Z(z1Var);
                break;
            case 5:
                z1 z1Var2 = this.b;
                if (!z1Var2.C0) {
                    if (z1Var2.B0 == null) {
                        ly lyVar = new ly(z1Var2, true, false, false, z1Var2.getParentActivity(), true, null, z1Var2.P, true, z1Var2.getResourceProvider(), false, false);
                        z1Var2.B0 = lyVar;
                        lyVar.setVisibility(8);
                        ly lyVar2 = z1Var2.B0;
                        lyVar2.y2 = false;
                        lyVar2.setDelegate(new q1(z1Var2));
                        int indexOfChild = z1Var2.P.indexOfChild(z1Var2.b0);
                        if (indexOfChild < 0) {
                            indexOfChild = z1Var2.P.getChildCount();
                        }
                        FrameLayout.LayoutParams e10 = ja.e(-1, z1Var2.o0(), 87);
                        e10.bottomMargin = z1Var2.U0;
                        z1Var2.P.addView(z1Var2.B0, indexOfChild, e10);
                    }
                    int o02 = z1Var2.o0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var2.B0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = ja.e(-1, o02, 87);
                    } else {
                        layoutParams.height = o02;
                    }
                    layoutParams.bottomMargin = z1Var2.U0;
                    z1Var2.B0.setLayoutParams(layoutParams);
                    z1Var2.B0.setVisibility(0);
                    z1Var2.C0 = true;
                    z1Var2.E0 = o02 + z1Var2.U0;
                    e1 S2 = z1Var2.Q.S2();
                    if (S2 != null) {
                        org.telegram.messenger.g0.v1(S2);
                    }
                    z1Var2.m0();
                    z1Var2.c0.j(ng.d, true);
                    break;
                } else {
                    z1Var2.p0(true);
                    e1 S22 = z1Var2.Q.S2();
                    if (S22 != null) {
                        S22.O();
                        org.telegram.messenger.g0.J3(S22);
                        break;
                    }
                }
                break;
            case 6:
                m60 m60Var = z1Var.y0;
                if (m60Var != null) {
                    m60Var.u();
                    z1Var.y0 = null;
                }
                final m60 H = m60.H(z1Var, view);
                H.Q = true;
                a T2 = z1Var.Q.T2();
                H.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, hd.M0(2131753999, null), new j1(z1Var, T2, 5));
                H.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, hd.M0(2131754005, null), new j1(z1Var, T2, 6));
                H.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, hd.M0(2131754002, null), new j1(z1Var, T2, 7));
                H.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, hd.M0(2131754004, null), new j1(z1Var, T2, 8));
                boolean z10 = T2 != null && (T2.b instanceof TL_iv.pageBlockDetails);
                String M0 = hd.M0(2131753987, null);
                q3 q3Var = z1Var.Q;
                Objects.requireNonNull(q3Var);
                H.j(z10, R.drawable.iv_details, null, M0, new b(q3Var, i11));
                boolean p22 = z1Var.Q.p2();
                boolean s22 = z1Var.Q.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(R.drawable.iv_list_tab, hd.M0(2131754013, null), new Runnable() { // from class: oi.m1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        z1Var.Q.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        H.c(R.drawable.iv_list_untab, hd.M0(2131753998, null), new Runnable() { // from class: oi.m1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        z1Var.Q.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                z1Var.y0 = H;
                break;
            case 7:
                m60 m60Var2 = z1Var.y0;
                if (m60Var2 != null) {
                    m60Var2.u();
                    z1Var.y0 = null;
                }
                q3 q3Var2 = z1Var.Q;
                k5 k5Var = q3Var2.q4;
                if (k5Var == null && (U2 = q3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = z1Var.Q.findFocus();
                    if ((findFocus instanceof e1) && (q10 = U2.q((e1) findFocus)) != null) {
                        pagetablecell = q10.b;
                    }
                    if (pagetablecell != null) {
                        z1Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.w.invalidate();
                            U2.v();
                        }
                        k5Var = U2;
                    }
                }
                if (k5Var != null && k5Var.getModel() != null && !k5Var.I.isEmpty()) {
                    z1Var.Q.I4(k5Var);
                    break;
                } else {
                    z1Var.Q.V1(y5.u(2, 2));
                    break;
                }
            case 8:
                m60 m60Var3 = z1Var.y0;
                if (m60Var3 != null) {
                    m60Var3.u();
                    z1Var.y0 = null;
                }
                a T22 = z1Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                o.Z(z1Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new li.v(3, z1Var, pageblockmath), z1Var.getResourceProvider());
                break;
            case 9:
                z1Var.Q.j4 = null;
                z1Var.t0(90, 0);
                break;
            case 10:
                z1Var.w0();
                bg0 bg0Var = z1Var.P0;
                if (bg0Var != null) {
                    bg0Var.h(true);
                    z1Var.P0 = null;
                    break;
                }
                break;
            case 11:
                z1Var.Q.T4();
                z1Var.D0();
                break;
            case 12:
                z1Var.Q.c4(view);
                break;
            case 13:
                z1Var.Q.d4();
                break;
            case 14:
                z1Var.Q.a4();
                break;
            case 15:
                z1Var.Q.e4();
                break;
            default:
                z1Var.s0();
                break;
        }
    }
}
