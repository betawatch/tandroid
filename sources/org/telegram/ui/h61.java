package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h61 implements org.telegram.messenger.kc, org.telegram.ui.Components.hj0, org.telegram.ui.Components.y61, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t71 b;

    public /* synthetic */ h61(t71 t71Var, int i7) {
        this.a = i7;
        this.b = t71Var;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        t71 t71Var = this.b;
        if (t71Var.D1 instanceof oc1) {
            return;
        }
        Drawable t6 = imageReceiver.t();
        if (!z10 || t6 == null) {
            return;
        }
        s61 s61Var = t71Var.a;
        org.telegram.messenger.g0.q(t6);
        s61Var.k(t71Var.T0(t6), t6, Float.valueOf(t71Var.n1));
        if (!z11 && t71Var.H1 && t71Var.y1 == null) {
            t71Var.z0.getImageReceiver().B0 = false;
            t71Var.n1();
            t71Var.z0.getImageReceiver().B0 = true;
        }
        t71Var.a1();
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean C2 = q1Var.C2(f10);
            t71 t71Var = this.b;
            if (!C2) {
                t71Var.d1(2, true);
            } else if (q1Var.getMessageObject().P3()) {
                t71Var.d1(3, true);
            } else {
                t71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.y61
    public void g(int i7, int i10) {
        t71 t71Var = this.b;
        if (t71Var.G1) {
            t71Var.z0.getBackground();
            float scaleX = t71Var.D0 != null ? (t71Var.z0.getScaleX() - 1.0f) / (t71Var.A1 - 1.0f) : 1.0f;
            t71Var.z0.setTranslationX(i7 * scaleX);
            t71Var.z0.setTranslationY(i10 * scaleX);
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
                t71 t71Var = this.b;
                org.telegram.ui.ActionBar.g6 g6Var = t71Var.w;
                if (g6Var.j == 4294967296L) {
                    g6Var.j = 0L;
                    g6Var.k = 0L;
                    g6Var.l = 0L;
                    g6Var.m = 0L;
                    t71Var.r1(false);
                    org.telegram.ui.ActionBar.j6.t1(false, false);
                }
                t71Var.x = true;
                org.telegram.ui.ActionBar.j6.v1(true);
                t71Var.d1(2, false);
                break;
            case 6:
                t71 t71Var2 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var2 = t71Var2.w;
                if (org.telegram.ui.ActionBar.j6.c1() && org.telegram.ui.ActionBar.j6.I.j0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.y;
                    g6Var2.j = b6Var.d;
                    g6Var2.k = b6Var.e;
                    g6Var2.l = b6Var.f;
                    g6Var2.m = b6Var.g;
                    g6Var2.n = b6Var.h;
                    String str = b6Var.c;
                    g6Var2.o = str;
                    float f10 = b6Var.k;
                    g6Var2.p = f10;
                    t71Var2.n1 = f10;
                    if (str == null || "c".equals(str)) {
                        t71Var2.Y0 = null;
                    } else {
                        int size = t71Var2.W0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) t71Var2.W0.get(i10);
                                if (tL_wallPaper.pattern && g6Var2.o.equals(tL_wallPaper.slug)) {
                                    t71Var2.Y0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    t71Var2.x = true;
                    t71Var2.L0[1].a(t71Var2.Y0 != null, true);
                    t71Var2.r1(false);
                    org.telegram.ui.ActionBar.j6.t1(false, false);
                }
                Drawable background = t71Var2.z0.getBackground();
                if (background instanceof org.telegram.ui.Components.ra0) {
                    org.telegram.ui.Components.ra0 ra0Var = (org.telegram.ui.Components.ra0) background;
                    ra0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (t71Var2.n1 < 0.0f) {
                            t71Var2.z0.getImageReceiver().m0(ra0Var.k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = t71Var2.V0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = t71Var2.n1;
                        if (f11 < 0.0f) {
                            t71Var2.n1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = t71Var2.V0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(t71Var2.n1);
                }
                org.telegram.ui.ActionBar.j6.v1(true);
                t71Var2.d1(2, false);
                break;
            default:
                t71 t71Var3 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var3 = t71Var3.w;
                if (g6Var3.j == 4294967296L) {
                    g6Var3.j = 0L;
                    g6Var3.k = 0L;
                    g6Var3.l = 0L;
                    g6Var3.m = 0L;
                    t71Var3.r1(false);
                    org.telegram.ui.ActionBar.j6.t1(false, false);
                }
                t71Var3.x = true;
                org.telegram.ui.ActionBar.j6.v1(true);
                t71Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
