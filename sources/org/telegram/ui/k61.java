package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k61 implements org.telegram.messenger.lc, org.telegram.ui.Components.cj0, org.telegram.ui.Components.x61, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ k61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean B2 = q1Var.B2(f10);
            v71 v71Var = this.b;
            if (!B2) {
                v71Var.d1(2, true);
            } else if (q1Var.getMessageObject().Q3()) {
                v71Var.d1(3, true);
            } else {
                v71Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        v71 v71Var = this.b;
        if (v71Var.C1 instanceof pc1) {
            return;
        }
        Drawable t6 = imageReceiver.t();
        if (!z9 || t6 == null) {
            return;
        }
        w61 w61Var = v71Var.a;
        org.telegram.messenger.g0.q(t6);
        w61Var.k(v71Var.T0(t6), t6, Float.valueOf(v71Var.m1));
        if (!z10 && v71Var.G1 && v71Var.x1 == null) {
            v71Var.y0.getImageReceiver().A0 = false;
            v71Var.n1();
            v71Var.y0.getImageReceiver().A0 = true;
        }
        v71Var.a1();
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
                v71 v71Var = this.b;
                org.telegram.ui.ActionBar.h6 h6Var = v71Var.w;
                if (h6Var.j == 4294967296L) {
                    h6Var.j = 0L;
                    h6Var.k = 0L;
                    h6Var.l = 0L;
                    h6Var.m = 0L;
                    v71Var.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                v71Var.x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                v71Var.d1(2, false);
                break;
            case 6:
                v71 v71Var2 = this.b;
                org.telegram.ui.ActionBar.h6 h6Var2 = v71Var2.w;
                if (org.telegram.ui.ActionBar.k6.c1() && org.telegram.ui.ActionBar.k6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.y;
                    h6Var2.j = c6Var.d;
                    h6Var2.k = c6Var.e;
                    h6Var2.l = c6Var.f;
                    h6Var2.m = c6Var.g;
                    h6Var2.n = c6Var.h;
                    String str = c6Var.c;
                    h6Var2.o = str;
                    float f10 = c6Var.k;
                    h6Var2.p = f10;
                    v71Var2.m1 = f10;
                    if (str == null || "c".equals(str)) {
                        v71Var2.X0 = null;
                    } else {
                        int size = v71Var2.V0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) v71Var2.V0.get(i10);
                                if (tL_wallPaper.pattern && h6Var2.o.equals(tL_wallPaper.slug)) {
                                    v71Var2.X0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    v71Var2.x = true;
                    v71Var2.K0[1].a(v71Var2.X0 != null, true);
                    v71Var2.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                Drawable background = v71Var2.y0.getBackground();
                if (background instanceof org.telegram.ui.Components.qa0) {
                    org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) background;
                    qa0Var.s(100, null);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (v71Var2.m1 < 0.0f) {
                            v71Var2.y0.getImageReceiver().m0(qa0Var.k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = v71Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = v71Var2.m1;
                        if (f11 < 0.0f) {
                            v71Var2.m1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = v71Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(v71Var2.m1);
                }
                org.telegram.ui.ActionBar.k6.v1(true);
                v71Var2.d1(2, false);
                break;
            default:
                v71 v71Var3 = this.b;
                org.telegram.ui.ActionBar.h6 h6Var3 = v71Var3.w;
                if (h6Var3.j == 4294967296L) {
                    h6Var3.j = 0L;
                    h6Var3.k = 0L;
                    h6Var3.l = 0L;
                    h6Var3.m = 0L;
                    v71Var3.r1(false);
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                }
                v71Var3.x = true;
                org.telegram.ui.ActionBar.k6.v1(true);
                v71Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x61
    public void h(int i7, int i10) {
        v71 v71Var = this.b;
        if (v71Var.F1) {
            v71Var.y0.getBackground();
            float scaleX = v71Var.C0 != null ? (v71Var.y0.getScaleX() - 1.0f) / (v71Var.z1 - 1.0f) : 1.0f;
            v71Var.y0.setTranslationX(i7 * scaleX);
            v71Var.y0.setTranslationY(i10 * scaleX);
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
