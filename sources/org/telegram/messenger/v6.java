package org.telegram.messenger;

import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
