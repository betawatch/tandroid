package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.qk0, org.telegram.ui.Components.r71, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc1 b;

    public /* synthetic */ ab1(nc1 nc1Var, int i10) {
        this.a = i10;
        this.b = nc1Var;
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean h32 = s1Var.h3(f10);
            nc1 nc1Var = this.b;
            if (!h32) {
                nc1Var.Y0(2, true);
            } else if (s1Var.getMessageObject().isOutOwner()) {
                nc1Var.Y0(3, true);
            } else {
                nc1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.r71
    public void d(int i10, int i11) {
        nc1 nc1Var = this.b;
        if (nc1Var.A1) {
            nc1Var.t0.getBackground();
            float scaleX = nc1Var.x0 != null ? (nc1Var.t0.getScaleX() - 1.0f) / (nc1Var.u1 - 1.0f) : 1.0f;
            nc1Var.t0.setTranslationX(i10 * scaleX);
            nc1Var.t0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nc1 nc1Var = this.b;
        if (nc1Var.x1 instanceof wh1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        mb1 mb1Var = nc1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        mb1Var.b(nc1Var.P0(drawable), drawable, Float.valueOf(nc1Var.h1));
        if (!z11 && nc1Var.B1 && nc1Var.s1 == null) {
            nc1Var.t0.getImageReceiver().setCrossfadeWithOldImage(false);
            nc1Var.i1();
            nc1Var.t0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        nc1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.o0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                nc1 nc1Var = this.b;
                org.telegram.ui.ActionBar.e6 e6Var = nc1Var.s;
                if (e6Var.j == 4294967296L) {
                    e6Var.j = 0L;
                    e6Var.k = 0L;
                    e6Var.l = 0L;
                    e6Var.m = 0L;
                    nc1Var.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                nc1Var.v = true;
                org.telegram.ui.ActionBar.g6.p1(true);
                nc1Var.Y0(2, false);
                break;
            case 6:
                nc1 nc1Var2 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = nc1Var2.s;
                if (org.telegram.ui.ActionBar.g6.Z0() && org.telegram.ui.ActionBar.g6.I.e0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = e6Var2.y;
                    e6Var2.j = z5Var.d;
                    e6Var2.k = z5Var.e;
                    e6Var2.l = z5Var.f;
                    e6Var2.m = z5Var.g;
                    e6Var2.n = z5Var.h;
                    String str = z5Var.c;
                    e6Var2.o = str;
                    float f10 = z5Var.k;
                    e6Var2.p = f10;
                    nc1Var2.h1 = f10;
                    if (str == null || "c".equals(str)) {
                        nc1Var2.S0 = null;
                    } else {
                        int size = nc1Var2.Q0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) nc1Var2.Q0.get(i11);
                                if (tL_wallPaper.pattern && e6Var2.o.equals(tL_wallPaper.slug)) {
                                    nc1Var2.S0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    nc1Var2.v = true;
                    nc1Var2.F0[1].a(nc1Var2.S0 != null, true);
                    nc1Var2.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                Drawable background = nc1Var2.t0.getBackground();
                if (background instanceof org.telegram.ui.Components.nb0) {
                    org.telegram.ui.Components.nb0 nb0Var = (org.telegram.ui.Components.nb0) background;
                    nb0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        if (nc1Var2.h1 < 0.0f) {
                            nc1Var2.t0.getImageReceiver().setGradientBitmap(nb0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = nc1Var2.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = nc1Var2.h1;
                        if (f11 < 0.0f) {
                            nc1Var2.h1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = nc1Var2.P0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(nc1Var2.h1);
                }
                org.telegram.ui.ActionBar.g6.p1(true);
                nc1Var2.Y0(2, false);
                break;
            default:
                nc1 nc1Var3 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var3 = nc1Var3.s;
                if (e6Var3.j == 4294967296L) {
                    e6Var3.j = 0L;
                    e6Var3.k = 0L;
                    e6Var3.l = 0L;
                    e6Var3.m = 0L;
                    nc1Var3.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                nc1Var3.v = true;
                org.telegram.ui.ActionBar.g6.p1(true);
                nc1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
