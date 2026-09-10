package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.kl0, org.telegram.ui.Components.x81, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ae1 b;

    public /* synthetic */ pc1(ae1 ae1Var, int i10) {
        this.a = i10;
        this.b = ae1Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f7);
            ae1 ae1Var = this.b;
            if (!i32) {
                ae1Var.Y0(2, true);
            } else if (t1Var.getMessageObject().isOutOwner()) {
                ae1Var.Y0(3, true);
            } else {
                ae1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ae1 ae1Var = this.b;
        if (ae1Var.B1 instanceof kj1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        ad1 ad1Var = ae1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        ad1Var.b(ae1Var.P0(drawable), drawable, Float.valueOf(ae1Var.l1));
        if (!z11 && ae1Var.F1 && ae1Var.w1 == null) {
            ae1Var.x0.getImageReceiver().setCrossfadeWithOldImage(false);
            ae1Var.i1();
            ae1Var.x0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        ae1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.s0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                ae1 ae1Var = this.b;
                org.telegram.ui.ActionBar.h6 h6Var = ae1Var.s;
                if (h6Var.j == 4294967296L) {
                    h6Var.j = 0L;
                    h6Var.k = 0L;
                    h6Var.l = 0L;
                    h6Var.m = 0L;
                    ae1Var.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                ae1Var.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                ae1Var.Y0(2, false);
                break;
            case 6:
                ae1 ae1Var2 = this.b;
                org.telegram.ui.ActionBar.h6 h6Var2 = ae1Var2.s;
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
                    ae1Var2.l1 = f7;
                    if (str == null || "c".equals(str)) {
                        ae1Var2.W0 = null;
                    } else {
                        int size = ae1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) ae1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && h6Var2.o.equals(tL_wallPaper.slug)) {
                                    ae1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    ae1Var2.v = true;
                    ae1Var2.J0[1].a(ae1Var2.W0 != null, true);
                    ae1Var2.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                Drawable background = ae1Var2.x0.getBackground();
                if (background instanceof org.telegram.ui.Components.lc0) {
                    org.telegram.ui.Components.lc0 lc0Var = (org.telegram.ui.Components.lc0) background;
                    lc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.j6.I.q()) {
                        if (ae1Var2.l1 < 0.0f) {
                            ae1Var2.x0.getImageReceiver().setGradientBitmap(lc0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = ae1Var2.T0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = ae1Var2.l1;
                        if (f10 < 0.0f) {
                            ae1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = ae1Var2.T0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(ae1Var2.l1);
                }
                org.telegram.ui.ActionBar.j6.p1(true);
                ae1Var2.Y0(2, false);
                break;
            default:
                ae1 ae1Var3 = this.b;
                org.telegram.ui.ActionBar.h6 h6Var3 = ae1Var3.s;
                if (h6Var3.j == 4294967296L) {
                    h6Var3.j = 0L;
                    h6Var3.k = 0L;
                    h6Var3.l = 0L;
                    h6Var3.m = 0L;
                    ae1Var3.m1(false);
                    org.telegram.ui.ActionBar.j6.n1(false, false);
                }
                ae1Var3.v = true;
                org.telegram.ui.ActionBar.j6.p1(true);
                ae1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void g(int i10, int i11) {
        ae1 ae1Var = this.b;
        if (ae1Var.E1) {
            ae1Var.x0.getBackground();
            float scaleX = ae1Var.B0 != null ? (ae1Var.x0.getScaleX() - 1.0f) / (ae1Var.y1 - 1.0f) : 1.0f;
            ae1Var.x0.setTranslationX(i10 * scaleX);
            ae1Var.x0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
