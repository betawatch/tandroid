package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od1 b;

    public /* synthetic */ bc1(od1 od1Var, int i10) {
        this.a = i10;
        this.b = od1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        od1 od1Var = this.b;
        switch (i10) {
            case 0:
                od1Var.Z = false;
                int i11 = od1Var.W;
                int i12 = od1Var.X;
                org.telegram.ui.ActionBar.f6 f6Var = od1Var.s;
                int i13 = od1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        f6Var.c = i11;
                        org.telegram.ui.ActionBar.h6.n1(false, false);
                    } else if (i12 == 1) {
                        f6Var.d = i11;
                        org.telegram.ui.ActionBar.h6.n1(true, true);
                        od1Var.u0.f1();
                        od1Var.V.setHasChanges(od1Var.T0(od1Var.n));
                        od1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        f6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Od);
                        if (i11 != 0 || B0 == 0) {
                            f6Var.k = i11;
                        } else {
                            f6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            f6Var.l = i11;
                        } else {
                            f6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.h6.B0(org.telegram.ui.ActionBar.h6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            f6Var.m = i11;
                        } else {
                            f6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.h6.n1(true, false);
                    od1Var.V.setHasChanges(od1Var.T0(od1Var.n));
                    od1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        f6Var.e = i11;
                    } else if (i12 == 1) {
                        f6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = f6Var.g;
                        f6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            od1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            od1Var.v0.o(0);
                            od1Var.e1();
                        }
                    } else {
                        f6Var.h = i11;
                    }
                    int i15 = od1Var.X;
                    if (i15 >= 0) {
                        od1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.h6.n1(true, true);
                    od1Var.u0.f1();
                    od1Var.V.setHasChanges(od1Var.T0(od1Var.n));
                    od1Var.m1(true);
                }
                int size = od1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) od1Var.i0.get(i16);
                    j6Var.e(od1Var.getThemedColor(j6Var.f), false, false);
                }
                od1Var.n0.f1();
                od1Var.u0.f1();
                ci.r6 r6Var = od1Var.a0;
                if (r6Var != null) {
                    r6Var.invalidate();
                }
                od1Var.X = -1;
                break;
            case 1:
                od1Var.presentFragment(sa1.d0(od1Var.getMessagesController().getChat(Long.valueOf(-od1Var.J1)), true));
                break;
            case 2:
                od1Var.p1.o1(false);
                boolean a2 = od1Var.a.a();
                org.telegram.ui.Components.ij0 ij0Var = od1Var.N1;
                ij0Var.P(a2 ? ij0Var.e[0] : 0);
                org.telegram.ui.Components.ij0 ij0Var2 = od1Var.N1;
                if (ij0Var2 != null) {
                    ij0Var2.start();
                }
                od1Var.b1(false);
                od1Var.V0();
                od1Var.i1();
                if (od1Var.i0 != null) {
                    for (int i17 = 0; i17 < od1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.j6) od1Var.i0.get(i17)).e(od1Var.getThemedColor(((org.telegram.ui.ActionBar.j6) od1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (od1Var.M1) {
                    fd1 fd1Var = od1Var.p1;
                    if (fd1Var == null || !fd1Var.a()) {
                        od1Var.R1.a(0.0f);
                    } else {
                        od1Var.R1.setVisibility(0);
                        od1Var.R1.a(od1Var.n1);
                    }
                    ValueAnimator valueAnimator = od1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        od1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(od1Var.o1, od1Var.p1.a() ? 1.0f : 0.0f);
                    od1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new q11(od1Var, 13));
                    od1Var.P1.addListener(new sc1(od1Var, 5));
                    od1Var.P1.setDuration(250L);
                    od1Var.P1.setInterpolator(org.telegram.ui.Components.rr.f);
                    od1Var.P1.start();
                    break;
                }
                break;
            default:
                if (od1Var.getParentActivity() != null && od1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(7, od1Var.getParentActivity(), null, true);
                    j40Var.setAlpha(0.0f);
                    j40Var.setVisibility(4);
                    j40Var.setShowingDuration(4000L);
                    od1Var.k0.addView(j40Var, w7.y5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (od1Var.p1.a()) {
                        j40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        j40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    j40Var.d();
                    j40Var.f(od1Var.O1, true);
                    j40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
