package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class qc1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ rd1 c;

    public /* synthetic */ qc1(rd1 rd1Var, int i10) {
        this.a = i10;
        this.c = rd1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rd1 rd1Var = this.c;
                rd1Var.F0.setRotation(this.b);
                this.b -= 45;
                rd1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.tr.g).start();
                gd1[] gd1VarArr = rd1Var.w0;
                gd1 gd1Var = gd1VarArr[0];
                if (gd1Var != null) {
                    Drawable background = gd1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.pc0) {
                        ((org.telegram.ui.Components.pc0) background).x(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = rd1Var.s;
                        if (rd1Var.b == 2) {
                            rd1Var.h1 += 45;
                            while (true) {
                                int i10 = rd1Var.h1;
                                if (i10 >= 360) {
                                    rd1Var.h1 = i10 - 360;
                                } else {
                                    rd1Var.a1(rd1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.n += 45;
                            while (true) {
                                int i11 = f6Var.n;
                                if (i11 >= 360) {
                                    f6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.i6.n1(false, false);
                                }
                            }
                        }
                    }
                }
                gd1 gd1Var2 = gd1VarArr[1];
                if (gd1Var2 != null) {
                    Drawable background2 = gd1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.pc0) {
                        ((org.telegram.ui.Components.pc0) background2).x(false);
                        break;
                    }
                }
                break;
            default:
                rd1 rd1Var2 = this.c;
                org.telegram.ui.ActionBar.p5 p5Var = rd1Var2.R;
                rd1Var2.G0.setRotation(this.b);
                this.b -= 45;
                rd1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.tr.g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = rd1Var2.s;
                if (!f6Var2.i) {
                    int i12 = f6Var2.h;
                    if (i12 != 0) {
                        int i13 = f6Var2.e;
                        if (i13 == 0) {
                            i13 = f6Var2.c;
                        }
                        f6Var2.e = f6Var2.f;
                        f6Var2.f = f6Var2.g;
                        f6Var2.g = i12;
                        f6Var2.h = i13;
                    } else {
                        int i14 = f6Var2.e;
                        if (i14 == 0) {
                            i14 = f6Var2.c;
                        }
                        f6Var2.e = f6Var2.f;
                        f6Var2.f = f6Var2.g;
                        f6Var2.g = i14;
                    }
                    rd1Var2.V.e(f6Var2.h, 3);
                    rd1Var2.V.e(f6Var2.g, 2);
                    rd1Var2.V.e(f6Var2.f, 1);
                    org.telegram.ui.Components.pq pqVar = rd1Var2.V;
                    int i15 = f6Var2.e;
                    if (i15 == 0) {
                        i15 = f6Var2.c;
                    }
                    pqVar.e(i15, 0);
                    rd1Var2.K0[1].b(0, f6Var2.e);
                    rd1Var2.K0[1].b(1, f6Var2.f);
                    rd1Var2.K0[1].b(2, f6Var2.g);
                    rd1Var2.K0[1].b(3, f6Var2.h);
                    org.telegram.ui.ActionBar.i6.n1(true, true);
                    rd1Var2.u0.h1();
                    break;
                } else if (p5Var.i() != null) {
                    p5Var.i().x(false);
                    break;
                }
                break;
        }
    }
}
