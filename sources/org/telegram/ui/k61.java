package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k61 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ l71 c;

    public /* synthetic */ k61(l71 l71Var, int i3) {
        this.a = i3;
        this.c = l71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l71 l71Var = this.c;
                l71Var.H0.setRotation(this.b);
                this.b -= 45;
                l71Var.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                b71[] b71VarArr = l71Var.y0;
                b71 b71Var = b71VarArr[0];
                if (b71Var != null) {
                    Drawable background = b71Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.la0) {
                        ((org.telegram.ui.Components.la0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.g6 g6Var = l71Var.w;
                        if (l71Var.b == 2) {
                            l71Var.j1 += 45;
                            while (true) {
                                int i3 = l71Var.j1;
                                if (i3 >= 360) {
                                    l71Var.j1 = i3 - 360;
                                } else {
                                    l71Var.f1(l71Var.b1, 0, true);
                                }
                            }
                        } else if (g6Var != null) {
                            g6Var.n += 45;
                            while (true) {
                                int i10 = g6Var.n;
                                if (i10 >= 360) {
                                    g6Var.n = i10 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.k6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                b71 b71Var2 = b71VarArr[1];
                if (b71Var2 != null) {
                    Drawable background2 = b71Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.la0) {
                        ((org.telegram.ui.Components.la0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                l71 l71Var2 = this.c;
                org.telegram.ui.ActionBar.p5 p5Var = l71Var2.T;
                l71Var2.I0.setRotation(this.b);
                this.b -= 45;
                l71Var2.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.xq.g).start();
                org.telegram.ui.ActionBar.g6 g6Var2 = l71Var2.w;
                if (!g6Var2.i) {
                    int i11 = g6Var2.h;
                    if (i11 != 0) {
                        int i12 = g6Var2.e;
                        if (i12 == 0) {
                            i12 = g6Var2.c;
                        }
                        g6Var2.e = g6Var2.f;
                        g6Var2.f = g6Var2.g;
                        g6Var2.g = i11;
                        g6Var2.h = i12;
                    } else {
                        int i13 = g6Var2.e;
                        if (i13 == 0) {
                            i13 = g6Var2.c;
                        }
                        g6Var2.e = g6Var2.f;
                        g6Var2.f = g6Var2.g;
                        g6Var2.g = i13;
                    }
                    l71Var2.X.e(g6Var2.h, 3);
                    l71Var2.X.e(g6Var2.g, 2);
                    l71Var2.X.e(g6Var2.f, 1);
                    org.telegram.ui.Components.vp vpVar = l71Var2.X;
                    int i14 = g6Var2.e;
                    if (i14 == 0) {
                        i14 = g6Var2.c;
                    }
                    vpVar.e(i14, 0);
                    l71Var2.M0[1].b(0, g6Var2.e);
                    l71Var2.M0[1].b(1, g6Var2.f);
                    l71Var2.M0[1].b(2, g6Var2.g);
                    l71Var2.M0[1].b(3, g6Var2.h);
                    org.telegram.ui.ActionBar.k6.t1(true, true);
                    l71Var2.w0.g1();
                    break;
                } else if (p5Var.k() != null) {
                    p5Var.k().w(false);
                    break;
                }
                break;
        }
    }
}
