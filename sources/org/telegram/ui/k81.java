package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k81 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ k91 c;

    public /* synthetic */ k81(k91 k91Var, int i10) {
        this.a = i10;
        this.c = k91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k91 k91Var = this.c;
                k91Var.G0.setRotation(this.b);
                this.b -= 45;
                k91Var.G0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.g).start();
                a91[] a91VarArr = k91Var.x0;
                a91 a91Var = a91VarArr[0];
                if (a91Var != null) {
                    Drawable background = a91Var.getBackground();
                    if (background instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background).w(false);
                    } else {
                        org.telegram.ui.ActionBar.r6 r6Var = k91Var.w;
                        if (k91Var.b == 2) {
                            k91Var.i1 += 45;
                            while (true) {
                                int i10 = k91Var.i1;
                                if (i10 >= 360) {
                                    k91Var.i1 = i10 - 360;
                                } else {
                                    k91Var.f1(k91Var.a1, 0, true);
                                }
                            }
                        } else if (r6Var != null) {
                            r6Var.n += 45;
                            while (true) {
                                int i11 = r6Var.n;
                                if (i11 >= 360) {
                                    r6Var.n = i11 - 360;
                                } else {
                                    org.telegram.ui.ActionBar.t6.t1(false, false);
                                }
                            }
                        }
                    }
                }
                a91 a91Var2 = a91VarArr[1];
                if (a91Var2 != null) {
                    Drawable background2 = a91Var2.getBackground();
                    if (background2 instanceof org.telegram.ui.Components.jb0) {
                        ((org.telegram.ui.Components.jb0) background2).w(false);
                        break;
                    }
                }
                break;
            default:
                k91 k91Var2 = this.c;
                org.telegram.ui.ActionBar.a6 a6Var = k91Var2.S;
                k91Var2.H0.setRotation(this.b);
                this.b -= 45;
                k91Var2.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(org.telegram.ui.Components.gr.g).start();
                org.telegram.ui.ActionBar.r6 r6Var2 = k91Var2.w;
                if (!r6Var2.i) {
                    int i12 = r6Var2.h;
                    if (i12 != 0) {
                        int i13 = r6Var2.e;
                        if (i13 == 0) {
                            i13 = r6Var2.c;
                        }
                        r6Var2.e = r6Var2.f;
                        r6Var2.f = r6Var2.g;
                        r6Var2.g = i12;
                        r6Var2.h = i13;
                    } else {
                        int i14 = r6Var2.e;
                        if (i14 == 0) {
                            i14 = r6Var2.c;
                        }
                        r6Var2.e = r6Var2.f;
                        r6Var2.f = r6Var2.g;
                        r6Var2.g = i14;
                    }
                    k91Var2.W.e(r6Var2.h, 3);
                    k91Var2.W.e(r6Var2.g, 2);
                    k91Var2.W.e(r6Var2.f, 1);
                    org.telegram.ui.Components.cq cqVar = k91Var2.W;
                    int i15 = r6Var2.e;
                    if (i15 == 0) {
                        i15 = r6Var2.c;
                    }
                    cqVar.e(i15, 0);
                    k91Var2.L0[1].b(0, r6Var2.e);
                    k91Var2.L0[1].b(1, r6Var2.f);
                    k91Var2.L0[1].b(2, r6Var2.g);
                    k91Var2.L0[1].b(3, r6Var2.h);
                    org.telegram.ui.ActionBar.t6.t1(true, true);
                    k91Var2.v0.g1();
                    break;
                } else if (a6Var.k() != null) {
                    a6Var.k().w(false);
                    break;
                }
                break;
        }
    }
}
