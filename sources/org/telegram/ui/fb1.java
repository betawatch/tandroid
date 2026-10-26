package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ fb1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.b = tc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        tc1 tc1Var = this.b;
        switch (i10) {
            case 0:
                tc1Var.a0 = false;
                int i11 = tc1Var.X;
                int i12 = tc1Var.Y;
                org.telegram.ui.ActionBar.w6 w6Var = tc1Var.v;
                int i13 = tc1Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        w6Var.c = i11;
                        org.telegram.ui.ActionBar.y6.q1(false, false);
                    } else if (i12 == 1) {
                        w6Var.d = i11;
                        org.telegram.ui.ActionBar.y6.q1(true, true);
                        tc1Var.v0.g1();
                        tc1Var.W.setHasChanges(tc1Var.U0(tc1Var.n));
                        tc1Var.n1(true);
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
                    tc1Var.W.setHasChanges(tc1Var.U0(tc1Var.n));
                    tc1Var.n1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        w6Var.e = i11;
                    } else if (i12 == 1) {
                        w6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = w6Var.g;
                        w6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            tc1Var.w0.u(0);
                        } else if (i14 == 0 && i11 != 0) {
                            tc1Var.w0.o(0);
                            tc1Var.f1();
                        }
                    } else {
                        w6Var.h = i11;
                    }
                    int i15 = tc1Var.Y;
                    if (i15 >= 0) {
                        tc1Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.y6.q1(true, true);
                    tc1Var.v0.g1();
                    tc1Var.W.setHasChanges(tc1Var.U0(tc1Var.n));
                    tc1Var.n1(true);
                }
                int size = tc1Var.j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.h7 h7Var = (org.telegram.ui.ActionBar.h7) tc1Var.j0.get(i16);
                    h7Var.e(tc1Var.getThemedColor(h7Var.e), false, false);
                }
                tc1Var.o0.g1();
                tc1Var.v0.g1();
                fi.f6 f6Var = tc1Var.b0;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
                tc1Var.Y = -1;
                break;
            case 1:
                tc1Var.presentFragment(w91.c0(tc1Var.getMessagesController().getChat(Long.valueOf(-tc1Var.K1)), true));
                break;
            case 2:
                tc1Var.q1.j1(false);
                boolean a2 = tc1Var.a.a();
                org.telegram.ui.Components.xj0 xj0Var = tc1Var.O1;
                xj0Var.P(a2 ? xj0Var.e[0] : 0);
                org.telegram.ui.Components.xj0 xj0Var2 = tc1Var.O1;
                if (xj0Var2 != null) {
                    xj0Var2.start();
                }
                tc1Var.c1(false);
                tc1Var.W0();
                tc1Var.j1();
                if (tc1Var.j0 != null) {
                    for (int i17 = 0; i17 < tc1Var.j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.h7) tc1Var.j0.get(i17)).e(tc1Var.getThemedColor(((org.telegram.ui.ActionBar.h7) tc1Var.j0.get(i17)).e), false, false);
                    }
                }
                if (tc1Var.N1) {
                    kc1 kc1Var = tc1Var.q1;
                    if (kc1Var == null || !kc1Var.a()) {
                        tc1Var.S1.a(0.0f);
                    } else {
                        tc1Var.S1.setVisibility(0);
                        tc1Var.S1.a(tc1Var.o1);
                    }
                    ValueAnimator valueAnimator = tc1Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        tc1Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(tc1Var.p1, tc1Var.q1.a() ? 1.0f : 0.0f);
                    tc1Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new v11(tc1Var, 10));
                    tc1Var.Q1.addListener(new wb1(tc1Var, 5));
                    tc1Var.Q1.setDuration(250L);
                    tc1Var.Q1.setInterpolator(org.telegram.ui.Components.ds.f);
                    tc1Var.Q1.start();
                    break;
                }
                break;
            default:
                if (tc1Var.getParentActivity() != null && tc1Var.getParentActivity() != null) {
                    SharedConfig.increaseDayNightWallpaperSiwtchHint();
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(7, tc1Var.getParentActivity(), null, true);
                    t40Var.setAlpha(0.0f);
                    t40Var.setVisibility(4);
                    t40Var.setShowingDuration(4000L);
                    tc1Var.l0.addView(t40Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (tc1Var.q1.a()) {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperDay));
                    } else {
                        t40Var.setText(LocaleController.getString(R.string.PreviewWallpaperNight));
                    }
                    t40Var.d();
                    t40Var.f(tc1Var.P1, true);
                    t40Var.setExtraTranslationY(-AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
        }
    }
}
