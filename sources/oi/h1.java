package oi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xg;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ h1(b2 b2Var, int i7) {
        this.a = i7;
        this.b = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m5 U2;
        p5 q10;
        int i7 = this.a;
        int i10 = 6;
        final int i11 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final int i12 = 1;
        final b2 b2Var = this.b;
        switch (i7) {
            case 0:
                b2Var.w0();
                break;
            case 1:
                if (!b2Var.Q.I2()) {
                    b2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                g2 g2Var = b2Var.Q.R3;
                if (g2Var != null) {
                    g2Var.k();
                    break;
                }
                break;
            case 3:
                g2 g2Var2 = b2Var.Q.R3;
                if (g2Var2 != null) {
                    g2Var2.i();
                    break;
                }
                break;
            case 4:
                b2.Z(b2Var);
                break;
            case 5:
                b2 b2Var2 = this.b;
                if (!b2Var2.C0) {
                    if (b2Var2.B0 == null) {
                        qy qyVar = new qy(b2Var2, true, false, false, b2Var2.getParentActivity(), true, null, b2Var2.P, true, b2Var2.getResourceProvider(), false, false);
                        b2Var2.B0 = qyVar;
                        qyVar.setVisibility(8);
                        qy qyVar2 = b2Var2.B0;
                        qyVar2.y2 = false;
                        qyVar2.setDelegate(new s1(b2Var2));
                        int indexOfChild = b2Var2.P.indexOfChild(b2Var2.b0);
                        if (indexOfChild < 0) {
                            indexOfChild = b2Var2.P.getChildCount();
                        }
                        FrameLayout.LayoutParams e10 = na.e(-1, b2Var2.o0(), 87);
                        e10.bottomMargin = b2Var2.U0;
                        b2Var2.P.addView(b2Var2.B0, indexOfChild, e10);
                    }
                    int o02 = b2Var2.o0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var2.B0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = na.e(-1, o02, 87);
                    } else {
                        layoutParams.height = o02;
                    }
                    layoutParams.bottomMargin = b2Var2.U0;
                    b2Var2.B0.setLayoutParams(layoutParams);
                    b2Var2.B0.setVisibility(0);
                    b2Var2.C0 = true;
                    b2Var2.E0 = o02 + b2Var2.U0;
                    f1 S2 = b2Var2.Q.S2();
                    if (S2 != null) {
                        org.telegram.messenger.g0.v1(S2);
                    }
                    b2Var2.m0();
                    b2Var2.c0.j(xg.d, true);
                    break;
                } else {
                    b2Var2.p0(true);
                    f1 S22 = b2Var2.Q.S2();
                    if (S22 != null) {
                        S22.O();
                        org.telegram.messenger.g0.I3(S22);
                        break;
                    }
                }
                break;
            case 6:
                x60 x60Var = b2Var.y0;
                if (x60Var != null) {
                    x60Var.v();
                    b2Var.y0 = null;
                }
                final x60 I = x60.I(b2Var, view);
                I.T = true;
                a T2 = b2Var.Q.T2();
                I.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, gd.N0(2131753996, null), new l1(b2Var, T2, 5));
                I.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, gd.N0(2131754002, null), new l1(b2Var, T2, 6));
                I.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, gd.N0(2131753999, null), new l1(b2Var, T2, 7));
                I.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, gd.N0(2131754001, null), new l1(b2Var, T2, 8));
                boolean z10 = T2 != null && (T2.b instanceof TL_iv.pageBlockDetails);
                String N0 = gd.N0(2131753984, null);
                t3 t3Var = b2Var.Q;
                Objects.requireNonNull(t3Var);
                I.j(z10, R.drawable.iv_details, null, N0, new b(t3Var, i12));
                boolean p22 = b2Var.Q.p2();
                boolean s22 = b2Var.Q.s2();
                if (p22 || s22) {
                    I.k();
                    if (p22) {
                        I.c(R.drawable.iv_list_tab, gd.N0(2131754010, null), new Runnable() { // from class: oi.o1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        b2Var.Q.u3(false);
                                        I.v();
                                        break;
                                    default:
                                        b2Var.Q.u3(true);
                                        I.v();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        I.c(R.drawable.iv_list_untab, gd.N0(2131753995, null), new Runnable() { // from class: oi.o1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        b2Var.Q.u3(false);
                                        I.v();
                                        break;
                                    default:
                                        b2Var.Q.u3(true);
                                        I.v();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                b2Var.y0 = I;
                break;
            case 7:
                x60 x60Var2 = b2Var.y0;
                if (x60Var2 != null) {
                    x60Var2.v();
                    b2Var.y0 = null;
                }
                t3 t3Var2 = b2Var.Q;
                m5 m5Var = t3Var2.q4;
                if (m5Var == null && (U2 = t3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = b2Var.Q.findFocus();
                    if ((findFocus instanceof f1) && (q10 = U2.q((f1) findFocus)) != null) {
                        pagetablecell = q10.b;
                    }
                    if (pagetablecell != null) {
                        b2Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.w.invalidate();
                            U2.v();
                        }
                        m5Var = U2;
                    }
                }
                if (m5Var != null && m5Var.getModel() != null && !m5Var.I.isEmpty()) {
                    b2Var.Q.I4(m5Var);
                    break;
                } else {
                    b2Var.Q.V1(a6.u(2, 2));
                    break;
                }
            case 8:
                x60 x60Var3 = b2Var.y0;
                if (x60Var3 != null) {
                    x60Var3.v();
                    b2Var.y0 = null;
                }
                a T22 = b2Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                p.Z(b2Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ki.n2(i10, b2Var, pageblockmath), b2Var.getResourceProvider());
                break;
            case 9:
                b2Var.Q.j4 = null;
                b2Var.t0(90, 0);
                break;
            case 10:
                b2Var.w0();
                dg0 dg0Var = b2Var.P0;
                if (dg0Var != null) {
                    dg0Var.h(true);
                    b2Var.P0 = null;
                    break;
                }
                break;
            case 11:
                b2Var.Q.T4();
                b2Var.D0();
                break;
            case 12:
                b2Var.Q.c4(view);
                break;
            case 13:
                b2Var.Q.d4();
                break;
            case 14:
                b2Var.Q.a4();
                break;
            case 15:
                b2Var.Q.e4();
                break;
            default:
                b2Var.s0();
                break;
        }
    }
}
