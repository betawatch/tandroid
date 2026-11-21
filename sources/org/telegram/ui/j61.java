package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ j61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x71 x71Var = this.b;
        switch (i7) {
            case 0:
                x71Var.b0 = false;
                int i10 = x71Var.Y;
                int i11 = x71Var.Z;
                org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
                int i12 = x71Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        j6Var.c = i10;
                        org.telegram.ui.ActionBar.m6.t1(false, false);
                    } else if (i11 == 1) {
                        j6Var.d = i10;
                        org.telegram.ui.ActionBar.m6.t1(true, true);
                        x71Var.w0.g1();
                        x71Var.X.setHasChanges(x71Var.Y0(x71Var.n));
                        x71Var.r1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        j6Var.j = i10;
                    } else if (i11 == 1) {
                        int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Fe);
                        if (i10 != 0 || E0 == 0) {
                            j6Var.k = i10;
                        } else {
                            j6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ge);
                        if (i10 != 0 || E02 == 0) {
                            j6Var.l = i10;
                        } else {
                            j6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.He);
                        if (i10 != 0 || E03 == 0) {
                            j6Var.m = i10;
                        } else {
                            j6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, false);
                    x71Var.X.setHasChanges(x71Var.Y0(x71Var.n));
                    x71Var.r1(true);
                } else if (i12 == 3) {
                    if (i11 == 0) {
                        j6Var.e = i10;
                    } else if (i11 == 1) {
                        j6Var.f = i10;
                    } else if (i11 == 2) {
                        int i13 = j6Var.g;
                        j6Var.g = i10;
                        if (i13 != 0 && i10 == 0) {
                            x71Var.x0.s(0);
                        } else if (i13 == 0 && i10 != 0) {
                            x71Var.x0.i(0);
                            x71Var.j1();
                        }
                    } else {
                        j6Var.h = i10;
                    }
                    int i14 = x71Var.Z;
                    if (i14 >= 0) {
                        x71Var.M0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, true);
                    x71Var.w0.g1();
                    x71Var.X.setHasChanges(x71Var.Y0(x71Var.n));
                    x71Var.r1(true);
                }
                int size = x71Var.k0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) x71Var.k0.get(i15);
                    v6Var.e(x71Var.getThemedColor(v6Var.e), false, false);
                }
                x71Var.p0.g1();
                x71Var.w0.g1();
                hi.l5 l5Var = x71Var.c0;
                if (l5Var != null) {
                    l5Var.invalidate();
                }
                x71Var.Z = -1;
                break;
            case 1:
                x71Var.presentFragment(c51.g0(x71Var.getMessagesController().O0(Long.valueOf(-x71Var.L1)), true));
                break;
            case 2:
                x71Var.r1.l1(false);
                boolean d = x71Var.a.d();
                org.telegram.ui.Components.oh0 oh0Var = x71Var.P1;
                oh0Var.P(d ? oh0Var.e[0] : 0);
                org.telegram.ui.Components.oh0 oh0Var2 = x71Var.P1;
                if (oh0Var2 != null) {
                    oh0Var2.start();
                }
                x71Var.g1(false);
                x71Var.a1();
                x71Var.n1();
                if (x71Var.k0 != null) {
                    for (int i16 = 0; i16 < x71Var.k0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.v6) x71Var.k0.get(i16)).e(x71Var.getThemedColor(((org.telegram.ui.ActionBar.v6) x71Var.k0.get(i16)).e), false, false);
                    }
                }
                if (x71Var.O1) {
                    p71 p71Var = x71Var.r1;
                    if (p71Var == null || !p71Var.d()) {
                        x71Var.T1.a(0.0f);
                    } else {
                        x71Var.T1.setVisibility(0);
                        x71Var.T1.a(x71Var.p1);
                    }
                    ValueAnimator valueAnimator = x71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        x71Var.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(x71Var.q1, x71Var.r1.d() ? 1.0f : 0.0f);
                    x71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new iz0(x71Var, 9));
                    x71Var.R1.addListener(new b71(x71Var, 5));
                    x71Var.R1.setDuration(250L);
                    x71Var.R1.setInterpolator(org.telegram.ui.Components.nr.f);
                    x71Var.R1.start();
                    break;
                }
                break;
            default:
                if (x71Var.getParentActivity() != null && x71Var.getParentActivity() != null) {
                    int i17 = org.telegram.messenger.bz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    int i18 = org.telegram.messenger.bz.S + 1;
                    org.telegram.messenger.bz.S = i18;
                    edit.putInt("dayNightWallpaperSwitchHint", i18);
                    edit.apply();
                    org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(7, x71Var.getParentActivity(), null, true);
                    m30Var.setAlpha(0.0f);
                    m30Var.setVisibility(4);
                    m30Var.setShowingDuration(4000L);
                    x71Var.m0.addView(m30Var, c8.ma.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (x71Var.r1.d()) {
                        m30Var.setText(org.telegram.messenger.gd.N0(2131746684, null));
                    } else {
                        m30Var.setText(org.telegram.messenger.gd.N0(2131746683, null));
                    }
                    m30Var.b();
                    m30Var.c(x71Var.Q1);
                    m30Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
