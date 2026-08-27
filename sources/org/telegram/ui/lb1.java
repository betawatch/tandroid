package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ nc1 c;

    public /* synthetic */ lb1(nc1 nc1Var, int i10) {
        this.a = i10;
        this.c = nc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                nc1 nc1Var = this.c;
                nc1Var.B0.setRotation(this.b);
                this.b -= 45;
                nc1Var.B0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.er.g).start();
                cc1[] cc1VarArr = nc1Var.s0;
                cc1 cc1Var = cc1VarArr[0];
                if (cc1Var != null) {
                    Drawable background = cc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.nb0) {
                        ((org.telegram.ui.Components.nb0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = nc1Var.s;
                        if (nc1Var.b == 2) {
                            nc1Var.d1 += 45;
                            while (true) {
                                int i10 = nc1Var.d1;
                                if (i10 >= 360) {
                                    nc1Var.d1 = i10 - 360;
                                } else {
                                    nc1Var.a1(nc1Var.V0, 0, true);
                                }
                            }
                        } else if (e6Var != null) {
                            e6Var.n += 45;
                            while (true) {
                                int i11 = e6Var.n;
                                if (i11 >= 360) {
                                    e6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.g6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                cc1 cc1Var2 = cc1VarArr[1];
                if (cc1Var2 != null) {
                    Drawable background2 = cc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.nb0) {
                        ((org.telegram.ui.Components.nb0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                nc1 nc1Var2 = this.c;
                org.telegram.ui.ActionBar.n5 n5Var = nc1Var2.N;
                nc1Var2.C0.setRotation(this.b);
                this.b -= 45;
                nc1Var2.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.er.g).start();
                org.telegram.ui.ActionBar.e6 e6Var2 = nc1Var2.s;
                if (!e6Var2.i) {
                    int i12 = e6Var2.h;
                    if (i12 != 0) {
                        int i13 = e6Var2.e;
                        if (i13 == 0) {
                            i13 = e6Var2.c;
                        }
                        e6Var2.e = e6Var2.f;
                        e6Var2.f = e6Var2.g;
                        e6Var2.g = i12;
                        e6Var2.h = i13;
                    } else {
                        int i14 = e6Var2.e;
                        if (i14 == 0) {
                            i14 = e6Var2.c;
                        }
                        e6Var2.e = e6Var2.f;
                        e6Var2.f = e6Var2.g;
                        e6Var2.g = i14;
                    }
                    nc1Var2.R.e(e6Var2.h, 3);
                    nc1Var2.R.e(e6Var2.g, 2);
                    nc1Var2.R.e(e6Var2.f, 1);
                    org.telegram.ui.Components.aq aqVar = nc1Var2.R;
                    int i15 = e6Var2.e;
                    if (i15 == 0) {
                        i15 = e6Var2.c;
                    }
                    aqVar.e(i15, 0);
                    nc1Var2.G0[1].b(0, e6Var2.e);
                    nc1Var2.G0[1].b(1, e6Var2.f);
                    nc1Var2.G0[1].b(2, e6Var2.g);
                    nc1Var2.G0[1].b(3, e6Var2.h);
                    org.telegram.ui.ActionBar.g6.n1(true, true);
                    nc1Var2.q0.f1();
                    break;
                } else if (n5Var.i() != null) {
                    n5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
