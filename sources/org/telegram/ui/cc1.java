package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd1 b;

    public /* synthetic */ cc1(pd1 pd1Var, int i10) {
        this.a = i10;
        this.b = pd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        pd1 pd1Var = this.b;
        switch (i10) {
            case 0:
                pd1Var.Z = false;
                int i11 = pd1Var.W;
                int i12 = pd1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = pd1Var.s;
                int i13 = pd1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        f6Var.c = i11;
                        org.telegram.ui.ActionBar.i6.n1(false, false);
                    } else if (i12 == 1) {
                        f6Var.d = i11;
                        org.telegram.ui.ActionBar.i6.n1(true, true);
                        pd1Var.u0.g1();
                        pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.n));
                        pd1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        f6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Od);
                        if (i11 != 0 || B0 == 0) {
                            f6Var.k = i11;
                        } else {
                            f6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            f6Var.l = i11;
                        } else {
                            f6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.i6.B0(org.telegram.ui.ActionBar.i6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            f6Var.m = i11;
                        } else {
                            f6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, false);
                    pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.n));
                    pd1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        f6Var.e = i11;
                    } else if (i12 == 1) {
                        f6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = f6Var.g;
                        f6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            pd1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            pd1Var.v0.o(0);
                            pd1Var.e1();
                        }
                    } else {
                        f6Var.h = i11;
                    }
                    int i15 = pd1Var.X;
                    if (i15 >= 0) {
                        pd1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.i6.n1(true, true);
                    pd1Var.u0.g1();
                    pd1Var.V.setHasChanges(pd1Var.T0(pd1Var.n));
                    pd1Var.m1(true);
                }
                int size = pd1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) pd1Var.i0.get(i16);
                    k6Var.e(pd1Var.getThemedColor(k6Var.f), false, false);
                }
                pd1Var.n0.g1();
                pd1Var.u0.g1();
                ci.r6 r6Var = pd1Var.a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                pd1Var.X = -1;
                break;
            case 1:
                pd1Var.presentFragment(ta1.b0(pd1Var.getMessagesController().getChat(Long.valueOf(-pd1Var.J1)), true));
                break;
            case 2:
                pd1Var.p1.q1(false);
                boolean a2 = pd1Var.a.a();
                org.telegram.ui.Components.kj0 kj0Var = pd1Var.N1;
                kj0Var.P(a2 ? kj0Var.e[0] : 0);
                org.telegram.ui.Components.kj0 kj0Var2 = pd1Var.N1;
                if (kj0Var2 != null) {
                    kj0Var2.start();
                }
                pd1Var.b1(false);
                pd1Var.V0();
                pd1Var.i1();
                if (pd1Var.i0 != null) {
                    for (int i17 = 0; i17 < pd1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.k6) pd1Var.i0.get(i17)).e(pd1Var.getThemedColor(((org.telegram.ui.ActionBar.k6) pd1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (pd1Var.M1) {
                    gd1 gd1Var = pd1Var.p1;
                    if (gd1Var == null || !gd1Var.a()) {
                        pd1Var.R1.a(0.0f);
                    } else {
                        pd1Var.R1.setVisibility(0);
                        pd1Var.R1.a(pd1Var.n1);
                    }
                    ValueAnimator valueAnimator = pd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pd1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(pd1Var.o1, pd1Var.p1.a() ? 1.0f : 0.0f);
                    pd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new b21(pd1Var, 12));
                    pd1Var.P1.addListener(new tc1(pd1Var, 5));
                    pd1Var.P1.setDuration(250L);
                    pd1Var.P1.setInterpolator(org.telegram.ui.Components.tr.f);
                    pd1Var.P1.start();
                    break;
                }
                break;
            default:
                if (pd1Var.getParentActivity() != null && pd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, pd1Var.getParentActivity(), null, true);
                    m40Var.setAlpha(0.0f);
                    m40Var.setVisibility(4);
                    m40Var.setShowingDuration(4000L);
                    pd1Var.k0.addView(m40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (pd1Var.p1.a()) {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    m40Var.d();
                    m40Var.f(pd1Var.O1, true);
                    m40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
