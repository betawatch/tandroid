package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
