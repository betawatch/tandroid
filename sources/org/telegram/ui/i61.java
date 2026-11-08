package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ i61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        v71 v71Var = this.b;
        switch (i7) {
            case 0:
                v71Var.a0 = false;
                int i10 = v71Var.X;
                int i11 = v71Var.Y;
                org.telegram.ui.ActionBar.h6 h6Var = v71Var.w;
                int i12 = v71Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        h6Var.c = i10;
                        org.telegram.ui.ActionBar.k6.t1(false, false);
                    } else if (i11 == 1) {
                        h6Var.d = i10;
                        org.telegram.ui.ActionBar.k6.t1(true, true);
                        v71Var.v0.g1();
                        v71Var.W.setHasChanges(v71Var.Y0(v71Var.n));
                        v71Var.r1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        h6Var.j = i10;
                    } else if (i11 == 1) {
                        int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        if (i10 != 0 || E0 == 0) {
                            h6Var.k = i10;
                        } else {
                            h6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        if (i10 != 0 || E02 == 0) {
                            h6Var.l = i10;
                        } else {
                            h6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        if (i10 != 0 || E03 == 0) {
                            h6Var.m = i10;
                        } else {
                            h6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, false);
                    v71Var.W.setHasChanges(v71Var.Y0(v71Var.n));
                    v71Var.r1(true);
                } else if (i12 == 3) {
                    if (i11 == 0) {
                        h6Var.e = i10;
                    } else if (i11 == 1) {
                        h6Var.f = i10;
                    } else if (i11 == 2) {
                        int i13 = h6Var.g;
                        h6Var.g = i10;
                        if (i13 != 0 && i10 == 0) {
                            v71Var.w0.s(0);
                        } else if (i13 == 0 && i10 != 0) {
                            v71Var.w0.i(0);
                            v71Var.j1();
                        }
                    } else {
                        h6Var.h = i10;
                    }
                    int i14 = v71Var.Y;
                    if (i14 >= 0) {
                        v71Var.L0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    v71Var.v0.g1();
                    v71Var.W.setHasChanges(v71Var.Y0(v71Var.n));
                    v71Var.r1(true);
                }
                int size = v71Var.j0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) v71Var.j0.get(i15);
                    t6Var.e(v71Var.getThemedColor(t6Var.e), false, false);
                }
                v71Var.o0.g1();
                v71Var.v0.g1();
                fi.p5 p5Var = v71Var.b0;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                v71Var.Y = -1;
                break;
            case 1:
                v71Var.presentFragment(c51.g0(v71Var.getMessagesController().M0(Long.valueOf(-v71Var.K1)), true));
                break;
            case 2:
                v71Var.q1.t1(false);
                boolean a10 = v71Var.a.a();
                org.telegram.ui.Components.zg0 zg0Var = v71Var.O1;
                zg0Var.P(a10 ? zg0Var.e[0] : 0);
                org.telegram.ui.Components.zg0 zg0Var2 = v71Var.O1;
                if (zg0Var2 != null) {
                    zg0Var2.start();
                }
                v71Var.g1(false);
                v71Var.a1();
                v71Var.n1();
                if (v71Var.j0 != null) {
                    for (int i16 = 0; i16 < v71Var.j0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.t6) v71Var.j0.get(i16)).e(v71Var.getThemedColor(((org.telegram.ui.ActionBar.t6) v71Var.j0.get(i16)).e), false, false);
                    }
                }
                if (v71Var.N1) {
                    n71 n71Var = v71Var.q1;
                    if (n71Var == null || !n71Var.a()) {
                        v71Var.S1.a(0.0f);
                    } else {
                        v71Var.S1.setVisibility(0);
                        v71Var.S1.a(v71Var.o1);
                    }
                    ValueAnimator valueAnimator = v71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        v71Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v71Var.p1, v71Var.q1.a() ? 1.0f : 0.0f);
                    v71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new gz0(v71Var, 9));
                    v71Var.Q1.addListener(new a71(v71Var, 5));
                    v71Var.Q1.setDuration(250L);
                    v71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f);
                    v71Var.Q1.start();
                    break;
                }
                break;
            default:
                if (v71Var.getParentActivity() != null && v71Var.getParentActivity() != null) {
                    int i17 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i18 = org.telegram.messenger.iz.S + 1;
                    org.telegram.messenger.iz.S = i18;
                    edit.putInt("dayNightWallpaperSwitchHint", i18);
                    edit.apply();
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(7, v71Var.getParentActivity(), null, true);
                    y20Var.setAlpha(0.0f);
                    y20Var.setVisibility(4);
                    y20Var.setShowingDuration(4000L);
                    v71Var.l0.addView(y20Var, c8.ha.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (v71Var.q1.a()) {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746879, null));
                    } else {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746878, null));
                    }
                    y20Var.b();
                    y20Var.c(v71Var.P1);
                    y20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
