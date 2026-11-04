package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;
    public final /* synthetic */ int c;

    public /* synthetic */ sd(MediaController mediaController, int i3, int i10) {
        this.a = i10;
        this.b = mediaController;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.c;
        MediaController mediaController = this.b;
        switch (i3) {
            case 0:
                hs.f(mediaController.i1).k(hs.n2, Integer.valueOf(mediaController.h1), Integer.valueOf(i10 == 2 ? 1 : 0));
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
