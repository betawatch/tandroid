package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t71 b;

    public /* synthetic */ f61(t71 t71Var, int i7) {
        this.a = i7;
        this.b = t71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        t71 t71Var = this.b;
        switch (i7) {
            case 0:
                t71Var.b0 = false;
                int i10 = t71Var.Y;
                int i11 = t71Var.Z;
                org.telegram.ui.ActionBar.g6 g6Var = t71Var.w;
                int i12 = t71Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        g6Var.c = i10;
                        org.telegram.ui.ActionBar.j6.t1(false, false);
                    } else if (i11 == 1) {
                        g6Var.d = i10;
                        org.telegram.ui.ActionBar.j6.t1(true, true);
                        t71Var.w0.g1();
                        t71Var.X.setHasChanges(t71Var.Y0(t71Var.n));
                        t71Var.r1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        g6Var.j = i10;
                    } else if (i11 == 1) {
                        int E0 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Fe);
                        if (i10 != 0 || E0 == 0) {
                            g6Var.k = i10;
                        } else {
                            g6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int E02 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.Ge);
                        if (i10 != 0 || E02 == 0) {
                            g6Var.l = i10;
                        } else {
                            g6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int E03 = org.telegram.ui.ActionBar.j6.E0(org.telegram.ui.ActionBar.j6.He);
                        if (i10 != 0 || E03 == 0) {
                            g6Var.m = i10;
                        } else {
                            g6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.j6.t1(true, false);
                    t71Var.X.setHasChanges(t71Var.Y0(t71Var.n));
                    t71Var.r1(true);
                } else if (i12 == 3) {
                    if (i11 == 0) {
                        g6Var.e = i10;
                    } else if (i11 == 1) {
                        g6Var.f = i10;
                    } else if (i11 == 2) {
                        int i13 = g6Var.g;
                        g6Var.g = i10;
                        if (i13 != 0 && i10 == 0) {
                            t71Var.x0.s(0);
                        } else if (i13 == 0 && i10 != 0) {
                            t71Var.x0.i(0);
                            t71Var.j1();
                        }
                    } else {
                        g6Var.h = i10;
                    }
                    int i14 = t71Var.Z;
                    if (i14 >= 0) {
                        t71Var.M0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.j6.t1(true, true);
                    t71Var.w0.g1();
                    t71Var.X.setHasChanges(t71Var.Y0(t71Var.n));
                    t71Var.r1(true);
                }
                int size = t71Var.k0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) t71Var.k0.get(i15);
                    s6Var.e(t71Var.getThemedColor(s6Var.e), false, false);
                }
                t71Var.p0.g1();
                t71Var.w0.g1();
                hi.n5 n5Var = t71Var.c0;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                t71Var.Z = -1;
                break;
            case 1:
                t71Var.presentFragment(z41.g0(t71Var.getMessagesController().M0(Long.valueOf(-t71Var.L1)), true));
                break;
            case 2:
                t71Var.r1.m1(false);
                boolean a10 = t71Var.a.a();
                org.telegram.ui.Components.ch0 ch0Var = t71Var.P1;
                ch0Var.P(a10 ? ch0Var.e[0] : 0);
                org.telegram.ui.Components.ch0 ch0Var2 = t71Var.P1;
                if (ch0Var2 != null) {
                    ch0Var2.start();
                }
                t71Var.g1(false);
                t71Var.a1();
                t71Var.n1();
                if (t71Var.k0 != null) {
                    for (int i16 = 0; i16 < t71Var.k0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.s6) t71Var.k0.get(i16)).e(t71Var.getThemedColor(((org.telegram.ui.ActionBar.s6) t71Var.k0.get(i16)).e), false, false);
                    }
                }
                if (t71Var.O1) {
                    l71 l71Var = t71Var.r1;
                    if (l71Var == null || !l71Var.a()) {
                        t71Var.T1.a(0.0f);
                    } else {
                        t71Var.T1.setVisibility(0);
                        t71Var.T1.a(t71Var.p1);
                    }
                    ValueAnimator valueAnimator = t71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        t71Var.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(t71Var.q1, t71Var.r1.a() ? 1.0f : 0.0f);
                    t71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new ez0(t71Var, 9));
                    t71Var.R1.addListener(new x61(t71Var, 5));
                    t71Var.R1.setDuration(250L);
                    t71Var.R1.setInterpolator(org.telegram.ui.Components.er.f);
                    t71Var.R1.start();
                    break;
                }
                break;
            default:
                if (t71Var.getParentActivity() != null && t71Var.getParentActivity() != null) {
                    int i17 = org.telegram.messenger.gz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    int i18 = org.telegram.messenger.gz.S + 1;
                    org.telegram.messenger.gz.S = i18;
                    edit.putInt("dayNightWallpaperSwitchHint", i18);
                    edit.apply();
                    org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(7, t71Var.getParentActivity(), null, true);
                    b30Var.setAlpha(0.0f);
                    b30Var.setVisibility(4);
                    b30Var.setShowingDuration(4000L);
                    t71Var.m0.addView(b30Var, c8.ja.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (t71Var.r1.a()) {
                        b30Var.setText(org.telegram.messenger.hd.M0(2131746878, null));
                    } else {
                        b30Var.setText(org.telegram.messenger.hd.M0(2131746877, null));
                    }
                    b30Var.b();
                    b30Var.c(t71Var.Q1);
                    b30Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
