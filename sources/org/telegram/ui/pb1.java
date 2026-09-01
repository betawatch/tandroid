package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed1 b;

    public /* synthetic */ pb1(ed1 ed1Var, int i10) {
        this.a = i10;
        this.b = ed1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ed1 ed1Var = this.b;
        switch (i10) {
            case 0:
                ed1Var.W = false;
                int i11 = ed1Var.T;
                int i12 = ed1Var.U;
                org.telegram.ui.ActionBar.i6 i6Var = ed1Var.s;
                int i13 = ed1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        i6Var.c = i11;
                        org.telegram.ui.ActionBar.k6.n1(false, false);
                    } else if (i12 == 1) {
                        i6Var.d = i11;
                        org.telegram.ui.ActionBar.k6.n1(true, true);
                        ed1Var.r0.f1();
                        ed1Var.S.setHasChanges(ed1Var.T0(ed1Var.n));
                        ed1Var.m1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        i6Var.j = i11;
                    } else if (i12 == 1) {
                        int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                        if (i11 != 0 || B0 == 0) {
                            i6Var.k = i11;
                        } else {
                            i6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                        if (i11 != 0 || B02 == 0) {
                            i6Var.l = i11;
                        } else {
                            i6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int B03 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                        if (i11 != 0 || B03 == 0) {
                            i6Var.m = i11;
                        } else {
                            i6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.n1(true, false);
                    ed1Var.S.setHasChanges(ed1Var.T0(ed1Var.n));
                    ed1Var.m1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        i6Var.e = i11;
                    } else if (i12 == 1) {
                        i6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = i6Var.g;
                        i6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            ed1Var.s0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            ed1Var.s0.o(0);
                            ed1Var.e1();
                        }
                    } else {
                        i6Var.h = i11;
                    }
                    int i15 = ed1Var.U;
                    if (i15 >= 0) {
                        ed1Var.H0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.k6.n1(true, true);
                    ed1Var.r0.f1();
                    ed1Var.S.setHasChanges(ed1Var.T0(ed1Var.n));
                    ed1Var.m1(true);
                }
                int size = ed1Var.f0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) ed1Var.f0.get(i16);
                    m6Var.d(ed1Var.getThemedColor(m6Var.f), false, false);
                }
                ed1Var.k0.f1();
                ed1Var.r0.f1();
                fg.i0 i0Var = ed1Var.X;
                if (i0Var != null) {
                    i0Var.invalidate();
                }
                ed1Var.U = -1;
                break;
            case 1:
                ed1Var.presentFragment(ha1.d0(ed1Var.getMessagesController().getChat(Long.valueOf(-ed1Var.G1)), true));
                break;
            case 2:
                ed1Var.m1.l1(false);
                boolean a2 = ed1Var.a.a();
                org.telegram.ui.Components.ij0 ij0Var = ed1Var.K1;
                ij0Var.N(a2 ? ij0Var.e[0] : 0);
                org.telegram.ui.Components.ij0 ij0Var2 = ed1Var.K1;
                if (ij0Var2 != null) {
                    ij0Var2.start();
                }
                ed1Var.b1(false);
                ed1Var.V0();
                ed1Var.i1();
                if (ed1Var.f0 != null) {
                    for (int i17 = 0; i17 < ed1Var.f0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.m6) ed1Var.f0.get(i17)).d(ed1Var.getThemedColor(((org.telegram.ui.ActionBar.m6) ed1Var.f0.get(i17)).f), false, false);
                    }
                }
                if (ed1Var.J1) {
                    vc1 vc1Var = ed1Var.m1;
                    if (vc1Var == null || !vc1Var.a()) {
                        ed1Var.O1.a(0.0f);
                    } else {
                        ed1Var.O1.setVisibility(0);
                        ed1Var.O1.a(ed1Var.k1);
                    }
                    ValueAnimator valueAnimator = ed1Var.M1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ed1Var.M1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ed1Var.l1, ed1Var.m1.a() ? 1.0f : 0.0f);
                    ed1Var.M1 = ofFloat;
                    ofFloat.addUpdateListener(new j11(ed1Var, 13));
                    ed1Var.M1.addListener(new ic1(ed1Var, 5));
                    ed1Var.M1.setDuration(250L);
                    ed1Var.M1.setInterpolator(org.telegram.ui.Components.pr.f);
                    ed1Var.M1.start();
                    break;
                }
                break;
            default:
                if (ed1Var.getParentActivity() != null && ed1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, ed1Var.getParentActivity(), null, true);
                    m40Var.setAlpha(0.0f);
                    m40Var.setVisibility(4);
                    m40Var.setShowingDuration(4000L);
                    ed1Var.h0.addView(m40Var, k7.c6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (ed1Var.m1.a()) {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        m40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    m40Var.d();
                    m40Var.f(ed1Var.L1, true);
                    m40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
