package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a81 implements org.telegram.messenger.nc, org.telegram.ui.Components.ik0, org.telegram.ui.Components.z71, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ a81(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            boolean y22 = q1Var.y2(f7);
            k91 k91Var = this.b;
            if (!y22) {
                k91Var.d1(2, true);
            } else if (q1Var.getMessageObject().P3()) {
                k91Var.d1(3, true);
            } else {
                k91Var.d1(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void e(int i10, int i11) {
        k91 k91Var = this.b;
        if (k91Var.F1) {
            k91Var.y0.getBackground();
            float scaleX = k91Var.C0 != null ? (k91Var.y0.getScaleX() - 1.0f) / (k91Var.z1 - 1.0f) : 1.0f;
            k91Var.y0.setTranslationX(i10 * scaleX);
            k91Var.y0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.t0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.S0(false);
                break;
            case 5:
                k91 k91Var = this.b;
                org.telegram.ui.ActionBar.r6 r6Var = k91Var.w;
                if (r6Var.j == 4294967296L) {
                    r6Var.j = 0L;
                    r6Var.k = 0L;
                    r6Var.l = 0L;
                    r6Var.m = 0L;
                    k91Var.r1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                k91Var.x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                k91Var.d1(2, false);
                break;
            case 6:
                k91 k91Var2 = this.b;
                org.telegram.ui.ActionBar.r6 r6Var2 = k91Var2.w;
                if (org.telegram.ui.ActionBar.t6.c1() && org.telegram.ui.ActionBar.t6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.m6 m6Var = r6Var2.y;
                    r6Var2.j = m6Var.d;
                    r6Var2.k = m6Var.e;
                    r6Var2.l = m6Var.f;
                    r6Var2.m = m6Var.g;
                    r6Var2.n = m6Var.h;
                    String str = m6Var.c;
                    r6Var2.o = str;
                    float f7 = m6Var.k;
                    r6Var2.p = f7;
                    k91Var2.m1 = f7;
                    if (str == null || "c".equals(str)) {
                        k91Var2.X0 = null;
                    } else {
                        int size = k91Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) k91Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && r6Var2.o.equals(tL_wallPaper.slug)) {
                                    k91Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    k91Var2.x = true;
                    k91Var2.K0[1].a(k91Var2.X0 != null, true);
                    k91Var2.r1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                Drawable background = k91Var2.y0.getBackground();
                if (background instanceof org.telegram.ui.Components.jb0) {
                    org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) background;
                    jb0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.t6.I.q()) {
                        if (k91Var2.m1 < 0.0f) {
                            k91Var2.y0.getImageReceiver().m0(jb0Var.k);
                        }
                        org.telegram.ui.Cells.h0 h0Var = k91Var2.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = k91Var2.m1;
                        if (f10 < 0.0f) {
                            k91Var2.m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.h0 h0Var2 = k91Var2.U0;
                if (h0Var2 != null) {
                    h0Var2.setProgress(k91Var2.m1);
                }
                org.telegram.ui.ActionBar.t6.v1(true);
                k91Var2.d1(2, false);
                break;
            default:
                k91 k91Var3 = this.b;
                org.telegram.ui.ActionBar.r6 r6Var3 = k91Var3.w;
                if (r6Var3.j == 4294967296L) {
                    r6Var3.j = 0L;
                    r6Var3.k = 0L;
                    r6Var3.l = 0L;
                    r6Var3.m = 0L;
                    k91Var3.r1(false);
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                }
                k91Var3.x = true;
                org.telegram.ui.ActionBar.t6.v1(true);
                k91Var3.d1(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        k91 k91Var = this.b;
        if (k91Var.C1 instanceof ke1) {
            return;
        }
        Drawable t10 = imageReceiver.t();
        if (!z10 || t10 == null) {
            return;
        }
        l81 l81Var = k91Var.a;
        org.telegram.messenger.i0.q(t10);
        l81Var.k(k91Var.T0(t10), t10, Float.valueOf(k91Var.m1));
        if (!z11 && k91Var.G1 && k91Var.x1 == null) {
            k91Var.y0.getImageReceiver().A0 = false;
            k91Var.n1();
            k91Var.y0.getImageReceiver().A0 = true;
        }
        k91Var.a1();
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
