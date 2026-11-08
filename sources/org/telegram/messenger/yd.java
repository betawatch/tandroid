package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;

    public /* synthetic */ yd(MediaController mediaController, int i7, int i10) {
        this.a = i10;
        this.b = mediaController;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        MediaController mediaController = this.b;
        switch (i7) {
            case 0:
                qs.f(mediaController.h1).k(qs.n2, Integer.valueOf(mediaController.g1), Integer.valueOf(i10 == 2 ? 1 : 0));
                break;
            default:
                if (i10 == -1) {
                    if (mediaController.I(mediaController.u0) && !mediaController.H()) {
                        mediaController.R(mediaController.u0, true);
                    }
                    mediaController.U = 0;
                    mediaController.X = 0;
                } else if (i10 == 1) {
                    mediaController.X = 2;
                    if (mediaController.Y) {
                        mediaController.Y = false;
                        if (mediaController.I(mediaController.u0) && mediaController.H()) {
                            mediaController.S(mediaController.u0);
                        }
                    }
                } else if (i10 == -3) {
                    mediaController.X = 1;
                } else if (i10 == -2) {
                    mediaController.X = 0;
                    if (mediaController.I(mediaController.u0) && !mediaController.H()) {
                        mediaController.R(mediaController.u0, true);
                        mediaController.Y = true;
                    }
                } else {
                    String[] strArr = MediaController.V1;
                }
                mediaController.n0();
                break;
        }
    }
}
