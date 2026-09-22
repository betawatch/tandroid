package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.al0, org.telegram.ui.Components.k81, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd1 b;

    public /* synthetic */ lc1(wd1 wd1Var, int i10) {
        this.a = i10;
        this.b = wd1Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            wd1 wd1Var = this.b;
            if (!i32) {
                wd1Var.Y0(2, true);
            } else if (t1Var.getMessageObject().isOutOwner()) {
                wd1Var.Y0(3, true);
            } else {
                wd1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        wd1 wd1Var = this.b;
        if (wd1Var.B1 instanceof gj1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        wc1 wc1Var = wd1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        wc1Var.b(wd1Var.P0(drawable), drawable, Float.valueOf(wd1Var.l1));
        if (!z11 && wd1Var.F1 && wd1Var.w1 == null) {
            wd1Var.x0.getImageReceiver().setCrossfadeWithOldImage(false);
            wd1Var.i1();
            wd1Var.x0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        wd1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.k81
    public void e(int i10, int i11) {
        wd1 wd1Var = this.b;
        if (wd1Var.E1) {
            wd1Var.x0.getBackground();
            float scaleX = wd1Var.B0 != null ? (wd1Var.x0.getScaleX() - 1.0f) / (wd1Var.y1 - 1.0f) : 1.0f;
            wd1Var.x0.setTranslationX(i10 * scaleX);
            wd1Var.x0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.s0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                wd1 wd1Var = this.b;
                org.telegram.ui.ActionBar.g6 g6Var = wd1Var.s;
                if (g6Var.j == 4294967296L) {
                    g6Var.j = 0L;
                    g6Var.k = 0L;
                    g6Var.l = 0L;
                    g6Var.m = 0L;
                    wd1Var.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                wd1Var.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                wd1Var.Y0(2, false);
                break;
            case 6:
                wd1 wd1Var2 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var2 = wd1Var2.s;
                if (org.telegram.ui.ActionBar.i6.Z0() && org.telegram.ui.ActionBar.i6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.b6 b6Var = g6Var2.y;
                    g6Var2.j = b6Var.d;
                    g6Var2.k = b6Var.e;
                    g6Var2.l = b6Var.f;
                    g6Var2.m = b6Var.g;
                    g6Var2.n = b6Var.h;
                    String str = b6Var.c;
                    g6Var2.o = str;
                    float f7 = b6Var.k;
                    g6Var2.p = f7;
                    wd1Var2.l1 = f7;
                    if (str == null || "c".equals(str)) {
                        wd1Var2.W0 = null;
                    } else {
                        int size = wd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && g6Var2.o.equals(tL_wallPaper.slug)) {
                                    wd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    wd1Var2.v = true;
                    wd1Var2.J0[1].a(wd1Var2.W0 != null, true);
                    wd1Var2.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                Drawable background = wd1Var2.x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cc0) {
                    org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) background;
                    cc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
                        if (wd1Var2.l1 < 0.0f) {
                            wd1Var2.x0.getImageReceiver().setGradientBitmap(cc0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = wd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = wd1Var2.l1;
                        if (f10 < 0.0f) {
                            wd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = wd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(wd1Var2.l1);
                }
                org.telegram.ui.ActionBar.i6.p1(true);
                wd1Var2.Y0(2, false);
                break;
            default:
                wd1 wd1Var3 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var3 = wd1Var3.s;
                if (g6Var3.j == 4294967296L) {
                    g6Var3.j = 0L;
                    g6Var3.k = 0L;
                    g6Var3.l = 0L;
                    g6Var3.m = 0L;
                    wd1Var3.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                wd1Var3.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                wd1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
