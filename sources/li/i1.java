package li;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.k60;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ i1(b2 b2Var, int i7) {
        this.a = i7;
        this.b = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m5 U2;
        p5 q10;
        int i7 = this.a;
        final int i10 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r5 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final int i11 = 1;
        final b2 b2Var = this.b;
        switch (i7) {
            case 0:
                b2Var.w0();
                break;
            case 1:
                if (!b2Var.P.I2()) {
                    b2Var.finishFragment();
                    break;
                }
                break;
            case 2:
                f2 f2Var = b2Var.P.Q3;
                if (f2Var != null) {
                    f2Var.k();
                    break;
                }
                break;
            case 3:
                f2 f2Var2 = b2Var.P.Q3;
                if (f2Var2 != null) {
                    f2Var2.i();
                    break;
                }
                break;
            case 4:
                b2.Z(b2Var);
                break;
            case 5:
                b2 b2Var2 = this.b;
                if (!b2Var2.B0) {
                    if (b2Var2.A0 == null) {
                        gy gyVar = new gy(b2Var2, true, false, false, b2Var2.getParentActivity(), true, null, b2Var2.O, true, b2Var2.getResourceProvider(), false, false);
                        b2Var2.A0 = gyVar;
                        gyVar.setVisibility(8);
                        gy gyVar2 = b2Var2.A0;
                        gyVar2.x2 = false;
                        gyVar2.setDelegate(new s1(b2Var2));
                        int indexOfChild = b2Var2.O.indexOfChild(b2Var2.a0);
                        if (indexOfChild < 0) {
                            indexOfChild = b2Var2.O.getChildCount();
                        }
                        FrameLayout.LayoutParams e10 = ha.e(-1, b2Var2.o0(), 87);
                        e10.bottomMargin = b2Var2.T0;
                        b2Var2.O.addView(b2Var2.A0, indexOfChild, e10);
                    }
                    int o02 = b2Var2.o0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var2.A0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = ha.e(-1, o02, 87);
                    } else {
                        layoutParams.height = o02;
                    }
                    layoutParams.bottomMargin = b2Var2.T0;
                    b2Var2.A0.setLayoutParams(layoutParams);
                    b2Var2.A0.setVisibility(0);
                    b2Var2.B0 = true;
                    b2Var2.D0 = o02 + b2Var2.T0;
                    g1 S2 = b2Var2.P.S2();
                    if (S2 != null) {
                        org.telegram.messenger.g0.v1(S2);
                    }
                    b2Var2.m0();
                    b2Var2.b0.j(hg.d, true);
                    break;
                } else {
                    b2Var2.p0(true);
                    g1 S22 = b2Var2.P.S2();
                    if (S22 != null) {
                        S22.N();
                        org.telegram.messenger.g0.K3(S22);
                        break;
                    }
                }
                break;
            case 6:
                k60 k60Var = b2Var.x0;
                if (k60Var != null) {
                    k60Var.u();
                    b2Var.x0 = null;
                }
                final k60 H = k60.H(b2Var, view);
                H.Q = true;
                a T2 = b2Var.P.T2();
                H.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, hd.M0(2131753999, null), new l1(b2Var, T2, 5));
                H.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, hd.M0(2131754005, null), new l1(b2Var, T2, 6));
                H.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, hd.M0(2131754002, null), new l1(b2Var, T2, 7));
                H.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, hd.M0(2131754004, null), new l1(b2Var, T2, 8));
                boolean z9 = T2 != null && (T2.b instanceof TL_iv.pageBlockDetails);
                String M0 = hd.M0(2131753987, null);
                t3 t3Var = b2Var.P;
                Objects.requireNonNull(t3Var);
                H.j(z9, R.drawable.iv_details, null, M0, new b(t3Var, i11));
                boolean p22 = b2Var.P.p2();
                boolean s22 = b2Var.P.s2();
                if (p22 || s22) {
                    H.k();
                    if (p22) {
                        H.c(R.drawable.iv_list_tab, hd.M0(2131754013, null), new Runnable() { // from class: li.o1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        b2Var.P.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        b2Var.P.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        H.c(R.drawable.iv_list_untab, hd.M0(2131753998, null), new Runnable() { // from class: li.o1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        b2Var.P.u3(false);
                                        H.u();
                                        break;
                                    default:
                                        b2Var.P.u3(true);
                                        H.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                b2Var.x0 = H;
                break;
            case 7:
                k60 k60Var2 = b2Var.x0;
                if (k60Var2 != null) {
                    k60Var2.u();
                    b2Var.x0 = null;
                }
                t3 t3Var2 = b2Var.P;
                m5 m5Var = t3Var2.p4;
                if (m5Var == null && (U2 = t3Var2.U2()) != null && U2.getModel() != null) {
                    View findFocus = b2Var.P.findFocus();
                    if ((findFocus instanceof g1) && (q10 = U2.q((g1) findFocus)) != null) {
                        pagetablecell = q10.b;
                    }
                    if (pagetablecell != null) {
                        b2Var.P.j2(U2);
                        if (U2.H.add(pagetablecell)) {
                            U2.w.invalidate();
                            U2.v();
                        }
                        m5Var = U2;
                    }
                }
                if (m5Var != null && m5Var.getModel() != null && !m5Var.H.isEmpty()) {
                    b2Var.P.I4(m5Var);
                    break;
                } else {
                    b2Var.P.V1(a6.u(2, 2));
                    break;
                }
            case 8:
                k60 k60Var3 = b2Var.x0;
                if (k60Var3 != null) {
                    k60Var3.u();
                    b2Var.x0 = null;
                }
                a T22 = b2Var.P.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                p.Z(b2Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ai.f1(28, b2Var, pageblockmath), b2Var.getResourceProvider());
                break;
            case 9:
                b2Var.P.i4 = null;
                b2Var.t0(90, 0);
                break;
            case 10:
                b2Var.w0();
                bg0 bg0Var = b2Var.O0;
                if (bg0Var != null) {
                    bg0Var.g(true);
                    b2Var.O0 = null;
                    break;
                }
                break;
            case 11:
                b2Var.P.T4();
                b2Var.D0();
                break;
            case 12:
                b2Var.P.c4(view);
                break;
            case 13:
                b2Var.P.d4();
                break;
            case 14:
                b2Var.P.a4();
                break;
            case 15:
                b2Var.P.e4();
                break;
            default:
                b2Var.s0();
                break;
        }
    }
}
