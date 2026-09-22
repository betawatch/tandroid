package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd1 b;

    public /* synthetic */ jc1(wd1 wd1Var, int i10) {
        this.a = i10;
        this.b = wd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        wd1 wd1Var = this.b;
        switch (i10) {
            case 0:
                wd1Var.Z = false;
                int i11 = wd1Var.W;
                int i12 = wd1Var.X;
                org.telegram.ui.ActionBar.g6 g6Var = wd1Var.s;
                int i13 = wd1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        g6Var.c = i11;
                        org.telegram.ui.ActionBar.i6.n1(false, false);
                    } else if (i12 == 1) {
                        g6Var.d = i11;
                        org.telegram.ui.ActionBar.i6.n1(true, true);
                        wd1Var.u0.f1();
                        wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.n));
                        wd1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        g6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                        if (i11 != 0 || B0 == 0) {
                            g6Var.k = i11;
                        } else {
                            g6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            g6Var.l = i11;
                        } else {
                            g6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            g6Var.m = i11;
                        } else {
                            g6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, false);
                    wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.n));
                    wd1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        g6Var.e = i11;
                    } else if (i12 == 1) {
                        g6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = g6Var.g;
                        g6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            wd1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            wd1Var.v0.o(0);
                            wd1Var.e1();
                        }
                    } else {
                        g6Var.h = i11;
                    }
                    int i15 = wd1Var.X;
                    if (i15 >= 0) {
                        wd1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, true);
                    wd1Var.u0.f1();
                    wd1Var.V.setHasChanges(wd1Var.T0(wd1Var.n));
                    wd1Var.m1(true);
                }
                int size = wd1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) wd1Var.i0.get(i16);
                    k6Var.d(wd1Var.getThemedColor(k6Var.f), false, false);
                }
                wd1Var.n0.f1();
                wd1Var.u0.f1();
                ci.s6 s6Var = wd1Var.a0;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                wd1Var.X = -1;
                break;
            case 1:
                wd1Var.presentFragment(za1.d0(wd1Var.getMessagesController().getChat(Long.valueOf(-wd1Var.J1)), true));
                break;
            case 2:
                wd1Var.p1.o1(false);
                boolean a2 = wd1Var.a.a();
                org.telegram.ui.Components.xi0 xi0Var = wd1Var.N1;
                xi0Var.P(a2 ? xi0Var.e[0] : 0);
                org.telegram.ui.Components.xi0 xi0Var2 = wd1Var.N1;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                }
                wd1Var.b1(false);
                wd1Var.V0();
                wd1Var.i1();
                if (wd1Var.i0 != null) {
                    for (int i17 = 0; i17 < wd1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.k6) wd1Var.i0.get(i17)).d(wd1Var.getThemedColor(((org.telegram.ui.ActionBar.k6) wd1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (wd1Var.M1) {
                    nd1 nd1Var = wd1Var.p1;
                    if (nd1Var == null || !nd1Var.a()) {
                        wd1Var.R1.a(0.0f);
                    } else {
                        wd1Var.R1.setVisibility(0);
                        wd1Var.R1.a(wd1Var.n1);
                    }
                    ValueAnimator valueAnimator = wd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        wd1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(wd1Var.o1, wd1Var.p1.a() ? 1.0f : 0.0f);
                    wd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new a21(wd1Var, 13));
                    wd1Var.P1.addListener(new ad1(wd1Var, 5));
                    wd1Var.P1.setDuration(250L);
                    wd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f);
                    wd1Var.P1.start();
                    break;
                }
                break;
            default:
                if (wd1Var.getParentActivity() != null && wd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, wd1Var.getParentActivity(), null, true);
                    i40Var.setAlpha(0.0f);
                    i40Var.setVisibility(4);
                    i40Var.setShowingDuration(4000L);
                    wd1Var.k0.addView(i40Var, w7.x5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (wd1Var.p1.a()) {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    i40Var.d();
                    i40Var.f(wd1Var.O1, true);
                    i40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
