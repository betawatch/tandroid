package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.xl0, org.telegram.ui.Components.e91, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc1 b;

    public /* synthetic */ bb1(mc1 mc1Var, int i10) {
        this.a = i10;
        this.b = mc1Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            mc1 mc1Var = this.b;
            if (!i32) {
                mc1Var.Y0(2, true);
            } else if (u1Var.getMessageObject().isOutOwner()) {
                mc1Var.Y0(3, true);
            } else {
                mc1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mc1 mc1Var = this.b;
        if (mc1Var.B1 instanceof uh1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        mb1 mb1Var = mc1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        mb1Var.b(mc1Var.P0(drawable), drawable, Float.valueOf(mc1Var.l1));
        if (!z11 && mc1Var.F1 && mc1Var.w1 == null) {
            mc1Var.x0.getImageReceiver().setCrossfadeWithOldImage(false);
            mc1Var.i1();
            mc1Var.x0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        mc1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.e91
    public void e(int i10, int i11) {
        mc1 mc1Var = this.b;
        if (mc1Var.E1) {
            mc1Var.x0.getBackground();
            float scaleX = mc1Var.B0 != null ? (mc1Var.x0.getScaleX() - 1.0f) / (mc1Var.y1 - 1.0f) : 1.0f;
            mc1Var.x0.setTranslationX(i10 * scaleX);
            mc1Var.x0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.s0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                mc1 mc1Var = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = mc1Var.s;
                if (f6Var.j == 4294967296L) {
                    f6Var.j = 0L;
                    f6Var.k = 0L;
                    f6Var.l = 0L;
                    f6Var.m = 0L;
                    mc1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                mc1Var.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                mc1Var.Y0(2, false);
                break;
            case 6:
                mc1 mc1Var2 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = mc1Var2.s;
                if (org.telegram.ui.ActionBar.h6.a1() && org.telegram.ui.ActionBar.h6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.a6 a6Var = f6Var2.y;
                    f6Var2.j = a6Var.d;
                    f6Var2.k = a6Var.e;
                    f6Var2.l = a6Var.f;
                    f6Var2.m = a6Var.g;
                    f6Var2.n = a6Var.h;
                    String str = a6Var.c;
                    f6Var2.o = str;
                    float f7 = a6Var.k;
                    f6Var2.p = f7;
                    mc1Var2.l1 = f7;
                    if (str == null || "c".equals(str)) {
                        mc1Var2.W0 = null;
                    } else {
                        int size = mc1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) mc1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.o.equals(tL_wallPaper.slug)) {
                                    mc1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    mc1Var2.v = true;
                    mc1Var2.J0[1].a(mc1Var2.W0 != null, true);
                    mc1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                Drawable background = mc1Var2.x0.getBackground();
                if (background instanceof org.telegram.ui.Components.wc0) {
                    org.telegram.ui.Components.wc0 wc0Var = (org.telegram.ui.Components.wc0) background;
                    wc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (mc1Var2.l1 < 0.0f) {
                            mc1Var2.x0.getImageReceiver().setGradientBitmap(wc0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = mc1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = mc1Var2.l1;
                        if (f10 < 0.0f) {
                            mc1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = mc1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(mc1Var2.l1);
                }
                org.telegram.ui.ActionBar.h6.q1(true);
                mc1Var2.Y0(2, false);
                break;
            default:
                mc1 mc1Var3 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var3 = mc1Var3.s;
                if (f6Var3.j == 4294967296L) {
                    f6Var3.j = 0L;
                    f6Var3.k = 0L;
                    f6Var3.l = 0L;
                    f6Var3.m = 0L;
                    mc1Var3.m1(false);
                    org.telegram.ui.ActionBar.h6.o1(false, false);
                }
                mc1Var3.v = true;
                org.telegram.ui.ActionBar.h6.q1(true);
                mc1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
