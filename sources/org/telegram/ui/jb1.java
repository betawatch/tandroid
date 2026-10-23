package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class jb1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ kc1 c;

    public /* synthetic */ jb1(kc1 kc1Var, int i10) {
        this.a = i10;
        this.c = kc1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kc1 kc1Var = this.c;
                kc1Var.F0.setRotation(this.b);
                this.b -= 45;
                kc1Var.F0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.g).start();
                zb1[] zb1VarArr = kc1Var.w0;
                zb1 zb1Var = zb1VarArr[0];
                if (zb1Var != null) {
                    Drawable background = zb1Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.f6 f6Var = kc1Var.s;
                        if (kc1Var.b == 2) {
                            kc1Var.h1 += 45;
                            while (true) {
                                int i10 = kc1Var.h1;
                                if (i10 >= 360) {
                                    kc1Var.h1 = i10 - 360;
                                } else {
                                    kc1Var.a1(kc1Var.Z0, 0, true);
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
                zb1 zb1Var2 = zb1VarArr[1];
                if (zb1Var2 != null) {
                    Drawable background2 = zb1Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.wc0) {
                        ((org.telegram.ui.Components.wc0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                kc1 kc1Var2 = this.c;
                org.telegram.ui.ActionBar.p5 p5Var = kc1Var2.R;
                kc1Var2.G0.setRotation(this.b);
                this.b -= 45;
                kc1Var2.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.bs.g).start();
                org.telegram.ui.ActionBar.f6 f6Var2 = kc1Var2.s;
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
                    kc1Var2.V.e(f6Var2.h, 3);
                    kc1Var2.V.e(f6Var2.g, 2);
                    kc1Var2.V.e(f6Var2.f, 1);
                    org.telegram.ui.Components.wq wqVar = kc1Var2.V;
                    int i15 = f6Var2.e;
                    if (i15 == 0) {
                        i15 = f6Var2.c;
                    }
                    wqVar.e(i15, 0);
                    kc1Var2.K0[1].b(0, f6Var2.e);
                    kc1Var2.K0[1].b(1, f6Var2.f);
                    kc1Var2.K0[1].b(2, f6Var2.g);
                    kc1Var2.K0[1].b(3, f6Var2.h);
                    org.telegram.ui.ActionBar.h6.o1(true, true);
                    kc1Var2.u0.f1();
                    break;
                } else if (p5Var.i() != null) {
                    p5Var.i().w(false);
                    break;
                }
                break;
        }
    }
}
