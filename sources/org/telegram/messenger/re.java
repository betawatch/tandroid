package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
