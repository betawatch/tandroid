package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bm0, org.telegram.ui.Components.n91, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ fb1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean h32 = t1Var.h3(f7);
            qc1 qc1Var = this.b;
            if (!h32) {
                qc1Var.Y0(2, true);
            } else if (t1Var.getMessageObject().isOutOwner()) {
                qc1Var.Y0(3, true);
            } else {
                qc1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qc1 qc1Var = this.b;
        if (qc1Var.C1 instanceof zh1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        qb1 qb1Var = qc1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        qb1Var.j(qc1Var.O0(drawable), drawable, Float.valueOf(qc1Var.m1));
        if (!z11 && qc1Var.G1 && qc1Var.x1 == null) {
            qc1Var.y0.getImageReceiver().setCrossfadeWithOldImage(false);
            qc1Var.i1();
            qc1Var.y0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        qc1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.n91
    public void e(int i10, int i11) {
        qc1 qc1Var = this.b;
        if (qc1Var.F1) {
            qc1Var.y0.getBackground();
            float scaleX = qc1Var.C0 != null ? (qc1Var.y0.getScaleX() - 1.0f) / (qc1Var.z1 - 1.0f) : 1.0f;
            qc1Var.y0.setTranslationX(i10 * scaleX);
            qc1Var.y0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.t0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.N0(false);
                break;
            case 5:
                qc1 qc1Var = this.b;
                org.telegram.ui.ActionBar.i6 i6Var = qc1Var.v;
                if (i6Var.j == 4294967296L) {
                    i6Var.j = 0L;
                    i6Var.k = 0L;
                    i6Var.l = 0L;
                    i6Var.m = 0L;
                    qc1Var.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                qc1Var.w = true;
                org.telegram.ui.ActionBar.k6.s1(true);
                qc1Var.Y0(2, false);
                break;
            case 6:
                qc1 qc1Var2 = this.b;
                org.telegram.ui.ActionBar.i6 i6Var2 = qc1Var2.v;
                if (org.telegram.ui.ActionBar.k6.b1() && org.telegram.ui.ActionBar.k6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.y;
                    i6Var2.j = d6Var.d;
                    i6Var2.k = d6Var.e;
                    i6Var2.l = d6Var.f;
                    i6Var2.m = d6Var.g;
                    i6Var2.n = d6Var.h;
                    String str = d6Var.c;
                    i6Var2.o = str;
                    float f7 = d6Var.k;
                    i6Var2.p = f7;
                    qc1Var2.m1 = f7;
                    if (str == null || "c".equals(str)) {
                        qc1Var2.X0 = null;
                    } else {
                        int size = qc1Var2.V0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) qc1Var2.V0.get(i11);
                                if (tL_wallPaper.pattern && i6Var2.o.equals(tL_wallPaper.slug)) {
                                    qc1Var2.X0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    qc1Var2.w = true;
                    qc1Var2.K0[1].a(qc1Var2.X0 != null, true);
                    qc1Var2.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                Drawable background = qc1Var2.y0.getBackground();
                if (background instanceof org.telegram.ui.Components.yc0) {
                    org.telegram.ui.Components.yc0 yc0Var = (org.telegram.ui.Components.yc0) background;
                    yc0Var.s(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (qc1Var2.m1 < 0.0f) {
                            qc1Var2.y0.getImageReceiver().setGradientBitmap(yc0Var.k);
                        }
                        org.telegram.ui.Cells.i0 i0Var = qc1Var2.U0;
                        if (i0Var != null) {
                            i0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = qc1Var2.m1;
                        if (f10 < 0.0f) {
                            qc1Var2.m1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.i0 i0Var2 = qc1Var2.U0;
                if (i0Var2 != null) {
                    i0Var2.setProgress(qc1Var2.m1);
                }
                org.telegram.ui.ActionBar.k6.s1(true);
                qc1Var2.Y0(2, false);
                break;
            default:
                qc1 qc1Var3 = this.b;
                org.telegram.ui.ActionBar.i6 i6Var3 = qc1Var3.v;
                if (i6Var3.j == 4294967296L) {
                    i6Var3.j = 0L;
                    i6Var3.k = 0L;
                    i6Var3.l = 0L;
                    i6Var3.m = 0L;
                    qc1Var3.m1(false);
                    org.telegram.ui.ActionBar.k6.q1(false, false);
                }
                qc1Var3.w = true;
                org.telegram.ui.ActionBar.k6.s1(true);
                qc1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
