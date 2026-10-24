package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class db1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ db1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        qc1 qc1Var = this.b;
        switch (i10) {
            case 0:
                qc1Var.a0 = false;
                int i11 = qc1Var.X;
                int i12 = qc1Var.Y;
                org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
                int i13 = qc1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        i6Var.c = i11;
                        org.telegram.ui.ActionBar.k6.q1(false, false);
                    } else if (i12 == 1) {
                        i6Var.d = i11;
                        org.telegram.ui.ActionBar.k6.q1(true, true);
                        qc1Var.v0.g1();
                        qc1Var.W.setHasChanges(qc1Var.T0(qc1Var.n));
                        qc1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        i6Var.j = i11;
                    } else if (i12 == 1) {
                        int D0 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Od);
                        if (i11 != 0 || D0 == 0) {
                            i6Var.k = i11;
                        } else {
                            i6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int D02 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Pd);
                        if (i11 != 0 || D02 == 0) {
                            i6Var.l = i11;
                        } else {
                            i6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int D03 = org.telegram.ui.ActionBar.k6.D0(org.telegram.ui.ActionBar.k6.Qd);
                        if (i11 != 0 || D03 == 0) {
                            i6Var.m = i11;
                        } else {
                            i6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.q1(true, false);
                    qc1Var.W.setHasChanges(qc1Var.T0(qc1Var.n));
                    qc1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        i6Var.e = i11;
                    } else if (i12 == 1) {
                        i6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = i6Var.g;
                        i6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            qc1Var.w0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            qc1Var.w0.o(0);
                            qc1Var.e1();
                        }
                    } else {
                        i6Var.h = i11;
                    }
                    int i15 = qc1Var.Y;
                    if (i15 >= 0) {
                        qc1Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.k6.q1(true, true);
                    qc1Var.v0.g1();
                    qc1Var.W.setHasChanges(qc1Var.T0(qc1Var.n));
                    qc1Var.m1(true);
                }
                int size = qc1Var.j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) qc1Var.j0.get(i16);
                    t6Var.e(qc1Var.getThemedColor(t6Var.e), false, false);
                }
                qc1Var.o0.g1();
                qc1Var.v0.g1();
                ei.g6 g6Var = qc1Var.b0;
                if (g6Var != null) {
                    g6Var.invalidate();
                }
                qc1Var.Y = -1;
                break;
            case 1:
                qc1Var.presentFragment(u91.d0(qc1Var.getMessagesController().getChat(Long.valueOf(-qc1Var.K1)), true));
                break;
            case 2:
                qc1Var.q1.c1(false);
                boolean a2 = qc1Var.a.a();
                org.telegram.ui.Components.yj0 yj0Var = qc1Var.O1;
                yj0Var.P(a2 ? yj0Var.e[0] : 0);
                org.telegram.ui.Components.yj0 yj0Var2 = qc1Var.O1;
                if (yj0Var2 != null) {
                    yj0Var2.start();
                }
                qc1Var.b1(false);
                qc1Var.V0();
                qc1Var.i1();
                if (qc1Var.j0 != null) {
                    for (int i17 = 0; i17 < qc1Var.j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.t6) qc1Var.j0.get(i17)).e(qc1Var.getThemedColor(((org.telegram.ui.ActionBar.t6) qc1Var.j0.get(i17)).e), false, false);
                    }
                }
                if (qc1Var.N1) {
                    hc1 hc1Var = qc1Var.q1;
                    if (hc1Var == null || !hc1Var.a()) {
                        qc1Var.S1.a(0.0f);
                    } else {
                        qc1Var.S1.setVisibility(0);
                        qc1Var.S1.a(qc1Var.o1);
                    }
                    ValueAnimator valueAnimator = qc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qc1Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(qc1Var.p1, qc1Var.q1.a() ? 1.0f : 0.0f);
                    qc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new g11(qc1Var, 11));
                    qc1Var.Q1.addListener(new ub1(qc1Var, 5));
                    qc1Var.Q1.setDuration(250L);
                    qc1Var.Q1.setInterpolator(org.telegram.ui.Components.bs.f);
                    qc1Var.Q1.start();
                    break;
                }
                break;
            default:
                if (qc1Var.getParentActivity() != null && qc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, qc1Var.getParentActivity(), null, true);
                    r40Var.setAlpha(0.0f);
                    r40Var.setVisibility(4);
                    r40Var.setShowingDuration(4000L);
                    qc1Var.l0.addView(r40Var, w7.z5.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (qc1Var.q1.a()) {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        r40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    r40Var.d();
                    r40Var.f(qc1Var.P1, true);
                    r40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
