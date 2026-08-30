package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bc1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ cd1 c;

    public /* synthetic */ bc1(cd1 cd1Var, int i10) {
        this.a = i10;
        this.c = cd1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cd1 cd1Var = this.c;
                cd1Var.C0.setRotation(this.b);
                this.b -= 45;
                cd1Var.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.g).start();
                rc1[] rc1VarArr = cd1Var.t0;
                rc1 rc1Var = rc1VarArr[0];
                if (rc1Var != null) {
                    Drawable background = rc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.h6 h6Var = cd1Var.s;
                        if (cd1Var.b == 2) {
                            cd1Var.e1 += 45;
                            while (true) {
                                int i10 = cd1Var.e1;
                                if (i10 >= 360) {
                                    cd1Var.e1 = i10 - 360;
                                } else {
                                    cd1Var.a1(cd1Var.W0, 0, true);
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
                rc1 rc1Var2 = rc1VarArr[1];
                if (rc1Var2 != null) {
                    Drawable background2 = rc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.dc0) {
                        ((org.telegram.ui.Components.dc0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                cd1 cd1Var2 = this.c;
                org.telegram.ui.ActionBar.q5 q5Var = cd1Var2.O;
                cd1Var2.D0.setRotation(this.b);
                this.b -= 45;
                cd1Var2.D0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.nr.g).start();
                org.telegram.ui.ActionBar.h6 h6Var2 = cd1Var2.s;
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
                    cd1Var2.S.e(h6Var2.h, 3);
                    cd1Var2.S.e(h6Var2.g, 2);
                    cd1Var2.S.e(h6Var2.f, 1);
                    org.telegram.ui.Components.kq kqVar = cd1Var2.S;
                    int i15 = h6Var2.e;
                    if (i15 == 0) {
                        i15 = h6Var2.c;
                    }
                    kqVar.e(i15, 0);
                    cd1Var2.H0[1].b(0, h6Var2.e);
                    cd1Var2.H0[1].b(1, h6Var2.f);
                    cd1Var2.H0[1].b(2, h6Var2.g);
                    cd1Var2.H0[1].b(3, h6Var2.h);
                    org.telegram.ui.ActionBar.j6.n1(true, true);
                    cd1Var2.r0.f1();
                    break;
                } else if (q5Var.i() != null) {
                    q5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
