// default package

import android.animation.ValueAnimator;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class epb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqb b;

    public /* synthetic */ epb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pqb pqbVar = this.b;
        switch (b) {
            case 0:
                pqbVar.b0 = false;
                int i = pqbVar.Y;
                int i2 = pqbVar.Z;
                ynb ynbVar = pqbVar.w;
                int i3 = pqbVar.n;
                if (i3 == 1) {
                    if (i2 == 0) {
                        ynbVar.c = i;
                        aob.r1(false, false);
                    } else if (i2 == 1) {
                        ynbVar.d = i;
                        aob.r1(true, true);
                        pqbVar.w0.i1();
                        pqbVar.X.setHasChanges(pqbVar.V0(pqbVar.n));
                        pqbVar.r1(true);
                    }
                } else if (i3 == 2) {
                    if (i2 == 0) {
                        ynbVar.j = i;
                    } else if (i2 == 1) {
                        int C0 = aob.C0(aob.Fe);
                        if (i != 0 || C0 == 0) {
                            ynbVar.k = i;
                        } else {
                            ynbVar.k = 4294967296L;
                        }
                    } else if (i2 == 2) {
                        int C02 = aob.C0(aob.Ge);
                        if (i != 0 || C02 == 0) {
                            ynbVar.l = i;
                        } else {
                            ynbVar.l = 4294967296L;
                        }
                    } else if (i2 == 3) {
                        int C03 = aob.C0(aob.He);
                        if (i != 0 || C03 == 0) {
                            ynbVar.m = i;
                        } else {
                            ynbVar.m = 4294967296L;
                        }
                    }
                    aob.r1(true, false);
                    pqbVar.X.setHasChanges(pqbVar.V0(pqbVar.n));
                    pqbVar.r1(true);
                } else if (i3 == 3) {
                    if (i2 == 0) {
                        ynbVar.e = i;
                    } else if (i2 == 1) {
                        ynbVar.f = i;
                    } else if (i2 == 2) {
                        int i4 = ynbVar.g;
                        ynbVar.g = i;
                        if (i4 != 0) {
                            if (i == 0) {
                                pqbVar.x0.s(0);
                            }
                        } else if (i != 0) {
                            pqbVar.x0.i(0);
                            pqbVar.j1();
                        }
                    } else {
                        ynbVar.h = i;
                    }
                    int i5 = pqbVar.Z;
                    if (i5 >= 0) {
                        pqbVar.M0[1].b(i5, i);
                    }
                    aob.r1(true, true);
                    pqbVar.w0.i1();
                    pqbVar.X.setHasChanges(pqbVar.V0(pqbVar.n));
                    pqbVar.r1(true);
                }
                int size = pqbVar.k0.size();
                for (int i6 = 0; i6 < size; i6++) {
                    apb apbVar = (apb) pqbVar.k0.get(i6);
                    apbVar.e(pqbVar.getThemedColor(apbVar.e), false, false);
                }
                pqbVar.p0.i1();
                pqbVar.w0.i1();
                a81 a81Var = pqbVar.c0;
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                pqbVar.Z = -1;
                break;
            case 1:
                pqbVar.presentFragment(w1b.d0(pqbVar.getMessagesController().M0(Long.valueOf(-pqbVar.L1)), true));
                break;
            case 2:
                pqbVar.r1.w(false);
                boolean a = pqbVar.a.a();
                b29 b29Var = pqbVar.P1;
                b29Var.K(a ? b29Var.e[0] : 0);
                b29 b29Var2 = pqbVar.P1;
                if (b29Var2 != null) {
                    b29Var2.start();
                }
                pqbVar.g1(false);
                pqbVar.X0();
                pqbVar.n1();
                if (pqbVar.k0 != null) {
                    for (int i7 = 0; i7 < pqbVar.k0.size(); i7++) {
                        ((apb) pqbVar.k0.get(i7)).e(pqbVar.getThemedColor(((apb) pqbVar.k0.get(i7)).e), false, false);
                    }
                }
                if (pqbVar.O1) {
                    hqb hqbVar = pqbVar.r1;
                    if (hqbVar == null || !hqbVar.a()) {
                        pqbVar.T1.a(0.0f);
                    } else {
                        pqbVar.T1.setVisibility(0);
                        pqbVar.T1.a(pqbVar.p1);
                    }
                    ValueAnimator valueAnimator = pqbVar.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pqbVar.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(pqbVar.q1, pqbVar.r1.a() ? 1.0f : 0.0f);
                    pqbVar.R1 = ofFloat;
                    ofFloat.addUpdateListener(new ija(pqbVar, (byte) 23));
                    pqbVar.R1.addListener(new upb(pqbVar, (byte) 5));
                    pqbVar.R1.setDuration(250L);
                    pqbVar.R1.setInterpolator(k43.f);
                    pqbVar.R1.start();
                    break;
                }
                break;
            default:
                if (pqbVar.getParentActivity() != null && pqbVar.getParentActivity() != null) {
                    boolean z = xea.a;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    int i8 = xea.R + 1;
                    xea.R = i8;
                    edit.putInt("dayNightWallpaperSwitchHint", i8);
                    edit.apply();
                    lg5 lg5Var = new lg5(7, null, pqbVar.getParentActivity(), true);
                    lg5Var.setAlpha(0.0f);
                    lg5Var.setVisibility(4);
                    lg5Var.setShowingDuration(4000L);
                    pqbVar.m0.addView(lg5Var, tre.d(-2, -2.0f, 51, 4.0f, 0.0f, 4.0f, 0.0f));
                    if (pqbVar.r1.a()) {
                        lg5Var.setText(ob6.M0(2131746607, null));
                    } else {
                        lg5Var.setText(ob6.M0(2131746606, null));
                    }
                    lg5Var.b();
                    lg5Var.c(pqbVar.Q1);
                    lg5Var.setExtraTranslationY(-hl.L(14.0f));
                    break;
                }
                break;
        }
    }
}
