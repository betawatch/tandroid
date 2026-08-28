package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.nk0, org.telegram.ui.Components.p71, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc1 b;

    public /* synthetic */ cb1(oc1 oc1Var, int i9) {
        this.a = i9;
        this.b = oc1Var;
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f10);
            oc1 oc1Var = this.b;
            if (!i32) {
                oc1Var.Y0(2, true);
            } else if (t1Var.getMessageObject().isOutOwner()) {
                oc1Var.Y0(3, true);
            } else {
                oc1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oc1 oc1Var = this.b;
        if (oc1Var.x1 instanceof xh1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        ob1 ob1Var = oc1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        ob1Var.b(oc1Var.P0(drawable), drawable, Float.valueOf(oc1Var.h1));
        if (!z11 && oc1Var.B1 && oc1Var.s1 == null) {
            oc1Var.t0.getImageReceiver().setCrossfadeWithOldImage(false);
            oc1Var.i1();
            oc1Var.t0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        oc1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 3:
                this.b.o0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                oc1 oc1Var = this.b;
                org.telegram.ui.ActionBar.d6 d6Var = oc1Var.s;
                if (d6Var.j == 4294967296L) {
                    d6Var.j = 0L;
                    d6Var.k = 0L;
                    d6Var.l = 0L;
                    d6Var.m = 0L;
                    oc1Var.m1(false);
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                }
                oc1Var.v = true;
                org.telegram.ui.ActionBar.f6.p1(true);
                oc1Var.Y0(2, false);
                break;
            case 6:
                oc1 oc1Var2 = this.b;
                org.telegram.ui.ActionBar.d6 d6Var2 = oc1Var2.s;
                if (org.telegram.ui.ActionBar.f6.Z0() && org.telegram.ui.ActionBar.f6.I.e0.d != 0) {
                    org.telegram.ui.ActionBar.y5 y5Var = d6Var2.y;
                    d6Var2.j = y5Var.d;
                    d6Var2.k = y5Var.e;
                    d6Var2.l = y5Var.f;
                    d6Var2.m = y5Var.g;
                    d6Var2.n = y5Var.h;
                    String str = y5Var.c;
                    d6Var2.o = str;
                    float f10 = y5Var.k;
                    d6Var2.p = f10;
                    oc1Var2.h1 = f10;
                    if (str == null || "c".equals(str)) {
                        oc1Var2.S0 = null;
                    } else {
                        int size = oc1Var2.Q0.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) oc1Var2.Q0.get(i10);
                                if (tL_wallPaper.pattern && d6Var2.o.equals(tL_wallPaper.slug)) {
                                    oc1Var2.S0 = tL_wallPaper;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    oc1Var2.v = true;
                    oc1Var2.F0[1].a(oc1Var2.S0 != null, true);
                    oc1Var2.m1(false);
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                }
                Drawable background = oc1Var2.t0.getBackground();
                if (background instanceof org.telegram.ui.Components.jb0) {
                    org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) background;
                    jb0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.f6.I.q()) {
                        if (oc1Var2.h1 < 0.0f) {
                            oc1Var2.t0.getImageReceiver().setGradientBitmap(jb0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = oc1Var2.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = oc1Var2.h1;
                        if (f11 < 0.0f) {
                            oc1Var2.h1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = oc1Var2.P0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(oc1Var2.h1);
                }
                org.telegram.ui.ActionBar.f6.p1(true);
                oc1Var2.Y0(2, false);
                break;
            default:
                oc1 oc1Var3 = this.b;
                org.telegram.ui.ActionBar.d6 d6Var3 = oc1Var3.s;
                if (d6Var3.j == 4294967296L) {
                    d6Var3.j = 0L;
                    d6Var3.k = 0L;
                    d6Var3.l = 0L;
                    d6Var3.m = 0L;
                    oc1Var3.m1(false);
                    org.telegram.ui.ActionBar.f6.n1(false, false);
                }
                oc1Var3.v = true;
                org.telegram.ui.ActionBar.f6.p1(true);
                oc1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.p71
    public void g(int i9, int i10) {
        oc1 oc1Var = this.b;
        if (oc1Var.A1) {
            oc1Var.t0.getBackground();
            float scaleX = oc1Var.x0 != null ? (oc1Var.t0.getScaleX() - 1.0f) / (oc1Var.u1 - 1.0f) : 1.0f;
            oc1Var.t0.setTranslationX(i9 * scaleX);
            oc1Var.t0.setTranslationY(i10 * scaleX);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
