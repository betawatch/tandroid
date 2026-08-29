package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.al0, org.telegram.ui.Components.b81, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ db1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void b(float f9, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean i32 = s1Var.i3(f9);
            qc1 qc1Var = this.b;
            if (!i32) {
                qc1Var.Y0(2, true);
            } else if (s1Var.getMessageObject().isOutOwner()) {
                qc1Var.Y0(3, true);
            } else {
                qc1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qc1 qc1Var = this.b;
        if (qc1Var.x1 instanceof zh1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        pb1 pb1Var = qc1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        pb1Var.b(qc1Var.P0(drawable), drawable, Float.valueOf(qc1Var.h1));
        if (!z11 && qc1Var.B1 && qc1Var.s1 == null) {
            qc1Var.t0.getImageReceiver().setCrossfadeWithOldImage(false);
            qc1Var.i1();
            qc1Var.t0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        qc1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.b81
    public void e(int i10, int i11) {
        qc1 qc1Var = this.b;
        if (qc1Var.A1) {
            qc1Var.t0.getBackground();
            float scaleX = qc1Var.x0 != null ? (qc1Var.t0.getScaleX() - 1.0f) / (qc1Var.u1 - 1.0f) : 1.0f;
            qc1Var.t0.setTranslationX(i10 * scaleX);
            qc1Var.t0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.o0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                qc1 qc1Var = this.b;
                org.telegram.ui.ActionBar.e6 e6Var = qc1Var.s;
                if (e6Var.j == 4294967296L) {
                    e6Var.j = 0L;
                    e6Var.k = 0L;
                    e6Var.l = 0L;
                    e6Var.m = 0L;
                    qc1Var.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                qc1Var.v = true;
                org.telegram.ui.ActionBar.g6.p1(true);
                qc1Var.Y0(2, false);
                break;
            case 6:
                qc1 qc1Var2 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = qc1Var2.s;
                if (org.telegram.ui.ActionBar.g6.Z0() && org.telegram.ui.ActionBar.g6.I.e0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = e6Var2.y;
                    e6Var2.j = z5Var.d;
                    e6Var2.k = z5Var.e;
                    e6Var2.l = z5Var.f;
                    e6Var2.m = z5Var.g;
                    e6Var2.n = z5Var.h;
                    String str = z5Var.c;
                    e6Var2.o = str;
                    float f9 = z5Var.k;
                    e6Var2.p = f9;
                    qc1Var2.h1 = f9;
                    if (str == null || "c".equals(str)) {
                        qc1Var2.S0 = null;
                    } else {
                        int size = qc1Var2.Q0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) qc1Var2.Q0.get(i11);
                                if (tL_wallPaper.pattern && e6Var2.o.equals(tL_wallPaper.slug)) {
                                    qc1Var2.S0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    qc1Var2.v = true;
                    qc1Var2.F0[1].a(qc1Var2.S0 != null, true);
                    qc1Var2.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                Drawable background = qc1Var2.t0.getBackground();
                if (background instanceof org.telegram.ui.Components.yb0) {
                    org.telegram.ui.Components.yb0 yb0Var = (org.telegram.ui.Components.yb0) background;
                    yb0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        if (qc1Var2.h1 < 0.0f) {
                            qc1Var2.t0.getImageReceiver().setGradientBitmap(yb0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = qc1Var2.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = qc1Var2.h1;
                        if (f10 < 0.0f) {
                            qc1Var2.h1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = qc1Var2.P0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(qc1Var2.h1);
                }
                org.telegram.ui.ActionBar.g6.p1(true);
                qc1Var2.Y0(2, false);
                break;
            default:
                qc1 qc1Var3 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var3 = qc1Var3.s;
                if (e6Var3.j == 4294967296L) {
                    e6Var3.j = 0L;
                    e6Var3.k = 0L;
                    e6Var3.l = 0L;
                    e6Var3.m = 0L;
                    qc1Var3.m1(false);
                    org.telegram.ui.ActionBar.g6.n1(false, false);
                }
                qc1Var3.v = true;
                org.telegram.ui.ActionBar.g6.p1(true);
                qc1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.al0
    public /* synthetic */ void o0(View view, float f9, float f10) {
    }
}
