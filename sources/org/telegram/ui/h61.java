package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ h61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        v71 v71Var = this.b;
        switch (i7) {
            case 0:
                v71Var.b0 = false;
                int i10 = v71Var.Y;
                int i11 = v71Var.Z;
                org.telegram.ui.ActionBar.k6 k6Var = v71Var.w;
                int i12 = v71Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        k6Var.c = i10;
                        org.telegram.ui.ActionBar.n6.t1(false, false);
                    } else if (i11 == 1) {
                        k6Var.d = i10;
                        org.telegram.ui.ActionBar.n6.t1(true, true);
                        v71Var.w0.g1();
                        v71Var.X.setHasChanges(v71Var.Y0(v71Var.n));
                        v71Var.r1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        k6Var.j = i10;
                    } else if (i11 == 1) {
                        int E0 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Fe);
                        if (i10 != 0 || E0 == 0) {
                            k6Var.k = i10;
                        } else {
                            k6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int E02 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.Ge);
                        if (i10 != 0 || E02 == 0) {
                            k6Var.l = i10;
                        } else {
                            k6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int E03 = org.telegram.ui.ActionBar.n6.E0(org.telegram.ui.ActionBar.n6.He);
                        if (i10 != 0 || E03 == 0) {
                            k6Var.m = i10;
                        } else {
                            k6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.n6.t1(true, false);
                    v71Var.X.setHasChanges(v71Var.Y0(v71Var.n));
                    v71Var.r1(true);
                } else if (i12 == 3) {
                    if (i11 == 0) {
                        k6Var.e = i10;
                    } else if (i11 == 1) {
                        k6Var.f = i10;
                    } else if (i11 == 2) {
                        int i13 = k6Var.g;
                        k6Var.g = i10;
                        if (i13 != 0 && i10 == 0) {
                            v71Var.x0.s(0);
                        } else if (i13 == 0 && i10 != 0) {
                            v71Var.x0.i(0);
                            v71Var.j1();
                        }
                    } else {
                        k6Var.h = i10;
                    }
                    int i14 = v71Var.Z;
                    if (i14 >= 0) {
                        v71Var.M0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.n6.t1(true, true);
                    v71Var.w0.g1();
                    v71Var.X.setHasChanges(v71Var.Y0(v71Var.n));
                    v71Var.r1(true);
                }
                int size = v71Var.k0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) v71Var.k0.get(i15);
                    w6Var.e(v71Var.getThemedColor(w6Var.e), false, false);
                }
                v71Var.p0.g1();
                v71Var.w0.g1();
                hi.w5 w5Var = v71Var.c0;
                if (w5Var != null) {
                    w5Var.invalidate();
                }
                v71Var.Z = -1;
                break;
            case 1:
                v71Var.presentFragment(b51.g0(v71Var.getMessagesController().O0(Long.valueOf(-v71Var.L1)), true));
                break;
            case 2:
                v71Var.r1.b1(false);
                boolean b10 = v71Var.a.b();
                org.telegram.ui.Components.nh0 nh0Var = v71Var.P1;
                nh0Var.P(b10 ? nh0Var.e[0] : 0);
                org.telegram.ui.Components.nh0 nh0Var2 = v71Var.P1;
                if (nh0Var2 != null) {
                    nh0Var2.start();
                }
                v71Var.g1(false);
                v71Var.a1();
                v71Var.n1();
                if (v71Var.k0 != null) {
                    for (int i16 = 0; i16 < v71Var.k0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.w6) v71Var.k0.get(i16)).e(v71Var.getThemedColor(((org.telegram.ui.ActionBar.w6) v71Var.k0.get(i16)).e), false, false);
                    }
                }
                if (v71Var.O1) {
                    n71 n71Var = v71Var.r1;
                    if (n71Var == null || !n71Var.b()) {
                        v71Var.T1.a(0.0f);
                    } else {
                        v71Var.T1.setVisibility(0);
                        v71Var.T1.a(v71Var.p1);
                    }
                    ValueAnimator valueAnimator = v71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        v71Var.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v71Var.q1, v71Var.r1.b() ? 1.0f : 0.0f);
                    v71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new hz0(v71Var, 9));
                    v71Var.R1.addListener(new z61(v71Var, 5));
                    v71Var.R1.setDuration(250L);
                    v71Var.R1.setInterpolator(org.telegram.ui.Components.kr.f);
                    v71Var.R1.start();
                    break;
                }
                break;
            default:
                if (v71Var.getParentActivity() != null && v71Var.getParentActivity() != null) {
                    int i17 = org.telegram.messenger.bz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    int i18 = org.telegram.messenger.bz.S + 1;
                    org.telegram.messenger.bz.S = i18;
                    edit.putInt("dayNightWallpaperSwitchHint", i18);
                    edit.apply();
                    org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(7, v71Var.getParentActivity(), null, true);
                    j30Var.setAlpha(0.0f);
                    j30Var.setVisibility(4);
                    j30Var.setShowingDuration(4000L);
                    v71Var.m0.addView(j30Var, c8.na.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (v71Var.r1.b()) {
                        j30Var.setText(org.telegram.messenger.gd.N0(2131746684, null));
                    } else {
                        j30Var.setText(org.telegram.messenger.gd.N0(2131746683, null));
                    }
                    j30Var.b();
                    j30Var.c(v71Var.Q1);
                    j30Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
