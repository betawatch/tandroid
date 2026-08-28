package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc1 b;

    public /* synthetic */ ab1(oc1 oc1Var, int i9) {
        this.a = i9;
        this.b = oc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        oc1 oc1Var = this.b;
        switch (i9) {
            case 0:
                oc1Var.V = false;
                int i10 = oc1Var.S;
                int i11 = oc1Var.T;
                org.telegram.ui.ActionBar.d6 d6Var = oc1Var.s;
                int i12 = oc1Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        d6Var.c = i10;
                        org.telegram.ui.ActionBar.f6.n1(false, false);
                    } else if (i11 == 1) {
                        d6Var.d = i10;
                        org.telegram.ui.ActionBar.f6.n1(true, true);
                        oc1Var.q0.f1();
                        oc1Var.R.setHasChanges(oc1Var.T0(oc1Var.n));
                        oc1Var.m1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        d6Var.j = i10;
                    } else if (i11 == 1) {
                        int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                        if (i10 != 0 || B0 == 0) {
                            d6Var.k = i10;
                        } else {
                            d6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                        if (i10 != 0 || B02 == 0) {
                            d6Var.l = i10;
                        } else {
                            d6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int B03 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Qd);
                        if (i10 != 0 || B03 == 0) {
                            d6Var.m = i10;
                        } else {
                            d6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.f6.n1(true, false);
                    oc1Var.R.setHasChanges(oc1Var.T0(oc1Var.n));
                    oc1Var.m1(true);
                } else if (i12 == 3) {
                    if (i11 == 0) {
                        d6Var.e = i10;
                    } else if (i11 == 1) {
                        d6Var.f = i10;
                    } else if (i11 == 2) {
                        int i13 = d6Var.g;
                        d6Var.g = i10;
                        if (i13 != 0 && i10 == 0) {
                            oc1Var.r0.u(0);
                        } else if (i13 == 0 && i10 != 0) {
                            oc1Var.r0.o(0);
                            oc1Var.e1();
                        }
                    } else {
                        d6Var.h = i10;
                    }
                    int i14 = oc1Var.T;
                    if (i14 >= 0) {
                        oc1Var.G0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.f6.n1(true, true);
                    oc1Var.q0.f1();
                    oc1Var.R.setHasChanges(oc1Var.T0(oc1Var.n));
                    oc1Var.m1(true);
                }
                int size = oc1Var.e0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) oc1Var.e0.get(i15);
                    h6Var.d(oc1Var.getThemedColor(h6Var.f), false, false);
                }
                oc1Var.j0.f1();
                oc1Var.q0.f1();
                kh.h6 h6Var2 = oc1Var.W;
                if (h6Var2 != null) {
                    h6Var2.invalidate();
                }
                oc1Var.T = -1;
                break;
            case 1:
                oc1Var.presentFragment(s91.c0(oc1Var.getMessagesController().getChat(Long.valueOf(-oc1Var.F1)), true));
                break;
            case 2:
                oc1Var.l1.m1(false);
                boolean a2 = oc1Var.a.a();
                org.telegram.ui.Components.mi0 mi0Var = oc1Var.J1;
                mi0Var.N(a2 ? mi0Var.e[0] : 0);
                org.telegram.ui.Components.mi0 mi0Var2 = oc1Var.J1;
                if (mi0Var2 != null) {
                    mi0Var2.start();
                }
                oc1Var.b1(false);
                oc1Var.V0();
                oc1Var.i1();
                if (oc1Var.e0 != null) {
                    for (int i16 = 0; i16 < oc1Var.e0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.h6) oc1Var.e0.get(i16)).d(oc1Var.getThemedColor(((org.telegram.ui.ActionBar.h6) oc1Var.e0.get(i16)).f), false, false);
                    }
                }
                if (oc1Var.I1) {
                    fc1 fc1Var = oc1Var.l1;
                    if (fc1Var == null || !fc1Var.a()) {
                        oc1Var.N1.a(0.0f);
                    } else {
                        oc1Var.N1.setVisibility(0);
                        oc1Var.N1.a(oc1Var.j1);
                    }
                    ValueAnimator valueAnimator = oc1Var.L1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        oc1Var.L1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(oc1Var.k1, oc1Var.l1.a() ? 1.0f : 0.0f);
                    oc1Var.L1 = ofFloat;
                    ofFloat.addUpdateListener(new v01(oc1Var, 13));
                    oc1Var.L1.addListener(new sb1(oc1Var, 5));
                    oc1Var.L1.setDuration(250L);
                    oc1Var.L1.setInterpolator(org.telegram.ui.Components.gr.f);
                    oc1Var.L1.start();
                    break;
                }
                break;
            default:
                if (oc1Var.getParentActivity() != null && oc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(7, oc1Var.getParentActivity(), null, true);
                    s30Var.setAlpha(0.0f);
                    s30Var.setVisibility(4);
                    s30Var.setShowingDuration(4000L);
                    oc1Var.g0.addView(s30Var, g7.e6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (oc1Var.l1.a()) {
                        s30Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        s30Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    s30Var.d();
                    s30Var.f(oc1Var.K1, true);
                    s30Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
