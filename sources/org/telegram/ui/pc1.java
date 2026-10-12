package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce1 b;

    public /* synthetic */ pc1(ce1 ce1Var, int i10) {
        this.a = i10;
        this.b = ce1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ce1 ce1Var = this.b;
        switch (i10) {
            case 0:
                ce1Var.Z = false;
                int i11 = ce1Var.W;
                int i12 = ce1Var.X;
                org.telegram.ui.ActionBar.e6 e6Var = ce1Var.s;
                int i13 = ce1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        e6Var.c = i11;
                        org.telegram.ui.ActionBar.g6.o1(false, false);
                    } else if (i12 == 1) {
                        e6Var.d = i11;
                        org.telegram.ui.ActionBar.g6.o1(true, true);
                        ce1Var.u0.f1();
                        ce1Var.V.setHasChanges(ce1Var.T0(ce1Var.n));
                        ce1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        e6Var.j = i11;
                    } else if (i12 == 1) {
                        int C0 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Od);
                        if (i11 != 0 || C0 == 0) {
                            e6Var.k = i11;
                        } else {
                            e6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int C02 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Pd);
                        if (i11 != 0 || C02 == 0) {
                            e6Var.l = i11;
                        } else {
                            e6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int C03 = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Qd);
                        if (i11 != 0 || C03 == 0) {
                            e6Var.m = i11;
                        } else {
                            e6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.g6.o1(true, false);
                    ce1Var.V.setHasChanges(ce1Var.T0(ce1Var.n));
                    ce1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        e6Var.e = i11;
                    } else if (i12 == 1) {
                        e6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = e6Var.g;
                        e6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            ce1Var.v0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            ce1Var.v0.o(0);
                            ce1Var.e1();
                        }
                    } else {
                        e6Var.h = i11;
                    }
                    int i15 = ce1Var.X;
                    if (i15 >= 0) {
                        ce1Var.K0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.g6.o1(true, true);
                    ce1Var.u0.f1();
                    ce1Var.V.setHasChanges(ce1Var.T0(ce1Var.n));
                    ce1Var.m1(true);
                }
                int size = ce1Var.i0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ce1Var.i0.get(i16);
                    i6Var.e(ce1Var.getThemedColor(i6Var.f), false, false);
                }
                ce1Var.n0.f1();
                ce1Var.u0.f1();
                di.p6 p6Var = ce1Var.a0;
                if (p6Var != null) {
                    p6Var.invalidate();
                }
                ce1Var.X = -1;
                break;
            case 1:
                ce1Var.presentFragment(hb1.d0(ce1Var.getMessagesController().getChat(Long.valueOf(-ce1Var.J1)), true));
                break;
            case 2:
                ce1Var.p1.o1(false);
                boolean a2 = ce1Var.a.a();
                org.telegram.ui.Components.yj0 yj0Var = ce1Var.N1;
                yj0Var.P(a2 ? yj0Var.e[0] : 0);
                org.telegram.ui.Components.yj0 yj0Var2 = ce1Var.N1;
                if (yj0Var2 != null) {
                    yj0Var2.start();
                }
                ce1Var.b1(false);
                ce1Var.V0();
                ce1Var.i1();
                if (ce1Var.i0 != null) {
                    for (int i17 = 0; i17 < ce1Var.i0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.i6) ce1Var.i0.get(i17)).e(ce1Var.getThemedColor(((org.telegram.ui.ActionBar.i6) ce1Var.i0.get(i17)).f), false, false);
                    }
                }
                if (ce1Var.M1) {
                    td1 td1Var = ce1Var.p1;
                    if (td1Var == null || !td1Var.a()) {
                        ce1Var.R1.a(0.0f);
                    } else {
                        ce1Var.R1.setVisibility(0);
                        ce1Var.R1.a(ce1Var.n1);
                    }
                    ValueAnimator valueAnimator = ce1Var.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ce1Var.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ce1Var.o1, ce1Var.p1.a() ? 1.0f : 0.0f);
                    ce1Var.P1 = ofFloat;
                    ofFloat.addUpdateListener(new f21(ce1Var, 13));
                    ce1Var.P1.addListener(new gd1(ce1Var, 5));
                    ce1Var.P1.setDuration(250L);
                    ce1Var.P1.setInterpolator(org.telegram.ui.Components.es.f);
                    ce1Var.P1.start();
                    break;
                }
                break;
            default:
                if (ce1Var.getParentActivity() != null && ce1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(7, ce1Var.getParentActivity(), null, true);
                    v40Var.setAlpha(0.0f);
                    v40Var.setVisibility(4);
                    v40Var.setShowingDuration(4000L);
                    ce1Var.k0.addView(v40Var, w7.a6.a(-2.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, 51));
                    if (ce1Var.p1.a()) {
                        v40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        v40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    v40Var.d();
                    v40Var.f(ce1Var.O1, true);
                    v40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
