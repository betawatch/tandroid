package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bm0, org.telegram.ui.Components.x91, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc1 b;

    public /* synthetic */ jb1(vc1 vc1Var, int i10) {
        this.a = i10;
        this.b = vc1Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        vc1 vc1Var = this.b;
        if (vc1Var.C1 instanceof di1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        ub1 ub1Var = vc1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        ub1Var.j(vc1Var.P0(drawable), drawable, Float.valueOf(vc1Var.m1));
        if (!z11 && vc1Var.G1 && vc1Var.x1 == null) {
            vc1Var.y0.getImageReceiver().setCrossfadeWithOldImage(false);
            vc1Var.j1();
            vc1Var.y0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        vc1Var.W0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean i32 = s1Var.i3(f7);
            vc1 vc1Var = this.b;
            if (!i32) {
                vc1Var.Z0(2, true);
            } else if (s1Var.getMessageObject().isOutOwner()) {
                vc1Var.Z0(3, true);
            } else {
                vc1Var.Z0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.t0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                vc1 vc1Var = this.b;
                org.telegram.ui.ActionBar.w6 w6Var = vc1Var.v;
                if (w6Var.j == 4294967296L) {
                    w6Var.j = 0L;
                    w6Var.k = 0L;
                    w6Var.l = 0L;
                    w6Var.m = 0L;
                    vc1Var.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                vc1Var.w = true;
                org.telegram.ui.ActionBar.y6.s1(true);
                vc1Var.Z0(2, false);
                break;
            case 6:
                vc1 vc1Var2 = this.b;
                org.telegram.ui.ActionBar.w6 w6Var2 = vc1Var2.v;
                if (org.telegram.ui.ActionBar.y6.b1() && org.telegram.ui.ActionBar.y6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.r6 r6Var = w6Var2.y;
                    w6Var2.j = r6Var.d;
                    w6Var2.k = r6Var.e;
                    w6Var2.l = r6Var.f;
                    w6Var2.m = r6Var.g;
                    w6Var2.n = r6Var.h;
                    String str = r6Var.c;
                    w6Var2.o = str;
                    float f7 = r6Var.k;
                    w6Var2.p = f7;
                    vc1Var2.m1 = f7;
                    if (str == null || "c".equals(str)) {
                        vc1Var2.X0 = null;
                    } else {
                        int size = vc1Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) vc1Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && w6Var2.o.equals(tL_wallPaper.slug)) {
                                    vc1Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    vc1Var2.w = true;
                    vc1Var2.K0[1].a(vc1Var2.X0 != null, true);
                    vc1Var2.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                Drawable background = vc1Var2.y0.getBackground();
                if (background instanceof org.telegram.ui.Components.vc0) {
                    org.telegram.ui.Components.vc0 vc0Var = (org.telegram.ui.Components.vc0) background;
                    vc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.y6.I.q()) {
                        if (vc1Var2.m1 < 0.0f) {
                            vc1Var2.y0.getImageReceiver().setGradientBitmap(vc0Var.k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = vc1Var2.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = vc1Var2.m1;
                        if (f10 < 0.0f) {
                            vc1Var2.m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = vc1Var2.U0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(vc1Var2.m1);
                }
                org.telegram.ui.ActionBar.y6.s1(true);
                vc1Var2.Z0(2, false);
                break;
            default:
                vc1 vc1Var3 = this.b;
                org.telegram.ui.ActionBar.w6 w6Var3 = vc1Var3.v;
                if (w6Var3.j == 4294967296L) {
                    w6Var3.j = 0L;
                    w6Var3.k = 0L;
                    w6Var3.l = 0L;
                    w6Var3.m = 0L;
                    vc1Var3.n1(false);
                    org.telegram.ui.ActionBar.y6.q1(false, false);
                }
                vc1Var3.w = true;
                org.telegram.ui.ActionBar.y6.s1(true);
                vc1Var3.Z0(2, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x91
    public void i(int i10, int i11) {
        vc1 vc1Var = this.b;
        if (vc1Var.F1) {
            vc1Var.y0.getBackground();
            float scaleX = vc1Var.C0 != null ? (vc1Var.y0.getScaleX() - 1.0f) / (vc1Var.z1 - 1.0f) : 1.0f;
            vc1Var.y0.setTranslationX(i10 * scaleX);
            vc1Var.y0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
