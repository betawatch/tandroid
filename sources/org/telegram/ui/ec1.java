package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.nl0, org.telegram.ui.Components.j91, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd1 b;

    public /* synthetic */ ec1(pd1 pd1Var, int i10) {
        this.a = i10;
        this.b = pd1Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            pd1 pd1Var = this.b;
            if (!i32) {
                pd1Var.Y0(2, true);
            } else if (u1Var.getMessageObject().isOutOwner()) {
                pd1Var.Y0(3, true);
            } else {
                pd1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        pd1 pd1Var = this.b;
        if (pd1Var.B1 instanceof wi1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        pc1 pc1Var = pd1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        pc1Var.b(pd1Var.P0(drawable), drawable, Float.valueOf(pd1Var.l1));
        if (!z11 && pd1Var.F1 && pd1Var.w1 == null) {
            pd1Var.x0.getImageReceiver().setCrossfadeWithOldImage(false);
            pd1Var.i1();
            pd1Var.x0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        pd1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.j91
    public void e(int i10, int i11) {
        pd1 pd1Var = this.b;
        if (pd1Var.E1) {
            pd1Var.x0.getBackground();
            float scaleX = pd1Var.B0 != null ? (pd1Var.x0.getScaleX() - 1.0f) / (pd1Var.y1 - 1.0f) : 1.0f;
            pd1Var.x0.setTranslationX(i10 * scaleX);
            pd1Var.x0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
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
                pd1 pd1Var = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = pd1Var.s;
                if (f6Var.j == 4294967296L) {
                    f6Var.j = 0L;
                    f6Var.k = 0L;
                    f6Var.l = 0L;
                    f6Var.m = 0L;
                    pd1Var.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                pd1Var.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                pd1Var.Y0(2, false);
                break;
            case 6:
                pd1 pd1Var2 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = pd1Var2.s;
                if (org.telegram.ui.ActionBar.i6.Z0() && org.telegram.ui.ActionBar.i6.I.i0.d != 0) {
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
                    pd1Var2.l1 = f7;
                    if (str == null || "c".equals(str)) {
                        pd1Var2.W0 = null;
                    } else {
                        int size = pd1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) pd1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.o.equals(tL_wallPaper.slug)) {
                                    pd1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    pd1Var2.v = true;
                    pd1Var2.J0[1].a(pd1Var2.W0 != null, true);
                    pd1Var2.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                Drawable background = pd1Var2.x0.getBackground();
                if (background instanceof org.telegram.ui.Components.pc0) {
                    org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) background;
                    pc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.i6.I.q()) {
                        if (pd1Var2.l1 < 0.0f) {
                            pd1Var2.x0.getImageReceiver().setGradientBitmap(pc0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = pd1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = pd1Var2.l1;
                        if (f10 < 0.0f) {
                            pd1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = pd1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(pd1Var2.l1);
                }
                org.telegram.ui.ActionBar.i6.p1(true);
                pd1Var2.Y0(2, false);
                break;
            default:
                pd1 pd1Var3 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var3 = pd1Var3.s;
                if (f6Var3.j == 4294967296L) {
                    f6Var3.j = 0L;
                    f6Var3.k = 0L;
                    f6Var3.l = 0L;
                    f6Var3.m = 0L;
                    pd1Var3.m1(false);
                    org.telegram.ui.ActionBar.i6.n1(false, false);
                }
                pd1Var3.v = true;
                org.telegram.ui.ActionBar.i6.p1(true);
                pd1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
