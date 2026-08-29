package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ob1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ qc1 c;

    public /* synthetic */ ob1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.c = qc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qc1 qc1Var = this.c;
                qc1Var.B0.setRotation(this.b);
                this.b -= 45;
                qc1Var.B0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.jr.g).start();
                fc1[] fc1VarArr = qc1Var.s0;
                fc1 fc1Var = fc1VarArr[0];
                if (fc1Var != null) {
                    Drawable background = fc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.yb0) {
                        ((org.telegram.ui.Components.yb0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.e6 e6Var = qc1Var.s;
                        if (qc1Var.b == 2) {
                            qc1Var.d1 += 45;
                            while (true) {
                                int i10 = qc1Var.d1;
                                if (i10 >= 360) {
                                    qc1Var.d1 = i10 - 360;
                                } else {
                                    qc1Var.a1(qc1Var.V0, 0, true);
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
                fc1 fc1Var2 = fc1VarArr[1];
                if (fc1Var2 != null) {
                    Drawable background2 = fc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.yb0) {
                        ((org.telegram.ui.Components.yb0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                qc1 qc1Var2 = this.c;
                org.telegram.ui.ActionBar.n5 n5Var = qc1Var2.N;
                qc1Var2.C0.setRotation(this.b);
                this.b -= 45;
                qc1Var2.C0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.jr.g).start();
                org.telegram.ui.ActionBar.e6 e6Var2 = qc1Var2.s;
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
                    qc1Var2.R.e(e6Var2.h, 3);
                    qc1Var2.R.e(e6Var2.g, 2);
                    qc1Var2.R.e(e6Var2.f, 1);
                    org.telegram.ui.Components.gq gqVar = qc1Var2.R;
                    int i15 = e6Var2.e;
                    if (i15 == 0) {
                        i15 = e6Var2.c;
                    }
                    gqVar.e(i15, 0);
                    qc1Var2.G0[1].b(0, e6Var2.e);
                    qc1Var2.G0[1].b(1, e6Var2.f);
                    qc1Var2.G0[1].b(2, e6Var2.g);
                    qc1Var2.G0[1].b(3, e6Var2.h);
                    org.telegram.ui.ActionBar.g6.n1(true, true);
                    qc1Var2.q0.f1();
                    break;
                } else if (n5Var.i() != null) {
                    n5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
