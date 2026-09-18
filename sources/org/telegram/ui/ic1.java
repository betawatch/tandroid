package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd1 b;

    public /* synthetic */ ic1(vd1 vd1Var, int i10) {
        this.a = i10;
        this.b = vd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vd1 vd1Var = this.b;
        switch (i10) {
            case 0:
                vd1Var.Z = false;
                int i11 = vd1Var.W;
                int i12 = vd1Var.X;
                org.telegram.ui.ActionBar.g6 g6Var = vd1Var.s;
                int i13 = vd1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        g6Var.c = i11;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i12 == 1) {
                        g6Var.d = i11;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        vd1Var.u0.g1();
                        vd1Var.V.setHasChanges(vd1Var.T0(vd1Var.n));
                        vd1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        g6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i11 != 0 || B0 == 0) {
                            g6Var.k = i11;
                        } else {
                            g6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            g6Var.l = i11;
                        } else {
                            g6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            g6Var.m = i11;
                        } else {
                            g6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    vd1Var.V.setHasChanges(vd1Var.T0(vd1Var.n));
                    vd1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        g6Var.e = i11;
                    } else if (i12 == 1) {
                        g6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = g6Var.g;
                        g6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            vd1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            vd1Var.v0.o(0);
                            vd1Var.e1();
                        }
                    } else {
                        g6Var.h = i11;
                    }
                    int i15 = vd1Var.X;
                    if (i15 >= 0) {
                        vd1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    vd1Var.u0.g1();
                    vd1Var.V.setHasChanges(vd1Var.T0(vd1Var.n));
                    vd1Var.m1(true);
                }
                int size = vd1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) vd1Var.i0.get(i16);
                    l6Var.d(vd1Var.getThemedColor(l6Var.f), false, false);
                }
                vd1Var.n0.g1();
                vd1Var.u0.g1();
                ci.s6 s6Var = vd1Var.a0;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                vd1Var.X = -1;
                break;
            case 1:
                vd1Var.presentFragment(za1.d0(vd1Var.getMessagesController().getChat(Long.valueOf(-vd1Var.J1)), true));
                break;
            case 2:
                vd1Var.p1.o1(false);
                boolean a2 = vd1Var.a.a();
                org.telegram.ui.Components.ij0 ij0Var = vd1Var.N1;
                ij0Var.P(a2 ? ij0Var.e[0] : 0);
                org.telegram.ui.Components.ij0 ij0Var2 = vd1Var.N1;
                if (ij0Var2 != null) {
                    ij0Var2.start();
                }
                vd1Var.b1(false);
                vd1Var.V0();
                vd1Var.i1();
                if (vd1Var.i0 != null) {
                    for (int i17 = 0; i17 < vd1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.l6) vd1Var.i0.get(i17)).d(vd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) vd1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (vd1Var.M1) {
                    md1 md1Var = vd1Var.p1;
                    if (md1Var == null || !md1Var.a()) {
                        vd1Var.R1.a(0.0f);
                    } else {
                        vd1Var.R1.setVisibility(0);
                        vd1Var.R1.a(vd1Var.n1);
                    }
                    ValueAnimator valueAnimator = vd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vd1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(vd1Var.o1, vd1Var.p1.a() ? 1.0f : 0.0f);
                    vd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new i21(vd1Var, 12));
                    vd1Var.P1.addListener(new zc1(vd1Var, 5));
                    vd1Var.P1.setDuration(250L);
                    vd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f);
                    vd1Var.P1.start();
                    break;
                }
                break;
            default:
                if (vd1Var.getParentActivity() != null && vd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, vd1Var.getParentActivity(), null, true);
                    i40Var.setAlpha(0.0f);
                    i40Var.setVisibility(4);
                    i40Var.setShowingDuration(4000L);
                    vd1Var.k0.addView(i40Var, w7.y5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (vd1Var.p1.a()) {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    i40Var.d();
                    i40Var.f(vd1Var.O1, true);
                    i40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
