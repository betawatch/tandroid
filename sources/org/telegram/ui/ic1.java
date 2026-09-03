package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ic1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ jd1 c;

    public /* synthetic */ ic1(jd1 jd1Var, int i10) {
        this.a = i10;
        this.c = jd1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jd1 jd1Var = this.c;
                jd1Var.C0.setRotation(this.b);
                this.b -= 45;
                jd1Var.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.mr.g).start();
                yc1[] yc1VarArr = jd1Var.t0;
                yc1 yc1Var = yc1VarArr[0];
                if (yc1Var != null) {
                    Drawable background = yc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.ec0) {
                        ((org.telegram.ui.Components.ec0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = jd1Var.s;
                        if (jd1Var.b == 2) {
                            jd1Var.e1 += 45;
                            while (true) {
                                int i10 = jd1Var.e1;
                                if (i10 >= 360) {
                                    jd1Var.e1 = i10 - 360;
                                } else {
                                    jd1Var.a1(jd1Var.W0, 0, true);
                                }
                            }
                        } else if (h6Var != null) {
                            h6Var.n += 45;
                            while (true) {
                                int i11 = h6Var.n;
                                if (i11 >= 360) {
                                    h6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.j6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                yc1 yc1Var2 = yc1VarArr[1];
                if (yc1Var2 != null) {
                    Drawable background2 = yc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.ec0) {
                        ((org.telegram.ui.Components.ec0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                jd1 jd1Var2 = this.c;
                org.telegram.ui.ActionBar.q5 q5Var = jd1Var2.O;
                jd1Var2.D0.setRotation(this.b);
                this.b -= 45;
                jd1Var2.D0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.mr.g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = jd1Var2.s;
                if (!h6Var2.i) {
                    int i12 = h6Var2.h;
                    if (i12 != 0) {
                        int i13 = h6Var2.e;
                        if (i13 == 0) {
                            i13 = h6Var2.c;
                        }
                        h6Var2.e = h6Var2.f;
                        h6Var2.f = h6Var2.g;
                        h6Var2.g = i12;
                        h6Var2.h = i13;
                    } else {
                        int i14 = h6Var2.e;
                        if (i14 == 0) {
                            i14 = h6Var2.c;
                        }
                        h6Var2.e = h6Var2.f;
                        h6Var2.f = h6Var2.g;
                        h6Var2.g = i14;
                    }
                    jd1Var2.S.e(h6Var2.h, 3);
                    jd1Var2.S.e(h6Var2.g, 2);
                    jd1Var2.S.e(h6Var2.f, 1);
                    org.telegram.ui.Components.jq jqVar = jd1Var2.S;
                    int i15 = h6Var2.e;
                    if (i15 == 0) {
                        i15 = h6Var2.c;
                    }
                    jqVar.e(i15, 0);
                    jd1Var2.H0[1].b(0, h6Var2.e);
                    jd1Var2.H0[1].b(1, h6Var2.f);
                    jd1Var2.H0[1].b(2, h6Var2.g);
                    jd1Var2.H0[1].b(3, h6Var2.h);
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    jd1Var2.r0.e1();
                    break;
                } else if (q5Var.i() != null) {
                    q5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
