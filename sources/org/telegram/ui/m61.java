package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m61 implements org.telegram.messenger.lc, org.telegram.ui.Components.cj0, org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ m61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean B2 = q1Var.B2(f10);
            x71 x71Var = this.b;
            if (!B2) {
                x71Var.d1(2, true);
            } else if (q1Var.getMessageObject().P3()) {
                x71Var.d1(3, true);
            } else {
                x71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        x71 x71Var = this.b;
        if (x71Var.C1 instanceof tc1) {
            return;
        }
        Drawable t6 = imageReceiver.t();
        if (!z9 || t6 == null) {
            return;
        }
        y61 y61Var = x71Var.a;
        org.telegram.messenger.g0.q(t6);
        y61Var.k(x71Var.T0(t6), t6, Float.valueOf(x71Var.m1));
        if (!z10 && x71Var.G1 && x71Var.x1 == null) {
            x71Var.y0.getImageReceiver().A0 = false;
            x71Var.n1();
            x71Var.y0.getImageReceiver().A0 = true;
        }
        x71Var.a1();
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 3:
                this.b.t0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.S0(false);
                break;
            case 5:
                x71 x71Var = this.b;
                org.telegram.ui.ActionBar.j6 j6Var = x71Var.w;
                if (j6Var.j == 4294967296L) {
                    j6Var.j = 0L;
                    j6Var.k = 0L;
                    j6Var.l = 0L;
                    j6Var.m = 0L;
                    x71Var.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                x71Var.x = true;
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var.d1(2, false);
                break;
            case 6:
                x71 x71Var2 = this.b;
                org.telegram.ui.ActionBar.j6 j6Var2 = x71Var2.w;
                if (org.telegram.ui.ActionBar.m6.c1() && org.telegram.ui.ActionBar.m6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.e6 e6Var = j6Var2.y;
                    j6Var2.j = e6Var.d;
                    j6Var2.k = e6Var.e;
                    j6Var2.l = e6Var.f;
                    j6Var2.m = e6Var.g;
                    j6Var2.n = e6Var.h;
                    String str = e6Var.c;
                    j6Var2.o = str;
                    float f10 = e6Var.k;
                    j6Var2.p = f10;
                    x71Var2.m1 = f10;
                    if (str == null || "c".equals(str)) {
                        x71Var2.X0 = null;
                    } else {
                        int size = x71Var2.V0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) x71Var2.V0.get(i10);
                                if (tL_wallPaper.pattern && j6Var2.o.equals(tL_wallPaper.slug)) {
                                    x71Var2.X0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    x71Var2.x = true;
                    x71Var2.K0[1].a(x71Var2.X0 != null, true);
                    x71Var2.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                Drawable background = x71Var2.y0.getBackground();
                if (background instanceof org.telegram.ui.Components.qa0) {
                    org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) background;
                    qa0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.m6.I.q()) {
                        if (x71Var2.m1 < 0.0f) {
                            x71Var2.y0.getImageReceiver().m0(qa0Var.k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = x71Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = x71Var2.m1;
                        if (f11 < 0.0f) {
                            x71Var2.m1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = x71Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(x71Var2.m1);
                }
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var2.d1(2, false);
                break;
            default:
                x71 x71Var3 = this.b;
                org.telegram.ui.ActionBar.j6 j6Var3 = x71Var3.w;
                if (j6Var3.j == 4294967296L) {
                    j6Var3.j = 0L;
                    j6Var3.k = 0L;
                    j6Var3.l = 0L;
                    j6Var3.m = 0L;
                    x71Var3.r1(false);
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                x71Var3.x = true;
                org.telegram.ui.ActionBar.m6.v1(true);
                x71Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x61
    public void h(int i7, int i10) {
        x71 x71Var = this.b;
        if (x71Var.F1) {
            x71Var.y0.getBackground();
            float scaleX = x71Var.C0 != null ? (x71Var.y0.getScaleX() - 1.0f) / (x71Var.z1 - 1.0f) : 1.0f;
            x71Var.y0.setTranslationX(i7 * scaleX);
            x71Var.y0.setTranslationY(i10 * scaleX);
        }
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
