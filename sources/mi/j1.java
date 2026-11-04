package mi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import j$.util.Objects;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fg;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ j1(c2 c2Var, int i3) {
        this.a = i3;
        this.b = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n5 U2;
        q5 q10;
        int i3 = this.a;
        int i10 = 2;
        final int i11 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final int i12 = 1;
        final c2 c2Var = this.b;
        switch (i3) {
            case 0:
                c2Var.w0();
                break;
            case 1:
                if (!c2Var.Q.I2()) {
                    c2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                g2 g2Var = c2Var.Q.R3;
                if (g2Var != null) {
                    g2Var.k();
                    break;
                }
                break;
            case 3:
                g2 g2Var2 = c2Var.Q.R3;
                if (g2Var2 != null) {
                    g2Var2.i();
                    break;
                }
                break;
            case 4:
                c2.Z(c2Var);
                break;
            case 5:
                c2 c2Var2 = this.b;
                if (!c2Var2.C0) {
                    if (c2Var2.B0 == null) {
                        ey eyVar = new ey(c2Var2, true, false, false, c2Var2.getParentActivity(), true, null, c2Var2.P, true, c2Var2.getResourceProvider(), false, false);
                        c2Var2.B0 = eyVar;
                        eyVar.setVisibility(8);
                        ey eyVar2 = c2Var2.B0;
                        eyVar2.y2 = false;
                        eyVar2.setDelegate(new t1(c2Var2));
                        int indexOfChild = c2Var2.P.indexOfChild(c2Var2.b0);
                        if (indexOfChild < 0) {
                            indexOfChild = c2Var2.P.getChildCount();
                        }
                        FrameLayout.LayoutParams e10 = mf.e(-1, c2Var2.o0(), 87);
                        e10.bottomMargin = c2Var2.U0;
                        c2Var2.P.addView(c2Var2.B0, indexOfChild, e10);
                    }
                    int o02 = c2Var2.o0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var2.B0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = mf.e(-1, o02, 87);
                    } else {
                        layoutParams.height = o02;
                    }
                    layoutParams.bottomMargin = c2Var2.U0;
                    c2Var2.B0.setLayoutParams(layoutParams);
                    c2Var2.B0.setVisibility(0);
                    c2Var2.C0 = true;
                    c2Var2.E0 = o02 + c2Var2.U0;
                    h1 S2 = c2Var2.Q.S2();
                    if (S2 != null) {
                        org.telegram.messenger.g0.v1(S2);
                    }
                    c2Var2.m0();
                    c2Var2.c0.j(fg.d, true);
                    break;
                } else {
                    c2Var2.p0(true);
                    h1 S22 = c2Var2.Q.S2();
                    if (S22 != null) {
                        S22.N();
                        org.telegram.messenger.g0.K3(S22);
                        break;
                    }
                }
                break;
            case 6:
                f60 f60Var = c2Var.y0;
                if (f60Var != null) {
                    f60Var.u();
                    c2Var.y0 = null;
                }
                final f60 H = f60.H(c2Var, view);
                H.Q = true;
                a T2 = c2Var.Q.T2();
                H.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, bd.M0(2131753999, null), new m1(c2Var, T2, 5));
                H.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, bd.M0(2131754005, null), new m1(c2Var, T2, 6));
                H.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, bd.M0(2131754002, null), new m1(c2Var, T2, 7));
                H.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, bd.M0(2131754004, null), new m1(c2Var, T2, 8));
                boolean z10 = T2 != null && (T2.b instanceof TL_iv.pageBlockDetails);
                String M0 = bd.M0(2131753987, null);
                t3 t3Var = c2Var.Q;
                Objects.requireNonNull(t3Var);
                H.j(z10, R.drawable.iv_details, null, M0, new b(t3Var, i12));
                boolean p22 = c2Var.Q.p2();
                boolean s22 = c2Var.Q.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(R.drawable.iv_list_tab, bd.M0(2131754013, null), new Runnable() { // from class: mi.p1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        c2Var.Q.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        c2Var.Q.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        H.c(R.drawable.iv_list_untab, bd.M0(2131753998, null), new Runnable() { // from class: mi.p1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        c2Var.Q.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        c2Var.Q.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                c2Var.y0 = H;
                break;
            case 7:
                f60 f60Var2 = c2Var.y0;
                if (f60Var2 != null) {
                    f60Var2.u();
                    c2Var.y0 = null;
                }
                t3 t3Var2 = c2Var.Q;
                n5 n5Var = t3Var2.q4;
                if (n5Var == null && (U2 = t3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = c2Var.Q.findFocus();
                    if ((findFocus instanceof h1) && (q10 = U2.q((h1) findFocus)) != null) {
                        pagetablecell = q10.b;
                    }
                    if (pagetablecell != null) {
                        c2Var.Q.j2(U2);
                        if (U2.I.add(pagetablecell)) {
                            U2.w.invalidate();
                            U2.v();
                        }
                        n5Var = U2;
                    }
                }
                if (n5Var != null && n5Var.getModel() != null && !n5Var.I.isEmpty()) {
                    c2Var.Q.I4(n5Var);
                    break;
                } else {
                    c2Var.Q.V1(b6.u(2, 2));
                    break;
                }
            case 8:
                f60 f60Var3 = c2Var.y0;
                if (f60Var3 != null) {
                    f60Var3.u();
                    c2Var.y0 = null;
                }
                a T22 = c2Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                p.Z(c2Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new f(i10, c2Var, pageblockmath), c2Var.getResourceProvider());
                break;
            case 9:
                c2Var.Q.j4 = null;
                c2Var.t0(90, 0);
                break;
            case 10:
                c2Var.w0();
                vf0 vf0Var = c2Var.P0;
                if (vf0Var != null) {
                    vf0Var.g(true);
                    c2Var.P0 = null;
                    break;
                }
                break;
            case 11:
                c2Var.Q.T4();
                c2Var.D0();
                break;
            case 12:
                c2Var.Q.c4(view);
                break;
            case 13:
                c2Var.Q.d4();
                break;
            case 14:
                c2Var.Q.a4();
                break;
            case 15:
                c2Var.Q.e4();
                break;
            default:
                c2Var.s0();
                break;
        }
    }
}
