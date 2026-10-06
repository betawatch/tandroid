package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
