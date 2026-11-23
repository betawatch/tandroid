package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l61 implements org.telegram.messenger.kc, org.telegram.ui.Components.rj0, org.telegram.ui.Components.l71, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ l61(x71 x71Var, int i7) {
        this.a = i7;
        this.b = x71Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            boolean E2 = r1Var.E2(f10);
            x71 x71Var = this.b;
            if (!E2) {
                x71Var.d1(2, true);
            } else if (r1Var.getMessageObject().P3()) {
                x71Var.d1(3, true);
            } else {
                x71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.l71
    public void g(int i7, int i10) {
        x71 x71Var = this.b;
        if (x71Var.G1) {
            x71Var.z0.getBackground();
            float scaleX = x71Var.D0 != null ? (x71Var.z0.getScaleX() - 1.0f) / (x71Var.A1 - 1.0f) : 1.0f;
            x71Var.z0.setTranslationX(i7 * scaleX);
            x71Var.z0.setTranslationY(i10 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 3:
                this.b.u0.getActionBarMenuOnItemClick().b(4);
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
                if (org.telegram.ui.ActionBar.m6.c1() && org.telegram.ui.ActionBar.m6.I.j0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = j6Var2.y;
                    j6Var2.j = d6Var.d;
                    j6Var2.k = d6Var.e;
                    j6Var2.l = d6Var.f;
                    j6Var2.m = d6Var.g;
                    j6Var2.n = d6Var.h;
                    String str = d6Var.c;
                    j6Var2.o = str;
                    float f10 = d6Var.k;
                    j6Var2.p = f10;
                    x71Var2.n1 = f10;
                    if (str == null || "c".equals(str)) {
                        x71Var2.Y0 = null;
                    } else {
                        int size = x71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) x71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && j6Var2.o.equals(tL_wallPaper.slug)) {
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
                    org.telegram.ui.ActionBar.m6.t1(false, false);
                }
                Drawable background = x71Var2.z0.getBackground();
                if (background instanceof org.telegram.ui.Components.cb0) {
                    org.telegram.ui.Components.cb0 cb0Var = (org.telegram.ui.Components.cb0) background;
                    cb0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.m6.I.q()) {
                        if (x71Var2.n1 < 0.0f) {
                            x71Var2.z0.getImageReceiver().m0(cb0Var.k);
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

    @Override // org.telegram.messenger.kc
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

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
