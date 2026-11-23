package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ kn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.e3(1, false);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer2.e3(-1, false);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                photoViewer3.d3(0);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                wi.n nVar = photoViewer4.V8;
                if (nVar != null) {
                    nVar.c();
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                photoViewer5.E1.e(photoViewer5.J2, photoViewer5.K2, photoViewer5.L2, photoViewer5.P2, photoViewer5.R2, photoViewer5.O2, photoViewer5.q2(true), photoViewer5.q2(true), photoViewer5.M2, photoViewer5.N2, 0.0f, 0.0f, photoViewer5.Q2);
                photoViewer5.d3(0);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.q5.b.setLoading(false);
                photoViewer6.d3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.q5.b.setLoading(false);
                photoViewer7.d3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.f9;
                photoViewer8.q0(false);
                break;
            case 8:
                this.b.p5.W = false;
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.f9;
                photoViewer9.f0();
                break;
            case 10:
                this.b.y4.setBackground(null);
                break;
            case 11:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.i7 = null;
                photoViewer10.f0();
                photoViewer10.d3(0);
                break;
            case 12:
                PhotoViewer photoViewer11 = this.b;
                if (photoViewer11.G3 == 2) {
                    photoViewer11.q0(false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer12.d3(0);
                break;
            case 14:
                PhotoViewer photoViewer13 = this.b;
                photoViewer13.q5.b.setLoading(false);
                photoViewer13.d3(0);
                break;
            case 15:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.q5.b.setLoading(false);
                photoViewer14.d3(0);
                break;
            case 16:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.f9;
                photoViewer15.d0();
                break;
            case 17:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.f9;
                photoViewer16.r3();
                break;
            case 18:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.f9;
                photoViewer17.m3(true);
                break;
            case 19:
                PhotoViewer photoViewer18 = this.b;
                if (photoViewer18.w0.isEnabled()) {
                    Activity activity = photoViewer18.E;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(activity) && l2.j.d().c() == null && photoViewer18.P3) {
                        if (!photoViewer18.t4) {
                            photoViewer18.K3 = false;
                            photoViewer18.g3();
                            break;
                        } else {
                            dq0 dq0Var = photoViewer18.g0;
                            if (dq0Var != null) {
                                if ((!dq0Var.y || !"inapp".equals(org.telegram.messenger.mp.u1(dq0Var.a).D3)) && photoViewer18.g0.e()) {
                                    photoViewer18.K3 = false;
                                    if (PhotoViewer.m9 != null) {
                                        PhotoViewer.m9.J0();
                                    }
                                    photoViewer18.J3 = true;
                                    PhotoViewer.m9 = PhotoViewer.l9;
                                    PhotoViewer.l9 = null;
                                    photoViewer18.e = false;
                                    wq0 wq0Var = photoViewer18.d5;
                                    if (wq0Var != null) {
                                        ImageReceiver imageReceiver = wq0Var.a;
                                        if (!imageReceiver.R0) {
                                            imageReceiver.P0(true, true);
                                        }
                                    }
                                    photoViewer18.m6 = 1.0f;
                                    photoViewer18.f0.invalidate();
                                    photoViewer18.M0();
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 20:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.e && photoViewer19.n4 == 0) {
                    photoViewer19.u3(photoViewer19.K);
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.f9;
                photoViewer20.D1();
                break;
            case 22:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.f9;
                photoViewer21.y3();
                break;
            case 23:
                PhotoViewer photoViewer22 = this.b;
                org.telegram.ui.Components.h61 h61Var = photoViewer22.G2;
                if (h61Var != null && photoViewer22.a6 <= 1.35f) {
                    long S = h61Var.S();
                    long U = photoViewer22.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer22.K7;
                        int g12 = photoViewer22.g1(photoViewer22.u4);
                        if (U <= 180000) {
                            photoViewer22.c4.startRewind(photoViewer22.G2, f10 > ((float) (g12 / 3)), photoViewer22.K7, photoViewer22.u1, photoViewer22.B1);
                            break;
                        } else {
                            int i7 = g12 / 3;
                            if (f10 < i7 * 2) {
                                z10 = f10 >= ((float) i7);
                            }
                            photoViewer22.a4.startRewind(photoViewer22.G2, z10, photoViewer22.u1);
                            break;
                        }
                    }
                }
                break;
            case 24:
                PhotoViewer photoViewer23 = this.b;
                photoViewer23.b9 = false;
                wi.n nVar2 = photoViewer23.V8;
                if (nVar2 != null) {
                    nVar2.c();
                    break;
                }
                break;
            case 25:
                PhotoViewer photoViewer24 = this.b;
                if (!photoViewer24.U4.isPopupShown()) {
                    org.telegram.ui.Components.h61 h61Var2 = photoViewer24.G2;
                    if (h61Var2 != null && photoViewer24.U4.videoWasPlaying) {
                        h61Var2.h0();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer24.U4;
                    org.telegram.ui.Components.h61 h61Var3 = photoViewer24.G2;
                    videoAds.videoWasPlaying = h61Var3 != null ? h61Var3.d0() : true;
                    org.telegram.ui.Components.h61 h61Var4 = photoViewer24.G2;
                    if (h61Var4 != null) {
                        h61Var4.g0();
                        break;
                    }
                }
                break;
            case 26:
                org.telegram.ui.Components.qd0 qd0Var = this.b.D1;
                og.f fVar = qd0Var.c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                qd0Var.b.l(true);
                break;
            case 27:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.f9;
                photoViewer25.A3();
                break;
            case 28:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.f9;
                photoViewer26.v2(true, 0, 0, false, true, false);
                break;
            default:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.f9;
                photoViewer27.v2(true, 0, 0, false, false, false);
                break;
        }
    }
}
