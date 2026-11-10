package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
