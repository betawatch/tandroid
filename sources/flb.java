// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class flb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qmb b;

    public /* synthetic */ flb(qmb qmbVar, byte b) {
        this.a = b;
        this.b = qmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qmb qmbVar = this.b;
        switch (b) {
            case 0:
                qmbVar.b0 = false;
                int i = qmbVar.Y;
                int i2 = qmbVar.Z;
                zjb zjbVar = qmbVar.w;
                int i3 = qmbVar.n;
                if (i3 == 1) {
                    if (i2 == 0) {
                        zjbVar.c = i;
                        bkb.r1(false, false);
                    } else if (i2 == 1) {
                        zjbVar.d = i;
                        bkb.r1(true, true);
                        qmbVar.w0.h1();
                        qmbVar.X.setHasChanges(qmbVar.U0(qmbVar.n));
                        qmbVar.q1(true);
                    }
                } else if (i3 == 2) {
                    if (i2 == 0) {
                        zjbVar.j = i;
                    } else if (i2 == 1) {
                        int C0 = bkb.C0(bkb.Ee);
                        if (i != 0 || C0 == 0) {
                            zjbVar.k = i;
                        } else {
                            zjbVar.k = 4294967296L;
                        }
                    } else if (i2 == 2) {
                        int C02 = bkb.C0(bkb.Fe);
                        if (i != 0 || C02 == 0) {
                            zjbVar.l = i;
                        } else {
                            zjbVar.l = 4294967296L;
                        }
                    } else if (i2 == 3) {
                        int C03 = bkb.C0(bkb.Ge);
                        if (i != 0 || C03 == 0) {
                            zjbVar.m = i;
                        } else {
                            zjbVar.m = 4294967296L;
                        }
                    }
                    bkb.r1(true, false);
                    qmbVar.X.setHasChanges(qmbVar.U0(qmbVar.n));
                    qmbVar.q1(true);
                } else if (i3 == 3) {
                    if (i2 == 0) {
                        zjbVar.e = i;
                    } else if (i2 == 1) {
                        zjbVar.f = i;
                    } else if (i2 == 2) {
                        int i4 = zjbVar.g;
                        zjbVar.g = i;
                        if (i4 != 0) {
                            if (i == 0) {
                                qmbVar.x0.r(0);
                            }
                        } else if (i != 0) {
                            qmbVar.x0.i(0);
                            qmbVar.i1();
                        }
                    } else {
                        zjbVar.h = i;
                    }
                    int i5 = qmbVar.Z;
                    if (i5 >= 0) {
                        qmbVar.M0[1].b(i5, i);
                    }
                    bkb.r1(true, true);
                    qmbVar.w0.h1();
                    qmbVar.X.setHasChanges(qmbVar.U0(qmbVar.n));
                    qmbVar.q1(true);
                }
                int size = qmbVar.k0.size();
                for (int i6 = 0; i6 < size; i6++) {
                    blb blbVar = (blb) qmbVar.k0.get(i6);
                    blbVar.e(qmbVar.getThemedColor(blbVar.e), false, false);
                }
                qmbVar.p0.h1();
                qmbVar.w0.h1();
                s71 s71Var = qmbVar.c0;
                if (s71Var != null) {
                    s71Var.invalidate();
                }
                qmbVar.Z = -1;
                break;
            case 1:
                qmbVar.presentFragment(uxa.d0(qmbVar.getMessagesController().K0(Long.valueOf(-qmbVar.L1)), true));
                break;
            case 2:
                qmbVar.r1.E(false);
                boolean a = qmbVar.a.a();
                oy8 oy8Var = qmbVar.P1;
                oy8Var.K(a ? oy8Var.e[0] : 0);
                oy8 oy8Var2 = qmbVar.P1;
                if (oy8Var2 != null) {
                    oy8Var2.start();
                }
                qmbVar.f1(false);
                qmbVar.W0();
                qmbVar.m1();
                if (qmbVar.k0 != null) {
                    for (int i7 = 0; i7 < qmbVar.k0.size(); i7++) {
                        ((blb) qmbVar.k0.get(i7)).e(qmbVar.getThemedColor(((blb) qmbVar.k0.get(i7)).e), false, false);
                    }
                }
                if (qmbVar.O1) {
                    imb imbVar = qmbVar.r1;
                    if (imbVar == null || !imbVar.a()) {
                        qmbVar.T1.a(0.0f);
                    } else {
                        qmbVar.T1.setVisibility(0);
                        qmbVar.T1.a(qmbVar.p1);
                    }
                    ValueAnimator valueAnimator = qmbVar.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        qmbVar.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(qmbVar.q1, qmbVar.r1.a() ? 1.0f : 0.0f);
                    qmbVar.R1 = ofFloat;
                    ofFloat.addUpdateListener(new gja(qmbVar, (byte) 21));
                    qmbVar.R1.addListener(new vlb(qmbVar, (byte) 5));
                    qmbVar.R1.setDuration(250L);
                    qmbVar.R1.setInterpolator(s33.f);
                    qmbVar.R1.start();
                    break;
                }
                break;
            default:
                if (qmbVar.getParentActivity() != null && qmbVar.getParentActivity() != null) {
                    boolean z = gba.a;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    int i8 = gba.R + 1;
                    gba.R = i8;
                    edit.putInt("dayNightWallpaperSwitchHint", i8);
                    edit.apply();
                    ke5 ke5Var = new ke5(7, null, qmbVar.getParentActivity(), true);
                    ke5Var.setAlpha(0.0f);
                    ke5Var.setVisibility(4);
                    ke5Var.setShowingDuration(4000L);
                    qmbVar.m0.addView(ke5Var, nme.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (qmbVar.r1.a()) {
                        ke5Var.setText(k96.M0(2131746687, null));
                    } else {
                        ke5Var.setText(k96.M0(2131746686, null));
                    }
                    ke5Var.b();
                    ke5Var.c(qmbVar.Q1);
                    ke5Var.setExtraTranslationY(-gl.L(14.0f));
                    break;
                }
                break;
        }
    }
}
