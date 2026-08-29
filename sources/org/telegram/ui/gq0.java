package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ gq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.x0(false);
                org.telegram.ui.Components.bg0.l0.k(true, true);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer2.e3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.P8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.P8;
                photoViewer6.Z2();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer8.h2();
                break;
            case 8:
                org.telegram.ui.Components.pe0 pe0Var = this.b.y1;
                wf.e eVar = pe0Var.c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                pe0Var.b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.P8;
                photoViewer9.m0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.m5.b.setLoading(false);
                photoViewer10.e3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.b;
                photoViewer11.m5.b.setLoading(false);
                photoViewer11.e3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.P8;
                photoViewer12.e3(0);
                break;
            case 13:
                this.b.l5.R = false;
                break;
            case 14:
                this.b.u4.setBackground(null);
                break;
            case 15:
                PhotoViewer photoViewer13 = this.b;
                photoViewer13.e7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.m5.b.setLoading(false);
                photoViewer14.e3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.b;
                photoViewer15.m5.b.setLoading(false);
                photoViewer15.e3(0);
                break;
            case 18:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.P8;
                photoViewer16.s3();
                break;
            case 19:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.P8;
                photoViewer17.k0();
                break;
            case 20:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.P8;
                photoViewer18.n3(true);
                break;
            case 21:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.r0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.y) && !org.telegram.ui.Components.bg0.l0.L && photoViewer19.L3) {
                    if (!photoViewer19.p4) {
                        photoViewer19.G3 = false;
                        photoViewer19.h3();
                        break;
                    } else {
                        et0 et0Var = photoViewer19.b0;
                        if (et0Var != null) {
                            if ((!et0Var.x || !"inapp".equals(MessagesController.getInstance(et0Var.a).youtubePipType)) && photoViewer19.b0.e()) {
                                photoViewer19.G3 = false;
                                if (PhotoViewer.W8 != null) {
                                    PhotoViewer.W8.P0();
                                }
                                photoViewer19.F3 = true;
                                PhotoViewer.W8 = PhotoViewer.V8;
                                PhotoViewer.V8 = null;
                                photoViewer19.e = false;
                                zt0 zt0Var = photoViewer19.Z4;
                                if (zt0Var != null && !zt0Var.a.getVisible()) {
                                    photoViewer19.Z4.a.setVisible(true, true);
                                }
                                photoViewer19.i6 = 1.0f;
                                photoViewer19.a0.invalidate();
                                photoViewer19.S0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer20 = this.b;
                if (photoViewer20.e && photoViewer20.j4 == 0) {
                    photoViewer20.v3(photoViewer20.F);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.P8;
                photoViewer21.F1();
                break;
            case 24:
                PhotoViewer photoViewer22 = this.b;
                org.telegram.ui.Components.x61 x61Var = photoViewer22.B2;
                if (x61Var != null && photoViewer22.W5 <= 1.35f) {
                    long o10 = x61Var.o();
                    long q6 = photoViewer22.B2.q();
                    if (o10 != -9223372036854775807L && q6 >= 8000) {
                        float f9 = photoViewer22.z7;
                        int k12 = photoViewer22.k1(photoViewer22.q4);
                        if (q6 <= 180000) {
                            photoViewer22.Y3.startRewind(photoViewer22.B2, f9 > ((float) (k12 / 3)), photoViewer22.z7, photoViewer22.p1, photoViewer22.w1);
                            break;
                        } else {
                            int i10 = k12 / 3;
                            if (f9 < i10 * 2) {
                                z10 = f9 >= ((float) i10);
                            }
                            photoViewer22.W3.startRewind(photoViewer22.B2, z10, photoViewer22.p1);
                            break;
                        }
                    }
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.b;
                if (!photoViewer23.Q4.isPopupShown()) {
                    org.telegram.ui.Components.x61 x61Var2 = photoViewer23.B2;
                    if (x61Var2 != null && photoViewer23.Q4.videoWasPlaying) {
                        x61Var2.D();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer23.Q4;
                    org.telegram.ui.Components.x61 x61Var3 = photoViewer23.B2;
                    videoAds.videoWasPlaying = x61Var3 != null ? x61Var3.z() : true;
                    org.telegram.ui.Components.x61 x61Var4 = photoViewer23.B2;
                    if (x61Var4 != null) {
                        x61Var4.C();
                        break;
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.P8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.ni niVar = photoViewer24.W1;
                if (niVar != null) {
                    niVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.o2 o2Var = photoViewer24.i4;
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 27:
                this.b.j7 = null;
                break;
            case 28:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.P8;
                photoViewer25.z3();
                break;
            default:
                PhotoViewer photoViewer26 = this.b;
                photoViewer26.z1.e(photoViewer26.F2, photoViewer26.G2, photoViewer26.H2, photoViewer26.L2, photoViewer26.N2, photoViewer26.K2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.I2, photoViewer26.J2, 0.0f, 0.0f, photoViewer26.M2);
                photoViewer26.e3(0);
                break;
        }
    }
}
