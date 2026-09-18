package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bl0, org.telegram.ui.Components.l81, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd1 b;

    public /* synthetic */ mc1(xd1 xd1Var, int i10) {
        this.a = i10;
        this.b = xd1Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            xd1 xd1Var = this.b;
            if (!i32) {
                xd1Var.Y0(2, true);
            } else if (t1Var.getMessageObject().isOutOwner()) {
                xd1Var.Y0(3, true);
            } else {
                xd1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xd1 xd1Var = this.b;
        if (xd1Var.B1 instanceof fj1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        xc1 xc1Var = xd1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        xc1Var.b(xd1Var.P0(drawable), drawable, Float.valueOf(xd1Var.l1));
        if (!z11 && xd1Var.F1 && xd1Var.w1 == null) {
            xd1Var.x0.getImageReceiver().setCrossfadeWithOldImage(false);
            xd1Var.i1();
            xd1Var.x0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        xd1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.l81
    public void e(int i10, int i11) {
        xd1 xd1Var = this.b;
        if (xd1Var.E1) {
            xd1Var.x0.getBackground();
            float scaleX = xd1Var.B0 != null ? (xd1Var.x0.getScaleX() - 1.0f) / (xd1Var.y1 - 1.0f) : 1.0f;
            xd1Var.x0.setTranslationX(i10 * scaleX);
            xd1Var.x0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.s0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                xd1 xd1Var = this.b;
                org.telegram.ui.ActionBar.h6 h6Var = xd1Var.s;
                if (h6Var.j == 4294967296L) {
                    h6Var.j = 0L;
                    h6Var.k = 0L;
                    h6Var.l = 0L;
                    h6Var.m = 0L;
                    xd1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                xd1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                xd1Var.Y0(2, false);
                break;
            case 6:
                xd1 xd1Var2 = this.b;
                org.telegram.ui.ActionBar.h6 h6Var2 = xd1Var2.s;
                if (org.telegram.ui.ActionBar.j6.Z0() && org.telegram.ui.ActionBar.j6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.c6 c6Var = h6Var2.y;
                    h6Var2.j = c6Var.d;
                    h6Var2.k = c6Var.e;
                    h6Var2.l = c6Var.f;
                    h6Var2.m = c6Var.g;
                    h6Var2.n = c6Var.h;
                    String str = c6Var.c;
                    h6Var2.o = str;
                    float f7 = c6Var.k;
                    h6Var2.p = f7;
                    xd1Var2.l1 = f7;
                    if (str == null || "c".equals(str)) {
                        xd1Var2.W0 = null;
                    } else {
                        int size = xd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) xd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.o.equals(tL_wallPaper.slug)) {
                                    xd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    xd1Var2.v = true;
                    xd1Var2.J0[1].a(xd1Var2.W0 != null, true);
                    xd1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = xd1Var2.x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cc0) {
                    org.telegram.ui.Components.cc0 cc0Var = (org.telegram.ui.Components.cc0) background;
                    cc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (xd1Var2.l1 < 0.0f) {
                            xd1Var2.x0.getImageReceiver().setGradientBitmap(cc0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = xd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = xd1Var2.l1;
                        if (f10 < 0.0f) {
                            xd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = xd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(xd1Var2.l1);
                }
                org.telegram.ui.ActionBar.j6.p1(true);
                xd1Var2.Y0(2, false);
                break;
            default:
                xd1 xd1Var3 = this.b;
                org.telegram.ui.ActionBar.h6 h6Var3 = xd1Var3.s;
                if (h6Var3.j == 4294967296L) {
                    h6Var3.j = 0L;
                    h6Var3.k = 0L;
                    h6Var3.l = 0L;
                    h6Var3.m = 0L;
                    xd1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                xd1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                xd1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
