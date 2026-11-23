package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements org.telegram.messenger.jc, org.telegram.ui.Components.rj0, org.telegram.ui.Components.m71, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ j61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.m71
    public void f(int i7, int i10) {
        v71 v71Var = this.b;
        if (v71Var.G1) {
            v71Var.z0.getBackground();
            float scaleX = v71Var.D0 != null ? (v71Var.z0.getScaleX() - 1.0f) / (v71Var.A1 - 1.0f) : 1.0f;
            v71Var.z0.setTranslationX(i7 * scaleX);
            v71Var.z0.setTranslationY(i10 * scaleX);
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
            boolean E2 = r1Var.E2(f10);
            v71 v71Var = this.b;
            if (!E2) {
                v71Var.d1(2, true);
            } else if (r1Var.getMessageObject().P3()) {
                v71Var.d1(3, true);
            } else {
                v71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 3:
                this.b.u0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.S0(false);
                break;
            case 5:
                v71 v71Var = this.b;
                org.telegram.ui.ActionBar.k6 k6Var = v71Var.w;
                if (k6Var.j == 4294967296L) {
                    k6Var.j = 0L;
                    k6Var.k = 0L;
                    k6Var.l = 0L;
                    k6Var.m = 0L;
                    v71Var.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                v71Var.x = true;
                org.telegram.ui.ActionBar.n6.v1(true);
                v71Var.d1(2, false);
                break;
            case 6:
                v71 v71Var2 = this.b;
                org.telegram.ui.ActionBar.k6 k6Var2 = v71Var2.w;
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
                    v71Var2.n1 = f10;
                    if (str == null || "c".equals(str)) {
                        v71Var2.Y0 = null;
                    } else {
                        int size = v71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) v71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && k6Var2.o.equals(tL_wallPaper.slug)) {
                                    v71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    v71Var2.x = true;
                    v71Var2.L0[1].a(v71Var2.Y0 != null, true);
                    v71Var2.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                Drawable background = v71Var2.z0.getBackground();
                if (background instanceof org.telegram.ui.Components.za0) {
                    org.telegram.ui.Components.za0 za0Var = (org.telegram.ui.Components.za0) background;
                    za0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.n6.I.q()) {
                        if (v71Var2.n1 < 0.0f) {
                            v71Var2.z0.getImageReceiver().n0(za0Var.k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = v71Var2.V0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = v71Var2.n1;
                        if (f11 < 0.0f) {
                            v71Var2.n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = v71Var2.V0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(v71Var2.n1);
                }
                org.telegram.ui.ActionBar.n6.v1(true);
                v71Var2.d1(2, false);
                break;
            default:
                v71 v71Var3 = this.b;
                org.telegram.ui.ActionBar.k6 k6Var3 = v71Var3.w;
                if (k6Var3.j == 4294967296L) {
                    k6Var3.j = 0L;
                    k6Var3.k = 0L;
                    k6Var3.l = 0L;
                    k6Var3.m = 0L;
                    v71Var3.r1(false);
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                }
                v71Var3.x = true;
                org.telegram.ui.ActionBar.n6.v1(true);
                v71Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        v71 v71Var = this.b;
        if (v71Var.D1 instanceof pc1) {
            return;
        }
        Drawable t6 = imageReceiver.t();
        if (!z10 || t6 == null) {
            return;
        }
        u61 u61Var = v71Var.a;
        org.telegram.messenger.g0.q(t6);
        u61Var.a(v71Var.T0(t6), t6, Float.valueOf(v71Var.n1));
        if (!z11 && v71Var.H1 && v71Var.y1 == null) {
            v71Var.z0.getImageReceiver().B0 = false;
            v71Var.n1();
            v71Var.z0.getImageReceiver().B0 = true;
        }
        v71Var.a1();
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
