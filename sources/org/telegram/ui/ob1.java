package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd1 b;

    public /* synthetic */ ob1(cd1 cd1Var, int i10) {
        this.a = i10;
        this.b = cd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        cd1 cd1Var = this.b;
        switch (i10) {
            case 0:
                cd1Var.W = false;
                int i11 = cd1Var.T;
                int i12 = cd1Var.U;
                org.telegram.ui.ActionBar.h6 h6Var = cd1Var.s;
                int i13 = cd1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        h6Var.c = i11;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i12 == 1) {
                        h6Var.d = i11;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        cd1Var.r0.f1();
                        cd1Var.S.setHasChanges(cd1Var.T0(cd1Var.n));
                        cd1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        h6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Od);
                        if (i11 != 0 || B0 == 0) {
                            h6Var.k = i11;
                        } else {
                            h6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            h6Var.l = i11;
                        } else {
                            h6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.j6.B0(org.telegram.ui.ActionBar.j6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            h6Var.m = i11;
                        } else {
                            h6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, false);
                    cd1Var.S.setHasChanges(cd1Var.T0(cd1Var.n));
                    cd1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        h6Var.e = i11;
                    } else if (i12 == 1) {
                        h6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = h6Var.g;
                        h6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            cd1Var.s0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            cd1Var.s0.o(0);
                            cd1Var.e1();
                        }
                    } else {
                        h6Var.h = i11;
                    }
                    int i15 = cd1Var.U;
                    if (i15 >= 0) {
                        cd1Var.H0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    cd1Var.r0.f1();
                    cd1Var.S.setHasChanges(cd1Var.T0(cd1Var.n));
                    cd1Var.m1(true);
                }
                int size = cd1Var.f0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) cd1Var.f0.get(i16);
                    l6Var.d(cd1Var.getThemedColor(l6Var.f), false, false);
                }
                cd1Var.k0.f1();
                cd1Var.r0.f1();
                eg.i0 i0Var = cd1Var.X;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                cd1Var.U = -1;
                break;
            case 1:
                cd1Var.presentFragment(ga1.d0(cd1Var.getMessagesController().getChat(Long.valueOf(-cd1Var.G1)), true));
                break;
            case 2:
                cd1Var.m1.n1(false);
                boolean a2 = cd1Var.a.a();
                org.telegram.ui.Components.gj0 gj0Var = cd1Var.K1;
                gj0Var.N(a2 ? gj0Var.e[0] : 0);
                org.telegram.ui.Components.gj0 gj0Var2 = cd1Var.K1;
                if (gj0Var2 != null) {
                    gj0Var2.start();
                }
                cd1Var.b1(false);
                cd1Var.V0();
                cd1Var.i1();
                if (cd1Var.f0 != null) {
                    for (int i17 = 0; i17 < cd1Var.f0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.l6) cd1Var.f0.get(i17)).d(cd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) cd1Var.f0.get(i17)).f), false, false);
                    }
                }
                if (cd1Var.J1) {
                    tc1 tc1Var = cd1Var.m1;
                    if (tc1Var == null || !tc1Var.a()) {
                        cd1Var.O1.a(0.0f);
                    } else {
                        cd1Var.O1.setVisibility(0);
                        cd1Var.O1.a(cd1Var.k1);
                    }
                    ValueAnimator valueAnimator = cd1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        cd1Var.M1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(cd1Var.l1, cd1Var.m1.a() ? 1.0f : 0.0f);
                    cd1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new h11(cd1Var, 13));
                    cd1Var.M1.addListener(new gc1(cd1Var, 5));
                    cd1Var.M1.setDuration(250L);
                    cd1Var.M1.setInterpolator(org.telegram.ui.Components.nr.f);
                    cd1Var.M1.start();
                    break;
                }
                break;
            default:
                if (cd1Var.getParentActivity() != null && cd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(7, cd1Var.getParentActivity(), null, true);
                    k40Var.setAlpha(0.0f);
                    k40Var.setVisibility(4);
                    k40Var.setShowingDuration(4000L);
                    cd1Var.h0.addView(k40Var, k7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (cd1Var.m1.a()) {
                        k40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        k40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    k40Var.d();
                    k40Var.f(cd1Var.L1, true);
                    k40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
