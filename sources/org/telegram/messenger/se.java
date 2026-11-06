package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
