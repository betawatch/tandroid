package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController.MediaLoader b;

    public /* synthetic */ v6(MediaController.MediaLoader mediaLoader, int i10) {
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
