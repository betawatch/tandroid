package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc1 b;

    public /* synthetic */ hb1(vc1 vc1Var, int i10) {
        this.a = i10;
        this.b = vc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vc1 vc1Var = this.b;
        switch (i10) {
            case 0:
                vc1Var.a0 = false;
                int i11 = vc1Var.X;
                int i12 = vc1Var.Y;
                org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
                int i13 = vc1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        w6Var.c = i11;
                        org.telegram.ui.ActionBar.y6.q1(false, false);
                    } else if (i12 == 1) {
                        w6Var.d = i11;
                        org.telegram.ui.ActionBar.y6.q1(true, true);
                        vc1Var.v0.g1();
                        vc1Var.W.setHasChanges(vc1Var.U0(vc1Var.n));
                        vc1Var.n1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        w6Var.j = i11;
                    } else if (i12 == 1) {
                        int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                        if (i11 != 0 || D0 == 0) {
                            w6Var.k = i11;
                        } else {
                            w6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                        if (i11 != 0 || D02 == 0) {
                            w6Var.l = i11;
                        } else {
                            w6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                        if (i11 != 0 || D03 == 0) {
                            w6Var.m = i11;
                        } else {
                            w6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.y6.q1(true, false);
                    vc1Var.W.setHasChanges(vc1Var.U0(vc1Var.n));
                    vc1Var.n1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        w6Var.e = i11;
                    } else if (i12 == 1) {
                        w6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = w6Var.g;
                        w6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            vc1Var.w0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            vc1Var.w0.o(0);
                            vc1Var.f1();
                        }
                    } else {
                        w6Var.h = i11;
                    }
                    int i15 = vc1Var.Y;
                    if (i15 >= 0) {
                        vc1Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.y6.q1(true, true);
                    vc1Var.v0.g1();
                    vc1Var.W.setHasChanges(vc1Var.U0(vc1Var.n));
                    vc1Var.n1(true);
                }
                int size = vc1Var.j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) vc1Var.j0.get(i16);
                    h7Var.e(vc1Var.getThemedColor(h7Var.e), false, false);
                }
                vc1Var.o0.g1();
                vc1Var.v0.g1();
                fi.f6 f6Var = vc1Var.b0;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                vc1Var.Y = -1;
                break;
            case 1:
                vc1Var.presentFragment(y91.c0(vc1Var.getMessagesController().getChat(Long.valueOf(-vc1Var.K1)), true));
                break;
            case 2:
                vc1Var.q1.j1(false);
                boolean a2 = vc1Var.a.a();
                org.telegram.ui.Components.yj0 yj0Var = vc1Var.O1;
                yj0Var.P(a2 ? yj0Var.e[0] : 0);
                org.telegram.ui.Components.yj0 yj0Var2 = vc1Var.O1;
                if (yj0Var2 != null) {
                    yj0Var2.start();
                }
                vc1Var.c1(false);
                vc1Var.W0();
                vc1Var.j1();
                if (vc1Var.j0 != null) {
                    for (int i17 = 0; i17 < vc1Var.j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.h7) vc1Var.j0.get(i17)).e(vc1Var.getThemedColor(((org.telegram.ui.ActionBar.h7) vc1Var.j0.get(i17)).e), false, false);
                    }
                }
                if (vc1Var.N1) {
                    mc1 mc1Var = vc1Var.q1;
                    if (mc1Var == null || !mc1Var.a()) {
                        vc1Var.S1.a(0.0f);
                    } else {
                        vc1Var.S1.setVisibility(0);
                        vc1Var.S1.a(vc1Var.o1);
                    }
                    ValueAnimator valueAnimator = vc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vc1Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(vc1Var.p1, vc1Var.q1.a() ? 1.0f : 0.0f);
                    vc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new x11(vc1Var, 10));
                    vc1Var.Q1.addListener(new yb1(vc1Var, 5));
                    vc1Var.Q1.setDuration(250L);
                    vc1Var.Q1.setInterpolator(org.telegram.ui.Components.ds.f);
                    vc1Var.Q1.start();
                    break;
                }
                break;
            default:
                if (vc1Var.getParentActivity() != null && vc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(7, vc1Var.getParentActivity(), null, true);
                    t40Var.setAlpha(0.0f);
                    t40Var.setVisibility(4);
                    t40Var.setShowingDuration(4000L);
                    vc1Var.l0.addView(t40Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (vc1Var.q1.a()) {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    t40Var.d();
                    t40Var.f(vc1Var.P1, true);
                    t40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
