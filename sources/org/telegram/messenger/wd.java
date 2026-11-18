package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class wd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;

    public /* synthetic */ wd(MediaController mediaController, int i7, int i10) {
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
                ks.f(mediaController.i1).k(ks.n2, Integer.valueOf(mediaController.h1), Integer.valueOf(i10 == 2 ? 1 : 0));
                break;
            default:
                if (i10 == -1) {
                    if (mediaController.I(mediaController.v0) && !mediaController.H()) {
                        mediaController.R(mediaController.v0, true);
                    }
                    mediaController.V = 0;
                    mediaController.Y = 0;
                } else if (i10 == 1) {
                    mediaController.Y = 2;
                    if (mediaController.Z) {
                        mediaController.Z = false;
                        if (mediaController.I(mediaController.v0) && mediaController.H()) {
                            mediaController.S(mediaController.v0);
                        }
                    }
                } else if (i10 == -3) {
                    mediaController.Y = 1;
                } else if (i10 == -2) {
                    mediaController.Y = 0;
                    if (mediaController.I(mediaController.v0) && !mediaController.H()) {
                        mediaController.R(mediaController.v0, true);
                        mediaController.Z = true;
                    }
                } else {
                    String[] strArr = MediaController.W1;
                }
                mediaController.n0();
                break;
        }
    }
}
