package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class re implements Runnable {
    public final /* synthetic */ MediaController a;

    public re(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        gj gjVar = mediaController.v0;
        if (gjVar == null) {
            return;
        }
        w7.G(gjVar.K1).b0(mediaController.v0.F0(), true, false);
    }
}
