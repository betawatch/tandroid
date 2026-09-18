package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd1 b;

    public /* synthetic */ kc1(xd1 xd1Var, int i10) {
        this.a = i10;
        this.b = xd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        xd1 xd1Var = this.b;
        switch (i10) {
            case 0:
                xd1Var.Z = false;
                int i11 = xd1Var.W;
                int i12 = xd1Var.X;
                org.telegram.ui.ActionBar.h6 h6Var = xd1Var.s;
                int i13 = xd1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        h6Var.c = i11;
                        org.telegram.ui.ActionBar.j6.n1(false, false);
                    } else if (i12 == 1) {
                        h6Var.d = i11;
                        org.telegram.ui.ActionBar.j6.n1(true, true);
                        xd1Var.u0.g1();
                        xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.n));
                        xd1Var.m1(true);
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
                    xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.n));
                    xd1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        h6Var.e = i11;
                    } else if (i12 == 1) {
                        h6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = h6Var.g;
                        h6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            xd1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            xd1Var.v0.o(0);
                            xd1Var.e1();
                        }
                    } else {
                        h6Var.h = i11;
                    }
                    int i15 = xd1Var.X;
                    if (i15 >= 0) {
                        xd1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    xd1Var.u0.g1();
                    xd1Var.V.setHasChanges(xd1Var.T0(xd1Var.n));
                    xd1Var.m1(true);
                }
                int size = xd1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) xd1Var.i0.get(i16);
                    l6Var.d(xd1Var.getThemedColor(l6Var.f), false, false);
                }
                xd1Var.n0.g1();
                xd1Var.u0.g1();
                ci.s6 s6Var = xd1Var.a0;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
                xd1Var.X = -1;
                break;
            case 1:
                xd1Var.presentFragment(ab1.d0(xd1Var.getMessagesController().getChat(Long.valueOf(-xd1Var.J1)), true));
                break;
            case 2:
                xd1Var.p1.o1(false);
                boolean a2 = xd1Var.a.a();
                org.telegram.ui.Components.yi0 yi0Var = xd1Var.N1;
                yi0Var.P(a2 ? yi0Var.e[0] : 0);
                org.telegram.ui.Components.yi0 yi0Var2 = xd1Var.N1;
                if (yi0Var2 != null) {
                    yi0Var2.start();
                }
                xd1Var.b1(false);
                xd1Var.V0();
                xd1Var.i1();
                if (xd1Var.i0 != null) {
                    for (int i17 = 0; i17 < xd1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.l6) xd1Var.i0.get(i17)).d(xd1Var.getThemedColor(((org.telegram.ui.ActionBar.l6) xd1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (xd1Var.M1) {
                    od1 od1Var = xd1Var.p1;
                    if (od1Var == null || !od1Var.a()) {
                        xd1Var.R1.a(0.0f);
                    } else {
                        xd1Var.R1.setVisibility(0);
                        xd1Var.R1.a(xd1Var.n1);
                    }
                    ValueAnimator valueAnimator = xd1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xd1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(xd1Var.o1, xd1Var.p1.a() ? 1.0f : 0.0f);
                    xd1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new k21(xd1Var, 12));
                    xd1Var.P1.addListener(new bd1(xd1Var, 5));
                    xd1Var.P1.setDuration(250L);
                    xd1Var.P1.setInterpolator(org.telegram.ui.Components.qr.f);
                    xd1Var.P1.start();
                    break;
                }
                break;
            default:
                if (xd1Var.getParentActivity() != null && xd1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, xd1Var.getParentActivity(), null, true);
                    i40Var.setAlpha(0.0f);
                    i40Var.setVisibility(4);
                    i40Var.setShowingDuration(4000L);
                    xd1Var.k0.addView(i40Var, w7.x5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (xd1Var.p1.a()) {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        i40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    i40Var.d();
                    i40Var.f(xd1Var.O1, true);
                    i40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
