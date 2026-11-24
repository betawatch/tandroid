// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gnb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rob b;

    public /* synthetic */ gnb(rob robVar, byte b) {
        this.a = b;
        this.b = robVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rob robVar = this.b;
        switch (b) {
            case 0:
                robVar.b0 = false;
                int i = robVar.Y;
                int i2 = robVar.Z;
                amb ambVar = robVar.w;
                int i3 = robVar.n;
                if (i3 == 1) {
                    if (i2 == 0) {
                        ambVar.c = i;
                        cmb.r1(false, false);
                    } else if (i2 == 1) {
                        ambVar.d = i;
                        cmb.r1(true, true);
                        robVar.w0.h1();
                        robVar.X.setHasChanges(robVar.V0(robVar.n));
                        robVar.r1(true);
                    }
                } else if (i3 == 2) {
                    if (i2 == 0) {
                        ambVar.j = i;
                    } else if (i2 == 1) {
                        int C0 = cmb.C0(cmb.Ee);
                        if (i != 0 || C0 == 0) {
                            ambVar.k = i;
                        } else {
                            ambVar.k = 4294967296L;
                        }
                    } else if (i2 == 2) {
                        int C02 = cmb.C0(cmb.Fe);
                        if (i != 0 || C02 == 0) {
                            ambVar.l = i;
                        } else {
                            ambVar.l = 4294967296L;
                        }
                    } else if (i2 == 3) {
                        int C03 = cmb.C0(cmb.Ge);
                        if (i != 0 || C03 == 0) {
                            ambVar.m = i;
                        } else {
                            ambVar.m = 4294967296L;
                        }
                    }
                    cmb.r1(true, false);
                    robVar.X.setHasChanges(robVar.V0(robVar.n));
                    robVar.r1(true);
                } else if (i3 == 3) {
                    if (i2 == 0) {
                        ambVar.e = i;
                    } else if (i2 == 1) {
                        ambVar.f = i;
                    } else if (i2 == 2) {
                        int i4 = ambVar.g;
                        ambVar.g = i;
                        if (i4 != 0) {
                            if (i == 0) {
                                robVar.x0.s(0);
                            }
                        } else if (i != 0) {
                            robVar.x0.i(0);
                            robVar.j1();
                        }
                    } else {
                        ambVar.h = i;
                    }
                    int i5 = robVar.Z;
                    if (i5 >= 0) {
                        robVar.M0[1].b(i5, i);
                    }
                    cmb.r1(true, true);
                    robVar.w0.h1();
                    robVar.X.setHasChanges(robVar.V0(robVar.n));
                    robVar.r1(true);
                }
                int size = robVar.k0.size();
                for (int i6 = 0; i6 < size; i6++) {
                    cnb cnbVar = (cnb) robVar.k0.get(i6);
                    cnbVar.e(robVar.getThemedColor(cnbVar.e), false, false);
                }
                robVar.p0.h1();
                robVar.w0.h1();
                a91 a91Var = robVar.c0;
                if (a91Var != null) {
                    a91Var.invalidate();
                }
                robVar.Z = -1;
                break;
            case 1:
                robVar.presentFragment(xza.e0(robVar.getMessagesController().L0(Long.valueOf(-robVar.L1)), true));
                break;
            case 2:
                robVar.r1.w(false);
                boolean a = robVar.a.a();
                p09 p09Var = robVar.P1;
                p09Var.K(a ? p09Var.e[0] : 0);
                p09 p09Var2 = robVar.P1;
                if (p09Var2 != null) {
                    p09Var2.start();
                }
                robVar.g1(false);
                robVar.X0();
                robVar.n1();
                if (robVar.k0 != null) {
                    for (int i7 = 0; i7 < robVar.k0.size(); i7++) {
                        ((cnb) robVar.k0.get(i7)).e(robVar.getThemedColor(((cnb) robVar.k0.get(i7)).e), false, false);
                    }
                }
                if (robVar.O1) {
                    job jobVar = robVar.r1;
                    if (jobVar == null || !jobVar.a()) {
                        robVar.T1.a(0.0f);
                    } else {
                        robVar.T1.setVisibility(0);
                        robVar.T1.a(robVar.p1);
                    }
                    ValueAnimator valueAnimator = robVar.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        robVar.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(robVar.q1, robVar.r1.a() ? 1.0f : 0.0f);
                    robVar.R1 = ofFloat;
                    ofFloat.addUpdateListener(new rha(robVar, (byte) 23));
                    robVar.R1.addListener(new wnb(robVar, (byte) 5));
                    robVar.R1.setDuration(250L);
                    robVar.R1.setInterpolator(d53.f);
                    robVar.R1.start();
                    break;
                }
                break;
            default:
                if (robVar.getParentActivity() != null && robVar.getParentActivity() != null) {
                    boolean z = gda.a;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    int i8 = gda.R + 1;
                    gda.R = i8;
                    edit.putInt("dayNightWallpaperSwitchHint", i8);
                    edit.apply();
                    ig5 ig5Var = new ig5(7, null, robVar.getParentActivity(), true);
                    ig5Var.setAlpha(0.0f);
                    ig5Var.setVisibility(4);
                    ig5Var.setShowingDuration(4000L);
                    robVar.m0.addView(ig5Var, qoe.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (robVar.r1.a()) {
                        ig5Var.setText(jb6.M0(2131746613, null));
                    } else {
                        ig5Var.setText(jb6.M0(2131746612, null));
                    }
                    ig5Var.b();
                    ig5Var.c(robVar.Q1);
                    ig5Var.setExtraTranslationY(-gm.L(14.0f));
                    break;
                }
                break;
        }
    }
}
