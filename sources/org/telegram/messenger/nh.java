package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class nh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.a = i10;
        this.b = callback2;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$3(this.b, this.c);
                break;
            default:
                PasskeysController.lambda$create$8(this.b, this.c);
                break;
        }
    }
}
