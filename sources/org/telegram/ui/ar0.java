package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ar0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ar0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.x0(false);
                org.telegram.ui.Components.og0.p0.k(true, true);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.d3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.v2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.v2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.v2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.Y2();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.v2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.h2();
                break;
            case 8:
                org.telegram.ui.Components.ef0 ef0Var = this.b.C1;
                lg.f fVar = ef0Var.c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                ef0Var.b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.m0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.q5.b.setLoading(false);
                photoViewer10.d3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.b;
                photoViewer11.q5.b.setLoading(false);
                photoViewer11.d3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.d3(0);
                break;
            case 13:
                this.b.p5.V = false;
                break;
            case 14:
                this.b.y4.setBackground(null);
                break;
            case 15:
                PhotoViewer photoViewer13 = this.b;
                photoViewer13.i7 = null;
                photoViewer13.m0();
                photoViewer13.d3(0);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.q5.b.setLoading(false);
                photoViewer14.d3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.b;
                photoViewer15.q5.b.setLoading(false);
                photoViewer15.d3(0);
                break;
            case 18:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.r3();
                break;
            case 19:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.k0();
                break;
            case 20:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.m3(true);
                break;
            case 21:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.v0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.y) && !org.telegram.ui.Components.og0.p0.P && photoViewer19.P3) {
                    if (!photoViewer19.t4) {
                        photoViewer19.K3 = false;
                        photoViewer19.g3();
                        break;
                    } else {
                        au0 au0Var = photoViewer19.f0;
                        if (au0Var != null) {
                            if ((!au0Var.x || !"inapp".equals(MessagesController.getInstance(au0Var.a).youtubePipType)) && photoViewer19.f0.e()) {
                                photoViewer19.K3 = false;
                                if (PhotoViewer.b9 != null) {
                                    PhotoViewer.b9.P0();
                                }
                                photoViewer19.J3 = true;
                                PhotoViewer.b9 = PhotoViewer.a9;
                                PhotoViewer.a9 = null;
                                photoViewer19.e = false;
                                vu0 vu0Var = photoViewer19.d5;
                                if (vu0Var != null && !vu0Var.a.getVisible()) {
                                    photoViewer19.d5.a.setVisible(true, true);
                                }
                                photoViewer19.m6 = 1.0f;
                                photoViewer19.e0.invalidate();
                                photoViewer19.S0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer20 = this.b;
                if (photoViewer20.e && photoViewer20.n4 == 0) {
                    photoViewer20.u3(photoViewer20.J);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.F1();
                break;
            case 24:
                PhotoViewer photoViewer22 = this.b;
                org.telegram.ui.Components.s71 s71Var = photoViewer22.F2;
                if (s71Var != null && photoViewer22.a6 <= 1.35f) {
                    long n10 = s71Var.n();
                    long p5 = photoViewer22.F2.p();
                    if (n10 != -9223372036854775807L && p5 >= 8000) {
                        float f7 = photoViewer22.E7;
                        int k12 = photoViewer22.k1(photoViewer22.u4);
                        if (p5 <= 180000) {
                            photoViewer22.c4.startRewind(photoViewer22.F2, f7 > ((float) (k12 / 3)), photoViewer22.E7, photoViewer22.t1, photoViewer22.A1);
                            break;
                        } else {
                            int i10 = k12 / 3;
                            if (f7 < i10 * 2) {
                                z10 = f7 >= ((float) i10);
                            }
                            photoViewer22.a4.startRewind(photoViewer22.F2, z10, photoViewer22.t1);
                            break;
                        }
                    }
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.b;
                if (!photoViewer23.U4.isPopupShown()) {
                    org.telegram.ui.Components.s71 s71Var2 = photoViewer23.F2;
                    if (s71Var2 != null && photoViewer23.U4.videoWasPlaying) {
                        s71Var2.C();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.s71 s71Var3 = photoViewer23.F2;
                    videoAds.videoWasPlaying = s71Var3 != null ? s71Var3.y() : true;
                    org.telegram.ui.Components.s71 s71Var4 = photoViewer23.F2;
                    if (s71Var4 != null) {
                        s71Var4.B();
                        break;
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.wi wiVar = photoViewer24.a2;
                if (wiVar != null) {
                    wiVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.m2 m2Var = photoViewer24.m4;
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 27:
                this.b.n7 = null;
                break;
            case 28:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.y3();
                break;
            default:
                PhotoViewer photoViewer26 = this.b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.q2(true), photoViewer26.q2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.d3(0);
                break;
        }
    }
}
