package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ j61(w71 w71Var, int i7) {
        this.a = i7;
        this.b = w71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        w71 w71Var = this.b;
        switch (i7) {
            case 0:
                w71Var.a0 = false;
                int i10 = w71Var.X;
                int i11 = w71Var.Y;
                org.telegram.ui.ActionBar.i6 i6Var = w71Var.w;
                int i12 = w71Var.n;
                if (i12 == 1) {
                    if (i11 == 0) {
                        i6Var.c = i10;
                        org.telegram.ui.ActionBar.l6.t1(false, false);
                    } else if (i11 == 1) {
                        i6Var.d = i10;
                        org.telegram.ui.ActionBar.l6.t1(true, true);
                        w71Var.v0.g1();
                        w71Var.W.setHasChanges(w71Var.Y0(w71Var.n));
                        w71Var.r1(true);
                    }
                } else if (i12 == 2) {
                    if (i11 == 0) {
                        i6Var.j = i10;
                    } else if (i11 == 1) {
                        int E0 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ce);
                        if (i10 != 0 || E0 == 0) {
                            i6Var.k = i10;
                        } else {
                            i6Var.k = 4294967296L;
                        }
                    } else if (i11 == 2) {
                        int E02 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.De);
                        if (i10 != 0 || E02 == 0) {
                            i6Var.l = i10;
                        } else {
                            i6Var.l = 4294967296L;
                        }
                    } else if (i11 == 3) {
                        int E03 = org.telegram.ui.ActionBar.l6.E0(org.telegram.ui.ActionBar.l6.Ee);
                        if (i10 != 0 || E03 == 0) {
                            i6Var.m = i10;
                        } else {
                            i6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.l6.t1(true, false);
                    w71Var.W.setHasChanges(w71Var.Y0(w71Var.n));
                    w71Var.r1(true);
                } else if (i12 == 3) {
                    if (i11 == 0) {
                        i6Var.e = i10;
                    } else if (i11 == 1) {
                        i6Var.f = i10;
                    } else if (i11 == 2) {
                        int i13 = i6Var.g;
                        i6Var.g = i10;
                        if (i13 != 0 && i10 == 0) {
                            w71Var.w0.s(0);
                        } else if (i13 == 0 && i10 != 0) {
                            w71Var.w0.i(0);
                            w71Var.j1();
                        }
                    } else {
                        i6Var.h = i10;
                    }
                    int i14 = w71Var.Y;
                    if (i14 >= 0) {
                        w71Var.L0[1].b(i14, i10);
                    }
                    org.telegram.ui.ActionBar.l6.t1(true, true);
                    w71Var.v0.g1();
                    w71Var.W.setHasChanges(w71Var.Y0(w71Var.n));
                    w71Var.r1(true);
                }
                int size = w71Var.j0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) w71Var.j0.get(i15);
                    u6Var.e(w71Var.getThemedColor(u6Var.e), false, false);
                }
                w71Var.o0.g1();
                w71Var.v0.g1();
                fi.p5 p5Var = w71Var.b0;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                w71Var.Y = -1;
                break;
            case 1:
                w71Var.presentFragment(d51.g0(w71Var.getMessagesController().M0(Long.valueOf(-w71Var.K1)), true));
                break;
            case 2:
                w71Var.q1.t1(false);
                boolean a10 = w71Var.a.a();
                org.telegram.ui.Components.ah0 ah0Var = w71Var.O1;
                ah0Var.P(a10 ? ah0Var.e[0] : 0);
                org.telegram.ui.Components.ah0 ah0Var2 = w71Var.O1;
                if (ah0Var2 != null) {
                    ah0Var2.start();
                }
                w71Var.g1(false);
                w71Var.a1();
                w71Var.n1();
                if (w71Var.j0 != null) {
                    for (int i16 = 0; i16 < w71Var.j0.size(); i16++) {
                        ((org.telegram.ui.ActionBar.u6) w71Var.j0.get(i16)).e(w71Var.getThemedColor(((org.telegram.ui.ActionBar.u6) w71Var.j0.get(i16)).e), false, false);
                    }
                }
                if (w71Var.N1) {
                    o71 o71Var = w71Var.q1;
                    if (o71Var == null || !o71Var.a()) {
                        w71Var.S1.a(0.0f);
                    } else {
                        w71Var.S1.setVisibility(0);
                        w71Var.S1.a(w71Var.o1);
                    }
                    ValueAnimator valueAnimator = w71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        w71Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(w71Var.p1, w71Var.q1.a() ? 1.0f : 0.0f);
                    w71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new jz0(w71Var, 9));
                    w71Var.Q1.addListener(new b71(w71Var, 5));
                    w71Var.Q1.setDuration(250L);
                    w71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f);
                    w71Var.Q1.start();
                    break;
                }
                break;
            default:
                if (w71Var.getParentActivity() != null && w71Var.getParentActivity() != null) {
                    int i17 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    int i18 = org.telegram.messenger.iz.S + 1;
                    org.telegram.messenger.iz.S = i18;
                    edit.putInt("dayNightWallpaperSwitchHint", i18);
                    edit.apply();
                    org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(7, w71Var.getParentActivity(), null, true);
                    z20Var.setAlpha(0.0f);
                    z20Var.setVisibility(4);
                    z20Var.setShowingDuration(4000L);
                    w71Var.l0.addView(z20Var, c8.ha.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (w71Var.q1.a()) {
                        z20Var.setText(org.telegram.messenger.id.M0(2131746878, null));
                    } else {
                        z20Var.setText(org.telegram.messenger.id.M0(2131746877, null));
                    }
                    z20Var.b();
                    z20Var.c(w71Var.P1);
                    z20Var.setExtraTranslationY(-org.telegram.messenger.g0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
