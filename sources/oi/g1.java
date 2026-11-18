package oi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.y60;
import org.telegram.ui.fg0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        l5 U2;
        o5 q10;
        int i7 = this.a;
        int i10 = 5;
        final int i11 = 0;
        TL_iv.pageTableCell pagetablecell = null;
        r6 = null;
        TL_iv.pageBlockMath pageblockmath = null;
        pagetablecell = null;
        final int i12 = 1;
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
                e2 e2Var = z1Var.Q.R3;
                if (e2Var != null) {
                    e2Var.k();
                    break;
                }
                break;
            case 3:
                e2 e2Var2 = z1Var.Q.R3;
                if (e2Var2 != null) {
                    e2Var2.i();
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
                        ry ryVar = new ry(z1Var2, true, false, false, z1Var2.getParentActivity(), true, null, z1Var2.P, true, z1Var2.getResourceProvider(), false, false);
                        z1Var2.B0 = ryVar;
                        ryVar.setVisibility(8);
                        ry ryVar2 = z1Var2.B0;
                        ryVar2.y2 = false;
                        ryVar2.setDelegate(new q1(z1Var2));
                        int indexOfChild = z1Var2.P.indexOfChild(z1Var2.b0);
                        if (indexOfChild < 0) {
                            indexOfChild = z1Var2.P.getChildCount();
                        }
                        FrameLayout.LayoutParams e10 = ma.e(-1, z1Var2.o0(), 87);
                        e10.bottomMargin = z1Var2.U0;
                        z1Var2.P.addView(z1Var2.B0, indexOfChild, e10);
                    }
                    int o02 = z1Var2.o0();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var2.B0.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = ma.e(-1, o02, 87);
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
                    z1Var2.c0.j(wg.d, true);
                    break;
                } else {
                    z1Var2.p0(true);
                    e1 S22 = z1Var2.Q.S2();
                    if (S22 != null) {
                        S22.O();
                        org.telegram.messenger.g0.I3(S22);
                        break;
                    }
                }
                break;
            case 6:
                y60 y60Var = z1Var.y0;
                if (y60Var != null) {
                    y60Var.v();
                    z1Var.y0 = null;
                }
                final y60 I = y60.I(z1Var, view);
                I.T = true;
                a T2 = z1Var.Q.T2();
                I.j(T2 == null || !T2.b(), R.drawable.field_carret_empty, null, gd.M0(2131753997, null), new j1(z1Var, T2, 5));
                I.j((T2 == null || !T2.b() || T2.a() || T2.c()) ? false : true, R.drawable.iv_list, null, gd.M0(2131754003, null), new j1(z1Var, T2, 6));
                I.j(T2 != null && T2.b() && !T2.a() && T2.c(), R.drawable.iv_ordered_list, null, gd.M0(2131754000, null), new j1(z1Var, T2, 7));
                I.j(T2 != null && T2.b() && T2.a() && !T2.c(), R.drawable.iv_todo, null, gd.M0(2131754002, null), new j1(z1Var, T2, 8));
                boolean z10 = T2 != null && (T2.b instanceof TL_iv.pageBlockDetails);
                String M0 = gd.M0(2131753985, null);
                s3 s3Var = z1Var.Q;
                Objects.requireNonNull(s3Var);
                I.j(z10, R.drawable.iv_details, null, M0, new b(s3Var, i12));
                boolean p22 = z1Var.Q.p2();
                boolean s22 = z1Var.Q.s2();
                if (p22 || s22) {
                    I.k();
                    if (p22) {
                        I.c(R.drawable.iv_list_tab, gd.M0(2131754011, null), new Runnable() { // from class: oi.m1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        I.v();
                                        break;
                                    default:
                                        z1Var.Q.u3(true);
                                        I.v();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (s22) {
                        I.c(R.drawable.iv_list_untab, gd.M0(2131753996, null), new Runnable() { // from class: oi.m1
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        z1Var.Q.u3(false);
                                        I.v();
                                        break;
                                    default:
                                        z1Var.Q.u3(true);
                                        I.v();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                I.X = true;
                I.a0();
                z1Var.y0 = I;
                break;
            case 7:
                y60 y60Var2 = z1Var.y0;
                if (y60Var2 != null) {
                    y60Var2.v();
                    z1Var.y0 = null;
                }
                s3 s3Var2 = z1Var.Q;
                l5 l5Var = s3Var2.q4;
                if (l5Var == null && (U2 = s3Var2.U2()) != null && U2.getModel() != null) {
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
                        l5Var = U2;
                    }
                }
                if (l5Var != null && l5Var.getModel() != null && !l5Var.I.isEmpty()) {
                    z1Var.Q.I4(l5Var);
                    break;
                } else {
                    z1Var.Q.V1(z5.u(2, 2));
                    break;
                }
            case 8:
                y60 y60Var3 = z1Var.y0;
                if (y60Var3 != null) {
                    y60Var3.v();
                    z1Var.y0 = null;
                }
                a T22 = z1Var.Q.T2();
                if (T22 != null) {
                    TL_iv.PageBlock pageBlock = T22.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                o.Z(z1Var.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new li.d(i10, z1Var, pageblockmath), z1Var.getResourceProvider());
                break;
            case 9:
                z1Var.Q.j4 = null;
                z1Var.t0(90, 0);
                break;
            case 10:
                z1Var.w0();
                fg0 fg0Var = z1Var.P0;
                if (fg0Var != null) {
                    fg0Var.h(true);
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
