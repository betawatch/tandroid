package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ fn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.c3(-1, false);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer2.b3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer3.t2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                photoViewer4.t2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer5.t2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer6.W2();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer7.t2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                ti.o oVar = photoViewer8.O8;
                if (oVar != null) {
                    oVar.c();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.fd0 fd0Var = this.b.C1;
                og.f fVar = fd0Var.c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                fd0Var.b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.Y8;
                photoViewer9.f0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.p5.b.setLoading(false);
                photoViewer10.b3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.b;
                photoViewer11.p5.b.setLoading(false);
                photoViewer11.b3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.Y8;
                photoViewer12.q0(false);
                break;
            case 13:
                PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.Y8;
                photoViewer13.b3(0);
                break;
            case 14:
                this.b.o5.V = false;
                break;
            case 15:
                this.b.x4.setBackground(null);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.h7 = null;
                photoViewer14.f0();
                photoViewer14.b3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.F3 == 2) {
                    photoViewer15.q0(false);
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.p5.b.setLoading(false);
                photoViewer16.b3(0);
                break;
            case 19:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.p5.b.setLoading(false);
                photoViewer17.b3(0);
                break;
            case 20:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.Y8;
                photoViewer18.p3();
                break;
            case 21:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.Y8;
                photoViewer19.d0();
                break;
            case 22:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.Y8;
                photoViewer20.k3(true);
                break;
            case 23:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.v0.isEnabled()) {
                    Activity activity = photoViewer21.D;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(activity) && l2.i.d().c() == null && photoViewer21.O3) {
                        if (!photoViewer21.s4) {
                            photoViewer21.J3 = false;
                            photoViewer21.e3();
                            break;
                        } else {
                            fq0 fq0Var = photoViewer21.f0;
                            if (fq0Var != null) {
                                if ((!fq0Var.y || !"inapp".equals(org.telegram.messenger.qp.s1(fq0Var.a).A3)) && photoViewer21.f0.e()) {
                                    photoViewer21.J3 = false;
                                    if (PhotoViewer.f9 != null) {
                                        PhotoViewer.f9.J0();
                                    }
                                    photoViewer21.I3 = true;
                                    PhotoViewer.f9 = PhotoViewer.e9;
                                    PhotoViewer.e9 = null;
                                    photoViewer21.e = false;
                                    zq0 zq0Var = photoViewer21.c5;
                                    if (zq0Var != null) {
                                        ImageReceiver imageReceiver = zq0Var.a;
                                        if (!imageReceiver.Q0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer21.l6 = 1.0f;
                                    photoViewer21.e0.invalidate();
                                    photoViewer21.M0();
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 24:
                PhotoViewer photoViewer22 = this.b;
                if (photoViewer22.e && photoViewer22.m4 == 0) {
                    photoViewer22.s3(photoViewer22.J);
                    break;
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.Y8;
                photoViewer23.D1();
                break;
            case 26:
                PhotoViewer photoViewer24 = this.b;
                org.telegram.ui.Components.t51 t51Var = photoViewer24.F2;
                if (t51Var != null && photoViewer24.Z5 <= 1.35f) {
                    long S = t51Var.S();
                    long U = photoViewer24.F2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer24.D7;
                        int g12 = photoViewer24.g1(photoViewer24.t4);
                        if (U <= 180000) {
                            photoViewer24.b4.startRewind(photoViewer24.F2, f10 > ((float) (g12 / 3)), photoViewer24.D7, photoViewer24.t1, photoViewer24.A1);
                            break;
                        } else {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                z9 = f10 >= ((float) i7);
                            }
                            photoViewer24.Z3.startRewind(photoViewer24.F2, z9, photoViewer24.t1);
                            break;
                        }
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer25 = this.b;
                photoViewer25.U8 = false;
                ti.o oVar2 = photoViewer25.O8;
                if (oVar2 != null) {
                    oVar2.c();
                    break;
                }
                break;
            case 28:
                PhotoViewer photoViewer26 = this.b;
                if (!photoViewer26.T4.isPopupShown()) {
                    org.telegram.ui.Components.t51 t51Var2 = photoViewer26.F2;
                    if (t51Var2 != null && photoViewer26.T4.videoWasPlaying) {
                        t51Var2.h0();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer26.T4;
                    org.telegram.ui.Components.t51 t51Var3 = photoViewer26.F2;
                    videoAds.videoWasPlaying = t51Var3 != null ? t51Var3.d0() : true;
                    org.telegram.ui.Components.t51 t51Var4 = photoViewer26.F2;
                    if (t51Var4 != null) {
                        t51Var4.g0();
                        break;
                    }
                }
                break;
            default:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.Y8;
                photoViewer27.z0(false, false);
                org.telegram.ui.Components.ci ciVar = photoViewer27.a2;
                if (ciVar != null) {
                    ciVar.a(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = photoViewer27.l4;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
        }
    }
}
