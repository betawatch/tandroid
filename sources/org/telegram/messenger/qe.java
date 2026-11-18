package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class qe implements Runnable {
    public final /* synthetic */ MediaController a;

    public qe(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = this.a;
        fj fjVar = mediaController.v0;
        if (fjVar == null) {
            return;
        }
        w7.G(fjVar.K1).b0(mediaController.v0.F0(), true, false);
    }
}
