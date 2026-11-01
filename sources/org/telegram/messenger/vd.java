package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;

    public /* synthetic */ vd(MediaController mediaController, int i10, int i11) {
        this.a = i11;
        this.b = mediaController;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        MediaController mediaController = this.b;
        switch (i10) {
            case 0:
                at.f(mediaController.g1).k(at.n2, Integer.valueOf(mediaController.f1), Integer.valueOf(i11 == 2 ? 1 : 0));
                break;
            default:
                if (i11 == -1) {
                    if (mediaController.I(mediaController.u0) && !mediaController.H()) {
                        mediaController.R(mediaController.u0, true);
                    }
                    mediaController.U = 0;
                    mediaController.X = 0;
                } else if (i11 == 1) {
                    mediaController.X = 2;
                    if (mediaController.Y) {
                        mediaController.Y = false;
                        if (mediaController.I(mediaController.u0) && mediaController.H()) {
                            mediaController.S(mediaController.u0);
                        }
                    }
                } else if (i11 == -3) {
                    mediaController.X = 1;
                } else if (i11 == -2) {
                    mediaController.X = 0;
                    if (mediaController.I(mediaController.u0) && !mediaController.H()) {
                        mediaController.R(mediaController.u0, true);
                        mediaController.Y = true;
                    }
                } else {
                    String[] strArr = MediaController.U1;
                }
                mediaController.n0();
                break;
        }
    }
}
