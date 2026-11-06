package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        w7.G(ijVar.I1).c0(mediaController.u0.F0(), true, false);
    }
}
