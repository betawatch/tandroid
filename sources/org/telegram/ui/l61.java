package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l61 implements org.telegram.messenger.jc, org.telegram.ui.Components.pj0, org.telegram.ui.Components.i71, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ l61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean E2 = q1Var.E2(f10);
            x71 x71Var = this.b;
            if (!E2) {
                x71Var.d1(2, true);
            } else if (q1Var.getMessageObject().P3()) {
                x71Var.d1(3, true);
            } else {
                x71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.i71
    public void g(int i7, int i10) {
        x71 x71Var = this.b;
        if (x71Var.G1) {
            x71Var.z0.getBackground();
            float scaleX = x71Var.D0 != null ? (x71Var.z0.getScaleX() - 1.0f) / (x71Var.A1 - 1.0f) : 1.0f;
            x71Var.z0.setTranslationX(i7 * scaleX);
            x71Var.z0.setTranslationY(i10 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 3:
                this.b.u0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.S0(false);
                break;
            case 5:
                x71 x71Var = this.b;
                org.telegram.ui.ActionBar.k6 k6Var = x71Var.w;
                if (k6Var.j == 4294967296L) {
                    k6Var.j = 0L;
                    k6Var.k = 0L;
                    k6Var.l = 0L;
                    k6Var.m = 0L;
                    x71Var.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                x71Var.x = true;
                org.telegram.ui.ActionBar.n6.v1(true);
                x71Var.d1(2, false);
                break;
            case 6:
                x71 x71Var2 = this.b;
                org.telegram.ui.ActionBar.k6 k6Var2 = x71Var2.w;
                if (org.telegram.ui.ActionBar.n6.c1() && org.telegram.ui.ActionBar.n6.I.j0.d != 0) {
                    org.telegram.ui.ActionBar.e6 e6Var = k6Var2.y;
                    k6Var2.j = e6Var.d;
                    k6Var2.k = e6Var.e;
                    k6Var2.l = e6Var.f;
                    k6Var2.m = e6Var.g;
                    k6Var2.n = e6Var.h;
                    String str = e6Var.c;
                    k6Var2.o = str;
                    float f10 = e6Var.k;
                    k6Var2.p = f10;
                    x71Var2.n1 = f10;
                    if (str == null || "c".equals(str)) {
                        x71Var2.Y0 = null;
                    } else {
                        int size = x71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) x71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && k6Var2.o.equals(tL_wallPaper.slug)) {
                                    x71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    x71Var2.x = true;
                    x71Var2.L0[1].a(x71Var2.Y0 != null, true);
                    x71Var2.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                Drawable background = x71Var2.z0.getBackground();
                if (background instanceof org.telegram.ui.Components.bb0) {
                    org.telegram.ui.Components.bb0 bb0Var = (org.telegram.ui.Components.bb0) background;
                    bb0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.n6.I.q()) {
                        if (x71Var2.n1 < 0.0f) {
                            x71Var2.z0.getImageReceiver().m0(bb0Var.k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = x71Var2.V0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = x71Var2.n1;
                        if (f11 < 0.0f) {
                            x71Var2.n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = x71Var2.V0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(x71Var2.n1);
                }
                org.telegram.ui.ActionBar.n6.v1(true);
                x71Var2.d1(2, false);
                break;
            default:
                x71 x71Var3 = this.b;
                org.telegram.ui.ActionBar.k6 k6Var3 = x71Var3.w;
                if (k6Var3.j == 4294967296L) {
                    k6Var3.j = 0L;
                    k6Var3.k = 0L;
                    k6Var3.l = 0L;
                    k6Var3.m = 0L;
                    x71Var3.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                x71Var3.x = true;
                org.telegram.ui.ActionBar.n6.v1(true);
                x71Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        x71 x71Var = this.b;
        if (x71Var.D1 instanceof rc1) {
            return;
        }
        Drawable t6 = imageReceiver.t();
        if (!z10 || t6 == null) {
            return;
        }
        w61 w61Var = x71Var.a;
        org.telegram.messenger.g0.q(t6);
        w61Var.a(x71Var.T0(t6), t6, Float.valueOf(x71Var.n1));
        if (!z11 && x71Var.H1 && x71Var.y1 == null) {
            x71Var.z0.getImageReceiver().B0 = false;
            x71Var.n1();
            x71Var.z0.getImageReceiver().B0 = true;
        }
        x71Var.a1();
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
