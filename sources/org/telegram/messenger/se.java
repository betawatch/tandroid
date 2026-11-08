package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class se implements Runnable {
    public final /* synthetic */ MediaController a;

    public se(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        ij ijVar = mediaController.u0;
        if (ijVar == null) {
            return;
        }
        w7.G(ijVar.I1).b0(mediaController.u0.F0(), true, false);
    }
}
