package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l61 implements org.telegram.messenger.lc, org.telegram.ui.Components.dj0, org.telegram.ui.Components.y61, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ l61(w71 w71Var, int i7) {
        this.a = i7;
        this.b = w71Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean B2 = q1Var.B2(f10);
            w71 w71Var = this.b;
            if (!B2) {
                w71Var.d1(2, true);
            } else if (q1Var.getMessageObject().P3()) {
                w71Var.d1(3, true);
            } else {
                w71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        w71 w71Var = this.b;
        if (w71Var.C1 instanceof sc1) {
            return;
        }
        Drawable t6 = imageReceiver.t();
        if (!z9 || t6 == null) {
            return;
        }
        x61 x61Var = w71Var.a;
        org.telegram.messenger.g0.q(t6);
        x61Var.k(w71Var.T0(t6), t6, Float.valueOf(w71Var.m1));
        if (!z10 && w71Var.G1 && w71Var.x1 == null) {
            w71Var.y0.getImageReceiver().A0 = false;
            w71Var.n1();
            w71Var.y0.getImageReceiver().A0 = true;
        }
        w71Var.a1();
    }

    @Override // org.telegram.ui.Components.dj0
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
                w71 w71Var = this.b;
                org.telegram.ui.ActionBar.i6 i6Var = w71Var.w;
                if (i6Var.j == 4294967296L) {
                    i6Var.j = 0L;
                    i6Var.k = 0L;
                    i6Var.l = 0L;
                    i6Var.m = 0L;
                    w71Var.r1(false);
                    org.telegram.ui.ActionBar.l6.t1(false, false);
                }
                w71Var.x = true;
                org.telegram.ui.ActionBar.l6.v1(true);
                w71Var.d1(2, false);
                break;
            case 6:
                w71 w71Var2 = this.b;
                org.telegram.ui.ActionBar.i6 i6Var2 = w71Var2.w;
                if (org.telegram.ui.ActionBar.l6.c1() && org.telegram.ui.ActionBar.l6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.y;
                    i6Var2.j = d6Var.d;
                    i6Var2.k = d6Var.e;
                    i6Var2.l = d6Var.f;
                    i6Var2.m = d6Var.g;
                    i6Var2.n = d6Var.h;
                    String str = d6Var.c;
                    i6Var2.o = str;
                    float f10 = d6Var.k;
                    i6Var2.p = f10;
                    w71Var2.m1 = f10;
                    if (str == null || "c".equals(str)) {
                        w71Var2.X0 = null;
                    } else {
                        int size = w71Var2.V0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) w71Var2.V0.get(i10);
                                if (tL_wallPaper.pattern && i6Var2.o.equals(tL_wallPaper.slug)) {
                                    w71Var2.X0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    w71Var2.x = true;
                    w71Var2.K0[1].a(w71Var2.X0 != null, true);
                    w71Var2.r1(false);
                    org.telegram.ui.ActionBar.l6.t1(false, false);
                }
                Drawable background = w71Var2.y0.getBackground();
                if (background instanceof org.telegram.ui.Components.ra0) {
                    org.telegram.ui.Components.ra0 ra0Var = (org.telegram.ui.Components.ra0) background;
                    ra0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.l6.I.q()) {
                        if (w71Var2.m1 < 0.0f) {
                            w71Var2.y0.getImageReceiver().m0(ra0Var.k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = w71Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = w71Var2.m1;
                        if (f11 < 0.0f) {
                            w71Var2.m1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = w71Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(w71Var2.m1);
                }
                org.telegram.ui.ActionBar.l6.v1(true);
                w71Var2.d1(2, false);
                break;
            default:
                w71 w71Var3 = this.b;
                org.telegram.ui.ActionBar.i6 i6Var3 = w71Var3.w;
                if (i6Var3.j == 4294967296L) {
                    i6Var3.j = 0L;
                    i6Var3.k = 0L;
                    i6Var3.l = 0L;
                    i6Var3.m = 0L;
                    w71Var3.r1(false);
                    org.telegram.ui.ActionBar.l6.t1(false, false);
                }
                w71Var3.x = true;
                org.telegram.ui.ActionBar.l6.v1(true);
                w71Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.y61
    public void h(int i7, int i10) {
        w71 w71Var = this.b;
        if (w71Var.F1) {
            w71Var.y0.getBackground();
            float scaleX = w71Var.C0 != null ? (w71Var.y0.getScaleX() - 1.0f) / (w71Var.z1 - 1.0f) : 1.0f;
            w71Var.y0.setTranslationX(i7 * scaleX);
            w71Var.y0.setTranslationY(i10 * scaleX);
        }
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
