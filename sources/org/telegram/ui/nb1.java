package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ oc1 c;

    public /* synthetic */ nb1(oc1 oc1Var, int i9) {
        this.a = i9;
        this.c = oc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                oc1 oc1Var = this.c;
                oc1Var.B0.setRotation(this.b);
                this.b -= 45;
                oc1Var.B0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.g).start();
                dc1[] dc1VarArr = oc1Var.s0;
                dc1 dc1Var = dc1VarArr[0];
                if (dc1Var != null) {
                    Drawable background = dc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.s;
                        if (oc1Var.b == 2) {
                            oc1Var.d1 += 45;
                            while (true) {
                                int i9 = oc1Var.d1;
                                if (i9 >= 360) {
                                    oc1Var.d1 = i9 - 360;
                                } else {
                                    oc1Var.a1(oc1Var.V0, 0, true);
                                }
                            }
                        } else if (d6Var != null) {
                            d6Var.n += 45;
                            while (true) {
                                int i10 = d6Var.n;
                                if (i10 >= 360) {
                                    d6Var.n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.f6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                dc1 dc1Var2 = dc1VarArr[1];
                if (dc1Var2 != null) {
                    Drawable background2 = dc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                oc1 oc1Var2 = this.c;
                org.telegram.ui.ActionBar.n5 n5Var = oc1Var2.N;
                oc1Var2.C0.setRotation(this.b);
                this.b -= 45;
                oc1Var2.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.g).start();
                org.telegram.ui.ActionBar.d6 d6Var2 = oc1Var2.s;
                if (!d6Var2.i) {
                    int i11 = d6Var2.h;
                    if (i11 != 0) {
                        int i12 = d6Var2.e;
                        if (i12 == 0) {
                            i12 = d6Var2.c;
                        }
                        d6Var2.e = d6Var2.f;
                        d6Var2.f = d6Var2.g;
                        d6Var2.g = i11;
                        d6Var2.h = i12;
                    } else {
                        int i13 = d6Var2.e;
                        if (i13 == 0) {
                            i13 = d6Var2.c;
                        }
                        d6Var2.e = d6Var2.f;
                        d6Var2.f = d6Var2.g;
                        d6Var2.g = i13;
                    }
                    oc1Var2.R.e(d6Var2.h, 3);
                    oc1Var2.R.e(d6Var2.g, 2);
                    oc1Var2.R.e(d6Var2.f, 1);
                    org.telegram.ui.Components.cq cqVar = oc1Var2.R;
                    int i14 = d6Var2.e;
                    if (i14 == 0) {
                        i14 = d6Var2.c;
                    }
                    cqVar.e(i14, 0);
                    oc1Var2.G0[1].b(0, d6Var2.e);
                    oc1Var2.G0[1].b(1, d6Var2.f);
                    oc1Var2.G0[1].b(2, d6Var2.g);
                    oc1Var2.G0[1].b(3, d6Var2.h);
                    org.telegram.ui.ActionBar.f6.n1(true, true);
                    oc1Var2.q0.f1();
                    break;
                } else if (n5Var.i() != null) {
                    n5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
