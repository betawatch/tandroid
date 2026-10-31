package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class re implements Runnable {
    public final /* synthetic */ MediaController a;

    public re(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        jj jjVar = mediaController.u0;
        if (jjVar == null) {
            return;
        }
        b8.G(jjVar.I1).c0(mediaController.u0.F0(), true, false);
    }
}
