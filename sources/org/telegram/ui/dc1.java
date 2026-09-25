package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.ll0, org.telegram.ui.Components.y81, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ od1 b;

    public /* synthetic */ dc1(od1 od1Var, int i10) {
        this.a = i10;
        this.b = od1Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            od1 od1Var = this.b;
            if (!i32) {
                od1Var.Y0(2, true);
            } else if (u1Var.getMessageObject().isOutOwner()) {
                od1Var.Y0(3, true);
            } else {
                od1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        od1 od1Var = this.b;
        if (od1Var.B1 instanceof yi1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        oc1 oc1Var = od1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        oc1Var.b(od1Var.P0(drawable), drawable, Float.valueOf(od1Var.l1));
        if (!z11 && od1Var.F1 && od1Var.w1 == null) {
            od1Var.x0.getImageReceiver().setCrossfadeWithOldImage(false);
            od1Var.i1();
            od1Var.x0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        od1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.s0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                od1 od1Var = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = od1Var.s;
                if (f6Var.j == 4294967296L) {
                    f6Var.j = 0L;
                    f6Var.k = 0L;
                    f6Var.l = 0L;
                    f6Var.m = 0L;
                    od1Var.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                od1Var.v = true;
                org.telegram.ui.ActionBar.h6.p1(true);
                od1Var.Y0(2, false);
                break;
            case 6:
                od1 od1Var2 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = od1Var2.s;
                if (org.telegram.ui.ActionBar.h6.Z0() && org.telegram.ui.ActionBar.h6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = f6Var2.y;
                    f6Var2.j = z5Var.d;
                    f6Var2.k = z5Var.e;
                    f6Var2.l = z5Var.f;
                    f6Var2.m = z5Var.g;
                    f6Var2.n = z5Var.h;
                    String str = z5Var.c;
                    f6Var2.o = str;
                    float f7 = z5Var.k;
                    f6Var2.p = f7;
                    od1Var2.l1 = f7;
                    if (str == null || "c".equals(str)) {
                        od1Var2.W0 = null;
                    } else {
                        int size = od1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) od1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && f6Var2.o.equals(tL_wallPaper.slug)) {
                                    od1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    od1Var2.v = true;
                    od1Var2.J0[1].a(od1Var2.W0 != null, true);
                    od1Var2.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                Drawable background = od1Var2.x0.getBackground();
                if (background instanceof org.telegram.ui.Components.mc0) {
                    org.telegram.ui.Components.mc0 mc0Var = (org.telegram.ui.Components.mc0) background;
                    mc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.h6.I.q()) {
                        if (od1Var2.l1 < 0.0f) {
                            od1Var2.x0.getImageReceiver().setGradientBitmap(mc0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = od1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = od1Var2.l1;
                        if (f10 < 0.0f) {
                            od1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = od1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(od1Var2.l1);
                }
                org.telegram.ui.ActionBar.h6.p1(true);
                od1Var2.Y0(2, false);
                break;
            default:
                od1 od1Var3 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var3 = od1Var3.s;
                if (f6Var3.j == 4294967296L) {
                    f6Var3.j = 0L;
                    f6Var3.k = 0L;
                    f6Var3.l = 0L;
                    f6Var3.m = 0L;
                    od1Var3.m1(false);
                    org.telegram.ui.ActionBar.h6.n1(false, false);
                }
                od1Var3.v = true;
                org.telegram.ui.ActionBar.h6.p1(true);
                od1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.y81
    public void g(int i10, int i11) {
        od1 od1Var = this.b;
        if (od1Var.E1) {
            od1Var.x0.getBackground();
            float scaleX = od1Var.B0 != null ? (od1Var.x0.getScaleX() - 1.0f) / (od1Var.y1 - 1.0f) : 1.0f;
            od1Var.x0.setTranslationX(i10 * scaleX);
            od1Var.x0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
