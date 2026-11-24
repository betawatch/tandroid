// default package

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n88 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ n88(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.p2(1, false);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer2.p2(-1, false);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer3.o2(0);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer4.I0();
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                photoViewer5.E1.b(photoViewer5.J2, photoViewer5.K2, photoViewer5.L2, photoViewer5.P2, photoViewer5.R2, photoViewer5.O2, photoViewer5.z1(true), photoViewer5.z1(true), photoViewer5.M2, photoViewer5.N2, 0.0f, 0.0f, photoViewer5.Q2);
                photoViewer5.o2(0);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer6.p5.b.setLoading(false);
                photoViewer6.o2(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer7.p5.b.setLoading(false);
                photoViewer7.o2(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.d9;
                photoViewer8.e();
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.d9;
                photoViewer9.q(false);
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.d9;
                photoViewer10.o5.W = false;
                break;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                photoViewer11.x4.setBackground(null);
                break;
            case 11:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.d9;
                photoViewer12.h7 = null;
                photoViewer12.e();
                photoViewer12.o2(0);
                break;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.d9;
                photoViewer13.o2(0);
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.d9;
                photoViewer14.p5.b.setLoading(false);
                photoViewer14.o2(0);
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.d9;
                photoViewer15.p5.b.setLoading(false);
                photoViewer15.o2(0);
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.d9;
                if (photoViewer16.G3 == 2) {
                    photoViewer16.q(false);
                    break;
                }
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr17 = PhotoViewer.d9;
                photoViewer17.c();
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.d9;
                photoViewer18.D2();
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.d9;
                photoViewer19.y2(true);
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.d9;
                if (photoViewer20.w0.isEnabled()) {
                    Activity activity = photoViewer20.E;
                    Typeface typeface = gm.a;
                    if (Settings.canDrawOverlays(activity) && yc3.c().a() == null && photoViewer20.P3) {
                        if (!photoViewer20.s4) {
                            photoViewer20.K3 = false;
                            photoViewer20.r2();
                            break;
                        } else {
                            ya8 ya8Var = photoViewer20.g0;
                            if (ya8Var != null && !ya8Var.c() && photoViewer20.g0.d()) {
                                photoViewer20.K3 = false;
                                if (PhotoViewer.k9 != null) {
                                    PhotoViewer.k9.L();
                                }
                                photoViewer20.J3 = true;
                                PhotoViewer.k9 = PhotoViewer.j9;
                                PhotoViewer.j9 = null;
                                photoViewer20.e = false;
                                qb8 qb8Var = photoViewer20.c5;
                                if (qb8Var != null) {
                                    ImageReceiver imageReceiver = qb8Var.a;
                                    if (!imageReceiver.R0) {
                                        imageReceiver.v0(true, true);
                                    }
                                }
                                photoViewer20.l6 = 1.0f;
                                photoViewer20.f0.invalidate();
                                photoViewer20.O();
                                break;
                            }
                        }
                    }
                }
                break;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.d9;
                if (photoViewer21.e && photoViewer21.m4 == 0) {
                    photoViewer21.H2(photoViewer21.K);
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr22 = PhotoViewer.d9;
                photoViewer22.H0();
                break;
            case 22:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr23 = PhotoViewer.d9;
                photoViewer23.L2();
                break;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                ndc ndcVar = photoViewer24.G2;
                if (ndcVar != null && photoViewer24.Z5 <= 1.35f) {
                    long S = ndcVar.S();
                    long U = photoViewer24.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f = photoViewer24.J7;
                        int i0 = photoViewer24.i0(photoViewer24.t4);
                        if (U <= 180000) {
                            photoViewer24.c4.startRewind(photoViewer24.G2, f > ((float) (i0 / 3)), photoViewer24.J7, photoViewer24.u1, photoViewer24.B1);
                            break;
                        } else {
                            int i = i0 / 3;
                            if (f < (i << 1)) {
                                z = f >= ((float) i);
                            }
                            photoViewer24.a4.startRewind(photoViewer24.G2, z, photoViewer24.u1);
                            break;
                        }
                    }
                }
                break;
            case 24:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.d9;
                photoViewer25.a9 = false;
                photoViewer25.I0();
                break;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr25 = PhotoViewer.d9;
                if (!photoViewer26.T4.isPopupShown()) {
                    ndc ndcVar2 = photoViewer26.G2;
                    if (ndcVar2 != null && photoViewer26.T4.videoWasPlaying) {
                        ndcVar2.g0();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer26.T4;
                    ndc ndcVar3 = photoViewer26.G2;
                    videoAds.videoWasPlaying = ndcVar3 != null ? ndcVar3.c0() : true;
                    ndc ndcVar4 = photoViewer26.G2;
                    if (ndcVar4 != null) {
                        ndcVar4.f0();
                        break;
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.d9;
                x68 x68Var = photoViewer27.D1;
                m43 m43Var = x68Var.c;
                m43Var.b(0.0f);
                m43Var.setMirrored(false);
                m43Var.setRotated(false);
                x68Var.b.l(true);
                break;
            case 27:
                PhotoViewer photoViewer28 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.d9;
                photoViewer28.N2();
                break;
            case 28:
                PhotoViewer photoViewer29 = this.b;
                Drawable[] drawableArr28 = PhotoViewer.d9;
                photoViewer29.F1(true, 0, 0, false, true, false);
                break;
            default:
                PhotoViewer photoViewer30 = this.b;
                Drawable[] drawableArr29 = PhotoViewer.d9;
                photoViewer30.F1(true, 0, 0, false, false, false);
                break;
        }
    }
}
