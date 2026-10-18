package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ mc1 c;

    public /* synthetic */ lb1(mc1 mc1Var, int i10) {
        this.a = i10;
        this.c = mc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mc1 mc1Var = this.c;
                mc1Var.F0.setRotation(this.b);
                this.b -= 45;
                mc1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.g).start();
                bc1[] bc1VarArr = mc1Var.w0;
                bc1 bc1Var = bc1VarArr[0];
                if (bc1Var != null) {
                    Drawable background = bc1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = mc1Var.s;
                        if (mc1Var.b == 2) {
                            mc1Var.h1 += 45;
                            while (true) {
                                int i10 = mc1Var.h1;
                                if (i10 >= 360) {
                                    mc1Var.h1 = i10 - 360;
                                } else {
                                    mc1Var.a1(mc1Var.Z0, 0, true);
                                }
                            }
                        } else if (f6Var != null) {
                            f6Var.n += 45;
                            while (true) {
                                int i11 = f6Var.n;
                                if (i11 >= 360) {
                                    f6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.h6.o1(false, false);
                                }
                            }
                        }
                    }
                }
                bc1 bc1Var2 = bc1VarArr[1];
                if (bc1Var2 != null) {
                    Drawable background2 = bc1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                mc1 mc1Var2 = this.c;
                org.telegram.ui.ActionBar.p5 p5Var = mc1Var2.R;
                mc1Var2.G0.setRotation(this.b);
                this.b -= 45;
                mc1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = mc1Var2.s;
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
                    mc1Var2.V.e(f6Var2.h, 3);
                    mc1Var2.V.e(f6Var2.g, 2);
                    mc1Var2.V.e(f6Var2.f, 1);
                    org.telegram.ui.Components.wq wqVar = mc1Var2.V;
                    int i15 = f6Var2.e;
                    if (i15 == 0) {
                        i15 = f6Var2.c;
                    }
                    wqVar.e(i15, 0);
                    mc1Var2.K0[1].b(0, f6Var2.e);
                    mc1Var2.K0[1].b(1, f6Var2.f);
                    mc1Var2.K0[1].b(2, f6Var2.g);
                    mc1Var2.K0[1].b(3, f6Var2.h);
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    mc1Var2.u0.f1();
                    break;
                } else if (p5Var.i() != null) {
                    p5Var.i().w(false);
                    break;
                }
                break;
        }
    }
}
