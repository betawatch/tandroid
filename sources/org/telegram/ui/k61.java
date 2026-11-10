package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ k61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x71 x71Var = this.b;
        switch (i7) {
            case 0:
                x71Var.a0 = false;
                int i10 = x71Var.X;
                int i11 = x71Var.Y;
                org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
                int i12 = x71Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        j6Var.c = i10;
                        org.telegram.ui.ActionBar.m6.t1(false, false);
                    } else if (i11 == 1) {
                        j6Var.d = i10;
                        org.telegram.ui.ActionBar.m6.t1(true, true);
                        x71Var.v0.g1();
                        x71Var.W.setHasChanges(x71Var.Y0(x71Var.n));
                        x71Var.r1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        j6Var.j = i10;
                    } else if (i11 == 1) {
                        int E0 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ce);
                        if (i10 != 0 || E0 == 0) {
                            j6Var.k = i10;
                        } else {
                            j6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int E02 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.De);
                        if (i10 != 0 || E02 == 0) {
                            j6Var.l = i10;
                        } else {
                            j6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int E03 = org.telegram.ui.ActionBar.m6.E0(org.telegram.ui.ActionBar.m6.Ee);
                        if (i10 != 0 || E03 == 0) {
                            j6Var.m = i10;
                        } else {
                            j6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, false);
                    x71Var.W.setHasChanges(x71Var.Y0(x71Var.n));
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
                            x71Var.w0.s(0);
                        } else if (i13 == 0 && i10 != 0) {
                            x71Var.w0.i(0);
                            x71Var.j1();
                        }
                    } else {
                        j6Var.h = i10;
                    }
                    int i14 = x71Var.Y;
                    if (i14 >= 0) {
                        x71Var.L0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.m6.t1(true, true);
                    x71Var.v0.g1();
                    x71Var.W.setHasChanges(x71Var.Y0(x71Var.n));
                    x71Var.r1(true);
                }
                int size = x71Var.j0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) x71Var.j0.get(i15);
                    v6Var.e(x71Var.getThemedColor(v6Var.e), false, false);
                }
                x71Var.o0.g1();
                x71Var.v0.g1();
                fi.p5 p5Var = x71Var.b0;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                x71Var.Y = -1;
                break;
            case 1:
                x71Var.presentFragment(e51.g0(x71Var.getMessagesController().M0(Long.valueOf(-x71Var.K1)), true));
                break;
            case 2:
                x71Var.q1.t1(false);
                boolean a10 = x71Var.a.a();
                org.telegram.ui.Components.zg0 zg0Var = x71Var.O1;
                zg0Var.P(a10 ? zg0Var.e[0] : 0);
                org.telegram.ui.Components.zg0 zg0Var2 = x71Var.O1;
                if (zg0Var2 != null) {
                    zg0Var2.start();
                }
                x71Var.g1(false);
                x71Var.a1();
                x71Var.n1();
                if (x71Var.j0 != null) {
                    for (int i16 = 0; i16 < x71Var.j0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.v6) x71Var.j0.get(i16)).e(x71Var.getThemedColor(((org.telegram.ui.ActionBar.v6) x71Var.j0.get(i16)).e), false, false);
                    }
                }
                if (x71Var.N1) {
                    p71 p71Var = x71Var.q1;
                    if (p71Var == null || !p71Var.a()) {
                        x71Var.S1.a(0.0f);
                    } else {
                        x71Var.S1.setVisibility(0);
                        x71Var.S1.a(x71Var.o1);
                    }
                    ValueAnimator valueAnimator = x71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        x71Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(x71Var.p1, x71Var.q1.a() ? 1.0f : 0.0f);
                    x71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new kz0(x71Var, 9));
                    x71Var.Q1.addListener(new c71(x71Var, 5));
                    x71Var.Q1.setDuration(250L);
                    x71Var.Q1.setInterpolator(org.telegram.ui.Components.wq.f);
                    x71Var.Q1.start();
                    break;
                }
                break;
            default:
                if (x71Var.getParentActivity() != null && x71Var.getParentActivity() != null) {
                    int i17 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i18 = org.telegram.messenger.iz.S + 1;
                    org.telegram.messenger.iz.S = i18;
                    edit.putInt("dayNightWallpaperSwitchHint", i18);
                    edit.apply();
                    org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(7, x71Var.getParentActivity(), null, true);
                    y20Var.setAlpha(0.0f);
                    y20Var.setVisibility(4);
                    y20Var.setShowingDuration(4000L);
                    x71Var.l0.addView(y20Var, c8.ha.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (x71Var.q1.a()) {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746878, null));
                    } else {
                        y20Var.setText(org.telegram.messenger.id.M0(2131746877, null));
                    }
                    y20Var.b();
                    y20Var.c(x71Var.P1);
                    y20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
