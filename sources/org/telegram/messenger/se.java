package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class se implements Runnable {
    public final /* synthetic */ MediaController a;

    public se(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        kj kjVar = mediaController.u0;
        if (kjVar == null) {
            return;
        }
        b8.G(kjVar.I1).c0(mediaController.u0.F0(), true, false);
    }
}
