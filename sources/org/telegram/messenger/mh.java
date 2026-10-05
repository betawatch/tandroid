package org.telegram.messenger;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class mh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback2 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ mh(Utilities.Callback2 callback2, Exception exc, int i10) {
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
