package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ a81(m91 m91Var, int i10) {
        this.a = i10;
        this.b = m91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        m91 m91Var = this.b;
        switch (i10) {
            case 0:
                m91Var.a0 = false;
                int i11 = m91Var.X;
                int i12 = m91Var.Y;
                org.telegram.ui.ActionBar.r6 r6Var = m91Var.w;
                int i13 = m91Var.n;
                if (i13 == 1) {
                    if (i12 == 0) {
                        r6Var.c = i11;
                        org.telegram.ui.ActionBar.t6.t1(false, false);
                    } else if (i12 == 1) {
                        r6Var.d = i11;
                        org.telegram.ui.ActionBar.t6.t1(true, true);
                        m91Var.v0.g1();
                        m91Var.W.setHasChanges(m91Var.X0(m91Var.n));
                        m91Var.q1(true);
                    }
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        r6Var.j = i11;
                    } else if (i12 == 1) {
                        int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                        if (i11 != 0 || E0 == 0) {
                            r6Var.k = i11;
                        } else {
                            r6Var.k = 4294967296L;
                        }
                    } else if (i12 == 2) {
                        int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                        if (i11 != 0 || E02 == 0) {
                            r6Var.l = i11;
                        } else {
                            r6Var.l = 4294967296L;
                        }
                    } else if (i12 == 3) {
                        int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                        if (i11 != 0 || E03 == 0) {
                            r6Var.m = i11;
                        } else {
                            r6Var.m = 4294967296L;
                        }
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, false);
                    m91Var.W.setHasChanges(m91Var.X0(m91Var.n));
                    m91Var.q1(true);
                } else if (i13 == 3) {
                    if (i12 == 0) {
                        r6Var.e = i11;
                    } else if (i12 == 1) {
                        r6Var.f = i11;
                    } else if (i12 == 2) {
                        int i14 = r6Var.g;
                        r6Var.g = i11;
                        if (i14 != 0 && i11 == 0) {
                            m91Var.w0.s(0);
                        } else if (i14 == 0 && i11 != 0) {
                            m91Var.w0.i(0);
                            m91Var.i1();
                        }
                    } else {
                        r6Var.h = i11;
                    }
                    int i15 = m91Var.Y;
                    if (i15 >= 0) {
                        m91Var.L0[1].b(i15, i11);
                    }
                    org.telegram.ui.ActionBar.t6.t1(true, true);
                    m91Var.v0.g1();
                    m91Var.W.setHasChanges(m91Var.X0(m91Var.n));
                    m91Var.q1(true);
                }
                int size = m91Var.j0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) m91Var.j0.get(i16);
                    c7Var.e(m91Var.getThemedColor(c7Var.e), false, false);
                }
                m91Var.o0.g1();
                m91Var.v0.g1();
                kg.f0 f0Var = m91Var.b0;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                m91Var.Y = -1;
                break;
            case 1:
                m91Var.presentFragment(u61.f0(m91Var.getMessagesController().L0(Long.valueOf(-m91Var.K1)), true));
                break;
            case 2:
                m91Var.q1.M1(false);
                boolean a2 = m91Var.a.a();
                org.telegram.ui.Components.bi0 bi0Var = m91Var.O1;
                bi0Var.P(a2 ? bi0Var.e[0] : 0);
                org.telegram.ui.Components.bi0 bi0Var2 = m91Var.O1;
                if (bi0Var2 != null) {
                    bi0Var2.start();
                }
                m91Var.f1(false);
                m91Var.Z0();
                m91Var.m1();
                if (m91Var.j0 != null) {
                    for (int i17 = 0; i17 < m91Var.j0.size(); i17++) {
                        ((org.telegram.ui.ActionBar.c7) m91Var.j0.get(i17)).e(m91Var.getThemedColor(((org.telegram.ui.ActionBar.c7) m91Var.j0.get(i17)).e), false, false);
                    }
                }
                if (m91Var.N1) {
                    e91 e91Var = m91Var.q1;
                    if (e91Var == null || !e91Var.a()) {
                        m91Var.S1.a(0.0f);
                    } else {
                        m91Var.S1.setVisibility(0);
                        m91Var.S1.a(m91Var.o1);
                    }
                    ValueAnimator valueAnimator = m91Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        m91Var.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(m91Var.p1, m91Var.q1.a() ? 1.0f : 0.0f);
                    m91Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new u01(m91Var, 9));
                    m91Var.Q1.addListener(new r81(m91Var, 5));
                    m91Var.Q1.setDuration(250L);
                    m91Var.Q1.setInterpolator(org.telegram.ui.Components.gr.f);
                    m91Var.Q1.start();
                    break;
                }
                break;
            default:
                if (m91Var.getParentActivity() != null && m91Var.getParentActivity() != null) {
                    int i18 = org.telegram.messenger.tz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    int i19 = org.telegram.messenger.tz.S + 1;
                    org.telegram.messenger.tz.S = i19;
                    edit.putInt("dayNightWallpaperSwitchHint", i19);
                    edit.apply();
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(7, m91Var.getParentActivity(), null, true);
                    q30Var.setAlpha(0.0f);
                    q30Var.setVisibility(4);
                    q30Var.setShowingDuration(4000L);
                    m91Var.l0.addView(q30Var, w7.b6.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (m91Var.q1.a()) {
                        q30Var.setText(org.telegram.messenger.cd.L0(2131746893, null));
                    } else {
                        q30Var.setText(org.telegram.messenger.cd.L0(2131746892, null));
                    }
                    q30Var.d();
                    q30Var.f(m91Var.P1, true);
                    q30Var.setExtraTranslationY(-org.telegram.messenger.i0.L(14.0f));
                    break;
                }
                break;
        }
    }
}
