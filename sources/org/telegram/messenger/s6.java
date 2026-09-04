package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController.MediaLoader b;

    public /* synthetic */ s6(MediaController.MediaLoader mediaLoader, int i10) {
        this.a = i10;
        this.b = mediaLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$start$1();
                break;
            case 1:
                this.b.lambda$start$2();
                break;
            case 2:
                this.b.lambda$copyFile$8();
                break;
            case 3:
                this.b.lambda$checkIfFinished$3();
                break;
            default:
                this.b.lambda$checkIfFinished$4();
                break;
        }
    }
}
