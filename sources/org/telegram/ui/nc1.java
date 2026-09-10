package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae1 b;

    public /* synthetic */ nc1(ae1 ae1Var, int i10) {
        this.a = i10;
        this.b = ae1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ae1 ae1Var = this.b;
        switch (i10) {
            case 0:
                ae1Var.Z = false;
                int i11 = ae1Var.W;
                int i12 = ae1Var.X;
                org.telegram.ui.ActionBar.h6 h6Var = ae1Var.s;
                int i13 = ae1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        h6Var.c = i11;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i12 == 1) {
                        h6Var.d = i11;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        ae1Var.u0.e1();
                        ae1Var.V.setHasChanges(ae1Var.T0(ae1Var.n));
                        ae1Var.m1(true);
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
                    ae1Var.V.setHasChanges(ae1Var.T0(ae1Var.n));
                    ae1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        h6Var.e = i11;
                    } else if (i12 == 1) {
                        h6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = h6Var.g;
                        h6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            ae1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            ae1Var.v0.o(0);
                            ae1Var.e1();
                        }
                    } else {
                        h6Var.h = i11;
                    }
                    int i15 = ae1Var.X;
                    if (i15 >= 0) {
                        ae1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    ae1Var.u0.e1();
                    ae1Var.V.setHasChanges(ae1Var.T0(ae1Var.n));
                    ae1Var.m1(true);
                }
                int size = ae1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) ae1Var.i0.get(i16);
                    l6Var.d(ae1Var.getThemedColor(l6Var.f), false, false);
                }
                ae1Var.n0.e1();
                ae1Var.u0.e1();
                bi.s7 s7Var = ae1Var.a0;
                if (s7Var != null) {
                    s7Var.invalidate();
                }
                ae1Var.X = -1;
                break;
            case 1:
                ae1Var.presentFragment(fb1.d0(ae1Var.getMessagesController().getChat(Long.valueOf(-ae1Var.J1)), true));
                break;
            case 2:
                ae1Var.p1.n1(false);
                boolean a2 = ae1Var.a.a();
                org.telegram.ui.Components.hj0 hj0Var = ae1Var.N1;
                hj0Var.P(a2 ? hj0Var.e[0] : 0);
                org.telegram.ui.Components.hj0 hj0Var2 = ae1Var.N1;
                if (hj0Var2 != null) {
                    hj0Var2.start();
                }
                ae1Var.b1(false);
                ae1Var.V0();
                ae1Var.i1();
                if (ae1Var.i0 != null) {
                    for (int i17 = 0; i17 < ae1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.l6) ae1Var.i0.get(i17)).d(ae1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) ae1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (ae1Var.M1) {
                    rd1 rd1Var = ae1Var.p1;
                    if (rd1Var == null || !rd1Var.a()) {
                        ae1Var.R1.a(0.0f);
                    } else {
                        ae1Var.R1.setVisibility(0);
                        ae1Var.R1.a(ae1Var.n1);
                    }
                    ValueAnimator valueAnimator = ae1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ae1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ae1Var.o1, ae1Var.p1.a() ? 1.0f : 0.0f);
                    ae1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new f21(ae1Var, 13));
                    ae1Var.P1.addListener(new ed1(ae1Var, 5));
                    ae1Var.P1.setDuration(250L);
                    ae1Var.P1.setInterpolator(org.telegram.ui.Components.wr.f);
                    ae1Var.P1.start();
                    break;
                }
                break;
            default:
                if (ae1Var.getParentActivity() != null && ae1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(7, ae1Var.getParentActivity(), null, true);
                    s40Var.setAlpha(0.0f);
                    s40Var.setVisibility(4);
                    s40Var.setShowingDuration(4000L);
                    ae1Var.k0.addView(s40Var, w7.a6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (ae1Var.p1.a()) {
                        s40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        s40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    s40Var.d();
                    s40Var.f(ae1Var.O1, true);
                    s40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
