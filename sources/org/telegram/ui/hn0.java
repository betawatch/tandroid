package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ hn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.d3(-1, false);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer2.c3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer3.u2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                photoViewer4.u2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                photoViewer5.u2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                photoViewer6.X2();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer7.u2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                wi.n nVar = photoViewer8.P8;
                if (nVar != null) {
                    nVar.c();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.rd0 rd0Var = this.b.D1;
                og.f fVar = rd0Var.c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                rd0Var.b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.Z8;
                photoViewer9.f0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.q5.b.setLoading(false);
                photoViewer10.c3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.b;
                photoViewer11.q5.b.setLoading(false);
                photoViewer11.c3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.Z8;
                photoViewer12.q0(false);
                break;
            case 13:
                PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.Z8;
                photoViewer13.c3(0);
                break;
            case 14:
                this.b.p5.W = false;
                break;
            case 15:
                this.b.y4.setBackground(null);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.i7 = null;
                photoViewer14.f0();
                photoViewer14.c3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.G3 == 2) {
                    photoViewer15.q0(false);
                    break;
                }
                break;
            case 18:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.q5.b.setLoading(false);
                photoViewer16.c3(0);
                break;
            case 19:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.q5.b.setLoading(false);
                photoViewer17.c3(0);
                break;
            case 20:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.Z8;
                photoViewer18.q3();
                break;
            case 21:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.Z8;
                photoViewer19.d0();
                break;
            case 22:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.Z8;
                photoViewer20.l3(true);
                break;
            case 23:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.w0.isEnabled()) {
                    Activity activity = photoViewer21.E;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(activity) && l2.i.d().c() == null && photoViewer21.P3) {
                        if (!photoViewer21.t4) {
                            photoViewer21.K3 = false;
                            photoViewer21.f3();
                            break;
                        } else {
                            dq0 dq0Var = photoViewer21.g0;
                            if (dq0Var != null) {
                                if ((!dq0Var.y || !"inapp".equals(org.telegram.messenger.np.u1(dq0Var.a).D3)) && photoViewer21.g0.e()) {
                                    photoViewer21.K3 = false;
                                    if (PhotoViewer.g9 != null) {
                                        PhotoViewer.g9.J0();
                                    }
                                    photoViewer21.J3 = true;
                                    PhotoViewer.g9 = PhotoViewer.f9;
                                    PhotoViewer.f9 = null;
                                    photoViewer21.e = false;
                                    wq0 wq0Var = photoViewer21.d5;
                                    if (wq0Var != null) {
                                        ImageReceiver imageReceiver = wq0Var.a;
                                        if (!imageReceiver.R0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer21.m6 = 1.0f;
                                    photoViewer21.f0.invalidate();
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
                if (photoViewer22.e && photoViewer22.n4 == 0) {
                    photoViewer22.t3(photoViewer22.K);
                    break;
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.Z8;
                photoViewer23.D1();
                break;
            case 26:
                PhotoViewer photoViewer24 = this.b;
                org.telegram.ui.Components.i61 i61Var = photoViewer24.G2;
                if (i61Var != null && photoViewer24.a6 <= 1.35f) {
                    long S = i61Var.S();
                    long U = photoViewer24.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer24.E7;
                        int g12 = photoViewer24.g1(photoViewer24.u4);
                        if (U <= 180000) {
                            photoViewer24.c4.startRewind(photoViewer24.G2, f10 > ((float) (g12 / 3)), photoViewer24.E7, photoViewer24.u1, photoViewer24.B1);
                            break;
                        } else {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                z10 = f10 >= ((float) i7);
                            }
                            photoViewer24.a4.startRewind(photoViewer24.G2, z10, photoViewer24.u1);
                            break;
                        }
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer25 = this.b;
                photoViewer25.V8 = false;
                wi.n nVar2 = photoViewer25.P8;
                if (nVar2 != null) {
                    nVar2.c();
                    break;
                }
                break;
            case 28:
                PhotoViewer photoViewer26 = this.b;
                if (!photoViewer26.U4.isPopupShown()) {
                    org.telegram.ui.Components.i61 i61Var2 = photoViewer26.G2;
                    if (i61Var2 != null && photoViewer26.U4.videoWasPlaying) {
                        i61Var2.h0();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer26.U4;
                    org.telegram.ui.Components.i61 i61Var3 = photoViewer26.G2;
                    videoAds.videoWasPlaying = i61Var3 != null ? i61Var3.d0() : true;
                    org.telegram.ui.Components.i61 i61Var4 = photoViewer26.G2;
                    if (i61Var4 != null) {
                        i61Var4.g0();
                        break;
                    }
                }
                break;
            default:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.Z8;
                photoViewer27.z0(false, false);
                org.telegram.ui.Components.ui uiVar = photoViewer27.b2;
                if (uiVar != null) {
                    uiVar.a(true);
                }
                org.telegram.ui.ActionBar.g2 g2Var = photoViewer27.m4;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
        }
    }
}
