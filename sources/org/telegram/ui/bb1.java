package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ bb1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        qc1 qc1Var = this.b;
        switch (i10) {
            case 0:
                qc1Var.V = false;
                int i11 = qc1Var.S;
                int i12 = qc1Var.T;
                org.telegram.ui.ActionBar.e6 e6Var = qc1Var.s;
                int i13 = qc1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        e6Var.c = i11;
                        org.telegram.ui.ActionBar.g6.n1(false, false);
                    } else if (i12 == 1) {
                        e6Var.d = i11;
                        org.telegram.ui.ActionBar.g6.n1(true, true);
                        qc1Var.q0.f1();
                        qc1Var.R.setHasChanges(qc1Var.T0(qc1Var.n));
                        qc1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        e6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                        if (i11 != 0 || B0 == 0) {
                            e6Var.k = i11;
                        } else {
                            e6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            e6Var.l = i11;
                        } else {
                            e6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            e6Var.m = i11;
                        } else {
                            e6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.g6.n1(true, false);
                    qc1Var.R.setHasChanges(qc1Var.T0(qc1Var.n));
                    qc1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        e6Var.e = i11;
                    } else if (i12 == 1) {
                        e6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = e6Var.g;
                        e6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            qc1Var.r0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            qc1Var.r0.o(0);
                            qc1Var.e1();
                        }
                    } else {
                        e6Var.h = i11;
                    }
                    int i15 = qc1Var.T;
                    if (i15 >= 0) {
                        qc1Var.G0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.g6.n1(true, true);
                    qc1Var.q0.f1();
                    qc1Var.R.setHasChanges(qc1Var.T0(qc1Var.n));
                    qc1Var.m1(true);
                }
                int size = qc1Var.e0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) qc1Var.e0.get(i16);
                    i6Var.d(qc1Var.getThemedColor(i6Var.f), false, false);
                }
                qc1Var.j0.f1();
                qc1Var.q0.f1();
                cg.i0 i0Var = qc1Var.W;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                qc1Var.T = -1;
                break;
            case 1:
                qc1Var.presentFragment(t91.d0(qc1Var.getMessagesController().getChat(Long.valueOf(-qc1Var.F1)), true));
                break;
            case 2:
                qc1Var.l1.j1(false);
                boolean a2 = qc1Var.a.a();
                org.telegram.ui.Components.xi0 xi0Var = qc1Var.J1;
                xi0Var.N(a2 ? xi0Var.e[0] : 0);
                org.telegram.ui.Components.xi0 xi0Var2 = qc1Var.J1;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                }
                qc1Var.b1(false);
                qc1Var.V0();
                qc1Var.i1();
                if (qc1Var.e0 != null) {
                    for (int i17 = 0; i17 < qc1Var.e0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.i6) qc1Var.e0.get(i17)).d(qc1Var.getThemedColor(((org.telegram.ui.ActionBar.i6) qc1Var.e0.get(i17)).f), false, false);
                    }
                }
                if (qc1Var.I1) {
                    hc1 hc1Var = qc1Var.l1;
                    if (hc1Var == null || !hc1Var.a()) {
                        qc1Var.N1.a(0.0f);
                    } else {
                        qc1Var.N1.setVisibility(0);
                        qc1Var.N1.a(qc1Var.j1);
                    }
                    ValueAnimator valueAnimator = qc1Var.L1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qc1Var.L1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(qc1Var.k1, qc1Var.l1.a() ? 1.0f : 0.0f);
                    qc1Var.L1 = ofFloat;
                    ofFloat.addUpdateListener(new w01(qc1Var, 13));
                    qc1Var.L1.addListener(new tb1(qc1Var, 5));
                    qc1Var.L1.setDuration(250L);
                    qc1Var.L1.setInterpolator(org.telegram.ui.Components.jr.f);
                    qc1Var.L1.start();
                    break;
                }
                break;
            default:
                if (qc1Var.getParentActivity() != null && qc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(7, qc1Var.getParentActivity(), null, true);
                    g40Var.setAlpha(0.0f);
                    g40Var.setVisibility(4);
                    g40Var.setShowingDuration(4000L);
                    qc1Var.g0.addView(g40Var, i7.f6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (qc1Var.l1.a()) {
                        g40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        g40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    g40Var.d();
                    g40Var.f(qc1Var.K1, true);
                    g40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
